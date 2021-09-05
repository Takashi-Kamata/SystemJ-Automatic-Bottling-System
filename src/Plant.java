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
  public Signal Liquid1On = new Signal("Liquid1On", Signal.INPUT);
  public Signal Liquid2On = new Signal("Liquid2On", Signal.INPUT);
  public Signal Liquid3On = new Signal("Liquid3On", Signal.INPUT);
  public Signal Liquid4On = new Signal("Liquid4On", Signal.INPUT);
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
  private int []  liquidOrder_thread_1;//sysj/controller.sysj line: 125, column: 3
  private int []  liquidAmount_thread_1;//sysj/controller.sysj line: 133, column: 3
  private int S50 = 1;
  private int S9 = 1;
  
  private int[] ends = new int[3];
  private int[] tdone = new int[3];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S50){
        case 0 : 
          S50=0;
          break RUN;
        
        case 1 : 
          S50=2;
          S50=2;
                    liquidOrder_thread_1 = new int[4];//sysj/controller.sysj line: 126, column: 9
          liquidOrder_thread_1[0] = 1;//sysj/controller.sysj line: 127, column: 9
          liquidOrder_thread_1[1] = 2;//sysj/controller.sysj line: 128, column: 9
          liquidOrder_thread_1[2] = 4;//sysj/controller.sysj line: 129, column: 9
          liquidOrder_thread_1[3] = 3;//sysj/controller.sysj line: 130, column: 9
                    liquidAmount_thread_1 = new int[4];//sysj/controller.sysj line: 134, column: 9
          liquidAmount_thread_1[0] = 40;//sysj/controller.sysj line: 135, column: 9
          liquidAmount_thread_1[1] = 20;//sysj/controller.sysj line: 136, column: 9
          liquidAmount_thread_1[2] = 10;//sysj/controller.sysj line: 137, column: 9
          liquidAmount_thread_1[3] = 30;//sysj/controller.sysj line: 138, column: 9
          S9=0;
          if(recipe.getprestatus()){//sysj/controller.sysj line: 145, column: 12
            Liquid1OnE.setPresent();//sysj/controller.sysj line: 146, column: 5
            currsigs.addElement(Liquid1OnE);
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S9=1;
            if(Liquid1On.getprestatus() && Liquid2On.getprestatus() && Liquid3On.getprestatus() && Liquid4On.getprestatus() && LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 176, column: 12
              System.out.println("Liquid Status Received");//sysj/controller.sysj line: 177, column: 5
              S9=2;
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
            else {
              S9=2;
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S9){
            case 0 : 
              Liquid1OnE.setPresent();//sysj/controller.sysj line: 146, column: 5
              currsigs.addElement(Liquid1OnE);
              active[1]=1;
              ends[1]=1;
              break RUN;
            
            case 1 : 
              S9=0;
              if(recipe.getprestatus()){//sysj/controller.sysj line: 145, column: 12
                Liquid1OnE.setPresent();//sysj/controller.sysj line: 146, column: 5
                currsigs.addElement(Liquid1OnE);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S9=1;
                if(Liquid1On.getprestatus() && Liquid2On.getprestatus() && Liquid3On.getprestatus() && Liquid4On.getprestatus() && LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 176, column: 12
                  System.out.println("Liquid Status Received");//sysj/controller.sysj line: 177, column: 5
                  S9=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S9=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 2 : 
              S9=2;
              S9=0;
              if(recipe.getprestatus()){//sysj/controller.sysj line: 145, column: 12
                Liquid1OnE.setPresent();//sysj/controller.sysj line: 146, column: 5
                currsigs.addElement(Liquid1OnE);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S9=1;
                if(Liquid1On.getprestatus() && Liquid2On.getprestatus() && Liquid3On.getprestatus() && Liquid4On.getprestatus() && LiquidFillerDone.getprestatus()){//sysj/controller.sysj line: 176, column: 12
                  System.out.println("Liquid Status Received");//sysj/controller.sysj line: 177, column: 5
                  S9=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S9=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
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
      Liquid1On.setpreclear();
      Liquid2On.setpreclear();
      Liquid3On.setpreclear();
      Liquid4On.setpreclear();
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
