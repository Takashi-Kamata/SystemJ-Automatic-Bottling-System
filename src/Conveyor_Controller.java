import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Conveyor_Controller extends ClockDomain{
  public Conveyor_Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal request_conveyor = new Signal("request_conveyor", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  private int S217 = 1;
  private int S83 = 1;
  private int S27 = 1;
  private int S9 = 1;
  private int S91 = 1;
  private int S85 = 1;
  private int S108 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread225(int [] tdone, int [] ends){
        switch(S108){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(request.getprestatus()){//sysj/Conveyor_controller.sysj line: 53, column: 12
          if(bottleLeftPos5.getprestatus()){//sysj/Conveyor_controller.sysj line: 56, column: 12
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        else {
          if(bottleLeftPos5.getprestatus()){//sysj/Conveyor_controller.sysj line: 56, column: 12
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        break;
      
    }
  }

  public void thread224(int [] tdone, int [] ends){
        switch(S91){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S85){
          case 0 : 
            S85=0;
            if(bottleAtPos1.getprestatus()){//sysj/Conveyor_controller.sysj line: 42, column: 12
              System.out.println("Motor Off2");//sysj/Conveyor_controller.sysj line: 44, column: 5
              S85=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S85=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S85=1;
            S85=0;
            if(bottleAtPos1.getprestatus()){//sysj/Conveyor_controller.sysj line: 42, column: 12
              System.out.println("Motor Off2");//sysj/Conveyor_controller.sysj line: 44, column: 5
              S85=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S85=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread223(int [] tdone, int [] ends){
        switch(S83){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S27){
          case 0 : 
            switch(S9){
              case 0 : 
                if(bottleAtPos1.getprestatus()){//sysj/Conveyor_controller.sysj line: 17, column: 11
                  System.out.println("Motor Off1");//sysj/Conveyor_controller.sysj line: 21, column: 5
                  S9=1;
                  System.out.println("Motor On2");//sysj/Conveyor_controller.sysj line: 24, column: 6
                  motConveyorOnOff.setPresent();//sysj/Conveyor_controller.sysj line: 25, column: 6
                  currsigs.addElement(motConveyorOnOff);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  motConveyorOnOff.setPresent();//sysj/Conveyor_controller.sysj line: 19, column: 6
                  currsigs.addElement(motConveyorOnOff);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(bottleLeftPos5.getprestatus()){//sysj/Conveyor_controller.sysj line: 23, column: 11
                  S27=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  motConveyorOnOff.setPresent();//sysj/Conveyor_controller.sysj line: 25, column: 6
                  currsigs.addElement(motConveyorOnOff);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S27=1;
            S27=0;
            if(request_conveyor.getprestatus() && !bottleLeftPos5.getprestatus()){//sysj/Conveyor_controller.sysj line: 16, column: 12
              S9=0;
              System.out.println("Motor On1");//sysj/Conveyor_controller.sysj line: 18, column: 6
              motConveyorOnOff.setPresent();//sysj/Conveyor_controller.sysj line: 19, column: 6
              currsigs.addElement(motConveyorOnOff);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S27=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread221(int [] tdone, int [] ends){
        S108=1;
    if(request.getprestatus()){//sysj/Conveyor_controller.sysj line: 53, column: 12
      if(bottleLeftPos5.getprestatus()){//sysj/Conveyor_controller.sysj line: 56, column: 12
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      if(bottleLeftPos5.getprestatus()){//sysj/Conveyor_controller.sysj line: 56, column: 12
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread220(int [] tdone, int [] ends){
        S91=1;
    S85=0;
    if(bottleAtPos1.getprestatus()){//sysj/Conveyor_controller.sysj line: 42, column: 12
      System.out.println("Motor Off2");//sysj/Conveyor_controller.sysj line: 44, column: 5
      S85=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S85=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread219(int [] tdone, int [] ends){
        S83=1;
    S27=0;
    if(request_conveyor.getprestatus() && !bottleLeftPos5.getprestatus()){//sysj/Conveyor_controller.sysj line: 16, column: 12
      S9=0;
      System.out.println("Motor On1");//sysj/Conveyor_controller.sysj line: 18, column: 6
      motConveyorOnOff.setPresent();//sysj/Conveyor_controller.sysj line: 19, column: 6
      currsigs.addElement(motConveyorOnOff);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S27=1;
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
      switch(S217){
        case 0 : 
          S217=0;
          break RUN;
        
        case 1 : 
          S217=2;
          S217=2;
          class GUI extends Object implements java.lang.Runnable {//sysj/Conveyor_controller.sysj line: 5, column: 3
            public void run() {//sysj/Conveyor_controller.sysj line: 8, column: 21
              org.compsys704.Conveyor.main(null);//sysj/Conveyor_controller.sysj line: 9, column: 4
            }
            GUI(){//sysj/Conveyor_controller.sysj line: 7, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj/Conveyor_controller.sysj line: 12, column: 2
          thread219(tdone,ends);
          thread220(tdone,ends);
          thread221(tdone,ends);
          int biggest222 = 0;
          if(ends[2]>=biggest222){
            biggest222=ends[2];
          }
          if(ends[3]>=biggest222){
            biggest222=ends[3];
          }
          if(ends[4]>=biggest222){
            biggest222=ends[4];
          }
          if(biggest222 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread223(tdone,ends);
          thread224(tdone,ends);
          thread225(tdone,ends);
          int biggest226 = 0;
          if(ends[2]>=biggest226){
            biggest226=ends[2];
          }
          if(ends[3]>=biggest226){
            biggest226=ends[3];
          }
          if(ends[4]>=biggest226){
            biggest226=ends[4];
          }
          if(biggest226 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest226 == 0){
            S217=0;
            active[1]=0;
            ends[1]=0;
            S217=0;
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
          bottleAtPos1.gethook();
          bottleLeftPos5.gethook();
          request.gethook();
          request_conveyor.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      request.setpreclear();
      request_conveyor.setpreclear();
      motConveyorOnOff.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = request_conveyor.getStatus() ? request_conveyor.setprepresent() : request_conveyor.setpreclear();
      request_conveyor.setpreval(request_conveyor.getValue());
      request_conveyor.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos1.gethook();
        bottleLeftPos5.gethook();
        request.gethook();
        request_conveyor.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
