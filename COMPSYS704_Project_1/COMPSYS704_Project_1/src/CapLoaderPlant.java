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
  private int S33042 = 1;
  private int S31725 = 1;
  private int S31679 = 1;
  private int S31778 = 1;
  private int S31732 = 1;
  private int S31822 = 1;
  private int S31792 = 1;
  private int S31890 = 1;
  private int S31844 = 1;
  private int S31826 = 1;
  private int S31952 = 1;
  private int S32002 = 1;
  private int S31960 = 1;
  private int S31968 = 1;
  private int S31976 = 1;
  private int S31984 = 1;
  private int S31992 = 1;
  private int S32000 = 1;
  private int S32013 = 1;
  
  private int[] ends = new int[74];
  private int[] tdone = new int[74];
  
  public void thread44706(int [] tdone, int [] ends){
        switch(S32013){
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

  public void thread44704(int [] tdone, int [] ends){
        switch(S32000){
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

  public void thread44703(int [] tdone, int [] ends){
        switch(S31992){
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

  public void thread44702(int [] tdone, int [] ends){
        switch(S31984){
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

  public void thread44701(int [] tdone, int [] ends){
        switch(S31976){
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

  public void thread44700(int [] tdone, int [] ends){
        switch(S31968){
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

  public void thread44699(int [] tdone, int [] ends){
        switch(S31960){
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

  public void thread44698(int [] tdone, int [] ends){
        switch(S32002){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread44699(tdone,ends);
        thread44700(tdone,ends);
        thread44701(tdone,ends);
        thread44702(tdone,ends);
        thread44703(tdone,ends);
        thread44704(tdone,ends);
        int biggest44705 = 0;
        if(ends[14]>=biggest44705){
          biggest44705=ends[14];
        }
        if(ends[15]>=biggest44705){
          biggest44705=ends[15];
        }
        if(ends[16]>=biggest44705){
          biggest44705=ends[16];
        }
        if(ends[17]>=biggest44705){
          biggest44705=ends[17];
        }
        if(ends[18]>=biggest44705){
          biggest44705=ends[18];
        }
        if(ends[19]>=biggest44705){
          biggest44705=ends[19];
        }
        if(biggest44705 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest44705 == 0){
          S32002=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread44697(int [] tdone, int [] ends){
        switch(S31952){
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

  public void thread44696(int [] tdone, int [] ends){
        switch(S31890){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S31844){
          case 0 : 
            if(empty.getprestatus()){//sysj\ABSplant.sysj line: 132, column: 10
              S31844=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              switch(S31826){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\ABSplant.sysj line: 134, column: 13
                    S31826=1;
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
                    S31826=2;
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
                    S31826=0;
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
              S31844=0;
              S31826=0;
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

  public void thread44695(int [] tdone, int [] ends){
        switch(S31822){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S31792){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\ABSplant.sysj line: 112, column: 12
              if(armAtSource.getprestatus()){//sysj\ABSplant.sysj line: 115, column: 14
                capPos_7.setPresent();//sysj\ABSplant.sysj line: 116, column: 7
                currsigs.addElement(capPos_7);
                capPos_7.setValue(1);//sysj\ABSplant.sysj line: 116, column: 7
                S31792=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S31792=1;
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
            S31792=1;
            S31792=0;
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
                S31792=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              S31792=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44694(int [] tdone, int [] ends){
        switch(S31778){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S31732){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 96, column: 10
              S31732=1;
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
              S31732=2;
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
              S31732=3;
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
              S31732=0;
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

  public void thread44693(int [] tdone, int [] ends){
        switch(S31725){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S31679){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 83, column: 10
              S31679=1;
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
              S31679=2;
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
              S31679=3;
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
              S31679=0;
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

  public void thread44691(int [] tdone, int [] ends){
        S32013=1;
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

  public void thread44689(int [] tdone, int [] ends){
        S32000=1;
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

  public void thread44688(int [] tdone, int [] ends){
        S31992=1;
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

  public void thread44687(int [] tdone, int [] ends){
        S31984=1;
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

  public void thread44686(int [] tdone, int [] ends){
        S31976=1;
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

  public void thread44685(int [] tdone, int [] ends){
        S31968=1;
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

  public void thread44684(int [] tdone, int [] ends){
        S31960=1;
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

  public void thread44683(int [] tdone, int [] ends){
        S32002=1;
    thread44684(tdone,ends);
    thread44685(tdone,ends);
    thread44686(tdone,ends);
    thread44687(tdone,ends);
    thread44688(tdone,ends);
    thread44689(tdone,ends);
    int biggest44690 = 0;
    if(ends[14]>=biggest44690){
      biggest44690=ends[14];
    }
    if(ends[15]>=biggest44690){
      biggest44690=ends[15];
    }
    if(ends[16]>=biggest44690){
      biggest44690=ends[16];
    }
    if(ends[17]>=biggest44690){
      biggest44690=ends[17];
    }
    if(ends[18]>=biggest44690){
      biggest44690=ends[18];
    }
    if(ends[19]>=biggest44690){
      biggest44690=ends[19];
    }
    if(biggest44690 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread44682(int [] tdone, int [] ends){
        S31952=1;
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

  public void thread44681(int [] tdone, int [] ends){
        S31890=1;
    S31844=0;
    S31826=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread44680(int [] tdone, int [] ends){
        S31822=1;
    S31792=0;
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
        S31792=1;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
    else {
      S31792=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread44679(int [] tdone, int [] ends){
        S31778=1;
    S31732=0;
    pusherRetracted.setPresent();//sysj\ABSplant.sysj line: 97, column: 5
    currsigs.addElement(pusherRetracted);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread44678(int [] tdone, int [] ends){
        S31725=1;
    S31679=0;
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
      switch(S33042){
        case 0 : 
          S33042=0;
          break RUN;
        
        case 1 : 
          S33042=2;
          S33042=2;
          System.out.println("CapLoaderPlant");//sysj\ABSplant.sysj line: 76, column: 2
          capDec_7.setClear();//sysj\ABSplant.sysj line: 78, column: 2
          capPos_7.setClear();//sysj\ABSplant.sysj line: 79, column: 2
          capPos_7.setPresent();//sysj\ABSplant.sysj line: 80, column: 2
          currsigs.addElement(capPos_7);
          capPos_7.setValue(0);//sysj\ABSplant.sysj line: 80, column: 2
          thread44678(tdone,ends);
          thread44679(tdone,ends);
          thread44680(tdone,ends);
          thread44681(tdone,ends);
          thread44682(tdone,ends);
          thread44683(tdone,ends);
          thread44691(tdone,ends);
          int biggest44692 = 0;
          if(ends[8]>=biggest44692){
            biggest44692=ends[8];
          }
          if(ends[9]>=biggest44692){
            biggest44692=ends[9];
          }
          if(ends[10]>=biggest44692){
            biggest44692=ends[10];
          }
          if(ends[11]>=biggest44692){
            biggest44692=ends[11];
          }
          if(ends[12]>=biggest44692){
            biggest44692=ends[12];
          }
          if(ends[13]>=biggest44692){
            biggest44692=ends[13];
          }
          if(ends[20]>=biggest44692){
            biggest44692=ends[20];
          }
          if(biggest44692 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_7.setClear();//sysj\ABSplant.sysj line: 78, column: 2
          capPos_7.setClear();//sysj\ABSplant.sysj line: 79, column: 2
          thread44693(tdone,ends);
          thread44694(tdone,ends);
          thread44695(tdone,ends);
          thread44696(tdone,ends);
          thread44697(tdone,ends);
          thread44698(tdone,ends);
          thread44706(tdone,ends);
          int biggest44707 = 0;
          if(ends[8]>=biggest44707){
            biggest44707=ends[8];
          }
          if(ends[9]>=biggest44707){
            biggest44707=ends[9];
          }
          if(ends[10]>=biggest44707){
            biggest44707=ends[10];
          }
          if(ends[11]>=biggest44707){
            biggest44707=ends[11];
          }
          if(ends[12]>=biggest44707){
            biggest44707=ends[12];
          }
          if(ends[13]>=biggest44707){
            biggest44707=ends[13];
          }
          if(ends[20]>=biggest44707){
            biggest44707=ends[20];
          }
          if(biggest44707 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
          //FINXME code
          if(biggest44707 == 0){
            S33042=0;
            active[7]=0;
            ends[7]=0;
            S33042=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
