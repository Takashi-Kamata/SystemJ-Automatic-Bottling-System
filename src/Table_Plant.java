import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Table_Plant extends ClockDomain{
  public Table_Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal tableAlignedWithSensorE = new Signal("tableAlignedWithSensorE", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal capOnBottleAtPos1E = new Signal("capOnBottleAtPos1E", Signal.OUTPUT);
  public Signal rotaryTableTriggerE = new Signal("rotaryTableTriggerE", Signal.OUTPUT);
  private int S218 = 1;
  private int S88 = 1;
  private int S60 = 1;
  private int S58 = 1;
  private int S90 = 1;
  private int S98 = 1;
  private int S92 = 1;
  private int S132 = 1;
  private int S106 = 1;
  private int S114 = 1;
  private int S122 = 1;
  private int S130 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread237(int [] tdone, int [] ends){
        switch(S130){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj/Table_plant.sysj line: 60, column: 24
          rotaryTableTriggerE.setPresent();//sysj/Table_plant.sysj line: 60, column: 44
          currsigs.addElement(rotaryTableTriggerE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread236(int [] tdone, int [] ends){
        switch(S122){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj/Table_plant.sysj line: 58, column: 24
          capOnBottleAtPos1E.setPresent();//sysj/Table_plant.sysj line: 58, column: 43
          currsigs.addElement(capOnBottleAtPos1E);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread235(int [] tdone, int [] ends){
        switch(S114){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj/Table_plant.sysj line: 56, column: 24
          bottleAtPos5E.setPresent();//sysj/Table_plant.sysj line: 56, column: 38
          currsigs.addElement(bottleAtPos5E);
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread234(int [] tdone, int [] ends){
        switch(S106){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj/Table_plant.sysj line: 54, column: 24
          tableAlignedWithSensorE.setPresent();//sysj/Table_plant.sysj line: 54, column: 48
          currsigs.addElement(tableAlignedWithSensorE);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread233(int [] tdone, int [] ends){
        switch(S132){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread234(tdone,ends);
        thread235(tdone,ends);
        thread236(tdone,ends);
        thread237(tdone,ends);
        int biggest238 = 0;
        if(ends[6]>=biggest238){
          biggest238=ends[6];
        }
        if(ends[7]>=biggest238){
          biggest238=ends[7];
        }
        if(ends[8]>=biggest238){
          biggest238=ends[8];
        }
        if(ends[9]>=biggest238){
          biggest238=ends[9];
        }
        if(biggest238 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest238 == 0){
          S132=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread232(int [] tdone, int [] ends){
        switch(S98){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S92){
          case 0 : 
            S92=0;
            if(enable.getprestatus()){//sysj/Table_plant.sysj line: 45, column: 12
              S92=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S92=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S92=1;
            S92=0;
            if(enable.getprestatus()){//sysj/Table_plant.sysj line: 45, column: 12
              S92=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S92=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread231(int [] tdone, int [] ends){
        switch(S90){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread230(int [] tdone, int [] ends){
        switch(S88){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S60){
          case 0 : 
            switch(S58){
              case 0 : 
                if(enable.getprestatus()){//sysj/Table_plant.sysj line: 23, column: 11
                  S58=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  tableAlignedWithSensor.setPresent();//sysj/Table_plant.sysj line: 25, column: 6
                  currsigs.addElement(tableAlignedWithSensor);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(!enable.getprestatus()){//sysj/Table_plant.sysj line: 27, column: 11
                  S60=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S60=1;
            S60=0;
            if(enable.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj/Table_plant.sysj line: 21, column: 12
              S58=0;
              System.out.println("Table Aligned");//sysj/Table_plant.sysj line: 24, column: 6
              tableAlignedWithSensor.setPresent();//sysj/Table_plant.sysj line: 25, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S60=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread227(int [] tdone, int [] ends){
        S130=1;
    if(rotaryTableTrigger.getprestatus()){//sysj/Table_plant.sysj line: 60, column: 24
      rotaryTableTriggerE.setPresent();//sysj/Table_plant.sysj line: 60, column: 44
      currsigs.addElement(rotaryTableTriggerE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread226(int [] tdone, int [] ends){
        S122=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj/Table_plant.sysj line: 58, column: 24
      capOnBottleAtPos1E.setPresent();//sysj/Table_plant.sysj line: 58, column: 43
      currsigs.addElement(capOnBottleAtPos1E);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread225(int [] tdone, int [] ends){
        S114=1;
    if(bottleAtPos5.getprestatus()){//sysj/Table_plant.sysj line: 56, column: 24
      bottleAtPos5E.setPresent();//sysj/Table_plant.sysj line: 56, column: 38
      currsigs.addElement(bottleAtPos5E);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread224(int [] tdone, int [] ends){
        S106=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj/Table_plant.sysj line: 54, column: 24
      tableAlignedWithSensorE.setPresent();//sysj/Table_plant.sysj line: 54, column: 48
      currsigs.addElement(tableAlignedWithSensorE);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread223(int [] tdone, int [] ends){
        S132=1;
    thread224(tdone,ends);
    thread225(tdone,ends);
    thread226(tdone,ends);
    thread227(tdone,ends);
    int biggest228 = 0;
    if(ends[6]>=biggest228){
      biggest228=ends[6];
    }
    if(ends[7]>=biggest228){
      biggest228=ends[7];
    }
    if(ends[8]>=biggest228){
      biggest228=ends[8];
    }
    if(ends[9]>=biggest228){
      biggest228=ends[9];
    }
    if(biggest228 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread222(int [] tdone, int [] ends){
        S98=1;
    S92=0;
    if(enable.getprestatus()){//sysj/Table_plant.sysj line: 45, column: 12
      S92=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S92=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread221(int [] tdone, int [] ends){
        S90=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread220(int [] tdone, int [] ends){
        S88=1;
    S60=0;
    if(enable.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj/Table_plant.sysj line: 21, column: 12
      S58=0;
      System.out.println("Table Aligned");//sysj/Table_plant.sysj line: 24, column: 6
      tableAlignedWithSensor.setPresent();//sysj/Table_plant.sysj line: 25, column: 6
      currsigs.addElement(tableAlignedWithSensor);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S60=1;
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
      switch(S218){
        case 0 : 
          S218=0;
          break RUN;
        
        case 1 : 
          S218=2;
          S218=2;
          class GUI extends Object implements java.lang.Runnable {//sysj/Table_plant.sysj line: 11, column: 1
            public void run() {//sysj/Table_plant.sysj line: 13, column: 21
              org.compsys704.Table.main(null);//sysj/Table_plant.sysj line: 14, column: 4
            }
            GUI(){//sysj/Table_plant.sysj line: 12, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj/Table_plant.sysj line: 17, column: 2
          thread220(tdone,ends);
          thread221(tdone,ends);
          thread222(tdone,ends);
          thread223(tdone,ends);
          int biggest229 = 0;
          if(ends[2]>=biggest229){
            biggest229=ends[2];
          }
          if(ends[3]>=biggest229){
            biggest229=ends[3];
          }
          if(ends[4]>=biggest229){
            biggest229=ends[4];
          }
          if(ends[5]>=biggest229){
            biggest229=ends[5];
          }
          if(biggest229 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread230(tdone,ends);
          thread231(tdone,ends);
          thread232(tdone,ends);
          thread233(tdone,ends);
          int biggest239 = 0;
          if(ends[2]>=biggest239){
            biggest239=ends[2];
          }
          if(ends[3]>=biggest239){
            biggest239=ends[3];
          }
          if(ends[4]>=biggest239){
            biggest239=ends[4];
          }
          if(ends[5]>=biggest239){
            biggest239=ends[5];
          }
          if(biggest239 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest239 == 0){
            S218=0;
            active[1]=0;
            ends[1]=0;
            S218=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          enable.gethook();
          rotaryTableTrigger.gethook();
          df = true;
        }
        runClockDomain();
      }
      enable.setpreclear();
      rotaryTableTrigger.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      tableAlignedWithSensorE.setpreclear();
      bottleAtPos5E.setpreclear();
      capOnBottleAtPos1E.setpreclear();
      rotaryTableTriggerE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      tableAlignedWithSensorE.sethook();
      tableAlignedWithSensorE.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      capOnBottleAtPos1E.sethook();
      capOnBottleAtPos1E.setClear();
      rotaryTableTriggerE.sethook();
      rotaryTableTriggerE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        enable.gethook();
        rotaryTableTrigger.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
