import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj/Conveyor_plant.sysj line: 1, column: 1

public class Conveyor_Plant extends ClockDomain{
  public Conveyor_Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  public Signal motConveyorOnOffE = new Signal("motConveyorOnOffE", Signal.OUTPUT);
  private int S484 = 1;
  private int S168 = 1;
  private int S290 = 1;
  private int S208 = 1;
  private int S186 = 1;
  private int S298 = 1;
  private int S292 = 1;
  private int S324 = 1;
  private int S306 = 1;
  private int S314 = 1;
  private int S322 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread501(int [] tdone, int [] ends){
        switch(S322){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj/Conveyor_plant.sysj line: 64, column: 24
          bottleLeftPos5E.setPresent();//sysj/Conveyor_plant.sysj line: 64, column: 40
          currsigs.addElement(bottleLeftPos5E);
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

  public void thread500(int [] tdone, int [] ends){
        switch(S314){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj/Conveyor_plant.sysj line: 62, column: 24
          bottleAtPos1E.setPresent();//sysj/Conveyor_plant.sysj line: 62, column: 38
          currsigs.addElement(bottleAtPos1E);
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

  public void thread499(int [] tdone, int [] ends){
        switch(S306){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(motConveyorOnOff.getprestatus()){//sysj/Conveyor_plant.sysj line: 60, column: 24
          motConveyorOnOffE.setPresent();//sysj/Conveyor_plant.sysj line: 60, column: 42
          currsigs.addElement(motConveyorOnOffE);
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

  public void thread498(int [] tdone, int [] ends){
        switch(S324){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread499(tdone,ends);
        thread500(tdone,ends);
        thread501(tdone,ends);
        int biggest502 = 0;
        if(ends[6]>=biggest502){
          biggest502=ends[6];
        }
        if(ends[7]>=biggest502){
          biggest502=ends[7];
        }
        if(ends[8]>=biggest502){
          biggest502=ends[8];
        }
        if(biggest502 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest502 == 0){
          S324=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread497(int [] tdone, int [] ends){
        switch(S298){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S292){
          case 0 : 
            S292=0;
            if(enable.getprestatus()){//sysj/Conveyor_plant.sysj line: 51, column: 12
              S292=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S292=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S292=1;
            S292=0;
            if(enable.getprestatus()){//sysj/Conveyor_plant.sysj line: 51, column: 12
              S292=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S292=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread496(int [] tdone, int [] ends){
        switch(S290){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S208){
          case 0 : 
            switch(S186){
              case 0 : 
                if(!enable.getprestatus()){//sysj/Conveyor_plant.sysj line: 29, column: 11
                  S186=1;
                  System.out.println("Bottle POS 1 HIGH");//sysj/Conveyor_plant.sysj line: 31, column: 6
                  bottleAtPos1.setPresent();//sysj/Conveyor_plant.sysj line: 32, column: 6
                  currsigs.addElement(bottleAtPos1);
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
                if(enable.getprestatus()){//sysj/Conveyor_plant.sysj line: 30, column: 11
                  S186=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  bottleAtPos1.setPresent();//sysj/Conveyor_plant.sysj line: 32, column: 6
                  currsigs.addElement(bottleAtPos1);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 2 : 
                if(!enable.getprestatus()){//sysj/Conveyor_plant.sysj line: 34, column: 11
                  S186=3;
                  System.out.println("Bottle POS 5 HIGH");//sysj/Conveyor_plant.sysj line: 36, column: 6
                  bottleLeftPos5.setPresent();//sysj/Conveyor_plant.sysj line: 37, column: 6
                  currsigs.addElement(bottleLeftPos5);
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
              
              case 3 : 
                if(enable.getprestatus()){//sysj/Conveyor_plant.sysj line: 35, column: 11
                  S186=4;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  bottleLeftPos5.setPresent();//sysj/Conveyor_plant.sysj line: 37, column: 6
                  currsigs.addElement(bottleLeftPos5);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
              case 4 : 
                if(!enable.getprestatus()){//sysj/Conveyor_plant.sysj line: 39, column: 11
                  S208=1;
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
            break;
          
          case 1 : 
            S208=1;
            S208=0;
            if(enable.getprestatus() && motConveyorOnOff.getprestatus()){//sysj/Conveyor_plant.sysj line: 27, column: 12
              S186=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S208=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread495(int [] tdone, int [] ends){
        switch(S168){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread492(int [] tdone, int [] ends){
        S322=1;
    if(bottleLeftPos5.getprestatus()){//sysj/Conveyor_plant.sysj line: 64, column: 24
      bottleLeftPos5E.setPresent();//sysj/Conveyor_plant.sysj line: 64, column: 40
      currsigs.addElement(bottleLeftPos5E);
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

  public void thread491(int [] tdone, int [] ends){
        S314=1;
    if(bottleAtPos1.getprestatus()){//sysj/Conveyor_plant.sysj line: 62, column: 24
      bottleAtPos1E.setPresent();//sysj/Conveyor_plant.sysj line: 62, column: 38
      currsigs.addElement(bottleAtPos1E);
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

  public void thread490(int [] tdone, int [] ends){
        S306=1;
    if(motConveyorOnOff.getprestatus()){//sysj/Conveyor_plant.sysj line: 60, column: 24
      motConveyorOnOffE.setPresent();//sysj/Conveyor_plant.sysj line: 60, column: 42
      currsigs.addElement(motConveyorOnOffE);
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

  public void thread489(int [] tdone, int [] ends){
        S324=1;
    thread490(tdone,ends);
    thread491(tdone,ends);
    thread492(tdone,ends);
    int biggest493 = 0;
    if(ends[6]>=biggest493){
      biggest493=ends[6];
    }
    if(ends[7]>=biggest493){
      biggest493=ends[7];
    }
    if(ends[8]>=biggest493){
      biggest493=ends[8];
    }
    if(biggest493 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread488(int [] tdone, int [] ends){
        S298=1;
    S292=0;
    if(enable.getprestatus()){//sysj/Conveyor_plant.sysj line: 51, column: 12
      S292=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S292=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread487(int [] tdone, int [] ends){
        S290=1;
    S208=0;
    if(enable.getprestatus() && motConveyorOnOff.getprestatus()){//sysj/Conveyor_plant.sysj line: 27, column: 12
      S186=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S208=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread486(int [] tdone, int [] ends){
        S168=1;
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
      switch(S484){
        case 0 : 
          S484=0;
          break RUN;
        
        case 1 : 
          S484=2;
          S484=2;
          new Thread(new GUI()).start();//sysj/Conveyor_plant.sysj line: 13, column: 2
          thread486(tdone,ends);
          thread487(tdone,ends);
          thread488(tdone,ends);
          thread489(tdone,ends);
          int biggest494 = 0;
          if(ends[2]>=biggest494){
            biggest494=ends[2];
          }
          if(ends[3]>=biggest494){
            biggest494=ends[3];
          }
          if(ends[4]>=biggest494){
            biggest494=ends[4];
          }
          if(ends[5]>=biggest494){
            biggest494=ends[5];
          }
          if(biggest494 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread495(tdone,ends);
          thread496(tdone,ends);
          thread497(tdone,ends);
          thread498(tdone,ends);
          int biggest503 = 0;
          if(ends[2]>=biggest503){
            biggest503=ends[2];
          }
          if(ends[3]>=biggest503){
            biggest503=ends[3];
          }
          if(ends[4]>=biggest503){
            biggest503=ends[4];
          }
          if(ends[5]>=biggest503){
            biggest503=ends[5];
          }
          if(biggest503 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest503 == 0){
            S484=0;
            active[1]=0;
            ends[1]=0;
            S484=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          motConveyorOnOff.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      enable.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleLeftPos5E.setpreclear();
      motConveyorOnOffE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      motConveyorOnOffE.sethook();
      motConveyorOnOffE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        enable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
