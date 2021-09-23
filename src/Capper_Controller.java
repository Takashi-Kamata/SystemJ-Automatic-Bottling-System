import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Capper_Controller extends ClockDomain{
  public Capper_Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.INPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.INPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.INPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  private int S690 = 1;
  private int S105 = 1;
  private int S19 = 1;
  private int S167 = 1;
  private int S109 = 1;
  private int S229 = 1;
  private int S171 = 1;
  private int S345 = 1;
  private int S233 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread700(int [] tdone, int [] ends){
        switch(S345){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S233){
          case 0 : 
            if(bottleAtPos4.getprestatus()){//sysj/Capper_controller.sysj line: 78, column: 10
              S233=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(capGripperPos5Extend.getprestatus()){//sysj/Capper_controller.sysj line: 79, column: 11
              S233=2;
              System.out.println("TIGHTENING");//sysj/Capper_controller.sysj line: 81, column: 5
              gripperTurnExtend.setPresent();//sysj/Capper_controller.sysj line: 82, column: 5
              currsigs.addElement(gripperTurnExtend);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(gripperTurnFinalPos.getprestatus()){//sysj/Capper_controller.sysj line: 80, column: 11
              S233=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              gripperTurnExtend.setPresent();//sysj/Capper_controller.sysj line: 82, column: 5
              currsigs.addElement(gripperTurnExtend);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!capGripperPos5Extend.getprestatus()){//sysj/Capper_controller.sysj line: 84, column: 11
              S233=4;
              System.out.println("LOOSENING");//sysj/Capper_controller.sysj line: 86, column: 5
              gripperTurnRetract.setPresent();//sysj/Capper_controller.sysj line: 87, column: 5
              currsigs.addElement(gripperTurnRetract);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj/Capper_controller.sysj line: 85, column: 11
              S233=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              gripperTurnRetract.setPresent();//sysj/Capper_controller.sysj line: 87, column: 5
              currsigs.addElement(gripperTurnRetract);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread699(int [] tdone, int [] ends){
        switch(S229){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S171){
          case 0 : 
            if(bottleAtPos4.getprestatus()){//sysj/Capper_controller.sysj line: 65, column: 10
              S171=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(gripperZAxisLowered.getprestatus()){//sysj/Capper_controller.sysj line: 66, column: 10
              S171=2;
              System.out.println("GRIPPING");//sysj/Capper_controller.sysj line: 68, column: 5
              capGripperPos5Extend.setPresent();//sysj/Capper_controller.sysj line: 69, column: 5
              currsigs.addElement(capGripperPos5Extend);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(gripperTurnFinalPos.getprestatus()){//sysj/Capper_controller.sysj line: 67, column: 11
              System.out.println("UNGRIPPING");//sysj/Capper_controller.sysj line: 71, column: 4
              S171=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              capGripperPos5Extend.setPresent();//sysj/Capper_controller.sysj line: 69, column: 5
              currsigs.addElement(capGripperPos5Extend);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread698(int [] tdone, int [] ends){
        switch(S167){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S109){
          case 0 : 
            if(bottleAtPos4.getprestatus()){//sysj/Capper_controller.sysj line: 52, column: 10
              S109=1;
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
          
          case 1 : 
            if(gripperZAxisLowered.getprestatus()){//sysj/Capper_controller.sysj line: 53, column: 10
              S109=2;
              System.out.println("CLAMPING BOTTLE");//sysj/Capper_controller.sysj line: 55, column: 5
              cylClampBottleExtend.setPresent();//sysj/Capper_controller.sysj line: 56, column: 5
              currsigs.addElement(cylClampBottleExtend);
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
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj/Capper_controller.sysj line: 54, column: 11
              System.out.println("UNCLAMPING BOTTLE");//sysj/Capper_controller.sysj line: 58, column: 4
              S109=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              cylClampBottleExtend.setPresent();//sysj/Capper_controller.sysj line: 56, column: 5
              currsigs.addElement(cylClampBottleExtend);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread697(int [] tdone, int [] ends){
        switch(S105){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S19){
          case 0 : 
            if(bottleAtPos4.getprestatus()){//sysj/Capper_controller.sysj line: 36, column: 10
              S19=1;
              System.out.println("LOWERING GRIPPER");//sysj/Capper_controller.sysj line: 38, column: 5
              cylPos5ZaxisExtend.setPresent();//sysj/Capper_controller.sysj line: 39, column: 5
              currsigs.addElement(cylPos5ZaxisExtend);
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
          
          case 1 : 
            if(gripperTurnFinalPos.getprestatus() && gripperZAxisLowered.getprestatus() && capGripperPos5Extend.getprestatus()){//sysj/Capper_controller.sysj line: 37, column: 11
              S19=2;
              System.out.println("STILL LOWERING GRIPPER");//sysj/Capper_controller.sysj line: 42, column: 5
              cylPos5ZaxisExtend.setPresent();//sysj/Capper_controller.sysj line: 43, column: 5
              currsigs.addElement(cylPos5ZaxisExtend);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              cylPos5ZaxisExtend.setPresent();//sysj/Capper_controller.sysj line: 39, column: 5
              currsigs.addElement(cylPos5ZaxisExtend);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(gripperTurnHomePos.getprestatus() && gripperZAxisLowered.getprestatus() && !capGripperPos5Extend.getprestatus()){//sysj/Capper_controller.sysj line: 41, column: 11
              System.out.println("RAISING GRIPPER");//sysj/Capper_controller.sysj line: 45, column: 4
              S19=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              cylPos5ZaxisExtend.setPresent();//sysj/Capper_controller.sysj line: 43, column: 5
              currsigs.addElement(cylPos5ZaxisExtend);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread695(int [] tdone, int [] ends){
        S345=1;
    S233=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread694(int [] tdone, int [] ends){
        S229=1;
    S171=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread693(int [] tdone, int [] ends){
        S167=1;
    S109=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread692(int [] tdone, int [] ends){
        S105=1;
    S19=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S690){
        case 0 : 
          S690=0;
          break RUN;
        
        case 1 : 
          S690=2;
          S690=2;
          class GUI extends Object implements java.lang.Runnable {//sysj/Capper_controller.sysj line: 13, column: 4
            public void run() {//sysj/Capper_controller.sysj line: 28, column: 21
              org.compsys704.Capper.main(null);//sysj/Capper_controller.sysj line: 29, column: 4
            }
            GUI(){//sysj/Capper_controller.sysj line: 27, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj/Capper_controller.sysj line: 32, column: 2
          thread692(tdone,ends);
          thread693(tdone,ends);
          thread694(tdone,ends);
          thread695(tdone,ends);
          int biggest696 = 0;
          if(ends[2]>=biggest696){
            biggest696=ends[2];
          }
          if(ends[3]>=biggest696){
            biggest696=ends[3];
          }
          if(ends[4]>=biggest696){
            biggest696=ends[4];
          }
          if(ends[5]>=biggest696){
            biggest696=ends[5];
          }
          if(biggest696 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread697(tdone,ends);
          thread698(tdone,ends);
          thread699(tdone,ends);
          thread700(tdone,ends);
          int biggest701 = 0;
          if(ends[2]>=biggest701){
            biggest701=ends[2];
          }
          if(ends[3]>=biggest701){
            biggest701=ends[3];
          }
          if(ends[4]>=biggest701){
            biggest701=ends[4];
          }
          if(ends[5]>=biggest701){
            biggest701=ends[5];
          }
          if(biggest701 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest701 == 0){
            S690=0;
            active[1]=0;
            ends[1]=0;
            S690=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
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
          bottleAtPos4.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = gripperZAxisLowered.getStatus() ? gripperZAxisLowered.setprepresent() : gripperZAxisLowered.setpreclear();
      gripperZAxisLowered.setpreval(gripperZAxisLowered.getValue());
      gripperZAxisLowered.setClear();
      dummyint = gripperZAxisLifted.getStatus() ? gripperZAxisLifted.setprepresent() : gripperZAxisLifted.setpreclear();
      gripperZAxisLifted.setpreval(gripperZAxisLifted.getValue());
      gripperZAxisLifted.setClear();
      dummyint = gripperTurnHomePos.getStatus() ? gripperTurnHomePos.setprepresent() : gripperTurnHomePos.setpreclear();
      gripperTurnHomePos.setpreval(gripperTurnHomePos.getValue());
      gripperTurnHomePos.setClear();
      dummyint = gripperTurnFinalPos.getStatus() ? gripperTurnFinalPos.setprepresent() : gripperTurnFinalPos.setpreclear();
      gripperTurnFinalPos.setpreval(gripperTurnFinalPos.getValue());
      gripperTurnFinalPos.setClear();
      cylPos5ZaxisExtend.sethook();
      cylPos5ZaxisExtend.setClear();
      gripperTurnRetract.sethook();
      gripperTurnRetract.setClear();
      gripperTurnExtend.sethook();
      gripperTurnExtend.setClear();
      capGripperPos5Extend.sethook();
      capGripperPos5Extend.setClear();
      cylClampBottleExtend.sethook();
      cylClampBottleExtend.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos4.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
