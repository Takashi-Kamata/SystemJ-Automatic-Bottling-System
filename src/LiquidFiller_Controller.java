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
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  private int S295 = 1;
  private int S107 = 1;
  private int S35 = 1;
  private int S17 = 1;
  private int S139 = 1;
  private int S117 = 1;
  private int S147 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread303(int [] tdone, int [] ends){
        switch(S147){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(request.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 50, column: 12
          System.out.println("Request L");//sysj/LiquidFiller_controller.sysj line: 51, column: 5
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

  public void thread302(int [] tdone, int [] ends){
        switch(S139){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S117){
          case 0 : 
            if(dosUnitEvac.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 37, column: 11
              S117=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 39, column: 6
              currsigs.addElement(dosUnitValveRetract);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S117=1;
            S117=0;
            if(bottleAtPos2.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 36, column: 12
              System.out.println("Bring the canister to the top");//sysj/LiquidFiller_controller.sysj line: 38, column: 6
              dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 39, column: 6
              currsigs.addElement(dosUnitValveRetract);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S117=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread301(int [] tdone, int [] ends){
        switch(S107){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S35){
          case 0 : 
            switch(S17){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 17, column: 11
                  S17=1;
                  System.out.println("Bring the canister to the top");//sysj/LiquidFiller_controller.sysj line: 26, column: 6
                  dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 27, column: 6
                  currsigs.addElement(dosUnitValveRetract);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  valveInjectorOnOff.setPresent();//sysj/LiquidFiller_controller.sysj line: 19, column: 6
                  currsigs.addElement(valveInjectorOnOff);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(dosUnitFilled.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 25, column: 11
                  S35=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 27, column: 6
                  currsigs.addElement(dosUnitValveRetract);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S35=1;
            S35=0;
            if(request.getprestatus() && bottleAtPos2.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 15, column: 12
              System.out.println("BottleAtPos2");//sysj/LiquidFiller_controller.sysj line: 16, column: 5
              S17=0;
              System.out.println("Valve Injector On");//sysj/LiquidFiller_controller.sysj line: 18, column: 6
              valveInjectorOnOff.setPresent();//sysj/LiquidFiller_controller.sysj line: 19, column: 6
              currsigs.addElement(valveInjectorOnOff);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
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

  public void thread299(int [] tdone, int [] ends){
        S147=1;
    if(request.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 50, column: 12
      System.out.println("Request L");//sysj/LiquidFiller_controller.sysj line: 51, column: 5
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

  public void thread298(int [] tdone, int [] ends){
        S139=1;
    S117=0;
    if(bottleAtPos2.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 36, column: 12
      System.out.println("Bring the canister to the top");//sysj/LiquidFiller_controller.sysj line: 38, column: 6
      dosUnitValveRetract.setPresent();//sysj/LiquidFiller_controller.sysj line: 39, column: 6
      currsigs.addElement(dosUnitValveRetract);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S117=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread297(int [] tdone, int [] ends){
        S107=1;
    S35=0;
    if(request.getprestatus() && bottleAtPos2.getprestatus()){//sysj/LiquidFiller_controller.sysj line: 15, column: 12
      System.out.println("BottleAtPos2");//sysj/LiquidFiller_controller.sysj line: 16, column: 5
      S17=0;
      System.out.println("Valve Injector On");//sysj/LiquidFiller_controller.sysj line: 18, column: 6
      valveInjectorOnOff.setPresent();//sysj/LiquidFiller_controller.sysj line: 19, column: 6
      currsigs.addElement(valveInjectorOnOff);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
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
      switch(S295){
        case 0 : 
          S295=0;
          break RUN;
        
        case 1 : 
          S295=2;
          S295=2;
          class GUI extends Object implements java.lang.Runnable {//sysj/LiquidFiller_controller.sysj line: 5, column: 3
            public void run() {//sysj/LiquidFiller_controller.sysj line: 8, column: 21
              org.compsys704.LiquidFiller.main(null);//sysj/LiquidFiller_controller.sysj line: 9, column: 4
            }
            GUI(){//sysj/LiquidFiller_controller.sysj line: 7, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj/LiquidFiller_controller.sysj line: 12, column: 2
          thread297(tdone,ends);
          thread298(tdone,ends);
          thread299(tdone,ends);
          int biggest300 = 0;
          if(ends[2]>=biggest300){
            biggest300=ends[2];
          }
          if(ends[3]>=biggest300){
            biggest300=ends[3];
          }
          if(ends[4]>=biggest300){
            biggest300=ends[4];
          }
          if(biggest300 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread301(tdone,ends);
          thread302(tdone,ends);
          thread303(tdone,ends);
          int biggest304 = 0;
          if(ends[2]>=biggest304){
            biggest304=ends[2];
          }
          if(ends[3]>=biggest304){
            biggest304=ends[3];
          }
          if(ends[4]>=biggest304){
            biggest304=ends[4];
          }
          if(biggest304 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest304 == 0){
            S295=0;
            active[1]=0;
            ends[1]=0;
            S295=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
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
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      request.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
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
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        request.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
