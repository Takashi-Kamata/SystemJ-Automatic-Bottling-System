import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal FirstLiquidDone = new Signal("FirstLiquidDone", Signal.INPUT);
  public Signal SecondLiquidDone = new Signal("SecondLiquidDone", Signal.INPUT);
  public Signal ThirdLiquidDone = new Signal("ThirdLiquidDone", Signal.INPUT);
  public Signal FourthLiquidDone = new Signal("FourthLiquidDone", Signal.INPUT);
  public Signal Liquid1On = new Signal("Liquid1On", Signal.OUTPUT);
  public Signal Liquid2On = new Signal("Liquid2On", Signal.OUTPUT);
  public Signal Liquid3On = new Signal("Liquid3On", Signal.OUTPUT);
  public Signal Liquid4On = new Signal("Liquid4On", Signal.OUTPUT);
  public Signal LiquidFillerDone = new Signal("LiquidFillerDone", Signal.OUTPUT);
  public input_Channel FirstLiquid_in = new input_Channel();
  public input_Channel SecondLiquid_in = new input_Channel();
  public input_Channel ThirdLiquid_in = new input_Channel();
  public input_Channel FourthLiquid_in = new input_Channel();
  public input_Channel FirstLiquidAmount_in = new input_Channel();
  public input_Channel SecondLiquidAmount_in = new input_Channel();
  public input_Channel ThirdLiquidAmount_in = new input_Channel();
  public input_Channel FourthLiquidAmount_in = new input_Channel();
  public input_Channel LiquidFlow_in = new input_Channel();
  private Signal FirstLiquidInt_4;
  private Signal SecondLiquidInt_4;
  private Signal ThirdLiquidInt_4;
  private Signal FourthLiquidInt_4;
  private Signal FirstLiquidAmountInt_4;
  private Signal SecondLiquidAmountInt_4;
  private Signal ThirdLiquidAmountInt_4;
  private Signal FourthLiquidAmountInt_4;
  private Signal NewOrder_4;
  private Signal CumulativeFlow_4;
  private int S897 = 1;
  private int S885 = 1;
  private int S609 = 1;
  private int S583 = 1;
  private int S479 = 1;
  private int S474 = 1;
  private int S501 = 1;
  private int S496 = 1;
  private int S893 = 1;
  private int S895 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread914(int [] tdone, int [] ends){
        switch(S895){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread913(int [] tdone, int [] ends){
        switch(S893){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(FirstLiquidInt_4.getprestatus()){//sysj/controller.sysj line: 40, column: 14
          System.out.println("AAA: Order " + (FirstLiquidInt_4.getpreval() == null ? 0 : ((Integer)FirstLiquidInt_4.getpreval()).intValue()));//sysj/controller.sysj line: 41, column: 7
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

  public void thread912(int [] tdone, int [] ends){
        switch(S885){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S609){
          case 0 : 
            switch(S583){
              case 0 : 
                switch(S479){
                  case 0 : 
                    if(!FirstLiquid_in.isPartnerPresent() || FirstLiquid_in.isPartnerPreempted()){//sysj/controller.sysj line: 24, column: 13
                      FirstLiquid_in.setACK(false);//sysj/controller.sysj line: 24, column: 13
                      S479=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      switch(S474){
                        case 0 : 
                          if(!FirstLiquid_in.isREQ()){//sysj/controller.sysj line: 24, column: 13
                            FirstLiquid_in.setACK(true);//sysj/controller.sysj line: 24, column: 13
                            S474=1;
                            if(FirstLiquid_in.isREQ()){//sysj/controller.sysj line: 24, column: 13
                              FirstLiquid_in.setACK(false);//sysj/controller.sysj line: 24, column: 13
                              ends[5]=2;
                              ;//sysj/controller.sysj line: 24, column: 13
                              S583=1;
                              S501=0;
                              if(!FirstLiquidAmount_in.isPartnerPresent() || FirstLiquidAmount_in.isPartnerPreempted()){//sysj/controller.sysj line: 25, column: 13
                                FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                                S501=1;
                                active[5]=1;
                                ends[5]=1;
                                tdone[5]=1;
                              }
                              else {
                                S496=0;
                                if(!FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                                  FirstLiquidAmount_in.setACK(true);//sysj/controller.sysj line: 25, column: 13
                                  S496=1;
                                  if(FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                                    FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                                    ends[5]=2;
                                    ;//sysj/controller.sysj line: 25, column: 13
                                    S583=2;
                                    FirstLiquidInt_4.setPresent();//sysj/controller.sysj line: 28, column: 12
                                    currsigs.addElement(FirstLiquidInt_4);
                                    FirstLiquidInt_4.setValue((Integer)(FirstLiquid_in.getVal() == null ? 0 : ((Integer)FirstLiquid_in.getVal()).intValue()));//sysj/controller.sysj line: 28, column: 12
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
                                else {
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
                          }
                          else {
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(FirstLiquid_in.isREQ()){//sysj/controller.sysj line: 24, column: 13
                            FirstLiquid_in.setACK(false);//sysj/controller.sysj line: 24, column: 13
                            ends[5]=2;
                            ;//sysj/controller.sysj line: 24, column: 13
                            S583=1;
                            S501=0;
                            if(!FirstLiquidAmount_in.isPartnerPresent() || FirstLiquidAmount_in.isPartnerPreempted()){//sysj/controller.sysj line: 25, column: 13
                              FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                              S501=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S496=0;
                              if(!FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                                FirstLiquidAmount_in.setACK(true);//sysj/controller.sysj line: 25, column: 13
                                S496=1;
                                if(FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                                  FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                                  ends[5]=2;
                                  ;//sysj/controller.sysj line: 25, column: 13
                                  S583=2;
                                  FirstLiquidInt_4.setPresent();//sysj/controller.sysj line: 28, column: 12
                                  currsigs.addElement(FirstLiquidInt_4);
                                  FirstLiquidInt_4.setValue((Integer)(FirstLiquid_in.getVal() == null ? 0 : ((Integer)FirstLiquid_in.getVal()).intValue()));//sysj/controller.sysj line: 28, column: 12
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
                              else {
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
                    }
                    break;
                  
                  case 1 : 
                    S479=1;
                    S479=0;
                    if(!FirstLiquid_in.isPartnerPresent() || FirstLiquid_in.isPartnerPreempted()){//sysj/controller.sysj line: 24, column: 13
                      FirstLiquid_in.setACK(false);//sysj/controller.sysj line: 24, column: 13
                      S479=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S474=0;
                      if(!FirstLiquid_in.isREQ()){//sysj/controller.sysj line: 24, column: 13
                        FirstLiquid_in.setACK(true);//sysj/controller.sysj line: 24, column: 13
                        S474=1;
                        if(FirstLiquid_in.isREQ()){//sysj/controller.sysj line: 24, column: 13
                          FirstLiquid_in.setACK(false);//sysj/controller.sysj line: 24, column: 13
                          ends[5]=2;
                          ;//sysj/controller.sysj line: 24, column: 13
                          S583=1;
                          S501=0;
                          if(!FirstLiquidAmount_in.isPartnerPresent() || FirstLiquidAmount_in.isPartnerPreempted()){//sysj/controller.sysj line: 25, column: 13
                            FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                            S501=1;
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          else {
                            S496=0;
                            if(!FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                              FirstLiquidAmount_in.setACK(true);//sysj/controller.sysj line: 25, column: 13
                              S496=1;
                              if(FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                                FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                                ends[5]=2;
                                ;//sysj/controller.sysj line: 25, column: 13
                                S583=2;
                                FirstLiquidInt_4.setPresent();//sysj/controller.sysj line: 28, column: 12
                                currsigs.addElement(FirstLiquidInt_4);
                                FirstLiquidInt_4.setValue((Integer)(FirstLiquid_in.getVal() == null ? 0 : ((Integer)FirstLiquid_in.getVal()).intValue()));//sysj/controller.sysj line: 28, column: 12
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
                            else {
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
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S501){
                  case 0 : 
                    if(!FirstLiquidAmount_in.isPartnerPresent() || FirstLiquidAmount_in.isPartnerPreempted()){//sysj/controller.sysj line: 25, column: 13
                      FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                      S501=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      switch(S496){
                        case 0 : 
                          if(!FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                            FirstLiquidAmount_in.setACK(true);//sysj/controller.sysj line: 25, column: 13
                            S496=1;
                            if(FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                              FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                              ends[5]=2;
                              ;//sysj/controller.sysj line: 25, column: 13
                              S583=2;
                              FirstLiquidInt_4.setPresent();//sysj/controller.sysj line: 28, column: 12
                              currsigs.addElement(FirstLiquidInt_4);
                              FirstLiquidInt_4.setValue((Integer)(FirstLiquid_in.getVal() == null ? 0 : ((Integer)FirstLiquid_in.getVal()).intValue()));//sysj/controller.sysj line: 28, column: 12
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
                          else {
                            active[5]=1;
                            ends[5]=1;
                            tdone[5]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                            FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                            ends[5]=2;
                            ;//sysj/controller.sysj line: 25, column: 13
                            S583=2;
                            FirstLiquidInt_4.setPresent();//sysj/controller.sysj line: 28, column: 12
                            currsigs.addElement(FirstLiquidInt_4);
                            FirstLiquidInt_4.setValue((Integer)(FirstLiquid_in.getVal() == null ? 0 : ((Integer)FirstLiquid_in.getVal()).intValue()));//sysj/controller.sysj line: 28, column: 12
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
                    break;
                  
                  case 1 : 
                    S501=1;
                    S501=0;
                    if(!FirstLiquidAmount_in.isPartnerPresent() || FirstLiquidAmount_in.isPartnerPreempted()){//sysj/controller.sysj line: 25, column: 13
                      FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                      S501=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S496=0;
                      if(!FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                        FirstLiquidAmount_in.setACK(true);//sysj/controller.sysj line: 25, column: 13
                        S496=1;
                        if(FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                          FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                          ends[5]=2;
                          ;//sysj/controller.sysj line: 25, column: 13
                          S583=2;
                          FirstLiquidInt_4.setPresent();//sysj/controller.sysj line: 28, column: 12
                          currsigs.addElement(FirstLiquidInt_4);
                          FirstLiquidInt_4.setValue((Integer)(FirstLiquid_in.getVal() == null ? 0 : ((Integer)FirstLiquid_in.getVal()).intValue()));//sysj/controller.sysj line: 28, column: 12
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
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                FirstLiquidInt_4.setPresent();//sysj/controller.sysj line: 28, column: 12
                currsigs.addElement(FirstLiquidInt_4);
                FirstLiquidInt_4.setValue((Integer)(FirstLiquid_in.getVal() == null ? 0 : ((Integer)FirstLiquid_in.getVal()).intValue()));//sysj/controller.sysj line: 28, column: 12
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
                break;
              
              case 3 : 
                FirstLiquidAmountInt_4.setPresent();//sysj/controller.sysj line: 29, column: 12
                currsigs.addElement(FirstLiquidAmountInt_4);
                FirstLiquidAmountInt_4.setValue((Integer)(FirstLiquidAmount_in.getVal() == null ? 0 : ((Integer)FirstLiquidAmount_in.getVal()).intValue()));//sysj/controller.sysj line: 29, column: 12
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
                break;
              
              case 4 : 
                NewOrder_4.setPresent();//sysj/controller.sysj line: 31, column: 12
                currsigs.addElement(NewOrder_4);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S609=1;
            S609=0;
            if(request.getprestatus()){//sysj/controller.sysj line: 22, column: 14
              S583=0;
              S479=0;
              if(!FirstLiquid_in.isPartnerPresent() || FirstLiquid_in.isPartnerPreempted()){//sysj/controller.sysj line: 24, column: 13
                FirstLiquid_in.setACK(false);//sysj/controller.sysj line: 24, column: 13
                S479=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S474=0;
                if(!FirstLiquid_in.isREQ()){//sysj/controller.sysj line: 24, column: 13
                  FirstLiquid_in.setACK(true);//sysj/controller.sysj line: 24, column: 13
                  S474=1;
                  if(FirstLiquid_in.isREQ()){//sysj/controller.sysj line: 24, column: 13
                    FirstLiquid_in.setACK(false);//sysj/controller.sysj line: 24, column: 13
                    ends[5]=2;
                    ;//sysj/controller.sysj line: 24, column: 13
                    S583=1;
                    S501=0;
                    if(!FirstLiquidAmount_in.isPartnerPresent() || FirstLiquidAmount_in.isPartnerPreempted()){//sysj/controller.sysj line: 25, column: 13
                      FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                      S501=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S496=0;
                      if(!FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                        FirstLiquidAmount_in.setACK(true);//sysj/controller.sysj line: 25, column: 13
                        S496=1;
                        if(FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                          FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                          ends[5]=2;
                          ;//sysj/controller.sysj line: 25, column: 13
                          S583=2;
                          FirstLiquidInt_4.setPresent();//sysj/controller.sysj line: 28, column: 12
                          currsigs.addElement(FirstLiquidInt_4);
                          FirstLiquidInt_4.setValue((Integer)(FirstLiquid_in.getVal() == null ? 0 : ((Integer)FirstLiquid_in.getVal()).intValue()));//sysj/controller.sysj line: 28, column: 12
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
                      else {
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
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              S609=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread910(int [] tdone, int [] ends){
        S895=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread909(int [] tdone, int [] ends){
        S893=1;
    if(FirstLiquidInt_4.getprestatus()){//sysj/controller.sysj line: 40, column: 14
      System.out.println("AAA: Order " + (FirstLiquidInt_4.getpreval() == null ? 0 : ((Integer)FirstLiquidInt_4.getpreval()).intValue()));//sysj/controller.sysj line: 41, column: 7
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

  public void thread908(int [] tdone, int [] ends){
        S885=1;
    S609=0;
    if(request.getprestatus()){//sysj/controller.sysj line: 22, column: 14
      S583=0;
      S479=0;
      if(!FirstLiquid_in.isPartnerPresent() || FirstLiquid_in.isPartnerPreempted()){//sysj/controller.sysj line: 24, column: 13
        FirstLiquid_in.setACK(false);//sysj/controller.sysj line: 24, column: 13
        S479=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S474=0;
        if(!FirstLiquid_in.isREQ()){//sysj/controller.sysj line: 24, column: 13
          FirstLiquid_in.setACK(true);//sysj/controller.sysj line: 24, column: 13
          S474=1;
          if(FirstLiquid_in.isREQ()){//sysj/controller.sysj line: 24, column: 13
            FirstLiquid_in.setACK(false);//sysj/controller.sysj line: 24, column: 13
            ends[5]=2;
            ;//sysj/controller.sysj line: 24, column: 13
            S583=1;
            S501=0;
            if(!FirstLiquidAmount_in.isPartnerPresent() || FirstLiquidAmount_in.isPartnerPreempted()){//sysj/controller.sysj line: 25, column: 13
              FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
              S501=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S496=0;
              if(!FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                FirstLiquidAmount_in.setACK(true);//sysj/controller.sysj line: 25, column: 13
                S496=1;
                if(FirstLiquidAmount_in.isREQ()){//sysj/controller.sysj line: 25, column: 13
                  FirstLiquidAmount_in.setACK(false);//sysj/controller.sysj line: 25, column: 13
                  ends[5]=2;
                  ;//sysj/controller.sysj line: 25, column: 13
                  S583=2;
                  FirstLiquidInt_4.setPresent();//sysj/controller.sysj line: 28, column: 12
                  currsigs.addElement(FirstLiquidInt_4);
                  FirstLiquidInt_4.setValue((Integer)(FirstLiquid_in.getVal() == null ? 0 : ((Integer)FirstLiquid_in.getVal()).intValue()));//sysj/controller.sysj line: 28, column: 12
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
              else {
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
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
    else {
      S609=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S897){
        case 0 : 
          S897=0;
          break RUN;
        
        case 1 : 
          S897=2;
          S897=2;
          FirstLiquidInt_4.setClear();//sysj/controller.sysj line: 12, column: 4
          SecondLiquidInt_4.setClear();//sysj/controller.sysj line: 12, column: 4
          ThirdLiquidInt_4.setClear();//sysj/controller.sysj line: 12, column: 4
          FourthLiquidInt_4.setClear();//sysj/controller.sysj line: 12, column: 4
          FirstLiquidAmountInt_4.setClear();//sysj/controller.sysj line: 13, column: 4
          SecondLiquidAmountInt_4.setClear();//sysj/controller.sysj line: 13, column: 4
          ThirdLiquidAmountInt_4.setClear();//sysj/controller.sysj line: 13, column: 4
          FourthLiquidAmountInt_4.setClear();//sysj/controller.sysj line: 13, column: 4
          NewOrder_4.setClear();//sysj/controller.sysj line: 15, column: 4
          CumulativeFlow_4.setClear();//sysj/controller.sysj line: 16, column: 4
          thread908(tdone,ends);
          thread909(tdone,ends);
          thread910(tdone,ends);
          int biggest911 = 0;
          if(ends[5]>=biggest911){
            biggest911=ends[5];
          }
          if(ends[6]>=biggest911){
            biggest911=ends[6];
          }
          if(ends[7]>=biggest911){
            biggest911=ends[7];
          }
          if(biggest911 == 1){
            active[4]=1;
            ends[4]=1;
            break RUN;
          }
        
        case 2 : 
          FirstLiquidInt_4.setClear();//sysj/controller.sysj line: 12, column: 4
          SecondLiquidInt_4.setClear();//sysj/controller.sysj line: 12, column: 4
          ThirdLiquidInt_4.setClear();//sysj/controller.sysj line: 12, column: 4
          FourthLiquidInt_4.setClear();//sysj/controller.sysj line: 12, column: 4
          FirstLiquidAmountInt_4.setClear();//sysj/controller.sysj line: 13, column: 4
          SecondLiquidAmountInt_4.setClear();//sysj/controller.sysj line: 13, column: 4
          ThirdLiquidAmountInt_4.setClear();//sysj/controller.sysj line: 13, column: 4
          FourthLiquidAmountInt_4.setClear();//sysj/controller.sysj line: 13, column: 4
          NewOrder_4.setClear();//sysj/controller.sysj line: 15, column: 4
          CumulativeFlow_4.setClear();//sysj/controller.sysj line: 16, column: 4
          thread912(tdone,ends);
          thread913(tdone,ends);
          thread914(tdone,ends);
          int biggest915 = 0;
          if(ends[5]>=biggest915){
            biggest915=ends[5];
          }
          if(ends[6]>=biggest915){
            biggest915=ends[6];
          }
          if(ends[7]>=biggest915){
            biggest915=ends[7];
          }
          if(biggest915 == 1){
            active[4]=1;
            ends[4]=1;
            break RUN;
          }
          //FINXME code
          if(biggest915 == 0){
            S897=0;
            active[4]=0;
            ends[4]=0;
            S897=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    FirstLiquidInt_4 = new Signal();
    SecondLiquidInt_4 = new Signal();
    ThirdLiquidInt_4 = new Signal();
    FourthLiquidInt_4 = new Signal();
    FirstLiquidAmountInt_4 = new Signal();
    SecondLiquidAmountInt_4 = new Signal();
    ThirdLiquidAmountInt_4 = new Signal();
    FourthLiquidAmountInt_4 = new Signal();
    NewOrder_4 = new Signal();
    CumulativeFlow_4 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[4] != 0){
      int index = 4;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[4]!=0 || suspended[4]!=0 || active[4]!=1);
      else{
        if(!df){
          FirstLiquid_in.gethook();
          SecondLiquid_in.gethook();
          ThirdLiquid_in.gethook();
          FourthLiquid_in.gethook();
          FirstLiquidAmount_in.gethook();
          SecondLiquidAmount_in.gethook();
          ThirdLiquidAmount_in.gethook();
          FourthLiquidAmount_in.gethook();
          LiquidFlow_in.gethook();
          request.gethook();
          FirstLiquidDone.gethook();
          SecondLiquidDone.gethook();
          ThirdLiquidDone.gethook();
          FourthLiquidDone.gethook();
          df = true;
        }
        runClockDomain();
      }
      request.setpreclear();
      FirstLiquidDone.setpreclear();
      SecondLiquidDone.setpreclear();
      ThirdLiquidDone.setpreclear();
      FourthLiquidDone.setpreclear();
      Liquid1On.setpreclear();
      Liquid2On.setpreclear();
      Liquid3On.setpreclear();
      Liquid4On.setpreclear();
      LiquidFillerDone.setpreclear();
      FirstLiquidInt_4.setpreclear();
      SecondLiquidInt_4.setpreclear();
      ThirdLiquidInt_4.setpreclear();
      FourthLiquidInt_4.setpreclear();
      FirstLiquidAmountInt_4.setpreclear();
      SecondLiquidAmountInt_4.setpreclear();
      ThirdLiquidAmountInt_4.setpreclear();
      FourthLiquidAmountInt_4.setpreclear();
      NewOrder_4.setpreclear();
      CumulativeFlow_4.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
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
      Liquid1On.sethook();
      Liquid1On.setClear();
      Liquid2On.sethook();
      Liquid2On.setClear();
      Liquid3On.sethook();
      Liquid3On.setClear();
      Liquid4On.sethook();
      Liquid4On.setClear();
      LiquidFillerDone.sethook();
      LiquidFillerDone.setClear();
      FirstLiquidInt_4.setClear();
      SecondLiquidInt_4.setClear();
      ThirdLiquidInt_4.setClear();
      FourthLiquidInt_4.setClear();
      FirstLiquidAmountInt_4.setClear();
      SecondLiquidAmountInt_4.setClear();
      ThirdLiquidAmountInt_4.setClear();
      FourthLiquidAmountInt_4.setClear();
      NewOrder_4.setClear();
      CumulativeFlow_4.setClear();
      FirstLiquid_in.sethook();
      SecondLiquid_in.sethook();
      ThirdLiquid_in.sethook();
      FourthLiquid_in.sethook();
      FirstLiquidAmount_in.sethook();
      SecondLiquidAmount_in.sethook();
      ThirdLiquidAmount_in.sethook();
      FourthLiquidAmount_in.sethook();
      LiquidFlow_in.sethook();
      if(paused[4]!=0 || suspended[4]!=0 || active[4]!=1);
      else{
        FirstLiquid_in.gethook();
        SecondLiquid_in.gethook();
        ThirdLiquid_in.gethook();
        FourthLiquid_in.gethook();
        FirstLiquidAmount_in.gethook();
        SecondLiquidAmount_in.gethook();
        ThirdLiquidAmount_in.gethook();
        FourthLiquidAmount_in.gethook();
        LiquidFlow_in.gethook();
        request.gethook();
        FirstLiquidDone.gethook();
        SecondLiquidDone.gethook();
        ThirdLiquidDone.gethook();
        FourthLiquidDone.gethook();
      }
      runFinisher();
      if(active[4] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
