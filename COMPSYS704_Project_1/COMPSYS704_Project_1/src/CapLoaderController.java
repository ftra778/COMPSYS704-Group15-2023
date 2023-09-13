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
  private Signal auto_25;
  private int S8000 = 1;
  private int S1873 = 1;
  private int S1872 = 1;
  private int S1009 = 1;
  private int S1001 = 1;
  private int S1827 = 1;
  private int S1011 = 1;
  private int S1016 = 1;
  private int S1015 = 1;
  private int S1048 = 1;
  private int S1047 = 1;
  private int S1082 = 1;
  private int S1081 = 1;
  private int S1114 = 1;
  private int S1113 = 1;
  private int S1153 = 1;
  private int S1152 = 1;
  private int S1146 = 1;
  private int S1151 = 1;
  private int S1222 = 1;
  private int S1221 = 1;
  private int S1254 = 1;
  private int S1253 = 1;
  private int S1871 = 1;
  private int S1841 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void thread31437(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\ABScontroller.sysj line: 265, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 265, column: 44
      currsigs.addElement(armDest);
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
    else {
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31436(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\ABScontroller.sysj line: 263, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 263, column: 31
      currsigs.addElement(vacOn);
      active[33]=0;
      ends[33]=0;
      tdone[33]=1;
    }
    else {
      active[33]=0;
      ends[33]=0;
      tdone[33]=1;
    }
  }

  public void thread31435(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\ABScontroller.sysj line: 261, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 261, column: 36
      currsigs.addElement(pusherExtend);
      active[32]=0;
      ends[32]=0;
      tdone[32]=1;
    }
    else {
      active[32]=0;
      ends[32]=0;
      tdone[32]=1;
    }
  }

  public void thread31434(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\ABScontroller.sysj line: 259, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 259, column: 44
      currsigs.addElement(armSource);
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
    else {
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31433(int [] tdone, int [] ends){
        S1871=1;
    S1841=0;
    if(!auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 258, column: 14
      thread31434(tdone,ends);
      thread31435(tdone,ends);
      thread31436(tdone,ends);
      thread31437(tdone,ends);
      int biggest31438 = 0;
      if(ends[31]>=biggest31438){
        biggest31438=ends[31];
      }
      if(ends[32]>=biggest31438){
        biggest31438=ends[32];
      }
      if(ends[33]>=biggest31438){
        biggest31438=ends[33];
      }
      if(ends[34]>=biggest31438){
        biggest31438=ends[34];
      }
      //FINXME code
      if(biggest31438 == 0){
        S1841=1;
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
    else {
      S1841=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread31432(int [] tdone, int [] ends){
        S1827=1;
    S1011=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread31431(int [] tdone, int [] ends){
        S1009=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 139, column: 9
      S1001=0;
      auto_25.setPresent();//sysj\ABScontroller.sysj line: 140, column: 7
      currsigs.addElement(auto_25);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S1001=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31428(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\ABScontroller.sysj line: 265, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 265, column: 44
      currsigs.addElement(armDest);
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
    else {
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31427(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\ABScontroller.sysj line: 263, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 263, column: 31
      currsigs.addElement(vacOn);
      active[33]=0;
      ends[33]=0;
      tdone[33]=1;
    }
    else {
      active[33]=0;
      ends[33]=0;
      tdone[33]=1;
    }
  }

  public void thread31426(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\ABScontroller.sysj line: 261, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 261, column: 36
      currsigs.addElement(pusherExtend);
      active[32]=0;
      ends[32]=0;
      tdone[32]=1;
    }
    else {
      active[32]=0;
      ends[32]=0;
      tdone[32]=1;
    }
  }

  public void thread31425(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\ABScontroller.sysj line: 259, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 259, column: 44
      currsigs.addElement(armSource);
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
    else {
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31424(int [] tdone, int [] ends){
        S1871=1;
    S1841=0;
    if(!auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 258, column: 14
      thread31425(tdone,ends);
      thread31426(tdone,ends);
      thread31427(tdone,ends);
      thread31428(tdone,ends);
      int biggest31429 = 0;
      if(ends[31]>=biggest31429){
        biggest31429=ends[31];
      }
      if(ends[32]>=biggest31429){
        biggest31429=ends[32];
      }
      if(ends[33]>=biggest31429){
        biggest31429=ends[33];
      }
      if(ends[34]>=biggest31429){
        biggest31429=ends[34];
      }
      //FINXME code
      if(biggest31429 == 0){
        S1841=1;
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
    else {
      S1841=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread31423(int [] tdone, int [] ends){
        S1827=1;
    S1011=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread31422(int [] tdone, int [] ends){
        S1009=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 139, column: 9
      S1001=0;
      auto_25.setPresent();//sysj\ABScontroller.sysj line: 140, column: 7
      currsigs.addElement(auto_25);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S1001=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31419(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\ABScontroller.sysj line: 265, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 265, column: 44
      currsigs.addElement(armDest);
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
    else {
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31418(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\ABScontroller.sysj line: 263, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 263, column: 31
      currsigs.addElement(vacOn);
      active[33]=0;
      ends[33]=0;
      tdone[33]=1;
    }
    else {
      active[33]=0;
      ends[33]=0;
      tdone[33]=1;
    }
  }

  public void thread31417(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\ABScontroller.sysj line: 261, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 261, column: 36
      currsigs.addElement(pusherExtend);
      active[32]=0;
      ends[32]=0;
      tdone[32]=1;
    }
    else {
      active[32]=0;
      ends[32]=0;
      tdone[32]=1;
    }
  }

  public void thread31416(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\ABScontroller.sysj line: 259, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 259, column: 44
      currsigs.addElement(armSource);
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
    else {
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31414(int [] tdone, int [] ends){
        active[34]=0;
    ends[34]=0;
    tdone[34]=1;
  }

  public void thread31413(int [] tdone, int [] ends){
        active[33]=0;
    ends[33]=0;
    tdone[33]=1;
  }

  public void thread31412(int [] tdone, int [] ends){
        active[32]=0;
    ends[32]=0;
    tdone[32]=1;
  }

  public void thread31411(int [] tdone, int [] ends){
        active[31]=0;
    ends[31]=0;
    tdone[31]=1;
  }

  public void thread31410(int [] tdone, int [] ends){
        switch(S1871){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S1841){
          case 0 : 
            thread31411(tdone,ends);
            thread31412(tdone,ends);
            thread31413(tdone,ends);
            thread31414(tdone,ends);
            int biggest31415 = 0;
            if(ends[31]>=biggest31415){
              biggest31415=ends[31];
            }
            if(ends[32]>=biggest31415){
              biggest31415=ends[32];
            }
            if(ends[33]>=biggest31415){
              biggest31415=ends[33];
            }
            if(ends[34]>=biggest31415){
              biggest31415=ends[34];
            }
            //FINXME code
            if(biggest31415 == 0){
              S1841=1;
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
          case 1 : 
            S1841=1;
            S1841=0;
            if(!auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 258, column: 14
              thread31416(tdone,ends);
              thread31417(tdone,ends);
              thread31418(tdone,ends);
              thread31419(tdone,ends);
              int biggest31420 = 0;
              if(ends[31]>=biggest31420){
                biggest31420=ends[31];
              }
              if(ends[32]>=biggest31420){
                biggest31420=ends[32];
              }
              if(ends[33]>=biggest31420){
                biggest31420=ends[33];
              }
              if(ends[34]>=biggest31420){
                biggest31420=ends[34];
              }
              //FINXME code
              if(biggest31420 == 0){
                S1841=1;
                active[30]=1;
                ends[30]=1;
                tdone[30]=1;
              }
            }
            else {
              S1841=1;
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31408(int [] tdone, int [] ends){
        S1151=1;
    vacOn.setPresent();//sysj\ABScontroller.sysj line: 214, column: 35
    currsigs.addElement(vacOn);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread31407(int [] tdone, int [] ends){
        S1146=1;
    armDest.setPresent();//sysj\ABScontroller.sysj line: 214, column: 11
    currsigs.addElement(armDest);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread31405(int [] tdone, int [] ends){
        switch(S1151){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\ABScontroller.sysj line: 214, column: 35
        currsigs.addElement(vacOn);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
        break;
      
    }
  }

  public void thread31404(int [] tdone, int [] ends){
        switch(S1146){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\ABScontroller.sysj line: 214, column: 11
        currsigs.addElement(armDest);
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread31402(int [] tdone, int [] ends){
        S1151=1;
    vacOn.setPresent();//sysj\ABScontroller.sysj line: 214, column: 35
    currsigs.addElement(vacOn);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread31401(int [] tdone, int [] ends){
        S1146=1;
    armDest.setPresent();//sysj\ABScontroller.sysj line: 214, column: 11
    currsigs.addElement(armDest);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread31400(int [] tdone, int [] ends){
        switch(S1827){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S1011){
          case 0 : 
            if(request.getprestatus()){//sysj\ABScontroller.sysj line: 151, column: 12
              System.out.println("req");//sysj\ABScontroller.sysj line: 152, column: 6
              S1011=1;
              S1016=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 155, column: 16
                S1015=0;
                armDest.setPresent();//sysj\ABScontroller.sysj line: 156, column: 9
                currsigs.addElement(armDest);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1015=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\ABScontroller.sysj line: 153, column: 12
              System.out.println("armAtDest");//sysj\ABScontroller.sysj line: 164, column: 6
              S1011=2;
              S1048=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 168, column: 16
                S1047=0;
                pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 169, column: 9
                currsigs.addElement(pusherExtend);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1047=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              switch(S1016){
                case 0 : 
                  switch(S1015){
                    case 0 : 
                      armDest.setPresent();//sysj\ABScontroller.sysj line: 156, column: 9
                      currsigs.addElement(armDest);
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                    case 1 : 
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S1016=1;
                  S1016=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 155, column: 16
                    S1015=0;
                    armDest.setPresent();//sysj\ABScontroller.sysj line: 156, column: 9
                    currsigs.addElement(armDest);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1015=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(pusherExtended.getprestatus()){//sysj\ABScontroller.sysj line: 166, column: 12
              System.out.println("pusherEx");//sysj\ABScontroller.sysj line: 176, column: 6
              S1011=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            else {
              switch(S1048){
                case 0 : 
                  switch(S1047){
                    case 0 : 
                      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 169, column: 9
                      currsigs.addElement(pusherExtend);
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                    case 1 : 
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S1048=1;
                  S1048=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 168, column: 16
                    S1047=0;
                    pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 169, column: 9
                    currsigs.addElement(pusherExtend);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1047=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 3 : 
            if(pusherRetracted.getprestatus()){//sysj\ABScontroller.sysj line: 179, column: 12
              System.out.println("pusherRe");//sysj\ABScontroller.sysj line: 182, column: 6
              S1011=4;
              S1082=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 187, column: 16
                S1081=0;
                armSource.setPresent();//sysj\ABScontroller.sysj line: 188, column: 9
                currsigs.addElement(armSource);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1081=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 4 : 
            if(armAtSource.getprestatus()){//sysj\ABScontroller.sysj line: 185, column: 12
              System.out.println("armAS");//sysj\ABScontroller.sysj line: 195, column: 6
              S1011=5;
              S1114=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 200, column: 16
                S1113=0;
                vacOn.setPresent();//sysj\ABScontroller.sysj line: 201, column: 9
                currsigs.addElement(vacOn);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1113=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              switch(S1082){
                case 0 : 
                  switch(S1081){
                    case 0 : 
                      armSource.setPresent();//sysj\ABScontroller.sysj line: 188, column: 9
                      currsigs.addElement(armSource);
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                    case 1 : 
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S1082=1;
                  S1082=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 187, column: 16
                    S1081=0;
                    armSource.setPresent();//sysj\ABScontroller.sysj line: 188, column: 9
                    currsigs.addElement(armSource);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1081=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 5 : 
            if(WPgripped.getprestatus()){//sysj\ABScontroller.sysj line: 198, column: 12
              System.out.println("WPgripped");//sysj\ABScontroller.sysj line: 208, column: 6
              S1011=6;
              S1153=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 213, column: 16
                S1152=0;
                thread31401(tdone,ends);
                thread31402(tdone,ends);
                int biggest31403 = 0;
                if(ends[28]>=biggest31403){
                  biggest31403=ends[28];
                }
                if(ends[29]>=biggest31403){
                  biggest31403=ends[29];
                }
                if(biggest31403 == 1){
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
              }
              else {
                S1152=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              switch(S1114){
                case 0 : 
                  switch(S1113){
                    case 0 : 
                      vacOn.setPresent();//sysj\ABScontroller.sysj line: 201, column: 9
                      currsigs.addElement(vacOn);
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                    case 1 : 
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S1114=1;
                  S1114=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 200, column: 16
                    S1113=0;
                    vacOn.setPresent();//sysj\ABScontroller.sysj line: 201, column: 9
                    currsigs.addElement(vacOn);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1113=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 6 : 
            if(armAtDest.getprestatus()){//sysj\ABScontroller.sysj line: 211, column: 12
              System.out.println("armAD");//sysj\ABScontroller.sysj line: 221, column: 6
              S1011=7;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            else {
              switch(S1153){
                case 0 : 
                  switch(S1152){
                    case 0 : 
                      thread31404(tdone,ends);
                      thread31405(tdone,ends);
                      int biggest31406 = 0;
                      if(ends[28]>=biggest31406){
                        biggest31406=ends[28];
                      }
                      if(ends[29]>=biggest31406){
                        biggest31406=ends[29];
                      }
                      if(biggest31406 == 1){
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      //FINXME code
                      if(biggest31406 == 0){
                        S1153=1;
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      break;
                    
                    case 1 : 
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S1153=1;
                  S1153=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 213, column: 16
                    S1152=0;
                    thread31407(tdone,ends);
                    thread31408(tdone,ends);
                    int biggest31409 = 0;
                    if(ends[28]>=biggest31409){
                      biggest31409=ends[28];
                    }
                    if(ends[29]>=biggest31409){
                      biggest31409=ends[29];
                    }
                    if(biggest31409 == 1){
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                  }
                  else {
                    S1152=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 7 : 
            if(!WPgripped.getprestatus()){//sysj\ABScontroller.sysj line: 224, column: 12
              System.out.println("!WPgripped");//sysj\ABScontroller.sysj line: 227, column: 6
              S1011=8;
              S1222=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 232, column: 16
                S1221=0;
                armSource.setPresent();//sysj\ABScontroller.sysj line: 233, column: 9
                currsigs.addElement(armSource);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1221=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 8 : 
            if(armAtSource.getprestatus()){//sysj\ABScontroller.sysj line: 230, column: 12
              System.out.println("armAS");//sysj\ABScontroller.sysj line: 240, column: 6
              bottleCapLoaded.setPresent();//sysj\ABScontroller.sysj line: 241, column: 6
              currsigs.addElement(bottleCapLoaded);
              S1011=9;
              S1254=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 244, column: 16
                S1253=0;
                armSource.setPresent();//sysj\ABScontroller.sysj line: 245, column: 9
                currsigs.addElement(armSource);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1253=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              switch(S1222){
                case 0 : 
                  switch(S1221){
                    case 0 : 
                      armSource.setPresent();//sysj\ABScontroller.sysj line: 233, column: 9
                      currsigs.addElement(armSource);
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                    case 1 : 
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S1222=1;
                  S1222=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 232, column: 16
                    S1221=0;
                    armSource.setPresent();//sysj\ABScontroller.sysj line: 233, column: 9
                    currsigs.addElement(armSource);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1221=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 9 : 
            if(armAtSource.getprestatus()){//sysj\ABScontroller.sysj line: 242, column: 12
              S1011=0;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            else {
              switch(S1254){
                case 0 : 
                  switch(S1253){
                    case 0 : 
                      armSource.setPresent();//sysj\ABScontroller.sysj line: 245, column: 9
                      currsigs.addElement(armSource);
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                    case 1 : 
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S1254=1;
                  S1254=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 244, column: 16
                    S1253=0;
                    armSource.setPresent();//sysj\ABScontroller.sysj line: 245, column: 9
                    currsigs.addElement(armSource);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1253=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31399(int [] tdone, int [] ends){
        switch(S1009){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S1001){
          case 0 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 139, column: 9
              S1001=0;
              auto_25.setPresent();//sysj\ABScontroller.sysj line: 140, column: 7
              currsigs.addElement(auto_25);
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            else {
              S1001=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 1 : 
            S1001=1;
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 139, column: 9
              S1001=0;
              auto_25.setPresent();//sysj\ABScontroller.sysj line: 140, column: 7
              currsigs.addElement(auto_25);
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            else {
              S1001=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31396(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\ABScontroller.sysj line: 265, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 265, column: 44
      currsigs.addElement(armDest);
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
    else {
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread31395(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\ABScontroller.sysj line: 263, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 263, column: 31
      currsigs.addElement(vacOn);
      active[33]=0;
      ends[33]=0;
      tdone[33]=1;
    }
    else {
      active[33]=0;
      ends[33]=0;
      tdone[33]=1;
    }
  }

  public void thread31394(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\ABScontroller.sysj line: 261, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 261, column: 36
      currsigs.addElement(pusherExtend);
      active[32]=0;
      ends[32]=0;
      tdone[32]=1;
    }
    else {
      active[32]=0;
      ends[32]=0;
      tdone[32]=1;
    }
  }

  public void thread31393(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\ABScontroller.sysj line: 259, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 259, column: 44
      currsigs.addElement(armSource);
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
    else {
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread31392(int [] tdone, int [] ends){
        S1871=1;
    S1841=0;
    if(!auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 258, column: 14
      thread31393(tdone,ends);
      thread31394(tdone,ends);
      thread31395(tdone,ends);
      thread31396(tdone,ends);
      int biggest31397 = 0;
      if(ends[31]>=biggest31397){
        biggest31397=ends[31];
      }
      if(ends[32]>=biggest31397){
        biggest31397=ends[32];
      }
      if(ends[33]>=biggest31397){
        biggest31397=ends[33];
      }
      if(ends[34]>=biggest31397){
        biggest31397=ends[34];
      }
      //FINXME code
      if(biggest31397 == 0){
        S1841=1;
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
    else {
      S1841=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread31391(int [] tdone, int [] ends){
        S1827=1;
    S1011=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread31390(int [] tdone, int [] ends){
        S1009=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 139, column: 9
      S1001=0;
      auto_25.setPresent();//sysj\ABScontroller.sysj line: 140, column: 7
      currsigs.addElement(auto_25);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S1001=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S8000){
        case 0 : 
          S8000=0;
          break RUN;
        
        case 1 : 
          S8000=2;
          S8000=2;
          System.out.println("CapLoaderController");//sysj\ABScontroller.sysj line: 133, column: 2
          if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 135, column: 11
            S1873=0;
            auto_25.setClear();//sysj\ABScontroller.sysj line: 136, column: 4
            S1872=0;
            thread31390(tdone,ends);
            thread31391(tdone,ends);
            thread31392(tdone,ends);
            int biggest31398 = 0;
            if(ends[26]>=biggest31398){
              biggest31398=ends[26];
            }
            if(ends[27]>=biggest31398){
              biggest31398=ends[27];
            }
            if(ends[30]>=biggest31398){
              biggest31398=ends[30];
            }
            if(biggest31398 == 1){
              active[25]=1;
              ends[25]=1;
              break RUN;
            }
          }
          else {
            S1873=1;
            active[25]=1;
            ends[25]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S1873){
            case 0 : 
              auto_25.setClear();//sysj\ABScontroller.sysj line: 136, column: 4
              switch(S1872){
                case 0 : 
                  thread31399(tdone,ends);
                  thread31400(tdone,ends);
                  thread31410(tdone,ends);
                  int biggest31421 = 0;
                  if(ends[26]>=biggest31421){
                    biggest31421=ends[26];
                  }
                  if(ends[27]>=biggest31421){
                    biggest31421=ends[27];
                  }
                  if(ends[30]>=biggest31421){
                    biggest31421=ends[30];
                  }
                  if(biggest31421 == 1){
                    active[25]=1;
                    ends[25]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest31421 == 0){
                    S1872=1;
                    active[25]=1;
                    ends[25]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S1872=1;
                  if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 135, column: 11
                    S1873=0;
                    auto_25.setClear();//sysj\ABScontroller.sysj line: 136, column: 4
                    S1872=0;
                    thread31422(tdone,ends);
                    thread31423(tdone,ends);
                    thread31424(tdone,ends);
                    int biggest31430 = 0;
                    if(ends[26]>=biggest31430){
                      biggest31430=ends[26];
                    }
                    if(ends[27]>=biggest31430){
                      biggest31430=ends[27];
                    }
                    if(ends[30]>=biggest31430){
                      biggest31430=ends[30];
                    }
                    if(biggest31430 == 1){
                      active[25]=1;
                      ends[25]=1;
                      break RUN;
                    }
                  }
                  else {
                    S1873=1;
                    active[25]=1;
                    ends[25]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S1873=1;
              if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 135, column: 11
                S1873=0;
                auto_25.setClear();//sysj\ABScontroller.sysj line: 136, column: 4
                S1872=0;
                thread31431(tdone,ends);
                thread31432(tdone,ends);
                thread31433(tdone,ends);
                int biggest31439 = 0;
                if(ends[26]>=biggest31439){
                  biggest31439=ends[26];
                }
                if(ends[27]>=biggest31439){
                  biggest31439=ends[27];
                }
                if(ends[30]>=biggest31439){
                  biggest31439=ends[30];
                }
                if(biggest31439 == 1){
                  active[25]=1;
                  ends[25]=1;
                  break RUN;
                }
              }
              else {
                S1873=1;
                active[25]=1;
                ends[25]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    auto_25 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[25] != 0){
      int index = 25;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[25]!=0 || suspended[25]!=0 || active[25]!=1);
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
      auto_25.setpreclear();
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
      auto_25.setClear();
      if(paused[25]!=0 || suspended[25]!=0 || active[25]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        emergency.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[25] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
