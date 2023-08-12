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
  private Signal auto_1;
  private int S3417 = 1;
  private int S853 = 1;
  private int S852 = 1;
  private int S10 = 1;
  private int S2 = 1;
  private int S804 = 1;
  private int S12 = 1;
  private int S17 = 1;
  private int S53 = 1;
  private int S107 = 1;
  private int S139 = 1;
  private int S178 = 1;
  private int S171 = 1;
  private int S176 = 1;
  private int S247 = 1;
  private int S851 = 1;
  private int S819 = 1;
  private int S817 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread3466(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\controller.sysj line: 120, column: 16
      armDest.setPresent();//sysj\controller.sysj line: 120, column: 44
      currsigs.addElement(armDest);
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
    else {
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
  }

  public void thread3465(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 118, column: 16
      vacOn.setPresent();//sysj\controller.sysj line: 118, column: 31
      currsigs.addElement(vacOn);
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread3464(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 116, column: 16
      pusherExtend.setPresent();//sysj\controller.sysj line: 116, column: 36
      currsigs.addElement(pusherExtend);
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
    else {
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
  }

  public void thread3463(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\controller.sysj line: 114, column: 16
      armSource.setPresent();//sysj\controller.sysj line: 114, column: 44
      currsigs.addElement(armSource);
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
    else {
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread3462(int [] tdone, int [] ends){
        S851=1;
    S819=0;
    if(!auto_1.getprestatus()){//sysj\controller.sysj line: 113, column: 14
      S817=0;
      thread3463(tdone,ends);
      thread3464(tdone,ends);
      thread3465(tdone,ends);
      thread3466(tdone,ends);
      int biggest3467 = 0;
      if(ends[7]>=biggest3467){
        biggest3467=ends[7];
      }
      if(ends[8]>=biggest3467){
        biggest3467=ends[8];
      }
      if(ends[9]>=biggest3467){
        biggest3467=ends[9];
      }
      if(ends[10]>=biggest3467){
        biggest3467=ends[10];
      }
      //FINXME code
      if(biggest3467 == 0){
        S817=1;
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S819=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread3461(int [] tdone, int [] ends){
        S804=1;
    S12=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3460(int [] tdone, int [] ends){
        S10=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 14, column: 9
      S2=0;
      auto_1.setPresent();//sysj\controller.sysj line: 15, column: 7
      currsigs.addElement(auto_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread3457(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\controller.sysj line: 120, column: 16
      armDest.setPresent();//sysj\controller.sysj line: 120, column: 44
      currsigs.addElement(armDest);
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
    else {
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
  }

  public void thread3456(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 118, column: 16
      vacOn.setPresent();//sysj\controller.sysj line: 118, column: 31
      currsigs.addElement(vacOn);
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread3455(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 116, column: 16
      pusherExtend.setPresent();//sysj\controller.sysj line: 116, column: 36
      currsigs.addElement(pusherExtend);
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
    else {
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
  }

  public void thread3454(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\controller.sysj line: 114, column: 16
      armSource.setPresent();//sysj\controller.sysj line: 114, column: 44
      currsigs.addElement(armSource);
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
    else {
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread3453(int [] tdone, int [] ends){
        S851=1;
    S819=0;
    if(!auto_1.getprestatus()){//sysj\controller.sysj line: 113, column: 14
      S817=0;
      thread3454(tdone,ends);
      thread3455(tdone,ends);
      thread3456(tdone,ends);
      thread3457(tdone,ends);
      int biggest3458 = 0;
      if(ends[7]>=biggest3458){
        biggest3458=ends[7];
      }
      if(ends[8]>=biggest3458){
        biggest3458=ends[8];
      }
      if(ends[9]>=biggest3458){
        biggest3458=ends[9];
      }
      if(ends[10]>=biggest3458){
        biggest3458=ends[10];
      }
      //FINXME code
      if(biggest3458 == 0){
        S817=1;
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S819=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread3452(int [] tdone, int [] ends){
        S804=1;
    S12=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3451(int [] tdone, int [] ends){
        S10=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 14, column: 9
      S2=0;
      auto_1.setPresent();//sysj\controller.sysj line: 15, column: 7
      currsigs.addElement(auto_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread3448(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\controller.sysj line: 120, column: 16
      armDest.setPresent();//sysj\controller.sysj line: 120, column: 44
      currsigs.addElement(armDest);
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
    else {
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
  }

  public void thread3447(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 118, column: 16
      vacOn.setPresent();//sysj\controller.sysj line: 118, column: 31
      currsigs.addElement(vacOn);
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread3446(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 116, column: 16
      pusherExtend.setPresent();//sysj\controller.sysj line: 116, column: 36
      currsigs.addElement(pusherExtend);
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
    else {
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
  }

  public void thread3445(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\controller.sysj line: 114, column: 16
      armSource.setPresent();//sysj\controller.sysj line: 114, column: 44
      currsigs.addElement(armSource);
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
    else {
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread3443(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread3442(int [] tdone, int [] ends){
        active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread3441(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread3440(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread3439(int [] tdone, int [] ends){
        switch(S851){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S819){
          case 0 : 
            switch(S817){
              case 0 : 
                thread3440(tdone,ends);
                thread3441(tdone,ends);
                thread3442(tdone,ends);
                thread3443(tdone,ends);
                int biggest3444 = 0;
                if(ends[7]>=biggest3444){
                  biggest3444=ends[7];
                }
                if(ends[8]>=biggest3444){
                  biggest3444=ends[8];
                }
                if(ends[9]>=biggest3444){
                  biggest3444=ends[9];
                }
                if(ends[10]>=biggest3444){
                  biggest3444=ends[10];
                }
                //FINXME code
                if(biggest3444 == 0){
                  S817=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 1 : 
                S817=1;
                S819=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
                break;
              
            }
            break;
          
          case 1 : 
            S819=1;
            S819=0;
            if(!auto_1.getprestatus()){//sysj\controller.sysj line: 113, column: 14
              S817=0;
              thread3445(tdone,ends);
              thread3446(tdone,ends);
              thread3447(tdone,ends);
              thread3448(tdone,ends);
              int biggest3449 = 0;
              if(ends[7]>=biggest3449){
                biggest3449=ends[7];
              }
              if(ends[8]>=biggest3449){
                biggest3449=ends[8];
              }
              if(ends[9]>=biggest3449){
                biggest3449=ends[9];
              }
              if(ends[10]>=biggest3449){
                biggest3449=ends[10];
              }
              //FINXME code
              if(biggest3449 == 0){
                S817=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              S819=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3437(int [] tdone, int [] ends){
        S176=1;
    vacOn.setPresent();//sysj\controller.sysj line: 84, column: 34
    currsigs.addElement(vacOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3436(int [] tdone, int [] ends){
        S171=1;
    armDest.setPresent();//sysj\controller.sysj line: 84, column: 10
    currsigs.addElement(armDest);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3434(int [] tdone, int [] ends){
        switch(S176){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 84, column: 34
        currsigs.addElement(vacOn);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread3433(int [] tdone, int [] ends){
        switch(S171){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 84, column: 10
        currsigs.addElement(armDest);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread3431(int [] tdone, int [] ends){
        S176=1;
    vacOn.setPresent();//sysj\controller.sysj line: 84, column: 34
    currsigs.addElement(vacOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3430(int [] tdone, int [] ends){
        S171=1;
    armDest.setPresent();//sysj\controller.sysj line: 84, column: 10
    currsigs.addElement(armDest);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3429(int [] tdone, int [] ends){
        switch(S804){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S12){
          case 0 : 
            if(request.getprestatus()){//sysj\controller.sysj line: 26, column: 12
              System.out.println("req");//sysj\controller.sysj line: 27, column: 6
              S12=1;
              S17=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 31, column: 15
                armDest.setPresent();//sysj\controller.sysj line: 32, column: 8
                currsigs.addElement(armDest);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S17=1;
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
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\controller.sysj line: 28, column: 12
              System.out.println("armAtDest");//sysj\controller.sysj line: 39, column: 6
              S12=2;
              S53=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 43, column: 15
                System.out.println("auto");//sysj\controller.sysj line: 44, column: 8
                pusherExtend.setPresent();//sysj\controller.sysj line: 45, column: 8
                currsigs.addElement(pusherExtend);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S53=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              switch(S17){
                case 0 : 
                  armDest.setPresent();//sysj\controller.sysj line: 32, column: 8
                  currsigs.addElement(armDest);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                  break;
                
                case 1 : 
                  S17=1;
                  S17=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 31, column: 15
                    armDest.setPresent();//sysj\controller.sysj line: 32, column: 8
                    currsigs.addElement(armDest);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S17=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 41, column: 12
              System.out.println("pusherEx");//sysj\controller.sysj line: 50, column: 6
              S12=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S53){
                case 0 : 
                  pusherExtend.setPresent();//sysj\controller.sysj line: 45, column: 8
                  currsigs.addElement(pusherExtend);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                  break;
                
                case 1 : 
                  S53=1;
                  S53=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 43, column: 15
                    System.out.println("auto");//sysj\controller.sysj line: 44, column: 8
                    pusherExtend.setPresent();//sysj\controller.sysj line: 45, column: 8
                    currsigs.addElement(pusherExtend);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S53=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 3 : 
            if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 53, column: 12
              System.out.println("pusherRe");//sysj\controller.sysj line: 56, column: 6
              S12=4;
              S107=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 61, column: 15
                armSource.setPresent();//sysj\controller.sysj line: 62, column: 8
                currsigs.addElement(armSource);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S107=1;
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
          
          case 4 : 
            if(armAtSource.getprestatus()){//sysj\controller.sysj line: 59, column: 12
              System.out.println("armAS");//sysj\controller.sysj line: 67, column: 6
              S12=5;
              S139=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 72, column: 15
                vacOn.setPresent();//sysj\controller.sysj line: 73, column: 8
                currsigs.addElement(vacOn);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S139=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              switch(S107){
                case 0 : 
                  armSource.setPresent();//sysj\controller.sysj line: 62, column: 8
                  currsigs.addElement(armSource);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                  break;
                
                case 1 : 
                  S107=1;
                  S107=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 61, column: 15
                    armSource.setPresent();//sysj\controller.sysj line: 62, column: 8
                    currsigs.addElement(armSource);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S107=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 5 : 
            if(WPgripped.getprestatus()){//sysj\controller.sysj line: 70, column: 12
              System.out.println("WPgripped");//sysj\controller.sysj line: 78, column: 6
              S12=6;
              S178=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 83, column: 15
                thread3430(tdone,ends);
                thread3431(tdone,ends);
                int biggest3432 = 0;
                if(ends[4]>=biggest3432){
                  biggest3432=ends[4];
                }
                if(ends[5]>=biggest3432){
                  biggest3432=ends[5];
                }
                if(biggest3432 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S178=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              switch(S139){
                case 0 : 
                  vacOn.setPresent();//sysj\controller.sysj line: 73, column: 8
                  currsigs.addElement(vacOn);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                  break;
                
                case 1 : 
                  S139=1;
                  S139=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 72, column: 15
                    vacOn.setPresent();//sysj\controller.sysj line: 73, column: 8
                    currsigs.addElement(vacOn);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S139=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 6 : 
            if(armAtDest.getprestatus()){//sysj\controller.sysj line: 81, column: 12
              System.out.println("armAD");//sysj\controller.sysj line: 89, column: 6
              S12=7;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S178){
                case 0 : 
                  thread3433(tdone,ends);
                  thread3434(tdone,ends);
                  int biggest3435 = 0;
                  if(ends[4]>=biggest3435){
                    biggest3435=ends[4];
                  }
                  if(ends[5]>=biggest3435){
                    biggest3435=ends[5];
                  }
                  if(biggest3435 == 1){
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  //FINXME code
                  if(biggest3435 == 0){
                    S178=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
                case 1 : 
                  S178=1;
                  S178=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 83, column: 15
                    thread3436(tdone,ends);
                    thread3437(tdone,ends);
                    int biggest3438 = 0;
                    if(ends[4]>=biggest3438){
                      biggest3438=ends[4];
                    }
                    if(ends[5]>=biggest3438){
                      biggest3438=ends[5];
                    }
                    if(biggest3438 == 1){
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    S178=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 7 : 
            if(!WPgripped.getprestatus()){//sysj\controller.sysj line: 92, column: 12
              System.out.println("!WPgripped");//sysj\controller.sysj line: 95, column: 6
              S12=8;
              S247=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 100, column: 15
                armSource.setPresent();//sysj\controller.sysj line: 101, column: 8
                currsigs.addElement(armSource);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S247=1;
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
          
          case 8 : 
            if(armAtSource.getprestatus()){//sysj\controller.sysj line: 98, column: 12
              System.out.println("armAS");//sysj\controller.sysj line: 106, column: 6
              S12=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S247){
                case 0 : 
                  armSource.setPresent();//sysj\controller.sysj line: 101, column: 8
                  currsigs.addElement(armSource);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                  break;
                
                case 1 : 
                  S247=1;
                  S247=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 100, column: 15
                    armSource.setPresent();//sysj\controller.sysj line: 101, column: 8
                    currsigs.addElement(armSource);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S247=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3428(int [] tdone, int [] ends){
        switch(S10){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2){
          case 0 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 14, column: 9
              S2=0;
              auto_1.setPresent();//sysj\controller.sysj line: 15, column: 7
              currsigs.addElement(auto_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S2=1;
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 14, column: 9
              S2=0;
              auto_1.setPresent();//sysj\controller.sysj line: 15, column: 7
              currsigs.addElement(auto_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3425(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\controller.sysj line: 120, column: 16
      armDest.setPresent();//sysj\controller.sysj line: 120, column: 44
      currsigs.addElement(armDest);
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
    else {
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
  }

  public void thread3424(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 118, column: 16
      vacOn.setPresent();//sysj\controller.sysj line: 118, column: 31
      currsigs.addElement(vacOn);
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread3423(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 116, column: 16
      pusherExtend.setPresent();//sysj\controller.sysj line: 116, column: 36
      currsigs.addElement(pusherExtend);
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
    else {
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
  }

  public void thread3422(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\controller.sysj line: 114, column: 16
      armSource.setPresent();//sysj\controller.sysj line: 114, column: 44
      currsigs.addElement(armSource);
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
    else {
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread3421(int [] tdone, int [] ends){
        S851=1;
    S819=0;
    if(!auto_1.getprestatus()){//sysj\controller.sysj line: 113, column: 14
      S817=0;
      thread3422(tdone,ends);
      thread3423(tdone,ends);
      thread3424(tdone,ends);
      thread3425(tdone,ends);
      int biggest3426 = 0;
      if(ends[7]>=biggest3426){
        biggest3426=ends[7];
      }
      if(ends[8]>=biggest3426){
        biggest3426=ends[8];
      }
      if(ends[9]>=biggest3426){
        biggest3426=ends[9];
      }
      if(ends[10]>=biggest3426){
        biggest3426=ends[10];
      }
      //FINXME code
      if(biggest3426 == 0){
        S817=1;
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S819=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread3420(int [] tdone, int [] ends){
        S804=1;
    S12=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3419(int [] tdone, int [] ends){
        S10=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 14, column: 9
      S2=0;
      auto_1.setPresent();//sysj\controller.sysj line: 15, column: 7
      currsigs.addElement(auto_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2=1;
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
      switch(S3417){
        case 0 : 
          S3417=0;
          break RUN;
        
        case 1 : 
          S3417=2;
          S3417=2;
          if(mode.getprestatus()){//sysj\controller.sysj line: 10, column: 11
            S853=0;
            auto_1.setClear();//sysj\controller.sysj line: 11, column: 4
            S852=0;
            thread3419(tdone,ends);
            thread3420(tdone,ends);
            thread3421(tdone,ends);
            int biggest3427 = 0;
            if(ends[2]>=biggest3427){
              biggest3427=ends[2];
            }
            if(ends[3]>=biggest3427){
              biggest3427=ends[3];
            }
            if(ends[6]>=biggest3427){
              biggest3427=ends[6];
            }
            if(biggest3427 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
          else {
            S853=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S853){
            case 0 : 
              auto_1.setClear();//sysj\controller.sysj line: 11, column: 4
              switch(S852){
                case 0 : 
                  thread3428(tdone,ends);
                  thread3429(tdone,ends);
                  thread3439(tdone,ends);
                  int biggest3450 = 0;
                  if(ends[2]>=biggest3450){
                    biggest3450=ends[2];
                  }
                  if(ends[3]>=biggest3450){
                    biggest3450=ends[3];
                  }
                  if(ends[6]>=biggest3450){
                    biggest3450=ends[6];
                  }
                  if(biggest3450 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest3450 == 0){
                    S852=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S852=1;
                  if(mode.getprestatus()){//sysj\controller.sysj line: 10, column: 11
                    S853=0;
                    auto_1.setClear();//sysj\controller.sysj line: 11, column: 4
                    S852=0;
                    thread3451(tdone,ends);
                    thread3452(tdone,ends);
                    thread3453(tdone,ends);
                    int biggest3459 = 0;
                    if(ends[2]>=biggest3459){
                      biggest3459=ends[2];
                    }
                    if(ends[3]>=biggest3459){
                      biggest3459=ends[3];
                    }
                    if(ends[6]>=biggest3459){
                      biggest3459=ends[6];
                    }
                    if(biggest3459 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S853=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S853=1;
              if(mode.getprestatus()){//sysj\controller.sysj line: 10, column: 11
                S853=0;
                auto_1.setClear();//sysj\controller.sysj line: 11, column: 4
                S852=0;
                thread3460(tdone,ends);
                thread3461(tdone,ends);
                thread3462(tdone,ends);
                int biggest3468 = 0;
                if(ends[2]>=biggest3468){
                  biggest3468=ends[2];
                }
                if(ends[3]>=biggest3468){
                  biggest3468=ends[3];
                }
                if(ends[6]>=biggest3468){
                  biggest3468=ends[6];
                }
                if(biggest3468 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S853=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    auto_1 = new Signal();
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
      auto_1.setpreclear();
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
      auto_1.setClear();
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
