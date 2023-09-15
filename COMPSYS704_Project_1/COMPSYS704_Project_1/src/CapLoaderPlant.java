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
  private Signal capDec_29;
  private Signal capPos_29;
  private int capcount_thread_34;//sysj\ABSplant.sysj line: 421, column: 3
  private int S45577 = 1;
  private int S44260 = 1;
  private int S44214 = 1;
  private int S44313 = 1;
  private int S44267 = 1;
  private int S44357 = 1;
  private int S44327 = 1;
  private int S44425 = 1;
  private int S44379 = 1;
  private int S44361 = 1;
  private int S44487 = 1;
  private int S44537 = 1;
  private int S44495 = 1;
  private int S44503 = 1;
  private int S44511 = 1;
  private int S44519 = 1;
  private int S44527 = 1;
  private int S44535 = 1;
  private int S44548 = 1;
  
  private int[] ends = new int[96];
  private int[] tdone = new int[96];
  
  public void thread57287(int [] tdone, int [] ends){
        switch(S44548){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        if(modeGUI.getprestatus()){//sysj\ABSplant.sysj line: 454, column: 12
          mode = modeGUI;//sysj\ABSplant.sysj line: 455, column: 5
          mode.setPresent();//sysj\ABSplant.sysj line: 456, column: 5
          currsigs.addElement(mode);
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread57285(int [] tdone, int [] ends){
        switch(S44535){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\ABSplant.sysj line: 449, column: 24
          emptyE.setPresent();//sysj\ABSplant.sysj line: 449, column: 31
          currsigs.addElement(emptyE);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        break;
      
    }
  }

  public void thread57284(int [] tdone, int [] ends){
        switch(S44527){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\ABSplant.sysj line: 447, column: 24
          armAtDestE.setPresent();//sysj\ABSplant.sysj line: 447, column: 35
          currsigs.addElement(armAtDestE);
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        break;
      
    }
  }

  public void thread57283(int [] tdone, int [] ends){
        switch(S44519){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\ABSplant.sysj line: 445, column: 24
          armAtSourceE.setPresent();//sysj\ABSplant.sysj line: 445, column: 37
          currsigs.addElement(armAtSourceE);
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        break;
      
    }
  }

  public void thread57282(int [] tdone, int [] ends){
        switch(S44511){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\ABSplant.sysj line: 443, column: 24
          WPgrippedE.setPresent();//sysj\ABSplant.sysj line: 443, column: 35
          currsigs.addElement(WPgrippedE);
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        break;
      
    }
  }

  public void thread57281(int [] tdone, int [] ends){
        switch(S44503){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\ABSplant.sysj line: 441, column: 24
          pusherExtendedE.setPresent();//sysj\ABSplant.sysj line: 441, column: 40
          currsigs.addElement(pusherExtendedE);
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        break;
      
    }
  }

  public void thread57280(int [] tdone, int [] ends){
        switch(S44495){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\ABSplant.sysj line: 439, column: 24
          pusherRetractedE.setPresent();//sysj\ABSplant.sysj line: 439, column: 41
          currsigs.addElement(pusherRetractedE);
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        break;
      
    }
  }

  public void thread57279(int [] tdone, int [] ends){
        switch(S44537){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        thread57280(tdone,ends);
        thread57281(tdone,ends);
        thread57282(tdone,ends);
        thread57283(tdone,ends);
        thread57284(tdone,ends);
        thread57285(tdone,ends);
        int biggest57286 = 0;
        if(ends[36]>=biggest57286){
          biggest57286=ends[36];
        }
        if(ends[37]>=biggest57286){
          biggest57286=ends[37];
        }
        if(ends[38]>=biggest57286){
          biggest57286=ends[38];
        }
        if(ends[39]>=biggest57286){
          biggest57286=ends[39];
        }
        if(ends[40]>=biggest57286){
          biggest57286=ends[40];
        }
        if(ends[41]>=biggest57286){
          biggest57286=ends[41];
        }
        if(biggest57286 == 1){
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        //FINXME code
        if(biggest57286 == 0){
          S44537=0;
          active[35]=0;
          ends[35]=0;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread57278(int [] tdone, int [] ends){
        switch(S44487){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(capDec_29.getprestatus()){//sysj\ABSplant.sysj line: 423, column: 12
          if(capcount_thread_34 > 0) {//sysj\ABSplant.sysj line: 424, column: 5
            capcount_thread_34 = capcount_thread_34 - 1;//sysj\ABSplant.sysj line: 425, column: 6
          }
          if(refill.getprestatus()){//sysj\ABSplant.sysj line: 427, column: 12
            capcount_thread_34 = 5;//sysj\ABSplant.sysj line: 428, column: 5
            if(capcount_thread_34 == 0){//sysj\ABSplant.sysj line: 431, column: 8
              empty.setPresent();//sysj\ABSplant.sysj line: 432, column: 6
              currsigs.addElement(empty);
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            else {
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
          }
          else {
            if(capcount_thread_34 == 0){//sysj\ABSplant.sysj line: 431, column: 8
              empty.setPresent();//sysj\ABSplant.sysj line: 432, column: 6
              currsigs.addElement(empty);
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            else {
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
          }
        }
        else {
          if(refill.getprestatus()){//sysj\ABSplant.sysj line: 427, column: 12
            capcount_thread_34 = 5;//sysj\ABSplant.sysj line: 428, column: 5
            if(capcount_thread_34 == 0){//sysj\ABSplant.sysj line: 431, column: 8
              empty.setPresent();//sysj\ABSplant.sysj line: 432, column: 6
              currsigs.addElement(empty);
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            else {
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
          }
          else {
            if(capcount_thread_34 == 0){//sysj\ABSplant.sysj line: 431, column: 8
              empty.setPresent();//sysj\ABSplant.sysj line: 432, column: 6
              currsigs.addElement(empty);
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            else {
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread57277(int [] tdone, int [] ends){
        switch(S44425){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S44379){
          case 0 : 
            if(empty.getprestatus()){//sysj\ABSplant.sysj line: 406, column: 10
              S44379=1;
              active[33]=1;
              ends[33]=1;
              tdone[33]=1;
            }
            else {
              switch(S44361){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\ABSplant.sysj line: 408, column: 13
                    S44361=1;
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                  else {
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                  break;
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\ABSplant.sysj line: 409, column: 13
                    capPos_29.setPresent();//sysj\ABSplant.sysj line: 411, column: 7
                    currsigs.addElement(capPos_29);
                    capPos_29.setValue(1);//sysj\ABSplant.sysj line: 411, column: 7
                    S44361=2;
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                  else {
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                  break;
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\ABSplant.sysj line: 412, column: 13
                    capDec_29.setPresent();//sysj\ABSplant.sysj line: 413, column: 7
                    currsigs.addElement(capDec_29);
                    S44361=0;
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                  else {
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\ABSplant.sysj line: 416, column: 10
              S44379=0;
              S44361=0;
              active[33]=1;
              ends[33]=1;
              tdone[33]=1;
            }
            else {
              active[33]=1;
              ends[33]=1;
              tdone[33]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57276(int [] tdone, int [] ends){
        switch(S44357){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S44327){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\ABSplant.sysj line: 386, column: 12
              if(armAtSource.getprestatus()){//sysj\ABSplant.sysj line: 389, column: 14
                capPos_29.setPresent();//sysj\ABSplant.sysj line: 390, column: 7
                currsigs.addElement(capPos_29);
                capPos_29.setValue(1);//sysj\ABSplant.sysj line: 390, column: 7
                S44327=1;
                active[32]=1;
                ends[32]=1;
                tdone[32]=1;
              }
              else {
                S44327=1;
                active[32]=1;
                ends[32]=1;
                tdone[32]=1;
              }
            }
            else {
              WPgripped.setPresent();//sysj\ABSplant.sysj line: 387, column: 7
              currsigs.addElement(WPgripped);
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
          case 1 : 
            S44327=1;
            S44327=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\ABSplant.sysj line: 383, column: 12
              if((Integer)(capPos_29.getpreval() == null ? 0 : ((Integer)capPos_29.getpreval()).intValue()) == 1){//sysj\ABSplant.sysj line: 384, column: 8
                capPos_29.setPresent();//sysj\ABSplant.sysj line: 385, column: 6
                currsigs.addElement(capPos_29);
                capPos_29.setValue(0);//sysj\ABSplant.sysj line: 385, column: 6
                WPgripped.setPresent();//sysj\ABSplant.sysj line: 387, column: 7
                currsigs.addElement(WPgripped);
                active[32]=1;
                ends[32]=1;
                tdone[32]=1;
              }
              else {
                S44327=1;
                active[32]=1;
                ends[32]=1;
                tdone[32]=1;
              }
            }
            else {
              S44327=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57275(int [] tdone, int [] ends){
        switch(S44313){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        switch(S44267){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 370, column: 10
              S44267=1;
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\ABSplant.sysj line: 371, column: 5
              currsigs.addElement(pusherRetracted);
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 373, column: 10
              S44267=2;
              pusherExtended.setPresent();//sysj\ABSplant.sysj line: 375, column: 5
              currsigs.addElement(pusherExtended);
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            else {
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            break;
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 374, column: 10
              S44267=3;
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\ABSplant.sysj line: 375, column: 5
              currsigs.addElement(pusherExtended);
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 377, column: 10
              S44267=0;
              pusherRetracted.setPresent();//sysj\ABSplant.sysj line: 371, column: 5
              currsigs.addElement(pusherRetracted);
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            else {
              active[31]=1;
              ends[31]=1;
              tdone[31]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57274(int [] tdone, int [] ends){
        switch(S44260){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S44214){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 357, column: 10
              S44214=1;
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            else {
              armAtDest.setPresent();//sysj\ABSplant.sysj line: 358, column: 5
              currsigs.addElement(armAtDest);
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 360, column: 10
              S44214=2;
              armAtSource.setPresent();//sysj\ABSplant.sysj line: 362, column: 5
              currsigs.addElement(armAtSource);
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            else {
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
          case 2 : 
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 361, column: 10
              S44214=3;
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            else {
              armAtSource.setPresent();//sysj\ABSplant.sysj line: 362, column: 5
              currsigs.addElement(armAtSource);
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 364, column: 10
              S44214=0;
              armAtDest.setPresent();//sysj\ABSplant.sysj line: 358, column: 5
              currsigs.addElement(armAtDest);
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            else {
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57272(int [] tdone, int [] ends){
        S44548=1;
    if(modeGUI.getprestatus()){//sysj\ABSplant.sysj line: 454, column: 12
      mode = modeGUI;//sysj\ABSplant.sysj line: 455, column: 5
      mode.setPresent();//sysj\ABSplant.sysj line: 456, column: 5
      currsigs.addElement(mode);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread57270(int [] tdone, int [] ends){
        S44535=1;
    if(empty.getprestatus()){//sysj\ABSplant.sysj line: 449, column: 24
      emptyE.setPresent();//sysj\ABSplant.sysj line: 449, column: 31
      currsigs.addElement(emptyE);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread57269(int [] tdone, int [] ends){
        S44527=1;
    if(armAtDest.getprestatus()){//sysj\ABSplant.sysj line: 447, column: 24
      armAtDestE.setPresent();//sysj\ABSplant.sysj line: 447, column: 35
      currsigs.addElement(armAtDestE);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread57268(int [] tdone, int [] ends){
        S44519=1;
    if(armAtSource.getprestatus()){//sysj\ABSplant.sysj line: 445, column: 24
      armAtSourceE.setPresent();//sysj\ABSplant.sysj line: 445, column: 37
      currsigs.addElement(armAtSourceE);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread57267(int [] tdone, int [] ends){
        S44511=1;
    if(WPgripped.getprestatus()){//sysj\ABSplant.sysj line: 443, column: 24
      WPgrippedE.setPresent();//sysj\ABSplant.sysj line: 443, column: 35
      currsigs.addElement(WPgrippedE);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread57266(int [] tdone, int [] ends){
        S44503=1;
    if(pusherExtended.getprestatus()){//sysj\ABSplant.sysj line: 441, column: 24
      pusherExtendedE.setPresent();//sysj\ABSplant.sysj line: 441, column: 40
      currsigs.addElement(pusherExtendedE);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread57265(int [] tdone, int [] ends){
        S44495=1;
    if(pusherRetracted.getprestatus()){//sysj\ABSplant.sysj line: 439, column: 24
      pusherRetractedE.setPresent();//sysj\ABSplant.sysj line: 439, column: 41
      currsigs.addElement(pusherRetractedE);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread57264(int [] tdone, int [] ends){
        S44537=1;
    thread57265(tdone,ends);
    thread57266(tdone,ends);
    thread57267(tdone,ends);
    thread57268(tdone,ends);
    thread57269(tdone,ends);
    thread57270(tdone,ends);
    int biggest57271 = 0;
    if(ends[36]>=biggest57271){
      biggest57271=ends[36];
    }
    if(ends[37]>=biggest57271){
      biggest57271=ends[37];
    }
    if(ends[38]>=biggest57271){
      biggest57271=ends[38];
    }
    if(ends[39]>=biggest57271){
      biggest57271=ends[39];
    }
    if(ends[40]>=biggest57271){
      biggest57271=ends[40];
    }
    if(ends[41]>=biggest57271){
      biggest57271=ends[41];
    }
    if(biggest57271 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread57263(int [] tdone, int [] ends){
        S44487=1;
    capcount_thread_34 = 5;//sysj\ABSplant.sysj line: 421, column: 3
    if(capDec_29.getprestatus()){//sysj\ABSplant.sysj line: 423, column: 12
      if(capcount_thread_34 > 0) {//sysj\ABSplant.sysj line: 424, column: 5
        capcount_thread_34 = capcount_thread_34 - 1;//sysj\ABSplant.sysj line: 425, column: 6
      }
      if(refill.getprestatus()){//sysj\ABSplant.sysj line: 427, column: 12
        capcount_thread_34 = 5;//sysj\ABSplant.sysj line: 428, column: 5
        if(capcount_thread_34 == 0){//sysj\ABSplant.sysj line: 431, column: 8
          empty.setPresent();//sysj\ABSplant.sysj line: 432, column: 6
          currsigs.addElement(empty);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
      }
      else {
        if(capcount_thread_34 == 0){//sysj\ABSplant.sysj line: 431, column: 8
          empty.setPresent();//sysj\ABSplant.sysj line: 432, column: 6
          currsigs.addElement(empty);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
      }
    }
    else {
      if(refill.getprestatus()){//sysj\ABSplant.sysj line: 427, column: 12
        capcount_thread_34 = 5;//sysj\ABSplant.sysj line: 428, column: 5
        if(capcount_thread_34 == 0){//sysj\ABSplant.sysj line: 431, column: 8
          empty.setPresent();//sysj\ABSplant.sysj line: 432, column: 6
          currsigs.addElement(empty);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
      }
      else {
        if(capcount_thread_34 == 0){//sysj\ABSplant.sysj line: 431, column: 8
          empty.setPresent();//sysj\ABSplant.sysj line: 432, column: 6
          currsigs.addElement(empty);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
      }
    }
  }

  public void thread57262(int [] tdone, int [] ends){
        S44425=1;
    S44379=0;
    S44361=0;
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread57261(int [] tdone, int [] ends){
        S44357=1;
    S44327=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\ABSplant.sysj line: 383, column: 12
      if((Integer)(capPos_29.getpreval() == null ? 0 : ((Integer)capPos_29.getpreval()).intValue()) == 1){//sysj\ABSplant.sysj line: 384, column: 8
        capPos_29.setPresent();//sysj\ABSplant.sysj line: 385, column: 6
        currsigs.addElement(capPos_29);
        capPos_29.setValue(0);//sysj\ABSplant.sysj line: 385, column: 6
        WPgripped.setPresent();//sysj\ABSplant.sysj line: 387, column: 7
        currsigs.addElement(WPgripped);
        active[32]=1;
        ends[32]=1;
        tdone[32]=1;
      }
      else {
        S44327=1;
        active[32]=1;
        ends[32]=1;
        tdone[32]=1;
      }
    }
    else {
      S44327=1;
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread57260(int [] tdone, int [] ends){
        S44313=1;
    S44267=0;
    pusherRetracted.setPresent();//sysj\ABSplant.sysj line: 371, column: 5
    currsigs.addElement(pusherRetracted);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread57259(int [] tdone, int [] ends){
        S44260=1;
    S44214=0;
    armAtDest.setPresent();//sysj\ABSplant.sysj line: 358, column: 5
    currsigs.addElement(armAtDest);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S45577){
        case 0 : 
          S45577=0;
          break RUN;
        
        case 1 : 
          S45577=2;
          S45577=2;
          System.out.println("CapLoaderPlant");//sysj\ABSplant.sysj line: 350, column: 2
          capDec_29.setClear();//sysj\ABSplant.sysj line: 352, column: 2
          capPos_29.setClear();//sysj\ABSplant.sysj line: 353, column: 2
          capPos_29.setPresent();//sysj\ABSplant.sysj line: 354, column: 2
          currsigs.addElement(capPos_29);
          capPos_29.setValue(0);//sysj\ABSplant.sysj line: 354, column: 2
          thread57259(tdone,ends);
          thread57260(tdone,ends);
          thread57261(tdone,ends);
          thread57262(tdone,ends);
          thread57263(tdone,ends);
          thread57264(tdone,ends);
          thread57272(tdone,ends);
          int biggest57273 = 0;
          if(ends[30]>=biggest57273){
            biggest57273=ends[30];
          }
          if(ends[31]>=biggest57273){
            biggest57273=ends[31];
          }
          if(ends[32]>=biggest57273){
            biggest57273=ends[32];
          }
          if(ends[33]>=biggest57273){
            biggest57273=ends[33];
          }
          if(ends[34]>=biggest57273){
            biggest57273=ends[34];
          }
          if(ends[35]>=biggest57273){
            biggest57273=ends[35];
          }
          if(ends[42]>=biggest57273){
            biggest57273=ends[42];
          }
          if(biggest57273 == 1){
            active[29]=1;
            ends[29]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_29.setClear();//sysj\ABSplant.sysj line: 352, column: 2
          capPos_29.setClear();//sysj\ABSplant.sysj line: 353, column: 2
          thread57274(tdone,ends);
          thread57275(tdone,ends);
          thread57276(tdone,ends);
          thread57277(tdone,ends);
          thread57278(tdone,ends);
          thread57279(tdone,ends);
          thread57287(tdone,ends);
          int biggest57288 = 0;
          if(ends[30]>=biggest57288){
            biggest57288=ends[30];
          }
          if(ends[31]>=biggest57288){
            biggest57288=ends[31];
          }
          if(ends[32]>=biggest57288){
            biggest57288=ends[32];
          }
          if(ends[33]>=biggest57288){
            biggest57288=ends[33];
          }
          if(ends[34]>=biggest57288){
            biggest57288=ends[34];
          }
          if(ends[35]>=biggest57288){
            biggest57288=ends[35];
          }
          if(ends[42]>=biggest57288){
            biggest57288=ends[42];
          }
          if(biggest57288 == 1){
            active[29]=1;
            ends[29]=1;
            break RUN;
          }
          //FINXME code
          if(biggest57288 == 0){
            S45577=0;
            active[29]=0;
            ends[29]=0;
            S45577=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_29 = new Signal();
    capPos_29 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[29] != 0){
      int index = 29;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[29]!=0 || suspended[29]!=0 || active[29]!=1);
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
      capDec_29.setpreclear();
      capPos_29.setpreclear();
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
      capDec_29.setClear();
      capPos_29.setClear();
      if(paused[29]!=0 || suspended[29]!=0 || active[29]!=1);
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
      if(active[29] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
