import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class LiquidFiller_Controller extends ClockDomain{
  public LiquidFiller_Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal request_liquid_filler = new Signal("request_liquid_filler", Signal.INPUT);
  public Signal injector_closed = new Signal("injector_closed", Signal.INPUT);
  public Signal inlet_closed = new Signal("inlet_closed", Signal.INPUT);
  public Signal extended = new Signal("extended", Signal.INPUT);
  public Signal retracted = new Signal("retracted", Signal.INPUT);
  public Signal FirstLiquidDone = new Signal("FirstLiquidDone", Signal.INPUT);
  public Signal SecondLiquidDone = new Signal("SecondLiquidDone", Signal.INPUT);
  public Signal ThirdLiquidDone = new Signal("ThirdLiquidDone", Signal.INPUT);
  public Signal FourthLiquidDone = new Signal("FourthLiquidDone", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal Liquid1On = new Signal("Liquid1On", Signal.OUTPUT);
  public Signal Liquid2On = new Signal("Liquid2On", Signal.OUTPUT);
  public Signal Liquid3On = new Signal("Liquid3On", Signal.OUTPUT);
  public Signal Liquid4On = new Signal("Liquid4On", Signal.OUTPUT);
  public Signal liquid_filler_done = new Signal("liquid_filler_done", Signal.OUTPUT);
  private int S1463 = 1;
  private int S107 = 1;
  private int S35 = 1;
  private int S10 = 1;
  private int S16 = 1;
  private int S481 = 1;
  private int S231 = 1;
  private int S108 = 1;
  private int S113 = 1;
  private int S118 = 1;
  private int S135 = 1;
  private int S140 = 1;
  private int S168 = 1;
  private int S173 = 1;
  private int S201 = 1;
  private int S206 = 1;
  private int S540 = 1;
  private int S500 = 1;
  private int S731 = 1;
  private int S603 = 1;
  private int S557 = 1;
  private int S573 = 1;
  private int S562 = 1;
  private int S570 = 1;
  private int S579 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void thread1529(int [] tdone, int [] ends){
        switch(S579){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(request.getprestatus() || bottleAtPos2.getprestatus() || request_liquid_filler.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 141, column: 12
          S579=0;
          active[19]=0;
          ends[19]=0;
          tdone[19]=1;
        }
        else {
          dosUnitValveExtend.setPresent();//sysj/LiquidFiller_controller.sysj line: 142, column: 7
          currsigs.addElement(dosUnitValveExtend);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread1527(int [] tdone, int [] ends){
        switch(S570){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        liquid_filler_done.setPresent();//sysj/LiquidFiller_controller.sysj line: 135, column: 7
        currsigs.addElement(liquid_filler_done);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread1526(int [] tdone, int [] ends){
        switch(S562){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj/LiquidFiller_controller.sysj line: 130, column: 7
        currsigs.addElement(dosUnitValveExtend);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread1525(int [] tdone, int [] ends){
        switch(S573){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(request.getprestatus() || bottleAtPos2.getprestatus() || request_liquid_filler.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 128, column: 12
          S573=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        else {
          thread1526(tdone,ends);
          thread1527(tdone,ends);
          int biggest1528 = 0;
          if(ends[17]>=biggest1528){
            biggest1528=ends[17];
          }
          if(ends[18]>=biggest1528){
            biggest1528=ends[18];
          }
          if(biggest1528 == 1){
            active[16]=1;
            ends[16]=1;
            tdone[16]=1;
          }
          //FINXME code
          if(biggest1528 == 0){
            S573=0;
            active[16]=0;
            ends[16]=0;
            tdone[16]=1;
          }
        }
        break;
      
    }
  }

  public void thread1523(int [] tdone, int [] ends){
        S579=1;
    dosUnitValveExtend.setPresent();//sysj/LiquidFiller_controller.sysj line: 142, column: 7
    currsigs.addElement(dosUnitValveExtend);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread1521(int [] tdone, int [] ends){
        S570=1;
    System.out.println("DOEOENOEN");//sysj/LiquidFiller_controller.sysj line: 134, column: 7
    liquid_filler_done.setPresent();//sysj/LiquidFiller_controller.sysj line: 135, column: 7
    currsigs.addElement(liquid_filler_done);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread1520(int [] tdone, int [] ends){
        S562=1;
    dosUnitValveExtend.setPresent();//sysj/LiquidFiller_controller.sysj line: 130, column: 7
    currsigs.addElement(dosUnitValveExtend);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread1519(int [] tdone, int [] ends){
        S573=1;
    thread1520(tdone,ends);
    thread1521(tdone,ends);
    int biggest1522 = 0;
    if(ends[17]>=biggest1522){
      biggest1522=ends[17];
    }
    if(ends[18]>=biggest1522){
      biggest1522=ends[18];
    }
    if(biggest1522 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread1518(int [] tdone, int [] ends){
        switch(S731){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S603){
          case 0 : 
            switch(S557){
              case 0 : 
                if(dosUnitEvac.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 122, column: 11
                  System.out.println("INLET OFF");//sysj/LiquidFiller_controller.sysj line: 126, column: 5
                  S557=1;
                  thread1519(tdone,ends);
                  thread1523(tdone,ends);
                  int biggest1524 = 0;
                  if(ends[16]>=biggest1524){
                    biggest1524=ends[16];
                  }
                  if(ends[19]>=biggest1524){
                    biggest1524=ends[19];
                  }
                  if(biggest1524 == 1){
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                else {
                  valveInletOnOff.setPresent();//sysj/LiquidFiller_controller.sysj line: 124, column: 6
                  currsigs.addElement(valveInletOnOff);
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                break;
              
              case 1 : 
                thread1525(tdone,ends);
                thread1529(tdone,ends);
                int biggest1530 = 0;
                if(ends[16]>=biggest1530){
                  biggest1530=ends[16];
                }
                if(ends[19]>=biggest1530){
                  biggest1530=ends[19];
                }
                if(biggest1530 == 1){
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                //FINXME code
                if(biggest1530 == 0){
                  S603=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S603=1;
            S603=0;
            if(dosUnitFilled.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 120, column: 12
              System.out.println("Filled");//sysj/LiquidFiller_controller.sysj line: 121, column: 5
              S557=0;
              System.out.println("INLET ON");//sysj/LiquidFiller_controller.sysj line: 123, column: 6
              valveInletOnOff.setPresent();//sysj/LiquidFiller_controller.sysj line: 124, column: 6
              currsigs.addElement(valveInletOnOff);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              S603=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1517(int [] tdone, int [] ends){
        switch(S540){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S500){
          case 0 : 
            if(dosUnitEvac.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 107, column: 11
              S500=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              dosUnitValveExtend.setPresent();//sysj/LiquidFiller_controller.sysj line: 109, column: 6
              currsigs.addElement(dosUnitValveExtend);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            S500=1;
            S500=0;
            if(dosUnitFilled.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 104, column: 12
              System.out.println("Filled");//sysj/LiquidFiller_controller.sysj line: 105, column: 5
              System.out.println("EXTEND");//sysj/LiquidFiller_controller.sysj line: 108, column: 6
              dosUnitValveExtend.setPresent();//sysj/LiquidFiller_controller.sysj line: 109, column: 6
              currsigs.addElement(dosUnitValveExtend);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              S500=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1515(int [] tdone, int [] ends){
        S118=1;
    dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 59, column: 7
    currsigs.addElement(dosUnitValveRetract);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1514(int [] tdone, int [] ends){
        S113=1;
    Liquid1On.setPresent();//sysj/LiquidFiller_controller.sysj line: 55, column: 7
    currsigs.addElement(Liquid1On);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1512(int [] tdone, int [] ends){
        switch(S206){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 92, column: 7
        currsigs.addElement(dosUnitValveRetract);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread1511(int [] tdone, int [] ends){
        switch(S201){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        Liquid4On.setPresent();//sysj/LiquidFiller_controller.sysj line: 88, column: 7
        currsigs.addElement(Liquid4On);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread1509(int [] tdone, int [] ends){
        S206=1;
    dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 92, column: 7
    currsigs.addElement(dosUnitValveRetract);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread1508(int [] tdone, int [] ends){
        S201=1;
    Liquid4On.setPresent();//sysj/LiquidFiller_controller.sysj line: 88, column: 7
    currsigs.addElement(Liquid4On);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread1506(int [] tdone, int [] ends){
        switch(S173){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 81, column: 7
        currsigs.addElement(dosUnitValveRetract);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread1505(int [] tdone, int [] ends){
        switch(S168){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        Liquid3On.setPresent();//sysj/LiquidFiller_controller.sysj line: 77, column: 7
        currsigs.addElement(Liquid3On);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread1503(int [] tdone, int [] ends){
        S206=1;
    dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 92, column: 7
    currsigs.addElement(dosUnitValveRetract);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread1502(int [] tdone, int [] ends){
        S201=1;
    Liquid4On.setPresent();//sysj/LiquidFiller_controller.sysj line: 88, column: 7
    currsigs.addElement(Liquid4On);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread1500(int [] tdone, int [] ends){
        S173=1;
    dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 81, column: 7
    currsigs.addElement(dosUnitValveRetract);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread1499(int [] tdone, int [] ends){
        S168=1;
    Liquid3On.setPresent();//sysj/LiquidFiller_controller.sysj line: 77, column: 7
    currsigs.addElement(Liquid3On);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread1497(int [] tdone, int [] ends){
        switch(S140){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 70, column: 7
        currsigs.addElement(dosUnitValveRetract);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread1496(int [] tdone, int [] ends){
        switch(S135){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        Liquid2On.setPresent();//sysj/LiquidFiller_controller.sysj line: 66, column: 7
        currsigs.addElement(Liquid2On);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread1494(int [] tdone, int [] ends){
        S173=1;
    dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 81, column: 7
    currsigs.addElement(dosUnitValveRetract);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread1493(int [] tdone, int [] ends){
        S168=1;
    Liquid3On.setPresent();//sysj/LiquidFiller_controller.sysj line: 77, column: 7
    currsigs.addElement(Liquid3On);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread1491(int [] tdone, int [] ends){
        S140=1;
    dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 70, column: 7
    currsigs.addElement(dosUnitValveRetract);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1490(int [] tdone, int [] ends){
        S135=1;
    Liquid2On.setPresent();//sysj/LiquidFiller_controller.sysj line: 66, column: 7
    currsigs.addElement(Liquid2On);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread1488(int [] tdone, int [] ends){
        switch(S118){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 59, column: 7
        currsigs.addElement(dosUnitValveRetract);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread1487(int [] tdone, int [] ends){
        switch(S113){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        Liquid1On.setPresent();//sysj/LiquidFiller_controller.sysj line: 55, column: 7
        currsigs.addElement(Liquid1On);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread1485(int [] tdone, int [] ends){
        S140=1;
    dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 70, column: 7
    currsigs.addElement(dosUnitValveRetract);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1484(int [] tdone, int [] ends){
        S135=1;
    Liquid2On.setPresent();//sysj/LiquidFiller_controller.sysj line: 66, column: 7
    currsigs.addElement(Liquid2On);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread1483(int [] tdone, int [] ends){
        switch(S481){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S231){
          case 0 : 
            switch(S108){
              case 0 : 
                if(FirstLiquidDone.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 53, column: 11
                  System.out.println("Second Liquid");//sysj/LiquidFiller_controller.sysj line: 63, column: 5
                  S108=1;
                  thread1484(tdone,ends);
                  thread1485(tdone,ends);
                  int biggest1486 = 0;
                  if(ends[8]>=biggest1486){
                    biggest1486=ends[8];
                  }
                  if(ends[9]>=biggest1486){
                    biggest1486=ends[9];
                  }
                  if(biggest1486 == 1){
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  thread1487(tdone,ends);
                  thread1488(tdone,ends);
                  int biggest1489 = 0;
                  if(ends[6]>=biggest1489){
                    biggest1489=ends[6];
                  }
                  if(ends[7]>=biggest1489){
                    biggest1489=ends[7];
                  }
                  if(biggest1489 == 1){
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  //FINXME code
                  if(biggest1489 == 0){
                    System.out.println("Second Liquid");//sysj/LiquidFiller_controller.sysj line: 63, column: 5
                    S108=1;
                    thread1490(tdone,ends);
                    thread1491(tdone,ends);
                    int biggest1492 = 0;
                    if(ends[8]>=biggest1492){
                      biggest1492=ends[8];
                    }
                    if(ends[9]>=biggest1492){
                      biggest1492=ends[9];
                    }
                    if(biggest1492 == 1){
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(SecondLiquidDone.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 64, column: 11
                  System.out.println("Third Liquid");//sysj/LiquidFiller_controller.sysj line: 74, column: 5
                  S108=2;
                  thread1493(tdone,ends);
                  thread1494(tdone,ends);
                  int biggest1495 = 0;
                  if(ends[10]>=biggest1495){
                    biggest1495=ends[10];
                  }
                  if(ends[11]>=biggest1495){
                    biggest1495=ends[11];
                  }
                  if(biggest1495 == 1){
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  thread1496(tdone,ends);
                  thread1497(tdone,ends);
                  int biggest1498 = 0;
                  if(ends[8]>=biggest1498){
                    biggest1498=ends[8];
                  }
                  if(ends[9]>=biggest1498){
                    biggest1498=ends[9];
                  }
                  if(biggest1498 == 1){
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  //FINXME code
                  if(biggest1498 == 0){
                    System.out.println("Third Liquid");//sysj/LiquidFiller_controller.sysj line: 74, column: 5
                    S108=2;
                    thread1499(tdone,ends);
                    thread1500(tdone,ends);
                    int biggest1501 = 0;
                    if(ends[10]>=biggest1501){
                      biggest1501=ends[10];
                    }
                    if(ends[11]>=biggest1501){
                      biggest1501=ends[11];
                    }
                    if(biggest1501 == 1){
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                }
                break;
              
              case 2 : 
                if(ThirdLiquidDone.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 75, column: 11
                  System.out.println("Fourth Liquid");//sysj/LiquidFiller_controller.sysj line: 85, column: 5
                  S108=3;
                  thread1502(tdone,ends);
                  thread1503(tdone,ends);
                  int biggest1504 = 0;
                  if(ends[12]>=biggest1504){
                    biggest1504=ends[12];
                  }
                  if(ends[13]>=biggest1504){
                    biggest1504=ends[13];
                  }
                  if(biggest1504 == 1){
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  thread1505(tdone,ends);
                  thread1506(tdone,ends);
                  int biggest1507 = 0;
                  if(ends[10]>=biggest1507){
                    biggest1507=ends[10];
                  }
                  if(ends[11]>=biggest1507){
                    biggest1507=ends[11];
                  }
                  if(biggest1507 == 1){
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  //FINXME code
                  if(biggest1507 == 0){
                    System.out.println("Fourth Liquid");//sysj/LiquidFiller_controller.sysj line: 85, column: 5
                    S108=3;
                    thread1508(tdone,ends);
                    thread1509(tdone,ends);
                    int biggest1510 = 0;
                    if(ends[12]>=biggest1510){
                      biggest1510=ends[12];
                    }
                    if(ends[13]>=biggest1510){
                      biggest1510=ends[13];
                    }
                    if(biggest1510 == 1){
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                }
                break;
              
              case 3 : 
                if(dosUnitFilled.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 86, column: 11
                  S231=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  thread1511(tdone,ends);
                  thread1512(tdone,ends);
                  int biggest1513 = 0;
                  if(ends[12]>=biggest1513){
                    biggest1513=ends[12];
                  }
                  if(ends[13]>=biggest1513){
                    biggest1513=ends[13];
                  }
                  if(biggest1513 == 1){
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  //FINXME code
                  if(biggest1513 == 0){
                    S231=1;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S231=1;
            S231=0;
            if(dosUnitEvac.getprestatus() && inlet_closed.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 44, column: 12
              System.out.println("Empty");//sysj/LiquidFiller_controller.sysj line: 45, column: 5
              System.out.println("First Liquid");//sysj/LiquidFiller_controller.sysj line: 52, column: 5
              S108=0;
              thread1514(tdone,ends);
              thread1515(tdone,ends);
              int biggest1516 = 0;
              if(ends[6]>=biggest1516){
                biggest1516=ends[6];
              }
              if(ends[7]>=biggest1516){
                biggest1516=ends[7];
              }
              if(biggest1516 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S231=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1481(int [] tdone, int [] ends){
        S16=1;
    dosUnitValveExtend.setPresent();//sysj/LiquidFiller_controller.sysj line: 32, column: 7
    currsigs.addElement(dosUnitValveExtend);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1480(int [] tdone, int [] ends){
        S10=1;
    System.out.println("INJECTOR ON");//sysj/LiquidFiller_controller.sysj line: 25, column: 7
    valveInjectorOnOff.setPresent();//sysj/LiquidFiller_controller.sysj line: 26, column: 7
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1478(int [] tdone, int [] ends){
        switch(S16){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(dosUnitValveRetract.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 31, column: 12
          S16=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        else {
          dosUnitValveExtend.setPresent();//sysj/LiquidFiller_controller.sysj line: 32, column: 7
          currsigs.addElement(dosUnitValveExtend);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread1477(int [] tdone, int [] ends){
        switch(S10){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 24, column: 12
          S10=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          valveInjectorOnOff.setPresent();//sysj/LiquidFiller_controller.sysj line: 26, column: 7
          currsigs.addElement(valveInjectorOnOff);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread1476(int [] tdone, int [] ends){
        switch(S107){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S35){
          case 0 : 
            thread1477(tdone,ends);
            thread1478(tdone,ends);
            int biggest1479 = 0;
            if(ends[3]>=biggest1479){
              biggest1479=ends[3];
            }
            if(ends[4]>=biggest1479){
              biggest1479=ends[4];
            }
            if(biggest1479 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest1479 == 0){
              System.out.println("INJECTOR OFF");//sysj/LiquidFiller_controller.sysj line: 36, column: 5
              S35=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S35=1;
            S35=0;
            if(request.getprestatus() || bottleAtPos2.getprestatus() || request_liquid_filler.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 21, column: 12
              System.out.println("BottleAtPos2");//sysj/LiquidFiller_controller.sysj line: 22, column: 5
              thread1480(tdone,ends);
              thread1481(tdone,ends);
              int biggest1482 = 0;
              if(ends[3]>=biggest1482){
                biggest1482=ends[3];
              }
              if(ends[4]>=biggest1482){
                biggest1482=ends[4];
              }
              if(biggest1482 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S35=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1474(int [] tdone, int [] ends){
        S731=1;
    S603=0;
    if(dosUnitFilled.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 120, column: 12
      System.out.println("Filled");//sysj/LiquidFiller_controller.sysj line: 121, column: 5
      S557=0;
      System.out.println("INLET ON");//sysj/LiquidFiller_controller.sysj line: 123, column: 6
      valveInletOnOff.setPresent();//sysj/LiquidFiller_controller.sysj line: 124, column: 6
      currsigs.addElement(valveInletOnOff);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S603=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread1473(int [] tdone, int [] ends){
        S540=1;
    S500=0;
    if(dosUnitFilled.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 104, column: 12
      System.out.println("Filled");//sysj/LiquidFiller_controller.sysj line: 105, column: 5
      System.out.println("EXTEND");//sysj/LiquidFiller_controller.sysj line: 108, column: 6
      dosUnitValveExtend.setPresent();//sysj/LiquidFiller_controller.sysj line: 109, column: 6
      currsigs.addElement(dosUnitValveExtend);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S500=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread1471(int [] tdone, int [] ends){
        S118=1;
    dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 59, column: 7
    currsigs.addElement(dosUnitValveRetract);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1470(int [] tdone, int [] ends){
        S113=1;
    Liquid1On.setPresent();//sysj/LiquidFiller_controller.sysj line: 55, column: 7
    currsigs.addElement(Liquid1On);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1469(int [] tdone, int [] ends){
        S481=1;
    S231=0;
    if(dosUnitEvac.getprestatus() && inlet_closed.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 44, column: 12
      System.out.println("Empty");//sysj/LiquidFiller_controller.sysj line: 45, column: 5
      System.out.println("First Liquid");//sysj/LiquidFiller_controller.sysj line: 52, column: 5
      S108=0;
      thread1470(tdone,ends);
      thread1471(tdone,ends);
      int biggest1472 = 0;
      if(ends[6]>=biggest1472){
        biggest1472=ends[6];
      }
      if(ends[7]>=biggest1472){
        biggest1472=ends[7];
      }
      if(biggest1472 == 1){
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S231=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1467(int [] tdone, int [] ends){
        S16=1;
    dosUnitValveExtend.setPresent();//sysj/LiquidFiller_controller.sysj line: 32, column: 7
    currsigs.addElement(dosUnitValveExtend);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1466(int [] tdone, int [] ends){
        S10=1;
    System.out.println("INJECTOR ON");//sysj/LiquidFiller_controller.sysj line: 25, column: 7
    valveInjectorOnOff.setPresent();//sysj/LiquidFiller_controller.sysj line: 26, column: 7
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1465(int [] tdone, int [] ends){
        S107=1;
    S35=0;
    if(request.getprestatus() || bottleAtPos2.getprestatus() || request_liquid_filler.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 21, column: 12
      System.out.println("BottleAtPos2");//sysj/LiquidFiller_controller.sysj line: 22, column: 5
      thread1466(tdone,ends);
      thread1467(tdone,ends);
      int biggest1468 = 0;
      if(ends[3]>=biggest1468){
        biggest1468=ends[3];
      }
      if(ends[4]>=biggest1468){
        biggest1468=ends[4];
      }
      if(biggest1468 == 1){
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      S35=1;
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
      switch(S1463){
        case 0 : 
          S1463=0;
          break RUN;
        
        case 1 : 
          S1463=2;
          S1463=2;
          class GUI extends Object implements java.lang.Runnable {//sysj/LiquidFiller_controller.sysj line: 9, column: 3
            public void run() {//sysj/LiquidFiller_controller.sysj line: 12, column: 21
              org.compsys704.LiquidFiller.main(null);//sysj/LiquidFiller_controller.sysj line: 13, column: 4
            }
            GUI(){//sysj/LiquidFiller_controller.sysj line: 11, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj/LiquidFiller_controller.sysj line: 16, column: 2
          thread1465(tdone,ends);
          thread1469(tdone,ends);
          thread1473(tdone,ends);
          thread1474(tdone,ends);
          int biggest1475 = 0;
          if(ends[2]>=biggest1475){
            biggest1475=ends[2];
          }
          if(ends[5]>=biggest1475){
            biggest1475=ends[5];
          }
          if(ends[14]>=biggest1475){
            biggest1475=ends[14];
          }
          if(ends[15]>=biggest1475){
            biggest1475=ends[15];
          }
          if(biggest1475 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1476(tdone,ends);
          thread1483(tdone,ends);
          thread1517(tdone,ends);
          thread1518(tdone,ends);
          int biggest1531 = 0;
          if(ends[2]>=biggest1531){
            biggest1531=ends[2];
          }
          if(ends[5]>=biggest1531){
            biggest1531=ends[5];
          }
          if(ends[14]>=biggest1531){
            biggest1531=ends[14];
          }
          if(ends[15]>=biggest1531){
            biggest1531=ends[15];
          }
          if(biggest1531 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1531 == 0){
            S1463=0;
            active[1]=0;
            ends[1]=0;
            S1463=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          request.gethook();
          request_liquid_filler.gethook();
          injector_closed.gethook();
          inlet_closed.gethook();
          extended.gethook();
          retracted.gethook();
          FirstLiquidDone.gethook();
          SecondLiquidDone.gethook();
          ThirdLiquidDone.gethook();
          FourthLiquidDone.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      request.setpreclear();
      request_liquid_filler.setpreclear();
      injector_closed.setpreclear();
      inlet_closed.setpreclear();
      extended.setpreclear();
      retracted.setpreclear();
      FirstLiquidDone.setpreclear();
      SecondLiquidDone.setpreclear();
      ThirdLiquidDone.setpreclear();
      FourthLiquidDone.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      Liquid1On.setpreclear();
      Liquid2On.setpreclear();
      Liquid3On.setpreclear();
      Liquid4On.setpreclear();
      liquid_filler_done.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = request_liquid_filler.getStatus() ? request_liquid_filler.setprepresent() : request_liquid_filler.setpreclear();
      request_liquid_filler.setpreval(request_liquid_filler.getValue());
      request_liquid_filler.setClear();
      dummyint = injector_closed.getStatus() ? injector_closed.setprepresent() : injector_closed.setpreclear();
      injector_closed.setpreval(injector_closed.getValue());
      injector_closed.setClear();
      dummyint = inlet_closed.getStatus() ? inlet_closed.setprepresent() : inlet_closed.setpreclear();
      inlet_closed.setpreval(inlet_closed.getValue());
      inlet_closed.setClear();
      dummyint = extended.getStatus() ? extended.setprepresent() : extended.setpreclear();
      extended.setpreval(extended.getValue());
      extended.setClear();
      dummyint = retracted.getStatus() ? retracted.setprepresent() : retracted.setpreclear();
      retracted.setpreval(retracted.getValue());
      retracted.setClear();
      dummyint = FirstLiquidDone.getStatus() ? FirstLiquidDone.setprepresent() : FirstLiquidDone.setpreclear();
      FirstLiquidDone.setpreval(FirstLiquidDone.getValue());
      FirstLiquidDone.setClear();
      dummyint = SecondLiquidDone.getStatus() ? SecondLiquidDone.setprepresent() : SecondLiquidDone.setpreclear();
      SecondLiquidDone.setpreval(SecondLiquidDone.getValue());
      SecondLiquidDone.setClear();
      dummyint = ThirdLiquidDone.getStatus() ? ThirdLiquidDone.setprepresent() : ThirdLiquidDone.setpreclear();
      ThirdLiquidDone.setpreval(ThirdLiquidDone.getValue());
      ThirdLiquidDone.setClear();
      dummyint = FourthLiquidDone.getStatus() ? FourthLiquidDone.setprepresent() : FourthLiquidDone.setpreclear();
      FourthLiquidDone.setpreval(FourthLiquidDone.getValue());
      FourthLiquidDone.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      Liquid1On.sethook();
      Liquid1On.setClear();
      Liquid2On.sethook();
      Liquid2On.setClear();
      Liquid3On.sethook();
      Liquid3On.setClear();
      Liquid4On.sethook();
      Liquid4On.setClear();
      liquid_filler_done.sethook();
      liquid_filler_done.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        request.gethook();
        request_liquid_filler.gethook();
        injector_closed.gethook();
        inlet_closed.gethook();
        extended.gethook();
        retracted.gethook();
        FirstLiquidDone.gethook();
        SecondLiquidDone.gethook();
        ThirdLiquidDone.gethook();
        FourthLiquidDone.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
