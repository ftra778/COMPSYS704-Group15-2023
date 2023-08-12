import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal modeGUI = new Signal("modeGUI", Signal.INPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal empty = new Signal("empty", Signal.OUTPUT);
  public Signal pusherRetractedE = new Signal("pusherRetractedE", Signal.OUTPUT);
  public Signal pusherExtendedE = new Signal("pusherExtendedE", Signal.OUTPUT);
  public Signal WPgrippedE = new Signal("WPgrippedE", Signal.OUTPUT);
  public Signal armAtSourceE = new Signal("armAtSourceE", Signal.OUTPUT);
  public Signal armAtDestE = new Signal("armAtDestE", Signal.OUTPUT);
  public Signal emptyE = new Signal("emptyE", Signal.OUTPUT);
  public Signal mode = new Signal("mode", Signal.OUTPUT);
  private Signal capDec_1;
  private Signal capPos_1;
  private int capcount_thread_6;//sysj\plant.sysj line: 84, column: 3
  private int S4840 = 1;
  private int S3523 = 1;
  private int S3477 = 1;
  private int S3576 = 1;
  private int S3530 = 1;
  private int S3620 = 1;
  private int S3590 = 1;
  private int S3585 = 1;
  private int S3688 = 1;
  private int S3642 = 1;
  private int S3624 = 1;
  private int S3750 = 1;
  private int S3800 = 1;
  private int S3758 = 1;
  private int S3766 = 1;
  private int S3774 = 1;
  private int S3782 = 1;
  private int S3790 = 1;
  private int S3798 = 1;
  private int S3811 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread4870(int [] tdone, int [] ends){
        switch(S3811){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(modeGUI.getprestatus()){//sysj\plant.sysj line: 117, column: 12
          mode = modeGUI;//sysj\plant.sysj line: 118, column: 5
          mode.setPresent();//sysj\plant.sysj line: 119, column: 5
          currsigs.addElement(mode);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread4868(int [] tdone, int [] ends){
        switch(S3798){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\plant.sysj line: 112, column: 24
          emptyE.setPresent();//sysj\plant.sysj line: 112, column: 31
          currsigs.addElement(emptyE);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread4867(int [] tdone, int [] ends){
        switch(S3790){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\plant.sysj line: 110, column: 24
          armAtDestE.setPresent();//sysj\plant.sysj line: 110, column: 35
          currsigs.addElement(armAtDestE);
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

  public void thread4866(int [] tdone, int [] ends){
        switch(S3782){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\plant.sysj line: 108, column: 24
          armAtSourceE.setPresent();//sysj\plant.sysj line: 108, column: 37
          currsigs.addElement(armAtSourceE);
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

  public void thread4865(int [] tdone, int [] ends){
        switch(S3774){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\plant.sysj line: 106, column: 24
          WPgrippedE.setPresent();//sysj\plant.sysj line: 106, column: 35
          currsigs.addElement(WPgrippedE);
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

  public void thread4864(int [] tdone, int [] ends){
        switch(S3766){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 104, column: 24
          pusherExtendedE.setPresent();//sysj\plant.sysj line: 104, column: 40
          currsigs.addElement(pusherExtendedE);
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

  public void thread4863(int [] tdone, int [] ends){
        switch(S3758){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 102, column: 24
          pusherRetractedE.setPresent();//sysj\plant.sysj line: 102, column: 41
          currsigs.addElement(pusherRetractedE);
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

  public void thread4862(int [] tdone, int [] ends){
        switch(S3800){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread4863(tdone,ends);
        thread4864(tdone,ends);
        thread4865(tdone,ends);
        thread4866(tdone,ends);
        thread4867(tdone,ends);
        thread4868(tdone,ends);
        int biggest4869 = 0;
        if(ends[8]>=biggest4869){
          biggest4869=ends[8];
        }
        if(ends[9]>=biggest4869){
          biggest4869=ends[9];
        }
        if(ends[10]>=biggest4869){
          biggest4869=ends[10];
        }
        if(ends[11]>=biggest4869){
          biggest4869=ends[11];
        }
        if(ends[12]>=biggest4869){
          biggest4869=ends[12];
        }
        if(ends[13]>=biggest4869){
          biggest4869=ends[13];
        }
        if(biggest4869 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest4869 == 0){
          S3800=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread4861(int [] tdone, int [] ends){
        switch(S3750){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\plant.sysj line: 86, column: 12
          if(capcount_thread_6 > 0) {//sysj\plant.sysj line: 87, column: 5
            capcount_thread_6 = capcount_thread_6 - 1;//sysj\plant.sysj line: 88, column: 6
          }
          if(refill.getprestatus()){//sysj\plant.sysj line: 90, column: 12
            capcount_thread_6 = 5;//sysj\plant.sysj line: 91, column: 5
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 94, column: 8
              empty.setPresent();//sysj\plant.sysj line: 95, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 94, column: 8
              empty.setPresent();//sysj\plant.sysj line: 95, column: 6
              currsigs.addElement(empty);
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
        }
        else {
          if(refill.getprestatus()){//sysj\plant.sysj line: 90, column: 12
            capcount_thread_6 = 5;//sysj\plant.sysj line: 91, column: 5
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 94, column: 8
              empty.setPresent();//sysj\plant.sysj line: 95, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_6 == 0){//sysj\plant.sysj line: 94, column: 8
              empty.setPresent();//sysj\plant.sysj line: 95, column: 6
              currsigs.addElement(empty);
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
        }
        break;
      
    }
  }

  public void thread4860(int [] tdone, int [] ends){
        switch(S3688){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S3642){
          case 0 : 
            if(empty.getprestatus()){//sysj\plant.sysj line: 69, column: 10
              S3642=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S3624){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 71, column: 13
                    S3624=1;
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
                  if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 72, column: 13
                    capPos_1.setPresent();//sysj\plant.sysj line: 74, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 74, column: 7
                    S3624=2;
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
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 75, column: 13
                    capDec_1.setPresent();//sysj\plant.sysj line: 76, column: 7
                    currsigs.addElement(capDec_1);
                    S3624=0;
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
            if(refill.getprestatus()){//sysj\plant.sysj line: 79, column: 10
              S3642=0;
              S3624=0;
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
  }

  public void thread4859(int [] tdone, int [] ends){
        switch(S3620){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3590){
          case 0 : 
            switch(S3585){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\plant.sysj line: 49, column: 12
                  S3585=1;
                  if(armAtSource.getprestatus()){//sysj\plant.sysj line: 52, column: 14
                    capPos_1.setPresent();//sysj\plant.sysj line: 53, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\plant.sysj line: 53, column: 7
                    S3590=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S3590=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\plant.sysj line: 50, column: 7
                  currsigs.addElement(WPgripped);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S3590=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 46, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 47, column: 8
                    capPos_1.setPresent();//sysj\plant.sysj line: 48, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\plant.sysj line: 48, column: 6
                    S3585=0;
                    WPgripped.setPresent();//sysj\plant.sysj line: 50, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S3590=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S3590=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S3590=1;
            S3590=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 46, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 47, column: 8
                capPos_1.setPresent();//sysj\plant.sysj line: 48, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\plant.sysj line: 48, column: 6
                S3585=0;
                WPgripped.setPresent();//sysj\plant.sysj line: 50, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S3590=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S3590=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4858(int [] tdone, int [] ends){
        switch(S3576){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3530){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 33, column: 10
              S3530=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\plant.sysj line: 34, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 36, column: 10
              S3530=2;
              pusherExtended.setPresent();//sysj\plant.sysj line: 38, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 37, column: 10
              S3530=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\plant.sysj line: 38, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 40, column: 10
              S3530=0;
              pusherRetracted.setPresent();//sysj\plant.sysj line: 34, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4857(int [] tdone, int [] ends){
        switch(S3523){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3477){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 20, column: 10
              S3477=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\plant.sysj line: 21, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 23, column: 10
              S3477=2;
              armAtSource.setPresent();//sysj\plant.sysj line: 25, column: 5
              currsigs.addElement(armAtSource);
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
          
          case 2 : 
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 24, column: 10
              S3477=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\plant.sysj line: 25, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 27, column: 10
              S3477=0;
              armAtDest.setPresent();//sysj\plant.sysj line: 21, column: 5
              currsigs.addElement(armAtDest);
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
        break;
      
    }
  }

  public void thread4855(int [] tdone, int [] ends){
        S3811=1;
    if(modeGUI.getprestatus()){//sysj\plant.sysj line: 117, column: 12
      mode = modeGUI;//sysj\plant.sysj line: 118, column: 5
      mode.setPresent();//sysj\plant.sysj line: 119, column: 5
      currsigs.addElement(mode);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread4853(int [] tdone, int [] ends){
        S3798=1;
    if(empty.getprestatus()){//sysj\plant.sysj line: 112, column: 24
      emptyE.setPresent();//sysj\plant.sysj line: 112, column: 31
      currsigs.addElement(emptyE);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread4852(int [] tdone, int [] ends){
        S3790=1;
    if(armAtDest.getprestatus()){//sysj\plant.sysj line: 110, column: 24
      armAtDestE.setPresent();//sysj\plant.sysj line: 110, column: 35
      currsigs.addElement(armAtDestE);
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

  public void thread4851(int [] tdone, int [] ends){
        S3782=1;
    if(armAtSource.getprestatus()){//sysj\plant.sysj line: 108, column: 24
      armAtSourceE.setPresent();//sysj\plant.sysj line: 108, column: 37
      currsigs.addElement(armAtSourceE);
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

  public void thread4850(int [] tdone, int [] ends){
        S3774=1;
    if(WPgripped.getprestatus()){//sysj\plant.sysj line: 106, column: 24
      WPgrippedE.setPresent();//sysj\plant.sysj line: 106, column: 35
      currsigs.addElement(WPgrippedE);
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

  public void thread4849(int [] tdone, int [] ends){
        S3766=1;
    if(pusherExtended.getprestatus()){//sysj\plant.sysj line: 104, column: 24
      pusherExtendedE.setPresent();//sysj\plant.sysj line: 104, column: 40
      currsigs.addElement(pusherExtendedE);
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

  public void thread4848(int [] tdone, int [] ends){
        S3758=1;
    if(pusherRetracted.getprestatus()){//sysj\plant.sysj line: 102, column: 24
      pusherRetractedE.setPresent();//sysj\plant.sysj line: 102, column: 41
      currsigs.addElement(pusherRetractedE);
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

  public void thread4847(int [] tdone, int [] ends){
        S3800=1;
    thread4848(tdone,ends);
    thread4849(tdone,ends);
    thread4850(tdone,ends);
    thread4851(tdone,ends);
    thread4852(tdone,ends);
    thread4853(tdone,ends);
    int biggest4854 = 0;
    if(ends[8]>=biggest4854){
      biggest4854=ends[8];
    }
    if(ends[9]>=biggest4854){
      biggest4854=ends[9];
    }
    if(ends[10]>=biggest4854){
      biggest4854=ends[10];
    }
    if(ends[11]>=biggest4854){
      biggest4854=ends[11];
    }
    if(ends[12]>=biggest4854){
      biggest4854=ends[12];
    }
    if(ends[13]>=biggest4854){
      biggest4854=ends[13];
    }
    if(biggest4854 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread4846(int [] tdone, int [] ends){
        S3750=1;
    capcount_thread_6 = 5;//sysj\plant.sysj line: 84, column: 3
    if(capDec_1.getprestatus()){//sysj\plant.sysj line: 86, column: 12
      if(capcount_thread_6 > 0) {//sysj\plant.sysj line: 87, column: 5
        capcount_thread_6 = capcount_thread_6 - 1;//sysj\plant.sysj line: 88, column: 6
      }
      if(refill.getprestatus()){//sysj\plant.sysj line: 90, column: 12
        capcount_thread_6 = 5;//sysj\plant.sysj line: 91, column: 5
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 94, column: 8
          empty.setPresent();//sysj\plant.sysj line: 95, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 94, column: 8
          empty.setPresent();//sysj\plant.sysj line: 95, column: 6
          currsigs.addElement(empty);
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
    }
    else {
      if(refill.getprestatus()){//sysj\plant.sysj line: 90, column: 12
        capcount_thread_6 = 5;//sysj\plant.sysj line: 91, column: 5
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 94, column: 8
          empty.setPresent();//sysj\plant.sysj line: 95, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_6 == 0){//sysj\plant.sysj line: 94, column: 8
          empty.setPresent();//sysj\plant.sysj line: 95, column: 6
          currsigs.addElement(empty);
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
    }
  }

  public void thread4845(int [] tdone, int [] ends){
        S3688=1;
    S3642=0;
    S3624=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4844(int [] tdone, int [] ends){
        S3620=1;
    S3590=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\plant.sysj line: 46, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\plant.sysj line: 47, column: 8
        capPos_1.setPresent();//sysj\plant.sysj line: 48, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\plant.sysj line: 48, column: 6
        S3585=0;
        WPgripped.setPresent();//sysj\plant.sysj line: 50, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S3590=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S3590=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread4843(int [] tdone, int [] ends){
        S3576=1;
    S3530=0;
    pusherRetracted.setPresent();//sysj\plant.sysj line: 34, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4842(int [] tdone, int [] ends){
        S3523=1;
    S3477=0;
    armAtDest.setPresent();//sysj\plant.sysj line: 21, column: 5
    currsigs.addElement(armAtDest);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S4840){
        case 0 : 
          S4840=0;
          break RUN;
        
        case 1 : 
          S4840=2;
          S4840=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 13, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 15, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 16, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 17, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 17, column: 2
          thread4842(tdone,ends);
          thread4843(tdone,ends);
          thread4844(tdone,ends);
          thread4845(tdone,ends);
          thread4846(tdone,ends);
          thread4847(tdone,ends);
          thread4855(tdone,ends);
          int biggest4856 = 0;
          if(ends[2]>=biggest4856){
            biggest4856=ends[2];
          }
          if(ends[3]>=biggest4856){
            biggest4856=ends[3];
          }
          if(ends[4]>=biggest4856){
            biggest4856=ends[4];
          }
          if(ends[5]>=biggest4856){
            biggest4856=ends[5];
          }
          if(ends[6]>=biggest4856){
            biggest4856=ends[6];
          }
          if(ends[7]>=biggest4856){
            biggest4856=ends[7];
          }
          if(ends[14]>=biggest4856){
            biggest4856=ends[14];
          }
          if(biggest4856 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 15, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 16, column: 2
          thread4857(tdone,ends);
          thread4858(tdone,ends);
          thread4859(tdone,ends);
          thread4860(tdone,ends);
          thread4861(tdone,ends);
          thread4862(tdone,ends);
          thread4870(tdone,ends);
          int biggest4871 = 0;
          if(ends[2]>=biggest4871){
            biggest4871=ends[2];
          }
          if(ends[3]>=biggest4871){
            biggest4871=ends[3];
          }
          if(ends[4]>=biggest4871){
            biggest4871=ends[4];
          }
          if(ends[5]>=biggest4871){
            biggest4871=ends[5];
          }
          if(ends[6]>=biggest4871){
            biggest4871=ends[6];
          }
          if(ends[7]>=biggest4871){
            biggest4871=ends[7];
          }
          if(ends[14]>=biggest4871){
            biggest4871=ends[14];
          }
          if(biggest4871 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest4871 == 0){
            S4840=0;
            active[1]=0;
            ends[1]=0;
            S4840=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_1 = new Signal();
    capPos_1 = new Signal();
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
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          enable.gethook();
          refill.gethook();
          modeGUI.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      modeGUI.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      pusherRetractedE.setpreclear();
      pusherExtendedE.setpreclear();
      WPgrippedE.setpreclear();
      armAtSourceE.setpreclear();
      armAtDestE.setpreclear();
      emptyE.setpreclear();
      mode.setpreclear();
      capDec_1.setpreclear();
      capPos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherExtend.getStatus() ? pusherExtend.setprepresent() : pusherExtend.setpreclear();
      pusherExtend.setpreval(pusherExtend.getValue());
      pusherExtend.setClear();
      dummyint = vacOn.getStatus() ? vacOn.setprepresent() : vacOn.setpreclear();
      vacOn.setpreval(vacOn.getValue());
      vacOn.setClear();
      dummyint = armSource.getStatus() ? armSource.setprepresent() : armSource.setpreclear();
      armSource.setpreval(armSource.getValue());
      armSource.setClear();
      dummyint = armDest.getStatus() ? armDest.setprepresent() : armDest.setpreclear();
      armDest.setpreval(armDest.getValue());
      armDest.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      dummyint = modeGUI.getStatus() ? modeGUI.setprepresent() : modeGUI.setpreclear();
      modeGUI.setpreval(modeGUI.getValue());
      modeGUI.setClear();
      pusherRetracted.sethook();
      pusherRetracted.setClear();
      pusherExtended.sethook();
      pusherExtended.setClear();
      WPgripped.sethook();
      WPgripped.setClear();
      armAtSource.sethook();
      armAtSource.setClear();
      armAtDest.sethook();
      armAtDest.setClear();
      empty.sethook();
      empty.setClear();
      pusherRetractedE.sethook();
      pusherRetractedE.setClear();
      pusherExtendedE.sethook();
      pusherExtendedE.setClear();
      WPgrippedE.sethook();
      WPgrippedE.setClear();
      armAtSourceE.sethook();
      armAtSourceE.setClear();
      armAtDestE.sethook();
      armAtDestE.setClear();
      emptyE.sethook();
      emptyE.setClear();
      mode.sethook();
      mode.setClear();
      capDec_1.setClear();
      capPos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        enable.gethook();
        refill.gethook();
        modeGUI.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
