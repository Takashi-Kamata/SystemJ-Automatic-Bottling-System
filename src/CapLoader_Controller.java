import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CapLoader_Controller extends ClockDomain{
  public CapLoader_Controller(String name){super(name);}
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
  public Signal request_caploader = new Signal("request_caploader", Signal.INPUT);
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
  private int modeint_thread_3;//sysj/CapLoader_controller.sysj line: 29, column: 4
  private int S705 = 1;
  private int S9 = 1;
  private int S3 = 1;
  private int S41 = 1;
  private int S79 = 1;
  private int S53 = 1;
  private int S171 = 1;
  private int S109 = 1;
  private int S107 = 1;
  private int S197 = 1;
  private int S179 = 1;
  private int S337 = 1;
  private int S243 = 1;
  private int S208 = 1;
  private int S219 = 1;
  private int S230 = 1;
  private int S241 = 1;
  private int S351 = 1;
  
  private int[] ends = new int[13];
  private int[] tdone = new int[13];
  
  public void thread736(int [] tdone, int [] ends){
        switch(S351){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(manual_signal_1.getprestatus()){//sysj/CapLoader_controller.sysj line: 145, column: 13
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread734(int [] tdone, int [] ends){
        S241=1;
    if(armDestM.getprestatus()){//sysj/CapLoader_controller.sysj line: 130, column: 15
      armDest.setPresent();//sysj/CapLoader_controller.sysj line: 132, column: 9
      currsigs.addElement(armDest);
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

  public void thread733(int [] tdone, int [] ends){
        S230=1;
    if(armSourceM.getprestatus()){//sysj/CapLoader_controller.sysj line: 121, column: 15
      armSource.setPresent();//sysj/CapLoader_controller.sysj line: 123, column: 9
      currsigs.addElement(armSource);
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

  public void thread732(int [] tdone, int [] ends){
        S219=1;
    if(vacOnM.getprestatus()){//sysj/CapLoader_controller.sysj line: 111, column: 15
      vacOn.setPresent();//sysj/CapLoader_controller.sysj line: 113, column: 9
      currsigs.addElement(vacOn);
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

  public void thread731(int [] tdone, int [] ends){
        S208=1;
    if(pusherExtendM.getprestatus()){//sysj/CapLoader_controller.sysj line: 102, column: 16
      pusherExtend.setPresent();//sysj/CapLoader_controller.sysj line: 104, column: 9
      currsigs.addElement(pusherExtend);
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

  public void thread729(int [] tdone, int [] ends){
        switch(S241){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj/CapLoader_controller.sysj line: 130, column: 15
          armDest.setPresent();//sysj/CapLoader_controller.sysj line: 132, column: 9
          currsigs.addElement(armDest);
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

  public void thread728(int [] tdone, int [] ends){
        switch(S230){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(armSourceM.getprestatus()){//sysj/CapLoader_controller.sysj line: 121, column: 15
          armSource.setPresent();//sysj/CapLoader_controller.sysj line: 123, column: 9
          currsigs.addElement(armSource);
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

  public void thread727(int [] tdone, int [] ends){
        switch(S219){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj/CapLoader_controller.sysj line: 111, column: 15
          vacOn.setPresent();//sysj/CapLoader_controller.sysj line: 113, column: 9
          currsigs.addElement(vacOn);
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

  public void thread726(int [] tdone, int [] ends){
        switch(S208){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj/CapLoader_controller.sysj line: 102, column: 16
          pusherExtend.setPresent();//sysj/CapLoader_controller.sysj line: 104, column: 9
          currsigs.addElement(pusherExtend);
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

  public void thread725(int [] tdone, int [] ends){
        switch(S337){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S243){
          case 0 : 
            thread726(tdone,ends);
            thread727(tdone,ends);
            thread728(tdone,ends);
            thread729(tdone,ends);
            int biggest730 = 0;
            if(ends[8]>=biggest730){
              biggest730=ends[8];
            }
            if(ends[9]>=biggest730){
              biggest730=ends[9];
            }
            if(ends[10]>=biggest730){
              biggest730=ends[10];
            }
            if(ends[11]>=biggest730){
              biggest730=ends[11];
            }
            if(biggest730 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest730 == 0){
              S243=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S243=1;
            S243=0;
            if(manual_signal_1.getprestatus()){//sysj/CapLoader_controller.sysj line: 100, column: 14
              thread731(tdone,ends);
              thread732(tdone,ends);
              thread733(tdone,ends);
              thread734(tdone,ends);
              int biggest735 = 0;
              if(ends[8]>=biggest735){
                biggest735=ends[8];
              }
              if(ends[9]>=biggest735){
                biggest735=ends[9];
              }
              if(ends[10]>=biggest735){
                biggest735=ends[10];
              }
              if(ends[11]>=biggest735){
                biggest735=ends[11];
              }
              if(biggest735 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              S243=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread724(int [] tdone, int [] ends){
        switch(S197){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S179){
          case 0 : 
            if(armAtDest.getprestatus()){//sysj/CapLoader_controller.sysj line: 88, column: 13
              S179=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              vacOn.setPresent();//sysj/CapLoader_controller.sysj line: 89, column: 8
              currsigs.addElement(vacOn);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S179=1;
            S179=0;
            if(!manual_signal_1.getprestatus()){//sysj/CapLoader_controller.sysj line: 86, column: 14
              if(armAtSource.getprestatus()){//sysj/CapLoader_controller.sysj line: 87, column: 14
                vacOn.setPresent();//sysj/CapLoader_controller.sysj line: 89, column: 8
                currsigs.addElement(vacOn);
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                S179=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              S179=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread723(int [] tdone, int [] ends){
        switch(S171){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S109){
          case 0 : 
            switch(S107){
              case 0 : 
                if(WPgripped.getprestatus()){//sysj/CapLoader_controller.sysj line: 67, column: 13
                  S107=1;
                  if(WPgripped.getprestatus()){//sysj/CapLoader_controller.sysj line: 73, column: 15
                    armDest.setPresent();//sysj/CapLoader_controller.sysj line: 75, column: 8
                    currsigs.addElement(armDest);
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S109=1;
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  armSource.setPresent();//sysj/CapLoader_controller.sysj line: 68, column: 8
                  currsigs.addElement(armSource);
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                break;
              
              case 1 : 
                if(!WPgripped.getprestatus()){//sysj/CapLoader_controller.sysj line: 74, column: 13
                  S109=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  armDest.setPresent();//sysj/CapLoader_controller.sysj line: 75, column: 8
                  currsigs.addElement(armDest);
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S109=1;
            S109=0;
            if(!manual_signal_1.getprestatus()){//sysj/CapLoader_controller.sysj line: 64, column: 14
              S107=0;
              if(pusherExtended.getprestatus()){//sysj/CapLoader_controller.sysj line: 65, column: 14
                System.out.println("pusherExtended");//sysj/CapLoader_controller.sysj line: 66, column: 7
                armSource.setPresent();//sysj/CapLoader_controller.sysj line: 68, column: 8
                currsigs.addElement(armSource);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S107=1;
                if(WPgripped.getprestatus()){//sysj/CapLoader_controller.sysj line: 73, column: 15
                  armDest.setPresent();//sysj/CapLoader_controller.sysj line: 75, column: 8
                  currsigs.addElement(armDest);
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S109=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              S109=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread722(int [] tdone, int [] ends){
        switch(S79){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S53){
          case 0 : 
            if(pusherExtended.getprestatus()){//sysj/CapLoader_controller.sysj line: 52, column: 13
              S53=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              pusherExtend.setPresent();//sysj/CapLoader_controller.sysj line: 53, column: 8
              currsigs.addElement(pusherExtend);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S53=1;
            S53=0;
            if(!manual_signal_1.getprestatus()){//sysj/CapLoader_controller.sysj line: 48, column: 14
              if(request_caploader.getprestatus() && !empty.getprestatus() && !armAtSource.getprestatus()){//sysj/CapLoader_controller.sysj line: 49, column: 14
                System.out.println("request_caploader");//sysj/CapLoader_controller.sysj line: 50, column: 7
                pusherExtend.setPresent();//sysj/CapLoader_controller.sysj line: 53, column: 8
                currsigs.addElement(pusherExtend);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S53=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S53=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread721(int [] tdone, int [] ends){
        switch(S41){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(mode.getprestatus()){//sysj/CapLoader_controller.sysj line: 31, column: 13
          modeint_thread_3 = (mode.getpreval() == null ? null : ((Integer)mode.getpreval()));//sysj/CapLoader_controller.sysj line: 32, column: 6
          if(modeint_thread_3 == 1){//sysj/CapLoader_controller.sysj line: 34, column: 10
            manual_signal_1.setPresent();//sysj/CapLoader_controller.sysj line: 35, column: 7
            currsigs.addElement(manual_signal_1);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
          else {
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread720(int [] tdone, int [] ends){
        switch(S9){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3){
          case 0 : 
            S3=0;
            if(request_caploader.getprestatus()){//sysj/CapLoader_controller.sysj line: 20, column: 13
              System.out.println("CAPAPP");//sysj/CapLoader_controller.sysj line: 22, column: 5
              S3=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S3=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S3=1;
            S3=0;
            if(request_caploader.getprestatus()){//sysj/CapLoader_controller.sysj line: 20, column: 13
              System.out.println("CAPAPP");//sysj/CapLoader_controller.sysj line: 22, column: 5
              S3=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S3=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread718(int [] tdone, int [] ends){
        S351=1;
    System.out.println("Starting");//sysj/CapLoader_controller.sysj line: 143, column: 3
    if(manual_signal_1.getprestatus()){//sysj/CapLoader_controller.sysj line: 145, column: 13
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread716(int [] tdone, int [] ends){
        S241=1;
    if(armDestM.getprestatus()){//sysj/CapLoader_controller.sysj line: 130, column: 15
      armDest.setPresent();//sysj/CapLoader_controller.sysj line: 132, column: 9
      currsigs.addElement(armDest);
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

  public void thread715(int [] tdone, int [] ends){
        S230=1;
    if(armSourceM.getprestatus()){//sysj/CapLoader_controller.sysj line: 121, column: 15
      armSource.setPresent();//sysj/CapLoader_controller.sysj line: 123, column: 9
      currsigs.addElement(armSource);
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

  public void thread714(int [] tdone, int [] ends){
        S219=1;
    if(vacOnM.getprestatus()){//sysj/CapLoader_controller.sysj line: 111, column: 15
      vacOn.setPresent();//sysj/CapLoader_controller.sysj line: 113, column: 9
      currsigs.addElement(vacOn);
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

  public void thread713(int [] tdone, int [] ends){
        S208=1;
    if(pusherExtendM.getprestatus()){//sysj/CapLoader_controller.sysj line: 102, column: 16
      pusherExtend.setPresent();//sysj/CapLoader_controller.sysj line: 104, column: 9
      currsigs.addElement(pusherExtend);
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

  public void thread712(int [] tdone, int [] ends){
        S337=1;
    S243=0;
    if(manual_signal_1.getprestatus()){//sysj/CapLoader_controller.sysj line: 100, column: 14
      thread713(tdone,ends);
      thread714(tdone,ends);
      thread715(tdone,ends);
      thread716(tdone,ends);
      int biggest717 = 0;
      if(ends[8]>=biggest717){
        biggest717=ends[8];
      }
      if(ends[9]>=biggest717){
        biggest717=ends[9];
      }
      if(ends[10]>=biggest717){
        biggest717=ends[10];
      }
      if(ends[11]>=biggest717){
        biggest717=ends[11];
      }
      if(biggest717 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S243=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread711(int [] tdone, int [] ends){
        S197=1;
    S179=0;
    if(!manual_signal_1.getprestatus()){//sysj/CapLoader_controller.sysj line: 86, column: 14
      if(armAtSource.getprestatus()){//sysj/CapLoader_controller.sysj line: 87, column: 14
        vacOn.setPresent();//sysj/CapLoader_controller.sysj line: 89, column: 8
        currsigs.addElement(vacOn);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
      else {
        S179=1;
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S179=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread710(int [] tdone, int [] ends){
        S171=1;
    S109=0;
    if(!manual_signal_1.getprestatus()){//sysj/CapLoader_controller.sysj line: 64, column: 14
      S107=0;
      if(pusherExtended.getprestatus()){//sysj/CapLoader_controller.sysj line: 65, column: 14
        System.out.println("pusherExtended");//sysj/CapLoader_controller.sysj line: 66, column: 7
        armSource.setPresent();//sysj/CapLoader_controller.sysj line: 68, column: 8
        currsigs.addElement(armSource);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S107=1;
        if(WPgripped.getprestatus()){//sysj/CapLoader_controller.sysj line: 73, column: 15
          armDest.setPresent();//sysj/CapLoader_controller.sysj line: 75, column: 8
          currsigs.addElement(armDest);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S109=1;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
      }
    }
    else {
      S109=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread709(int [] tdone, int [] ends){
        S79=1;
    S53=0;
    if(!manual_signal_1.getprestatus()){//sysj/CapLoader_controller.sysj line: 48, column: 14
      if(request_caploader.getprestatus() && !empty.getprestatus() && !armAtSource.getprestatus()){//sysj/CapLoader_controller.sysj line: 49, column: 14
        System.out.println("request_caploader");//sysj/CapLoader_controller.sysj line: 50, column: 7
        pusherExtend.setPresent();//sysj/CapLoader_controller.sysj line: 53, column: 8
        currsigs.addElement(pusherExtend);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S53=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S53=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread708(int [] tdone, int [] ends){
        S41=1;
    modeint_thread_3 = 0;//sysj/CapLoader_controller.sysj line: 29, column: 4
    if(mode.getprestatus()){//sysj/CapLoader_controller.sysj line: 31, column: 13
      modeint_thread_3 = (mode.getpreval() == null ? null : ((Integer)mode.getpreval()));//sysj/CapLoader_controller.sysj line: 32, column: 6
      if(modeint_thread_3 == 1){//sysj/CapLoader_controller.sysj line: 34, column: 10
        manual_signal_1.setPresent();//sysj/CapLoader_controller.sysj line: 35, column: 7
        currsigs.addElement(manual_signal_1);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread707(int [] tdone, int [] ends){
        S9=1;
    S3=0;
    if(request_caploader.getprestatus()){//sysj/CapLoader_controller.sysj line: 20, column: 13
      System.out.println("CAPAPP");//sysj/CapLoader_controller.sysj line: 22, column: 5
      S3=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S3=1;
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
      switch(S705){
        case 0 : 
          S705=0;
          break RUN;
        
        case 1 : 
          S705=2;
          S705=2;
          class GUI extends Object implements java.lang.Runnable {//sysj/CapLoader_controller.sysj line: 7, column: 3
            public void run() {//sysj/CapLoader_controller.sysj line: 10, column: 22
              org.compsys704.CapLoader.main(null);//sysj/CapLoader_controller.sysj line: 11, column: 5
            }
            GUI(){//sysj/CapLoader_controller.sysj line: 9, column: 43
            }
          }
          new Thread(new GUI()).start();//sysj/CapLoader_controller.sysj line: 14, column: 3
          manual_signal_1.setClear();//sysj/CapLoader_controller.sysj line: 16, column: 3
          thread707(tdone,ends);
          thread708(tdone,ends);
          thread709(tdone,ends);
          thread710(tdone,ends);
          thread711(tdone,ends);
          thread712(tdone,ends);
          thread718(tdone,ends);
          int biggest719 = 0;
          if(ends[2]>=biggest719){
            biggest719=ends[2];
          }
          if(ends[3]>=biggest719){
            biggest719=ends[3];
          }
          if(ends[4]>=biggest719){
            biggest719=ends[4];
          }
          if(ends[5]>=biggest719){
            biggest719=ends[5];
          }
          if(ends[6]>=biggest719){
            biggest719=ends[6];
          }
          if(ends[7]>=biggest719){
            biggest719=ends[7];
          }
          if(ends[12]>=biggest719){
            biggest719=ends[12];
          }
          if(biggest719 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          manual_signal_1.setClear();//sysj/CapLoader_controller.sysj line: 16, column: 3
          thread720(tdone,ends);
          thread721(tdone,ends);
          thread722(tdone,ends);
          thread723(tdone,ends);
          thread724(tdone,ends);
          thread725(tdone,ends);
          thread736(tdone,ends);
          int biggest737 = 0;
          if(ends[2]>=biggest737){
            biggest737=ends[2];
          }
          if(ends[3]>=biggest737){
            biggest737=ends[3];
          }
          if(ends[4]>=biggest737){
            biggest737=ends[4];
          }
          if(ends[5]>=biggest737){
            biggest737=ends[5];
          }
          if(ends[6]>=biggest737){
            biggest737=ends[6];
          }
          if(ends[7]>=biggest737){
            biggest737=ends[7];
          }
          if(ends[12]>=biggest737){
            biggest737=ends[12];
          }
          if(biggest737 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest737 == 0){
            S705=0;
            active[1]=0;
            ends[1]=0;
            S705=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          request_caploader.gethook();
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
      request_caploader.setpreclear();
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
      dummyint = request_caploader.getStatus() ? request_caploader.setprepresent() : request_caploader.setpreclear();
      request_caploader.setpreval(request_caploader.getValue());
      request_caploader.setClear();
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
        request_caploader.gethook();
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
