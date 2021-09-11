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
  private int S22799 = 1;
  private int S22763 = 1;
  private int S59 = 1;
  private int S14 = 1;
  private int S4822 = 1;
  private int S1646 = 1;
  private int S104 = 1;
  private int S66 = 1;
  private int S61 = 1;
  private int S111 = 1;
  private int S106 = 1;
  private int S199 = 1;
  private int S194 = 1;
  private int S331 = 1;
  private int S326 = 1;
  private int S507 = 1;
  private int S502 = 1;
  private int S727 = 1;
  private int S722 = 1;
  private int S991 = 1;
  private int S986 = 1;
  private int S1299 = 1;
  private int S1294 = 1;
  private int S22761 = 1;
  private int S10801 = 1;
  private int S5069 = 1;
  private int S4825 = 1;
  private int S4853 = 1;
  private int S4831 = 1;
  private int S4837 = 1;
  private int S4856 = 1;
  private int S4880 = 1;
  private int S5094 = 1;
  private int S5072 = 1;
  private int S5078 = 1;
  private int S5097 = 1;
  private int S5121 = 1;
  private int S5814 = 1;
  private int S5792 = 1;
  private int S5798 = 1;
  private int S5817 = 1;
  private int S5841 = 1;
  private int S7486 = 1;
  private int S22797 = 1;
  private int S22771 = 1;
  private int S22779 = 1;
  private int S22787 = 1;
  private int S22795 = 1;
  
  private int[] ends = new int[35];
  private int[] tdone = new int[35];
  
  public void thread43693(int [] tdone, int [] ends){
        switch(S22795){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(Liquid4On.getprestatus()){//sysj/controller.sysj line: 553, column: 26
          Liquid4OnE.setPresent();//sysj/controller.sysj line: 553, column: 37
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

  public void thread43692(int [] tdone, int [] ends){
        switch(S22787){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(Liquid3On.getprestatus()){//sysj/controller.sysj line: 551, column: 26
          Liquid3OnE.setPresent();//sysj/controller.sysj line: 551, column: 37
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

  public void thread43691(int [] tdone, int [] ends){
        switch(S22779){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(Liquid2On.getprestatus()){//sysj/controller.sysj line: 549, column: 26
          Liquid2OnE.setPresent();//sysj/controller.sysj line: 549, column: 37
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

  public void thread43690(int [] tdone, int [] ends){
        switch(S22771){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(Liquid1On.getprestatus()){//sysj/controller.sysj line: 547, column: 26
          Liquid1OnE.setPresent();//sysj/controller.sysj line: 547, column: 37
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

  public void thread43689(int [] tdone, int [] ends){
        switch(S22797){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread43690(tdone,ends);
        thread43691(tdone,ends);
        thread43692(tdone,ends);
        thread43693(tdone,ends);
        int biggest43694 = 0;
        if(ends[7]>=biggest43694){
          biggest43694=ends[7];
        }
        if(ends[8]>=biggest43694){
          biggest43694=ends[8];
        }
        if(ends[9]>=biggest43694){
          biggest43694=ends[9];
        }
        if(ends[10]>=biggest43694){
          biggest43694=ends[10];
        }
        if(biggest43694 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest43694 == 0){
          S22797=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread43687(int [] tdone, int [] ends){
        switch(S22761){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S10801){
          case 0 : 
            switch(S5069){
              case 0 : 
                switch(S4825){
                  case 0 : 
                    if(enable.getprestatus()){//sysj/controller.sysj line: 375, column: 15
                      Ready.setPresent();//sysj/controller.sysj line: 376, column: 9
                      currsigs.addElement(Ready);
                      System.out.println("Emit Read");//sysj/controller.sysj line: 377, column: 9
                      S4825=1;
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
                    if(!enable.getprestatus()){//sysj/controller.sysj line: 378, column: 15
                      S5069=1;
                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 381, column: 12
                        S4853=0;
                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 383, column: 17
                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 384, column: 10
                          S4831=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S4853=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 391, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 392, column: 10
                            S4837=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S4853=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 399, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 400, column: 10
                              S4856=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S4853=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 407, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 408, column: 10
                                S4880=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5069=2;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 417, column: 12
                                  S5094=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 418, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 419, column: 10
                                    S5072=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5094=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 426, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 427, column: 10
                                      S5078=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5094=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                                        S5097=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5094=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                                          S5121=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5069=3;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                            S5814=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                              S5792=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5814=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                                S5798=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S5814=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                                  S5817=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S5814=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                                    S5841=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S5069=4;
                                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                                      S7486=0;
                                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7486=1;
                                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                        else {
                                                          S7486=2;
                                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                            active[5]=1;
                                                            ends[5]=1;
                                                            tdone[5]=1;
                                                          }
                                                          else {
                                                            S7486=3;
                                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                              active[5]=1;
                                                              ends[5]=1;
                                                              tdone[5]=1;
                                                            }
                                                            else {
                                                              S7486=4;
                                                              active[5]=1;
                                                              ends[5]=1;
                                                              tdone[5]=1;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S10801=1;
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
                                            S5069=4;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                              S7486=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7486=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7486=4;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S10801=1;
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
                                  S5069=3;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                    S5814=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                      S5792=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5814=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                        S5798=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5814=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                          S5817=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5814=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                            S5841=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5069=4;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                              S7486=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7486=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7486=4;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S10801=1;
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
                                    S5069=4;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                      S7486=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=4;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S10801=1;
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
                        S5069=2;
                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 417, column: 12
                          S5094=0;
                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 418, column: 17
                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 419, column: 10
                            S5072=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5094=1;
                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 426, column: 17
                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 427, column: 10
                              S5078=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5094=2;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                                S5097=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5094=3;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                                  S5121=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5069=3;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                    S5814=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                      S5792=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5814=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                        S5798=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5814=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                          S5817=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5814=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                            S5841=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5069=4;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                              S7486=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7486=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7486=4;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S10801=1;
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
                                    S5069=4;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                      S7486=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=4;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S10801=1;
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
                          S5069=3;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                            S5814=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                              S5792=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5814=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                S5798=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5814=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                  S5817=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5814=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                    S5841=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5069=4;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                      S7486=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=4;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S10801=1;
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
                            S5069=4;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                              S7486=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7486=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=4;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S10801=1;
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
                switch(S4853){
                  case 0 : 
                    switch(S4831){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 385, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 386, column: 10
                          currsigs.addElement(FirstLiquidDone);
                          S4831=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 387, column: 16
                          S4853=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 391, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 392, column: 10
                            S4837=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S4853=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 399, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 400, column: 10
                              S4856=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S4853=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 407, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 408, column: 10
                                S4880=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5069=2;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 417, column: 12
                                  S5094=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 418, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 419, column: 10
                                    S5072=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5094=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 426, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 427, column: 10
                                      S5078=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5094=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                                        S5097=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5094=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                                          S5121=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5069=3;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                            S5814=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                              S5792=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5814=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                                S5798=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S5814=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                                  S5817=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S5814=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                                    S5841=0;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S5069=4;
                                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                                      S7486=0;
                                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7486=1;
                                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                        else {
                                                          S7486=2;
                                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                            active[5]=1;
                                                            ends[5]=1;
                                                            tdone[5]=1;
                                                          }
                                                          else {
                                                            S7486=3;
                                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                              active[5]=1;
                                                              ends[5]=1;
                                                              tdone[5]=1;
                                                            }
                                                            else {
                                                              S7486=4;
                                                              active[5]=1;
                                                              ends[5]=1;
                                                              tdone[5]=1;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S10801=1;
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
                                            S5069=4;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                              S7486=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7486=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7486=4;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S10801=1;
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
                                  S5069=3;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                    S5814=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                      S5792=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5814=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                        S5798=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5814=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                          S5817=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5814=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                            S5841=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5069=4;
                                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                              S7486=0;
                                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=1;
                                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=2;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7486=3;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7486=4;
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S10801=1;
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
                                    S5069=4;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                      S7486=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=4;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S10801=1;
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
                    switch(S4837){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 393, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 394, column: 10
                          currsigs.addElement(FirstLiquidDone);
                          S4837=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 395, column: 16
                          S4853=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 399, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 400, column: 10
                            S4856=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S4853=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 407, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 408, column: 10
                              S4880=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5069=2;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 417, column: 12
                                S5094=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 418, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 419, column: 10
                                  S5072=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5094=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 426, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 427, column: 10
                                    S5078=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5094=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                                      S5097=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5094=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                                        S5121=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5069=3;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                          S5814=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                            S5792=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5814=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                              S5798=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5814=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                                S5817=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S5814=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                                  S5841=0;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S5069=4;
                                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                                    S7486=0;
                                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7486=1;
                                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7486=2;
                                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                        else {
                                                          S7486=3;
                                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                            active[5]=1;
                                                            ends[5]=1;
                                                            tdone[5]=1;
                                                          }
                                                          else {
                                                            S7486=4;
                                                            active[5]=1;
                                                            ends[5]=1;
                                                            tdone[5]=1;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S10801=1;
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
                                          S5069=4;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                            S7486=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7486=4;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S10801=1;
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
                                S5069=3;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                  S5814=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                    S5792=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5814=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                      S5798=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5814=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                        S5817=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5814=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                          S5841=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5069=4;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                            S7486=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7486=4;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S10801=1;
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
                                  S5069=4;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                    S7486=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=4;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S10801=1;
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
                    switch(S4856){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 401, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 402, column: 10
                          currsigs.addElement(FirstLiquidDone);
                          S4856=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 403, column: 16
                          S4853=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 407, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 408, column: 10
                            S4880=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5069=2;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 417, column: 12
                              S5094=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 418, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 419, column: 10
                                S5072=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5094=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 426, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 427, column: 10
                                  S5078=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5094=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                                    S5097=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5094=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                                      S5121=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5069=3;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                        S5814=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                          S5792=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5814=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                            S5798=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5814=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                              S5817=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5814=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                                S5841=0;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S5069=4;
                                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                                  S7486=0;
                                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7486=1;
                                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7486=2;
                                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7486=3;
                                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                        else {
                                                          S7486=4;
                                                          active[5]=1;
                                                          ends[5]=1;
                                                          tdone[5]=1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S10801=1;
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
                                        S5069=4;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                          S7486=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=4;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S10801=1;
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
                              S5069=3;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                S5814=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                  S5792=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5814=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                    S5798=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5814=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                      S5817=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5814=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                        S5841=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5069=4;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                          S7486=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=4;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S10801=1;
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
                                S5069=4;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                  S7486=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=4;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S10801=1;
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
                    switch(S4880){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 409, column: 16
                          FirstLiquidDone.setPresent();//sysj/controller.sysj line: 410, column: 10
                          currsigs.addElement(FirstLiquidDone);
                          S4880=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 411, column: 16
                          S5069=2;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 417, column: 12
                            S5094=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 418, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 419, column: 10
                              S5072=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5094=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 426, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 427, column: 10
                                S5078=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5094=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                                  S5097=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5094=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                                    S5121=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5069=3;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                      S5814=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                        S5792=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5814=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                          S5798=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5814=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                            S5817=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5814=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                              S5841=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5069=4;
                                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                                S7486=0;
                                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=1;
                                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7486=2;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7486=3;
                                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7486=4;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S10801=1;
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
                                      S5069=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                        S7486=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=4;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S10801=1;
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
                            S5069=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                              S5814=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                S5792=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5814=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                  S5798=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5814=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                    S5817=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5814=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                      S5841=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5069=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                        S7486=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=4;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S10801=1;
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
                              S5069=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                S7486=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=4;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S10801=1;
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
                switch(S5094){
                  case 0 : 
                    switch(S5072){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 420, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 421, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S5072=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 422, column: 16
                          S5094=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 426, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 427, column: 10
                            S5078=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5094=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                              S5097=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5094=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                                S5121=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5069=3;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                  S5814=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                    S5792=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5814=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                      S5798=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5814=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                        S5817=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5814=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                          S5841=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5069=4;
                                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                            S7486=0;
                                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=1;
                                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=2;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=3;
                                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7486=4;
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S10801=1;
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
                                  S5069=4;
                                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                    S7486=0;
                                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=1;
                                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=2;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=3;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=4;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S10801=1;
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
                    switch(S5078){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 428, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 429, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S5078=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 430, column: 16
                          S5094=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                            S5097=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5094=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                              S5121=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5069=3;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                S5814=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                  S5792=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5814=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                    S5798=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5814=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                      S5817=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5814=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                        S5841=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5069=4;
                                        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                          S7486=0;
                                          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=1;
                                            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=2;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=3;
                                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=4;
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S10801=1;
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
                                S5069=4;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                  S7486=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=4;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S10801=1;
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
                    switch(S5097){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 436, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 437, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S5097=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 438, column: 16
                          S5094=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                            S5121=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5069=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                              S5814=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                S5792=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5814=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                  S5798=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5814=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                    S5817=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5814=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                      S5841=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5069=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                        S7486=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=4;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S10801=1;
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
                              S5069=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                S7486=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=4;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S10801=1;
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
                    switch(S5121){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 444, column: 16
                          SecondLiquidDone.setPresent();//sysj/controller.sysj line: 445, column: 10
                          currsigs.addElement(SecondLiquidDone);
                          S5121=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 446, column: 16
                          S5069=3;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                            S5814=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                              S5792=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5814=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                S5798=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5814=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                  S5817=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5814=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                    S5841=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5069=4;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                      S7486=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=4;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S10801=1;
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
                            S5069=4;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                              S7486=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7486=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=4;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S10801=1;
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
                switch(S5814){
                  case 0 : 
                    switch(S5792){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 455, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 456, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5792=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 457, column: 16
                          S5814=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                            S5798=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5814=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                              S5817=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5814=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                S5841=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5069=4;
                                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                  S7486=0;
                                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=1;
                                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=2;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=3;
                                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=4;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S10801=1;
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
                    switch(S5798){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 463, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 464, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5798=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 465, column: 16
                          S5814=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                            S5817=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5814=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                              S5841=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5069=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                S7486=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=4;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S10801=1;
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
                    switch(S5817){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 471, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 472, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5817=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 473, column: 16
                          S5814=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                            S5841=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5069=4;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                              S7486=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7486=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=4;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S10801=1;
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
                    switch(S5841){
                      case 0 : 
                        if(enable.getprestatus()){//sysj/controller.sysj line: 479, column: 16
                          ThirdLiquidDone.setPresent();//sysj/controller.sysj line: 480, column: 10
                          currsigs.addElement(ThirdLiquidDone);
                          S5841=1;
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
                        if(!enable.getprestatus()){//sysj/controller.sysj line: 481, column: 16
                          S5069=4;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                            S7486=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7486=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7486=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=4;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                }
                              }
                            }
                          }
                          else {
                            S10801=1;
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
                switch(S7486){
                  case 0 : 
                    if(enable.getprestatus()){//sysj/controller.sysj line: 489, column: 16
                      FourthLiquidDone.setPresent();//sysj/controller.sysj line: 490, column: 10
                      currsigs.addElement(FourthLiquidDone);
                      S7486=1;
                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S7486=2;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S7486=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7486=4;
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
                  
                  case 1 : 
                    if(enable.getprestatus()){//sysj/controller.sysj line: 497, column: 16
                      FourthLiquidDone.setPresent();//sysj/controller.sysj line: 498, column: 10
                      currsigs.addElement(FourthLiquidDone);
                      S7486=2;
                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S7486=3;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S7486=4;
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
                  
                  case 2 : 
                    if(enable.getprestatus()){//sysj/controller.sysj line: 505, column: 16
                      FourthLiquidDone.setPresent();//sysj/controller.sysj line: 506, column: 10
                      currsigs.addElement(FourthLiquidDone);
                      S7486=3;
                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S7486=4;
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
                  
                  case 3 : 
                    if(enable.getprestatus()){//sysj/controller.sysj line: 513, column: 16
                      FourthLiquidDone.setPresent();//sysj/controller.sysj line: 514, column: 10
                      currsigs.addElement(FourthLiquidDone);
                      S7486=4;
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
                    if(!enable.getprestatus()){//sysj/controller.sysj line: 518, column: 15
                      S7486=5;
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
                  
                  case 5 : 
                    if(enable.getprestatus()){//sysj/controller.sysj line: 519, column: 15
                      S7486=6;
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
                  
                  case 6 : 
                    if(!enable.getprestatus()){//sysj/controller.sysj line: 520, column: 15
                      S7486=7;
                      RemoveE.setPresent();//sysj/controller.sysj line: 522, column: 10
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
                  
                  case 7 : 
                    if(enable.getprestatus()){//sysj/controller.sysj line: 521, column: 16
                      S10801=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      RemoveE.setPresent();//sysj/controller.sysj line: 522, column: 10
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
            S10801=1;
            S10801=0;
            if(Counter.getprestatus()){//sysj/controller.sysj line: 371, column: 15
              S5069=0;
              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 1){//sysj/controller.sysj line: 373, column: 12
                System.out.println("Counter 0");//sysj/controller.sysj line: 374, column: 9
                S4825=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S5069=1;
                if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 381, column: 12
                  S4853=0;
                  if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 383, column: 17
                    System.out.println("L1 FILLING START");//sysj/controller.sysj line: 384, column: 10
                    S4831=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S4853=1;
                    if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 391, column: 17
                      System.out.println("L2 FILLING START");//sysj/controller.sysj line: 392, column: 10
                      S4837=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S4853=2;
                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 399, column: 17
                        System.out.println("L3 FILLING START");//sysj/controller.sysj line: 400, column: 10
                        S4856=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S4853=3;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 407, column: 17
                          System.out.println("L4 FILLING START");//sysj/controller.sysj line: 408, column: 10
                          S4880=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5069=2;
                          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 417, column: 12
                            S5094=0;
                            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 418, column: 17
                              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 419, column: 10
                              S5072=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5094=1;
                              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 426, column: 17
                                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 427, column: 10
                                S5078=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5094=2;
                                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                                  S5097=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5094=3;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                                    S5121=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5069=3;
                                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                                      S5814=0;
                                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                        S5792=0;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S5814=1;
                                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                          S5798=0;
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S5814=2;
                                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                            S5817=0;
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S5814=3;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                              S5841=0;
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S5069=4;
                                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                                S7486=0;
                                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                                  active[5]=1;
                                                  ends[5]=1;
                                                  tdone[5]=1;
                                                }
                                                else {
                                                  S7486=1;
                                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                                    active[5]=1;
                                                    ends[5]=1;
                                                    tdone[5]=1;
                                                  }
                                                  else {
                                                    S7486=2;
                                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                                      active[5]=1;
                                                      ends[5]=1;
                                                      tdone[5]=1;
                                                    }
                                                    else {
                                                      S7486=3;
                                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                      else {
                                                        S7486=4;
                                                        active[5]=1;
                                                        ends[5]=1;
                                                        tdone[5]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S10801=1;
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
                                      S5069=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                        S7486=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=4;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S10801=1;
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
                            S5069=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                              S5814=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                S5792=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5814=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                  S5798=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5814=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                    S5817=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5814=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                      S5841=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5069=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                        S7486=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=4;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S10801=1;
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
                              S5069=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                S7486=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=4;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S10801=1;
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
                  S5069=2;
                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 417, column: 12
                    S5094=0;
                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 418, column: 17
                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 419, column: 10
                      S5072=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S5094=1;
                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 426, column: 17
                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 427, column: 10
                        S5078=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5094=2;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                          S5097=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5094=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                            S5121=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5069=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                              S5814=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                S5792=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5814=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                  S5798=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5814=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                    S5817=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5814=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                      S5841=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5069=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                        S7486=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=4;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S10801=1;
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
                              S5069=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                S7486=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=4;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S10801=1;
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
                    S5069=3;
                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                      S5814=0;
                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                        S5792=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5814=1;
                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                          S5798=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5814=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                            S5817=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5814=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                              S5841=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5069=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                S7486=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=4;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S10801=1;
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
                      S5069=4;
                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                        S7486=0;
                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S7486=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7486=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7486=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7486=4;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                      else {
                        S10801=1;
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
              S10801=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43686(int [] tdone, int [] ends){
        switch(S4822){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1646){
          case 0 : 
            switch(S104){
              case 0 : 
                switch(S66){
                  case 0 : 
                    if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                      FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                      S66=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S61){
                        case 0 : 
                          if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                            FirstLiquid_o.setVal(3);//sysj/controller.sysj line: 349, column: 8
                            S61=1;
                            if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                              FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 349, column: 8
                              S104=1;
                              S111=0;
                              if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                                FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                S111=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S106=0;
                                if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                  FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                  S106=1;
                                  if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                    FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 350, column: 8
                                    S104=2;
                                    S199=0;
                                    if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                      S199=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S194=0;
                                      if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                        SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 351, column: 8
                                        S194=1;
                                        if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                          SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 351, column: 8
                                          S104=3;
                                          S331=0;
                                          if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                            S331=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S326=0;
                                            if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                              SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                              S326=1;
                                              if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                                SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 352, column: 8
                                                S104=4;
                                                S507=0;
                                                if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                                  S507=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S502=0;
                                                  if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                                    ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                                    S502=1;
                                                    if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 353, column: 8
                                                      S104=5;
                                                      S727=0;
                                                      if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                        S727=1;
                                                        active[4]=1;
                                                        ends[4]=1;
                                                        tdone[4]=1;
                                                      }
                                                      else {
                                                        S722=0;
                                                        if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                          ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                                          S722=1;
                                                          if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                            ends[4]=2;
                                                            ;//sysj/controller.sysj line: 354, column: 8
                                                            S104=6;
                                                            S991=0;
                                                            if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                              S991=1;
                                                              active[4]=1;
                                                              ends[4]=1;
                                                              tdone[4]=1;
                                                            }
                                                            else {
                                                              S986=0;
                                                              if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                                FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                                                S986=1;
                                                                if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                                  ends[4]=2;
                                                                  ;//sysj/controller.sysj line: 355, column: 8
                                                                  S104=7;
                                                                  S1299=0;
                                                                  if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                                    S1299=1;
                                                                    active[4]=1;
                                                                    ends[4]=1;
                                                                    tdone[4]=1;
                                                                  }
                                                                  else {
                                                                    S1294=0;
                                                                    if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                                      FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                                      S1294=1;
                                                                      if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                                        ends[4]=2;
                                                                        ;//sysj/controller.sysj line: 356, column: 8
                                                                        FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                                        currsigs.addElement(FirstLiquidAmountE);
                                                                        FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                                        SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                                        currsigs.addElement(SecondLiquidAmountE);
                                                                        SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                                        ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                                        currsigs.addElement(ThirdLiquidAmountE);
                                                                        ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                                        FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                                        currsigs.addElement(FourthLiquidAmountE);
                                                                        FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                                        System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                                        S1646=1;
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
                          if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                            FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 349, column: 8
                            S104=1;
                            S111=0;
                            if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                              S111=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S106=0;
                              if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                                S106=1;
                                if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                  FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 350, column: 8
                                  S104=2;
                                  S199=0;
                                  if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                    SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                    S199=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S194=0;
                                    if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                      SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 351, column: 8
                                      S194=1;
                                      if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                        SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 351, column: 8
                                        S104=3;
                                        S331=0;
                                        if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                          S331=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S326=0;
                                          if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                            SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                            S326=1;
                                            if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 352, column: 8
                                              S104=4;
                                              S507=0;
                                              if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                                S507=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S502=0;
                                                if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                                  ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                                  S502=1;
                                                  if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 353, column: 8
                                                    S104=5;
                                                    S727=0;
                                                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                      S727=1;
                                                      active[4]=1;
                                                      ends[4]=1;
                                                      tdone[4]=1;
                                                    }
                                                    else {
                                                      S722=0;
                                                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                        ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                                        S722=1;
                                                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                          ends[4]=2;
                                                          ;//sysj/controller.sysj line: 354, column: 8
                                                          S104=6;
                                                          S991=0;
                                                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                            S991=1;
                                                            active[4]=1;
                                                            ends[4]=1;
                                                            tdone[4]=1;
                                                          }
                                                          else {
                                                            S986=0;
                                                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                                              S986=1;
                                                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                                ends[4]=2;
                                                                ;//sysj/controller.sysj line: 355, column: 8
                                                                S104=7;
                                                                S1299=0;
                                                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                                  S1299=1;
                                                                  active[4]=1;
                                                                  ends[4]=1;
                                                                  tdone[4]=1;
                                                                }
                                                                else {
                                                                  S1294=0;
                                                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                                    FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                                    S1294=1;
                                                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                                      ends[4]=2;
                                                                      ;//sysj/controller.sysj line: 356, column: 8
                                                                      FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                                      currsigs.addElement(FirstLiquidAmountE);
                                                                      FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                                      SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                                      currsigs.addElement(SecondLiquidAmountE);
                                                                      SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                                      ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                                      currsigs.addElement(ThirdLiquidAmountE);
                                                                      ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                                      FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                                      currsigs.addElement(FourthLiquidAmountE);
                                                                      FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                                      S1646=1;
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
                    S66=1;
                    S66=0;
                    if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                      FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                      S66=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S61=0;
                      if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                        FirstLiquid_o.setVal(3);//sysj/controller.sysj line: 349, column: 8
                        S61=1;
                        if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                          FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 349, column: 8
                          S104=1;
                          S111=0;
                          if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                            FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                            S111=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S106=0;
                            if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                              FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                              S106=1;
                              if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                                FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 350, column: 8
                                S104=2;
                                S199=0;
                                if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                  SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                  S199=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S194=0;
                                  if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                    SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 351, column: 8
                                    S194=1;
                                    if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 351, column: 8
                                      S104=3;
                                      S331=0;
                                      if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                        SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                        S331=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S326=0;
                                        if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                          SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                          S326=1;
                                          if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 352, column: 8
                                            S104=4;
                                            S507=0;
                                            if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                              S507=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S502=0;
                                              if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                                ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                                S502=1;
                                                if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 353, column: 8
                                                  S104=5;
                                                  S727=0;
                                                  if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                    S727=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S722=0;
                                                    if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                      ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                                      S722=1;
                                                      if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 354, column: 8
                                                        S104=6;
                                                        S991=0;
                                                        if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                          S991=1;
                                                          active[4]=1;
                                                          ends[4]=1;
                                                          tdone[4]=1;
                                                        }
                                                        else {
                                                          S986=0;
                                                          if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                            FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                                            S986=1;
                                                            if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                              ends[4]=2;
                                                              ;//sysj/controller.sysj line: 355, column: 8
                                                              S104=7;
                                                              S1299=0;
                                                              if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                                S1299=1;
                                                                active[4]=1;
                                                                ends[4]=1;
                                                                tdone[4]=1;
                                                              }
                                                              else {
                                                                S1294=0;
                                                                if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                                  FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                                  S1294=1;
                                                                  if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                                    ends[4]=2;
                                                                    ;//sysj/controller.sysj line: 356, column: 8
                                                                    FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                                    currsigs.addElement(FirstLiquidAmountE);
                                                                    FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                                    SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                                    currsigs.addElement(SecondLiquidAmountE);
                                                                    SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                                    ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                                    currsigs.addElement(ThirdLiquidAmountE);
                                                                    ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                                    FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                                    currsigs.addElement(FourthLiquidAmountE);
                                                                    FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                                    System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                                    S1646=1;
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
                switch(S111){
                  case 0 : 
                    if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                      FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                      S111=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S106){
                        case 0 : 
                          if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                            FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                            S106=1;
                            if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 350, column: 8
                              S104=2;
                              S199=0;
                              if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                                SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                S199=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S194=0;
                                if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                  SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 351, column: 8
                                  S194=1;
                                  if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                    SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 351, column: 8
                                    S104=3;
                                    S331=0;
                                    if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                      S331=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S326=0;
                                      if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                        SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                        S326=1;
                                        if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 352, column: 8
                                          S104=4;
                                          S507=0;
                                          if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                            S507=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S502=0;
                                            if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                              ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                              S502=1;
                                              if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 353, column: 8
                                                S104=5;
                                                S727=0;
                                                if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                  S727=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S722=0;
                                                  if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                    ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                                    S722=1;
                                                    if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 354, column: 8
                                                      S104=6;
                                                      S991=0;
                                                      if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                        S991=1;
                                                        active[4]=1;
                                                        ends[4]=1;
                                                        tdone[4]=1;
                                                      }
                                                      else {
                                                        S986=0;
                                                        if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                          FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                                          S986=1;
                                                          if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                            ends[4]=2;
                                                            ;//sysj/controller.sysj line: 355, column: 8
                                                            S104=7;
                                                            S1299=0;
                                                            if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                              S1299=1;
                                                              active[4]=1;
                                                              ends[4]=1;
                                                              tdone[4]=1;
                                                            }
                                                            else {
                                                              S1294=0;
                                                              if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                                FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                                S1294=1;
                                                                if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                                  ends[4]=2;
                                                                  ;//sysj/controller.sysj line: 356, column: 8
                                                                  FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                                  currsigs.addElement(FirstLiquidAmountE);
                                                                  FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                                  SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                                  currsigs.addElement(SecondLiquidAmountE);
                                                                  SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                                  ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                                  currsigs.addElement(ThirdLiquidAmountE);
                                                                  ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                                  FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                                  currsigs.addElement(FourthLiquidAmountE);
                                                                  FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                                  S1646=1;
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
                          if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                            FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 350, column: 8
                            S104=2;
                            S199=0;
                            if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                              SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                              S199=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S194=0;
                              if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 351, column: 8
                                S194=1;
                                if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                  SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 351, column: 8
                                  S104=3;
                                  S331=0;
                                  if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                    SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                    S331=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S326=0;
                                    if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                      SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                      S326=1;
                                      if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                        SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 352, column: 8
                                        S104=4;
                                        S507=0;
                                        if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                          ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                          S507=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S502=0;
                                          if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                            ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                            S502=1;
                                            if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 353, column: 8
                                              S104=5;
                                              S727=0;
                                              if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                S727=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S722=0;
                                                if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                  ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                                  S722=1;
                                                  if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 354, column: 8
                                                    S104=6;
                                                    S991=0;
                                                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                      S991=1;
                                                      active[4]=1;
                                                      ends[4]=1;
                                                      tdone[4]=1;
                                                    }
                                                    else {
                                                      S986=0;
                                                      if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                        FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                                        S986=1;
                                                        if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                          ends[4]=2;
                                                          ;//sysj/controller.sysj line: 355, column: 8
                                                          S104=7;
                                                          S1299=0;
                                                          if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                            S1299=1;
                                                            active[4]=1;
                                                            ends[4]=1;
                                                            tdone[4]=1;
                                                          }
                                                          else {
                                                            S1294=0;
                                                            if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                              FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                              S1294=1;
                                                              if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                                ends[4]=2;
                                                                ;//sysj/controller.sysj line: 356, column: 8
                                                                FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                                currsigs.addElement(FirstLiquidAmountE);
                                                                FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                                SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                                currsigs.addElement(SecondLiquidAmountE);
                                                                SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                                ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                                currsigs.addElement(ThirdLiquidAmountE);
                                                                ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                                FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                                currsigs.addElement(FourthLiquidAmountE);
                                                                FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                                System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                                S1646=1;
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
                    S111=1;
                    S111=0;
                    if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                      FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                      S111=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S106=0;
                      if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                        FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                        S106=1;
                        if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                          FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 350, column: 8
                          S104=2;
                          S199=0;
                          if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                            SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                            S199=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S194=0;
                            if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                              SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 351, column: 8
                              S194=1;
                              if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 351, column: 8
                                S104=3;
                                S331=0;
                                if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                  SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                  S331=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S326=0;
                                  if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                    SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                    S326=1;
                                    if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 352, column: 8
                                      S104=4;
                                      S507=0;
                                      if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                        ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                        S507=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S502=0;
                                        if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                          ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                          S502=1;
                                          if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 353, column: 8
                                            S104=5;
                                            S727=0;
                                            if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                              S727=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S722=0;
                                              if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                                S722=1;
                                                if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 354, column: 8
                                                  S104=6;
                                                  S991=0;
                                                  if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                    S991=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S986=0;
                                                    if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                      FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                                      S986=1;
                                                      if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 355, column: 8
                                                        S104=7;
                                                        S1299=0;
                                                        if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                          S1299=1;
                                                          active[4]=1;
                                                          ends[4]=1;
                                                          tdone[4]=1;
                                                        }
                                                        else {
                                                          S1294=0;
                                                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                            FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                            S1294=1;
                                                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                              ends[4]=2;
                                                              ;//sysj/controller.sysj line: 356, column: 8
                                                              FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                              currsigs.addElement(FirstLiquidAmountE);
                                                              FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                              SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                              currsigs.addElement(SecondLiquidAmountE);
                                                              SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                              ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                              currsigs.addElement(ThirdLiquidAmountE);
                                                              ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                              FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                              currsigs.addElement(FourthLiquidAmountE);
                                                              FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                              S1646=1;
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
                switch(S199){
                  case 0 : 
                    if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                      S199=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S194){
                        case 0 : 
                          if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                            SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 351, column: 8
                            S194=1;
                            if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                              SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 351, column: 8
                              S104=3;
                              S331=0;
                              if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                S331=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S326=0;
                                if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                  SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                  S326=1;
                                  if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                    SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 352, column: 8
                                    S104=4;
                                    S507=0;
                                    if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                      S507=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S502=0;
                                      if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                        ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                        S502=1;
                                        if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                          ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 353, column: 8
                                          S104=5;
                                          S727=0;
                                          if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                            S727=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S722=0;
                                            if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                              ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                              S722=1;
                                              if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 354, column: 8
                                                S104=6;
                                                S991=0;
                                                if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                  S991=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S986=0;
                                                  if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                    FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                                    S986=1;
                                                    if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 355, column: 8
                                                      S104=7;
                                                      S1299=0;
                                                      if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                        S1299=1;
                                                        active[4]=1;
                                                        ends[4]=1;
                                                        tdone[4]=1;
                                                      }
                                                      else {
                                                        S1294=0;
                                                        if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                          FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                          S1294=1;
                                                          if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                            ends[4]=2;
                                                            ;//sysj/controller.sysj line: 356, column: 8
                                                            FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                            currsigs.addElement(FirstLiquidAmountE);
                                                            FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                            SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                            currsigs.addElement(SecondLiquidAmountE);
                                                            SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                            ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                            currsigs.addElement(ThirdLiquidAmountE);
                                                            ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                            FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                            currsigs.addElement(FourthLiquidAmountE);
                                                            FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                            System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                            S1646=1;
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
                          if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                            SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 351, column: 8
                            S104=3;
                            S331=0;
                            if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                              S331=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S326=0;
                              if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                S326=1;
                                if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                  SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 352, column: 8
                                  S104=4;
                                  S507=0;
                                  if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                    S507=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S502=0;
                                    if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                      ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                      S502=1;
                                      if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                        ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 353, column: 8
                                        S104=5;
                                        S727=0;
                                        if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                          S727=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S722=0;
                                          if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                            ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                            S722=1;
                                            if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 354, column: 8
                                              S104=6;
                                              S991=0;
                                              if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                S991=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S986=0;
                                                if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                  FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                                  S986=1;
                                                  if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 355, column: 8
                                                    S104=7;
                                                    S1299=0;
                                                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                      S1299=1;
                                                      active[4]=1;
                                                      ends[4]=1;
                                                      tdone[4]=1;
                                                    }
                                                    else {
                                                      S1294=0;
                                                      if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                        FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                        S1294=1;
                                                        if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                          ends[4]=2;
                                                          ;//sysj/controller.sysj line: 356, column: 8
                                                          FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                          currsigs.addElement(FirstLiquidAmountE);
                                                          FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                          SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                          currsigs.addElement(SecondLiquidAmountE);
                                                          SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                          ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                          currsigs.addElement(ThirdLiquidAmountE);
                                                          ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                          FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                          currsigs.addElement(FourthLiquidAmountE);
                                                          FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                          System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                          S1646=1;
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
                    S199=1;
                    S199=0;
                    if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                      SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                      S199=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S194=0;
                      if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                        SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 351, column: 8
                        S194=1;
                        if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                          SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 351, column: 8
                          S104=3;
                          S331=0;
                          if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                            S331=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S326=0;
                            if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                              SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                              S326=1;
                              if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 352, column: 8
                                S104=4;
                                S507=0;
                                if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                  S507=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S502=0;
                                  if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                    ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                    S502=1;
                                    if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 353, column: 8
                                      S104=5;
                                      S727=0;
                                      if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                        S727=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S722=0;
                                        if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                          ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                          S722=1;
                                          if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 354, column: 8
                                            S104=6;
                                            S991=0;
                                            if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                              S991=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S986=0;
                                              if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                                S986=1;
                                                if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 355, column: 8
                                                  S104=7;
                                                  S1299=0;
                                                  if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                    S1299=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S1294=0;
                                                    if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                      FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                      S1294=1;
                                                      if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 356, column: 8
                                                        FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                        currsigs.addElement(FirstLiquidAmountE);
                                                        FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                        SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                        currsigs.addElement(SecondLiquidAmountE);
                                                        SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                        ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                        currsigs.addElement(ThirdLiquidAmountE);
                                                        ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                        FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                        currsigs.addElement(FourthLiquidAmountE);
                                                        FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                        System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                        S1646=1;
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
                switch(S331){
                  case 0 : 
                    if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                      S331=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S326){
                        case 0 : 
                          if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                            SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                            S326=1;
                            if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 352, column: 8
                              S104=4;
                              S507=0;
                              if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                S507=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S502=0;
                                if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                  ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                  S502=1;
                                  if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 353, column: 8
                                    S104=5;
                                    S727=0;
                                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                      S727=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S722=0;
                                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                        ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                        S722=1;
                                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 354, column: 8
                                          S104=6;
                                          S991=0;
                                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                            S991=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S986=0;
                                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                              S986=1;
                                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 355, column: 8
                                                S104=7;
                                                S1299=0;
                                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                  S1299=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S1294=0;
                                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                    FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                    S1294=1;
                                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 356, column: 8
                                                      FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                      currsigs.addElement(FirstLiquidAmountE);
                                                      FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                      SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                      currsigs.addElement(SecondLiquidAmountE);
                                                      SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                      ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                      currsigs.addElement(ThirdLiquidAmountE);
                                                      ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                      FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                      currsigs.addElement(FourthLiquidAmountE);
                                                      FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                      S1646=1;
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
                          if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                            SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 352, column: 8
                            S104=4;
                            S507=0;
                            if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                              S507=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S502=0;
                              if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                S502=1;
                                if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                  ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 353, column: 8
                                  S104=5;
                                  S727=0;
                                  if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                    S727=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S722=0;
                                    if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                      ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                      S722=1;
                                      if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                        ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 354, column: 8
                                        S104=6;
                                        S991=0;
                                        if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                          S991=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S986=0;
                                          if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                            FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                            S986=1;
                                            if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 355, column: 8
                                              S104=7;
                                              S1299=0;
                                              if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                S1299=1;
                                                active[4]=1;
                                                ends[4]=1;
                                                tdone[4]=1;
                                              }
                                              else {
                                                S1294=0;
                                                if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                  FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                  S1294=1;
                                                  if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                    ends[4]=2;
                                                    ;//sysj/controller.sysj line: 356, column: 8
                                                    FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                    currsigs.addElement(FirstLiquidAmountE);
                                                    FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                    SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                    currsigs.addElement(SecondLiquidAmountE);
                                                    SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                    ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                    currsigs.addElement(ThirdLiquidAmountE);
                                                    ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                    FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                    currsigs.addElement(FourthLiquidAmountE);
                                                    FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                    System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                    S1646=1;
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
                    S331=1;
                    S331=0;
                    if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                      S331=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S326=0;
                      if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                        SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                        S326=1;
                        if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 352, column: 8
                          S104=4;
                          S507=0;
                          if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                            S507=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S502=0;
                            if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                              ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                              S502=1;
                              if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 353, column: 8
                                S104=5;
                                S727=0;
                                if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                  S727=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S722=0;
                                  if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                    ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                    S722=1;
                                    if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 354, column: 8
                                      S104=6;
                                      S991=0;
                                      if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                        S991=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S986=0;
                                        if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                          FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                          S986=1;
                                          if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 355, column: 8
                                            S104=7;
                                            S1299=0;
                                            if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                              S1299=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S1294=0;
                                              if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                S1294=1;
                                                if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 356, column: 8
                                                  FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                  currsigs.addElement(FirstLiquidAmountE);
                                                  FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                  SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                  currsigs.addElement(SecondLiquidAmountE);
                                                  SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                  ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                  currsigs.addElement(ThirdLiquidAmountE);
                                                  ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                  FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                  currsigs.addElement(FourthLiquidAmountE);
                                                  FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                  S1646=1;
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
                switch(S507){
                  case 0 : 
                    if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                      S507=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S502){
                        case 0 : 
                          if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                            ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                            S502=1;
                            if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                              ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 353, column: 8
                              S104=5;
                              S727=0;
                              if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                S727=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S722=0;
                                if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                  ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                  S722=1;
                                  if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                    ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 354, column: 8
                                    S104=6;
                                    S991=0;
                                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                      S991=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S986=0;
                                      if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                        FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                        S986=1;
                                        if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 355, column: 8
                                          S104=7;
                                          S1299=0;
                                          if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                            S1299=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S1294=0;
                                            if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                              FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                              S1294=1;
                                              if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 356, column: 8
                                                FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                currsigs.addElement(FirstLiquidAmountE);
                                                FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                currsigs.addElement(SecondLiquidAmountE);
                                                SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                currsigs.addElement(ThirdLiquidAmountE);
                                                ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                currsigs.addElement(FourthLiquidAmountE);
                                                FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                S1646=1;
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
                          if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 353, column: 8
                            S104=5;
                            S727=0;
                            if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                              S727=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S722=0;
                              if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                S722=1;
                                if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 354, column: 8
                                  S104=6;
                                  S991=0;
                                  if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                    S991=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S986=0;
                                    if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                      FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                      S986=1;
                                      if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 355, column: 8
                                        S104=7;
                                        S1299=0;
                                        if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                          S1299=1;
                                          active[4]=1;
                                          ends[4]=1;
                                          tdone[4]=1;
                                        }
                                        else {
                                          S1294=0;
                                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                            FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                            S1294=1;
                                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                              ends[4]=2;
                                              ;//sysj/controller.sysj line: 356, column: 8
                                              FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                              currsigs.addElement(FirstLiquidAmountE);
                                              FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                              SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                              currsigs.addElement(SecondLiquidAmountE);
                                              SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                              ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                              currsigs.addElement(ThirdLiquidAmountE);
                                              ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                              FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                              currsigs.addElement(FourthLiquidAmountE);
                                              FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                              S1646=1;
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
                    S507=1;
                    S507=0;
                    if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                      ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                      S507=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S502=0;
                      if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                        ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                        S502=1;
                        if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                          ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 353, column: 8
                          S104=5;
                          S727=0;
                          if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                            S727=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S722=0;
                            if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                              ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                              S722=1;
                              if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 354, column: 8
                                S104=6;
                                S991=0;
                                if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                  S991=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S986=0;
                                  if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                    FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                    S986=1;
                                    if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 355, column: 8
                                      S104=7;
                                      S1299=0;
                                      if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                        S1299=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S1294=0;
                                        if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                          FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                          S1294=1;
                                          if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 356, column: 8
                                            FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                            currsigs.addElement(FirstLiquidAmountE);
                                            FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                            SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                            currsigs.addElement(SecondLiquidAmountE);
                                            SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                            ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                            currsigs.addElement(ThirdLiquidAmountE);
                                            ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                            FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                            currsigs.addElement(FourthLiquidAmountE);
                                            FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                            System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                            S1646=1;
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
                switch(S727){
                  case 0 : 
                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                      S727=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S722){
                        case 0 : 
                          if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                            ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                            S722=1;
                            if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 354, column: 8
                              S104=6;
                              S991=0;
                              if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                S991=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S986=0;
                                if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                  FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                  S986=1;
                                  if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 355, column: 8
                                    S104=7;
                                    S1299=0;
                                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                      S1299=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S1294=0;
                                      if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                        FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                        S1294=1;
                                        if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 356, column: 8
                                          FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                          currsigs.addElement(FirstLiquidAmountE);
                                          FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                          SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                          currsigs.addElement(SecondLiquidAmountE);
                                          SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                          ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                          currsigs.addElement(ThirdLiquidAmountE);
                                          ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                          FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                          currsigs.addElement(FourthLiquidAmountE);
                                          FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                          System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                          S1646=1;
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
                          if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                            ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 354, column: 8
                            S104=6;
                            S991=0;
                            if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                              S991=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S986=0;
                              if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                S986=1;
                                if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                  FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 355, column: 8
                                  S104=7;
                                  S1299=0;
                                  if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                    S1299=1;
                                    active[4]=1;
                                    ends[4]=1;
                                    tdone[4]=1;
                                  }
                                  else {
                                    S1294=0;
                                    if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                      FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                      S1294=1;
                                      if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                        FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                        ends[4]=2;
                                        ;//sysj/controller.sysj line: 356, column: 8
                                        FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                        currsigs.addElement(FirstLiquidAmountE);
                                        FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                        SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                        currsigs.addElement(SecondLiquidAmountE);
                                        SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                        ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                        currsigs.addElement(ThirdLiquidAmountE);
                                        ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                        FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                        currsigs.addElement(FourthLiquidAmountE);
                                        FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                        System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                        S1646=1;
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
                    S727=1;
                    S727=0;
                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                      S727=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S722=0;
                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                        ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                        S722=1;
                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 354, column: 8
                          S104=6;
                          S991=0;
                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                            S991=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S986=0;
                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                              S986=1;
                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 355, column: 8
                                S104=7;
                                S1299=0;
                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                  S1299=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S1294=0;
                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                    FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                    S1294=1;
                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 356, column: 8
                                      FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                      currsigs.addElement(FirstLiquidAmountE);
                                      FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                      SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                      currsigs.addElement(SecondLiquidAmountE);
                                      SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                      ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                      currsigs.addElement(ThirdLiquidAmountE);
                                      ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                      FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                      currsigs.addElement(FourthLiquidAmountE);
                                      FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                      S1646=1;
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
                switch(S991){
                  case 0 : 
                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                      S991=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S986){
                        case 0 : 
                          if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                            FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                            S986=1;
                            if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                              FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 355, column: 8
                              S104=7;
                              S1299=0;
                              if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                S1299=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S1294=0;
                                if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                  FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                  S1294=1;
                                  if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                    FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 356, column: 8
                                    FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                    currsigs.addElement(FirstLiquidAmountE);
                                    FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                    SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                    currsigs.addElement(SecondLiquidAmountE);
                                    SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                    ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                    currsigs.addElement(ThirdLiquidAmountE);
                                    ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                    FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                    currsigs.addElement(FourthLiquidAmountE);
                                    FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                    System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                    S1646=1;
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
                          if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 355, column: 8
                            S104=7;
                            S1299=0;
                            if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                              S1299=1;
                              active[4]=1;
                              ends[4]=1;
                              tdone[4]=1;
                            }
                            else {
                              S1294=0;
                              if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                S1294=1;
                                if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                  ends[4]=2;
                                  ;//sysj/controller.sysj line: 356, column: 8
                                  FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                  currsigs.addElement(FirstLiquidAmountE);
                                  FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                  SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                  currsigs.addElement(SecondLiquidAmountE);
                                  SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                  ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                  currsigs.addElement(ThirdLiquidAmountE);
                                  ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                  FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                  currsigs.addElement(FourthLiquidAmountE);
                                  FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                  S1646=1;
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
                    S991=1;
                    S991=0;
                    if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                      FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                      S991=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S986=0;
                      if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                        FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                        S986=1;
                        if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                          FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 355, column: 8
                          S104=7;
                          S1299=0;
                          if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                            S1299=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S1294=0;
                            if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                              FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                              S1294=1;
                              if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 356, column: 8
                                FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                currsigs.addElement(FirstLiquidAmountE);
                                FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                currsigs.addElement(SecondLiquidAmountE);
                                SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                currsigs.addElement(ThirdLiquidAmountE);
                                ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                currsigs.addElement(FourthLiquidAmountE);
                                FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                S1646=1;
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
                switch(S1299){
                  case 0 : 
                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                      S1299=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      switch(S1294){
                        case 0 : 
                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                            FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                            S1294=1;
                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 356, column: 8
                              FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                              currsigs.addElement(FirstLiquidAmountE);
                              FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                              SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                              currsigs.addElement(SecondLiquidAmountE);
                              SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                              ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                              currsigs.addElement(ThirdLiquidAmountE);
                              ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                              FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                              currsigs.addElement(FourthLiquidAmountE);
                              FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                              S1646=1;
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
                          if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                            FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                            ends[4]=2;
                            ;//sysj/controller.sysj line: 356, column: 8
                            FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                            currsigs.addElement(FirstLiquidAmountE);
                            FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                            SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                            currsigs.addElement(SecondLiquidAmountE);
                            SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                            ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                            currsigs.addElement(ThirdLiquidAmountE);
                            ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                            FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                            currsigs.addElement(FourthLiquidAmountE);
                            FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                            System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                            S1646=1;
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
                    S1299=1;
                    S1299=0;
                    if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                      S1299=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S1294=0;
                      if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                        FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                        S1294=1;
                        if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 356, column: 8
                          FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                          currsigs.addElement(FirstLiquidAmountE);
                          FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                          SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                          currsigs.addElement(SecondLiquidAmountE);
                          SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                          ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                          currsigs.addElement(ThirdLiquidAmountE);
                          ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                          FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                          currsigs.addElement(FourthLiquidAmountE);
                          FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                          System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                          S1646=1;
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
            S1646=1;
            S1646=0;
            if(recipe.getprestatus()){//sysj/controller.sysj line: 346, column: 15
              System.out.println("Plant Send Start");//sysj/controller.sysj line: 347, column: 8
              S104=0;
              S66=0;
              if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
                FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                S66=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S61=0;
                if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                  FirstLiquid_o.setVal(3);//sysj/controller.sysj line: 349, column: 8
                  S61=1;
                  if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
                    FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
                    ends[4]=2;
                    ;//sysj/controller.sysj line: 349, column: 8
                    S104=1;
                    S111=0;
                    if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
                      FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                      S111=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S106=0;
                      if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                        FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                        S106=1;
                        if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                          FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                          ends[4]=2;
                          ;//sysj/controller.sysj line: 350, column: 8
                          S104=2;
                          S199=0;
                          if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                            SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                            S199=1;
                            active[4]=1;
                            ends[4]=1;
                            tdone[4]=1;
                          }
                          else {
                            S194=0;
                            if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                              SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 351, column: 8
                              S194=1;
                              if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                                SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                                ends[4]=2;
                                ;//sysj/controller.sysj line: 351, column: 8
                                S104=3;
                                S331=0;
                                if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                                  SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                  S331=1;
                                  active[4]=1;
                                  ends[4]=1;
                                  tdone[4]=1;
                                }
                                else {
                                  S326=0;
                                  if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                    SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                                    S326=1;
                                    if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                                      SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                                      ends[4]=2;
                                      ;//sysj/controller.sysj line: 352, column: 8
                                      S104=4;
                                      S507=0;
                                      if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                        ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                        S507=1;
                                        active[4]=1;
                                        ends[4]=1;
                                        tdone[4]=1;
                                      }
                                      else {
                                        S502=0;
                                        if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                          ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                          S502=1;
                                          if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                            ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                            ends[4]=2;
                                            ;//sysj/controller.sysj line: 353, column: 8
                                            S104=5;
                                            S727=0;
                                            if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                              ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                              S727=1;
                                              active[4]=1;
                                              ends[4]=1;
                                              tdone[4]=1;
                                            }
                                            else {
                                              S722=0;
                                              if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                                S722=1;
                                                if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                                  ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                                  ends[4]=2;
                                                  ;//sysj/controller.sysj line: 354, column: 8
                                                  S104=6;
                                                  S991=0;
                                                  if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                                    FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                    S991=1;
                                                    active[4]=1;
                                                    ends[4]=1;
                                                    tdone[4]=1;
                                                  }
                                                  else {
                                                    S986=0;
                                                    if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                      FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                                      S986=1;
                                                      if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                        FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                        ends[4]=2;
                                                        ;//sysj/controller.sysj line: 355, column: 8
                                                        S104=7;
                                                        S1299=0;
                                                        if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                          FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                          S1299=1;
                                                          active[4]=1;
                                                          ends[4]=1;
                                                          tdone[4]=1;
                                                        }
                                                        else {
                                                          S1294=0;
                                                          if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                            FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                            S1294=1;
                                                            if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                              FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                              ends[4]=2;
                                                              ;//sysj/controller.sysj line: 356, column: 8
                                                              FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                              currsigs.addElement(FirstLiquidAmountE);
                                                              FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                              SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                              currsigs.addElement(SecondLiquidAmountE);
                                                              SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                              ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                              currsigs.addElement(ThirdLiquidAmountE);
                                                              ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                              FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                              currsigs.addElement(FourthLiquidAmountE);
                                                              FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                              S1646=1;
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
              S1646=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43685(int [] tdone, int [] ends){
        switch(S59){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S14){
          case 0 : 
            if(enable.getprestatus()){//sysj/controller.sysj line: 325, column: 14
              System.out.println("Complete.");//sysj/controller.sysj line: 330, column: 8
              S14=1;
              if(enable.getprestatus()){//sysj/controller.sysj line: 332, column: 15
                if(recipe.getprestatus()){//sysj/controller.sysj line: 336, column: 15
                  S14=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S14=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                if(recipe.getprestatus()){//sysj/controller.sysj line: 336, column: 15
                  S14=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S14=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            else {
              LiquidFillerDoneE.setPresent();//sysj/controller.sysj line: 327, column: 9
              currsigs.addElement(LiquidFillerDoneE);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S14=0;
            if(LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 324, column: 15
              System.out.println("LiquidFillerDone");//sysj/controller.sysj line: 326, column: 9
              LiquidFillerDoneE.setPresent();//sysj/controller.sysj line: 327, column: 9
              currsigs.addElement(LiquidFillerDoneE);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S14=1;
              if(enable.getprestatus()){//sysj/controller.sysj line: 332, column: 15
                if(recipe.getprestatus()){//sysj/controller.sysj line: 336, column: 15
                  S14=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S14=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                if(recipe.getprestatus()){//sysj/controller.sysj line: 336, column: 15
                  S14=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S14=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            break;
          
          case 2 : 
            S14=2;
            S14=0;
            if(LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 324, column: 15
              System.out.println("LiquidFillerDone");//sysj/controller.sysj line: 326, column: 9
              LiquidFillerDoneE.setPresent();//sysj/controller.sysj line: 327, column: 9
              currsigs.addElement(LiquidFillerDoneE);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S14=1;
              if(enable.getprestatus()){//sysj/controller.sysj line: 332, column: 15
                if(recipe.getprestatus()){//sysj/controller.sysj line: 336, column: 15
                  S14=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S14=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                if(recipe.getprestatus()){//sysj/controller.sysj line: 336, column: 15
                  S14=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S14=2;
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

  public void thread43684(int [] tdone, int [] ends){
        switch(S22763){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread43685(tdone,ends);
        thread43686(tdone,ends);
        thread43687(tdone,ends);
        int biggest43688 = 0;
        if(ends[3]>=biggest43688){
          biggest43688=ends[3];
        }
        if(ends[4]>=biggest43688){
          biggest43688=ends[4];
        }
        if(ends[5]>=biggest43688){
          biggest43688=ends[5];
        }
        if(biggest43688 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest43688 == 0){
          S22763=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread43681(int [] tdone, int [] ends){
        S22795=1;
    if(Liquid4On.getprestatus()){//sysj/controller.sysj line: 553, column: 26
      Liquid4OnE.setPresent();//sysj/controller.sysj line: 553, column: 37
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

  public void thread43680(int [] tdone, int [] ends){
        S22787=1;
    if(Liquid3On.getprestatus()){//sysj/controller.sysj line: 551, column: 26
      Liquid3OnE.setPresent();//sysj/controller.sysj line: 551, column: 37
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

  public void thread43679(int [] tdone, int [] ends){
        S22779=1;
    if(Liquid2On.getprestatus()){//sysj/controller.sysj line: 549, column: 26
      Liquid2OnE.setPresent();//sysj/controller.sysj line: 549, column: 37
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

  public void thread43678(int [] tdone, int [] ends){
        S22771=1;
    if(Liquid1On.getprestatus()){//sysj/controller.sysj line: 547, column: 26
      Liquid1OnE.setPresent();//sysj/controller.sysj line: 547, column: 37
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

  public void thread43677(int [] tdone, int [] ends){
        S22797=1;
    thread43678(tdone,ends);
    thread43679(tdone,ends);
    thread43680(tdone,ends);
    thread43681(tdone,ends);
    int biggest43682 = 0;
    if(ends[7]>=biggest43682){
      biggest43682=ends[7];
    }
    if(ends[8]>=biggest43682){
      biggest43682=ends[8];
    }
    if(ends[9]>=biggest43682){
      biggest43682=ends[9];
    }
    if(ends[10]>=biggest43682){
      biggest43682=ends[10];
    }
    if(biggest43682 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread43675(int [] tdone, int [] ends){
        S22761=1;
    S10801=0;
    if(Counter.getprestatus()){//sysj/controller.sysj line: 371, column: 15
      S5069=0;
      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 1){//sysj/controller.sysj line: 373, column: 12
        System.out.println("Counter 0");//sysj/controller.sysj line: 374, column: 9
        S4825=0;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S5069=1;
        if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 2){//sysj/controller.sysj line: 381, column: 12
          S4853=0;
          if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 383, column: 17
            System.out.println("L1 FILLING START");//sysj/controller.sysj line: 384, column: 10
            S4831=0;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
          }
          else {
            S4853=1;
            if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 391, column: 17
              System.out.println("L2 FILLING START");//sysj/controller.sysj line: 392, column: 10
              S4837=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S4853=2;
              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 399, column: 17
                System.out.println("L3 FILLING START");//sysj/controller.sysj line: 400, column: 10
                S4856=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S4853=3;
                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 407, column: 17
                  System.out.println("L4 FILLING START");//sysj/controller.sysj line: 408, column: 10
                  S4880=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S5069=2;
                  if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 417, column: 12
                    S5094=0;
                    if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 418, column: 17
                      System.out.println("L1 FILLING START");//sysj/controller.sysj line: 419, column: 10
                      S5072=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S5094=1;
                      if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 426, column: 17
                        System.out.println("L2 FILLING START");//sysj/controller.sysj line: 427, column: 10
                        S5078=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5094=2;
                        if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                          System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                          S5097=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5094=3;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                            System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                            S5121=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5069=3;
                            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                              S5814=0;
                              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                                S5792=0;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S5814=1;
                                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                                  S5798=0;
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S5814=2;
                                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                                    S5817=0;
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S5814=3;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                                      S5841=0;
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S5069=4;
                                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                        S7486=0;
                                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                          active[5]=1;
                                          ends[5]=1;
                                          tdone[5]=1;
                                        }
                                        else {
                                          S7486=1;
                                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                            active[5]=1;
                                            ends[5]=1;
                                            tdone[5]=1;
                                          }
                                          else {
                                            S7486=2;
                                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                              active[5]=1;
                                              ends[5]=1;
                                              tdone[5]=1;
                                            }
                                            else {
                                              S7486=3;
                                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                              else {
                                                S7486=4;
                                                active[5]=1;
                                                ends[5]=1;
                                                tdone[5]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S10801=1;
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
                              S5069=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                S7486=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=4;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S10801=1;
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
                    S5069=3;
                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                      S5814=0;
                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                        S5792=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5814=1;
                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                          S5798=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5814=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                            S5817=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5814=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                              S5841=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5069=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                S7486=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=4;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S10801=1;
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
                      S5069=4;
                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                        S7486=0;
                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S7486=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7486=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7486=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7486=4;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                      else {
                        S10801=1;
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
          S5069=2;
          if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 3){//sysj/controller.sysj line: 417, column: 12
            S5094=0;
            if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 418, column: 17
              System.out.println("L1 FILLING START");//sysj/controller.sysj line: 419, column: 10
              S5072=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S5094=1;
              if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 426, column: 17
                System.out.println("L2 FILLING START");//sysj/controller.sysj line: 427, column: 10
                S5078=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S5094=2;
                if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 434, column: 17
                  System.out.println("L3 FILLING START");//sysj/controller.sysj line: 435, column: 10
                  S5097=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S5094=3;
                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 442, column: 17
                    System.out.println("L4 FILLING START");//sysj/controller.sysj line: 443, column: 10
                    S5121=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S5069=3;
                    if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
                      S5814=0;
                      if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                        System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                        S5792=0;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S5814=1;
                        if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                          System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                          S5798=0;
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S5814=2;
                          if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                            System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                            S5817=0;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S5814=3;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                              System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                              S5841=0;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S5069=4;
                              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                                S7486=0;
                                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                                  active[5]=1;
                                  ends[5]=1;
                                  tdone[5]=1;
                                }
                                else {
                                  S7486=1;
                                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                                    active[5]=1;
                                    ends[5]=1;
                                    tdone[5]=1;
                                  }
                                  else {
                                    S7486=2;
                                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                                      active[5]=1;
                                      ends[5]=1;
                                      tdone[5]=1;
                                    }
                                    else {
                                      S7486=3;
                                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                      else {
                                        S7486=4;
                                        active[5]=1;
                                        ends[5]=1;
                                        tdone[5]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S10801=1;
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
                      S5069=4;
                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                        S7486=0;
                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S7486=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7486=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7486=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7486=4;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                      else {
                        S10801=1;
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
            S5069=3;
            if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 4){//sysj/controller.sysj line: 452, column: 12
              S5814=0;
              if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 453, column: 17
                System.out.println("L1 FILLING START");//sysj/controller.sysj line: 454, column: 10
                S5792=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S5814=1;
                if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 461, column: 17
                  System.out.println("L2 FILLING START");//sysj/controller.sysj line: 462, column: 10
                  S5798=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S5814=2;
                  if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 469, column: 17
                    System.out.println("L3 FILLING START");//sysj/controller.sysj line: 470, column: 10
                    S5817=0;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S5814=3;
                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 477, column: 17
                      System.out.println("L4 FILLING START");//sysj/controller.sysj line: 478, column: 10
                      S5841=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S5069=4;
                      if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                        S7486=0;
                        if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                          System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                        else {
                          S7486=1;
                          if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                            System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S7486=2;
                            if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                              System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S7486=3;
                              if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                                System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S7486=4;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                            }
                          }
                        }
                      }
                      else {
                        S10801=1;
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
              S5069=4;
              if((Counter.getpreval() == null ? 0 : ((Integer)Counter.getpreval()).intValue()) == 5){//sysj/controller.sysj line: 486, column: 12
                S7486=0;
                if(Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 487, column: 17
                  System.out.println("L1 FILLING START");//sysj/controller.sysj line: 488, column: 10
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S7486=1;
                  if(!Liquid1On.getprestatus() && Liquid2On.getprestatus() && !Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 495, column: 17
                    System.out.println("L2 FILLING START");//sysj/controller.sysj line: 496, column: 10
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S7486=2;
                    if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && Liquid3On.getprestatus() && !Liquid4On.getprestatus()){//sysj/controller.sysj line: 503, column: 17
                      System.out.println("L3 FILLING START");//sysj/controller.sysj line: 504, column: 10
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S7486=3;
                      if(!Liquid1On.getprestatus() && !Liquid2On.getprestatus() && !Liquid3On.getprestatus() && Liquid4On.getprestatus()){//sysj/controller.sysj line: 511, column: 17
                        System.out.println("L4 FILLING START");//sysj/controller.sysj line: 512, column: 10
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S7486=4;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                  }
                }
              }
              else {
                S10801=1;
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
      S10801=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread43674(int [] tdone, int [] ends){
        S4822=1;
    S1646=0;
    if(recipe.getprestatus()){//sysj/controller.sysj line: 346, column: 15
      System.out.println("Plant Send Start");//sysj/controller.sysj line: 347, column: 8
      S104=0;
      S66=0;
      if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 349, column: 8
        FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
        S66=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S61=0;
        if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
          FirstLiquid_o.setVal(3);//sysj/controller.sysj line: 349, column: 8
          S61=1;
          if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 349, column: 8
            FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 349, column: 8
            ends[4]=2;
            ;//sysj/controller.sysj line: 349, column: 8
            S104=1;
            S111=0;
            if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 350, column: 8
              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
              S111=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S106=0;
              if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                FirstLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 350, column: 8
                S106=1;
                if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 350, column: 8
                  FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 350, column: 8
                  ends[4]=2;
                  ;//sysj/controller.sysj line: 350, column: 8
                  S104=2;
                  S199=0;
                  if(!SecondLiquid_o.isPartnerPresent() || SecondLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 351, column: 8
                    SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                    S199=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S194=0;
                    if(SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                      SecondLiquid_o.setVal(2);//sysj/controller.sysj line: 351, column: 8
                      S194=1;
                      if(!SecondLiquid_o.isACK()){//sysj/controller.sysj line: 351, column: 8
                        SecondLiquid_o.setREQ(false);//sysj/controller.sysj line: 351, column: 8
                        ends[4]=2;
                        ;//sysj/controller.sysj line: 351, column: 8
                        S104=3;
                        S331=0;
                        if(!SecondLiquidAmount_o.isPartnerPresent() || SecondLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 352, column: 8
                          SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                          S331=1;
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                        else {
                          S326=0;
                          if(SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                            SecondLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 352, column: 8
                            S326=1;
                            if(!SecondLiquidAmount_o.isACK()){//sysj/controller.sysj line: 352, column: 8
                              SecondLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 352, column: 8
                              ends[4]=2;
                              ;//sysj/controller.sysj line: 352, column: 8
                              S104=4;
                              S507=0;
                              if(!ThirdLiquid_o.isPartnerPresent() || ThirdLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 353, column: 8
                                ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                S507=1;
                                active[4]=1;
                                ends[4]=1;
                                tdone[4]=1;
                              }
                              else {
                                S502=0;
                                if(ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                  ThirdLiquid_o.setVal(1);//sysj/controller.sysj line: 353, column: 8
                                  S502=1;
                                  if(!ThirdLiquid_o.isACK()){//sysj/controller.sysj line: 353, column: 8
                                    ThirdLiquid_o.setREQ(false);//sysj/controller.sysj line: 353, column: 8
                                    ends[4]=2;
                                    ;//sysj/controller.sysj line: 353, column: 8
                                    S104=5;
                                    S727=0;
                                    if(!ThirdLiquidAmount_o.isPartnerPresent() || ThirdLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 354, column: 8
                                      ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                      S727=1;
                                      active[4]=1;
                                      ends[4]=1;
                                      tdone[4]=1;
                                    }
                                    else {
                                      S722=0;
                                      if(ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                        ThirdLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 354, column: 8
                                        S722=1;
                                        if(!ThirdLiquidAmount_o.isACK()){//sysj/controller.sysj line: 354, column: 8
                                          ThirdLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 354, column: 8
                                          ends[4]=2;
                                          ;//sysj/controller.sysj line: 354, column: 8
                                          S104=6;
                                          S991=0;
                                          if(!FourthLiquid_o.isPartnerPresent() || FourthLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 355, column: 8
                                            FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                            S991=1;
                                            active[4]=1;
                                            ends[4]=1;
                                            tdone[4]=1;
                                          }
                                          else {
                                            S986=0;
                                            if(FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                              FourthLiquid_o.setVal(4);//sysj/controller.sysj line: 355, column: 8
                                              S986=1;
                                              if(!FourthLiquid_o.isACK()){//sysj/controller.sysj line: 355, column: 8
                                                FourthLiquid_o.setREQ(false);//sysj/controller.sysj line: 355, column: 8
                                                ends[4]=2;
                                                ;//sysj/controller.sysj line: 355, column: 8
                                                S104=7;
                                                S1299=0;
                                                if(!FourthLiquidAmount_o.isPartnerPresent() || FourthLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 356, column: 8
                                                  FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                  S1299=1;
                                                  active[4]=1;
                                                  ends[4]=1;
                                                  tdone[4]=1;
                                                }
                                                else {
                                                  S1294=0;
                                                  if(FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                    FourthLiquidAmount_o.setVal(25);//sysj/controller.sysj line: 356, column: 8
                                                    S1294=1;
                                                    if(!FourthLiquidAmount_o.isACK()){//sysj/controller.sysj line: 356, column: 8
                                                      FourthLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 356, column: 8
                                                      ends[4]=2;
                                                      ;//sysj/controller.sysj line: 356, column: 8
                                                      FirstLiquidAmountE.setPresent();//sysj/controller.sysj line: 358, column: 8
                                                      currsigs.addElement(FirstLiquidAmountE);
                                                      FirstLiquidAmountE.setValue(30);//sysj/controller.sysj line: 358, column: 8
                                                      SecondLiquidAmountE.setPresent();//sysj/controller.sysj line: 359, column: 8
                                                      currsigs.addElement(SecondLiquidAmountE);
                                                      SecondLiquidAmountE.setValue(20);//sysj/controller.sysj line: 359, column: 8
                                                      ThirdLiquidAmountE.setPresent();//sysj/controller.sysj line: 360, column: 8
                                                      currsigs.addElement(ThirdLiquidAmountE);
                                                      ThirdLiquidAmountE.setValue(40);//sysj/controller.sysj line: 360, column: 8
                                                      FourthLiquidAmountE.setPresent();//sysj/controller.sysj line: 361, column: 8
                                                      currsigs.addElement(FourthLiquidAmountE);
                                                      FourthLiquidAmountE.setValue(10);//sysj/controller.sysj line: 361, column: 8
                                                      System.out.println("Plant Send Finish");//sysj/controller.sysj line: 363, column: 8
                                                      S1646=1;
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
      S1646=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread43673(int [] tdone, int [] ends){
        S59=1;
    S14=0;
    if(LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 324, column: 15
      System.out.println("LiquidFillerDone");//sysj/controller.sysj line: 326, column: 9
      LiquidFillerDoneE.setPresent();//sysj/controller.sysj line: 327, column: 9
      currsigs.addElement(LiquidFillerDoneE);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S14=1;
      if(enable.getprestatus()){//sysj/controller.sysj line: 332, column: 15
        if(recipe.getprestatus()){//sysj/controller.sysj line: 336, column: 15
          S14=2;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          S14=2;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
      else {
        if(recipe.getprestatus()){//sysj/controller.sysj line: 336, column: 15
          S14=2;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          S14=2;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
    }
  }

  public void thread43672(int [] tdone, int [] ends){
        S22763=1;
    thread43673(tdone,ends);
    thread43674(tdone,ends);
    thread43675(tdone,ends);
    int biggest43676 = 0;
    if(ends[3]>=biggest43676){
      biggest43676=ends[3];
    }
    if(ends[4]>=biggest43676){
      biggest43676=ends[4];
    }
    if(ends[5]>=biggest43676){
      biggest43676=ends[5];
    }
    if(biggest43676 == 1){
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
      switch(S22799){
        case 0 : 
          S22799=0;
          break RUN;
        
        case 1 : 
          S22799=2;
          S22799=2;
          thread43672(tdone,ends);
          thread43677(tdone,ends);
          int biggest43683 = 0;
          if(ends[2]>=biggest43683){
            biggest43683=ends[2];
          }
          if(ends[6]>=biggest43683){
            biggest43683=ends[6];
          }
          if(biggest43683 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread43684(tdone,ends);
          thread43689(tdone,ends);
          int biggest43695 = 0;
          if(ends[2]>=biggest43695){
            biggest43695=ends[2];
          }
          if(ends[6]>=biggest43695){
            biggest43695=ends[6];
          }
          if(biggest43695 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest43695 == 0){
            S22799=0;
            active[1]=0;
            ends[1]=0;
            S22799=0;
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
