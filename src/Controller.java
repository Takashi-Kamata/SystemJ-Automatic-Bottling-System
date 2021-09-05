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
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
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
  private int S71 = 1;
  
  private int[] ends = new int[3];
  private int[] tdone = new int[3];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S71){
        case 0 : 
          S71=0;
          break RUN;
        
        case 1 : 
          S71=2;
          S71=2;
          if(enable.getprestatus()){//sysj/controller.sysj line: 12, column: 13
            System.out.println("ENABLE");//sysj/controller.sysj line: 13, column: 6
            System.out.println("Controller Emit Start");//sysj/controller.sysj line: 15, column: 6
            Liquid1On.setPresent();//sysj/controller.sysj line: 16, column: 6
            currsigs.addElement(Liquid1On);
            Liquid2On.setPresent();//sysj/controller.sysj line: 17, column: 6
            currsigs.addElement(Liquid2On);
            Liquid3On.setPresent();//sysj/controller.sysj line: 18, column: 6
            currsigs.addElement(Liquid3On);
            Liquid4On.setPresent();//sysj/controller.sysj line: 19, column: 6
            currsigs.addElement(Liquid4On);
            LiquidFillerDone.setPresent();//sysj/controller.sysj line: 20, column: 6
            currsigs.addElement(LiquidFillerDone);
            System.out.println("Controller Emit Finish");//sysj/controller.sysj line: 21, column: 6
            if(request.getprestatus()){//sysj/controller.sysj line: 25, column: 13
              active[2]=1;
              ends[2]=1;
              break RUN;
            }
            else {
              active[2]=1;
              ends[2]=1;
              break RUN;
            }
          }
          else {
            if(request.getprestatus()){//sysj/controller.sysj line: 25, column: 13
              active[2]=1;
              ends[2]=1;
              break RUN;
            }
            else {
              active[2]=1;
              ends[2]=1;
              break RUN;
            }
          }
        
        case 2 : 
          if(enable.getprestatus()){//sysj/controller.sysj line: 12, column: 13
            System.out.println("ENABLE");//sysj/controller.sysj line: 13, column: 6
            System.out.println("Controller Emit Start");//sysj/controller.sysj line: 15, column: 6
            Liquid1On.setPresent();//sysj/controller.sysj line: 16, column: 6
            currsigs.addElement(Liquid1On);
            Liquid2On.setPresent();//sysj/controller.sysj line: 17, column: 6
            currsigs.addElement(Liquid2On);
            Liquid3On.setPresent();//sysj/controller.sysj line: 18, column: 6
            currsigs.addElement(Liquid3On);
            Liquid4On.setPresent();//sysj/controller.sysj line: 19, column: 6
            currsigs.addElement(Liquid4On);
            LiquidFillerDone.setPresent();//sysj/controller.sysj line: 20, column: 6
            currsigs.addElement(LiquidFillerDone);
            System.out.println("Controller Emit Finish");//sysj/controller.sysj line: 21, column: 6
            if(request.getprestatus()){//sysj/controller.sysj line: 25, column: 13
              active[2]=1;
              ends[2]=1;
              break RUN;
            }
            else {
              active[2]=1;
              ends[2]=1;
              break RUN;
            }
          }
          else {
            if(request.getprestatus()){//sysj/controller.sysj line: 25, column: 13
              active[2]=1;
              ends[2]=1;
              break RUN;
            }
            else {
              active[2]=1;
              ends[2]=1;
              break RUN;
            }
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1};
    char [] paused1 = {0, 0, 0};
    char [] suspended1 = {0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[2] != 0){
      int index = 2;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
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
          enable.gethook();
          request.gethook();
          df = true;
        }
        runClockDomain();
      }
      enable.setpreclear();
      request.setpreclear();
      Liquid1On.setpreclear();
      Liquid2On.setpreclear();
      Liquid3On.setpreclear();
      Liquid4On.setpreclear();
      LiquidFillerDone.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
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
      FirstLiquid_in.sethook();
      SecondLiquid_in.sethook();
      ThirdLiquid_in.sethook();
      FourthLiquid_in.sethook();
      FirstLiquidAmount_in.sethook();
      SecondLiquidAmount_in.sethook();
      ThirdLiquidAmount_in.sethook();
      FourthLiquidAmount_in.sethook();
      LiquidFlow_in.sethook();
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
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
        enable.gethook();
        request.gethook();
      }
      runFinisher();
      if(active[2] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
