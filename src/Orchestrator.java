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
  public Signal liquid_filler_done = new Signal("liquid_filler_done", Signal.INPUT);
  public Signal Liquid1On = new Signal("Liquid1On", Signal.INPUT);
  public Signal Liquid2On = new Signal("Liquid2On", Signal.INPUT);
  public Signal Liquid3On = new Signal("Liquid3On", Signal.INPUT);
  public Signal Liquid4On = new Signal("Liquid4On", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.INPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.INPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.INPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.INPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal request_conveyor = new Signal("request_conveyor", Signal.OUTPUT);
  public Signal request_liquid_filler = new Signal("request_liquid_filler", Signal.OUTPUT);
  public Signal request_table = new Signal("request_table", Signal.OUTPUT);
  public Signal request_caploader = new Signal("request_caploader", Signal.OUTPUT);
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
  public Signal FirstLiquidDone = new Signal("FirstLiquidDone", Signal.OUTPUT);
  public Signal SecondLiquidDone = new Signal("SecondLiquidDone", Signal.OUTPUT);
  public Signal ThirdLiquidDone = new Signal("ThirdLiquidDone", Signal.OUTPUT);
  public Signal FourthLiquidDone = new Signal("FourthLiquidDone", Signal.OUTPUT);
  public Signal injector_closed = new Signal("injector_closed", Signal.OUTPUT);
  public Signal inlet_closed = new Signal("inlet_closed", Signal.OUTPUT);
  public Signal extended = new Signal("extended", Signal.OUTPUT);
  public Signal retracted = new Signal("retracted", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal valveInjectorOnOffE = new Signal("valveInjectorOnOffE", Signal.OUTPUT);
  public Signal valveInletOnOffE = new Signal("valveInletOnOffE", Signal.OUTPUT);
  public Signal dosUnitValveRetractE = new Signal("dosUnitValveRetractE", Signal.OUTPUT);
  public Signal dosUnitValveExtendE = new Signal("dosUnitValveExtendE", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal FirstLiquidDoneE = new Signal("FirstLiquidDoneE", Signal.OUTPUT);
  public Signal SecondLiquidDoneE = new Signal("SecondLiquidDoneE", Signal.OUTPUT);
  public Signal ThirdLiquidDoneE = new Signal("ThirdLiquidDoneE", Signal.OUTPUT);
  public Signal FourthLiquidDoneE = new Signal("FourthLiquidDoneE", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.OUTPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.OUTPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.OUTPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.OUTPUT);
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public Signal gripperZAxisLoweredE = new Signal("gripperZAxisLoweredE", Signal.OUTPUT);
  public Signal gripperZAxisLiftedE = new Signal("gripperZAxisLiftedE", Signal.OUTPUT);
  public Signal gripperTurnHomePosE = new Signal("gripperTurnHomePosE", Signal.OUTPUT);
  public Signal gripperTurnFinalPosE = new Signal("gripperTurnFinalPosE", Signal.OUTPUT);
  public Signal cylPos5ZaxisExtendE = new Signal("cylPos5ZaxisExtendE", Signal.OUTPUT);
  public Signal gripperTurnRetractE = new Signal("gripperTurnRetractE", Signal.OUTPUT);
  public Signal gripperTurnExtendE = new Signal("gripperTurnExtendE", Signal.OUTPUT);
  public Signal capGripperPos5ExtendE = new Signal("capGripperPos5ExtendE", Signal.OUTPUT);
  public Signal cylClampBottleExtendE = new Signal("cylClampBottleExtendE", Signal.OUTPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal empty = new Signal("empty", Signal.OUTPUT);
  public Signal pusherRetractedE = new Signal("pusherRetractedE", Signal.OUTPUT);
  public Signal pusherExtendedE = new Signal("pusherExtendedE", Signal.OUTPUT);
  public Signal WPgrippedE = new Signal("WPgrippedE", Signal.OUTPUT);
  public Signal armAtSourceE = new Signal("armAtSourceE", Signal.OUTPUT);
  public Signal armAtDestE = new Signal("armAtDestE", Signal.OUTPUT);
  public Signal emptyE = new Signal("emptyE", Signal.OUTPUT);
  private Signal capDec_1;
  private Signal capPos_1;
  private int capcount_thread_55;//sysj/Orchestrator.sysj line: 516, column: 3
  private int S5843 = 1;
  private int S3 = 1;
  private int S446 = 1;
  private int S150 = 1;
  private int S148 = 1;
  private int S5 = 1;
  private int S41 = 1;
  private int S38 = 1;
  private int S47 = 1;
  private int S568 = 1;
  private int S486 = 1;
  private int S464 = 1;
  private int S594 = 1;
  private int S576 = 1;
  private int S570 = 1;
  private int S584 = 1;
  private int S592 = 1;
  private int S662 = 1;
  private int S616 = 1;
  private int S612 = 1;
  private int S696 = 1;
  private int S670 = 1;
  private int S678 = 1;
  private int S686 = 1;
  private int S694 = 1;
  private int S815 = 1;
  private int S735 = 1;
  private int S699 = 1;
  private int S709 = 1;
  private int S715 = 1;
  private int S880 = 1;
  private int S836 = 1;
  private int S818 = 1;
  private int S2367 = 1;
  private int S1011 = 1;
  private int S883 = 1;
  private int S888 = 1;
  private int S893 = 1;
  private int S909 = 1;
  private int S914 = 1;
  private int S919 = 1;
  private int S1014 = 1;
  private int S1019 = 1;
  private int S1024 = 1;
  private int S1170 = 1;
  private int S1175 = 1;
  private int S1180 = 1;
  private int S2401 = 1;
  private int S2375 = 1;
  private int S2383 = 1;
  private int S2391 = 1;
  private int S2399 = 1;
  private int S2454 = 1;
  private int S2408 = 1;
  private int S2507 = 1;
  private int S2461 = 1;
  private int S2509 = 1;
  private int S2591 = 1;
  private int S2517 = 1;
  private int S2525 = 1;
  private int S2533 = 1;
  private int S2541 = 1;
  private int S2549 = 1;
  private int S2557 = 1;
  private int S2565 = 1;
  private int S2573 = 1;
  private int S2581 = 1;
  private int S2589 = 1;
  private int S2644 = 1;
  private int S2598 = 1;
  private int S2697 = 1;
  private int S2651 = 1;
  private int S2741 = 1;
  private int S2711 = 1;
  private int S2809 = 1;
  private int S2763 = 1;
  private int S2745 = 1;
  private int S2871 = 1;
  private int S2921 = 1;
  private int S2879 = 1;
  private int S2887 = 1;
  private int S2895 = 1;
  private int S2903 = 1;
  private int S2911 = 1;
  private int S2919 = 1;
  
  private int[] ends = new int[63];
  private int[] tdone = new int[63];
  
  public void thread5993(int [] tdone, int [] ends){
        switch(S2919){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj/Orchestrator.sysj line: 544, column: 24
          emptyE.setPresent();//sysj/Orchestrator.sysj line: 544, column: 31
          currsigs.addElement(emptyE);
          active[62]=1;
          ends[62]=1;
          tdone[62]=1;
        }
        else {
          active[62]=1;
          ends[62]=1;
          tdone[62]=1;
        }
        break;
      
    }
  }

  public void thread5992(int [] tdone, int [] ends){
        switch(S2911){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj/Orchestrator.sysj line: 542, column: 24
          armAtDestE.setPresent();//sysj/Orchestrator.sysj line: 542, column: 35
          currsigs.addElement(armAtDestE);
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        else {
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        break;
      
    }
  }

  public void thread5991(int [] tdone, int [] ends){
        switch(S2903){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj/Orchestrator.sysj line: 540, column: 24
          armAtSourceE.setPresent();//sysj/Orchestrator.sysj line: 540, column: 37
          currsigs.addElement(armAtSourceE);
          active[60]=1;
          ends[60]=1;
          tdone[60]=1;
        }
        else {
          active[60]=1;
          ends[60]=1;
          tdone[60]=1;
        }
        break;
      
    }
  }

  public void thread5990(int [] tdone, int [] ends){
        switch(S2895){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj/Orchestrator.sysj line: 538, column: 24
          WPgrippedE.setPresent();//sysj/Orchestrator.sysj line: 538, column: 35
          currsigs.addElement(WPgrippedE);
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        else {
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        break;
      
    }
  }

  public void thread5989(int [] tdone, int [] ends){
        switch(S2887){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj/Orchestrator.sysj line: 536, column: 24
          pusherExtendedE.setPresent();//sysj/Orchestrator.sysj line: 536, column: 40
          currsigs.addElement(pusherExtendedE);
          active[58]=1;
          ends[58]=1;
          tdone[58]=1;
        }
        else {
          active[58]=1;
          ends[58]=1;
          tdone[58]=1;
        }
        break;
      
    }
  }

  public void thread5988(int [] tdone, int [] ends){
        switch(S2879){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj/Orchestrator.sysj line: 534, column: 24
          pusherRetractedE.setPresent();//sysj/Orchestrator.sysj line: 534, column: 41
          currsigs.addElement(pusherRetractedE);
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        break;
      
    }
  }

  public void thread5987(int [] tdone, int [] ends){
        switch(S2921){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        thread5988(tdone,ends);
        thread5989(tdone,ends);
        thread5990(tdone,ends);
        thread5991(tdone,ends);
        thread5992(tdone,ends);
        thread5993(tdone,ends);
        int biggest5994 = 0;
        if(ends[57]>=biggest5994){
          biggest5994=ends[57];
        }
        if(ends[58]>=biggest5994){
          biggest5994=ends[58];
        }
        if(ends[59]>=biggest5994){
          biggest5994=ends[59];
        }
        if(ends[60]>=biggest5994){
          biggest5994=ends[60];
        }
        if(ends[61]>=biggest5994){
          biggest5994=ends[61];
        }
        if(ends[62]>=biggest5994){
          biggest5994=ends[62];
        }
        if(biggest5994 == 1){
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        //FINXME code
        if(biggest5994 == 0){
          S2921=0;
          active[56]=0;
          ends[56]=0;
          tdone[56]=1;
        }
        break;
      
    }
  }

  public void thread5986(int [] tdone, int [] ends){
        switch(S2871){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj/Orchestrator.sysj line: 518, column: 12
          if(capcount_thread_55 > 0) {//sysj/Orchestrator.sysj line: 519, column: 5
            capcount_thread_55 = capcount_thread_55 - 1;//sysj/Orchestrator.sysj line: 520, column: 6
          }
          if(refill.getprestatus()){//sysj/Orchestrator.sysj line: 522, column: 12
            capcount_thread_55 = 5;//sysj/Orchestrator.sysj line: 523, column: 5
            if(capcount_thread_55 == 0){//sysj/Orchestrator.sysj line: 526, column: 8
              empty.setPresent();//sysj/Orchestrator.sysj line: 527, column: 6
              currsigs.addElement(empty);
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            else {
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
          }
          else {
            if(capcount_thread_55 == 0){//sysj/Orchestrator.sysj line: 526, column: 8
              empty.setPresent();//sysj/Orchestrator.sysj line: 527, column: 6
              currsigs.addElement(empty);
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            else {
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
          }
        }
        else {
          if(refill.getprestatus()){//sysj/Orchestrator.sysj line: 522, column: 12
            capcount_thread_55 = 5;//sysj/Orchestrator.sysj line: 523, column: 5
            if(capcount_thread_55 == 0){//sysj/Orchestrator.sysj line: 526, column: 8
              empty.setPresent();//sysj/Orchestrator.sysj line: 527, column: 6
              currsigs.addElement(empty);
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            else {
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
          }
          else {
            if(capcount_thread_55 == 0){//sysj/Orchestrator.sysj line: 526, column: 8
              empty.setPresent();//sysj/Orchestrator.sysj line: 527, column: 6
              currsigs.addElement(empty);
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            else {
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread5985(int [] tdone, int [] ends){
        switch(S2809){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S2763){
          case 0 : 
            if(empty.getprestatus()){//sysj/Orchestrator.sysj line: 501, column: 10
              S2763=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              switch(S2745){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj/Orchestrator.sysj line: 503, column: 13
                    S2745=1;
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  else {
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  break;
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj/Orchestrator.sysj line: 504, column: 13
                    capPos_1.setPresent();//sysj/Orchestrator.sysj line: 506, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj/Orchestrator.sysj line: 506, column: 7
                    S2745=2;
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  else {
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  break;
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj/Orchestrator.sysj line: 507, column: 13
                    capDec_1.setPresent();//sysj/Orchestrator.sysj line: 508, column: 7
                    currsigs.addElement(capDec_1);
                    S2745=0;
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  else {
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj/Orchestrator.sysj line: 511, column: 10
              S2763=0;
              S2745=0;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5984(int [] tdone, int [] ends){
        switch(S2741){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        switch(S2711){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj/Orchestrator.sysj line: 481, column: 12
              if(armAtSource.getprestatus()){//sysj/Orchestrator.sysj line: 484, column: 14
                capPos_1.setPresent();//sysj/Orchestrator.sysj line: 485, column: 7
                currsigs.addElement(capPos_1);
                capPos_1.setValue(1);//sysj/Orchestrator.sysj line: 485, column: 7
                S2711=1;
                active[53]=1;
                ends[53]=1;
                tdone[53]=1;
              }
              else {
                S2711=1;
                active[53]=1;
                ends[53]=1;
                tdone[53]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj/Orchestrator.sysj line: 482, column: 7
              currsigs.addElement(WPgripped);
              active[53]=1;
              ends[53]=1;
              tdone[53]=1;
            }
            break;
          
          case 1 : 
            S2711=1;
            S2711=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj/Orchestrator.sysj line: 478, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj/Orchestrator.sysj line: 479, column: 8
                capPos_1.setPresent();//sysj/Orchestrator.sysj line: 480, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj/Orchestrator.sysj line: 480, column: 6
                WPgripped.setPresent();//sysj/Orchestrator.sysj line: 482, column: 7
                currsigs.addElement(WPgripped);
                active[53]=1;
                ends[53]=1;
                tdone[53]=1;
              }
              else {
                S2711=1;
                active[53]=1;
                ends[53]=1;
                tdone[53]=1;
              }
            }
            else {
              S2711=1;
              active[53]=1;
              ends[53]=1;
              tdone[53]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5983(int [] tdone, int [] ends){
        switch(S2697){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S2651){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj/Orchestrator.sysj line: 465, column: 10
              S2651=1;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj/Orchestrator.sysj line: 466, column: 5
              currsigs.addElement(pusherRetracted);
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 468, column: 10
              S2651=2;
              pusherExtended.setPresent();//sysj/Orchestrator.sysj line: 470, column: 5
              currsigs.addElement(pusherExtended);
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj/Orchestrator.sysj line: 469, column: 10
              S2651=3;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            else {
              pusherExtended.setPresent();//sysj/Orchestrator.sysj line: 470, column: 5
              currsigs.addElement(pusherExtended);
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 472, column: 10
              S2651=0;
              pusherRetracted.setPresent();//sysj/Orchestrator.sysj line: 466, column: 5
              currsigs.addElement(pusherRetracted);
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5982(int [] tdone, int [] ends){
        switch(S2644){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        switch(S2598){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj/Orchestrator.sysj line: 452, column: 10
              S2598=1;
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            else {
              armAtDest.setPresent();//sysj/Orchestrator.sysj line: 453, column: 5
              currsigs.addElement(armAtDest);
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 455, column: 10
              S2598=2;
              armAtSource.setPresent();//sysj/Orchestrator.sysj line: 457, column: 5
              currsigs.addElement(armAtSource);
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            else {
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            break;
          
          case 2 : 
            if(armDest.getprestatus() && enable.getprestatus()){//sysj/Orchestrator.sysj line: 456, column: 10
              S2598=3;
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            else {
              armAtSource.setPresent();//sysj/Orchestrator.sysj line: 457, column: 5
              currsigs.addElement(armAtSource);
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 459, column: 10
              S2598=0;
              armAtDest.setPresent();//sysj/Orchestrator.sysj line: 453, column: 5
              currsigs.addElement(armAtDest);
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            else {
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5980(int [] tdone, int [] ends){
        switch(S2589){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(cylClampBottleExtend.getprestatus()){//sysj/Orchestrator.sysj line: 447, column: 24
          cylClampBottleExtendE.setPresent();//sysj/Orchestrator.sysj line: 447, column: 46
          currsigs.addElement(cylClampBottleExtendE);
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        else {
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread5979(int [] tdone, int [] ends){
        switch(S2581){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj/Orchestrator.sysj line: 445, column: 24
          capGripperPos5ExtendE.setPresent();//sysj/Orchestrator.sysj line: 445, column: 46
          currsigs.addElement(capGripperPos5ExtendE);
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        break;
      
    }
  }

  public void thread5978(int [] tdone, int [] ends){
        switch(S2573){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(gripperTurnExtend.getprestatus()){//sysj/Orchestrator.sysj line: 443, column: 24
          gripperTurnExtendE.setPresent();//sysj/Orchestrator.sysj line: 443, column: 43
          currsigs.addElement(gripperTurnExtendE);
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        break;
      
    }
  }

  public void thread5977(int [] tdone, int [] ends){
        switch(S2565){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(gripperTurnRetract.getprestatus()){//sysj/Orchestrator.sysj line: 441, column: 24
          gripperTurnRetractE.setPresent();//sysj/Orchestrator.sysj line: 441, column: 44
          currsigs.addElement(gripperTurnRetractE);
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread5976(int [] tdone, int [] ends){
        switch(S2557){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(cylPos5ZaxisExtend.getprestatus()){//sysj/Orchestrator.sysj line: 439, column: 24
          cylPos5ZaxisExtendE.setPresent();//sysj/Orchestrator.sysj line: 439, column: 44
          currsigs.addElement(cylPos5ZaxisExtendE);
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        break;
      
    }
  }

  public void thread5975(int [] tdone, int [] ends){
        switch(S2549){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj/Orchestrator.sysj line: 437, column: 24
          gripperTurnFinalPosE.setPresent();//sysj/Orchestrator.sysj line: 437, column: 45
          currsigs.addElement(gripperTurnFinalPosE);
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        break;
      
    }
  }

  public void thread5974(int [] tdone, int [] ends){
        switch(S2541){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj/Orchestrator.sysj line: 435, column: 24
          gripperTurnHomePosE.setPresent();//sysj/Orchestrator.sysj line: 435, column: 44
          currsigs.addElement(gripperTurnHomePosE);
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        break;
      
    }
  }

  public void thread5973(int [] tdone, int [] ends){
        switch(S2533){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj/Orchestrator.sysj line: 433, column: 24
          gripperZAxisLiftedE.setPresent();//sysj/Orchestrator.sysj line: 433, column: 44
          currsigs.addElement(gripperZAxisLiftedE);
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        break;
      
    }
  }

  public void thread5972(int [] tdone, int [] ends){
        switch(S2525){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj/Orchestrator.sysj line: 431, column: 24
          gripperZAxisLoweredE.setPresent();//sysj/Orchestrator.sysj line: 431, column: 45
          currsigs.addElement(gripperZAxisLoweredE);
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread5971(int [] tdone, int [] ends){
        switch(S2517){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj/Orchestrator.sysj line: 429, column: 24
          bottleAtPos4E.setPresent();//sysj/Orchestrator.sysj line: 429, column: 38
          currsigs.addElement(bottleAtPos4E);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        break;
      
    }
  }

  public void thread5970(int [] tdone, int [] ends){
        switch(S2591){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        thread5971(tdone,ends);
        thread5972(tdone,ends);
        thread5973(tdone,ends);
        thread5974(tdone,ends);
        thread5975(tdone,ends);
        thread5976(tdone,ends);
        thread5977(tdone,ends);
        thread5978(tdone,ends);
        thread5979(tdone,ends);
        thread5980(tdone,ends);
        int biggest5981 = 0;
        if(ends[41]>=biggest5981){
          biggest5981=ends[41];
        }
        if(ends[42]>=biggest5981){
          biggest5981=ends[42];
        }
        if(ends[43]>=biggest5981){
          biggest5981=ends[43];
        }
        if(ends[44]>=biggest5981){
          biggest5981=ends[44];
        }
        if(ends[45]>=biggest5981){
          biggest5981=ends[45];
        }
        if(ends[46]>=biggest5981){
          biggest5981=ends[46];
        }
        if(ends[47]>=biggest5981){
          biggest5981=ends[47];
        }
        if(ends[48]>=biggest5981){
          biggest5981=ends[48];
        }
        if(ends[49]>=biggest5981){
          biggest5981=ends[49];
        }
        if(ends[50]>=biggest5981){
          biggest5981=ends[50];
        }
        if(biggest5981 == 1){
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        //FINXME code
        if(biggest5981 == 0){
          S2591=0;
          active[40]=0;
          ends[40]=0;
          tdone[40]=1;
        }
        break;
      
    }
  }

  public void thread5969(int [] tdone, int [] ends){
        switch(S2509){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
        break;
      
    }
  }

  public void thread5968(int [] tdone, int [] ends){
        switch(S2507){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S2461){
          case 0 : 
            if(enable.getprestatus() && gripperTurnExtend.getprestatus()){//sysj/Orchestrator.sysj line: 403, column: 11
              S2461=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj/Orchestrator.sysj line: 404, column: 5
              currsigs.addElement(gripperTurnHomePos);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 406, column: 10
              S2461=2;
              gripperTurnFinalPos.setPresent();//sysj/Orchestrator.sysj line: 408, column: 5
              currsigs.addElement(gripperTurnFinalPos);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 2 : 
            if(enable.getprestatus() && gripperTurnRetract.getprestatus()){//sysj/Orchestrator.sysj line: 407, column: 11
              S2461=3;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj/Orchestrator.sysj line: 408, column: 5
              currsigs.addElement(gripperTurnFinalPos);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 410, column: 10
              S2461=0;
              gripperTurnHomePos.setPresent();//sysj/Orchestrator.sysj line: 404, column: 5
              currsigs.addElement(gripperTurnHomePos);
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5967(int [] tdone, int [] ends){
        switch(S2454){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S2408){
          case 0 : 
            if(enable.getprestatus() && cylPos5ZaxisExtend.getprestatus()){//sysj/Orchestrator.sysj line: 390, column: 11
              S2408=1;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj/Orchestrator.sysj line: 391, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 393, column: 10
              S2408=2;
              gripperZAxisLowered.setPresent();//sysj/Orchestrator.sysj line: 395, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 2 : 
            if(enable.getprestatus() && !cylPos5ZaxisExtend.getprestatus()){//sysj/Orchestrator.sysj line: 394, column: 11
              S2408=3;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj/Orchestrator.sysj line: 395, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 397, column: 10
              S2408=0;
              gripperZAxisLifted.setPresent();//sysj/Orchestrator.sysj line: 391, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5965(int [] tdone, int [] ends){
        switch(S2399){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(dosUnitValveExtend.getprestatus()){//sysj/Orchestrator.sysj line: 383, column: 24
          dosUnitValveExtendE.setPresent();//sysj/Orchestrator.sysj line: 383, column: 44
          currsigs.addElement(dosUnitValveExtendE);
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        break;
      
    }
  }

  public void thread5964(int [] tdone, int [] ends){
        switch(S2391){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 381, column: 24
          dosUnitValveRetractE.setPresent();//sysj/Orchestrator.sysj line: 381, column: 45
          currsigs.addElement(dosUnitValveRetractE);
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread5963(int [] tdone, int [] ends){
        switch(S2383){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 379, column: 24
          valveInletOnOffE.setPresent();//sysj/Orchestrator.sysj line: 379, column: 41
          currsigs.addElement(valveInletOnOffE);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread5962(int [] tdone, int [] ends){
        switch(S2375){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 377, column: 24
          valveInjectorOnOffE.setPresent();//sysj/Orchestrator.sysj line: 377, column: 44
          currsigs.addElement(valveInjectorOnOffE);
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread5961(int [] tdone, int [] ends){
        switch(S2401){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        thread5962(tdone,ends);
        thread5963(tdone,ends);
        thread5964(tdone,ends);
        thread5965(tdone,ends);
        int biggest5966 = 0;
        if(ends[33]>=biggest5966){
          biggest5966=ends[33];
        }
        if(ends[34]>=biggest5966){
          biggest5966=ends[34];
        }
        if(ends[35]>=biggest5966){
          biggest5966=ends[35];
        }
        if(ends[36]>=biggest5966){
          biggest5966=ends[36];
        }
        if(biggest5966 == 1){
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        //FINXME code
        if(biggest5966 == 0){
          S2401=0;
          active[32]=0;
          ends[32]=0;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread5959(int [] tdone, int [] ends){
        switch(S1180){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        FourthLiquidDoneE.setPresent();//sysj/Orchestrator.sysj line: 367, column: 7
        currsigs.addElement(FourthLiquidDoneE);
        active[31]=1;
        ends[31]=1;
        tdone[31]=1;
        break;
      
    }
  }

  public void thread5958(int [] tdone, int [] ends){
        switch(S1175){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        dosUnitFilled.setPresent();//sysj/Orchestrator.sysj line: 363, column: 6
        currsigs.addElement(dosUnitFilled);
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
        break;
      
    }
  }

  public void thread5956(int [] tdone, int [] ends){
        S1180=1;
    FourthLiquidDoneE.setPresent();//sysj/Orchestrator.sysj line: 367, column: 7
    currsigs.addElement(FourthLiquidDoneE);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread5955(int [] tdone, int [] ends){
        S1175=1;
    dosUnitFilled.setPresent();//sysj/Orchestrator.sysj line: 363, column: 6
    currsigs.addElement(dosUnitFilled);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread5953(int [] tdone, int [] ends){
        switch(S1024){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        ThirdLiquidDoneE.setPresent();//sysj/Orchestrator.sysj line: 352, column: 7
        currsigs.addElement(ThirdLiquidDoneE);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
        break;
      
    }
  }

  public void thread5952(int [] tdone, int [] ends){
        switch(S1019){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        ThirdLiquidDone.setPresent();//sysj/Orchestrator.sysj line: 348, column: 6
        currsigs.addElement(ThirdLiquidDone);
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread5950(int [] tdone, int [] ends){
        S1024=1;
    ThirdLiquidDoneE.setPresent();//sysj/Orchestrator.sysj line: 352, column: 7
    currsigs.addElement(ThirdLiquidDoneE);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread5949(int [] tdone, int [] ends){
        S1019=1;
    ThirdLiquidDone.setPresent();//sysj/Orchestrator.sysj line: 348, column: 6
    currsigs.addElement(ThirdLiquidDone);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread5947(int [] tdone, int [] ends){
        switch(S919){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        SecondLiquidDoneE.setPresent();//sysj/Orchestrator.sysj line: 337, column: 7
        currsigs.addElement(SecondLiquidDoneE);
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
        break;
      
    }
  }

  public void thread5946(int [] tdone, int [] ends){
        switch(S914){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        SecondLiquidDone.setPresent();//sysj/Orchestrator.sysj line: 333, column: 6
        currsigs.addElement(SecondLiquidDone);
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
        break;
      
    }
  }

  public void thread5944(int [] tdone, int [] ends){
        S919=1;
    SecondLiquidDoneE.setPresent();//sysj/Orchestrator.sysj line: 337, column: 7
    currsigs.addElement(SecondLiquidDoneE);
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread5943(int [] tdone, int [] ends){
        S914=1;
    SecondLiquidDone.setPresent();//sysj/Orchestrator.sysj line: 333, column: 6
    currsigs.addElement(SecondLiquidDone);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread5941(int [] tdone, int [] ends){
        switch(S893){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        FirstLiquidDoneE.setPresent();//sysj/Orchestrator.sysj line: 322, column: 7
        currsigs.addElement(FirstLiquidDoneE);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
        break;
      
    }
  }

  public void thread5940(int [] tdone, int [] ends){
        switch(S888){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        FirstLiquidDone.setPresent();//sysj/Orchestrator.sysj line: 318, column: 7
        currsigs.addElement(FirstLiquidDone);
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
        break;
      
    }
  }

  public void thread5938(int [] tdone, int [] ends){
        S893=1;
    FirstLiquidDoneE.setPresent();//sysj/Orchestrator.sysj line: 322, column: 7
    currsigs.addElement(FirstLiquidDoneE);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread5937(int [] tdone, int [] ends){
        S888=1;
    FirstLiquidDone.setPresent();//sysj/Orchestrator.sysj line: 318, column: 7
    currsigs.addElement(FirstLiquidDone);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread5936(int [] tdone, int [] ends){
        switch(S2367){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S1011){
          case 0 : 
            switch(S883){
              case 0 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 315, column: 11
                  S883=1;
                  thread5937(tdone,ends);
                  thread5938(tdone,ends);
                  int biggest5939 = 0;
                  if(ends[24]>=biggest5939){
                    biggest5939=ends[24];
                  }
                  if(ends[25]>=biggest5939){
                    biggest5939=ends[25];
                  }
                  if(biggest5939 == 1){
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                else {
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                break;
              
              case 1 : 
                if(enable.getprestatus() && Liquid2On.getprestatus()){//sysj/Orchestrator.sysj line: 316, column: 11
                  System.out.println("Liquid1On Done");//sysj/Orchestrator.sysj line: 325, column: 5
                  S1011=1;
                  if(enable.getprestatus() && Liquid2On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 328, column: 12
                    System.out.println("Liquid2On");//sysj/Orchestrator.sysj line: 329, column: 5
                    S909=0;
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                  else {
                    S1011=2;
                    if(enable.getprestatus() && Liquid3On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 343, column: 12
                      System.out.println("Liquid3On");//sysj/Orchestrator.sysj line: 344, column: 5
                      S1014=0;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                    else {
                      S1011=3;
                      if(enable.getprestatus() && Liquid4On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 358, column: 12
                        System.out.println("Liquid4On");//sysj/Orchestrator.sysj line: 359, column: 5
                        S1170=0;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      else {
                        S1011=4;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                    }
                  }
                }
                else {
                  thread5940(tdone,ends);
                  thread5941(tdone,ends);
                  int biggest5942 = 0;
                  if(ends[24]>=biggest5942){
                    biggest5942=ends[24];
                  }
                  if(ends[25]>=biggest5942){
                    biggest5942=ends[25];
                  }
                  if(biggest5942 == 1){
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                  //FINXME code
                  if(biggest5942 == 0){
                    System.out.println("Liquid1On Done");//sysj/Orchestrator.sysj line: 325, column: 5
                    S1011=1;
                    if(enable.getprestatus() && Liquid2On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 328, column: 12
                      System.out.println("Liquid2On");//sysj/Orchestrator.sysj line: 329, column: 5
                      S909=0;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                    else {
                      S1011=2;
                      if(enable.getprestatus() && Liquid3On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 343, column: 12
                        System.out.println("Liquid3On");//sysj/Orchestrator.sysj line: 344, column: 5
                        S1014=0;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      else {
                        S1011=3;
                        if(enable.getprestatus() && Liquid4On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 358, column: 12
                          System.out.println("Liquid4On");//sysj/Orchestrator.sysj line: 359, column: 5
                          S1170=0;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                        else {
                          S1011=4;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S909){
              case 0 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 330, column: 11
                  S909=1;
                  thread5943(tdone,ends);
                  thread5944(tdone,ends);
                  int biggest5945 = 0;
                  if(ends[26]>=biggest5945){
                    biggest5945=ends[26];
                  }
                  if(ends[27]>=biggest5945){
                    biggest5945=ends[27];
                  }
                  if(biggest5945 == 1){
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                else {
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                break;
              
              case 1 : 
                if(enable.getprestatus() && Liquid3On.getprestatus()){//sysj/Orchestrator.sysj line: 331, column: 11
                  System.out.println("Liquid2On Done");//sysj/Orchestrator.sysj line: 340, column: 5
                  S1011=2;
                  if(enable.getprestatus() && Liquid3On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 343, column: 12
                    System.out.println("Liquid3On");//sysj/Orchestrator.sysj line: 344, column: 5
                    S1014=0;
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                  else {
                    S1011=3;
                    if(enable.getprestatus() && Liquid4On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 358, column: 12
                      System.out.println("Liquid4On");//sysj/Orchestrator.sysj line: 359, column: 5
                      S1170=0;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                    else {
                      S1011=4;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                  }
                }
                else {
                  thread5946(tdone,ends);
                  thread5947(tdone,ends);
                  int biggest5948 = 0;
                  if(ends[26]>=biggest5948){
                    biggest5948=ends[26];
                  }
                  if(ends[27]>=biggest5948){
                    biggest5948=ends[27];
                  }
                  if(biggest5948 == 1){
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                  //FINXME code
                  if(biggest5948 == 0){
                    System.out.println("Liquid2On Done");//sysj/Orchestrator.sysj line: 340, column: 5
                    S1011=2;
                    if(enable.getprestatus() && Liquid3On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 343, column: 12
                      System.out.println("Liquid3On");//sysj/Orchestrator.sysj line: 344, column: 5
                      S1014=0;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                    else {
                      S1011=3;
                      if(enable.getprestatus() && Liquid4On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 358, column: 12
                        System.out.println("Liquid4On");//sysj/Orchestrator.sysj line: 359, column: 5
                        S1170=0;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      else {
                        S1011=4;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S1014){
              case 0 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 345, column: 11
                  S1014=1;
                  thread5949(tdone,ends);
                  thread5950(tdone,ends);
                  int biggest5951 = 0;
                  if(ends[28]>=biggest5951){
                    biggest5951=ends[28];
                  }
                  if(ends[29]>=biggest5951){
                    biggest5951=ends[29];
                  }
                  if(biggest5951 == 1){
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                else {
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                break;
              
              case 1 : 
                if(enable.getprestatus() && Liquid4On.getprestatus()){//sysj/Orchestrator.sysj line: 346, column: 11
                  System.out.println("Liquid3On Done");//sysj/Orchestrator.sysj line: 355, column: 5
                  S1011=3;
                  if(enable.getprestatus() && Liquid4On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 358, column: 12
                    System.out.println("Liquid4On");//sysj/Orchestrator.sysj line: 359, column: 5
                    S1170=0;
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                  else {
                    S1011=4;
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                else {
                  thread5952(tdone,ends);
                  thread5953(tdone,ends);
                  int biggest5954 = 0;
                  if(ends[28]>=biggest5954){
                    biggest5954=ends[28];
                  }
                  if(ends[29]>=biggest5954){
                    biggest5954=ends[29];
                  }
                  if(biggest5954 == 1){
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                  //FINXME code
                  if(biggest5954 == 0){
                    System.out.println("Liquid3On Done");//sysj/Orchestrator.sysj line: 355, column: 5
                    S1011=3;
                    if(enable.getprestatus() && Liquid4On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 358, column: 12
                      System.out.println("Liquid4On");//sysj/Orchestrator.sysj line: 359, column: 5
                      S1170=0;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                    else {
                      S1011=4;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 3 : 
            switch(S1170){
              case 0 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 360, column: 11
                  S1170=1;
                  thread5955(tdone,ends);
                  thread5956(tdone,ends);
                  int biggest5957 = 0;
                  if(ends[30]>=biggest5957){
                    biggest5957=ends[30];
                  }
                  if(ends[31]>=biggest5957){
                    biggest5957=ends[31];
                  }
                  if(biggest5957 == 1){
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                else {
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                break;
              
              case 1 : 
                if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 361, column: 11
                  System.out.println("Liquid4On Done");//sysj/Orchestrator.sysj line: 370, column: 5
                  S1011=4;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  thread5958(tdone,ends);
                  thread5959(tdone,ends);
                  int biggest5960 = 0;
                  if(ends[30]>=biggest5960){
                    biggest5960=ends[30];
                  }
                  if(ends[31]>=biggest5960){
                    biggest5960=ends[31];
                  }
                  if(biggest5960 == 1){
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                  //FINXME code
                  if(biggest5960 == 0){
                    System.out.println("Liquid4On Done");//sysj/Orchestrator.sysj line: 370, column: 5
                    S1011=4;
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            S1011=4;
            S1011=0;
            if(enable.getprestatus() && Liquid1On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 313, column: 12
              System.out.println("Liquid1On");//sysj/Orchestrator.sysj line: 314, column: 5
              S883=0;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S1011=1;
              if(enable.getprestatus() && Liquid2On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 328, column: 12
                System.out.println("Liquid2On");//sysj/Orchestrator.sysj line: 329, column: 5
                S909=0;
                active[23]=1;
                ends[23]=1;
                tdone[23]=1;
              }
              else {
                S1011=2;
                if(enable.getprestatus() && Liquid3On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 343, column: 12
                  System.out.println("Liquid3On");//sysj/Orchestrator.sysj line: 344, column: 5
                  S1014=0;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  S1011=3;
                  if(enable.getprestatus() && Liquid4On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 358, column: 12
                    System.out.println("Liquid4On");//sysj/Orchestrator.sysj line: 359, column: 5
                    S1170=0;
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                  else {
                    S1011=4;
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5935(int [] tdone, int [] ends){
        switch(S880){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S836){
          case 0 : 
            switch(S818){
              case 0 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 297, column: 11
                  S818=1;
                  System.out.println("Empty");//sysj/Orchestrator.sysj line: 299, column: 6
                  dosUnitEvac.setPresent();//sysj/Orchestrator.sysj line: 300, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                break;
              
              case 1 : 
                if(enable.getprestatus() && valveInjectorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 298, column: 11
                  S836=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  dosUnitEvac.setPresent();//sysj/Orchestrator.sysj line: 300, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S836=1;
            S836=0;
            if(enable.getprestatus() && valveInletOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 295, column: 12
              System.out.println("Inlet On Detected");//sysj/Orchestrator.sysj line: 296, column: 5
              S818=0;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              S836=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5933(int [] tdone, int [] ends){
        switch(S715){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(enable.getprestatus() && Liquid4On.getprestatus()){//sysj/Orchestrator.sysj line: 270, column: 12
          S715=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        else {
          inlet_closed.setPresent();//sysj/Orchestrator.sysj line: 271, column: 7
          currsigs.addElement(inlet_closed);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread5932(int [] tdone, int [] ends){
        switch(S709){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(enable.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 263, column: 12
          S709=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        else {
          dosUnitEvac.setPresent();//sysj/Orchestrator.sysj line: 265, column: 7
          currsigs.addElement(dosUnitEvac);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread5930(int [] tdone, int [] ends){
        S715=1;
    inlet_closed.setPresent();//sysj/Orchestrator.sysj line: 271, column: 7
    currsigs.addElement(inlet_closed);
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread5929(int [] tdone, int [] ends){
        S709=1;
    System.out.println("Empty");//sysj/Orchestrator.sysj line: 264, column: 7
    dosUnitEvac.setPresent();//sysj/Orchestrator.sysj line: 265, column: 7
    currsigs.addElement(dosUnitEvac);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread5928(int [] tdone, int [] ends){
        switch(S815){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S735){
          case 0 : 
            switch(S699){
              case 0 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 261, column: 11
                  S699=1;
                  thread5929(tdone,ends);
                  thread5930(tdone,ends);
                  int biggest5931 = 0;
                  if(ends[20]>=biggest5931){
                    biggest5931=ends[20];
                  }
                  if(ends[21]>=biggest5931){
                    biggest5931=ends[21];
                  }
                  if(biggest5931 == 1){
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                break;
              
              case 1 : 
                thread5932(tdone,ends);
                thread5933(tdone,ends);
                int biggest5934 = 0;
                if(ends[20]>=biggest5934){
                  biggest5934=ends[20];
                }
                if(ends[21]>=biggest5934){
                  biggest5934=ends[21];
                }
                if(biggest5934 == 1){
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                //FINXME code
                if(biggest5934 == 0){
                  System.out.println("Retract Detected");//sysj/Orchestrator.sysj line: 274, column: 5
                  S699=2;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                break;
              
              case 2 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 276, column: 11
                  S735=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S735=1;
            S735=0;
            if(enable.getprestatus() && valveInjectorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 259, column: 12
              System.out.println("Injector On Detected");//sysj/Orchestrator.sysj line: 260, column: 5
              S699=0;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S735=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5926(int [] tdone, int [] ends){
        switch(S694){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj/Orchestrator.sysj line: 253, column: 24
          rotaryTableTriggerE.setPresent();//sysj/Orchestrator.sysj line: 253, column: 44
          currsigs.addElement(rotaryTableTriggerE);
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread5925(int [] tdone, int [] ends){
        switch(S686){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(capOnBottleAtPos1.getprestatus()){//sysj/Orchestrator.sysj line: 251, column: 24
          capOnBottleAtPos1E.setPresent();//sysj/Orchestrator.sysj line: 251, column: 43
          currsigs.addElement(capOnBottleAtPos1E);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread5924(int [] tdone, int [] ends){
        switch(S678){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj/Orchestrator.sysj line: 249, column: 24
          bottleAtPos5E.setPresent();//sysj/Orchestrator.sysj line: 249, column: 38
          currsigs.addElement(bottleAtPos5E);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread5923(int [] tdone, int [] ends){
        switch(S670){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(tableAlignedWithSensor.getprestatus()){//sysj/Orchestrator.sysj line: 247, column: 24
          tableAlignedWithSensorE.setPresent();//sysj/Orchestrator.sysj line: 247, column: 48
          currsigs.addElement(tableAlignedWithSensorE);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread5922(int [] tdone, int [] ends){
        switch(S696){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        thread5923(tdone,ends);
        thread5924(tdone,ends);
        thread5925(tdone,ends);
        thread5926(tdone,ends);
        int biggest5927 = 0;
        if(ends[15]>=biggest5927){
          biggest5927=ends[15];
        }
        if(ends[16]>=biggest5927){
          biggest5927=ends[16];
        }
        if(ends[17]>=biggest5927){
          biggest5927=ends[17];
        }
        if(ends[18]>=biggest5927){
          biggest5927=ends[18];
        }
        if(biggest5927 == 1){
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        //FINXME code
        if(biggest5927 == 0){
          S696=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread5921(int [] tdone, int [] ends){
        switch(S662){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S616){
          case 0 : 
            switch(S612){
              case 0 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 233, column: 11
                  S612=1;
                  System.out.println("Table Aligned");//sysj/Orchestrator.sysj line: 235, column: 6
                  tableAlignedWithSensor.setPresent();//sysj/Orchestrator.sysj line: 236, column: 6
                  currsigs.addElement(tableAlignedWithSensor);
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                break;
              
              case 1 : 
                if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 234, column: 11
                  S612=2;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  tableAlignedWithSensor.setPresent();//sysj/Orchestrator.sysj line: 236, column: 6
                  currsigs.addElement(tableAlignedWithSensor);
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                break;
              
              case 2 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 238, column: 11
                  S616=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S616=1;
            S616=0;
            if(enable.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj/Orchestrator.sysj line: 232, column: 12
              S612=0;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S616=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5919(int [] tdone, int [] ends){
        switch(S592){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj/Orchestrator.sysj line: 227, column: 24
          bottleLeftPos5E.setPresent();//sysj/Orchestrator.sysj line: 227, column: 40
          currsigs.addElement(bottleLeftPos5E);
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

  public void thread5918(int [] tdone, int [] ends){
        switch(S584){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj/Orchestrator.sysj line: 225, column: 24
          bottleAtPos1E.setPresent();//sysj/Orchestrator.sysj line: 225, column: 38
          currsigs.addElement(bottleAtPos1E);
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

  public void thread5917(int [] tdone, int [] ends){
        switch(S576){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S570){
          case 0 : 
            S570=0;
            if(motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 223, column: 23
              motConveyorOnOffE.setPresent();//sysj/Orchestrator.sysj line: 223, column: 41
              currsigs.addElement(motConveyorOnOffE);
              S570=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S570=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S570=1;
            S570=0;
            if(motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 223, column: 23
              motConveyorOnOffE.setPresent();//sysj/Orchestrator.sysj line: 223, column: 41
              currsigs.addElement(motConveyorOnOffE);
              S570=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S570=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5916(int [] tdone, int [] ends){
        switch(S594){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        thread5917(tdone,ends);
        thread5918(tdone,ends);
        thread5919(tdone,ends);
        int biggest5920 = 0;
        if(ends[10]>=biggest5920){
          biggest5920=ends[10];
        }
        if(ends[11]>=biggest5920){
          biggest5920=ends[11];
        }
        if(ends[12]>=biggest5920){
          biggest5920=ends[12];
        }
        if(biggest5920 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest5920 == 0){
          S594=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread5915(int [] tdone, int [] ends){
        switch(S568){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S486){
          case 0 : 
            switch(S464){
              case 0 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 202, column: 11
                  S464=1;
                  System.out.println("Bottle POS 1 HIGH");//sysj/Orchestrator.sysj line: 204, column: 6
                  bottleAtPos1.setPresent();//sysj/Orchestrator.sysj line: 205, column: 6
                  currsigs.addElement(bottleAtPos1);
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
              
              case 1 : 
                if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 203, column: 11
                  S464=2;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  bottleAtPos1.setPresent();//sysj/Orchestrator.sysj line: 205, column: 6
                  currsigs.addElement(bottleAtPos1);
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 2 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 207, column: 11
                  S464=3;
                  System.out.println("Bottle POS 5 HIGH");//sysj/Orchestrator.sysj line: 209, column: 6
                  bottleLeftPos5.setPresent();//sysj/Orchestrator.sysj line: 210, column: 6
                  currsigs.addElement(bottleLeftPos5);
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
              
              case 3 : 
                if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 208, column: 11
                  S464=4;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  bottleLeftPos5.setPresent();//sysj/Orchestrator.sysj line: 210, column: 6
                  currsigs.addElement(bottleLeftPos5);
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                break;
              
              case 4 : 
                if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 212, column: 11
                  S486=1;
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
            break;
          
          case 1 : 
            S486=1;
            S486=0;
            if(enable.getprestatus() && motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 200, column: 12
              S464=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S486=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5913(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread5912(int [] tdone, int [] ends){
        S148=1;
    if(!request_conveyor.getprestatus() && enable.getprestatus()){//sysj/Orchestrator.sysj line: 70, column: 13
      S5=0;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S148=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread5910(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread5908(int [] tdone, int [] ends){
        switch(S47){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(liquid_filler_done.getprestatus()){//sysj/Orchestrator.sysj line: 105, column: 15
          S47=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          bottleAtPos2E.setPresent();//sysj/Orchestrator.sysj line: 106, column: 10
          currsigs.addElement(bottleAtPos2E);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread5907(int [] tdone, int [] ends){
        switch(S41){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S38){
          case 0 : 
            if(valveInletOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 96, column: 15
              System.out.println("LIQUID REQUEST STOP");//sysj/Orchestrator.sysj line: 100, column: 9
              S38=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              request_liquid_filler.setPresent();//sysj/Orchestrator.sysj line: 97, column: 11
              currsigs.addElement(request_liquid_filler);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(liquid_filler_done.getprestatus()){//sysj/Orchestrator.sysj line: 101, column: 15
              S41=0;
              active[5]=0;
              ends[5]=0;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5905(int [] tdone, int [] ends){
        S47=1;
    bottleAtPos2E.setPresent();//sysj/Orchestrator.sysj line: 106, column: 10
    currsigs.addElement(bottleAtPos2E);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread5904(int [] tdone, int [] ends){
        S41=1;
    S38=0;
    request_liquid_filler.setPresent();//sysj/Orchestrator.sysj line: 97, column: 11
    currsigs.addElement(request_liquid_filler);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread5903(int [] tdone, int [] ends){
        switch(S148){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S5){
          case 0 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 72, column: 12
              System.out.println("CONV");//sysj/Orchestrator.sysj line: 73, column: 6
              S5=1;
              request_conveyor.setPresent();//sysj/Orchestrator.sysj line: 75, column: 7
              currsigs.addElement(request_conveyor);
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
            if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 74, column: 12
              S5=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              request_conveyor.setPresent();//sysj/Orchestrator.sysj line: 75, column: 7
              currsigs.addElement(request_conveyor);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 77, column: 12
              System.out.println("FINISH ONV");//sysj/Orchestrator.sysj line: 78, column: 6
              S5=3;
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
          
          case 3 : 
            if(motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 79, column: 12
              S5=4;
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
          
          case 4 : 
            if(!motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 80, column: 12
              S5=5;
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
          
          case 5 : 
            if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 81, column: 12
              S5=6;
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
          
          case 6 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 82, column: 12
              System.out.println("TABLE");//sysj/Orchestrator.sysj line: 83, column: 6
              S5=7;
              request_table.setPresent();//sysj/Orchestrator.sysj line: 85, column: 7
              currsigs.addElement(request_table);
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
          
          case 7 : 
            if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 84, column: 12
              S5=8;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              request_table.setPresent();//sysj/Orchestrator.sysj line: 85, column: 7
              currsigs.addElement(request_table);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 8 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 87, column: 12
              System.out.println("FINISH TABLE");//sysj/Orchestrator.sysj line: 88, column: 6
              System.out.println("LIQUID");//sysj/Orchestrator.sysj line: 91, column: 6
              System.out.println("LIQUID REQUEST START");//sysj/Orchestrator.sysj line: 94, column: 8
              S5=9;
              thread5904(tdone,ends);
              thread5905(tdone,ends);
              int biggest5906 = 0;
              if(ends[5]>=biggest5906){
                biggest5906=ends[5];
              }
              if(ends[6]>=biggest5906){
                biggest5906=ends[6];
              }
              if(biggest5906 == 1){
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 9 : 
            thread5907(tdone,ends);
            thread5908(tdone,ends);
            int biggest5909 = 0;
            if(ends[5]>=biggest5909){
              biggest5909=ends[5];
            }
            if(ends[6]>=biggest5909){
              biggest5909=ends[6];
            }
            if(biggest5909 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            //FINXME code
            if(biggest5909 == 0){
              System.out.println("LIQUID DONE DETECTED");//sysj/Orchestrator.sysj line: 109, column: 8
              S5=10;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 10 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 112, column: 12
              System.out.println("FINISH LIQUID");//sysj/Orchestrator.sysj line: 113, column: 6
              System.out.println("TABLE");//sysj/Orchestrator.sysj line: 115, column: 6
              S5=11;
              request_table.setPresent();//sysj/Orchestrator.sysj line: 117, column: 7
              currsigs.addElement(request_table);
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
          
          case 11 : 
            if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 116, column: 12
              S5=12;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              request_table.setPresent();//sysj/Orchestrator.sysj line: 117, column: 7
              currsigs.addElement(request_table);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 12 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 119, column: 12
              System.out.println("FINISH TABLE");//sysj/Orchestrator.sysj line: 120, column: 6
              System.out.println("CAP LOADER");//sysj/Orchestrator.sysj line: 123, column: 6
              S5=13;
              request_caploader.setPresent();//sysj/Orchestrator.sysj line: 125, column: 7
              currsigs.addElement(request_caploader);
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
          
          case 13 : 
            if(enable.getprestatus() && vacOn.getprestatus()){//sysj/Orchestrator.sysj line: 124, column: 12
              S5=14;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              request_caploader.setPresent();//sysj/Orchestrator.sysj line: 125, column: 7
              currsigs.addElement(request_caploader);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 14 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 127, column: 12
              System.out.println("FINISH CAP LOADER");//sysj/Orchestrator.sysj line: 131, column: 6
              System.out.println("TABLE");//sysj/Orchestrator.sysj line: 135, column: 6
              S5=15;
              request_table.setPresent();//sysj/Orchestrator.sysj line: 137, column: 7
              currsigs.addElement(request_table);
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
          
          case 15 : 
            if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 136, column: 12
              S5=16;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              request_table.setPresent();//sysj/Orchestrator.sysj line: 137, column: 7
              currsigs.addElement(request_table);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 16 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 139, column: 12
              System.out.println("FINISH TABLE");//sysj/Orchestrator.sysj line: 140, column: 6
              System.out.println("CAPPER");//sysj/Orchestrator.sysj line: 143, column: 6
              S5=17;
              System.out.println("BOTTLE AT POS 4");//sysj/Orchestrator.sysj line: 146, column: 7
              bottleAtPos4.setPresent();//sysj/Orchestrator.sysj line: 147, column: 7
              currsigs.addElement(bottleAtPos4);
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
          
          case 17 : 
            if(enable.getprestatus() && gripperZAxisLowered.getprestatus()){//sysj/Orchestrator.sysj line: 145, column: 13
              S5=18;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj/Orchestrator.sysj line: 147, column: 7
              currsigs.addElement(bottleAtPos4);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 18 : 
            if(gripperTurnFinalPos.getprestatus()){//sysj/Orchestrator.sysj line: 149, column: 12
              S5=19;
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
          
          case 19 : 
            if(gripperZAxisLifted.getprestatus()){//sysj/Orchestrator.sysj line: 150, column: 12
              System.out.println("FINISH CAPPER");//sysj/Orchestrator.sysj line: 151, column: 6
              S5=20;
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
          
          case 20 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 153, column: 12
              System.out.println("TABLE");//sysj/Orchestrator.sysj line: 154, column: 6
              S5=21;
              request_table.setPresent();//sysj/Orchestrator.sysj line: 156, column: 7
              currsigs.addElement(request_table);
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
          
          case 21 : 
            if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 155, column: 12
              S5=22;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              request_table.setPresent();//sysj/Orchestrator.sysj line: 156, column: 7
              currsigs.addElement(request_table);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 22 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 158, column: 12
              System.out.println("FINISH TABLE");//sysj/Orchestrator.sysj line: 159, column: 6
              S5=23;
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
          
          case 23 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 162, column: 12
              System.out.println("CONV");//sysj/Orchestrator.sysj line: 163, column: 6
              S5=24;
              request_conveyor.setPresent();//sysj/Orchestrator.sysj line: 165, column: 7
              currsigs.addElement(request_conveyor);
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
          
          case 24 : 
            if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 164, column: 12
              S5=25;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              request_conveyor.setPresent();//sysj/Orchestrator.sysj line: 165, column: 7
              currsigs.addElement(request_conveyor);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 25 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 167, column: 12
              System.out.println("FINISH ONV");//sysj/Orchestrator.sysj line: 168, column: 6
              S5=26;
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
          
          case 26 : 
            if(motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 169, column: 12
              S5=27;
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
          
          case 27 : 
            if(!motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 170, column: 12
              S5=28;
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
          
          case 28 : 
            if(enable.getprestatus()){//sysj/Orchestrator.sysj line: 171, column: 12
              S5=29;
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
          
          case 29 : 
            if(!enable.getprestatus()){//sysj/Orchestrator.sysj line: 172, column: 12
              S148=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5902(int [] tdone, int [] ends){
        switch(S446){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S150){
          case 0 : 
            thread5903(tdone,ends);
            thread5910(tdone,ends);
            int biggest5911 = 0;
            if(ends[4]>=biggest5911){
              biggest5911=ends[4];
            }
            if(ends[7]>=biggest5911){
              biggest5911=ends[7];
            }
            if(biggest5911 == 1){
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            //FINXME code
            if(biggest5911 == 0){
              S150=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S150=1;
            S150=0;
            thread5912(tdone,ends);
            thread5913(tdone,ends);
            int biggest5914 = 0;
            if(ends[4]>=biggest5914){
              biggest5914=ends[4];
            }
            if(ends[7]>=biggest5914){
              biggest5914=ends[7];
            }
            if(biggest5914 == 1){
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            //FINXME code
            if(biggest5914 == 0){
              S150=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread5901(int [] tdone, int [] ends){
        switch(S3){
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

  public void thread5898(int [] tdone, int [] ends){
        S2919=1;
    if(empty.getprestatus()){//sysj/Orchestrator.sysj line: 544, column: 24
      emptyE.setPresent();//sysj/Orchestrator.sysj line: 544, column: 31
      currsigs.addElement(emptyE);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread5897(int [] tdone, int [] ends){
        S2911=1;
    if(armAtDest.getprestatus()){//sysj/Orchestrator.sysj line: 542, column: 24
      armAtDestE.setPresent();//sysj/Orchestrator.sysj line: 542, column: 35
      currsigs.addElement(armAtDestE);
      active[61]=1;
      ends[61]=1;
      tdone[61]=1;
    }
    else {
      active[61]=1;
      ends[61]=1;
      tdone[61]=1;
    }
  }

  public void thread5896(int [] tdone, int [] ends){
        S2903=1;
    if(armAtSource.getprestatus()){//sysj/Orchestrator.sysj line: 540, column: 24
      armAtSourceE.setPresent();//sysj/Orchestrator.sysj line: 540, column: 37
      currsigs.addElement(armAtSourceE);
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
    else {
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread5895(int [] tdone, int [] ends){
        S2895=1;
    if(WPgripped.getprestatus()){//sysj/Orchestrator.sysj line: 538, column: 24
      WPgrippedE.setPresent();//sysj/Orchestrator.sysj line: 538, column: 35
      currsigs.addElement(WPgrippedE);
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread5894(int [] tdone, int [] ends){
        S2887=1;
    if(pusherExtended.getprestatus()){//sysj/Orchestrator.sysj line: 536, column: 24
      pusherExtendedE.setPresent();//sysj/Orchestrator.sysj line: 536, column: 40
      currsigs.addElement(pusherExtendedE);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread5893(int [] tdone, int [] ends){
        S2879=1;
    if(pusherRetracted.getprestatus()){//sysj/Orchestrator.sysj line: 534, column: 24
      pusherRetractedE.setPresent();//sysj/Orchestrator.sysj line: 534, column: 41
      currsigs.addElement(pusherRetractedE);
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread5892(int [] tdone, int [] ends){
        S2921=1;
    thread5893(tdone,ends);
    thread5894(tdone,ends);
    thread5895(tdone,ends);
    thread5896(tdone,ends);
    thread5897(tdone,ends);
    thread5898(tdone,ends);
    int biggest5899 = 0;
    if(ends[57]>=biggest5899){
      biggest5899=ends[57];
    }
    if(ends[58]>=biggest5899){
      biggest5899=ends[58];
    }
    if(ends[59]>=biggest5899){
      biggest5899=ends[59];
    }
    if(ends[60]>=biggest5899){
      biggest5899=ends[60];
    }
    if(ends[61]>=biggest5899){
      biggest5899=ends[61];
    }
    if(ends[62]>=biggest5899){
      biggest5899=ends[62];
    }
    if(biggest5899 == 1){
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread5891(int [] tdone, int [] ends){
        S2871=1;
    capcount_thread_55 = 5;//sysj/Orchestrator.sysj line: 516, column: 3
    if(capDec_1.getprestatus()){//sysj/Orchestrator.sysj line: 518, column: 12
      if(capcount_thread_55 > 0) {//sysj/Orchestrator.sysj line: 519, column: 5
        capcount_thread_55 = capcount_thread_55 - 1;//sysj/Orchestrator.sysj line: 520, column: 6
      }
      if(refill.getprestatus()){//sysj/Orchestrator.sysj line: 522, column: 12
        capcount_thread_55 = 5;//sysj/Orchestrator.sysj line: 523, column: 5
        if(capcount_thread_55 == 0){//sysj/Orchestrator.sysj line: 526, column: 8
          empty.setPresent();//sysj/Orchestrator.sysj line: 527, column: 6
          currsigs.addElement(empty);
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        if(capcount_thread_55 == 0){//sysj/Orchestrator.sysj line: 526, column: 8
          empty.setPresent();//sysj/Orchestrator.sysj line: 527, column: 6
          currsigs.addElement(empty);
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj/Orchestrator.sysj line: 522, column: 12
        capcount_thread_55 = 5;//sysj/Orchestrator.sysj line: 523, column: 5
        if(capcount_thread_55 == 0){//sysj/Orchestrator.sysj line: 526, column: 8
          empty.setPresent();//sysj/Orchestrator.sysj line: 527, column: 6
          currsigs.addElement(empty);
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        if(capcount_thread_55 == 0){//sysj/Orchestrator.sysj line: 526, column: 8
          empty.setPresent();//sysj/Orchestrator.sysj line: 527, column: 6
          currsigs.addElement(empty);
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
    }
  }

  public void thread5890(int [] tdone, int [] ends){
        S2809=1;
    S2763=0;
    S2745=0;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread5889(int [] tdone, int [] ends){
        S2741=1;
    S2711=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj/Orchestrator.sysj line: 478, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj/Orchestrator.sysj line: 479, column: 8
        capPos_1.setPresent();//sysj/Orchestrator.sysj line: 480, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj/Orchestrator.sysj line: 480, column: 6
        WPgripped.setPresent();//sysj/Orchestrator.sysj line: 482, column: 7
        currsigs.addElement(WPgripped);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
      }
      else {
        S2711=1;
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
      }
    }
    else {
      S2711=1;
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread5888(int [] tdone, int [] ends){
        S2697=1;
    S2651=0;
    pusherRetracted.setPresent();//sysj/Orchestrator.sysj line: 466, column: 5
    currsigs.addElement(pusherRetracted);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread5887(int [] tdone, int [] ends){
        S2644=1;
    S2598=0;
    armAtDest.setPresent();//sysj/Orchestrator.sysj line: 453, column: 5
    currsigs.addElement(armAtDest);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread5885(int [] tdone, int [] ends){
        S2589=1;
    if(cylClampBottleExtend.getprestatus()){//sysj/Orchestrator.sysj line: 447, column: 24
      cylClampBottleExtendE.setPresent();//sysj/Orchestrator.sysj line: 447, column: 46
      currsigs.addElement(cylClampBottleExtendE);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread5884(int [] tdone, int [] ends){
        S2581=1;
    if(capGripperPos5Extend.getprestatus()){//sysj/Orchestrator.sysj line: 445, column: 24
      capGripperPos5ExtendE.setPresent();//sysj/Orchestrator.sysj line: 445, column: 46
      currsigs.addElement(capGripperPos5ExtendE);
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread5883(int [] tdone, int [] ends){
        S2573=1;
    if(gripperTurnExtend.getprestatus()){//sysj/Orchestrator.sysj line: 443, column: 24
      gripperTurnExtendE.setPresent();//sysj/Orchestrator.sysj line: 443, column: 43
      currsigs.addElement(gripperTurnExtendE);
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread5882(int [] tdone, int [] ends){
        S2565=1;
    if(gripperTurnRetract.getprestatus()){//sysj/Orchestrator.sysj line: 441, column: 24
      gripperTurnRetractE.setPresent();//sysj/Orchestrator.sysj line: 441, column: 44
      currsigs.addElement(gripperTurnRetractE);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread5881(int [] tdone, int [] ends){
        S2557=1;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj/Orchestrator.sysj line: 439, column: 24
      cylPos5ZaxisExtendE.setPresent();//sysj/Orchestrator.sysj line: 439, column: 44
      currsigs.addElement(cylPos5ZaxisExtendE);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread5880(int [] tdone, int [] ends){
        S2549=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj/Orchestrator.sysj line: 437, column: 24
      gripperTurnFinalPosE.setPresent();//sysj/Orchestrator.sysj line: 437, column: 45
      currsigs.addElement(gripperTurnFinalPosE);
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread5879(int [] tdone, int [] ends){
        S2541=1;
    if(gripperTurnHomePos.getprestatus()){//sysj/Orchestrator.sysj line: 435, column: 24
      gripperTurnHomePosE.setPresent();//sysj/Orchestrator.sysj line: 435, column: 44
      currsigs.addElement(gripperTurnHomePosE);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread5878(int [] tdone, int [] ends){
        S2533=1;
    if(gripperZAxisLifted.getprestatus()){//sysj/Orchestrator.sysj line: 433, column: 24
      gripperZAxisLiftedE.setPresent();//sysj/Orchestrator.sysj line: 433, column: 44
      currsigs.addElement(gripperZAxisLiftedE);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread5877(int [] tdone, int [] ends){
        S2525=1;
    if(gripperZAxisLowered.getprestatus()){//sysj/Orchestrator.sysj line: 431, column: 24
      gripperZAxisLoweredE.setPresent();//sysj/Orchestrator.sysj line: 431, column: 45
      currsigs.addElement(gripperZAxisLoweredE);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread5876(int [] tdone, int [] ends){
        S2517=1;
    if(bottleAtPos4.getprestatus()){//sysj/Orchestrator.sysj line: 429, column: 24
      bottleAtPos4E.setPresent();//sysj/Orchestrator.sysj line: 429, column: 38
      currsigs.addElement(bottleAtPos4E);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread5875(int [] tdone, int [] ends){
        S2591=1;
    thread5876(tdone,ends);
    thread5877(tdone,ends);
    thread5878(tdone,ends);
    thread5879(tdone,ends);
    thread5880(tdone,ends);
    thread5881(tdone,ends);
    thread5882(tdone,ends);
    thread5883(tdone,ends);
    thread5884(tdone,ends);
    thread5885(tdone,ends);
    int biggest5886 = 0;
    if(ends[41]>=biggest5886){
      biggest5886=ends[41];
    }
    if(ends[42]>=biggest5886){
      biggest5886=ends[42];
    }
    if(ends[43]>=biggest5886){
      biggest5886=ends[43];
    }
    if(ends[44]>=biggest5886){
      biggest5886=ends[44];
    }
    if(ends[45]>=biggest5886){
      biggest5886=ends[45];
    }
    if(ends[46]>=biggest5886){
      biggest5886=ends[46];
    }
    if(ends[47]>=biggest5886){
      biggest5886=ends[47];
    }
    if(ends[48]>=biggest5886){
      biggest5886=ends[48];
    }
    if(ends[49]>=biggest5886){
      biggest5886=ends[49];
    }
    if(ends[50]>=biggest5886){
      biggest5886=ends[50];
    }
    if(biggest5886 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread5874(int [] tdone, int [] ends){
        S2509=1;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread5873(int [] tdone, int [] ends){
        S2507=1;
    S2461=0;
    gripperTurnHomePos.setPresent();//sysj/Orchestrator.sysj line: 404, column: 5
    currsigs.addElement(gripperTurnHomePos);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread5872(int [] tdone, int [] ends){
        S2454=1;
    S2408=0;
    gripperZAxisLifted.setPresent();//sysj/Orchestrator.sysj line: 391, column: 5
    currsigs.addElement(gripperZAxisLifted);
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread5870(int [] tdone, int [] ends){
        S2399=1;
    if(dosUnitValveExtend.getprestatus()){//sysj/Orchestrator.sysj line: 383, column: 24
      dosUnitValveExtendE.setPresent();//sysj/Orchestrator.sysj line: 383, column: 44
      currsigs.addElement(dosUnitValveExtendE);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread5869(int [] tdone, int [] ends){
        S2391=1;
    if(dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 381, column: 24
      dosUnitValveRetractE.setPresent();//sysj/Orchestrator.sysj line: 381, column: 45
      currsigs.addElement(dosUnitValveRetractE);
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread5868(int [] tdone, int [] ends){
        S2383=1;
    if(valveInletOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 379, column: 24
      valveInletOnOffE.setPresent();//sysj/Orchestrator.sysj line: 379, column: 41
      currsigs.addElement(valveInletOnOffE);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread5867(int [] tdone, int [] ends){
        S2375=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 377, column: 24
      valveInjectorOnOffE.setPresent();//sysj/Orchestrator.sysj line: 377, column: 44
      currsigs.addElement(valveInjectorOnOffE);
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread5866(int [] tdone, int [] ends){
        S2401=1;
    thread5867(tdone,ends);
    thread5868(tdone,ends);
    thread5869(tdone,ends);
    thread5870(tdone,ends);
    int biggest5871 = 0;
    if(ends[33]>=biggest5871){
      biggest5871=ends[33];
    }
    if(ends[34]>=biggest5871){
      biggest5871=ends[34];
    }
    if(ends[35]>=biggest5871){
      biggest5871=ends[35];
    }
    if(ends[36]>=biggest5871){
      biggest5871=ends[36];
    }
    if(biggest5871 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread5865(int [] tdone, int [] ends){
        S2367=1;
    S1011=0;
    if(enable.getprestatus() && Liquid1On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 313, column: 12
      System.out.println("Liquid1On");//sysj/Orchestrator.sysj line: 314, column: 5
      S883=0;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S1011=1;
      if(enable.getprestatus() && Liquid2On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 328, column: 12
        System.out.println("Liquid2On");//sysj/Orchestrator.sysj line: 329, column: 5
        S909=0;
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
      else {
        S1011=2;
        if(enable.getprestatus() && Liquid3On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 343, column: 12
          System.out.println("Liquid3On");//sysj/Orchestrator.sysj line: 344, column: 5
          S1014=0;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          S1011=3;
          if(enable.getprestatus() && Liquid4On.getprestatus() && dosUnitValveRetract.getprestatus()){//sysj/Orchestrator.sysj line: 358, column: 12
            System.out.println("Liquid4On");//sysj/Orchestrator.sysj line: 359, column: 5
            S1170=0;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S1011=4;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
      }
    }
  }

  public void thread5864(int [] tdone, int [] ends){
        S880=1;
    S836=0;
    if(enable.getprestatus() && valveInletOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 295, column: 12
      System.out.println("Inlet On Detected");//sysj/Orchestrator.sysj line: 296, column: 5
      S818=0;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S836=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread5863(int [] tdone, int [] ends){
        S815=1;
    S735=0;
    if(enable.getprestatus() && valveInjectorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 259, column: 12
      System.out.println("Injector On Detected");//sysj/Orchestrator.sysj line: 260, column: 5
      S699=0;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S735=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread5861(int [] tdone, int [] ends){
        S694=1;
    if(rotaryTableTrigger.getprestatus()){//sysj/Orchestrator.sysj line: 253, column: 24
      rotaryTableTriggerE.setPresent();//sysj/Orchestrator.sysj line: 253, column: 44
      currsigs.addElement(rotaryTableTriggerE);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread5860(int [] tdone, int [] ends){
        S686=1;
    if(capOnBottleAtPos1.getprestatus()){//sysj/Orchestrator.sysj line: 251, column: 24
      capOnBottleAtPos1E.setPresent();//sysj/Orchestrator.sysj line: 251, column: 43
      currsigs.addElement(capOnBottleAtPos1E);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread5859(int [] tdone, int [] ends){
        S678=1;
    if(bottleAtPos5.getprestatus()){//sysj/Orchestrator.sysj line: 249, column: 24
      bottleAtPos5E.setPresent();//sysj/Orchestrator.sysj line: 249, column: 38
      currsigs.addElement(bottleAtPos5E);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread5858(int [] tdone, int [] ends){
        S670=1;
    if(tableAlignedWithSensor.getprestatus()){//sysj/Orchestrator.sysj line: 247, column: 24
      tableAlignedWithSensorE.setPresent();//sysj/Orchestrator.sysj line: 247, column: 48
      currsigs.addElement(tableAlignedWithSensorE);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread5857(int [] tdone, int [] ends){
        S696=1;
    thread5858(tdone,ends);
    thread5859(tdone,ends);
    thread5860(tdone,ends);
    thread5861(tdone,ends);
    int biggest5862 = 0;
    if(ends[15]>=biggest5862){
      biggest5862=ends[15];
    }
    if(ends[16]>=biggest5862){
      biggest5862=ends[16];
    }
    if(ends[17]>=biggest5862){
      biggest5862=ends[17];
    }
    if(ends[18]>=biggest5862){
      biggest5862=ends[18];
    }
    if(biggest5862 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread5856(int [] tdone, int [] ends){
        S662=1;
    S616=0;
    if(enable.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj/Orchestrator.sysj line: 232, column: 12
      S612=0;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S616=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread5854(int [] tdone, int [] ends){
        S592=1;
    if(bottleLeftPos5.getprestatus()){//sysj/Orchestrator.sysj line: 227, column: 24
      bottleLeftPos5E.setPresent();//sysj/Orchestrator.sysj line: 227, column: 40
      currsigs.addElement(bottleLeftPos5E);
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

  public void thread5853(int [] tdone, int [] ends){
        S584=1;
    if(bottleAtPos1.getprestatus()){//sysj/Orchestrator.sysj line: 225, column: 24
      bottleAtPos1E.setPresent();//sysj/Orchestrator.sysj line: 225, column: 38
      currsigs.addElement(bottleAtPos1E);
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

  public void thread5852(int [] tdone, int [] ends){
        S576=1;
    S570=0;
    if(motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 223, column: 23
      motConveyorOnOffE.setPresent();//sysj/Orchestrator.sysj line: 223, column: 41
      currsigs.addElement(motConveyorOnOffE);
      S570=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S570=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread5851(int [] tdone, int [] ends){
        S594=1;
    thread5852(tdone,ends);
    thread5853(tdone,ends);
    thread5854(tdone,ends);
    int biggest5855 = 0;
    if(ends[10]>=biggest5855){
      biggest5855=ends[10];
    }
    if(ends[11]>=biggest5855){
      biggest5855=ends[11];
    }
    if(ends[12]>=biggest5855){
      biggest5855=ends[12];
    }
    if(biggest5855 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread5850(int [] tdone, int [] ends){
        S568=1;
    S486=0;
    if(enable.getprestatus() && motConveyorOnOff.getprestatus()){//sysj/Orchestrator.sysj line: 200, column: 12
      S464=0;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S486=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread5848(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread5847(int [] tdone, int [] ends){
        S148=1;
    if(!request_conveyor.getprestatus() && enable.getprestatus()){//sysj/Orchestrator.sysj line: 70, column: 13
      S5=0;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S148=0;
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void thread5846(int [] tdone, int [] ends){
        S446=1;
    S150=0;
    thread5847(tdone,ends);
    thread5848(tdone,ends);
    int biggest5849 = 0;
    if(ends[4]>=biggest5849){
      biggest5849=ends[4];
    }
    if(ends[7]>=biggest5849){
      biggest5849=ends[7];
    }
    if(biggest5849 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    //FINXME code
    if(biggest5849 == 0){
      S150=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread5845(int [] tdone, int [] ends){
        S3=1;
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
      switch(S5843){
        case 0 : 
          S5843=0;
          break RUN;
        
        case 1 : 
          S5843=2;
          S5843=2;
          capDec_1.setClear();//sysj/Orchestrator.sysj line: 57, column: 2
          capPos_1.setClear();//sysj/Orchestrator.sysj line: 58, column: 2
          capPos_1.setPresent();//sysj/Orchestrator.sysj line: 59, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj/Orchestrator.sysj line: 59, column: 2
          thread5845(tdone,ends);
          thread5846(tdone,ends);
          thread5850(tdone,ends);
          thread5851(tdone,ends);
          thread5856(tdone,ends);
          thread5857(tdone,ends);
          thread5863(tdone,ends);
          thread5864(tdone,ends);
          thread5865(tdone,ends);
          thread5866(tdone,ends);
          thread5872(tdone,ends);
          thread5873(tdone,ends);
          thread5874(tdone,ends);
          thread5875(tdone,ends);
          thread5887(tdone,ends);
          thread5888(tdone,ends);
          thread5889(tdone,ends);
          thread5890(tdone,ends);
          thread5891(tdone,ends);
          thread5892(tdone,ends);
          int biggest5900 = 0;
          if(ends[2]>=biggest5900){
            biggest5900=ends[2];
          }
          if(ends[3]>=biggest5900){
            biggest5900=ends[3];
          }
          if(ends[8]>=biggest5900){
            biggest5900=ends[8];
          }
          if(ends[9]>=biggest5900){
            biggest5900=ends[9];
          }
          if(ends[13]>=biggest5900){
            biggest5900=ends[13];
          }
          if(ends[14]>=biggest5900){
            biggest5900=ends[14];
          }
          if(ends[19]>=biggest5900){
            biggest5900=ends[19];
          }
          if(ends[22]>=biggest5900){
            biggest5900=ends[22];
          }
          if(ends[23]>=biggest5900){
            biggest5900=ends[23];
          }
          if(ends[32]>=biggest5900){
            biggest5900=ends[32];
          }
          if(ends[37]>=biggest5900){
            biggest5900=ends[37];
          }
          if(ends[38]>=biggest5900){
            biggest5900=ends[38];
          }
          if(ends[39]>=biggest5900){
            biggest5900=ends[39];
          }
          if(ends[40]>=biggest5900){
            biggest5900=ends[40];
          }
          if(ends[51]>=biggest5900){
            biggest5900=ends[51];
          }
          if(ends[52]>=biggest5900){
            biggest5900=ends[52];
          }
          if(ends[53]>=biggest5900){
            biggest5900=ends[53];
          }
          if(ends[54]>=biggest5900){
            biggest5900=ends[54];
          }
          if(ends[55]>=biggest5900){
            biggest5900=ends[55];
          }
          if(ends[56]>=biggest5900){
            biggest5900=ends[56];
          }
          if(biggest5900 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj/Orchestrator.sysj line: 57, column: 2
          capPos_1.setClear();//sysj/Orchestrator.sysj line: 58, column: 2
          thread5901(tdone,ends);
          thread5902(tdone,ends);
          thread5915(tdone,ends);
          thread5916(tdone,ends);
          thread5921(tdone,ends);
          thread5922(tdone,ends);
          thread5928(tdone,ends);
          thread5935(tdone,ends);
          thread5936(tdone,ends);
          thread5961(tdone,ends);
          thread5967(tdone,ends);
          thread5968(tdone,ends);
          thread5969(tdone,ends);
          thread5970(tdone,ends);
          thread5982(tdone,ends);
          thread5983(tdone,ends);
          thread5984(tdone,ends);
          thread5985(tdone,ends);
          thread5986(tdone,ends);
          thread5987(tdone,ends);
          int biggest5995 = 0;
          if(ends[2]>=biggest5995){
            biggest5995=ends[2];
          }
          if(ends[3]>=biggest5995){
            biggest5995=ends[3];
          }
          if(ends[8]>=biggest5995){
            biggest5995=ends[8];
          }
          if(ends[9]>=biggest5995){
            biggest5995=ends[9];
          }
          if(ends[13]>=biggest5995){
            biggest5995=ends[13];
          }
          if(ends[14]>=biggest5995){
            biggest5995=ends[14];
          }
          if(ends[19]>=biggest5995){
            biggest5995=ends[19];
          }
          if(ends[22]>=biggest5995){
            biggest5995=ends[22];
          }
          if(ends[23]>=biggest5995){
            biggest5995=ends[23];
          }
          if(ends[32]>=biggest5995){
            biggest5995=ends[32];
          }
          if(ends[37]>=biggest5995){
            biggest5995=ends[37];
          }
          if(ends[38]>=biggest5995){
            biggest5995=ends[38];
          }
          if(ends[39]>=biggest5995){
            biggest5995=ends[39];
          }
          if(ends[40]>=biggest5995){
            biggest5995=ends[40];
          }
          if(ends[51]>=biggest5995){
            biggest5995=ends[51];
          }
          if(ends[52]>=biggest5995){
            biggest5995=ends[52];
          }
          if(ends[53]>=biggest5995){
            biggest5995=ends[53];
          }
          if(ends[54]>=biggest5995){
            biggest5995=ends[54];
          }
          if(ends[55]>=biggest5995){
            biggest5995=ends[55];
          }
          if(ends[56]>=biggest5995){
            biggest5995=ends[56];
          }
          if(biggest5995 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest5995 == 0){
            S5843=0;
            active[1]=0;
            ends[1]=0;
            S5843=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_1 = new Signal();
    capPos_1 = new Signal();
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
          liquid_filler_done.gethook();
          Liquid1On.gethook();
          Liquid2On.gethook();
          Liquid3On.gethook();
          Liquid4On.gethook();
          cylPos5ZaxisExtend.gethook();
          gripperTurnRetract.gethook();
          gripperTurnExtend.gethook();
          capGripperPos5Extend.gethook();
          cylClampBottleExtend.gethook();
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          refill.gethook();
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
      liquid_filler_done.setpreclear();
      Liquid1On.setpreclear();
      Liquid2On.setpreclear();
      Liquid3On.setpreclear();
      Liquid4On.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      refill.setpreclear();
      request_conveyor.setpreclear();
      request_liquid_filler.setpreclear();
      request_table.setpreclear();
      request_caploader.setpreclear();
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
      FirstLiquidDone.setpreclear();
      SecondLiquidDone.setpreclear();
      ThirdLiquidDone.setpreclear();
      FourthLiquidDone.setpreclear();
      injector_closed.setpreclear();
      inlet_closed.setpreclear();
      extended.setpreclear();
      retracted.setpreclear();
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorOnOffE.setpreclear();
      valveInletOnOffE.setpreclear();
      dosUnitValveRetractE.setpreclear();
      dosUnitValveExtendE.setpreclear();
      bottleAtPos2E.setpreclear();
      FirstLiquidDoneE.setpreclear();
      SecondLiquidDoneE.setpreclear();
      ThirdLiquidDoneE.setpreclear();
      FourthLiquidDoneE.setpreclear();
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      bottleAtPos4E.setpreclear();
      gripperZAxisLoweredE.setpreclear();
      gripperZAxisLiftedE.setpreclear();
      gripperTurnHomePosE.setpreclear();
      gripperTurnFinalPosE.setpreclear();
      cylPos5ZaxisExtendE.setpreclear();
      gripperTurnRetractE.setpreclear();
      gripperTurnExtendE.setpreclear();
      capGripperPos5ExtendE.setpreclear();
      cylClampBottleExtendE.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      pusherRetractedE.setpreclear();
      pusherExtendedE.setpreclear();
      WPgrippedE.setpreclear();
      armAtSourceE.setpreclear();
      armAtDestE.setpreclear();
      emptyE.setpreclear();
      capDec_1.setpreclear();
      capPos_1.setpreclear();
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
      dummyint = liquid_filler_done.getStatus() ? liquid_filler_done.setprepresent() : liquid_filler_done.setpreclear();
      liquid_filler_done.setpreval(liquid_filler_done.getValue());
      liquid_filler_done.setClear();
      dummyint = Liquid1On.getStatus() ? Liquid1On.setprepresent() : Liquid1On.setpreclear();
      Liquid1On.setpreval(Liquid1On.getValue());
      Liquid1On.setClear();
      dummyint = Liquid2On.getStatus() ? Liquid2On.setprepresent() : Liquid2On.setpreclear();
      Liquid2On.setpreval(Liquid2On.getValue());
      Liquid2On.setClear();
      dummyint = Liquid3On.getStatus() ? Liquid3On.setprepresent() : Liquid3On.setpreclear();
      Liquid3On.setpreval(Liquid3On.getValue());
      Liquid3On.setClear();
      dummyint = Liquid4On.getStatus() ? Liquid4On.setprepresent() : Liquid4On.setpreclear();
      Liquid4On.setpreval(Liquid4On.getValue());
      Liquid4On.setClear();
      dummyint = cylPos5ZaxisExtend.getStatus() ? cylPos5ZaxisExtend.setprepresent() : cylPos5ZaxisExtend.setpreclear();
      cylPos5ZaxisExtend.setpreval(cylPos5ZaxisExtend.getValue());
      cylPos5ZaxisExtend.setClear();
      dummyint = gripperTurnRetract.getStatus() ? gripperTurnRetract.setprepresent() : gripperTurnRetract.setpreclear();
      gripperTurnRetract.setpreval(gripperTurnRetract.getValue());
      gripperTurnRetract.setClear();
      dummyint = gripperTurnExtend.getStatus() ? gripperTurnExtend.setprepresent() : gripperTurnExtend.setpreclear();
      gripperTurnExtend.setpreval(gripperTurnExtend.getValue());
      gripperTurnExtend.setClear();
      dummyint = capGripperPos5Extend.getStatus() ? capGripperPos5Extend.setprepresent() : capGripperPos5Extend.setpreclear();
      capGripperPos5Extend.setpreval(capGripperPos5Extend.getValue());
      capGripperPos5Extend.setClear();
      dummyint = cylClampBottleExtend.getStatus() ? cylClampBottleExtend.setprepresent() : cylClampBottleExtend.setpreclear();
      cylClampBottleExtend.setpreval(cylClampBottleExtend.getValue());
      cylClampBottleExtend.setClear();
      dummyint = pusherExtend.getStatus() ? pusherExtend.setprepresent() : pusherExtend.setpreclear();
      pusherExtend.setpreval(pusherExtend.getValue());
      pusherExtend.setClear();
      dummyint = vacOn.getStatus() ? vacOn.setprepresent() : vacOn.setpreclear();
      vacOn.setpreval(vacOn.getValue());
      vacOn.setClear();
      dummyint = armSource.getStatus() ? armSource.setprepresent() : armSource.setpreclear();
      armSource.setpreval(armSource.getValue());
      armSource.setClear();
      dummyint = armDest.getStatus() ? armDest.setprepresent() : armDest.setpreclear();
      armDest.setpreval(armDest.getValue());
      armDest.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      request_conveyor.sethook();
      request_conveyor.setClear();
      request_liquid_filler.sethook();
      request_liquid_filler.setClear();
      request_table.sethook();
      request_table.setClear();
      request_caploader.sethook();
      request_caploader.setClear();
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
      FirstLiquidDone.sethook();
      FirstLiquidDone.setClear();
      SecondLiquidDone.sethook();
      SecondLiquidDone.setClear();
      ThirdLiquidDone.sethook();
      ThirdLiquidDone.setClear();
      FourthLiquidDone.sethook();
      FourthLiquidDone.setClear();
      injector_closed.sethook();
      injector_closed.setClear();
      inlet_closed.sethook();
      inlet_closed.setClear();
      extended.sethook();
      extended.setClear();
      retracted.sethook();
      retracted.setClear();
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
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      FirstLiquidDoneE.sethook();
      FirstLiquidDoneE.setClear();
      SecondLiquidDoneE.sethook();
      SecondLiquidDoneE.setClear();
      ThirdLiquidDoneE.sethook();
      ThirdLiquidDoneE.setClear();
      FourthLiquidDoneE.sethook();
      FourthLiquidDoneE.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      gripperZAxisLowered.sethook();
      gripperZAxisLowered.setClear();
      gripperZAxisLifted.sethook();
      gripperZAxisLifted.setClear();
      gripperTurnHomePos.sethook();
      gripperTurnHomePos.setClear();
      gripperTurnFinalPos.sethook();
      gripperTurnFinalPos.setClear();
      bottleAtPos4E.sethook();
      bottleAtPos4E.setClear();
      gripperZAxisLoweredE.sethook();
      gripperZAxisLoweredE.setClear();
      gripperZAxisLiftedE.sethook();
      gripperZAxisLiftedE.setClear();
      gripperTurnHomePosE.sethook();
      gripperTurnHomePosE.setClear();
      gripperTurnFinalPosE.sethook();
      gripperTurnFinalPosE.setClear();
      cylPos5ZaxisExtendE.sethook();
      cylPos5ZaxisExtendE.setClear();
      gripperTurnRetractE.sethook();
      gripperTurnRetractE.setClear();
      gripperTurnExtendE.sethook();
      gripperTurnExtendE.setClear();
      capGripperPos5ExtendE.sethook();
      capGripperPos5ExtendE.setClear();
      cylClampBottleExtendE.sethook();
      cylClampBottleExtendE.setClear();
      pusherRetracted.sethook();
      pusherRetracted.setClear();
      pusherExtended.sethook();
      pusherExtended.setClear();
      WPgripped.sethook();
      WPgripped.setClear();
      armAtSource.sethook();
      armAtSource.setClear();
      armAtDest.sethook();
      armAtDest.setClear();
      empty.sethook();
      empty.setClear();
      pusherRetractedE.sethook();
      pusherRetractedE.setClear();
      pusherExtendedE.sethook();
      pusherExtendedE.setClear();
      WPgrippedE.sethook();
      WPgrippedE.setClear();
      armAtSourceE.sethook();
      armAtSourceE.setClear();
      armAtDestE.sethook();
      armAtDestE.setClear();
      emptyE.sethook();
      emptyE.setClear();
      capDec_1.setClear();
      capPos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        enable.gethook();
        rotaryTableTrigger.gethook();
        motConveyorOnOff.gethook();
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
        liquid_filler_done.gethook();
        Liquid1On.gethook();
        Liquid2On.gethook();
        Liquid3On.gethook();
        Liquid4On.gethook();
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
