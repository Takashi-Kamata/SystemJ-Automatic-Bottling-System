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
  public Signal FirstLiquidDone = new Signal("FirstLiquidDone", Signal.OUTPUT);
  public Signal SecondLiquidDone = new Signal("SecondLiquidDone", Signal.OUTPUT);
  public Signal ThirdLiquidDone = new Signal("ThirdLiquidDone", Signal.OUTPUT);
  public Signal FourthLiquidDone = new Signal("FourthLiquidDone", Signal.OUTPUT);
  public Signal Liquid1OnE = new Signal("Liquid1OnE", Signal.OUTPUT);
  public Signal Liquid2OnE = new Signal("Liquid2OnE", Signal.OUTPUT);
  public Signal Liquid3OnE = new Signal("Liquid3OnE", Signal.OUTPUT);
  public Signal Liquid4OnE = new Signal("Liquid4OnE", Signal.OUTPUT);
  public Signal LiquidFillerDoneE = new Signal("LiquidFillerDoneE", Signal.OUTPUT);
  public output_Channel FirstLiquid_o = new output_Channel();
  public output_Channel SecondLiquid_o = new output_Channel();
  public output_Channel ThirdLiquid_o = new output_Channel();
  public output_Channel FourthLiquid_o = new output_Channel();
  public output_Channel FirstLiquidAmount_o = new output_Channel();
  public output_Channel SecondLiquidAmount_o = new output_Channel();
  public output_Channel ThirdLiquidAmount_o = new output_Channel();
  public output_Channel FourthLiquidAmount_o = new output_Channel();
  public output_Channel LiquidFlow_o = new output_Channel();
  private int S19732 = 1;
  private int S19688 = 1;
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
  private int S19686 = 1;
  private int S9758 = 1;
  private int S5436 = 1;
  private int S4820 = 1;
  private int S4798 = 1;
  private int S4804 = 1;
  private int S4823 = 1;
  private int S4847 = 1;
  private int S4900 = 1;
  private int S4878 = 1;
  private int S4884 = 1;
  private int S4903 = 1;
  private int S4927 = 1;
  private int S5461 = 1;
  private int S5439 = 1;
  private int S5445 = 1;
  private int S5464 = 1;
  private int S5488 = 1;
  private int S6821 = 1;
  private int S6799 = 1;
  private int S6805 = 1;
  private int S6824 = 1;
  private int S6848 = 1;
  private int S19730 = 1;
  private int S19696 = 1;
  private int S19704 = 1;
  private int S19712 = 1;
  private int S19720 = 1;
  private int S19728 = 1;
  
  private int[] ends = new int[36];
  private int[] tdone = new int[36];
  
  public void thread37676(int [] tdone, int [] ends){
        switch(S19728){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 514, column: 26
          LiquidFillerDoneE.setPresent();//sysj/controller.sysj line: 514, column: 44
          currsigs.addElement(LiquidFillerDoneE);
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

  public void thread37675(int [] tdone, int [] ends){
        switch(S19720){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(Liquid4On.getprestatus()){//sysj/controller.sysj line: 512, column: 26
          Liquid4OnE.setPresent();//sysj/controller.sysj line: 512, column: 37
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

  public void thread37674(int [] tdone, int [] ends){
        switch(S19712){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(Liquid3On.getprestatus()){//sysj/controller.sysj line: 510, column: 26
          Liquid3OnE.setPresent();//sysj/controller.sysj line: 510, column: 37
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

  public void thread37673(int [] tdone, int [] ends){
        switch(S19704){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(Liquid2On.getprestatus()){//sysj/controller.sysj line: 508, column: 26
          Liquid2OnE.setPresent();//sysj/controller.sysj line: 508, column: 37
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

  public void thread37672(int [] tdone, int [] ends){
        switch(S19696){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(Liquid1On.getprestatus()){//sysj/controller.sysj line: 506, column: 26
          Liquid1OnE.setPresent();//sysj/controller.sysj line: 506, column: 37
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

  public void thread37671(int [] tdone, int [] ends){
        switch(S19730){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread37672(tdone,ends);
        thread37673(tdone,ends);
        thread37674(tdone,ends);
        thread37675(tdone,ends);
        thread37676(tdone,ends);
        int biggest37677 = 0;
        if(ends[7]>=biggest37677){
          biggest37677=ends[7];
        }
        if(ends[8]>=biggest37677){
          biggest37677=ends[8];
        }
        if(ends[9]>=biggest37677){
          biggest37677=ends[9];
        }
        if(ends[10]>=biggest37677){
          biggest37677=ends[10];
        }
        if(ends[11]>=biggest37677){
          biggest37677=ends[11];
        }
        if(biggest37677 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest37677 == 0){
          S19730=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread37669(int [] tdone, int [] ends){
        switch(S19686){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S9758){
          case 0 : 
            switch(S5436){
              case 0 : 
                switch(S4820){
                  case 0 : 
                    switch(S4798){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 354, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 355, column: 10
                          currsigs.addElement(FirstLiquidDone);
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 356, column: 16
                          S4820=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 360, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 361, column: 10
                            S4804=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S4820=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 368, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 369, column: 10
                              S4823=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S4820=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 376, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 377, column: 10
                                S4847=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5436=1;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 386, column: 12
                                  S4900=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 387, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 388, column: 10
                                    S4878=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S4900=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 395, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 396, column: 10
                                      S4884=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S4900=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 403, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 404, column: 10
                                        S4903=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S4900=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 411, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 412, column: 10
                                          S4927=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5436=2;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                                            S5461=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                              S5439=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5461=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                                S5445=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S5461=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                                  S5464=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S5461=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                                    S5488=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S5436=3;
                                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                                      S6821=0;
                                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                                        S6799=0;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S6821=1;
                                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                                          S6805=0;
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                        else {
                                                          S6821=2;
                                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                            S6824=0;
                                                            active[5]=1;
                                                            ends[5]=1;
                                                            tdone[5]=1;
                                                          }
                                                          else {
                                                            S6821=3;
                                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                              S6848=0;
                                                              active[5]=1;
                                                              ends[5]=1;
                                                              tdone[5]=1;
                                                            }
                                                            else {
                                                              S9758=1;
                                                              active[5]=1;
                                                              ends[5]=1;
                                                              tdone[5]=1;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S9758=1;
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
                                            S5436=3;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                              S6821=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                                S6799=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S6821=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                                  S6805=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S6821=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                    S6824=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S6821=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                      S6848=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S9758=1;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S9758=1;
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
                                  S5436=2;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                                    S5461=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                      S5439=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5461=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                        S5445=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5461=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                          S5464=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5461=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                            S5488=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5436=3;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                              S6821=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                                S6799=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S6821=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                                  S6805=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S6821=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                    S6824=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S6821=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                      S6848=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S9758=1;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S9758=1;
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
                                    S5436=3;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                      S6821=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                        S6799=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S6821=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                          S6805=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S6821=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                            S6824=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                              S6848=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S9758=1;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S9758=1;
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
                    switch(S4804){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 362, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 363, column: 10
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 364, column: 16
                          S4820=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 368, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 369, column: 10
                            S4823=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S4820=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 376, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 377, column: 10
                              S4847=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5436=1;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 386, column: 12
                                S4900=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 387, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 388, column: 10
                                  S4878=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S4900=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 395, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 396, column: 10
                                    S4884=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S4900=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 403, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 404, column: 10
                                      S4903=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S4900=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 411, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 412, column: 10
                                        S4927=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5436=2;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                                          S5461=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                            S5439=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5461=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                              S5445=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5461=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                                S5464=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S5461=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                                  S5488=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S5436=3;
                                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                                    S6821=0;
                                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                                      S6799=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S6821=1;
                                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                                        S6805=0;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S6821=2;
                                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                          S6824=0;
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                        else {
                                                          S6821=3;
                                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                            S6848=0;
                                                            active[5]=1;
                                                            ends[5]=1;
                                                            tdone[5]=1;
                                                          }
                                                          else {
                                                            S9758=1;
                                                            active[5]=1;
                                                            ends[5]=1;
                                                            tdone[5]=1;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S9758=1;
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
                                          S5436=3;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                            S6821=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                              S6799=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S6821=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                                S6805=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S6821=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                  S6824=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S6821=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                    S6848=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S9758=1;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S9758=1;
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
                                S5436=2;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                                  S5461=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                    S5439=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5461=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                      S5445=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5461=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                        S5464=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5461=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                          S5488=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5436=3;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                            S6821=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                              S6799=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S6821=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                                S6805=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S6821=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                  S6824=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S6821=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                    S6848=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S9758=1;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S9758=1;
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
                                  S5436=3;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                    S6821=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                      S6799=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S6821=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                        S6805=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S6821=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                          S6824=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S6821=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                            S6848=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S9758=1;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S9758=1;
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
                    switch(S4823){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 370, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 371, column: 10
                          currsigs.addElement(FirstLiquidDone);
                          S4823=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 372, column: 16
                          S4820=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 376, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 377, column: 10
                            S4847=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5436=1;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 386, column: 12
                              S4900=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 387, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 388, column: 10
                                S4878=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S4900=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 395, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 396, column: 10
                                  S4884=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S4900=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 403, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 404, column: 10
                                    S4903=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S4900=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 411, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 412, column: 10
                                      S4927=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5436=2;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                                        S5461=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                          S5439=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5461=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                            S5445=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5461=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                              S5464=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5461=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                                S5488=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S5436=3;
                                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                                  S6821=0;
                                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                                    S6799=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S6821=1;
                                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                                      S6805=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S6821=2;
                                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                        S6824=0;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S6821=3;
                                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                          S6848=0;
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                        else {
                                                          S9758=1;
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S9758=1;
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
                                        S5436=3;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                          S6821=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                            S6799=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                              S6805=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S6821=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                S6824=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S6821=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                  S6848=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S9758=1;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S9758=1;
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
                              S5436=2;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                                S5461=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                  S5439=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5461=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                    S5445=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5461=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                      S5464=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5461=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                        S5488=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5436=3;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                          S6821=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                            S6799=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                              S6805=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S6821=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                S6824=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S6821=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                  S6848=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S9758=1;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S9758=1;
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
                                S5436=3;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                  S6821=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                    S6799=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                      S6805=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S6821=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                        S6824=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S6821=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                          S6848=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S9758=1;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S9758=1;
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
                    switch(S4847){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 378, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 379, column: 10
                          currsigs.addElement(FirstLiquidDone);
                          S4847=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 380, column: 16
                          S5436=1;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 386, column: 12
                            S4900=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 387, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 388, column: 10
                              S4878=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S4900=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 395, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 396, column: 10
                                S4884=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S4900=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 403, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 404, column: 10
                                  S4903=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S4900=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 411, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 412, column: 10
                                    S4927=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5436=2;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                                      S5461=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                        S5439=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5461=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                          S5445=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5461=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                            S5464=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5461=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                              S5488=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5436=3;
                                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                                S6821=0;
                                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                                  S6799=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S6821=1;
                                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                                    S6805=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S6821=2;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                      S6824=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S6821=3;
                                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                        S6848=0;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S9758=1;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S9758=1;
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
                                      S5436=3;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                        S6821=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                          S6799=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S6821=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                            S6805=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                              S6824=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S6821=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                S6848=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S9758=1;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S9758=1;
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
                            S5436=2;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                              S5461=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                S5439=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5461=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                  S5445=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5461=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                    S5464=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5461=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                      S5488=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5436=3;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                        S6821=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                          S6799=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S6821=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                            S6805=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                              S6824=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S6821=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                S6848=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S9758=1;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S9758=1;
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
                              S5436=3;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                S6821=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                  S6799=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                    S6805=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                      S6824=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S6821=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                        S6848=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S9758=1;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S9758=1;
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
              
              case 1 : 
                switch(S4900){
                  case 0 : 
                    switch(S4878){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 389, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 390, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S4878=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 391, column: 16
                          S4900=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 395, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 396, column: 10
                            S4884=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S4900=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 403, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 404, column: 10
                              S4903=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S4900=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 411, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 412, column: 10
                                S4927=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5436=2;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                                  S5461=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                    S5439=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5461=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                      S5445=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5461=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                        S5464=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5461=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                          S5488=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5436=3;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                            S6821=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                              S6799=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S6821=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                                S6805=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S6821=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                  S6824=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S6821=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                    S6848=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S9758=1;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S9758=1;
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
                                  S5436=3;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                    S6821=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                      S6799=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S6821=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                        S6805=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S6821=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                          S6824=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S6821=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                            S6848=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S9758=1;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S9758=1;
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
                    switch(S4884){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 397, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 398, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S4884=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 399, column: 16
                          S4900=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 403, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 404, column: 10
                            S4903=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S4900=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 411, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 412, column: 10
                              S4927=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5436=2;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                                S5461=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                  S5439=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5461=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                    S5445=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5461=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                      S5464=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5461=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                        S5488=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5436=3;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                          S6821=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                            S6799=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                              S6805=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S6821=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                S6824=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S6821=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                  S6848=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S9758=1;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S9758=1;
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
                                S5436=3;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                  S6821=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                    S6799=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                      S6805=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S6821=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                        S6824=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S6821=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                          S6848=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S9758=1;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S9758=1;
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
                    switch(S4903){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 405, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 406, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S4903=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 407, column: 16
                          S4900=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 411, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 412, column: 10
                            S4927=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5436=2;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                              S5461=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                S5439=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5461=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                  S5445=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5461=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                    S5464=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5461=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                      S5488=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5436=3;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                        S6821=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                          S6799=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S6821=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                            S6805=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                              S6824=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S6821=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                S6848=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S9758=1;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S9758=1;
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
                              S5436=3;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                S6821=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                  S6799=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                    S6805=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                      S6824=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S6821=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                        S6848=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S9758=1;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S9758=1;
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
                    switch(S4927){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 413, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 414, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S4927=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 415, column: 16
                          S5436=2;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                            S5461=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                              S5439=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5461=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                S5445=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5461=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                  S5464=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5461=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                    S5488=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5436=3;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                      S6821=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                        S6799=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S6821=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                          S6805=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S6821=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                            S6824=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                              S6848=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S9758=1;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S9758=1;
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
                            S5436=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                              S6821=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                S6799=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S6821=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                  S6805=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                    S6824=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                      S6848=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S9758=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S9758=1;
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
              
              case 2 : 
                switch(S5461){
                  case 0 : 
                    switch(S5439){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 424, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 425, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5439=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 426, column: 16
                          S5461=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                            S5445=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5461=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                              S5464=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5461=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                S5488=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5436=3;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                  S6821=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                    S6799=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                      S6805=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S6821=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                        S6824=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S6821=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                          S6848=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S9758=1;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S9758=1;
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
                    switch(S5445){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 432, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 433, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5445=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 434, column: 16
                          S5461=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                            S5464=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5461=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                              S5488=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5436=3;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                S6821=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                  S6799=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                    S6805=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                      S6824=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S6821=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                        S6848=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S9758=1;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S9758=1;
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
                    switch(S5464){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 440, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 441, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5464=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 442, column: 16
                          S5461=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                            S5488=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5436=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                              S6821=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                S6799=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S6821=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                  S6805=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                    S6824=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                      S6848=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S9758=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S9758=1;
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
                    switch(S5488){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 448, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 449, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5488=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 450, column: 16
                          S5436=3;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                            S6821=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                              S6799=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S6821=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                S6805=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S6821=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                  S6824=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                    S6848=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S9758=1;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                }
                              }
                            }
                          }
                          else {
                            S9758=1;
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
              
              case 3 : 
                switch(S6821){
                  case 0 : 
                    switch(S6799){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 459, column: 16
                          FourthLiquidDone.setPresent();//sysj/controller.sysj line: 460, column: 10
                          currsigs.addElement(FourthLiquidDone);
                          S6799=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 461, column: 16
                          S6821=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                            S6805=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S6821=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                              S6824=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S6821=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                S6848=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S9758=1;
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
                    switch(S6805){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 467, column: 16
                          FourthLiquidDone.setPresent();//sysj/controller.sysj line: 468, column: 10
                          currsigs.addElement(FourthLiquidDone);
                          S6805=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 469, column: 16
                          S6821=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                            S6824=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S6821=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                              S6848=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S9758=1;
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
                    switch(S6824){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 475, column: 16
                          FourthLiquidDone.setPresent();//sysj/controller.sysj line: 476, column: 10
                          currsigs.addElement(FourthLiquidDone);
                          S6824=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 477, column: 16
                          S6821=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                            S6848=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S9758=1;
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
                    switch(S6848){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 483, column: 16
                          FourthLiquidDone.setPresent();//sysj/controller.sysj line: 484, column: 10
                          currsigs.addElement(FourthLiquidDone);
                          S6848=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 485, column: 16
                          S9758=1;
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
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S9758=1;
            S9758=0;
            if(Counter.getprestatus()){//sysj/controller.sysj line: 350, column: 15
              S5436=0;
              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 1){//sysj/controller.sysj line: 351, column: 12
                S4820=0;
                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 352, column: 17
                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 353, column: 10
                  S4798=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S4820=1;
                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 360, column: 17
                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 361, column: 10
                    S4804=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S4820=2;
                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 368, column: 17
                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 369, column: 10
                      S4823=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S4820=3;
                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 376, column: 17
                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 377, column: 10
                        S4847=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5436=1;
                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 386, column: 12
                          S4900=0;
                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 387, column: 17
                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 388, column: 10
                            S4878=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S4900=1;
                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 395, column: 17
                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 396, column: 10
                              S4884=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S4900=2;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 403, column: 17
                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 404, column: 10
                                S4903=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S4900=3;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 411, column: 17
                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 412, column: 10
                                  S4927=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5436=2;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                                    S5461=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                                      S5439=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5461=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                        S5445=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5461=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                          S5464=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5461=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                            S5488=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5436=3;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                              S6821=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                                S6799=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S6821=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                                  S6805=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S6821=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                                    S6824=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S6821=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                                      S6848=0;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S9758=1;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S9758=1;
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
                                    S5436=3;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                      S6821=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                        S6799=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S6821=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                          S6805=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S6821=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                            S6824=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                              S6848=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S9758=1;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S9758=1;
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
                          S5436=2;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                            S5461=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                              S5439=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5461=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                S5445=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5461=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                  S5464=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5461=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                    S5488=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5436=3;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                      S6821=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                        S6799=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S6821=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                          S6805=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S6821=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                            S6824=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                              S6848=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S9758=1;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S9758=1;
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
                            S5436=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                              S6821=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                S6799=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S6821=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                  S6805=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                    S6824=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                      S6848=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S9758=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S9758=1;
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
                S5436=1;
                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 386, column: 12
                  S4900=0;
                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 387, column: 17
                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 388, column: 10
                    S4878=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S4900=1;
                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 395, column: 17
                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 396, column: 10
                      S4884=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S4900=2;
                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 403, column: 17
                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 404, column: 10
                        S4903=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S4900=3;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 411, column: 17
                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 412, column: 10
                          S4927=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5436=2;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                            S5461=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                              S5439=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5461=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                S5445=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5461=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                  S5464=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5461=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                    S5488=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5436=3;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                      S6821=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                        S6799=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S6821=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                          S6805=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S6821=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                            S6824=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                              S6848=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S9758=1;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S9758=1;
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
                            S5436=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                              S6821=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                S6799=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S6821=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                  S6805=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                    S6824=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                      S6848=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S9758=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S9758=1;
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
                  S5436=2;
                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                    S5461=0;
                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                      S5439=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S5461=1;
                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                        S5445=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5461=2;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                          S5464=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5461=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                            S5488=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5436=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                              S6821=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                S6799=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S6821=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                  S6805=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                    S6824=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                      S6848=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S9758=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S9758=1;
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
                    S5436=3;
                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                      S6821=0;
                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                        S6799=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S6821=1;
                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                          S6805=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S6821=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                            S6824=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S6821=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                              S6848=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S9758=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      S9758=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                }
              }
            }
            else {
              S9758=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread37668(int [] tdone, int [] ends){
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
                    if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 333, column: 8
                      FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 333, column: 8
                      S39=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S34){
                        case 0 : 
                          if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 333, column: 8
                            FirstLiquid_o.setVal(1);//sysj/controller.sysj line: 333, column: 8
                            S34=1;
                            if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 333, column: 8
                              FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 333, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 333, column: 8
                              S77=1;
                              S84=0;
                              if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 334, column: 8
                                FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                                S84=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S79=0;
                                if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                                  FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 334, column: 8
                                  S79=1;
                                  if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                                    FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 334, column: 8
                                    S77=2;
                                    S172=0;
                                    if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 335, column: 8
                                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                                      S172=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S167=0;
                                      if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                        SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 335, column: 8
                                        S167=1;
                                        if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                          SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 335, column: 8
                                          S77=3;
                                          S304=0;
                                          if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                            S304=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S299=0;
                                            if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                              SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                                              S299=1;
                                              if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                                SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 336, column: 8
                                                S77=4;
                                                S480=0;
                                                if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                                  S480=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S475=0;
                                                  if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                                    ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                                    S475=1;
                                                    if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 337, column: 8
                                                      S77=5;
                                                      S700=0;
                                                      if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                        S700=1;
                                                        active[4]=1;
                                                        ends[4]=1;
                                                        tdone[4]=1;
                                                      }
                                                      else {
                                                        S695=0;
                                                        if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                          ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                                          S695=1;
                                                          if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                            ends[4]=2;
                                                            ;//sysj/controller.sysj line: 338, column: 8
                                                            S77=6;
                                                            S964=0;
                                                            if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                              S964=1;
                                                              active[4]=1;
                                                              ends[4]=1;
                                                              tdone[4]=1;
                                                            }
                                                            else {
                                                              S959=0;
                                                              if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                                FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                                                S959=1;
                                                                if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                                  ends[4]=2;
                                                                  ;//sysj/controller.sysj line: 339, column: 8
                                                                  S77=7;
                                                                  S1272=0;
                                                                  if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                                    S1272=1;
                                                                    active[4]=1;
                                                                    ends[4]=1;
                                                                    tdone[4]=1;
                                                                  }
                                                                  else {
                                                                    S1267=0;
                                                                    if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                                      FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                                      S1267=1;
                                                                      if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                                        ends[4]=2;
                                                                        ;//sysj/controller.sysj line: 340, column: 8
                                                                        System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                          if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 333, column: 8
                            FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 333, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 333, column: 8
                            S77=1;
                            S84=0;
                            if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 334, column: 8
                              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                              S84=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S79=0;
                              if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                                FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 334, column: 8
                                S79=1;
                                if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                                  FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 334, column: 8
                                  S77=2;
                                  S172=0;
                                  if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 335, column: 8
                                    SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                                    S172=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S167=0;
                                    if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                      SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 335, column: 8
                                      S167=1;
                                      if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                        SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 335, column: 8
                                        S77=3;
                                        S304=0;
                                        if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                          S304=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S299=0;
                                          if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                            SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                                            S299=1;
                                            if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 336, column: 8
                                              S77=4;
                                              S480=0;
                                              if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                                S480=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S475=0;
                                                if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                                  ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                                  S475=1;
                                                  if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 337, column: 8
                                                    S77=5;
                                                    S700=0;
                                                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                      S700=1;
                                                      active[4]=1;
                                                      ends[4]=1;
                                                      tdone[4]=1;
                                                    }
                                                    else {
                                                      S695=0;
                                                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                        ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                                        S695=1;
                                                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                          ends[4]=2;
                                                          ;//sysj/controller.sysj line: 338, column: 8
                                                          S77=6;
                                                          S964=0;
                                                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                            S964=1;
                                                            active[4]=1;
                                                            ends[4]=1;
                                                            tdone[4]=1;
                                                          }
                                                          else {
                                                            S959=0;
                                                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                                              S959=1;
                                                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                                ends[4]=2;
                                                                ;//sysj/controller.sysj line: 339, column: 8
                                                                S77=7;
                                                                S1272=0;
                                                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                                  S1272=1;
                                                                  active[4]=1;
                                                                  ends[4]=1;
                                                                  tdone[4]=1;
                                                                }
                                                                else {
                                                                  S1267=0;
                                                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                                    FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                                    S1267=1;
                                                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                                      ends[4]=2;
                                                                      ;//sysj/controller.sysj line: 340, column: 8
                                                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 333, column: 8
                      FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 333, column: 8
                      S39=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S34=0;
                      if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 333, column: 8
                        FirstLiquid_o.setVal(1);//sysj/controller.sysj line: 333, column: 8
                        S34=1;
                        if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 333, column: 8
                          FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 333, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 333, column: 8
                          S77=1;
                          S84=0;
                          if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 334, column: 8
                            FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                            S84=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S79=0;
                            if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                              FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 334, column: 8
                              S79=1;
                              if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                                FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 334, column: 8
                                S77=2;
                                S172=0;
                                if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 335, column: 8
                                  SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                                  S172=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S167=0;
                                  if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                    SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 335, column: 8
                                    S167=1;
                                    if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 335, column: 8
                                      S77=3;
                                      S304=0;
                                      if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                                        SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                        S304=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S299=0;
                                        if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                          SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                                          S299=1;
                                          if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 336, column: 8
                                            S77=4;
                                            S480=0;
                                            if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                              S480=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S475=0;
                                              if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                                ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                                S475=1;
                                                if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 337, column: 8
                                                  S77=5;
                                                  S700=0;
                                                  if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                    S700=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S695=0;
                                                    if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                      ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                                      S695=1;
                                                      if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 338, column: 8
                                                        S77=6;
                                                        S964=0;
                                                        if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                          S964=1;
                                                          active[4]=1;
                                                          ends[4]=1;
                                                          tdone[4]=1;
                                                        }
                                                        else {
                                                          S959=0;
                                                          if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                            FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                                            S959=1;
                                                            if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                              ends[4]=2;
                                                              ;//sysj/controller.sysj line: 339, column: 8
                                                              S77=7;
                                                              S1272=0;
                                                              if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                                S1272=1;
                                                                active[4]=1;
                                                                ends[4]=1;
                                                                tdone[4]=1;
                                                              }
                                                              else {
                                                                S1267=0;
                                                                if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                                  FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                                  S1267=1;
                                                                  if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                                    ends[4]=2;
                                                                    ;//sysj/controller.sysj line: 340, column: 8
                                                                    System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 334, column: 8
                      FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                      S84=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S79){
                        case 0 : 
                          if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                            FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 334, column: 8
                            S79=1;
                            if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 334, column: 8
                              S77=2;
                              S172=0;
                              if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 335, column: 8
                                SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                                S172=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S167=0;
                                if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                  SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 335, column: 8
                                  S167=1;
                                  if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                    SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 335, column: 8
                                    S77=3;
                                    S304=0;
                                    if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                      S304=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S299=0;
                                      if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                        SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                                        S299=1;
                                        if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 336, column: 8
                                          S77=4;
                                          S480=0;
                                          if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                            S480=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S475=0;
                                            if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                              ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                              S475=1;
                                              if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 337, column: 8
                                                S77=5;
                                                S700=0;
                                                if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                  S700=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S695=0;
                                                  if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                    ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                                    S695=1;
                                                    if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 338, column: 8
                                                      S77=6;
                                                      S964=0;
                                                      if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                        S964=1;
                                                        active[4]=1;
                                                        ends[4]=1;
                                                        tdone[4]=1;
                                                      }
                                                      else {
                                                        S959=0;
                                                        if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                          FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                                          S959=1;
                                                          if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                            ends[4]=2;
                                                            ;//sysj/controller.sysj line: 339, column: 8
                                                            S77=7;
                                                            S1272=0;
                                                            if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                              S1272=1;
                                                              active[4]=1;
                                                              ends[4]=1;
                                                              tdone[4]=1;
                                                            }
                                                            else {
                                                              S1267=0;
                                                              if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                                FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                                S1267=1;
                                                                if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                                  ends[4]=2;
                                                                  ;//sysj/controller.sysj line: 340, column: 8
                                                                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                          if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                            FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 334, column: 8
                            S77=2;
                            S172=0;
                            if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 335, column: 8
                              SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                              S172=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S167=0;
                              if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 335, column: 8
                                S167=1;
                                if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                  SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 335, column: 8
                                  S77=3;
                                  S304=0;
                                  if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                                    SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                    S304=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S299=0;
                                    if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                      SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                                      S299=1;
                                      if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                        SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 336, column: 8
                                        S77=4;
                                        S480=0;
                                        if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                          ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                          S480=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S475=0;
                                          if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                            ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                            S475=1;
                                            if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 337, column: 8
                                              S77=5;
                                              S700=0;
                                              if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                S700=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S695=0;
                                                if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                  ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                                  S695=1;
                                                  if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 338, column: 8
                                                    S77=6;
                                                    S964=0;
                                                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                      S964=1;
                                                      active[4]=1;
                                                      ends[4]=1;
                                                      tdone[4]=1;
                                                    }
                                                    else {
                                                      S959=0;
                                                      if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                        FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                                        S959=1;
                                                        if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                          ends[4]=2;
                                                          ;//sysj/controller.sysj line: 339, column: 8
                                                          S77=7;
                                                          S1272=0;
                                                          if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                            S1272=1;
                                                            active[4]=1;
                                                            ends[4]=1;
                                                            tdone[4]=1;
                                                          }
                                                          else {
                                                            S1267=0;
                                                            if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                              FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                              S1267=1;
                                                              if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                                ends[4]=2;
                                                                ;//sysj/controller.sysj line: 340, column: 8
                                                                System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 334, column: 8
                      FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                      S84=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S79=0;
                      if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                        FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 334, column: 8
                        S79=1;
                        if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                          FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 334, column: 8
                          S77=2;
                          S172=0;
                          if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 335, column: 8
                            SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                            S172=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S167=0;
                            if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                              SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 335, column: 8
                              S167=1;
                              if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 335, column: 8
                                S77=3;
                                S304=0;
                                if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                                  SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                  S304=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S299=0;
                                  if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                    SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                                    S299=1;
                                    if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 336, column: 8
                                      S77=4;
                                      S480=0;
                                      if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                        ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                        S480=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S475=0;
                                        if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                          ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                          S475=1;
                                          if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 337, column: 8
                                            S77=5;
                                            S700=0;
                                            if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                              S700=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S695=0;
                                              if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                                S695=1;
                                                if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 338, column: 8
                                                  S77=6;
                                                  S964=0;
                                                  if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                    S964=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S959=0;
                                                    if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                      FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                                      S959=1;
                                                      if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 339, column: 8
                                                        S77=7;
                                                        S1272=0;
                                                        if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                          S1272=1;
                                                          active[4]=1;
                                                          ends[4]=1;
                                                          tdone[4]=1;
                                                        }
                                                        else {
                                                          S1267=0;
                                                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                            FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                            S1267=1;
                                                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                              ends[4]=2;
                                                              ;//sysj/controller.sysj line: 340, column: 8
                                                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 335, column: 8
                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                      S172=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S167){
                        case 0 : 
                          if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                            SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 335, column: 8
                            S167=1;
                            if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                              SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 335, column: 8
                              S77=3;
                              S304=0;
                              if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                                SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                S304=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S299=0;
                                if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                  SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                                  S299=1;
                                  if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                    SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 336, column: 8
                                    S77=4;
                                    S480=0;
                                    if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                      S480=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S475=0;
                                      if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                        ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                        S475=1;
                                        if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                          ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 337, column: 8
                                          S77=5;
                                          S700=0;
                                          if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                            S700=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S695=0;
                                            if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                              ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                              S695=1;
                                              if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 338, column: 8
                                                S77=6;
                                                S964=0;
                                                if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                  S964=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S959=0;
                                                  if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                    FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                                    S959=1;
                                                    if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 339, column: 8
                                                      S77=7;
                                                      S1272=0;
                                                      if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                        S1272=1;
                                                        active[4]=1;
                                                        ends[4]=1;
                                                        tdone[4]=1;
                                                      }
                                                      else {
                                                        S1267=0;
                                                        if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                          FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                          S1267=1;
                                                          if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                            ends[4]=2;
                                                            ;//sysj/controller.sysj line: 340, column: 8
                                                            System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                          if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                            SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 335, column: 8
                            S77=3;
                            S304=0;
                            if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                              S304=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S299=0;
                              if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                                S299=1;
                                if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                  SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 336, column: 8
                                  S77=4;
                                  S480=0;
                                  if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                    S480=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S475=0;
                                    if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                      ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                      S475=1;
                                      if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                        ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 337, column: 8
                                        S77=5;
                                        S700=0;
                                        if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                          S700=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S695=0;
                                          if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                            ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                            S695=1;
                                            if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 338, column: 8
                                              S77=6;
                                              S964=0;
                                              if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                S964=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S959=0;
                                                if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                  FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                                  S959=1;
                                                  if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 339, column: 8
                                                    S77=7;
                                                    S1272=0;
                                                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                      S1272=1;
                                                      active[4]=1;
                                                      ends[4]=1;
                                                      tdone[4]=1;
                                                    }
                                                    else {
                                                      S1267=0;
                                                      if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                        FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                        S1267=1;
                                                        if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                          ends[4]=2;
                                                          ;//sysj/controller.sysj line: 340, column: 8
                                                          System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 335, column: 8
                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                      S172=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S167=0;
                      if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                        SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 335, column: 8
                        S167=1;
                        if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                          SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 335, column: 8
                          S77=3;
                          S304=0;
                          if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                            S304=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S299=0;
                            if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                              SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                              S299=1;
                              if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 336, column: 8
                                S77=4;
                                S480=0;
                                if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                  S480=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S475=0;
                                  if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                    ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                    S475=1;
                                    if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 337, column: 8
                                      S77=5;
                                      S700=0;
                                      if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                        S700=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S695=0;
                                        if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                          ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                          S695=1;
                                          if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 338, column: 8
                                            S77=6;
                                            S964=0;
                                            if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                              S964=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S959=0;
                                              if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                                S959=1;
                                                if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 339, column: 8
                                                  S77=7;
                                                  S1272=0;
                                                  if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                    S1272=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S1267=0;
                                                    if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                      FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                      S1267=1;
                                                      if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 340, column: 8
                                                        System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                      S304=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S299){
                        case 0 : 
                          if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                            SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                            S299=1;
                            if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 336, column: 8
                              S77=4;
                              S480=0;
                              if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                S480=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S475=0;
                                if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                  ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                  S475=1;
                                  if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 337, column: 8
                                    S77=5;
                                    S700=0;
                                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                      S700=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S695=0;
                                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                        ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                        S695=1;
                                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 338, column: 8
                                          S77=6;
                                          S964=0;
                                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                            S964=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S959=0;
                                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                              S959=1;
                                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 339, column: 8
                                                S77=7;
                                                S1272=0;
                                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                  S1272=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S1267=0;
                                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                    FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                    S1267=1;
                                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 340, column: 8
                                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                          if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 336, column: 8
                            S77=4;
                            S480=0;
                            if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                              S480=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S475=0;
                              if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                S475=1;
                                if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 337, column: 8
                                  S77=5;
                                  S700=0;
                                  if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                    S700=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S695=0;
                                    if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                      ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                      S695=1;
                                      if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 338, column: 8
                                        S77=6;
                                        S964=0;
                                        if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                          S964=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S959=0;
                                          if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                            FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                            S959=1;
                                            if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 339, column: 8
                                              S77=7;
                                              S1272=0;
                                              if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                S1272=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S1267=0;
                                                if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                  FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                  S1267=1;
                                                  if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 340, column: 8
                                                    System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                      S304=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S299=0;
                      if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                        SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                        S299=1;
                        if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 336, column: 8
                          S77=4;
                          S480=0;
                          if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                            S480=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S475=0;
                            if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                              ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                              S475=1;
                              if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 337, column: 8
                                S77=5;
                                S700=0;
                                if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                  S700=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S695=0;
                                  if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                    ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                    S695=1;
                                    if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 338, column: 8
                                      S77=6;
                                      S964=0;
                                      if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                        S964=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S959=0;
                                        if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                          FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                          S959=1;
                                          if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 339, column: 8
                                            S77=7;
                                            S1272=0;
                                            if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                              S1272=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S1267=0;
                                              if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                S1267=1;
                                                if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 340, column: 8
                                                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                      S480=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S475){
                        case 0 : 
                          if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                            ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                            S475=1;
                            if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 337, column: 8
                              S77=5;
                              S700=0;
                              if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                S700=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S695=0;
                                if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                  ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                  S695=1;
                                  if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 338, column: 8
                                    S77=6;
                                    S964=0;
                                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                      S964=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S959=0;
                                      if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                        FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                        S959=1;
                                        if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 339, column: 8
                                          S77=7;
                                          S1272=0;
                                          if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                            S1272=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S1267=0;
                                            if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                              FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                              S1267=1;
                                              if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 340, column: 8
                                                System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                          if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 337, column: 8
                            S77=5;
                            S700=0;
                            if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                              S700=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S695=0;
                              if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                S695=1;
                                if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 338, column: 8
                                  S77=6;
                                  S964=0;
                                  if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                    S964=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S959=0;
                                    if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                      FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                      S959=1;
                                      if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 339, column: 8
                                        S77=7;
                                        S1272=0;
                                        if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                          S1272=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S1267=0;
                                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                            FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                            S1267=1;
                                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 340, column: 8
                                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                      S480=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S475=0;
                      if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                        ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                        S475=1;
                        if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                          ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 337, column: 8
                          S77=5;
                          S700=0;
                          if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                            S700=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S695=0;
                            if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                              ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                              S695=1;
                              if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 338, column: 8
                                S77=6;
                                S964=0;
                                if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                  S964=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S959=0;
                                  if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                    FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                    S959=1;
                                    if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 339, column: 8
                                      S77=7;
                                      S1272=0;
                                      if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                        S1272=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S1267=0;
                                        if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                          FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                          S1267=1;
                                          if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 340, column: 8
                                            System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                      S700=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S695){
                        case 0 : 
                          if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                            ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                            S695=1;
                            if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 338, column: 8
                              S77=6;
                              S964=0;
                              if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                S964=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S959=0;
                                if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                  FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                  S959=1;
                                  if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 339, column: 8
                                    S77=7;
                                    S1272=0;
                                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                      S1272=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S1267=0;
                                      if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                        FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                        S1267=1;
                                        if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 340, column: 8
                                          System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                          if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 338, column: 8
                            S77=6;
                            S964=0;
                            if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                              S964=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S959=0;
                              if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                S959=1;
                                if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 339, column: 8
                                  S77=7;
                                  S1272=0;
                                  if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                    S1272=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S1267=0;
                                    if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                      FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                      S1267=1;
                                      if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 340, column: 8
                                        System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                      S700=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S695=0;
                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                        ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                        S695=1;
                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 338, column: 8
                          S77=6;
                          S964=0;
                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                            S964=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S959=0;
                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                              S959=1;
                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 339, column: 8
                                S77=7;
                                S1272=0;
                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                  S1272=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S1267=0;
                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                    FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                    S1267=1;
                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 340, column: 8
                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                      S964=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S959){
                        case 0 : 
                          if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                            FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                            S959=1;
                            if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 339, column: 8
                              S77=7;
                              S1272=0;
                              if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                S1272=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S1267=0;
                                if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                  FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                  S1267=1;
                                  if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 340, column: 8
                                    System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                          if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 339, column: 8
                            S77=7;
                            S1272=0;
                            if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                              S1272=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S1267=0;
                              if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                S1267=1;
                                if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 340, column: 8
                                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                      S964=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S959=0;
                      if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                        FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                        S959=1;
                        if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 339, column: 8
                          S77=7;
                          S1272=0;
                          if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                            S1272=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S1267=0;
                            if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                              FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                              S1267=1;
                              if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 340, column: 8
                                System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                      S1272=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S1267){
                        case 0 : 
                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                            FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                            S1267=1;
                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 340, column: 8
                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                          if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 340, column: 8
                            System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                      S1272=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S1267=0;
                      if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                        FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                        S1267=1;
                        if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 340, column: 8
                          System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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
            if(recipe.getprestatus()){//sysj/controller.sysj line: 329, column: 15
              System.out.println("Plant Send Start");//sysj/controller.sysj line: 331, column: 8
              S77=0;
              S39=0;
              if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 333, column: 8
                FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 333, column: 8
                S39=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S34=0;
                if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 333, column: 8
                  FirstLiquid_o.setVal(1);//sysj/controller.sysj line: 333, column: 8
                  S34=1;
                  if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 333, column: 8
                    FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 333, column: 8
                    ends[4]=2;
                    ;//sysj/controller.sysj line: 333, column: 8
                    S77=1;
                    S84=0;
                    if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 334, column: 8
                      FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                      S84=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S79=0;
                      if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                        FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 334, column: 8
                        S79=1;
                        if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                          FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 334, column: 8
                          S77=2;
                          S172=0;
                          if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 335, column: 8
                            SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                            S172=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S167=0;
                            if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                              SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 335, column: 8
                              S167=1;
                              if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                                SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 335, column: 8
                                S77=3;
                                S304=0;
                                if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                                  SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                  S304=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S299=0;
                                  if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                    SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                                    S299=1;
                                    if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 336, column: 8
                                      S77=4;
                                      S480=0;
                                      if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                        ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                        S480=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S475=0;
                                        if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                          ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                          S475=1;
                                          if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 337, column: 8
                                            S77=5;
                                            S700=0;
                                            if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                              S700=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S695=0;
                                              if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                                S695=1;
                                                if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 338, column: 8
                                                  S77=6;
                                                  S964=0;
                                                  if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                    S964=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S959=0;
                                                    if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                      FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                                      S959=1;
                                                      if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 339, column: 8
                                                        S77=7;
                                                        S1272=0;
                                                        if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                          S1272=1;
                                                          active[4]=1;
                                                          ends[4]=1;
                                                          tdone[4]=1;
                                                        }
                                                        else {
                                                          S1267=0;
                                                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                            FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                            S1267=1;
                                                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                              ends[4]=2;
                                                              ;//sysj/controller.sysj line: 340, column: 8
                                                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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

  public void thread37667(int [] tdone, int [] ends){
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
            if(LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 311, column: 15
              System.out.println("Complete.");//sysj/controller.sysj line: 313, column: 8
              if(enable.getprestatus()){//sysj/controller.sysj line: 315, column: 15
                if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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
                if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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
              if(enable.getprestatus()){//sysj/controller.sysj line: 315, column: 15
                if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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
                if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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
            if(LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 311, column: 15
              System.out.println("Complete.");//sysj/controller.sysj line: 313, column: 8
              if(enable.getprestatus()){//sysj/controller.sysj line: 315, column: 15
                if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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
                if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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
              if(enable.getprestatus()){//sysj/controller.sysj line: 315, column: 15
                if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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
                if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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

  public void thread37666(int [] tdone, int [] ends){
        switch(S19688){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread37667(tdone,ends);
        thread37668(tdone,ends);
        thread37669(tdone,ends);
        int biggest37670 = 0;
        if(ends[3]>=biggest37670){
          biggest37670=ends[3];
        }
        if(ends[4]>=biggest37670){
          biggest37670=ends[4];
        }
        if(ends[5]>=biggest37670){
          biggest37670=ends[5];
        }
        if(biggest37670 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest37670 == 0){
          S19688=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread37663(int [] tdone, int [] ends){
        S19728=1;
    if(LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 514, column: 26
      LiquidFillerDoneE.setPresent();//sysj/controller.sysj line: 514, column: 44
      currsigs.addElement(LiquidFillerDoneE);
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

  public void thread37662(int [] tdone, int [] ends){
        S19720=1;
    if(Liquid4On.getprestatus()){//sysj/controller.sysj line: 512, column: 26
      Liquid4OnE.setPresent();//sysj/controller.sysj line: 512, column: 37
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

  public void thread37661(int [] tdone, int [] ends){
        S19712=1;
    if(Liquid3On.getprestatus()){//sysj/controller.sysj line: 510, column: 26
      Liquid3OnE.setPresent();//sysj/controller.sysj line: 510, column: 37
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

  public void thread37660(int [] tdone, int [] ends){
        S19704=1;
    if(Liquid2On.getprestatus()){//sysj/controller.sysj line: 508, column: 26
      Liquid2OnE.setPresent();//sysj/controller.sysj line: 508, column: 37
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

  public void thread37659(int [] tdone, int [] ends){
        S19696=1;
    if(Liquid1On.getprestatus()){//sysj/controller.sysj line: 506, column: 26
      Liquid1OnE.setPresent();//sysj/controller.sysj line: 506, column: 37
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

  public void thread37658(int [] tdone, int [] ends){
        S19730=1;
    thread37659(tdone,ends);
    thread37660(tdone,ends);
    thread37661(tdone,ends);
    thread37662(tdone,ends);
    thread37663(tdone,ends);
    int biggest37664 = 0;
    if(ends[7]>=biggest37664){
      biggest37664=ends[7];
    }
    if(ends[8]>=biggest37664){
      biggest37664=ends[8];
    }
    if(ends[9]>=biggest37664){
      biggest37664=ends[9];
    }
    if(ends[10]>=biggest37664){
      biggest37664=ends[10];
    }
    if(ends[11]>=biggest37664){
      biggest37664=ends[11];
    }
    if(biggest37664 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread37656(int [] tdone, int [] ends){
        S19686=1;
    S9758=0;
    if(Counter.getprestatus()){//sysj/controller.sysj line: 350, column: 15
      S5436=0;
      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 1){//sysj/controller.sysj line: 351, column: 12
        S4820=0;
        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 352, column: 17
          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 353, column: 10
          S4798=0;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S4820=1;
          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 360, column: 17
            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 361, column: 10
            S4804=0;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
          }
          else {
            S4820=2;
            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 368, column: 17
              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 369, column: 10
              S4823=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S4820=3;
              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 376, column: 17
                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 377, column: 10
                S4847=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S5436=1;
                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 386, column: 12
                  S4900=0;
                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 387, column: 17
                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 388, column: 10
                    S4878=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S4900=1;
                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 395, column: 17
                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 396, column: 10
                      S4884=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S4900=2;
                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 403, column: 17
                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 404, column: 10
                        S4903=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S4900=3;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 411, column: 17
                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 412, column: 10
                          S4927=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5436=2;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                            S5461=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                              S5439=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5461=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                                S5445=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5461=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                                  S5464=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5461=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                                    S5488=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5436=3;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                                      S6821=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                        S6799=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S6821=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                          S6805=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S6821=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                            S6824=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S6821=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                              S6848=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S9758=1;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S9758=1;
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
                            S5436=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                              S6821=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                S6799=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S6821=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                  S6805=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                    S6824=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                      S6848=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S9758=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S9758=1;
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
                  S5436=2;
                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                    S5461=0;
                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                      S5439=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S5461=1;
                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                        S5445=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5461=2;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                          S5464=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5461=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                            S5488=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5436=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                              S6821=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                S6799=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S6821=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                  S6805=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                    S6824=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                      S6848=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S9758=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S9758=1;
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
                    S5436=3;
                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                      S6821=0;
                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                        S6799=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S6821=1;
                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                          S6805=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S6821=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                            S6824=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S6821=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                              S6848=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S9758=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      S9758=1;
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
        S5436=1;
        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 386, column: 12
          S4900=0;
          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 387, column: 17
            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 388, column: 10
            S4878=0;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
          }
          else {
            S4900=1;
            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 395, column: 17
              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 396, column: 10
              S4884=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S4900=2;
              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 403, column: 17
                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 404, column: 10
                S4903=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S4900=3;
                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 411, column: 17
                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 412, column: 10
                  S4927=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S5436=2;
                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
                    S5461=0;
                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
                      S5439=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S5461=1;
                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                        S5445=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5461=2;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                          S5464=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5461=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                            S5488=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5436=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                              S6821=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                                S6799=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S6821=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                                  S6805=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S6821=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                                    S6824=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S6821=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                                      S6848=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S9758=1;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S9758=1;
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
                    S5436=3;
                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                      S6821=0;
                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                        S6799=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S6821=1;
                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                          S6805=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S6821=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                            S6824=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S6821=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                              S6848=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S9758=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      S9758=1;
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
          S5436=2;
          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 421, column: 12
            S5461=0;
            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 422, column: 17
              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 423, column: 10
              S5439=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S5461=1;
              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 430, column: 17
                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 431, column: 10
                S5445=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S5461=2;
                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 438, column: 17
                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 439, column: 10
                  S5464=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S5461=3;
                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 446, column: 17
                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 447, column: 10
                    S5488=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S5436=3;
                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
                      S6821=0;
                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                        S6799=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S6821=1;
                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                          S6805=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S6821=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                            S6824=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S6821=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                              S6848=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S9758=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      S9758=1;
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
            S5436=3;
            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 456, column: 12
              S6821=0;
              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 457, column: 17
                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 458, column: 10
                S6799=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S6821=1;
                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 465, column: 17
                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 466, column: 10
                  S6805=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S6821=2;
                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 473, column: 17
                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 474, column: 10
                    S6824=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S6821=3;
                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 481, column: 17
                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 482, column: 10
                      S6848=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S9758=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                }
              }
            }
            else {
              S9758=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
          }
        }
      }
    }
    else {
      S9758=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread37655(int [] tdone, int [] ends){
        S4795=1;
    S1619=0;
    if(recipe.getprestatus()){//sysj/controller.sysj line: 329, column: 15
      System.out.println("Plant Send Start");//sysj/controller.sysj line: 331, column: 8
      S77=0;
      S39=0;
      if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 333, column: 8
        FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 333, column: 8
        S39=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S34=0;
        if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 333, column: 8
          FirstLiquid_o.setVal(1);//sysj/controller.sysj line: 333, column: 8
          S34=1;
          if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 333, column: 8
            FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 333, column: 8
            ends[4]=2;
            ;//sysj/controller.sysj line: 333, column: 8
            S77=1;
            S84=0;
            if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 334, column: 8
              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
              S84=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S79=0;
              if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 334, column: 8
                S79=1;
                if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 334, column: 8
                  FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 334, column: 8
                  ends[4]=2;
                  ;//sysj/controller.sysj line: 334, column: 8
                  S77=2;
                  S172=0;
                  if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 335, column: 8
                    SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                    S172=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S167=0;
                    if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                      SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 335, column: 8
                      S167=1;
                      if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 335, column: 8
                        SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 335, column: 8
                        ends[4]=2;
                        ;//sysj/controller.sysj line: 335, column: 8
                        S77=3;
                        S304=0;
                        if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 336, column: 8
                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                          S304=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S299=0;
                          if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                            SecondLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 336, column: 8
                            S299=1;
                            if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 336, column: 8
                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 336, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 336, column: 8
                              S77=4;
                              S480=0;
                              if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 337, column: 8
                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                S480=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S475=0;
                                if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                  ThirdLiquid_o.setVal(3);//sysj/controller.sysj line: 337, column: 8
                                  S475=1;
                                  if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 337, column: 8
                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 337, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 337, column: 8
                                    S77=5;
                                    S700=0;
                                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 338, column: 8
                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                      S700=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S695=0;
                                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                        ThirdLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 338, column: 8
                                        S695=1;
                                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 338, column: 8
                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 338, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 338, column: 8
                                          S77=6;
                                          S964=0;
                                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 339, column: 8
                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                            S964=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S959=0;
                                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 339, column: 8
                                              S959=1;
                                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 339, column: 8
                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 339, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 339, column: 8
                                                S77=7;
                                                S1272=0;
                                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 340, column: 8
                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                  S1272=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S1267=0;
                                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                    FourthLiquidAmount_o.setVal(20);//sysj/controller.sysj line: 340, column: 8
                                                    S1267=1;
                                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 340, column: 8
                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 340, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 340, column: 8
                                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 342, column: 8
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

  public void thread37654(int [] tdone, int [] ends){
        S32=1;
    S5=0;
    if(LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 311, column: 15
      System.out.println("Complete.");//sysj/controller.sysj line: 313, column: 8
      if(enable.getprestatus()){//sysj/controller.sysj line: 315, column: 15
        if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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
        if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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
      if(enable.getprestatus()){//sysj/controller.sysj line: 315, column: 15
        if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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
        if(recipe.getprestatus()){//sysj/controller.sysj line: 319, column: 15
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

  public void thread37653(int [] tdone, int [] ends){
        S19688=1;
    thread37654(tdone,ends);
    thread37655(tdone,ends);
    thread37656(tdone,ends);
    int biggest37657 = 0;
    if(ends[3]>=biggest37657){
      biggest37657=ends[3];
    }
    if(ends[4]>=biggest37657){
      biggest37657=ends[4];
    }
    if(ends[5]>=biggest37657){
      biggest37657=ends[5];
    }
    if(biggest37657 == 1){
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
      switch(S19732){
        case 0 : 
          S19732=0;
          break RUN;
        
        case 1 : 
          S19732=2;
          S19732=2;
          thread37653(tdone,ends);
          thread37658(tdone,ends);
          int biggest37665 = 0;
          if(ends[2]>=biggest37665){
            biggest37665=ends[2];
          }
          if(ends[6]>=biggest37665){
            biggest37665=ends[6];
          }
          if(biggest37665 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread37666(tdone,ends);
          thread37671(tdone,ends);
          int biggest37678 = 0;
          if(ends[2]>=biggest37678){
            biggest37678=ends[2];
          }
          if(ends[6]>=biggest37678){
            biggest37678=ends[6];
          }
          if(biggest37678 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest37678 == 0){
            S19732=0;
            active[1]=0;
            ends[1]=0;
            S19732=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      FirstLiquidDone.setpreclear();
      SecondLiquidDone.setpreclear();
      ThirdLiquidDone.setpreclear();
      FourthLiquidDone.setpreclear();
      Liquid1OnE.setpreclear();
      Liquid2OnE.setpreclear();
      Liquid3OnE.setpreclear();
      Liquid4OnE.setpreclear();
      LiquidFillerDoneE.setpreclear();
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
      FirstLiquidDone.sethook();
      FirstLiquidDone.setClear();
      SecondLiquidDone.sethook();
      SecondLiquidDone.setClear();
      ThirdLiquidDone.sethook();
      ThirdLiquidDone.setClear();
      FourthLiquidDone.sethook();
      FourthLiquidDone.setClear();
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
