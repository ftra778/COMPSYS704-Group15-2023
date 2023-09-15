import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\ABScontroller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABScontroller.sysj line: 2, column: 1

public class CapLoaderController extends ClockDomain{
  public CapLoaderController(String name){super(name);}
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
  public Signal emergency = new Signal("emergency", Signal.INPUT);
  public Signal rotaryTableTriggerLoader = new Signal("rotaryTableTriggerLoader", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  public Signal bottleCapLoaded = new Signal("bottleCapLoaded", Signal.OUTPUT);
  public Signal idle = new Signal("idle", Signal.OUTPUT);
  private Signal auto_53;
  private int S20596 = 1;
  private int S14238 = 1;
  private int S14237 = 1;
  private int S13341 = 1;
  private int S13333 = 1;
  private int S14192 = 1;
  private int S13346 = 1;
  private int S13351 = 1;
  private int S13350 = 1;
  private int S13383 = 1;
  private int S13382 = 1;
  private int S13417 = 1;
  private int S13416 = 1;
  private int S13449 = 1;
  private int S13448 = 1;
  private int S13488 = 1;
  private int S13487 = 1;
  private int S13481 = 1;
  private int S13486 = 1;
  private int S13557 = 1;
  private int S13556 = 1;
  private int S13589 = 1;
  private int S13588 = 1;
  private int S14236 = 1;
  private int S14206 = 1;
  
  private int[] ends = new int[93];
  private int[] tdone = new int[93];
  
  public void thread43625(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 403, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 403, column: 58
      currsigs.addElement(armDest);
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
    else {
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
  }

  public void thread43624(int [] tdone, int [] ends){
        if(vacOnM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 401, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 401, column: 45
      currsigs.addElement(vacOn);
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
    else {
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
  }

  public void thread43623(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 399, column: 50
      currsigs.addElement(pusherExtend);
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
    else {
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
  }

  public void thread43622(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 397, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 397, column: 58
      currsigs.addElement(armSource);
      active[59]=0;
      ends[59]=0;
      tdone[59]=1;
    }
    else {
      active[59]=0;
      ends[59]=0;
      tdone[59]=1;
    }
  }

  public void thread43621(int [] tdone, int [] ends){
        S14236=1;
    S14206=0;
    if(!auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 396, column: 14
      thread43622(tdone,ends);
      thread43623(tdone,ends);
      thread43624(tdone,ends);
      thread43625(tdone,ends);
      int biggest43626 = 0;
      if(ends[59]>=biggest43626){
        biggest43626=ends[59];
      }
      if(ends[60]>=biggest43626){
        biggest43626=ends[60];
      }
      if(ends[61]>=biggest43626){
        biggest43626=ends[61];
      }
      if(ends[62]>=biggest43626){
        biggest43626=ends[62];
      }
      //FINXME code
      if(biggest43626 == 0){
        S14206=1;
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
      }
    }
    else {
      S14206=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread43620(int [] tdone, int [] ends){
        S14192=1;
    S13346=0;
    idle.setPresent();//sysj\ABScontroller.sysj line: 284, column: 7
    currsigs.addElement(idle);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread43619(int [] tdone, int [] ends){
        S13341=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 271, column: 9
      S13333=0;
      auto_53.setPresent();//sysj\ABScontroller.sysj line: 272, column: 7
      currsigs.addElement(auto_53);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S13333=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread43616(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 403, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 403, column: 58
      currsigs.addElement(armDest);
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
    else {
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
  }

  public void thread43615(int [] tdone, int [] ends){
        if(vacOnM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 401, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 401, column: 45
      currsigs.addElement(vacOn);
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
    else {
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
  }

  public void thread43614(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 399, column: 50
      currsigs.addElement(pusherExtend);
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
    else {
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
  }

  public void thread43613(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 397, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 397, column: 58
      currsigs.addElement(armSource);
      active[59]=0;
      ends[59]=0;
      tdone[59]=1;
    }
    else {
      active[59]=0;
      ends[59]=0;
      tdone[59]=1;
    }
  }

  public void thread43612(int [] tdone, int [] ends){
        S14236=1;
    S14206=0;
    if(!auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 396, column: 14
      thread43613(tdone,ends);
      thread43614(tdone,ends);
      thread43615(tdone,ends);
      thread43616(tdone,ends);
      int biggest43617 = 0;
      if(ends[59]>=biggest43617){
        biggest43617=ends[59];
      }
      if(ends[60]>=biggest43617){
        biggest43617=ends[60];
      }
      if(ends[61]>=biggest43617){
        biggest43617=ends[61];
      }
      if(ends[62]>=biggest43617){
        biggest43617=ends[62];
      }
      //FINXME code
      if(biggest43617 == 0){
        S14206=1;
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
      }
    }
    else {
      S14206=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread43611(int [] tdone, int [] ends){
        S14192=1;
    S13346=0;
    idle.setPresent();//sysj\ABScontroller.sysj line: 284, column: 7
    currsigs.addElement(idle);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread43610(int [] tdone, int [] ends){
        S13341=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 271, column: 9
      S13333=0;
      auto_53.setPresent();//sysj\ABScontroller.sysj line: 272, column: 7
      currsigs.addElement(auto_53);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S13333=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread43607(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 403, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 403, column: 58
      currsigs.addElement(armDest);
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
    else {
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
  }

  public void thread43606(int [] tdone, int [] ends){
        if(vacOnM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 401, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 401, column: 45
      currsigs.addElement(vacOn);
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
    else {
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
  }

  public void thread43605(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 399, column: 50
      currsigs.addElement(pusherExtend);
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
    else {
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
  }

  public void thread43604(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 397, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 397, column: 58
      currsigs.addElement(armSource);
      active[59]=0;
      ends[59]=0;
      tdone[59]=1;
    }
    else {
      active[59]=0;
      ends[59]=0;
      tdone[59]=1;
    }
  }

  public void thread43602(int [] tdone, int [] ends){
        active[62]=0;
    ends[62]=0;
    tdone[62]=1;
  }

  public void thread43601(int [] tdone, int [] ends){
        active[61]=0;
    ends[61]=0;
    tdone[61]=1;
  }

  public void thread43600(int [] tdone, int [] ends){
        active[60]=0;
    ends[60]=0;
    tdone[60]=1;
  }

  public void thread43599(int [] tdone, int [] ends){
        active[59]=0;
    ends[59]=0;
    tdone[59]=1;
  }

  public void thread43598(int [] tdone, int [] ends){
        switch(S14236){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        switch(S14206){
          case 0 : 
            thread43599(tdone,ends);
            thread43600(tdone,ends);
            thread43601(tdone,ends);
            thread43602(tdone,ends);
            int biggest43603 = 0;
            if(ends[59]>=biggest43603){
              biggest43603=ends[59];
            }
            if(ends[60]>=biggest43603){
              biggest43603=ends[60];
            }
            if(ends[61]>=biggest43603){
              biggest43603=ends[61];
            }
            if(ends[62]>=biggest43603){
              biggest43603=ends[62];
            }
            //FINXME code
            if(biggest43603 == 0){
              S14206=1;
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            break;
          
          case 1 : 
            S14206=1;
            S14206=0;
            if(!auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 396, column: 14
              thread43604(tdone,ends);
              thread43605(tdone,ends);
              thread43606(tdone,ends);
              thread43607(tdone,ends);
              int biggest43608 = 0;
              if(ends[59]>=biggest43608){
                biggest43608=ends[59];
              }
              if(ends[60]>=biggest43608){
                biggest43608=ends[60];
              }
              if(ends[61]>=biggest43608){
                biggest43608=ends[61];
              }
              if(ends[62]>=biggest43608){
                biggest43608=ends[62];
              }
              //FINXME code
              if(biggest43608 == 0){
                S14206=1;
                active[58]=1;
                ends[58]=1;
                tdone[58]=1;
              }
            }
            else {
              S14206=1;
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43596(int [] tdone, int [] ends){
        S13486=1;
    vacOn.setPresent();//sysj\ABScontroller.sysj line: 348, column: 35
    currsigs.addElement(vacOn);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread43595(int [] tdone, int [] ends){
        S13481=1;
    armDest.setPresent();//sysj\ABScontroller.sysj line: 348, column: 11
    currsigs.addElement(armDest);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread43593(int [] tdone, int [] ends){
        switch(S13486){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\ABScontroller.sysj line: 348, column: 35
        currsigs.addElement(vacOn);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread43592(int [] tdone, int [] ends){
        switch(S13481){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\ABScontroller.sysj line: 348, column: 11
        currsigs.addElement(armDest);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread43590(int [] tdone, int [] ends){
        S13486=1;
    vacOn.setPresent();//sysj\ABScontroller.sysj line: 348, column: 35
    currsigs.addElement(vacOn);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread43589(int [] tdone, int [] ends){
        S13481=1;
    armDest.setPresent();//sysj\ABScontroller.sysj line: 348, column: 11
    currsigs.addElement(armDest);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread43588(int [] tdone, int [] ends){
        switch(S14192){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        switch(S13346){
          case 0 : 
            if(request.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 283, column: 12
              System.out.println("req");//sysj\ABScontroller.sysj line: 286, column: 6
              S13346=1;
              S13351=0;
              if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 289, column: 16
                S13350=0;
                armDest.setPresent();//sysj\ABScontroller.sysj line: 290, column: 9
                currsigs.addElement(armDest);
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
              else {
                S13350=1;
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
            }
            else {
              idle.setPresent();//sysj\ABScontroller.sysj line: 284, column: 7
              currsigs.addElement(idle);
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 287, column: 12
              System.out.println("armAtDest");//sysj\ABScontroller.sysj line: 297, column: 6
              S13346=2;
              S13383=0;
              if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 302, column: 16
                S13382=0;
                pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 303, column: 9
                currsigs.addElement(pusherExtend);
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
              else {
                S13382=1;
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
            }
            else {
              switch(S13351){
                case 0 : 
                  switch(S13350){
                    case 0 : 
                      armDest.setPresent();//sysj\ABScontroller.sysj line: 290, column: 9
                      currsigs.addElement(armDest);
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                    case 1 : 
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S13351=1;
                  S13351=0;
                  if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 289, column: 16
                    S13350=0;
                    armDest.setPresent();//sysj\ABScontroller.sysj line: 290, column: 9
                    currsigs.addElement(armDest);
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  else {
                    S13350=1;
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(pusherExtended.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 300, column: 12
              System.out.println("pusherEx");//sysj\ABScontroller.sysj line: 310, column: 6
              S13346=3;
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            else {
              switch(S13383){
                case 0 : 
                  switch(S13382){
                    case 0 : 
                      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 303, column: 9
                      currsigs.addElement(pusherExtend);
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                    case 1 : 
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S13383=1;
                  S13383=0;
                  if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 302, column: 16
                    S13382=0;
                    pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 303, column: 9
                    currsigs.addElement(pusherExtend);
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  else {
                    S13382=1;
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 3 : 
            if(pusherRetracted.getprestatus()){//sysj\ABScontroller.sysj line: 313, column: 12
              System.out.println("pusherRe");//sysj\ABScontroller.sysj line: 316, column: 6
              S13346=4;
              S13417=0;
              if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 321, column: 16
                S13416=0;
                armSource.setPresent();//sysj\ABScontroller.sysj line: 322, column: 9
                currsigs.addElement(armSource);
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
              else {
                S13416=1;
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
            }
            else {
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            break;
          
          case 4 : 
            if(armAtSource.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 319, column: 12
              System.out.println("armAS");//sysj\ABScontroller.sysj line: 329, column: 6
              S13346=5;
              S13449=0;
              if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 334, column: 16
                S13448=0;
                vacOn.setPresent();//sysj\ABScontroller.sysj line: 335, column: 9
                currsigs.addElement(vacOn);
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
              else {
                S13448=1;
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
            }
            else {
              switch(S13417){
                case 0 : 
                  switch(S13416){
                    case 0 : 
                      armSource.setPresent();//sysj\ABScontroller.sysj line: 322, column: 9
                      currsigs.addElement(armSource);
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                    case 1 : 
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S13417=1;
                  S13417=0;
                  if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 321, column: 16
                    S13416=0;
                    armSource.setPresent();//sysj\ABScontroller.sysj line: 322, column: 9
                    currsigs.addElement(armSource);
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  else {
                    S13416=1;
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 5 : 
            if(WPgripped.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 332, column: 12
              System.out.println("WPgripped");//sysj\ABScontroller.sysj line: 342, column: 6
              S13346=6;
              S13488=0;
              if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 347, column: 16
                S13487=0;
                thread43589(tdone,ends);
                thread43590(tdone,ends);
                int biggest43591 = 0;
                if(ends[56]>=biggest43591){
                  biggest43591=ends[56];
                }
                if(ends[57]>=biggest43591){
                  biggest43591=ends[57];
                }
                if(biggest43591 == 1){
                  active[55]=1;
                  ends[55]=1;
                  tdone[55]=1;
                }
              }
              else {
                S13487=1;
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
            }
            else {
              switch(S13449){
                case 0 : 
                  switch(S13448){
                    case 0 : 
                      vacOn.setPresent();//sysj\ABScontroller.sysj line: 335, column: 9
                      currsigs.addElement(vacOn);
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                    case 1 : 
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S13449=1;
                  S13449=0;
                  if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 334, column: 16
                    S13448=0;
                    vacOn.setPresent();//sysj\ABScontroller.sysj line: 335, column: 9
                    currsigs.addElement(vacOn);
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  else {
                    S13448=1;
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 6 : 
            if(armAtDest.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 345, column: 12
              System.out.println("armAD");//sysj\ABScontroller.sysj line: 355, column: 6
              S13346=7;
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            else {
              switch(S13488){
                case 0 : 
                  switch(S13487){
                    case 0 : 
                      thread43592(tdone,ends);
                      thread43593(tdone,ends);
                      int biggest43594 = 0;
                      if(ends[56]>=biggest43594){
                        biggest43594=ends[56];
                      }
                      if(ends[57]>=biggest43594){
                        biggest43594=ends[57];
                      }
                      if(biggest43594 == 1){
                        active[55]=1;
                        ends[55]=1;
                        tdone[55]=1;
                      }
                      //FINXME code
                      if(biggest43594 == 0){
                        S13488=1;
                        active[55]=1;
                        ends[55]=1;
                        tdone[55]=1;
                      }
                      break;
                    
                    case 1 : 
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S13488=1;
                  S13488=0;
                  if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 347, column: 16
                    S13487=0;
                    thread43595(tdone,ends);
                    thread43596(tdone,ends);
                    int biggest43597 = 0;
                    if(ends[56]>=biggest43597){
                      biggest43597=ends[56];
                    }
                    if(ends[57]>=biggest43597){
                      biggest43597=ends[57];
                    }
                    if(biggest43597 == 1){
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                    }
                  }
                  else {
                    S13487=1;
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 7 : 
            if(!WPgripped.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 358, column: 12
              System.out.println("!WPgripped");//sysj\ABScontroller.sysj line: 361, column: 6
              S13346=8;
              S13557=0;
              if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 366, column: 16
                S13556=0;
                armSource.setPresent();//sysj\ABScontroller.sysj line: 367, column: 9
                currsigs.addElement(armSource);
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
              else {
                S13556=1;
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
            }
            else {
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            break;
          
          case 8 : 
            if(armAtSource.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 364, column: 12
              System.out.println("armAS");//sysj\ABScontroller.sysj line: 374, column: 6
              S13346=9;
              S13589=0;
              if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 377, column: 16
                S13588=0;
                armSource.setPresent();//sysj\ABScontroller.sysj line: 378, column: 9
                currsigs.addElement(armSource);
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
              else {
                S13588=1;
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
            }
            else {
              switch(S13557){
                case 0 : 
                  switch(S13556){
                    case 0 : 
                      armSource.setPresent();//sysj\ABScontroller.sysj line: 367, column: 9
                      currsigs.addElement(armSource);
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                    case 1 : 
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S13557=1;
                  S13557=0;
                  if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 366, column: 16
                    S13556=0;
                    armSource.setPresent();//sysj\ABScontroller.sysj line: 367, column: 9
                    currsigs.addElement(armSource);
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  else {
                    S13556=1;
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 9 : 
            if(armAtSource.getprestatus()){//sysj\ABScontroller.sysj line: 375, column: 12
              S13346=10;
              bottleCapLoaded.setPresent();//sysj\ABScontroller.sysj line: 388, column: 7
              currsigs.addElement(bottleCapLoaded);
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            else {
              switch(S13589){
                case 0 : 
                  switch(S13588){
                    case 0 : 
                      armSource.setPresent();//sysj\ABScontroller.sysj line: 378, column: 9
                      currsigs.addElement(armSource);
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                    case 1 : 
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S13589=1;
                  S13589=0;
                  if(auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 377, column: 16
                    S13588=0;
                    armSource.setPresent();//sysj\ABScontroller.sysj line: 378, column: 9
                    currsigs.addElement(armSource);
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  else {
                    S13588=1;
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 10 : 
            if(rotaryTableTriggerLoader.getprestatus()){//sysj\ABScontroller.sysj line: 387, column: 12
              S13346=0;
              idle.setPresent();//sysj\ABScontroller.sysj line: 284, column: 7
              currsigs.addElement(idle);
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            else {
              bottleCapLoaded.setPresent();//sysj\ABScontroller.sysj line: 388, column: 7
              currsigs.addElement(bottleCapLoaded);
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43587(int [] tdone, int [] ends){
        switch(S13341){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S13333){
          case 0 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 271, column: 9
              S13333=0;
              auto_53.setPresent();//sysj\ABScontroller.sysj line: 272, column: 7
              currsigs.addElement(auto_53);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              S13333=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 1 : 
            S13333=1;
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 271, column: 9
              S13333=0;
              auto_53.setPresent();//sysj\ABScontroller.sysj line: 272, column: 7
              currsigs.addElement(auto_53);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              S13333=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43584(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 403, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 403, column: 58
      currsigs.addElement(armDest);
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
    else {
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
  }

  public void thread43583(int [] tdone, int [] ends){
        if(vacOnM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 401, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 401, column: 45
      currsigs.addElement(vacOn);
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
    else {
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
  }

  public void thread43582(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 399, column: 50
      currsigs.addElement(pusherExtend);
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
    else {
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
  }

  public void thread43581(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 397, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 397, column: 58
      currsigs.addElement(armSource);
      active[59]=0;
      ends[59]=0;
      tdone[59]=1;
    }
    else {
      active[59]=0;
      ends[59]=0;
      tdone[59]=1;
    }
  }

  public void thread43580(int [] tdone, int [] ends){
        S14236=1;
    S14206=0;
    if(!auto_53.getprestatus()){//sysj\ABScontroller.sysj line: 396, column: 14
      thread43581(tdone,ends);
      thread43582(tdone,ends);
      thread43583(tdone,ends);
      thread43584(tdone,ends);
      int biggest43585 = 0;
      if(ends[59]>=biggest43585){
        biggest43585=ends[59];
      }
      if(ends[60]>=biggest43585){
        biggest43585=ends[60];
      }
      if(ends[61]>=biggest43585){
        biggest43585=ends[61];
      }
      if(ends[62]>=biggest43585){
        biggest43585=ends[62];
      }
      //FINXME code
      if(biggest43585 == 0){
        S14206=1;
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
      }
    }
    else {
      S14206=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread43579(int [] tdone, int [] ends){
        S14192=1;
    S13346=0;
    idle.setPresent();//sysj\ABScontroller.sysj line: 284, column: 7
    currsigs.addElement(idle);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread43578(int [] tdone, int [] ends){
        S13341=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 271, column: 9
      S13333=0;
      auto_53.setPresent();//sysj\ABScontroller.sysj line: 272, column: 7
      currsigs.addElement(auto_53);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S13333=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S20596){
        case 0 : 
          S20596=0;
          break RUN;
        
        case 1 : 
          S20596=2;
          S20596=2;
          System.out.println("CapLoaderController");//sysj\ABScontroller.sysj line: 265, column: 2
          if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 267, column: 11
            S14238=0;
            auto_53.setClear();//sysj\ABScontroller.sysj line: 268, column: 4
            S14237=0;
            thread43578(tdone,ends);
            thread43579(tdone,ends);
            thread43580(tdone,ends);
            int biggest43586 = 0;
            if(ends[54]>=biggest43586){
              biggest43586=ends[54];
            }
            if(ends[55]>=biggest43586){
              biggest43586=ends[55];
            }
            if(ends[58]>=biggest43586){
              biggest43586=ends[58];
            }
            if(biggest43586 == 1){
              active[53]=1;
              ends[53]=1;
              break RUN;
            }
          }
          else {
            S14238=1;
            active[53]=1;
            ends[53]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S14238){
            case 0 : 
              auto_53.setClear();//sysj\ABScontroller.sysj line: 268, column: 4
              switch(S14237){
                case 0 : 
                  thread43587(tdone,ends);
                  thread43588(tdone,ends);
                  thread43598(tdone,ends);
                  int biggest43609 = 0;
                  if(ends[54]>=biggest43609){
                    biggest43609=ends[54];
                  }
                  if(ends[55]>=biggest43609){
                    biggest43609=ends[55];
                  }
                  if(ends[58]>=biggest43609){
                    biggest43609=ends[58];
                  }
                  if(biggest43609 == 1){
                    active[53]=1;
                    ends[53]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest43609 == 0){
                    S14237=1;
                    active[53]=1;
                    ends[53]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S14237=1;
                  if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 267, column: 11
                    S14238=0;
                    auto_53.setClear();//sysj\ABScontroller.sysj line: 268, column: 4
                    S14237=0;
                    thread43610(tdone,ends);
                    thread43611(tdone,ends);
                    thread43612(tdone,ends);
                    int biggest43618 = 0;
                    if(ends[54]>=biggest43618){
                      biggest43618=ends[54];
                    }
                    if(ends[55]>=biggest43618){
                      biggest43618=ends[55];
                    }
                    if(ends[58]>=biggest43618){
                      biggest43618=ends[58];
                    }
                    if(biggest43618 == 1){
                      active[53]=1;
                      ends[53]=1;
                      break RUN;
                    }
                  }
                  else {
                    S14238=1;
                    active[53]=1;
                    ends[53]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S14238=1;
              if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 267, column: 11
                S14238=0;
                auto_53.setClear();//sysj\ABScontroller.sysj line: 268, column: 4
                S14237=0;
                thread43619(tdone,ends);
                thread43620(tdone,ends);
                thread43621(tdone,ends);
                int biggest43627 = 0;
                if(ends[54]>=biggest43627){
                  biggest43627=ends[54];
                }
                if(ends[55]>=biggest43627){
                  biggest43627=ends[55];
                }
                if(ends[58]>=biggest43627){
                  biggest43627=ends[58];
                }
                if(biggest43627 == 1){
                  active[53]=1;
                  ends[53]=1;
                  break RUN;
                }
              }
              else {
                S14238=1;
                active[53]=1;
                ends[53]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    auto_53 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[53] != 0){
      int index = 53;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[53]!=0 || suspended[53]!=0 || active[53]!=1);
      else{
        if(!df){
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          emergency.gethook();
          rotaryTableTriggerLoader.gethook();
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
      emergency.setpreclear();
      rotaryTableTriggerLoader.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      bottleCapLoaded.setpreclear();
      idle.setpreclear();
      auto_53.setpreclear();
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
      dummyint = emergency.getStatus() ? emergency.setprepresent() : emergency.setpreclear();
      emergency.setpreval(emergency.getValue());
      emergency.setClear();
      dummyint = rotaryTableTriggerLoader.getStatus() ? rotaryTableTriggerLoader.setprepresent() : rotaryTableTriggerLoader.setpreclear();
      rotaryTableTriggerLoader.setpreval(rotaryTableTriggerLoader.getValue());
      rotaryTableTriggerLoader.setClear();
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
      bottleCapLoaded.sethook();
      bottleCapLoaded.setClear();
      idle.sethook();
      idle.setClear();
      auto_53.setClear();
      if(paused[53]!=0 || suspended[53]!=0 || active[53]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        emergency.gethook();
        rotaryTableTriggerLoader.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[53] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
