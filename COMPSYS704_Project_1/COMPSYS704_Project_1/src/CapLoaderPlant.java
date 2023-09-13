import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\ABSplant.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABSplant.sysj line: 2, column: 1

public class CapLoaderPlant extends ClockDomain{
  public CapLoaderPlant(String name){super(name);}
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
  private Signal capDec_7;
  private Signal capPos_7;
  private int capcount_thread_12;//sysj\ABSplant.sysj line: 147, column: 3
  private int S33036 = 1;
  private int S31719 = 1;
  private int S31673 = 1;
  private int S31772 = 1;
  private int S31726 = 1;
  private int S31816 = 1;
  private int S31786 = 1;
  private int S31884 = 1;
  private int S31838 = 1;
  private int S31820 = 1;
  private int S31946 = 1;
  private int S31996 = 1;
  private int S31954 = 1;
  private int S31962 = 1;
  private int S31970 = 1;
  private int S31978 = 1;
  private int S31986 = 1;
  private int S31994 = 1;
  private int S32007 = 1;
  
  private int[] ends = new int[53];
  private int[] tdone = new int[53];
  
  public void thread34216(int [] tdone, int [] ends){
        switch(S32007){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(modeGUI.getprestatus()){//sysj\ABSplant.sysj line: 180, column: 12
          mode = modeGUI;//sysj\ABSplant.sysj line: 181, column: 5
          mode.setPresent();//sysj\ABSplant.sysj line: 182, column: 5
          currsigs.addElement(mode);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread34214(int [] tdone, int [] ends){
        switch(S31994){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\ABSplant.sysj line: 175, column: 24
          emptyE.setPresent();//sysj\ABSplant.sysj line: 175, column: 31
          currsigs.addElement(emptyE);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread34213(int [] tdone, int [] ends){
        switch(S31986){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\ABSplant.sysj line: 173, column: 24
          armAtDestE.setPresent();//sysj\ABSplant.sysj line: 173, column: 35
          currsigs.addElement(armAtDestE);
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread34212(int [] tdone, int [] ends){
        switch(S31978){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\ABSplant.sysj line: 171, column: 24
          armAtSourceE.setPresent();//sysj\ABSplant.sysj line: 171, column: 37
          currsigs.addElement(armAtSourceE);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread34211(int [] tdone, int [] ends){
        switch(S31970){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\ABSplant.sysj line: 169, column: 24
          WPgrippedE.setPresent();//sysj\ABSplant.sysj line: 169, column: 35
          currsigs.addElement(WPgrippedE);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread34210(int [] tdone, int [] ends){
        switch(S31962){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\ABSplant.sysj line: 167, column: 24
          pusherExtendedE.setPresent();//sysj\ABSplant.sysj line: 167, column: 40
          currsigs.addElement(pusherExtendedE);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread34209(int [] tdone, int [] ends){
        switch(S31954){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\ABSplant.sysj line: 165, column: 24
          pusherRetractedE.setPresent();//sysj\ABSplant.sysj line: 165, column: 41
          currsigs.addElement(pusherRetractedE);
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

  public void thread34208(int [] tdone, int [] ends){
        switch(S31996){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread34209(tdone,ends);
        thread34210(tdone,ends);
        thread34211(tdone,ends);
        thread34212(tdone,ends);
        thread34213(tdone,ends);
        thread34214(tdone,ends);
        int biggest34215 = 0;
        if(ends[14]>=biggest34215){
          biggest34215=ends[14];
        }
        if(ends[15]>=biggest34215){
          biggest34215=ends[15];
        }
        if(ends[16]>=biggest34215){
          biggest34215=ends[16];
        }
        if(ends[17]>=biggest34215){
          biggest34215=ends[17];
        }
        if(ends[18]>=biggest34215){
          biggest34215=ends[18];
        }
        if(ends[19]>=biggest34215){
          biggest34215=ends[19];
        }
        if(biggest34215 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest34215 == 0){
          S31996=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread34207(int [] tdone, int [] ends){
        switch(S31946){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(capDec_7.getprestatus()){//sysj\ABSplant.sysj line: 149, column: 12
          if(capcount_thread_12 > 0) {//sysj\ABSplant.sysj line: 150, column: 5
            capcount_thread_12 = capcount_thread_12 - 1;//sysj\ABSplant.sysj line: 151, column: 6
          }
          if(refill.getprestatus()){//sysj\ABSplant.sysj line: 153, column: 12
            capcount_thread_12 = 5;//sysj\ABSplant.sysj line: 154, column: 5
            if(capcount_thread_12 == 0){//sysj\ABSplant.sysj line: 157, column: 8
              empty.setPresent();//sysj\ABSplant.sysj line: 158, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_12 == 0){//sysj\ABSplant.sysj line: 157, column: 8
              empty.setPresent();//sysj\ABSplant.sysj line: 158, column: 6
              currsigs.addElement(empty);
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
        }
        else {
          if(refill.getprestatus()){//sysj\ABSplant.sysj line: 153, column: 12
            capcount_thread_12 = 5;//sysj\ABSplant.sysj line: 154, column: 5
            if(capcount_thread_12 == 0){//sysj\ABSplant.sysj line: 157, column: 8
              empty.setPresent();//sysj\ABSplant.sysj line: 158, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_12 == 0){//sysj\ABSplant.sysj line: 157, column: 8
              empty.setPresent();//sysj\ABSplant.sysj line: 158, column: 6
              currsigs.addElement(empty);
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
        }
        break;
      
    }
  }

  public void thread34206(int [] tdone, int [] ends){
        switch(S31884){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S31838){
          case 0 : 
            if(empty.getprestatus()){//sysj\ABSplant.sysj line: 132, column: 10
              S31838=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              switch(S31820){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\ABSplant.sysj line: 134, column: 13
                    S31820=1;
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
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\ABSplant.sysj line: 135, column: 13
                    capPos_7.setPresent();//sysj\ABSplant.sysj line: 137, column: 7
                    currsigs.addElement(capPos_7);
                    capPos_7.setValue(1);//sysj\ABSplant.sysj line: 137, column: 7
                    S31820=2;
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
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\ABSplant.sysj line: 138, column: 13
                    capDec_7.setPresent();//sysj\ABSplant.sysj line: 139, column: 7
                    currsigs.addElement(capDec_7);
                    S31820=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\ABSplant.sysj line: 142, column: 10
              S31838=0;
              S31820=0;
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
        break;
      
    }
  }

  public void thread34205(int [] tdone, int [] ends){
        switch(S31816){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S31786){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\ABSplant.sysj line: 112, column: 12
              if(armAtSource.getprestatus()){//sysj\ABSplant.sysj line: 115, column: 14
                capPos_7.setPresent();//sysj\ABSplant.sysj line: 116, column: 7
                currsigs.addElement(capPos_7);
                capPos_7.setValue(1);//sysj\ABSplant.sysj line: 116, column: 7
                S31786=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S31786=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\ABSplant.sysj line: 113, column: 7
              currsigs.addElement(WPgripped);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S31786=1;
            S31786=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\ABSplant.sysj line: 109, column: 12
              if((Integer)(capPos_7.getpreval() == null ? 0 : ((Integer)capPos_7.getpreval()).intValue()) == 1){//sysj\ABSplant.sysj line: 110, column: 8
                capPos_7.setPresent();//sysj\ABSplant.sysj line: 111, column: 6
                currsigs.addElement(capPos_7);
                capPos_7.setValue(0);//sysj\ABSplant.sysj line: 111, column: 6
                WPgripped.setPresent();//sysj\ABSplant.sysj line: 113, column: 7
                currsigs.addElement(WPgripped);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S31786=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              S31786=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread34204(int [] tdone, int [] ends){
        switch(S31772){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S31726){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 96, column: 10
              S31726=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\ABSplant.sysj line: 97, column: 5
              currsigs.addElement(pusherRetracted);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 99, column: 10
              S31726=2;
              pusherExtended.setPresent();//sysj\ABSplant.sysj line: 101, column: 5
              currsigs.addElement(pusherExtended);
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
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 100, column: 10
              S31726=3;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\ABSplant.sysj line: 101, column: 5
              currsigs.addElement(pusherExtended);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 103, column: 10
              S31726=0;
              pusherRetracted.setPresent();//sysj\ABSplant.sysj line: 97, column: 5
              currsigs.addElement(pusherRetracted);
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
        break;
      
    }
  }

  public void thread34203(int [] tdone, int [] ends){
        switch(S31719){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S31673){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 83, column: 10
              S31673=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              armAtDest.setPresent();//sysj\ABSplant.sysj line: 84, column: 5
              currsigs.addElement(armAtDest);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 86, column: 10
              S31673=2;
              armAtSource.setPresent();//sysj\ABSplant.sysj line: 88, column: 5
              currsigs.addElement(armAtSource);
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
          
          case 2 : 
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 87, column: 10
              S31673=3;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              armAtSource.setPresent();//sysj\ABSplant.sysj line: 88, column: 5
              currsigs.addElement(armAtSource);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 90, column: 10
              S31673=0;
              armAtDest.setPresent();//sysj\ABSplant.sysj line: 84, column: 5
              currsigs.addElement(armAtDest);
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
        break;
      
    }
  }

  public void thread34201(int [] tdone, int [] ends){
        S32007=1;
    if(modeGUI.getprestatus()){//sysj\ABSplant.sysj line: 180, column: 12
      mode = modeGUI;//sysj\ABSplant.sysj line: 181, column: 5
      mode.setPresent();//sysj\ABSplant.sysj line: 182, column: 5
      currsigs.addElement(mode);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread34199(int [] tdone, int [] ends){
        S31994=1;
    if(empty.getprestatus()){//sysj\ABSplant.sysj line: 175, column: 24
      emptyE.setPresent();//sysj\ABSplant.sysj line: 175, column: 31
      currsigs.addElement(emptyE);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread34198(int [] tdone, int [] ends){
        S31986=1;
    if(armAtDest.getprestatus()){//sysj\ABSplant.sysj line: 173, column: 24
      armAtDestE.setPresent();//sysj\ABSplant.sysj line: 173, column: 35
      currsigs.addElement(armAtDestE);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread34197(int [] tdone, int [] ends){
        S31978=1;
    if(armAtSource.getprestatus()){//sysj\ABSplant.sysj line: 171, column: 24
      armAtSourceE.setPresent();//sysj\ABSplant.sysj line: 171, column: 37
      currsigs.addElement(armAtSourceE);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread34196(int [] tdone, int [] ends){
        S31970=1;
    if(WPgripped.getprestatus()){//sysj\ABSplant.sysj line: 169, column: 24
      WPgrippedE.setPresent();//sysj\ABSplant.sysj line: 169, column: 35
      currsigs.addElement(WPgrippedE);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread34195(int [] tdone, int [] ends){
        S31962=1;
    if(pusherExtended.getprestatus()){//sysj\ABSplant.sysj line: 167, column: 24
      pusherExtendedE.setPresent();//sysj\ABSplant.sysj line: 167, column: 40
      currsigs.addElement(pusherExtendedE);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread34194(int [] tdone, int [] ends){
        S31954=1;
    if(pusherRetracted.getprestatus()){//sysj\ABSplant.sysj line: 165, column: 24
      pusherRetractedE.setPresent();//sysj\ABSplant.sysj line: 165, column: 41
      currsigs.addElement(pusherRetractedE);
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

  public void thread34193(int [] tdone, int [] ends){
        S31996=1;
    thread34194(tdone,ends);
    thread34195(tdone,ends);
    thread34196(tdone,ends);
    thread34197(tdone,ends);
    thread34198(tdone,ends);
    thread34199(tdone,ends);
    int biggest34200 = 0;
    if(ends[14]>=biggest34200){
      biggest34200=ends[14];
    }
    if(ends[15]>=biggest34200){
      biggest34200=ends[15];
    }
    if(ends[16]>=biggest34200){
      biggest34200=ends[16];
    }
    if(ends[17]>=biggest34200){
      biggest34200=ends[17];
    }
    if(ends[18]>=biggest34200){
      biggest34200=ends[18];
    }
    if(ends[19]>=biggest34200){
      biggest34200=ends[19];
    }
    if(biggest34200 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread34192(int [] tdone, int [] ends){
        S31946=1;
    capcount_thread_12 = 5;//sysj\ABSplant.sysj line: 147, column: 3
    if(capDec_7.getprestatus()){//sysj\ABSplant.sysj line: 149, column: 12
      if(capcount_thread_12 > 0) {//sysj\ABSplant.sysj line: 150, column: 5
        capcount_thread_12 = capcount_thread_12 - 1;//sysj\ABSplant.sysj line: 151, column: 6
      }
      if(refill.getprestatus()){//sysj\ABSplant.sysj line: 153, column: 12
        capcount_thread_12 = 5;//sysj\ABSplant.sysj line: 154, column: 5
        if(capcount_thread_12 == 0){//sysj\ABSplant.sysj line: 157, column: 8
          empty.setPresent();//sysj\ABSplant.sysj line: 158, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_12 == 0){//sysj\ABSplant.sysj line: 157, column: 8
          empty.setPresent();//sysj\ABSplant.sysj line: 158, column: 6
          currsigs.addElement(empty);
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
    }
    else {
      if(refill.getprestatus()){//sysj\ABSplant.sysj line: 153, column: 12
        capcount_thread_12 = 5;//sysj\ABSplant.sysj line: 154, column: 5
        if(capcount_thread_12 == 0){//sysj\ABSplant.sysj line: 157, column: 8
          empty.setPresent();//sysj\ABSplant.sysj line: 158, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_12 == 0){//sysj\ABSplant.sysj line: 157, column: 8
          empty.setPresent();//sysj\ABSplant.sysj line: 158, column: 6
          currsigs.addElement(empty);
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
    }
  }

  public void thread34191(int [] tdone, int [] ends){
        S31884=1;
    S31838=0;
    S31820=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread34190(int [] tdone, int [] ends){
        S31816=1;
    S31786=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\ABSplant.sysj line: 109, column: 12
      if((Integer)(capPos_7.getpreval() == null ? 0 : ((Integer)capPos_7.getpreval()).intValue()) == 1){//sysj\ABSplant.sysj line: 110, column: 8
        capPos_7.setPresent();//sysj\ABSplant.sysj line: 111, column: 6
        currsigs.addElement(capPos_7);
        capPos_7.setValue(0);//sysj\ABSplant.sysj line: 111, column: 6
        WPgripped.setPresent();//sysj\ABSplant.sysj line: 113, column: 7
        currsigs.addElement(WPgripped);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S31786=1;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
    else {
      S31786=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread34189(int [] tdone, int [] ends){
        S31772=1;
    S31726=0;
    pusherRetracted.setPresent();//sysj\ABSplant.sysj line: 97, column: 5
    currsigs.addElement(pusherRetracted);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread34188(int [] tdone, int [] ends){
        S31719=1;
    S31673=0;
    armAtDest.setPresent();//sysj\ABSplant.sysj line: 84, column: 5
    currsigs.addElement(armAtDest);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S33036){
        case 0 : 
          S33036=0;
          break RUN;
        
        case 1 : 
          S33036=2;
          S33036=2;
          System.out.println("CapLoaderPlant");//sysj\ABSplant.sysj line: 76, column: 2
          capDec_7.setClear();//sysj\ABSplant.sysj line: 78, column: 2
          capPos_7.setClear();//sysj\ABSplant.sysj line: 79, column: 2
          capPos_7.setPresent();//sysj\ABSplant.sysj line: 80, column: 2
          currsigs.addElement(capPos_7);
          capPos_7.setValue(0);//sysj\ABSplant.sysj line: 80, column: 2
          thread34188(tdone,ends);
          thread34189(tdone,ends);
          thread34190(tdone,ends);
          thread34191(tdone,ends);
          thread34192(tdone,ends);
          thread34193(tdone,ends);
          thread34201(tdone,ends);
          int biggest34202 = 0;
          if(ends[8]>=biggest34202){
            biggest34202=ends[8];
          }
          if(ends[9]>=biggest34202){
            biggest34202=ends[9];
          }
          if(ends[10]>=biggest34202){
            biggest34202=ends[10];
          }
          if(ends[11]>=biggest34202){
            biggest34202=ends[11];
          }
          if(ends[12]>=biggest34202){
            biggest34202=ends[12];
          }
          if(ends[13]>=biggest34202){
            biggest34202=ends[13];
          }
          if(ends[20]>=biggest34202){
            biggest34202=ends[20];
          }
          if(biggest34202 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_7.setClear();//sysj\ABSplant.sysj line: 78, column: 2
          capPos_7.setClear();//sysj\ABSplant.sysj line: 79, column: 2
          thread34203(tdone,ends);
          thread34204(tdone,ends);
          thread34205(tdone,ends);
          thread34206(tdone,ends);
          thread34207(tdone,ends);
          thread34208(tdone,ends);
          thread34216(tdone,ends);
          int biggest34217 = 0;
          if(ends[8]>=biggest34217){
            biggest34217=ends[8];
          }
          if(ends[9]>=biggest34217){
            biggest34217=ends[9];
          }
          if(ends[10]>=biggest34217){
            biggest34217=ends[10];
          }
          if(ends[11]>=biggest34217){
            biggest34217=ends[11];
          }
          if(ends[12]>=biggest34217){
            biggest34217=ends[12];
          }
          if(ends[13]>=biggest34217){
            biggest34217=ends[13];
          }
          if(ends[20]>=biggest34217){
            biggest34217=ends[20];
          }
          if(biggest34217 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
          //FINXME code
          if(biggest34217 == 0){
            S33036=0;
            active[7]=0;
            ends[7]=0;
            S33036=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_7 = new Signal();
    capPos_7 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[7] != 0){
      int index = 7;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
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
      capDec_7.setpreclear();
      capPos_7.setpreclear();
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
      capDec_7.setClear();
      capPos_7.setClear();
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
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
      if(active[7] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
