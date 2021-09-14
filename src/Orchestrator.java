import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Orchestrator extends ClockDomain{
  public Orchestrator(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal tableAlignedWithSensorE = new Signal("tableAlignedWithSensorE", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal capOnBottleAtPos1E = new Signal("capOnBottleAtPos1E", Signal.OUTPUT);
  public Signal rotaryTableTriggerE = new Signal("rotaryTableTriggerE", Signal.OUTPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  public Signal motConveyorOnOffE = new Signal("motConveyorOnOffE", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal valveInjectorOnOffE = new Signal("valveInjectorOnOffE", Signal.OUTPUT);
  public Signal valveInletOnOffE = new Signal("valveInletOnOffE", Signal.OUTPUT);
  public Signal dosUnitValveRetractE = new Signal("dosUnitValveRetractE", Signal.OUTPUT);
  public Signal dosUnitValveExtendE = new Signal("dosUnitValveExtendE", Signal.OUTPUT);
  private int S176 = 1;
  private int S73 = 1;
  private int S23 = 1;
  private int S9 = 1;
  private int S99 = 1;
  private int S81 = 1;
  private int S75 = 1;
  private int S89 = 1;
  private int S97 = 1;
  private int S140 = 1;
  private int S112 = 1;
  private int S110 = 1;
  private int S174 = 1;
  private int S148 = 1;
  private int S156 = 1;
  private int S164 = 1;
  private int S172 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void thread203(int [] tdone, int [] ends){
        switch(S172){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj/Orchestrator.sysj line: 77, column: 24
          rotaryTableTriggerE.setPresent();//sysj/Orchestrator.sysj line: 77, column: 44
          currsigs.addElement(rotaryTableTriggerE);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread202(int [] tdone, int [] ends){
        switch(S164){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj/Orchestrator.sysj line: 75, column: 24
          capOnBottleAtPos1E.setPresent();//sysj/Orchestrator.sysj line: 75, column: 43
          currsigs.addElement(capOnBottleAtPos1E);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread201(int [] tdone, int [] ends){
        switch(S156){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj/Orchestrator.sysj line: 73, column: 24
          bottleAtPos5E.setPresent();//sysj/Orchestrator.sysj line: 73, column: 38
          currsigs.addElement(bottleAtPos5E);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread200(int [] tdone, int [] ends){
        switch(S148){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj/Orchestrator.sysj line: 71, column: 24
          tableAlignedWithSensorE.setPresent();//sysj/Orchestrator.sysj line: 71, column: 48
          currsigs.addElement(tableAlignedWithSensorE);
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

  public void thread199(int [] tdone, int [] ends){
        switch(S174){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread200(tdone,ends);
        thread201(tdone,ends);
        thread202(tdone,ends);
        thread203(tdone,ends);
        int biggest204 = 0;
        if(ends[9]>=biggest204){
          biggest204=ends[9];
        }
        if(ends[10]>=biggest204){
          biggest204=ends[10];
        }
        if(ends[11]>=biggest204){
          biggest204=ends[11];
        }
        if(ends[12]>=biggest204){
          biggest204=ends[12];
        }
        if(biggest204 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest204 == 0){
          S174=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread198(int [] tdone, int [] ends){
        switch(S140){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S112){
          case 0 : 
            switch(S110){
              case 0 : 
                if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 58, column: 11
                  S110=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  tableAlignedWithSensor.setPresent();//sysj/Orchestrator.sysj line: 60, column: 6
                  currsigs.addElement(tableAlignedWithSensor);
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                break;
              
              case 1 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 62, column: 11
                  S112=1;
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
            break;
          
          case 1 : 
            S112=1;
            S112=0;
            if(enable.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj/Orchestrator.sysj line: 56, column: 12
              S110=0;
              System.out.println("Table Aligned");//sysj/Orchestrator.sysj line: 59, column: 6
              tableAlignedWithSensor.setPresent();//sysj/Orchestrator.sysj line: 60, column: 6
              currsigs.addElement(tableAlignedWithSensor);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S112=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread196(int [] tdone, int [] ends){
        switch(S97){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj/Orchestrator.sysj line: 51, column: 24
          bottleLeftPos5E.setPresent();//sysj/Orchestrator.sysj line: 51, column: 40
          currsigs.addElement(bottleLeftPos5E);
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

  public void thread195(int [] tdone, int [] ends){
        switch(S89){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj/Orchestrator.sysj line: 49, column: 24
          bottleAtPos1E.setPresent();//sysj/Orchestrator.sysj line: 49, column: 38
          currsigs.addElement(bottleAtPos1E);
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
      
    }
  }

  public void thread194(int [] tdone, int [] ends){
        switch(S81){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S75){
          case 0 : 
            S75=0;
            if(motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 47, column: 23
              motConveyorOnOffE.setPresent();//sysj/Orchestrator.sysj line: 47, column: 41
              currsigs.addElement(motConveyorOnOffE);
              S75=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S75=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S75=1;
            S75=0;
            if(motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 47, column: 23
              motConveyorOnOffE.setPresent();//sysj/Orchestrator.sysj line: 47, column: 41
              currsigs.addElement(motConveyorOnOffE);
              S75=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S75=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread193(int [] tdone, int [] ends){
        switch(S99){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread194(tdone,ends);
        thread195(tdone,ends);
        thread196(tdone,ends);
        int biggest197 = 0;
        if(ends[4]>=biggest197){
          biggest197=ends[4];
        }
        if(ends[5]>=biggest197){
          biggest197=ends[5];
        }
        if(ends[6]>=biggest197){
          biggest197=ends[6];
        }
        if(biggest197 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest197 == 0){
          S99=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread192(int [] tdone, int [] ends){
        switch(S73){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S23){
          case 0 : 
            switch(S9){
              case 0 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 26, column: 11
                  S9=1;
                  bottleAtPos1.setPresent();//sysj/Orchestrator.sysj line: 29, column: 6
                  currsigs.addElement(bottleAtPos1);
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
                if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 27, column: 11
                  S9=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  bottleAtPos1.setPresent();//sysj/Orchestrator.sysj line: 29, column: 6
                  currsigs.addElement(bottleAtPos1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 2 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 31, column: 11
                  S9=3;
                  bottleLeftPos5.setPresent();//sysj/Orchestrator.sysj line: 34, column: 6
                  currsigs.addElement(bottleLeftPos5);
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
              
              case 3 : 
                if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 32, column: 11
                  S9=4;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  bottleLeftPos5.setPresent();//sysj/Orchestrator.sysj line: 34, column: 6
                  currsigs.addElement(bottleLeftPos5);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 4 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 36, column: 11
                  S23=1;
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
            S23=1;
            S23=0;
            if(enable.getprestatus() && motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 24, column: 12
              S9=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S23=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread189(int [] tdone, int [] ends){
        S172=1;
    if(rotaryTableTrigger.getprestatus()){//sysj/Orchestrator.sysj line: 77, column: 24
      rotaryTableTriggerE.setPresent();//sysj/Orchestrator.sysj line: 77, column: 44
      currsigs.addElement(rotaryTableTriggerE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread188(int [] tdone, int [] ends){
        S164=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj/Orchestrator.sysj line: 75, column: 24
      capOnBottleAtPos1E.setPresent();//sysj/Orchestrator.sysj line: 75, column: 43
      currsigs.addElement(capOnBottleAtPos1E);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread187(int [] tdone, int [] ends){
        S156=1;
    if(bottleAtPos5.getprestatus()){//sysj/Orchestrator.sysj line: 73, column: 24
      bottleAtPos5E.setPresent();//sysj/Orchestrator.sysj line: 73, column: 38
      currsigs.addElement(bottleAtPos5E);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread186(int [] tdone, int [] ends){
        S148=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj/Orchestrator.sysj line: 71, column: 24
      tableAlignedWithSensorE.setPresent();//sysj/Orchestrator.sysj line: 71, column: 48
      currsigs.addElement(tableAlignedWithSensorE);
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

  public void thread185(int [] tdone, int [] ends){
        S174=1;
    thread186(tdone,ends);
    thread187(tdone,ends);
    thread188(tdone,ends);
    thread189(tdone,ends);
    int biggest190 = 0;
    if(ends[9]>=biggest190){
      biggest190=ends[9];
    }
    if(ends[10]>=biggest190){
      biggest190=ends[10];
    }
    if(ends[11]>=biggest190){
      biggest190=ends[11];
    }
    if(ends[12]>=biggest190){
      biggest190=ends[12];
    }
    if(biggest190 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread184(int [] tdone, int [] ends){
        S140=1;
    S112=0;
    if(enable.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj/Orchestrator.sysj line: 56, column: 12
      S110=0;
      System.out.println("Table Aligned");//sysj/Orchestrator.sysj line: 59, column: 6
      tableAlignedWithSensor.setPresent();//sysj/Orchestrator.sysj line: 60, column: 6
      currsigs.addElement(tableAlignedWithSensor);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S112=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread182(int [] tdone, int [] ends){
        S97=1;
    if(bottleLeftPos5.getprestatus()){//sysj/Orchestrator.sysj line: 51, column: 24
      bottleLeftPos5E.setPresent();//sysj/Orchestrator.sysj line: 51, column: 40
      currsigs.addElement(bottleLeftPos5E);
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

  public void thread181(int [] tdone, int [] ends){
        S89=1;
    if(bottleAtPos1.getprestatus()){//sysj/Orchestrator.sysj line: 49, column: 24
      bottleAtPos1E.setPresent();//sysj/Orchestrator.sysj line: 49, column: 38
      currsigs.addElement(bottleAtPos1E);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread180(int [] tdone, int [] ends){
        S81=1;
    S75=0;
    if(motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 47, column: 23
      motConveyorOnOffE.setPresent();//sysj/Orchestrator.sysj line: 47, column: 41
      currsigs.addElement(motConveyorOnOffE);
      S75=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S75=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread179(int [] tdone, int [] ends){
        S99=1;
    thread180(tdone,ends);
    thread181(tdone,ends);
    thread182(tdone,ends);
    int biggest183 = 0;
    if(ends[4]>=biggest183){
      biggest183=ends[4];
    }
    if(ends[5]>=biggest183){
      biggest183=ends[5];
    }
    if(ends[6]>=biggest183){
      biggest183=ends[6];
    }
    if(biggest183 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread178(int [] tdone, int [] ends){
        S73=1;
    S23=0;
    if(enable.getprestatus() && motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 24, column: 12
      S9=0;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S23=1;
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
      switch(S176){
        case 0 : 
          S176=0;
          break RUN;
        
        case 1 : 
          S176=2;
          S176=2;
          thread178(tdone,ends);
          thread179(tdone,ends);
          thread184(tdone,ends);
          thread185(tdone,ends);
          int biggest191 = 0;
          if(ends[2]>=biggest191){
            biggest191=ends[2];
          }
          if(ends[3]>=biggest191){
            biggest191=ends[3];
          }
          if(ends[7]>=biggest191){
            biggest191=ends[7];
          }
          if(ends[8]>=biggest191){
            biggest191=ends[8];
          }
          if(biggest191 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread192(tdone,ends);
          thread193(tdone,ends);
          thread198(tdone,ends);
          thread199(tdone,ends);
          int biggest205 = 0;
          if(ends[2]>=biggest205){
            biggest205=ends[2];
          }
          if(ends[3]>=biggest205){
            biggest205=ends[3];
          }
          if(ends[7]>=biggest205){
            biggest205=ends[7];
          }
          if(ends[8]>=biggest205){
            biggest205=ends[8];
          }
          if(biggest205 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest205 == 0){
            S176=0;
            active[1]=0;
            ends[1]=0;
            S176=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          motConveyorOnOff.gethook();
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          df = true;
        }
        runClockDomain();
      }
      enable.setpreclear();
      rotaryTableTrigger.setpreclear();
      motConveyorOnOff.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      tableAlignedWithSensorE.setpreclear();
      bottleAtPos5E.setpreclear();
      capOnBottleAtPos1E.setpreclear();
      rotaryTableTriggerE.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleLeftPos5E.setpreclear();
      motConveyorOnOffE.setpreclear();
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorOnOffE.setpreclear();
      valveInletOnOffE.setpreclear();
      dosUnitValveRetractE.setpreclear();
      dosUnitValveExtendE.setpreclear();
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
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = valveInjectorOnOff.getStatus() ? valveInjectorOnOff.setprepresent() : valveInjectorOnOff.setpreclear();
      valveInjectorOnOff.setpreval(valveInjectorOnOff.getValue());
      valveInjectorOnOff.setClear();
      dummyint = valveInletOnOff.getStatus() ? valveInletOnOff.setprepresent() : valveInletOnOff.setpreclear();
      valveInletOnOff.setpreval(valveInletOnOff.getValue());
      valveInletOnOff.setClear();
      dummyint = dosUnitValveRetract.getStatus() ? dosUnitValveRetract.setprepresent() : dosUnitValveRetract.setpreclear();
      dosUnitValveRetract.setpreval(dosUnitValveRetract.getValue());
      dosUnitValveRetract.setClear();
      dummyint = dosUnitValveExtend.getStatus() ? dosUnitValveExtend.setprepresent() : dosUnitValveExtend.setpreclear();
      dosUnitValveExtend.setpreval(dosUnitValveExtend.getValue());
      dosUnitValveExtend.setClear();
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
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      valveInjectorOnOffE.sethook();
      valveInjectorOnOffE.setClear();
      valveInletOnOffE.sethook();
      valveInletOnOffE.setClear();
      dosUnitValveRetractE.sethook();
      dosUnitValveRetractE.setClear();
      dosUnitValveExtendE.sethook();
      dosUnitValveExtendE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        enable.gethook();
        rotaryTableTrigger.gethook();
        motConveyorOnOff.gethook();
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
