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
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  private Signal manual_signal_1;
  private int modeint_thread_2;//sysj/controller.sysj line: 12, column: 4
  private int S452 = 1;
  private int S32 = 1;
  private int S70 = 1;
  private int S44 = 1;
  private int S162 = 1;
  private int S100 = 1;
  private int S98 = 1;
  private int S188 = 1;
  private int S170 = 1;
  private int S436 = 1;
  private int S270 = 1;
  private int S208 = 1;
  private int S194 = 1;
  private int S228 = 1;
  private int S214 = 1;
  private int S248 = 1;
  private int S234 = 1;
  private int S268 = 1;
  private int S254 = 1;
  private int S450 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread481(int [] tdone, int [] ends){
        switch(S450){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(manual_signal_1.getprestatus()){//sysj/controller.sysj line: 128, column: 13
          System.out.println("manual_signal");//sysj/controller.sysj line: 129, column: 6
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

  public void thread479(int [] tdone, int [] ends){
        S268=1;
    S254=0;
    if(armDestM.getprestatus()){//sysj/controller.sysj line: 113, column: 14
      armDest.setPresent();//sysj/controller.sysj line: 115, column: 8
      currsigs.addElement(armDest);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S254=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread478(int [] tdone, int [] ends){
        S248=1;
    S234=0;
    if(armSourceM.getprestatus()){//sysj/controller.sysj line: 104, column: 15
      armSource.setPresent();//sysj/controller.sysj line: 106, column: 9
      currsigs.addElement(armSource);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S234=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread477(int [] tdone, int [] ends){
        S228=1;
    S214=0;
    if(vacOnM.getprestatus()){//sysj/controller.sysj line: 95, column: 15
      vacOn.setPresent();//sysj/controller.sysj line: 97, column: 9
      currsigs.addElement(vacOn);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S214=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread476(int [] tdone, int [] ends){
        S208=1;
    S194=0;
    if(pusherExtendM.getprestatus()){//sysj/controller.sysj line: 86, column: 15
      pusherExtend.setPresent();//sysj/controller.sysj line: 88, column: 9
      currsigs.addElement(pusherExtend);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S194=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread474(int [] tdone, int [] ends){
        switch(S268){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S254){
          case 0 : 
            if(!armDestM.getprestatus()){//sysj/controller.sysj line: 114, column: 14
              S254=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              armDest.setPresent();//sysj/controller.sysj line: 115, column: 8
              currsigs.addElement(armDest);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S254=1;
            S254=0;
            if(armDestM.getprestatus()){//sysj/controller.sysj line: 113, column: 14
              armDest.setPresent();//sysj/controller.sysj line: 115, column: 8
              currsigs.addElement(armDest);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S254=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread473(int [] tdone, int [] ends){
        switch(S248){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S234){
          case 0 : 
            if(!armSourceM.getprestatus()){//sysj/controller.sysj line: 105, column: 15
              S234=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              armSource.setPresent();//sysj/controller.sysj line: 106, column: 9
              currsigs.addElement(armSource);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S234=1;
            S234=0;
            if(armSourceM.getprestatus()){//sysj/controller.sysj line: 104, column: 15
              armSource.setPresent();//sysj/controller.sysj line: 106, column: 9
              currsigs.addElement(armSource);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S234=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread472(int [] tdone, int [] ends){
        switch(S228){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S214){
          case 0 : 
            if(!vacOnM.getprestatus()){//sysj/controller.sysj line: 96, column: 15
              S214=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              vacOn.setPresent();//sysj/controller.sysj line: 97, column: 9
              currsigs.addElement(vacOn);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S214=1;
            S214=0;
            if(vacOnM.getprestatus()){//sysj/controller.sysj line: 95, column: 15
              vacOn.setPresent();//sysj/controller.sysj line: 97, column: 9
              currsigs.addElement(vacOn);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S214=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread471(int [] tdone, int [] ends){
        switch(S208){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S194){
          case 0 : 
            if(!pusherExtendM.getprestatus()){//sysj/controller.sysj line: 87, column: 15
              S194=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              pusherExtend.setPresent();//sysj/controller.sysj line: 88, column: 9
              currsigs.addElement(pusherExtend);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S194=1;
            S194=0;
            if(pusherExtendM.getprestatus()){//sysj/controller.sysj line: 86, column: 15
              pusherExtend.setPresent();//sysj/controller.sysj line: 88, column: 9
              currsigs.addElement(pusherExtend);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S194=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread470(int [] tdone, int [] ends){
        switch(S436){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S270){
          case 0 : 
            thread471(tdone,ends);
            thread472(tdone,ends);
            thread473(tdone,ends);
            thread474(tdone,ends);
            int biggest475 = 0;
            if(ends[7]>=biggest475){
              biggest475=ends[7];
            }
            if(ends[8]>=biggest475){
              biggest475=ends[8];
            }
            if(ends[9]>=biggest475){
              biggest475=ends[9];
            }
            if(ends[10]>=biggest475){
              biggest475=ends[10];
            }
            if(biggest475 == 1){
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            //FINXME code
            if(biggest475 == 0){
              S270=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S270=1;
            S270=0;
            if(manual_signal_1.getprestatus()){//sysj/controller.sysj line: 83, column: 14
              thread476(tdone,ends);
              thread477(tdone,ends);
              thread478(tdone,ends);
              thread479(tdone,ends);
              int biggest480 = 0;
              if(ends[7]>=biggest480){
                biggest480=ends[7];
              }
              if(ends[8]>=biggest480){
                biggest480=ends[8];
              }
              if(ends[9]>=biggest480){
                biggest480=ends[9];
              }
              if(ends[10]>=biggest480){
                biggest480=ends[10];
              }
              if(biggest480 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              S270=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread469(int [] tdone, int [] ends){
        switch(S188){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S170){
          case 0 : 
            if(armAtDest.getprestatus()){//sysj/controller.sysj line: 71, column: 13
              S170=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              vacOn.setPresent();//sysj/controller.sysj line: 72, column: 8
              currsigs.addElement(vacOn);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S170=1;
            S170=0;
            if(!manual_signal_1.getprestatus()){//sysj/controller.sysj line: 69, column: 14
              if(armAtSource.getprestatus()){//sysj/controller.sysj line: 70, column: 14
                vacOn.setPresent();//sysj/controller.sysj line: 72, column: 8
                currsigs.addElement(vacOn);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S170=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S170=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread468(int [] tdone, int [] ends){
        switch(S162){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S100){
          case 0 : 
            switch(S98){
              case 0 : 
                if(WPgripped.getprestatus()){//sysj/controller.sysj line: 50, column: 13
                  S98=1;
                  if(WPgripped.getprestatus()){//sysj/controller.sysj line: 56, column: 15
                    armDest.setPresent();//sysj/controller.sysj line: 58, column: 8
                    currsigs.addElement(armDest);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S100=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  armSource.setPresent();//sysj/controller.sysj line: 51, column: 8
                  currsigs.addElement(armSource);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                if(!WPgripped.getprestatus()){//sysj/controller.sysj line: 57, column: 13
                  S100=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  armDest.setPresent();//sysj/controller.sysj line: 58, column: 8
                  currsigs.addElement(armDest);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S100=1;
            S100=0;
            if(!manual_signal_1.getprestatus()){//sysj/controller.sysj line: 47, column: 14
              S98=0;
              if(pusherExtended.getprestatus()){//sysj/controller.sysj line: 48, column: 14
                System.out.println("pusherExtended");//sysj/controller.sysj line: 49, column: 7
                armSource.setPresent();//sysj/controller.sysj line: 51, column: 8
                currsigs.addElement(armSource);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S98=1;
                if(WPgripped.getprestatus()){//sysj/controller.sysj line: 56, column: 15
                  armDest.setPresent();//sysj/controller.sysj line: 58, column: 8
                  currsigs.addElement(armDest);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S100=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
            }
            else {
              S100=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread467(int [] tdone, int [] ends){
        switch(S70){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S44){
          case 0 : 
            if(pusherExtended.getprestatus()){//sysj/controller.sysj line: 35, column: 13
              S44=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtend.setPresent();//sysj/controller.sysj line: 36, column: 8
              currsigs.addElement(pusherExtend);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S44=1;
            S44=0;
            if(!manual_signal_1.getprestatus()){//sysj/controller.sysj line: 31, column: 14
              if(request.getprestatus() && !empty.getprestatus() && !armAtSource.getprestatus()){//sysj/controller.sysj line: 32, column: 14
                System.out.println("request");//sysj/controller.sysj line: 33, column: 7
                pusherExtend.setPresent();//sysj/controller.sysj line: 36, column: 8
                currsigs.addElement(pusherExtend);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S44=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              S44=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread466(int [] tdone, int [] ends){
        switch(S32){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(mode.getprestatus()){//sysj/controller.sysj line: 14, column: 13
          modeint_thread_2 = (mode.getpreval() == null ? null : ((Integer)mode.getpreval()));//sysj/controller.sysj line: 15, column: 6
          if(modeint_thread_2 == 1){//sysj/controller.sysj line: 17, column: 10
            manual_signal_1.setPresent();//sysj/controller.sysj line: 18, column: 7
            currsigs.addElement(manual_signal_1);
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
      
    }
  }

  public void thread464(int [] tdone, int [] ends){
        S450=1;
    System.out.println("Starting");//sysj/controller.sysj line: 126, column: 3
    if(manual_signal_1.getprestatus()){//sysj/controller.sysj line: 128, column: 13
      System.out.println("manual_signal");//sysj/controller.sysj line: 129, column: 6
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

  public void thread462(int [] tdone, int [] ends){
        S268=1;
    S254=0;
    if(armDestM.getprestatus()){//sysj/controller.sysj line: 113, column: 14
      armDest.setPresent();//sysj/controller.sysj line: 115, column: 8
      currsigs.addElement(armDest);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S254=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread461(int [] tdone, int [] ends){
        S248=1;
    S234=0;
    if(armSourceM.getprestatus()){//sysj/controller.sysj line: 104, column: 15
      armSource.setPresent();//sysj/controller.sysj line: 106, column: 9
      currsigs.addElement(armSource);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S234=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread460(int [] tdone, int [] ends){
        S228=1;
    S214=0;
    if(vacOnM.getprestatus()){//sysj/controller.sysj line: 95, column: 15
      vacOn.setPresent();//sysj/controller.sysj line: 97, column: 9
      currsigs.addElement(vacOn);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S214=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread459(int [] tdone, int [] ends){
        S208=1;
    S194=0;
    if(pusherExtendM.getprestatus()){//sysj/controller.sysj line: 86, column: 15
      pusherExtend.setPresent();//sysj/controller.sysj line: 88, column: 9
      currsigs.addElement(pusherExtend);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S194=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread458(int [] tdone, int [] ends){
        S436=1;
    S270=0;
    if(manual_signal_1.getprestatus()){//sysj/controller.sysj line: 83, column: 14
      thread459(tdone,ends);
      thread460(tdone,ends);
      thread461(tdone,ends);
      thread462(tdone,ends);
      int biggest463 = 0;
      if(ends[7]>=biggest463){
        biggest463=ends[7];
      }
      if(ends[8]>=biggest463){
        biggest463=ends[8];
      }
      if(ends[9]>=biggest463){
        biggest463=ends[9];
      }
      if(ends[10]>=biggest463){
        biggest463=ends[10];
      }
      if(biggest463 == 1){
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S270=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread457(int [] tdone, int [] ends){
        S188=1;
    S170=0;
    if(!manual_signal_1.getprestatus()){//sysj/controller.sysj line: 69, column: 14
      if(armAtSource.getprestatus()){//sysj/controller.sysj line: 70, column: 14
        vacOn.setPresent();//sysj/controller.sysj line: 72, column: 8
        currsigs.addElement(vacOn);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S170=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S170=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread456(int [] tdone, int [] ends){
        S162=1;
    S100=0;
    if(!manual_signal_1.getprestatus()){//sysj/controller.sysj line: 47, column: 14
      S98=0;
      if(pusherExtended.getprestatus()){//sysj/controller.sysj line: 48, column: 14
        System.out.println("pusherExtended");//sysj/controller.sysj line: 49, column: 7
        armSource.setPresent();//sysj/controller.sysj line: 51, column: 8
        currsigs.addElement(armSource);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S98=1;
        if(WPgripped.getprestatus()){//sysj/controller.sysj line: 56, column: 15
          armDest.setPresent();//sysj/controller.sysj line: 58, column: 8
          currsigs.addElement(armDest);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          S100=1;
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
      }
    }
    else {
      S100=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread455(int [] tdone, int [] ends){
        S70=1;
    S44=0;
    if(!manual_signal_1.getprestatus()){//sysj/controller.sysj line: 31, column: 14
      if(request.getprestatus() && !empty.getprestatus() && !armAtSource.getprestatus()){//sysj/controller.sysj line: 32, column: 14
        System.out.println("request");//sysj/controller.sysj line: 33, column: 7
        pusherExtend.setPresent();//sysj/controller.sysj line: 36, column: 8
        currsigs.addElement(pusherExtend);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        S44=1;
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
    else {
      S44=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread454(int [] tdone, int [] ends){
        S32=1;
    modeint_thread_2 = 0;//sysj/controller.sysj line: 12, column: 4
    if(mode.getprestatus()){//sysj/controller.sysj line: 14, column: 13
      modeint_thread_2 = (mode.getpreval() == null ? null : ((Integer)mode.getpreval()));//sysj/controller.sysj line: 15, column: 6
      if(modeint_thread_2 == 1){//sysj/controller.sysj line: 17, column: 10
        manual_signal_1.setPresent();//sysj/controller.sysj line: 18, column: 7
        currsigs.addElement(manual_signal_1);
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

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S452){
        case 0 : 
          S452=0;
          break RUN;
        
        case 1 : 
          S452=2;
          S452=2;
          manual_signal_1.setClear();//sysj/controller.sysj line: 10, column: 3
          thread454(tdone,ends);
          thread455(tdone,ends);
          thread456(tdone,ends);
          thread457(tdone,ends);
          thread458(tdone,ends);
          thread464(tdone,ends);
          int biggest465 = 0;
          if(ends[2]>=biggest465){
            biggest465=ends[2];
          }
          if(ends[3]>=biggest465){
            biggest465=ends[3];
          }
          if(ends[4]>=biggest465){
            biggest465=ends[4];
          }
          if(ends[5]>=biggest465){
            biggest465=ends[5];
          }
          if(ends[6]>=biggest465){
            biggest465=ends[6];
          }
          if(ends[11]>=biggest465){
            biggest465=ends[11];
          }
          if(biggest465 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          manual_signal_1.setClear();//sysj/controller.sysj line: 10, column: 3
          thread466(tdone,ends);
          thread467(tdone,ends);
          thread468(tdone,ends);
          thread469(tdone,ends);
          thread470(tdone,ends);
          thread481(tdone,ends);
          int biggest482 = 0;
          if(ends[2]>=biggest482){
            biggest482=ends[2];
          }
          if(ends[3]>=biggest482){
            biggest482=ends[3];
          }
          if(ends[4]>=biggest482){
            biggest482=ends[4];
          }
          if(ends[5]>=biggest482){
            biggest482=ends[5];
          }
          if(ends[6]>=biggest482){
            biggest482=ends[6];
          }
          if(ends[11]>=biggest482){
            biggest482=ends[11];
          }
          if(biggest482 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest482 == 0){
            S452=0;
            active[1]=0;
            ends[1]=0;
            S452=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    manual_signal_1 = new Signal();
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
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      manual_signal_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      manual_signal_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
