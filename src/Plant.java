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
  private int S461 = 1;
  private int S136 = 1;
  private int S135 = 1;
  private int S45 = 1;
  private int S7 = 1;
  private int S2 = 1;
  private int S52 = 1;
  private int S47 = 1;
  private int S153 = 1;
  private int S141 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread906(int [] tdone, int [] ends){
        S153=1;
    S141=0;
    FirstLiquidDone.setPresent();//sysj/controller.sysj line: 119, column: 8
    currsigs.addElement(FirstLiquidDone);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread905(int [] tdone, int [] ends){
        S136=1;
    S135=0;
    if(recipe.getprestatus()){//sysj/controller.sysj line: 100, column: 14
      System.out.println("Plant Send Start");//sysj/controller.sysj line: 102, column: 7
      S45=0;
      S7=0;
      if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 103, column: 7
        FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 103, column: 7
        S7=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S2=0;
        if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 103, column: 7
          FirstLiquid_o.setVal(1);//sysj/controller.sysj line: 103, column: 7
          S2=1;
          if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 103, column: 7
            FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 103, column: 7
            ends[2]=2;
            ;//sysj/controller.sysj line: 103, column: 7
            S45=1;
            S52=0;
            if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 104, column: 7
              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
              S52=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S47=0;
              if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 104, column: 7
                S47=1;
                if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                  FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                  ends[2]=2;
                  ;//sysj/controller.sysj line: 104, column: 7
                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 106, column: 7
                  S135=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
          }
          else {
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
    }
    else {
      S135=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread903(int [] tdone, int [] ends){
        switch(S153){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S141){
          case 0 : 
            if(Liquid1On.getprestatus() && enable.getprestatus()){//sysj/controller.sysj line: 118, column: 13
              S141=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              FirstLiquidDone.setPresent();//sysj/controller.sysj line: 119, column: 8
              currsigs.addElement(FirstLiquidDone);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S141=1;
            S141=0;
            FirstLiquidDone.setPresent();//sysj/controller.sysj line: 119, column: 8
            currsigs.addElement(FirstLiquidDone);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread902(int [] tdone, int [] ends){
        switch(S136){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S135){
          case 0 : 
            switch(S45){
              case 0 : 
                switch(S7){
                  case 0 : 
                    if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 103, column: 7
                      FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 103, column: 7
                      S7=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S2){
                        case 0 : 
                          if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 103, column: 7
                            FirstLiquid_o.setVal(1);//sysj/controller.sysj line: 103, column: 7
                            S2=1;
                            if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 103, column: 7
                              FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 103, column: 7
                              ends[2]=2;
                              ;//sysj/controller.sysj line: 103, column: 7
                              S45=1;
                              S52=0;
                              if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 104, column: 7
                                FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                                S52=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S47=0;
                                if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                                  FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 104, column: 7
                                  S47=1;
                                  if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                                    FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                                    ends[2]=2;
                                    ;//sysj/controller.sysj line: 104, column: 7
                                    System.out.println("Plant Send Finish");//sysj/controller.sysj line: 106, column: 7
                                    S135=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                                else {
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 103, column: 7
                            FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 103, column: 7
                            ends[2]=2;
                            ;//sysj/controller.sysj line: 103, column: 7
                            S45=1;
                            S52=0;
                            if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 104, column: 7
                              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                              S52=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S47=0;
                              if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                                FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 104, column: 7
                                S47=1;
                                if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                                  FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                                  ends[2]=2;
                                  ;//sysj/controller.sysj line: 104, column: 7
                                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 106, column: 7
                                  S135=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                              else {
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S7=1;
                    S7=0;
                    if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 103, column: 7
                      FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 103, column: 7
                      S7=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S2=0;
                      if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 103, column: 7
                        FirstLiquid_o.setVal(1);//sysj/controller.sysj line: 103, column: 7
                        S2=1;
                        if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 103, column: 7
                          FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 103, column: 7
                          ends[2]=2;
                          ;//sysj/controller.sysj line: 103, column: 7
                          S45=1;
                          S52=0;
                          if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 104, column: 7
                            FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                            S52=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S47=0;
                            if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                              FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 104, column: 7
                              S47=1;
                              if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                                FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                                ends[2]=2;
                                ;//sysj/controller.sysj line: 104, column: 7
                                System.out.println("Plant Send Finish");//sysj/controller.sysj line: 106, column: 7
                                S135=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S52){
                  case 0 : 
                    if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 104, column: 7
                      FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                      S52=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S47){
                        case 0 : 
                          if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                            FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 104, column: 7
                            S47=1;
                            if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                              ends[2]=2;
                              ;//sysj/controller.sysj line: 104, column: 7
                              System.out.println("Plant Send Finish");//sysj/controller.sysj line: 106, column: 7
                              S135=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                            FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                            ends[2]=2;
                            ;//sysj/controller.sysj line: 104, column: 7
                            System.out.println("Plant Send Finish");//sysj/controller.sysj line: 106, column: 7
                            S135=1;
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
                    }
                    break;
                  
                  case 1 : 
                    S52=1;
                    S52=0;
                    if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 104, column: 7
                      FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                      S52=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S47=0;
                      if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                        FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 104, column: 7
                        S47=1;
                        if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                          FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                          ends[2]=2;
                          ;//sysj/controller.sysj line: 104, column: 7
                          System.out.println("Plant Send Finish");//sysj/controller.sysj line: 106, column: 7
                          S135=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S135=1;
            S136=0;
            active[2]=0;
            ends[2]=0;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread900(int [] tdone, int [] ends){
        S153=1;
    S141=0;
    FirstLiquidDone.setPresent();//sysj/controller.sysj line: 119, column: 8
    currsigs.addElement(FirstLiquidDone);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread899(int [] tdone, int [] ends){
        S136=1;
    S135=0;
    if(recipe.getprestatus()){//sysj/controller.sysj line: 100, column: 14
      System.out.println("Plant Send Start");//sysj/controller.sysj line: 102, column: 7
      S45=0;
      S7=0;
      if(!FirstLiquid_o.isPartnerPresent() || FirstLiquid_o.isPartnerPreempted()){//sysj/controller.sysj line: 103, column: 7
        FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 103, column: 7
        S7=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S2=0;
        if(FirstLiquid_o.isACK()){//sysj/controller.sysj line: 103, column: 7
          FirstLiquid_o.setVal(1);//sysj/controller.sysj line: 103, column: 7
          S2=1;
          if(!FirstLiquid_o.isACK()){//sysj/controller.sysj line: 103, column: 7
            FirstLiquid_o.setREQ(false);//sysj/controller.sysj line: 103, column: 7
            ends[2]=2;
            ;//sysj/controller.sysj line: 103, column: 7
            S45=1;
            S52=0;
            if(!FirstLiquidAmount_o.isPartnerPresent() || FirstLiquidAmount_o.isPartnerPreempted()){//sysj/controller.sysj line: 104, column: 7
              FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
              S52=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S47=0;
              if(FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                FirstLiquidAmount_o.setVal(10);//sysj/controller.sysj line: 104, column: 7
                S47=1;
                if(!FirstLiquidAmount_o.isACK()){//sysj/controller.sysj line: 104, column: 7
                  FirstLiquidAmount_o.setREQ(false);//sysj/controller.sysj line: 104, column: 7
                  ends[2]=2;
                  ;//sysj/controller.sysj line: 104, column: 7
                  System.out.println("Plant Send Finish");//sysj/controller.sysj line: 106, column: 7
                  S135=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
          }
          else {
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
    }
    else {
      S135=1;
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
      switch(S461){
        case 0 : 
          S461=0;
          break RUN;
        
        case 1 : 
          S461=2;
          S461=2;
          thread899(tdone,ends);
          thread900(tdone,ends);
          int biggest901 = 0;
          if(ends[2]>=biggest901){
            biggest901=ends[2];
          }
          if(ends[3]>=biggest901){
            biggest901=ends[3];
          }
          if(biggest901 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread902(tdone,ends);
          thread903(tdone,ends);
          int biggest904 = 0;
          if(ends[2]>=biggest904){
            biggest904=ends[2];
          }
          if(ends[3]>=biggest904){
            biggest904=ends[3];
          }
          if(biggest904 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest904 == 0){
            thread905(tdone,ends);
            thread906(tdone,ends);
            int biggest907 = 0;
            if(ends[2]>=biggest907){
              biggest907=ends[2];
            }
            if(ends[3]>=biggest907){
              biggest907=ends[3];
            }
            if(biggest907 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
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
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
