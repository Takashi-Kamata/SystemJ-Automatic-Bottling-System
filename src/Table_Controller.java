import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Table_Controller extends ClockDomain{
  public Table_Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal request_table = new Signal("request_table", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  private int S85 = 1;
  private int S32 = 1;
  private int S10 = 1;
  private int S40 = 1;
  private int S42 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread93(int [] tdone, int [] ends){
        switch(S42){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread92(int [] tdone, int [] ends){
        switch(S40){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(request.getprestatus()){//sysj/Table_controller.sysj line: 32, column: 12
          System.out.println("Request");//sysj/Table_controller.sysj line: 33, column: 5
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread91(int [] tdone, int [] ends){
        switch(S32){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S10){
          case 0 : 
            if(bottleAtPos5.getprestatus() || tableAlignedWithSensor.getprestatus()){//sysj/Table_controller.sysj line: 19, column: 12
              S10=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj/Table_controller.sysj line: 21, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S10=1;
            S10=0;
            if(request_table.getprestatus() && !capOnBottleAtPos1.getprestatus()){//sysj/Table_controller.sysj line: 17, column: 13
              System.out.println("Rotating");//sysj/Table_controller.sysj line: 20, column: 6
              rotaryTableTrigger.setPresent();//sysj/Table_controller.sysj line: 21, column: 6
              currsigs.addElement(rotaryTableTrigger);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S10=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread89(int [] tdone, int [] ends){
        S42=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread88(int [] tdone, int [] ends){
        S40=1;
    if(request.getprestatus()){//sysj/Table_controller.sysj line: 32, column: 12
      System.out.println("Request");//sysj/Table_controller.sysj line: 33, column: 5
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread87(int [] tdone, int [] ends){
        S32=1;
    S10=0;
    if(request_table.getprestatus() && !capOnBottleAtPos1.getprestatus()){//sysj/Table_controller.sysj line: 17, column: 13
      System.out.println("Rotating");//sysj/Table_controller.sysj line: 20, column: 6
      rotaryTableTrigger.setPresent();//sysj/Table_controller.sysj line: 21, column: 6
      currsigs.addElement(rotaryTableTrigger);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S10=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S85){
        case 0 : 
          S85=0;
          break RUN;
        
        case 1 : 
          S85=2;
          S85=2;
          class GUI extends Object implements java.lang.Runnable {//sysj/Table_controller.sysj line: 6, column: 3
            public void run() {//sysj/Table_controller.sysj line: 9, column: 21
              org.compsys704.Table.main(null);//sysj/Table_controller.sysj line: 10, column: 4
            }
            GUI(){//sysj/Table_controller.sysj line: 8, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj/Table_controller.sysj line: 13, column: 2
          thread87(tdone,ends);
          thread88(tdone,ends);
          thread89(tdone,ends);
          int biggest90 = 0;
          if(ends[2]>=biggest90){
            biggest90=ends[2];
          }
          if(ends[3]>=biggest90){
            biggest90=ends[3];
          }
          if(ends[4]>=biggest90){
            biggest90=ends[4];
          }
          if(biggest90 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread91(tdone,ends);
          thread92(tdone,ends);
          thread93(tdone,ends);
          int biggest94 = 0;
          if(ends[2]>=biggest94){
            biggest94=ends[2];
          }
          if(ends[3]>=biggest94){
            biggest94=ends[3];
          }
          if(ends[4]>=biggest94){
            biggest94=ends[4];
          }
          if(biggest94 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest94 == 0){
            S85=0;
            active[1]=0;
            ends[1]=0;
            S85=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          request.gethook();
          request_table.gethook();
          tableAlignedWithSensor.gethook();
          bottleAtPos5.gethook();
          capOnBottleAtPos1.gethook();
          df = true;
        }
        runClockDomain();
      }
      request.setpreclear();
      request_table.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      rotaryTableTrigger.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = request_table.getStatus() ? request_table.setprepresent() : request_table.setpreclear();
      request_table.setpreval(request_table.getValue());
      request_table.setClear();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        request.gethook();
        request_table.gethook();
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        capOnBottleAtPos1.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
