import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal LiquidFillerDone = new Signal("LiquidFillerDone", Signal.INPUT);
  public Signal recipe = new Signal("recipe", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal Liquid1On = new Signal("Liquid1On", Signal.INPUT);
  public Signal Liquid2On = new Signal("Liquid2On", Signal.INPUT);
  public Signal Liquid3On = new Signal("Liquid3On", Signal.INPUT);
  public Signal Liquid4On = new Signal("Liquid4On", Signal.INPUT);
  public Signal Counter = new Signal("Counter", Signal.INPUT);
  public Signal Ready = new Signal("Ready", Signal.OUTPUT);
  public Signal FirstLiquidDone = new Signal("FirstLiquidDone", Signal.OUTPUT);
  public Signal SecondLiquidDone = new Signal("SecondLiquidDone", Signal.OUTPUT);
  public Signal ThirdLiquidDone = new Signal("ThirdLiquidDone", Signal.OUTPUT);
  public Signal FourthLiquidDone = new Signal("FourthLiquidDone", Signal.OUTPUT);
  public Signal FirstLiquidAmountE = new Signal("FirstLiquidAmountE", Signal.OUTPUT);
  public Signal SecondLiquidAmountE = new Signal("SecondLiquidAmountE", Signal.OUTPUT);
  public Signal ThirdLiquidAmountE = new Signal("ThirdLiquidAmountE", Signal.OUTPUT);
  public Signal FourthLiquidAmountE = new Signal("FourthLiquidAmountE", Signal.OUTPUT);
  public Signal Liquid1OnE = new Signal("Liquid1OnE", Signal.OUTPUT);
  public Signal Liquid2OnE = new Signal("Liquid2OnE", Signal.OUTPUT);
  public Signal Liquid3OnE = new Signal("Liquid3OnE", Signal.OUTPUT);
  public Signal Liquid4OnE = new Signal("Liquid4OnE", Signal.OUTPUT);
  public Signal LiquidFillerDoneE = new Signal("LiquidFillerDoneE", Signal.OUTPUT);
  public Signal RemoveE = new Signal("RemoveE", Signal.OUTPUT);
  public Signal TestE = new Signal("TestE", Signal.OUTPUT);
  public output_Channel FirstLiquid_o = new output_Channel();
  public output_Channel SecondLiquid_o = new output_Channel();
  public output_Channel ThirdLiquid_o = new output_Channel();
  public output_Channel FourthLiquid_o = new output_Channel();
  public output_Channel FirstLiquidAmount_o = new output_Channel();
  public output_Channel SecondLiquidAmount_o = new output_Channel();
  public output_Channel ThirdLiquidAmount_o = new output_Channel();
  public output_Channel FourthLiquidAmount_o = new output_Channel();
  public output_Channel LiquidFlow_o = new output_Channel();
  private int S26822 = 1;
  private int S26786 = 1;
  private int S32 = 1;
  private int S5 = 1;
  private int S4795 = 1;
  private int S1619 = 1;
  private int S77 = 1;
  private int S39 = 1;
  private int S34 = 1;
  private int S84 = 1;
  private int S79 = 1;
  private int S172 = 1;
  private int S167 = 1;
  private int S304 = 1;
  private int S299 = 1;
  private int S480 = 1;
  private int S475 = 1;
  private int S700 = 1;
  private int S695 = 1;
  private int S964 = 1;
  private int S959 = 1;
  private int S1272 = 1;
  private int S1267 = 1;
  private int S26784 = 1;
  private int S12124 = 1;
  private int S5042 = 1;
  private int S4798 = 1;
  private int S4826 = 1;
  private int S4804 = 1;
  private int S4810 = 1;
  private int S4829 = 1;
  private int S4853 = 1;
  private int S5067 = 1;
  private int S5045 = 1;
  private int S5051 = 1;
  private int S5070 = 1;
  private int S5094 = 1;
  private int S5787 = 1;
  private int S5765 = 1;
  private int S5771 = 1;
  private int S5790 = 1;
  private int S5814 = 1;
  private int S7467 = 1;
  private int S7445 = 1;
  private int S7451 = 1;
  private int S7470 = 1;
  private int S7494 = 1;
  private int S26820 = 1;
  private int S26794 = 1;
  private int S26802 = 1;
  private int S26810 = 1;
  private int S26818 = 1;
  
  private int[] ends = new int[35];
  private int[] tdone = new int[35];
  
  public void thread47716(int [] tdone, int [] ends){
        switch(S26818){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(Liquid4On.getprestatus()){//sysj/controller.sysj line: 543, column: 26
          Liquid4OnE.setPresent();//sysj/controller.sysj line: 543, column: 37
          currsigs.addElement(Liquid4OnE);
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

  public void thread47715(int [] tdone, int [] ends){
        switch(S26810){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(Liquid3On.getprestatus()){//sysj/controller.sysj line: 541, column: 26
          Liquid3OnE.setPresent();//sysj/controller.sysj line: 541, column: 37
          currsigs.addElement(Liquid3OnE);
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

  public void thread47714(int [] tdone, int [] ends){
        switch(S26802){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(Liquid2On.getprestatus()){//sysj/controller.sysj line: 539, column: 26
          Liquid2OnE.setPresent();//sysj/controller.sysj line: 539, column: 37
          currsigs.addElement(Liquid2OnE);
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

  public void thread47713(int [] tdone, int [] ends){
        switch(S26794){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(Liquid1On.getprestatus()){//sysj/controller.sysj line: 537, column: 26
          Liquid1OnE.setPresent();//sysj/controller.sysj line: 537, column: 37
          currsigs.addElement(Liquid1OnE);
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

  public void thread47712(int [] tdone, int [] ends){
        switch(S26820){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread47713(tdone,ends);
        thread47714(tdone,ends);
        thread47715(tdone,ends);
        thread47716(tdone,ends);
        int biggest47717 = 0;
        if(ends[7]>=biggest47717){
          biggest47717=ends[7];
        }
        if(ends[8]>=biggest47717){
          biggest47717=ends[8];
        }
        if(ends[9]>=biggest47717){
          biggest47717=ends[9];
        }
        if(ends[10]>=biggest47717){
          biggest47717=ends[10];
        }
        if(biggest47717 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest47717 == 0){
          S26820=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread47710(int [] tdone, int [] ends){
        switch(S26784){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S12124){
          case 0 : 
            switch(S5042){
              case 0 : 
                switch(S4798){
                  case 0 : 
                    if(enable.getprestatus()){//sysj/controller.sysj line: 371, column: 15
                      Ready.setPresent();//sysj/controller.sysj line: 372, column: 9
                      currsigs.addElement(Ready);
                      System.out.println("Emit Read");//sysj/controller.sysj line: 373, column: 9
                      S4798=1;
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
                    if(!enable.getprestatus()){//sysj/controller.sysj line: 374, column: 15
                      S5042=1;
                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 377, column: 12
                        S4826=0;
                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 380, column: 17
                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 381, column: 10
                          S4804=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S4826=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 388, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 389, column: 10
                            S4810=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S4826=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 396, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 397, column: 10
                              S4829=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S4826=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 404, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 405, column: 10
                                S4853=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5042=2;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 414, column: 12
                                  S5067=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 415, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 416, column: 10
                                    S5045=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5067=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 423, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 424, column: 10
                                      S5051=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5067=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                                        S5070=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5067=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                                          S5094=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5042=3;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                            S5787=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                              S5765=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5787=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                                S5771=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S5787=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                                  S5790=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S5787=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                                    S5814=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S5042=4;
                                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                                      S7467=0;
                                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                                        S7445=0;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7467=1;
                                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                          S7451=0;
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                        else {
                                                          S7467=2;
                                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                            S7470=0;
                                                            active[5]=1;
                                                            ends[5]=1;
                                                            tdone[5]=1;
                                                          }
                                                          else {
                                                            S7467=3;
                                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                              S7494=0;
                                                              active[5]=1;
                                                              ends[5]=1;
                                                              tdone[5]=1;
                                                            }
                                                            else {
                                                              S7467=4;
                                                              RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                              currsigs.addElement(RemoveE);
                                                              active[5]=1;
                                                              ends[5]=1;
                                                              tdone[5]=1;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S12124=1;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S5042=4;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                              S7467=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                                S7445=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                  S7451=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                    S7470=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7467=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                      S7494=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7467=4;
                                                      RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                      currsigs.addElement(RemoveE);
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S12124=1;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S5042=3;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                    S5787=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                      S5765=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5787=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                        S5771=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5787=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                          S5790=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5787=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                            S5814=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5042=4;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                              S7467=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                                S7445=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                  S7451=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                    S7470=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7467=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                      S7494=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7467=4;
                                                      RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                      currsigs.addElement(RemoveE);
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S12124=1;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S5042=4;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                      S7467=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                        S7445=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                          S7451=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                            S7470=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                              S7494=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=4;
                                              RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                              currsigs.addElement(RemoveE);
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S12124=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      else {
                        S5042=2;
                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 414, column: 12
                          S5067=0;
                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 415, column: 17
                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 416, column: 10
                            S5045=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5067=1;
                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 423, column: 17
                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 424, column: 10
                              S5051=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5067=2;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                                S5070=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5067=3;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                                  S5094=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5042=3;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                    S5787=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                      S5765=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5787=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                        S5771=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5787=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                          S5790=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5787=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                            S5814=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5042=4;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                              S7467=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                                S7445=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                  S7451=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                    S7470=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7467=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                      S7494=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7467=4;
                                                      RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                      currsigs.addElement(RemoveE);
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S12124=1;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S5042=4;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                      S7467=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                        S7445=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                          S7451=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                            S7470=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                              S7494=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=4;
                                              RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                              currsigs.addElement(RemoveE);
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S12124=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          S5042=3;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                            S5787=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                              S5765=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5787=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                S5771=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5787=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                  S5790=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5787=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                    S5814=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5042=4;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                      S7467=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                        S7445=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                          S7451=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                            S7470=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                              S7494=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=4;
                                              RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                              currsigs.addElement(RemoveE);
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S12124=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            S5042=4;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                              S7467=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                S7445=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7467=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                  S7451=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                    S7470=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                      S7494=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=4;
                                      RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                      currsigs.addElement(RemoveE);
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S12124=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S4826){
                  case 0 : 
                    switch(S4804){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 382, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 383, column: 10
                          currsigs.addElement(FirstLiquidDone);
                          S4804=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 384, column: 16
                          S4826=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 388, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 389, column: 10
                            S4810=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S4826=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 396, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 397, column: 10
                              S4829=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S4826=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 404, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 405, column: 10
                                S4853=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5042=2;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 414, column: 12
                                  S5067=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 415, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 416, column: 10
                                    S5045=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5067=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 423, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 424, column: 10
                                      S5051=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5067=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                                        S5070=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5067=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                                          S5094=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5042=3;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                            S5787=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                              S5765=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5787=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                                S5771=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S5787=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                                  S5790=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S5787=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                                    S5814=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S5042=4;
                                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                                      S7467=0;
                                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                                        S7445=0;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7467=1;
                                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                          S7451=0;
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                        else {
                                                          S7467=2;
                                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                            S7470=0;
                                                            active[5]=1;
                                                            ends[5]=1;
                                                            tdone[5]=1;
                                                          }
                                                          else {
                                                            S7467=3;
                                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                              S7494=0;
                                                              active[5]=1;
                                                              ends[5]=1;
                                                              tdone[5]=1;
                                                            }
                                                            else {
                                                              S7467=4;
                                                              RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                              currsigs.addElement(RemoveE);
                                                              active[5]=1;
                                                              ends[5]=1;
                                                              tdone[5]=1;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S12124=1;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S5042=4;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                              S7467=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                                S7445=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                  S7451=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                    S7470=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7467=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                      S7494=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7467=4;
                                                      RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                      currsigs.addElement(RemoveE);
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S12124=1;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S5042=3;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                    S5787=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                      S5765=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5787=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                        S5771=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5787=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                          S5790=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5787=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                            S5814=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5042=4;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                              S7467=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                                S7445=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                  S7451=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                    S7470=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7467=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                      S7494=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7467=4;
                                                      RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                      currsigs.addElement(RemoveE);
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S12124=1;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S5042=4;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                      S7467=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                        S7445=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                          S7451=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                            S7470=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                              S7494=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=4;
                                              RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                              currsigs.addElement(RemoveE);
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S12124=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    switch(S4810){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 390, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 391, column: 10
                          currsigs.addElement(FirstLiquidDone);
                          S4810=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 392, column: 16
                          S4826=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 396, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 397, column: 10
                            S4829=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S4826=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 404, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 405, column: 10
                              S4853=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5042=2;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 414, column: 12
                                S5067=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 415, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 416, column: 10
                                  S5045=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5067=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 423, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 424, column: 10
                                    S5051=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5067=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                                      S5070=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5067=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                                        S5094=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5042=3;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                          S5787=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                            S5765=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5787=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                              S5771=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5787=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                                S5790=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S5787=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                                  S5814=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S5042=4;
                                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                                    S7467=0;
                                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                                      S7445=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7467=1;
                                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                        S7451=0;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7467=2;
                                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                          S7470=0;
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                        else {
                                                          S7467=3;
                                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                            S7494=0;
                                                            active[5]=1;
                                                            ends[5]=1;
                                                            tdone[5]=1;
                                                          }
                                                          else {
                                                            S7467=4;
                                                            RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                            currsigs.addElement(RemoveE);
                                                            active[5]=1;
                                                            ends[5]=1;
                                                            tdone[5]=1;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S12124=1;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S5042=4;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                            S7467=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                              S7445=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                S7451=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                  S7470=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                    S7494=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7467=4;
                                                    RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                    currsigs.addElement(RemoveE);
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S12124=1;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S5042=3;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                  S5787=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                    S5765=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5787=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                      S5771=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5787=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                        S5790=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5787=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                          S5814=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5042=4;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                            S7467=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                              S7445=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                S7451=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                  S7470=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                    S7494=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7467=4;
                                                    RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                    currsigs.addElement(RemoveE);
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S12124=1;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S5042=4;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                    S7467=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                      S7445=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                        S7451=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                          S7470=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                            S7494=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=4;
                                            RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                            currsigs.addElement(RemoveE);
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S12124=1;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 2 : 
                    switch(S4829){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 398, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 399, column: 10
                          currsigs.addElement(FirstLiquidDone);
                          S4829=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 400, column: 16
                          S4826=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 404, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 405, column: 10
                            S4853=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5042=2;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 414, column: 12
                              S5067=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 415, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 416, column: 10
                                S5045=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5067=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 423, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 424, column: 10
                                  S5051=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5067=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                                    S5070=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5067=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                                      S5094=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5042=3;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                        S5787=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                          S5765=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5787=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                            S5771=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5787=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                              S5790=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5787=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                                S5814=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S5042=4;
                                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                                  S7467=0;
                                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                                    S7445=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7467=1;
                                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                      S7451=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7467=2;
                                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                        S7470=0;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7467=3;
                                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                          S7494=0;
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                        else {
                                                          S7467=4;
                                                          RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                          currsigs.addElement(RemoveE);
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S12124=1;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S5042=4;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                          S7467=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                            S7445=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                              S7451=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                S7470=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                  S7494=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=4;
                                                  RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                  currsigs.addElement(RemoveE);
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S12124=1;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S5042=3;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                S5787=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                  S5765=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5787=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                    S5771=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5787=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                      S5790=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5787=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                        S5814=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5042=4;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                          S7467=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                            S7445=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                              S7451=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                S7470=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                  S7494=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=4;
                                                  RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                  currsigs.addElement(RemoveE);
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S12124=1;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S5042=4;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                  S7467=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                    S7445=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                      S7451=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                        S7470=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                          S7494=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=4;
                                          RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                          currsigs.addElement(RemoveE);
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S12124=1;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 3 : 
                    switch(S4853){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 406, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 407, column: 10
                          currsigs.addElement(FirstLiquidDone);
                          S4853=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 408, column: 16
                          S5042=2;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 414, column: 12
                            S5067=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 415, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 416, column: 10
                              S5045=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5067=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 423, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 424, column: 10
                                S5051=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5067=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                                  S5070=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5067=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                                    S5094=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5042=3;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                      S5787=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                        S5765=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5787=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                          S5771=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5787=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                            S5790=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5787=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                              S5814=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5042=4;
                                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                                S7467=0;
                                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                                  S7445=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=1;
                                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                    S7451=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7467=2;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                      S7470=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7467=3;
                                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                        S7494=0;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7467=4;
                                                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                        currsigs.addElement(RemoveE);
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S12124=1;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S5042=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                        S7467=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                          S7445=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                            S7451=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                              S7470=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                S7494=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=4;
                                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                currsigs.addElement(RemoveE);
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S12124=1;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            S5042=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                              S5787=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                S5765=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5787=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                  S5771=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5787=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                    S5790=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5787=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                      S5814=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5042=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                        S7467=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                          S7445=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                            S7451=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                              S7470=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                S7494=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=4;
                                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                currsigs.addElement(RemoveE);
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S12124=1;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S5042=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                S7467=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                  S7445=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                    S7451=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                      S7470=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                        S7494=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=4;
                                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                        currsigs.addElement(RemoveE);
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S12124=1;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
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
                break;
              
              case 2 : 
                switch(S5067){
                  case 0 : 
                    switch(S5045){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 417, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 418, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S5045=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 419, column: 16
                          S5067=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 423, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 424, column: 10
                            S5051=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5067=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                              S5070=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5067=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                                S5094=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5042=3;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                  S5787=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                    S5765=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5787=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                      S5771=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5787=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                        S5790=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5787=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                          S5814=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5042=4;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                            S7467=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                              S7445=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                S7451=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                  S7470=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                    S7494=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7467=4;
                                                    RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                    currsigs.addElement(RemoveE);
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S12124=1;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S5042=4;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                    S7467=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                      S7445=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                        S7451=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                          S7470=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                            S7494=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=4;
                                            RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                            currsigs.addElement(RemoveE);
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S12124=1;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    switch(S5051){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 425, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 426, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S5051=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 427, column: 16
                          S5067=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                            S5070=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5067=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                              S5094=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5042=3;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                S5787=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                  S5765=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5787=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                    S5771=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5787=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                      S5790=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5787=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                        S5814=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5042=4;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                          S7467=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                            S7445=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                              S7451=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                S7470=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                  S7494=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=4;
                                                  RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                  currsigs.addElement(RemoveE);
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S12124=1;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S5042=4;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                  S7467=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                    S7445=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                      S7451=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                        S7470=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                          S7494=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=4;
                                          RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                          currsigs.addElement(RemoveE);
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S12124=1;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 2 : 
                    switch(S5070){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 433, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 434, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S5070=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 435, column: 16
                          S5067=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                            S5094=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5042=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                              S5787=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                S5765=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5787=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                  S5771=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5787=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                    S5790=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5787=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                      S5814=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5042=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                        S7467=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                          S7445=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                            S7451=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                              S7470=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                S7494=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=4;
                                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                currsigs.addElement(RemoveE);
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S12124=1;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S5042=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                S7467=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                  S7445=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                    S7451=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                      S7470=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                        S7494=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=4;
                                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                        currsigs.addElement(RemoveE);
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S12124=1;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 3 : 
                    switch(S5094){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 441, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 442, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S5094=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 443, column: 16
                          S5042=3;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                            S5787=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                              S5765=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5787=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                S5771=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5787=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                  S5790=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5787=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                    S5814=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5042=4;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                      S7467=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                        S7445=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                          S7451=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                            S7470=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                              S7494=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=4;
                                              RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                              currsigs.addElement(RemoveE);
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S12124=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            S5042=4;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                              S7467=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                S7445=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7467=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                  S7451=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                    S7470=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                      S7494=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=4;
                                      RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                      currsigs.addElement(RemoveE);
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S12124=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
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
                break;
              
              case 3 : 
                switch(S5787){
                  case 0 : 
                    switch(S5765){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 452, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 453, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5765=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 454, column: 16
                          S5787=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                            S5771=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5787=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                              S5790=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5787=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                S5814=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5042=4;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                  S7467=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                    S7445=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                      S7451=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                        S7470=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                          S7494=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=4;
                                          RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                          currsigs.addElement(RemoveE);
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S12124=1;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    switch(S5771){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 460, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 461, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5771=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 462, column: 16
                          S5787=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                            S5790=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5787=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                              S5814=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5042=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                S7467=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                  S7445=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                    S7451=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                      S7470=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                        S7494=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=4;
                                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                        currsigs.addElement(RemoveE);
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S12124=1;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 2 : 
                    switch(S5790){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 468, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 469, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5790=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 470, column: 16
                          S5787=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                            S5814=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5042=4;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                              S7467=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                S7445=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7467=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                  S7451=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                    S7470=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                      S7494=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=4;
                                      RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                      currsigs.addElement(RemoveE);
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S12124=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 3 : 
                    switch(S5814){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 476, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 477, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5814=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 478, column: 16
                          S5042=4;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                            S7467=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                              S7445=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7467=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                S7451=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7467=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                  S7470=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                    S7494=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=4;
                                    RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                    currsigs.addElement(RemoveE);
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                }
                              }
                            }
                          }
                          else {
                            S12124=1;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
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
                break;
              
              case 4 : 
                switch(S7467){
                  case 0 : 
                    switch(S7445){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 486, column: 16
                          FourthLiquidDone.setPresent();//sysj/controller.sysj line: 487, column: 10
                          currsigs.addElement(FourthLiquidDone);
                          S7445=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 488, column: 16
                          S7467=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                            S7451=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7467=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                              S7470=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7467=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                S7494=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7467=4;
                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                currsigs.addElement(RemoveE);
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    switch(S7451){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 494, column: 16
                          FourthLiquidDone.setPresent();//sysj/controller.sysj line: 495, column: 10
                          currsigs.addElement(FourthLiquidDone);
                          S7451=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 496, column: 16
                          S7467=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                            S7470=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7467=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                              S7494=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7467=4;
                              RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                              currsigs.addElement(RemoveE);
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 2 : 
                    switch(S7470){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 502, column: 16
                          FourthLiquidDone.setPresent();//sysj/controller.sysj line: 503, column: 10
                          currsigs.addElement(FourthLiquidDone);
                          S7470=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 504, column: 16
                          S7467=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                            S7494=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7467=4;
                            RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                            currsigs.addElement(RemoveE);
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                  case 3 : 
                    switch(S7494){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 510, column: 16
                          FourthLiquidDone.setPresent();//sysj/controller.sysj line: 511, column: 10
                          currsigs.addElement(FourthLiquidDone);
                          S7494=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 512, column: 16
                          S7467=4;
                          RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                          currsigs.addElement(RemoveE);
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
                    break;
                  
                  case 4 : 
                    if(enable.getprestatus()){//sysj/controller.sysj line: 515, column: 15
                      S12124=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                      currsigs.addElement(RemoveE);
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S12124=1;
            S12124=0;
            if(Counter.getprestatus()){//sysj/controller.sysj line: 367, column: 15
              S5042=0;
              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 1){//sysj/controller.sysj line: 369, column: 12
                System.out.println("Counter 0");//sysj/controller.sysj line: 370, column: 9
                S4798=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S5042=1;
                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 377, column: 12
                  S4826=0;
                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 380, column: 17
                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 381, column: 10
                    S4804=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S4826=1;
                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 388, column: 17
                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 389, column: 10
                      S4810=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S4826=2;
                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 396, column: 17
                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 397, column: 10
                        S4829=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S4826=3;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 404, column: 17
                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 405, column: 10
                          S4853=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5042=2;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 414, column: 12
                            S5067=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 415, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 416, column: 10
                              S5045=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5067=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 423, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 424, column: 10
                                S5051=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5067=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                                  S5070=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5067=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                                    S5094=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5042=3;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                                      S5787=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                        S5765=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5787=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                          S5771=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5787=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                            S5790=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5787=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                              S5814=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5042=4;
                                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                                S7467=0;
                                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                                  S7445=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7467=1;
                                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                                    S7451=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7467=2;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                                      S7470=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7467=3;
                                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                        S7494=0;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7467=4;
                                                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                        currsigs.addElement(RemoveE);
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S12124=1;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S5042=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                        S7467=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                          S7445=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                            S7451=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                              S7470=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                S7494=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=4;
                                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                currsigs.addElement(RemoveE);
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S12124=1;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            S5042=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                              S5787=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                S5765=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5787=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                  S5771=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5787=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                    S5790=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5787=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                      S5814=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5042=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                        S7467=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                          S7445=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                            S7451=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                              S7470=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                S7494=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=4;
                                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                currsigs.addElement(RemoveE);
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S12124=1;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S5042=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                S7467=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                  S7445=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                    S7451=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                      S7470=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                        S7494=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=4;
                                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                        currsigs.addElement(RemoveE);
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S12124=1;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  S5042=2;
                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 414, column: 12
                    S5067=0;
                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 415, column: 17
                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 416, column: 10
                      S5045=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S5067=1;
                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 423, column: 17
                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 424, column: 10
                        S5051=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5067=2;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                          S5070=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5067=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                            S5094=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5042=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                              S5787=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                S5765=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5787=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                  S5771=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5787=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                    S5790=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5787=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                      S5814=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5042=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                        S7467=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                          S7445=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                            S7451=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                              S7470=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                S7494=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=4;
                                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                currsigs.addElement(RemoveE);
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S12124=1;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S5042=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                S7467=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                  S7445=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                    S7451=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                      S7470=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                        S7494=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=4;
                                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                        currsigs.addElement(RemoveE);
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S12124=1;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  else {
                    S5042=3;
                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                      S5787=0;
                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                        S5765=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5787=1;
                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                          S5771=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5787=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                            S5790=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5787=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                              S5814=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5042=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                S7467=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                  S7445=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                    S7451=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                      S7470=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                        S7494=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=4;
                                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                        currsigs.addElement(RemoveE);
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S12124=1;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      S5042=4;
                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                        S7467=0;
                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                          S7445=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S7467=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                            S7451=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7467=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                              S7470=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7467=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                S7494=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7467=4;
                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                currsigs.addElement(RemoveE);
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                      else {
                        S12124=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                  }
                }
              }
            }
            else {
              S12124=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47709(int [] tdone, int [] ends){
        switch(S4795){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1619){
          case 0 : 
            switch(S77){
              case 0 : 
                switch(S39){
                  case 0 : 
                    if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 345, column: 8
                      FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 345, column: 8
                      S39=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S34){
                        case 0 : 
                          if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 345, column: 8
                            FirstLiquid_o.setVal(3);//sysj/controller.sysj line: 345, column: 8
                            S34=1;
                            if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 345, column: 8
                              FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 345, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 345, column: 8
                              S77=1;
                              S84=0;
                              if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 346, column: 8
                                FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                                S84=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S79=0;
                                if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                                  FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 346, column: 8
                                  S79=1;
                                  if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                                    FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 346, column: 8
                                    S77=2;
                                    S172=0;
                                    if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 347, column: 8
                                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                                      S172=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S167=0;
                                      if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                        SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 347, column: 8
                                        S167=1;
                                        if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                          SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 347, column: 8
                                          S77=3;
                                          S304=0;
                                          if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                            S304=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S299=0;
                                            if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                              SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                                              S299=1;
                                              if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                                SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 348, column: 8
                                                S77=4;
                                                S480=0;
                                                if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                                  S480=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S475=0;
                                                  if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                                    ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                                    S475=1;
                                                    if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 349, column: 8
                                                      S77=5;
                                                      S700=0;
                                                      if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                        S700=1;
                                                        active[4]=1;
                                                        ends[4]=1;
                                                        tdone[4]=1;
                                                      }
                                                      else {
                                                        S695=0;
                                                        if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                          ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                                          S695=1;
                                                          if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                            ends[4]=2;
                                                            ;//sysj/controller.sysj line: 350, column: 8
                                                            S77=6;
                                                            S964=0;
                                                            if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                              S964=1;
                                                              active[4]=1;
                                                              ends[4]=1;
                                                              tdone[4]=1;
                                                            }
                                                            else {
                                                              S959=0;
                                                              if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                                FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                                                S959=1;
                                                                if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                                  ends[4]=2;
                                                                  ;//sysj/controller.sysj line: 351, column: 8
                                                                  S77=7;
                                                                  S1272=0;
                                                                  if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                                    S1272=1;
                                                                    active[4]=1;
                                                                    ends[4]=1;
                                                                    tdone[4]=1;
                                                                  }
                                                                  else {
                                                                    S1267=0;
                                                                    if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                                      FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                                      S1267=1;
                                                                      if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                                        ends[4]=2;
                                                                        ;//sysj/controller.sysj line: 352, column: 8
                                                                        FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                                        currsigs.addElement(FirstLiquidAmountE);
                                                                        FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                                        SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                                        currsigs.addElement(SecondLiquidAmountE);
                                                                        SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                                        ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                                        currsigs.addElement(ThirdLiquidAmountE);
                                                                        ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                                        FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                                        currsigs.addElement(FourthLiquidAmountE);
                                                                        FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                                        System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                                        S1619=1;
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
                                                                      active[4]=1;
                                                                      ends[4]=1;
                                                                      tdone[4]=1;
                                                                    }
                                                                  }
                                                                }
                                                                else {
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
                                                            }
                                                          }
                                                          else {
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
                                                      }
                                                    }
                                                    else {
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
                                                }
                                              }
                                              else {
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
                                          }
                                        }
                                        else {
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
                                    }
                                  }
                                  else {
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
                              }
                            }
                            else {
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
                        
                        case 1 : 
                          if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 345, column: 8
                            FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 345, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 345, column: 8
                            S77=1;
                            S84=0;
                            if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 346, column: 8
                              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                              S84=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S79=0;
                              if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                                FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 346, column: 8
                                S79=1;
                                if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                                  FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 346, column: 8
                                  S77=2;
                                  S172=0;
                                  if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 347, column: 8
                                    SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                                    S172=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S167=0;
                                    if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                      SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 347, column: 8
                                      S167=1;
                                      if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                        SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 347, column: 8
                                        S77=3;
                                        S304=0;
                                        if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                          S304=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S299=0;
                                          if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                            SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                                            S299=1;
                                            if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 348, column: 8
                                              S77=4;
                                              S480=0;
                                              if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                                S480=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S475=0;
                                                if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                                  ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                                  S475=1;
                                                  if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 349, column: 8
                                                    S77=5;
                                                    S700=0;
                                                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                      S700=1;
                                                      active[4]=1;
                                                      ends[4]=1;
                                                      tdone[4]=1;
                                                    }
                                                    else {
                                                      S695=0;
                                                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                        ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                                        S695=1;
                                                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                          ends[4]=2;
                                                          ;//sysj/controller.sysj line: 350, column: 8
                                                          S77=6;
                                                          S964=0;
                                                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                            S964=1;
                                                            active[4]=1;
                                                            ends[4]=1;
                                                            tdone[4]=1;
                                                          }
                                                          else {
                                                            S959=0;
                                                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                                              S959=1;
                                                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                                ends[4]=2;
                                                                ;//sysj/controller.sysj line: 351, column: 8
                                                                S77=7;
                                                                S1272=0;
                                                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                                  S1272=1;
                                                                  active[4]=1;
                                                                  ends[4]=1;
                                                                  tdone[4]=1;
                                                                }
                                                                else {
                                                                  S1267=0;
                                                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                                    FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                                    S1267=1;
                                                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                                      ends[4]=2;
                                                                      ;//sysj/controller.sysj line: 352, column: 8
                                                                      FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                                      currsigs.addElement(FirstLiquidAmountE);
                                                                      FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                                      SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                                      currsigs.addElement(SecondLiquidAmountE);
                                                                      SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                                      ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                                      currsigs.addElement(ThirdLiquidAmountE);
                                                                      ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                                      FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                                      currsigs.addElement(FourthLiquidAmountE);
                                                                      FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                                      S1619=1;
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
                                                                    active[4]=1;
                                                                    ends[4]=1;
                                                                    tdone[4]=1;
                                                                  }
                                                                }
                                                              }
                                                              else {
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
                                                          }
                                                        }
                                                        else {
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
                                                    }
                                                  }
                                                  else {
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
                                              }
                                            }
                                            else {
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
                                        }
                                      }
                                      else {
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
                                  }
                                }
                                else {
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
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S39=1;
                    S39=0;
                    if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 345, column: 8
                      FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 345, column: 8
                      S39=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S34=0;
                      if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 345, column: 8
                        FirstLiquid_o.setVal(3);//sysj/controller.sysj line: 345, column: 8
                        S34=1;
                        if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 345, column: 8
                          FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 345, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 345, column: 8
                          S77=1;
                          S84=0;
                          if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 346, column: 8
                            FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                            S84=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S79=0;
                            if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                              FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 346, column: 8
                              S79=1;
                              if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                                FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 346, column: 8
                                S77=2;
                                S172=0;
                                if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 347, column: 8
                                  SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                                  S172=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S167=0;
                                  if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                    SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 347, column: 8
                                    S167=1;
                                    if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 347, column: 8
                                      S77=3;
                                      S304=0;
                                      if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                                        SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                        S304=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S299=0;
                                        if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                          SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                                          S299=1;
                                          if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 348, column: 8
                                            S77=4;
                                            S480=0;
                                            if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                              S480=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S475=0;
                                              if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                                ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                                S475=1;
                                                if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 349, column: 8
                                                  S77=5;
                                                  S700=0;
                                                  if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                    S700=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S695=0;
                                                    if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                      ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                                      S695=1;
                                                      if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 350, column: 8
                                                        S77=6;
                                                        S964=0;
                                                        if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                          S964=1;
                                                          active[4]=1;
                                                          ends[4]=1;
                                                          tdone[4]=1;
                                                        }
                                                        else {
                                                          S959=0;
                                                          if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                            FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                                            S959=1;
                                                            if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                              ends[4]=2;
                                                              ;//sysj/controller.sysj line: 351, column: 8
                                                              S77=7;
                                                              S1272=0;
                                                              if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                                S1272=1;
                                                                active[4]=1;
                                                                ends[4]=1;
                                                                tdone[4]=1;
                                                              }
                                                              else {
                                                                S1267=0;
                                                                if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                                  FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                                  S1267=1;
                                                                  if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                                    ends[4]=2;
                                                                    ;//sysj/controller.sysj line: 352, column: 8
                                                                    FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                                    currsigs.addElement(FirstLiquidAmountE);
                                                                    FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                                    SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                                    currsigs.addElement(SecondLiquidAmountE);
                                                                    SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                                    ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                                    currsigs.addElement(ThirdLiquidAmountE);
                                                                    ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                                    FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                                    currsigs.addElement(FourthLiquidAmountE);
                                                                    FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                                    System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                                    S1619=1;
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
                                                                  active[4]=1;
                                                                  ends[4]=1;
                                                                  tdone[4]=1;
                                                                }
                                                              }
                                                            }
                                                            else {
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
                                                        }
                                                      }
                                                      else {
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
                                                  }
                                                }
                                                else {
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
                                            }
                                          }
                                          else {
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
                                      }
                                    }
                                    else {
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
                                }
                              }
                              else {
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
                          }
                        }
                        else {
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
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S84){
                  case 0 : 
                    if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 346, column: 8
                      FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                      S84=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S79){
                        case 0 : 
                          if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                            FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 346, column: 8
                            S79=1;
                            if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 346, column: 8
                              S77=2;
                              S172=0;
                              if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 347, column: 8
                                SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                                S172=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S167=0;
                                if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                  SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 347, column: 8
                                  S167=1;
                                  if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                    SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 347, column: 8
                                    S77=3;
                                    S304=0;
                                    if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                      S304=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S299=0;
                                      if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                        SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                                        S299=1;
                                        if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 348, column: 8
                                          S77=4;
                                          S480=0;
                                          if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                            S480=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S475=0;
                                            if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                              ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                              S475=1;
                                              if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 349, column: 8
                                                S77=5;
                                                S700=0;
                                                if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                  S700=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S695=0;
                                                  if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                    ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                                    S695=1;
                                                    if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 350, column: 8
                                                      S77=6;
                                                      S964=0;
                                                      if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                        S964=1;
                                                        active[4]=1;
                                                        ends[4]=1;
                                                        tdone[4]=1;
                                                      }
                                                      else {
                                                        S959=0;
                                                        if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                          FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                                          S959=1;
                                                          if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                            ends[4]=2;
                                                            ;//sysj/controller.sysj line: 351, column: 8
                                                            S77=7;
                                                            S1272=0;
                                                            if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                              S1272=1;
                                                              active[4]=1;
                                                              ends[4]=1;
                                                              tdone[4]=1;
                                                            }
                                                            else {
                                                              S1267=0;
                                                              if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                                FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                                S1267=1;
                                                                if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                                  ends[4]=2;
                                                                  ;//sysj/controller.sysj line: 352, column: 8
                                                                  FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                                  currsigs.addElement(FirstLiquidAmountE);
                                                                  FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                                  SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                                  currsigs.addElement(SecondLiquidAmountE);
                                                                  SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                                  ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                                  currsigs.addElement(ThirdLiquidAmountE);
                                                                  ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                                  FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                                  currsigs.addElement(FourthLiquidAmountE);
                                                                  FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                                  S1619=1;
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
                                                                active[4]=1;
                                                                ends[4]=1;
                                                                tdone[4]=1;
                                                              }
                                                            }
                                                          }
                                                          else {
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
                                                      }
                                                    }
                                                    else {
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
                                                }
                                              }
                                              else {
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
                                          }
                                        }
                                        else {
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
                                    }
                                  }
                                  else {
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
                              }
                            }
                            else {
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
                        
                        case 1 : 
                          if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                            FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 346, column: 8
                            S77=2;
                            S172=0;
                            if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 347, column: 8
                              SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                              S172=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S167=0;
                              if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 347, column: 8
                                S167=1;
                                if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                  SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 347, column: 8
                                  S77=3;
                                  S304=0;
                                  if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                                    SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                    S304=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S299=0;
                                    if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                      SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                                      S299=1;
                                      if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                        SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 348, column: 8
                                        S77=4;
                                        S480=0;
                                        if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                          ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                          S480=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S475=0;
                                          if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                            ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                            S475=1;
                                            if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 349, column: 8
                                              S77=5;
                                              S700=0;
                                              if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                S700=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S695=0;
                                                if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                  ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                                  S695=1;
                                                  if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 350, column: 8
                                                    S77=6;
                                                    S964=0;
                                                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                      S964=1;
                                                      active[4]=1;
                                                      ends[4]=1;
                                                      tdone[4]=1;
                                                    }
                                                    else {
                                                      S959=0;
                                                      if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                        FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                                        S959=1;
                                                        if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                          ends[4]=2;
                                                          ;//sysj/controller.sysj line: 351, column: 8
                                                          S77=7;
                                                          S1272=0;
                                                          if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                            S1272=1;
                                                            active[4]=1;
                                                            ends[4]=1;
                                                            tdone[4]=1;
                                                          }
                                                          else {
                                                            S1267=0;
                                                            if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                              FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                              S1267=1;
                                                              if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                                ends[4]=2;
                                                                ;//sysj/controller.sysj line: 352, column: 8
                                                                FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                                currsigs.addElement(FirstLiquidAmountE);
                                                                FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                                SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                                currsigs.addElement(SecondLiquidAmountE);
                                                                SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                                ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                                currsigs.addElement(ThirdLiquidAmountE);
                                                                ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                                FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                                currsigs.addElement(FourthLiquidAmountE);
                                                                FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                                System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                                S1619=1;
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
                                                              active[4]=1;
                                                              ends[4]=1;
                                                              tdone[4]=1;
                                                            }
                                                          }
                                                        }
                                                        else {
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
                                                    }
                                                  }
                                                  else {
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
                                              }
                                            }
                                            else {
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
                                        }
                                      }
                                      else {
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
                                  }
                                }
                                else {
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
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S84=1;
                    S84=0;
                    if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 346, column: 8
                      FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                      S84=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S79=0;
                      if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                        FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 346, column: 8
                        S79=1;
                        if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                          FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 346, column: 8
                          S77=2;
                          S172=0;
                          if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 347, column: 8
                            SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                            S172=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S167=0;
                            if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                              SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 347, column: 8
                              S167=1;
                              if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 347, column: 8
                                S77=3;
                                S304=0;
                                if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                                  SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                  S304=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S299=0;
                                  if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                    SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                                    S299=1;
                                    if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 348, column: 8
                                      S77=4;
                                      S480=0;
                                      if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                        ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                        S480=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S475=0;
                                        if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                          ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                          S475=1;
                                          if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 349, column: 8
                                            S77=5;
                                            S700=0;
                                            if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                              S700=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S695=0;
                                              if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                                S695=1;
                                                if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 350, column: 8
                                                  S77=6;
                                                  S964=0;
                                                  if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                    S964=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S959=0;
                                                    if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                      FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                                      S959=1;
                                                      if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 351, column: 8
                                                        S77=7;
                                                        S1272=0;
                                                        if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                          S1272=1;
                                                          active[4]=1;
                                                          ends[4]=1;
                                                          tdone[4]=1;
                                                        }
                                                        else {
                                                          S1267=0;
                                                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                            FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                            S1267=1;
                                                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                              ends[4]=2;
                                                              ;//sysj/controller.sysj line: 352, column: 8
                                                              FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                              currsigs.addElement(FirstLiquidAmountE);
                                                              FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                              SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                              currsigs.addElement(SecondLiquidAmountE);
                                                              SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                              ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                              currsigs.addElement(ThirdLiquidAmountE);
                                                              ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                              FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                              currsigs.addElement(FourthLiquidAmountE);
                                                              FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                              S1619=1;
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
                                                            active[4]=1;
                                                            ends[4]=1;
                                                            tdone[4]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
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
                                                  }
                                                }
                                                else {
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
                                            }
                                          }
                                          else {
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
                                      }
                                    }
                                    else {
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
                                }
                              }
                              else {
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
                          }
                        }
                        else {
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
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                switch(S172){
                  case 0 : 
                    if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 347, column: 8
                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                      S172=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S167){
                        case 0 : 
                          if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                            SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 347, column: 8
                            S167=1;
                            if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                              SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 347, column: 8
                              S77=3;
                              S304=0;
                              if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                                SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                S304=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S299=0;
                                if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                  SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                                  S299=1;
                                  if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                    SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 348, column: 8
                                    S77=4;
                                    S480=0;
                                    if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                      S480=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S475=0;
                                      if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                        ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                        S475=1;
                                        if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                          ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 349, column: 8
                                          S77=5;
                                          S700=0;
                                          if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                            S700=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S695=0;
                                            if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                              ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                              S695=1;
                                              if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 350, column: 8
                                                S77=6;
                                                S964=0;
                                                if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                  S964=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S959=0;
                                                  if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                    FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                                    S959=1;
                                                    if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 351, column: 8
                                                      S77=7;
                                                      S1272=0;
                                                      if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                        S1272=1;
                                                        active[4]=1;
                                                        ends[4]=1;
                                                        tdone[4]=1;
                                                      }
                                                      else {
                                                        S1267=0;
                                                        if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                          FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                          S1267=1;
                                                          if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                            ends[4]=2;
                                                            ;//sysj/controller.sysj line: 352, column: 8
                                                            FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                            currsigs.addElement(FirstLiquidAmountE);
                                                            FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                            SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                            currsigs.addElement(SecondLiquidAmountE);
                                                            SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                            ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                            currsigs.addElement(ThirdLiquidAmountE);
                                                            ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                            FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                            currsigs.addElement(FourthLiquidAmountE);
                                                            FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                            System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                            S1619=1;
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
                                                          active[4]=1;
                                                          ends[4]=1;
                                                          tdone[4]=1;
                                                        }
                                                      }
                                                    }
                                                    else {
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
                                                }
                                              }
                                              else {
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
                                          }
                                        }
                                        else {
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
                                    }
                                  }
                                  else {
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
                              }
                            }
                            else {
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
                        
                        case 1 : 
                          if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                            SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 347, column: 8
                            S77=3;
                            S304=0;
                            if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                              S304=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S299=0;
                              if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                                S299=1;
                                if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                  SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 348, column: 8
                                  S77=4;
                                  S480=0;
                                  if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                    S480=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S475=0;
                                    if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                      ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                      S475=1;
                                      if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                        ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 349, column: 8
                                        S77=5;
                                        S700=0;
                                        if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                          S700=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S695=0;
                                          if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                            ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                            S695=1;
                                            if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 350, column: 8
                                              S77=6;
                                              S964=0;
                                              if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                S964=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S959=0;
                                                if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                  FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                                  S959=1;
                                                  if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 351, column: 8
                                                    S77=7;
                                                    S1272=0;
                                                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                      S1272=1;
                                                      active[4]=1;
                                                      ends[4]=1;
                                                      tdone[4]=1;
                                                    }
                                                    else {
                                                      S1267=0;
                                                      if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                        FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                        S1267=1;
                                                        if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                          ends[4]=2;
                                                          ;//sysj/controller.sysj line: 352, column: 8
                                                          FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                          currsigs.addElement(FirstLiquidAmountE);
                                                          FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                          SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                          currsigs.addElement(SecondLiquidAmountE);
                                                          SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                          ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                          currsigs.addElement(ThirdLiquidAmountE);
                                                          ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                          FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                          currsigs.addElement(FourthLiquidAmountE);
                                                          FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                          System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                          S1619=1;
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
                                                        active[4]=1;
                                                        ends[4]=1;
                                                        tdone[4]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
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
                                              }
                                            }
                                            else {
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
                                        }
                                      }
                                      else {
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
                                  }
                                }
                                else {
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
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S172=1;
                    S172=0;
                    if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 347, column: 8
                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                      S172=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S167=0;
                      if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                        SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 347, column: 8
                        S167=1;
                        if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                          SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 347, column: 8
                          S77=3;
                          S304=0;
                          if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                            S304=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S299=0;
                            if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                              SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                              S299=1;
                              if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 348, column: 8
                                S77=4;
                                S480=0;
                                if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                  S480=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S475=0;
                                  if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                    ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                    S475=1;
                                    if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 349, column: 8
                                      S77=5;
                                      S700=0;
                                      if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                        S700=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S695=0;
                                        if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                          ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                          S695=1;
                                          if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 350, column: 8
                                            S77=6;
                                            S964=0;
                                            if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                              S964=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S959=0;
                                              if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                                S959=1;
                                                if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 351, column: 8
                                                  S77=7;
                                                  S1272=0;
                                                  if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                    S1272=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S1267=0;
                                                    if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                      FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                      S1267=1;
                                                      if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 352, column: 8
                                                        FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                        currsigs.addElement(FirstLiquidAmountE);
                                                        FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                        SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                        currsigs.addElement(SecondLiquidAmountE);
                                                        SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                        ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                        currsigs.addElement(ThirdLiquidAmountE);
                                                        ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                        FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                        currsigs.addElement(FourthLiquidAmountE);
                                                        FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                        System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                        S1619=1;
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
                                                      active[4]=1;
                                                      ends[4]=1;
                                                      tdone[4]=1;
                                                    }
                                                  }
                                                }
                                                else {
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
                                            }
                                          }
                                          else {
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
                                      }
                                    }
                                    else {
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
                                }
                              }
                              else {
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
                          }
                        }
                        else {
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
                    }
                    break;
                  
                }
                break;
              
              case 3 : 
                switch(S304){
                  case 0 : 
                    if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                      S304=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S299){
                        case 0 : 
                          if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                            SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                            S299=1;
                            if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 348, column: 8
                              S77=4;
                              S480=0;
                              if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                S480=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S475=0;
                                if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                  ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                  S475=1;
                                  if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 349, column: 8
                                    S77=5;
                                    S700=0;
                                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                      S700=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S695=0;
                                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                        ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                        S695=1;
                                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 350, column: 8
                                          S77=6;
                                          S964=0;
                                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                            S964=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S959=0;
                                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                              S959=1;
                                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 351, column: 8
                                                S77=7;
                                                S1272=0;
                                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                  S1272=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S1267=0;
                                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                    FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                    S1267=1;
                                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 352, column: 8
                                                      FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                      currsigs.addElement(FirstLiquidAmountE);
                                                      FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                      SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                      currsigs.addElement(SecondLiquidAmountE);
                                                      SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                      ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                      currsigs.addElement(ThirdLiquidAmountE);
                                                      ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                      FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                      currsigs.addElement(FourthLiquidAmountE);
                                                      FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                      S1619=1;
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
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                }
                                              }
                                              else {
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
                                          }
                                        }
                                        else {
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
                                    }
                                  }
                                  else {
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
                              }
                            }
                            else {
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
                        
                        case 1 : 
                          if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 348, column: 8
                            S77=4;
                            S480=0;
                            if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                              S480=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S475=0;
                              if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                S475=1;
                                if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 349, column: 8
                                  S77=5;
                                  S700=0;
                                  if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                    S700=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S695=0;
                                    if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                      ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                      S695=1;
                                      if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 350, column: 8
                                        S77=6;
                                        S964=0;
                                        if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                          S964=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S959=0;
                                          if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                            FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                            S959=1;
                                            if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 351, column: 8
                                              S77=7;
                                              S1272=0;
                                              if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                S1272=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S1267=0;
                                                if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                  FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                  S1267=1;
                                                  if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 352, column: 8
                                                    FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                    currsigs.addElement(FirstLiquidAmountE);
                                                    FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                    SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                    currsigs.addElement(SecondLiquidAmountE);
                                                    SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                    ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                    currsigs.addElement(ThirdLiquidAmountE);
                                                    ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                    FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                    currsigs.addElement(FourthLiquidAmountE);
                                                    FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                    System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                    S1619=1;
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
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                              }
                                            }
                                            else {
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
                                        }
                                      }
                                      else {
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
                                  }
                                }
                                else {
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
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S304=1;
                    S304=0;
                    if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                      S304=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S299=0;
                      if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                        SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                        S299=1;
                        if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 348, column: 8
                          S77=4;
                          S480=0;
                          if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                            S480=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S475=0;
                            if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                              ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                              S475=1;
                              if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 349, column: 8
                                S77=5;
                                S700=0;
                                if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                  S700=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S695=0;
                                  if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                    ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                    S695=1;
                                    if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 350, column: 8
                                      S77=6;
                                      S964=0;
                                      if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                        S964=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S959=0;
                                        if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                          FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                          S959=1;
                                          if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 351, column: 8
                                            S77=7;
                                            S1272=0;
                                            if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                              S1272=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S1267=0;
                                              if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                S1267=1;
                                                if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 352, column: 8
                                                  FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                  currsigs.addElement(FirstLiquidAmountE);
                                                  FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                  SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                  currsigs.addElement(SecondLiquidAmountE);
                                                  SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                  ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                  currsigs.addElement(ThirdLiquidAmountE);
                                                  ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                  FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                  currsigs.addElement(FourthLiquidAmountE);
                                                  FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                  S1619=1;
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
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                            }
                                          }
                                          else {
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
                                      }
                                    }
                                    else {
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
                                }
                              }
                              else {
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
                          }
                        }
                        else {
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
                    }
                    break;
                  
                }
                break;
              
              case 4 : 
                switch(S480){
                  case 0 : 
                    if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                      S480=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S475){
                        case 0 : 
                          if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                            ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                            S475=1;
                            if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 349, column: 8
                              S77=5;
                              S700=0;
                              if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                S700=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S695=0;
                                if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                  ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                  S695=1;
                                  if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 350, column: 8
                                    S77=6;
                                    S964=0;
                                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                      S964=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S959=0;
                                      if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                        FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                        S959=1;
                                        if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 351, column: 8
                                          S77=7;
                                          S1272=0;
                                          if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                            S1272=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S1267=0;
                                            if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                              FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                              S1267=1;
                                              if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 352, column: 8
                                                FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                currsigs.addElement(FirstLiquidAmountE);
                                                FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                currsigs.addElement(SecondLiquidAmountE);
                                                SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                currsigs.addElement(ThirdLiquidAmountE);
                                                ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                currsigs.addElement(FourthLiquidAmountE);
                                                FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                S1619=1;
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
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                          }
                                        }
                                        else {
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
                                    }
                                  }
                                  else {
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
                              }
                            }
                            else {
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
                        
                        case 1 : 
                          if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 349, column: 8
                            S77=5;
                            S700=0;
                            if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                              S700=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S695=0;
                              if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                S695=1;
                                if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 350, column: 8
                                  S77=6;
                                  S964=0;
                                  if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                    S964=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S959=0;
                                    if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                      FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                      S959=1;
                                      if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 351, column: 8
                                        S77=7;
                                        S1272=0;
                                        if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                          S1272=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S1267=0;
                                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                            FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                            S1267=1;
                                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 352, column: 8
                                              FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                              currsigs.addElement(FirstLiquidAmountE);
                                              FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                              SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                              currsigs.addElement(SecondLiquidAmountE);
                                              SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                              ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                              currsigs.addElement(ThirdLiquidAmountE);
                                              ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                              FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                              currsigs.addElement(FourthLiquidAmountE);
                                              FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                              S1619=1;
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
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                        }
                                      }
                                      else {
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
                                  }
                                }
                                else {
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
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S480=1;
                    S480=0;
                    if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                      S480=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S475=0;
                      if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                        ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                        S475=1;
                        if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                          ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 349, column: 8
                          S77=5;
                          S700=0;
                          if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                            S700=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S695=0;
                            if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                              ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                              S695=1;
                              if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 350, column: 8
                                S77=6;
                                S964=0;
                                if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                  S964=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S959=0;
                                  if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                    FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                    S959=1;
                                    if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 351, column: 8
                                      S77=7;
                                      S1272=0;
                                      if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                        S1272=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S1267=0;
                                        if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                          FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                          S1267=1;
                                          if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 352, column: 8
                                            FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                            currsigs.addElement(FirstLiquidAmountE);
                                            FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                            SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                            currsigs.addElement(SecondLiquidAmountE);
                                            SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                            ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                            currsigs.addElement(ThirdLiquidAmountE);
                                            ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                            FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                            currsigs.addElement(FourthLiquidAmountE);
                                            FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                            System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                            S1619=1;
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
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                      }
                                    }
                                    else {
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
                                }
                              }
                              else {
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
                          }
                        }
                        else {
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
                    }
                    break;
                  
                }
                break;
              
              case 5 : 
                switch(S700){
                  case 0 : 
                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                      S700=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S695){
                        case 0 : 
                          if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                            ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                            S695=1;
                            if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 350, column: 8
                              S77=6;
                              S964=0;
                              if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                S964=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S959=0;
                                if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                  FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                  S959=1;
                                  if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 351, column: 8
                                    S77=7;
                                    S1272=0;
                                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                      S1272=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S1267=0;
                                      if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                        FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                        S1267=1;
                                        if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 352, column: 8
                                          FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                          currsigs.addElement(FirstLiquidAmountE);
                                          FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                          SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                          currsigs.addElement(SecondLiquidAmountE);
                                          SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                          ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                          currsigs.addElement(ThirdLiquidAmountE);
                                          ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                          FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                          currsigs.addElement(FourthLiquidAmountE);
                                          FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                          System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                          S1619=1;
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
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                    }
                                  }
                                  else {
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
                              }
                            }
                            else {
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
                        
                        case 1 : 
                          if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 350, column: 8
                            S77=6;
                            S964=0;
                            if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                              S964=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S959=0;
                              if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                S959=1;
                                if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 351, column: 8
                                  S77=7;
                                  S1272=0;
                                  if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                    S1272=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S1267=0;
                                    if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                      FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                      S1267=1;
                                      if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 352, column: 8
                                        FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                        currsigs.addElement(FirstLiquidAmountE);
                                        FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                        SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                        currsigs.addElement(SecondLiquidAmountE);
                                        SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                        ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                        currsigs.addElement(ThirdLiquidAmountE);
                                        ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                        FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                        currsigs.addElement(FourthLiquidAmountE);
                                        FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                        System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                        S1619=1;
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
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                  }
                                }
                                else {
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
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S700=1;
                    S700=0;
                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                      S700=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S695=0;
                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                        ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                        S695=1;
                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 350, column: 8
                          S77=6;
                          S964=0;
                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                            S964=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S959=0;
                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                              S959=1;
                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 351, column: 8
                                S77=7;
                                S1272=0;
                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                  S1272=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S1267=0;
                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                    FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                    S1267=1;
                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 352, column: 8
                                      FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                      currsigs.addElement(FirstLiquidAmountE);
                                      FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                      SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                      currsigs.addElement(SecondLiquidAmountE);
                                      SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                      ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                      currsigs.addElement(ThirdLiquidAmountE);
                                      ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                      FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                      currsigs.addElement(FourthLiquidAmountE);
                                      FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                      S1619=1;
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
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                }
                              }
                              else {
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
                          }
                        }
                        else {
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
                    }
                    break;
                  
                }
                break;
              
              case 6 : 
                switch(S964){
                  case 0 : 
                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                      S964=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S959){
                        case 0 : 
                          if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                            FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                            S959=1;
                            if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 351, column: 8
                              S77=7;
                              S1272=0;
                              if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                S1272=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S1267=0;
                                if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                  FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                  S1267=1;
                                  if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 352, column: 8
                                    FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                    currsigs.addElement(FirstLiquidAmountE);
                                    FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                    SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                    currsigs.addElement(SecondLiquidAmountE);
                                    SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                    ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                    currsigs.addElement(ThirdLiquidAmountE);
                                    ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                    FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                    currsigs.addElement(FourthLiquidAmountE);
                                    FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                    System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                    S1619=1;
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
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                              }
                            }
                            else {
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
                        
                        case 1 : 
                          if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 351, column: 8
                            S77=7;
                            S1272=0;
                            if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                              S1272=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S1267=0;
                              if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                S1267=1;
                                if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 352, column: 8
                                  FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                  currsigs.addElement(FirstLiquidAmountE);
                                  FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                  SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                  currsigs.addElement(SecondLiquidAmountE);
                                  SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                  ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                  currsigs.addElement(ThirdLiquidAmountE);
                                  ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                  FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                  currsigs.addElement(FourthLiquidAmountE);
                                  FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                  S1619=1;
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
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                            }
                          }
                          else {
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S964=1;
                    S964=0;
                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                      S964=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S959=0;
                      if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                        FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                        S959=1;
                        if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 351, column: 8
                          S77=7;
                          S1272=0;
                          if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                            S1272=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S1267=0;
                            if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                              FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                              S1267=1;
                              if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 352, column: 8
                                FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                currsigs.addElement(FirstLiquidAmountE);
                                FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                currsigs.addElement(SecondLiquidAmountE);
                                SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                currsigs.addElement(ThirdLiquidAmountE);
                                ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                currsigs.addElement(FourthLiquidAmountE);
                                FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                S1619=1;
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
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                          }
                        }
                        else {
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
                    }
                    break;
                  
                }
                break;
              
              case 7 : 
                switch(S1272){
                  case 0 : 
                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                      S1272=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S1267){
                        case 0 : 
                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                            FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                            S1267=1;
                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 352, column: 8
                              FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                              currsigs.addElement(FirstLiquidAmountE);
                              FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                              SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                              currsigs.addElement(SecondLiquidAmountE);
                              SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                              ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                              currsigs.addElement(ThirdLiquidAmountE);
                              ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                              FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                              currsigs.addElement(FourthLiquidAmountE);
                              FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                              S1619=1;
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
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 352, column: 8
                            FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                            currsigs.addElement(FirstLiquidAmountE);
                            FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                            SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                            currsigs.addElement(SecondLiquidAmountE);
                            SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                            ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                            currsigs.addElement(ThirdLiquidAmountE);
                            ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                            FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                            currsigs.addElement(FourthLiquidAmountE);
                            FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                            System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                            S1619=1;
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
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S1272=1;
                    S1272=0;
                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                      S1272=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S1267=0;
                      if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                        FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                        S1267=1;
                        if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 352, column: 8
                          FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                          currsigs.addElement(FirstLiquidAmountE);
                          FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                          SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                          currsigs.addElement(SecondLiquidAmountE);
                          SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                          ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                          currsigs.addElement(ThirdLiquidAmountE);
                          ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                          FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                          currsigs.addElement(FourthLiquidAmountE);
                          FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                          System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                          S1619=1;
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
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S1619=1;
            S1619=0;
            if(recipe.getprestatus()){//sysj/controller.sysj line: 342, column: 15
              System.out.println("Plant Send Start");//sysj/controller.sysj line: 343, column: 8
              S77=0;
              S39=0;
              if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 345, column: 8
                FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 345, column: 8
                S39=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S34=0;
                if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 345, column: 8
                  FirstLiquid_o.setVal(3);//sysj/controller.sysj line: 345, column: 8
                  S34=1;
                  if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 345, column: 8
                    FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 345, column: 8
                    ends[4]=2;
                    ;//sysj/controller.sysj line: 345, column: 8
                    S77=1;
                    S84=0;
                    if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 346, column: 8
                      FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                      S84=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S79=0;
                      if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                        FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 346, column: 8
                        S79=1;
                        if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                          FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 346, column: 8
                          S77=2;
                          S172=0;
                          if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 347, column: 8
                            SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                            S172=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S167=0;
                            if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                              SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 347, column: 8
                              S167=1;
                              if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                                SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 347, column: 8
                                S77=3;
                                S304=0;
                                if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                                  SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                  S304=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S299=0;
                                  if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                    SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                                    S299=1;
                                    if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 348, column: 8
                                      S77=4;
                                      S480=0;
                                      if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                        ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                        S480=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S475=0;
                                        if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                          ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                          S475=1;
                                          if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 349, column: 8
                                            S77=5;
                                            S700=0;
                                            if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                              S700=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S695=0;
                                              if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                                S695=1;
                                                if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 350, column: 8
                                                  S77=6;
                                                  S964=0;
                                                  if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                    S964=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S959=0;
                                                    if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                      FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                                      S959=1;
                                                      if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 351, column: 8
                                                        S77=7;
                                                        S1272=0;
                                                        if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                          S1272=1;
                                                          active[4]=1;
                                                          ends[4]=1;
                                                          tdone[4]=1;
                                                        }
                                                        else {
                                                          S1267=0;
                                                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                            FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                            S1267=1;
                                                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                              ends[4]=2;
                                                              ;//sysj/controller.sysj line: 352, column: 8
                                                              FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                              currsigs.addElement(FirstLiquidAmountE);
                                                              FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                              SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                              currsigs.addElement(SecondLiquidAmountE);
                                                              SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                              ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                              currsigs.addElement(ThirdLiquidAmountE);
                                                              ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                              FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                              currsigs.addElement(FourthLiquidAmountE);
                                                              FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                              S1619=1;
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
                                                            active[4]=1;
                                                            ends[4]=1;
                                                            tdone[4]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
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
                                                  }
                                                }
                                                else {
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
                                            }
                                          }
                                          else {
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
                                      }
                                    }
                                    else {
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
                                }
                              }
                              else {
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
                          }
                        }
                        else {
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
                    }
                  }
                  else {
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
              }
            }
            else {
              S1619=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47708(int [] tdone, int [] ends){
        switch(S32){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S5){
          case 0 : 
            S5=0;
            if(LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 324, column: 15
              System.out.println("Complete.");//sysj/controller.sysj line: 326, column: 8
              if(enable.getprestatus()){//sysj/controller.sysj line: 328, column: 15
                if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            else {
              if(enable.getprestatus()){//sysj/controller.sysj line: 328, column: 15
                if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            break;
          
          case 1 : 
            S5=1;
            S5=0;
            if(LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 324, column: 15
              System.out.println("Complete.");//sysj/controller.sysj line: 326, column: 8
              if(enable.getprestatus()){//sysj/controller.sysj line: 328, column: 15
                if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            else {
              if(enable.getprestatus()){//sysj/controller.sysj line: 328, column: 15
                if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S5=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47707(int [] tdone, int [] ends){
        switch(S26786){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread47708(tdone,ends);
        thread47709(tdone,ends);
        thread47710(tdone,ends);
        int biggest47711 = 0;
        if(ends[3]>=biggest47711){
          biggest47711=ends[3];
        }
        if(ends[4]>=biggest47711){
          biggest47711=ends[4];
        }
        if(ends[5]>=biggest47711){
          biggest47711=ends[5];
        }
        if(biggest47711 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest47711 == 0){
          S26786=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread47704(int [] tdone, int [] ends){
        S26818=1;
    if(Liquid4On.getprestatus()){//sysj/controller.sysj line: 543, column: 26
      Liquid4OnE.setPresent();//sysj/controller.sysj line: 543, column: 37
      currsigs.addElement(Liquid4OnE);
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

  public void thread47703(int [] tdone, int [] ends){
        S26810=1;
    if(Liquid3On.getprestatus()){//sysj/controller.sysj line: 541, column: 26
      Liquid3OnE.setPresent();//sysj/controller.sysj line: 541, column: 37
      currsigs.addElement(Liquid3OnE);
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

  public void thread47702(int [] tdone, int [] ends){
        S26802=1;
    if(Liquid2On.getprestatus()){//sysj/controller.sysj line: 539, column: 26
      Liquid2OnE.setPresent();//sysj/controller.sysj line: 539, column: 37
      currsigs.addElement(Liquid2OnE);
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

  public void thread47701(int [] tdone, int [] ends){
        S26794=1;
    if(Liquid1On.getprestatus()){//sysj/controller.sysj line: 537, column: 26
      Liquid1OnE.setPresent();//sysj/controller.sysj line: 537, column: 37
      currsigs.addElement(Liquid1OnE);
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

  public void thread47700(int [] tdone, int [] ends){
        S26820=1;
    thread47701(tdone,ends);
    thread47702(tdone,ends);
    thread47703(tdone,ends);
    thread47704(tdone,ends);
    int biggest47705 = 0;
    if(ends[7]>=biggest47705){
      biggest47705=ends[7];
    }
    if(ends[8]>=biggest47705){
      biggest47705=ends[8];
    }
    if(ends[9]>=biggest47705){
      biggest47705=ends[9];
    }
    if(ends[10]>=biggest47705){
      biggest47705=ends[10];
    }
    if(biggest47705 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread47698(int [] tdone, int [] ends){
        S26784=1;
    S12124=0;
    if(Counter.getprestatus()){//sysj/controller.sysj line: 367, column: 15
      S5042=0;
      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 1){//sysj/controller.sysj line: 369, column: 12
        System.out.println("Counter 0");//sysj/controller.sysj line: 370, column: 9
        S4798=0;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S5042=1;
        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 377, column: 12
          S4826=0;
          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 380, column: 17
            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 381, column: 10
            S4804=0;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
          }
          else {
            S4826=1;
            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 388, column: 17
              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 389, column: 10
              S4810=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S4826=2;
              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 396, column: 17
                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 397, column: 10
                S4829=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S4826=3;
                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 404, column: 17
                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 405, column: 10
                  S4853=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S5042=2;
                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 414, column: 12
                    S5067=0;
                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 415, column: 17
                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 416, column: 10
                      S5045=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S5067=1;
                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 423, column: 17
                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 424, column: 10
                        S5051=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5067=2;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                          S5070=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5067=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                            S5094=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5042=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                              S5787=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                                S5765=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5787=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                                  S5771=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5787=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                                    S5790=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5787=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                                      S5814=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5042=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                        S7467=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                          S7445=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7467=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                            S7451=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7467=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                              S7470=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7467=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                                S7494=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7467=4;
                                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                                currsigs.addElement(RemoveE);
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S12124=1;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S5042=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                S7467=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                  S7445=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                    S7451=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                      S7470=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                        S7494=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=4;
                                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                        currsigs.addElement(RemoveE);
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S12124=1;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  else {
                    S5042=3;
                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                      S5787=0;
                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                        S5765=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5787=1;
                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                          S5771=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5787=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                            S5790=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5787=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                              S5814=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5042=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                S7467=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                  S7445=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                    S7451=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                      S7470=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                        S7494=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=4;
                                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                        currsigs.addElement(RemoveE);
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S12124=1;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      S5042=4;
                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                        S7467=0;
                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                          S7445=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S7467=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                            S7451=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7467=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                              S7470=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7467=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                S7494=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7467=4;
                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                currsigs.addElement(RemoveE);
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                      else {
                        S12124=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        else {
          S5042=2;
          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 414, column: 12
            S5067=0;
            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 415, column: 17
              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 416, column: 10
              S5045=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S5067=1;
              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 423, column: 17
                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 424, column: 10
                S5051=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S5067=2;
                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 431, column: 17
                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 432, column: 10
                  S5070=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S5067=3;
                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 439, column: 17
                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 440, column: 10
                    S5094=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S5042=3;
                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
                      S5787=0;
                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                        S5765=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5787=1;
                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                          S5771=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5787=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                            S5790=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5787=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                              S5814=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5042=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                                S7467=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                                  S7445=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7467=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                                    S7451=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7467=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                                      S7470=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7467=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                        S7494=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7467=4;
                                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                        currsigs.addElement(RemoveE);
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S12124=1;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      S5042=4;
                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                        S7467=0;
                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                          S7445=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S7467=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                            S7451=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7467=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                              S7470=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7467=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                S7494=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7467=4;
                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                currsigs.addElement(RemoveE);
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                      else {
                        S12124=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                  }
                }
              }
            }
          }
          else {
            S5042=3;
            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 449, column: 12
              S5787=0;
              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 450, column: 17
                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 451, column: 10
                S5765=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S5787=1;
                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 458, column: 17
                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 459, column: 10
                  S5771=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S5787=2;
                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 466, column: 17
                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 467, column: 10
                    S5790=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S5787=3;
                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 474, column: 17
                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 475, column: 10
                      S5814=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S5042=4;
                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                        S7467=0;
                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                          S7445=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S7467=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                            S7451=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7467=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                              S7470=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7467=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                                S7494=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7467=4;
                                RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                                currsigs.addElement(RemoveE);
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                      else {
                        S12124=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                  }
                }
              }
            }
            else {
              S5042=4;
              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 483, column: 12
                S7467=0;
                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 484, column: 17
                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 485, column: 10
                  S7445=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S7467=1;
                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 492, column: 17
                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 493, column: 10
                    S7451=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S7467=2;
                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 500, column: 17
                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 501, column: 10
                      S7470=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S7467=3;
                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 508, column: 17
                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 509, column: 10
                        S7494=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S7467=4;
                        RemoveE.setPresent();//sysj/controller.sysj line: 516, column: 10
                        currsigs.addElement(RemoveE);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                  }
                }
              }
              else {
                S12124=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
          }
        }
      }
    }
    else {
      S12124=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread47697(int [] tdone, int [] ends){
        S4795=1;
    S1619=0;
    if(recipe.getprestatus()){//sysj/controller.sysj line: 342, column: 15
      System.out.println("Plant Send Start");//sysj/controller.sysj line: 343, column: 8
      S77=0;
      S39=0;
      if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 345, column: 8
        FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 345, column: 8
        S39=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S34=0;
        if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 345, column: 8
          FirstLiquid_o.setVal(3);//sysj/controller.sysj line: 345, column: 8
          S34=1;
          if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 345, column: 8
            FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 345, column: 8
            ends[4]=2;
            ;//sysj/controller.sysj line: 345, column: 8
            S77=1;
            S84=0;
            if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 346, column: 8
              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
              S84=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S79=0;
              if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 346, column: 8
                S79=1;
                if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 346, column: 8
                  FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 346, column: 8
                  ends[4]=2;
                  ;//sysj/controller.sysj line: 346, column: 8
                  S77=2;
                  S172=0;
                  if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 347, column: 8
                    SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                    S172=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S167=0;
                    if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                      SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 347, column: 8
                      S167=1;
                      if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 347, column: 8
                        SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 347, column: 8
                        ends[4]=2;
                        ;//sysj/controller.sysj line: 347, column: 8
                        S77=3;
                        S304=0;
                        if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 348, column: 8
                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                          S304=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S299=0;
                          if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                            SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 348, column: 8
                            S299=1;
                            if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 348, column: 8
                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 348, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 348, column: 8
                              S77=4;
                              S480=0;
                              if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                S480=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S475=0;
                                if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                  ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 349, column: 8
                                  S475=1;
                                  if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 349, column: 8
                                    S77=5;
                                    S700=0;
                                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                      S700=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S695=0;
                                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                        ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                        S695=1;
                                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 350, column: 8
                                          S77=6;
                                          S964=0;
                                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                            S964=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S959=0;
                                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 351, column: 8
                                              S959=1;
                                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 351, column: 8
                                                S77=7;
                                                S1272=0;
                                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                  S1272=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S1267=0;
                                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                    FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                                    S1267=1;
                                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 352, column: 8
                                                      FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 354, column: 8
                                                      currsigs.addElement(FirstLiquidAmountE);
                                                      FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 354, column: 8
                                                      SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 355, column: 8
                                                      currsigs.addElement(SecondLiquidAmountE);
                                                      SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 355, column: 8
                                                      ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 356, column: 8
                                                      currsigs.addElement(ThirdLiquidAmountE);
                                                      ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 356, column: 8
                                                      FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 357, column: 8
                                                      currsigs.addElement(FourthLiquidAmountE);
                                                      FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 357, column: 8
                                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 359, column: 8
                                                      S1619=1;
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
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                }
                                              }
                                              else {
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
                                          }
                                        }
                                        else {
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
                                    }
                                  }
                                  else {
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
                              }
                            }
                            else {
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
                        }
                      }
                      else {
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
                  }
                }
                else {
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
            }
          }
          else {
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
      }
    }
    else {
      S1619=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread47696(int [] tdone, int [] ends){
        S32=1;
    S5=0;
    if(LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 324, column: 15
      System.out.println("Complete.");//sysj/controller.sysj line: 326, column: 8
      if(enable.getprestatus()){//sysj/controller.sysj line: 328, column: 15
        if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
          S5=1;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          S5=1;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
      else {
        if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
          S5=1;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          S5=1;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
    }
    else {
      if(enable.getprestatus()){//sysj/controller.sysj line: 328, column: 15
        if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
          S5=1;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          S5=1;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
      else {
        if(recipe.getprestatus()){//sysj/controller.sysj line: 332, column: 15
          S5=1;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          S5=1;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
    }
  }

  public void thread47695(int [] tdone, int [] ends){
        S26786=1;
    thread47696(tdone,ends);
    thread47697(tdone,ends);
    thread47698(tdone,ends);
    int biggest47699 = 0;
    if(ends[3]>=biggest47699){
      biggest47699=ends[3];
    }
    if(ends[4]>=biggest47699){
      biggest47699=ends[4];
    }
    if(ends[5]>=biggest47699){
      biggest47699=ends[5];
    }
    if(biggest47699 == 1){
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
      switch(S26822){
        case 0 : 
          S26822=0;
          break RUN;
        
        case 1 : 
          S26822=2;
          S26822=2;
          thread47695(tdone,ends);
          thread47700(tdone,ends);
          int biggest47706 = 0;
          if(ends[2]>=biggest47706){
            biggest47706=ends[2];
          }
          if(ends[6]>=biggest47706){
            biggest47706=ends[6];
          }
          if(biggest47706 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread47707(tdone,ends);
          thread47712(tdone,ends);
          int biggest47718 = 0;
          if(ends[2]>=biggest47718){
            biggest47718=ends[2];
          }
          if(ends[6]>=biggest47718){
            biggest47718=ends[6];
          }
          if(biggest47718 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest47718 == 0){
            S26822=0;
            active[1]=0;
            ends[1]=0;
            S26822=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          FirstLiquid_o.gethook();
          SecondLiquid_o.gethook();
          ThirdLiquid_o.gethook();
          FourthLiquid_o.gethook();
          FirstLiquidAmount_o.gethook();
          SecondLiquidAmount_o.gethook();
          ThirdLiquidAmount_o.gethook();
          FourthLiquidAmount_o.gethook();
          LiquidFlow_o.gethook();
          LiquidFillerDone.gethook();
          recipe.gethook();
          enable.gethook();
          Liquid1On.gethook();
          Liquid2On.gethook();
          Liquid3On.gethook();
          Liquid4On.gethook();
          Counter.gethook();
          df = true;
        }
        runClockDomain();
      }
      LiquidFillerDone.setpreclear();
      recipe.setpreclear();
      enable.setpreclear();
      Liquid1On.setpreclear();
      Liquid2On.setpreclear();
      Liquid3On.setpreclear();
      Liquid4On.setpreclear();
      Counter.setpreclear();
      Ready.setpreclear();
      FirstLiquidDone.setpreclear();
      SecondLiquidDone.setpreclear();
      ThirdLiquidDone.setpreclear();
      FourthLiquidDone.setpreclear();
      FirstLiquidAmountE.setpreclear();
      SecondLiquidAmountE.setpreclear();
      ThirdLiquidAmountE.setpreclear();
      FourthLiquidAmountE.setpreclear();
      Liquid1OnE.setpreclear();
      Liquid2OnE.setpreclear();
      Liquid3OnE.setpreclear();
      Liquid4OnE.setpreclear();
      LiquidFillerDoneE.setpreclear();
      RemoveE.setpreclear();
      TestE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = LiquidFillerDone.getStatus() ? LiquidFillerDone.setprepresent() : LiquidFillerDone.setpreclear();
      LiquidFillerDone.setpreval(LiquidFillerDone.getValue());
      LiquidFillerDone.setClear();
      dummyint = recipe.getStatus() ? recipe.setprepresent() : recipe.setpreclear();
      recipe.setpreval(recipe.getValue());
      recipe.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
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
      dummyint = Counter.getStatus() ? Counter.setprepresent() : Counter.setpreclear();
      Counter.setpreval(Counter.getValue());
      Counter.setClear();
      Ready.sethook();
      Ready.setClear();
      FirstLiquidDone.sethook();
      FirstLiquidDone.setClear();
      SecondLiquidDone.sethook();
      SecondLiquidDone.setClear();
      ThirdLiquidDone.sethook();
      ThirdLiquidDone.setClear();
      FourthLiquidDone.sethook();
      FourthLiquidDone.setClear();
      FirstLiquidAmountE.sethook();
      FirstLiquidAmountE.setClear();
      SecondLiquidAmountE.sethook();
      SecondLiquidAmountE.setClear();
      ThirdLiquidAmountE.sethook();
      ThirdLiquidAmountE.setClear();
      FourthLiquidAmountE.sethook();
      FourthLiquidAmountE.setClear();
      Liquid1OnE.sethook();
      Liquid1OnE.setClear();
      Liquid2OnE.sethook();
      Liquid2OnE.setClear();
      Liquid3OnE.sethook();
      Liquid3OnE.setClear();
      Liquid4OnE.sethook();
      Liquid4OnE.setClear();
      LiquidFillerDoneE.sethook();
      LiquidFillerDoneE.setClear();
      RemoveE.sethook();
      RemoveE.setClear();
      TestE.sethook();
      TestE.setClear();
      FirstLiquid_o.sethook();
      SecondLiquid_o.sethook();
      ThirdLiquid_o.sethook();
      FourthLiquid_o.sethook();
      FirstLiquidAmount_o.sethook();
      SecondLiquidAmount_o.sethook();
      ThirdLiquidAmount_o.sethook();
      FourthLiquidAmount_o.sethook();
      LiquidFlow_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        FirstLiquid_o.gethook();
        SecondLiquid_o.gethook();
        ThirdLiquid_o.gethook();
        FourthLiquid_o.gethook();
        FirstLiquidAmount_o.gethook();
        SecondLiquidAmount_o.gethook();
        ThirdLiquidAmount_o.gethook();
        FourthLiquidAmount_o.gethook();
        LiquidFlow_o.gethook();
        LiquidFillerDone.gethook();
        recipe.gethook();
        enable.gethook();
        Liquid1On.gethook();
        Liquid2On.gethook();
        Liquid3On.gethook();
        Liquid4On.gethook();
        Counter.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
