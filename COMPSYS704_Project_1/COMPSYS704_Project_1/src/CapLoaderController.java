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
  private int S8006 = 1;
  private int S1879 = 1;
  private int S1878 = 1;
  private int S1015 = 1;
  private int S1007 = 1;
  private int S1833 = 1;
  private int S1017 = 1;
  private int S1022 = 1;
  private int S1021 = 1;
  private int S1054 = 1;
  private int S1053 = 1;
  private int S1088 = 1;
  private int S1087 = 1;
  private int S1120 = 1;
  private int S1119 = 1;
  private int S1159 = 1;
  private int S1158 = 1;
  private int S1152 = 1;
  private int S1157 = 1;
  private int S1228 = 1;
  private int S1227 = 1;
  private int S1260 = 1;
  private int S1259 = 1;
  private int S1877 = 1;
  private int S1847 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void thread31443(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 273, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 273, column: 58
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

  public void thread31442(int [] tdone, int [] ends){
        if(vacOnM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 271, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 271, column: 45
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

  public void thread31441(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 269, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 269, column: 50
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

  public void thread31440(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 267, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 267, column: 58
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

  public void thread31439(int [] tdone, int [] ends){
        S1877=1;
    S1847=0;
    if(!auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 266, column: 14
      thread31440(tdone,ends);
      thread31441(tdone,ends);
      thread31442(tdone,ends);
      thread31443(tdone,ends);
      int biggest31444 = 0;
      if(ends[31]>=biggest31444){
        biggest31444=ends[31];
      }
      if(ends[32]>=biggest31444){
        biggest31444=ends[32];
      }
      if(ends[33]>=biggest31444){
        biggest31444=ends[33];
      }
      if(ends[34]>=biggest31444){
        biggest31444=ends[34];
      }
      //FINXME code
      if(biggest31444 == 0){
        S1847=1;
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
    else {
      S1847=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread31438(int [] tdone, int [] ends){
        S1833=1;
    S1017=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread31437(int [] tdone, int [] ends){
        S1015=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 147, column: 9
      S1007=0;
      auto_25.setPresent();//sysj\ABScontroller.sysj line: 148, column: 7
      currsigs.addElement(auto_25);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S1007=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31434(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 273, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 273, column: 58
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

  public void thread31433(int [] tdone, int [] ends){
        if(vacOnM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 271, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 271, column: 45
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

  public void thread31432(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 269, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 269, column: 50
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

  public void thread31431(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 267, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 267, column: 58
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

  public void thread31430(int [] tdone, int [] ends){
        S1877=1;
    S1847=0;
    if(!auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 266, column: 14
      thread31431(tdone,ends);
      thread31432(tdone,ends);
      thread31433(tdone,ends);
      thread31434(tdone,ends);
      int biggest31435 = 0;
      if(ends[31]>=biggest31435){
        biggest31435=ends[31];
      }
      if(ends[32]>=biggest31435){
        biggest31435=ends[32];
      }
      if(ends[33]>=biggest31435){
        biggest31435=ends[33];
      }
      if(ends[34]>=biggest31435){
        biggest31435=ends[34];
      }
      //FINXME code
      if(biggest31435 == 0){
        S1847=1;
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
    else {
      S1847=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread31429(int [] tdone, int [] ends){
        S1833=1;
    S1017=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread31428(int [] tdone, int [] ends){
        S1015=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 147, column: 9
      S1007=0;
      auto_25.setPresent();//sysj\ABScontroller.sysj line: 148, column: 7
      currsigs.addElement(auto_25);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S1007=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31425(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 273, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 273, column: 58
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

  public void thread31424(int [] tdone, int [] ends){
        if(vacOnM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 271, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 271, column: 45
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

  public void thread31423(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 269, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 269, column: 50
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

  public void thread31422(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 267, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 267, column: 58
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

  public void thread31420(int [] tdone, int [] ends){
        active[34]=0;
    ends[34]=0;
    tdone[34]=1;
  }

  public void thread31419(int [] tdone, int [] ends){
        active[33]=0;
    ends[33]=0;
    tdone[33]=1;
  }

  public void thread31418(int [] tdone, int [] ends){
        active[32]=0;
    ends[32]=0;
    tdone[32]=1;
  }

  public void thread31417(int [] tdone, int [] ends){
        active[31]=0;
    ends[31]=0;
    tdone[31]=1;
  }

  public void thread31416(int [] tdone, int [] ends){
        switch(S1877){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S1847){
          case 0 : 
            thread31417(tdone,ends);
            thread31418(tdone,ends);
            thread31419(tdone,ends);
            thread31420(tdone,ends);
            int biggest31421 = 0;
            if(ends[31]>=biggest31421){
              biggest31421=ends[31];
            }
            if(ends[32]>=biggest31421){
              biggest31421=ends[32];
            }
            if(ends[33]>=biggest31421){
              biggest31421=ends[33];
            }
            if(ends[34]>=biggest31421){
              biggest31421=ends[34];
            }
            //FINXME code
            if(biggest31421 == 0){
              S1847=1;
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
          case 1 : 
            S1847=1;
            S1847=0;
            if(!auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 266, column: 14
              thread31422(tdone,ends);
              thread31423(tdone,ends);
              thread31424(tdone,ends);
              thread31425(tdone,ends);
              int biggest31426 = 0;
              if(ends[31]>=biggest31426){
                biggest31426=ends[31];
              }
              if(ends[32]>=biggest31426){
                biggest31426=ends[32];
              }
              if(ends[33]>=biggest31426){
                biggest31426=ends[33];
              }
              if(ends[34]>=biggest31426){
                biggest31426=ends[34];
              }
              //FINXME code
              if(biggest31426 == 0){
                S1847=1;
                active[30]=1;
                ends[30]=1;
                tdone[30]=1;
              }
            }
            else {
              S1847=1;
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31414(int [] tdone, int [] ends){
        S1157=1;
    vacOn.setPresent();//sysj\ABScontroller.sysj line: 222, column: 35
    currsigs.addElement(vacOn);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread31413(int [] tdone, int [] ends){
        S1152=1;
    armDest.setPresent();//sysj\ABScontroller.sysj line: 222, column: 11
    currsigs.addElement(armDest);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread31411(int [] tdone, int [] ends){
        switch(S1157){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\ABScontroller.sysj line: 222, column: 35
        currsigs.addElement(vacOn);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
        break;
      
    }
  }

  public void thread31410(int [] tdone, int [] ends){
        switch(S1152){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\ABScontroller.sysj line: 222, column: 11
        currsigs.addElement(armDest);
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread31408(int [] tdone, int [] ends){
        S1157=1;
    vacOn.setPresent();//sysj\ABScontroller.sysj line: 222, column: 35
    currsigs.addElement(vacOn);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread31407(int [] tdone, int [] ends){
        S1152=1;
    armDest.setPresent();//sysj\ABScontroller.sysj line: 222, column: 11
    currsigs.addElement(armDest);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread31406(int [] tdone, int [] ends){
        switch(S1833){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S1017){
          case 0 : 
            if(request.getprestatus()){//sysj\ABScontroller.sysj line: 159, column: 12
              System.out.println("req");//sysj\ABScontroller.sysj line: 160, column: 6
              S1017=1;
              S1022=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 163, column: 16
                S1021=0;
                armDest.setPresent();//sysj\ABScontroller.sysj line: 164, column: 9
                currsigs.addElement(armDest);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1021=1;
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
            if(armAtDest.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 161, column: 12
              System.out.println("armAtDest");//sysj\ABScontroller.sysj line: 172, column: 6
              S1017=2;
              S1054=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 176, column: 16
                S1053=0;
                pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 177, column: 9
                currsigs.addElement(pusherExtend);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1053=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              switch(S1022){
                case 0 : 
                  switch(S1021){
                    case 0 : 
                      armDest.setPresent();//sysj\ABScontroller.sysj line: 164, column: 9
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
                  S1022=1;
                  S1022=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 163, column: 16
                    S1021=0;
                    armDest.setPresent();//sysj\ABScontroller.sysj line: 164, column: 9
                    currsigs.addElement(armDest);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1021=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(pusherExtended.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 174, column: 12
              System.out.println("pusherEx");//sysj\ABScontroller.sysj line: 184, column: 6
              S1017=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            else {
              switch(S1054){
                case 0 : 
                  switch(S1053){
                    case 0 : 
                      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 177, column: 9
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
                  S1054=1;
                  S1054=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 176, column: 16
                    S1053=0;
                    pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 177, column: 9
                    currsigs.addElement(pusherExtend);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1053=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 3 : 
            if(pusherRetracted.getprestatus()){//sysj\ABScontroller.sysj line: 187, column: 12
              System.out.println("pusherRe");//sysj\ABScontroller.sysj line: 190, column: 6
              S1017=4;
              S1088=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 195, column: 16
                S1087=0;
                armSource.setPresent();//sysj\ABScontroller.sysj line: 196, column: 9
                currsigs.addElement(armSource);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1087=1;
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
            if(armAtSource.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 193, column: 12
              System.out.println("armAS");//sysj\ABScontroller.sysj line: 203, column: 6
              S1017=5;
              S1120=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 208, column: 16
                S1119=0;
                vacOn.setPresent();//sysj\ABScontroller.sysj line: 209, column: 9
                currsigs.addElement(vacOn);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1119=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              switch(S1088){
                case 0 : 
                  switch(S1087){
                    case 0 : 
                      armSource.setPresent();//sysj\ABScontroller.sysj line: 196, column: 9
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
                  S1088=1;
                  S1088=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 195, column: 16
                    S1087=0;
                    armSource.setPresent();//sysj\ABScontroller.sysj line: 196, column: 9
                    currsigs.addElement(armSource);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1087=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 5 : 
            if(WPgripped.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 206, column: 12
              System.out.println("WPgripped");//sysj\ABScontroller.sysj line: 216, column: 6
              S1017=6;
              S1159=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 221, column: 16
                S1158=0;
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
                S1158=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              switch(S1120){
                case 0 : 
                  switch(S1119){
                    case 0 : 
                      vacOn.setPresent();//sysj\ABScontroller.sysj line: 209, column: 9
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
                  S1120=1;
                  S1120=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 208, column: 16
                    S1119=0;
                    vacOn.setPresent();//sysj\ABScontroller.sysj line: 209, column: 9
                    currsigs.addElement(vacOn);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1119=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 6 : 
            if(armAtDest.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 219, column: 12
              System.out.println("armAD");//sysj\ABScontroller.sysj line: 229, column: 6
              S1017=7;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            else {
              switch(S1159){
                case 0 : 
                  switch(S1158){
                    case 0 : 
                      thread31410(tdone,ends);
                      thread31411(tdone,ends);
                      int biggest31412 = 0;
                      if(ends[28]>=biggest31412){
                        biggest31412=ends[28];
                      }
                      if(ends[29]>=biggest31412){
                        biggest31412=ends[29];
                      }
                      if(biggest31412 == 1){
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      //FINXME code
                      if(biggest31412 == 0){
                        S1159=1;
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
                  S1159=1;
                  S1159=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 221, column: 16
                    S1158=0;
                    thread31413(tdone,ends);
                    thread31414(tdone,ends);
                    int biggest31415 = 0;
                    if(ends[28]>=biggest31415){
                      biggest31415=ends[28];
                    }
                    if(ends[29]>=biggest31415){
                      biggest31415=ends[29];
                    }
                    if(biggest31415 == 1){
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                  }
                  else {
                    S1158=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 7 : 
            if(!WPgripped.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 232, column: 12
              System.out.println("!WPgripped");//sysj\ABScontroller.sysj line: 235, column: 6
              S1017=8;
              S1228=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 240, column: 16
                S1227=0;
                armSource.setPresent();//sysj\ABScontroller.sysj line: 241, column: 9
                currsigs.addElement(armSource);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1227=1;
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
            if(armAtSource.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 238, column: 12
              System.out.println("armAS");//sysj\ABScontroller.sysj line: 248, column: 6
              bottleCapLoaded.setPresent();//sysj\ABScontroller.sysj line: 249, column: 6
              currsigs.addElement(bottleCapLoaded);
              S1017=9;
              S1260=0;
              if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 252, column: 16
                S1259=0;
                armSource.setPresent();//sysj\ABScontroller.sysj line: 253, column: 9
                currsigs.addElement(armSource);
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S1259=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              switch(S1228){
                case 0 : 
                  switch(S1227){
                    case 0 : 
                      armSource.setPresent();//sysj\ABScontroller.sysj line: 241, column: 9
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
                  S1228=1;
                  S1228=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 240, column: 16
                    S1227=0;
                    armSource.setPresent();//sysj\ABScontroller.sysj line: 241, column: 9
                    currsigs.addElement(armSource);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1227=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 9 : 
            if(armAtSource.getprestatus()){//sysj\ABScontroller.sysj line: 250, column: 12
              S1017=0;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            else {
              switch(S1260){
                case 0 : 
                  switch(S1259){
                    case 0 : 
                      armSource.setPresent();//sysj\ABScontroller.sysj line: 253, column: 9
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
                  S1260=1;
                  S1260=0;
                  if(auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 252, column: 16
                    S1259=0;
                    armSource.setPresent();//sysj\ABScontroller.sysj line: 253, column: 9
                    currsigs.addElement(armSource);
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S1259=1;
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

  public void thread31405(int [] tdone, int [] ends){
        switch(S1015){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S1007){
          case 0 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 147, column: 9
              S1007=0;
              auto_25.setPresent();//sysj\ABScontroller.sysj line: 148, column: 7
              currsigs.addElement(auto_25);
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            else {
              S1007=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 1 : 
            S1007=1;
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 147, column: 9
              S1007=0;
              auto_25.setPresent();//sysj\ABScontroller.sysj line: 148, column: 7
              currsigs.addElement(auto_25);
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            else {
              S1007=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31402(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 273, column: 16
      armDest.setPresent();//sysj\ABScontroller.sysj line: 273, column: 58
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

  public void thread31401(int [] tdone, int [] ends){
        if(vacOnM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 271, column: 16
      vacOn.setPresent();//sysj\ABScontroller.sysj line: 271, column: 45
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

  public void thread31400(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 269, column: 16
      pusherExtend.setPresent();//sysj\ABScontroller.sysj line: 269, column: 50
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

  public void thread31399(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 267, column: 16
      armSource.setPresent();//sysj\ABScontroller.sysj line: 267, column: 58
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

  public void thread31398(int [] tdone, int [] ends){
        S1877=1;
    S1847=0;
    if(!auto_25.getprestatus()){//sysj\ABScontroller.sysj line: 266, column: 14
      thread31399(tdone,ends);
      thread31400(tdone,ends);
      thread31401(tdone,ends);
      thread31402(tdone,ends);
      int biggest31403 = 0;
      if(ends[31]>=biggest31403){
        biggest31403=ends[31];
      }
      if(ends[32]>=biggest31403){
        biggest31403=ends[32];
      }
      if(ends[33]>=biggest31403){
        biggest31403=ends[33];
      }
      if(ends[34]>=biggest31403){
        biggest31403=ends[34];
      }
      //FINXME code
      if(biggest31403 == 0){
        S1847=1;
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
    else {
      S1847=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread31397(int [] tdone, int [] ends){
        S1833=1;
    S1017=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread31396(int [] tdone, int [] ends){
        S1015=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 147, column: 9
      S1007=0;
      auto_25.setPresent();//sysj\ABScontroller.sysj line: 148, column: 7
      currsigs.addElement(auto_25);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S1007=1;
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
      switch(S8006){
        case 0 : 
          S8006=0;
          break RUN;
        
        case 1 : 
          S8006=2;
          S8006=2;
          System.out.println("CapLoaderController");//sysj\ABScontroller.sysj line: 141, column: 2
          if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 143, column: 11
            S1879=0;
            auto_25.setClear();//sysj\ABScontroller.sysj line: 144, column: 4
            S1878=0;
            thread31396(tdone,ends);
            thread31397(tdone,ends);
            thread31398(tdone,ends);
            int biggest31404 = 0;
            if(ends[26]>=biggest31404){
              biggest31404=ends[26];
            }
            if(ends[27]>=biggest31404){
              biggest31404=ends[27];
            }
            if(ends[30]>=biggest31404){
              biggest31404=ends[30];
            }
            if(biggest31404 == 1){
              active[25]=1;
              ends[25]=1;
              break RUN;
            }
          }
          else {
            S1879=1;
            active[25]=1;
            ends[25]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S1879){
            case 0 : 
              auto_25.setClear();//sysj\ABScontroller.sysj line: 144, column: 4
              switch(S1878){
                case 0 : 
                  thread31405(tdone,ends);
                  thread31406(tdone,ends);
                  thread31416(tdone,ends);
                  int biggest31427 = 0;
                  if(ends[26]>=biggest31427){
                    biggest31427=ends[26];
                  }
                  if(ends[27]>=biggest31427){
                    biggest31427=ends[27];
                  }
                  if(ends[30]>=biggest31427){
                    biggest31427=ends[30];
                  }
                  if(biggest31427 == 1){
                    active[25]=1;
                    ends[25]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest31427 == 0){
                    S1878=1;
                    active[25]=1;
                    ends[25]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S1878=1;
                  if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 143, column: 11
                    S1879=0;
                    auto_25.setClear();//sysj\ABScontroller.sysj line: 144, column: 4
                    S1878=0;
                    thread31428(tdone,ends);
                    thread31429(tdone,ends);
                    thread31430(tdone,ends);
                    int biggest31436 = 0;
                    if(ends[26]>=biggest31436){
                      biggest31436=ends[26];
                    }
                    if(ends[27]>=biggest31436){
                      biggest31436=ends[27];
                    }
                    if(ends[30]>=biggest31436){
                      biggest31436=ends[30];
                    }
                    if(biggest31436 == 1){
                      active[25]=1;
                      ends[25]=1;
                      break RUN;
                    }
                  }
                  else {
                    S1879=1;
                    active[25]=1;
                    ends[25]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S1879=1;
              if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 143, column: 11
                S1879=0;
                auto_25.setClear();//sysj\ABScontroller.sysj line: 144, column: 4
                S1878=0;
                thread31437(tdone,ends);
                thread31438(tdone,ends);
                thread31439(tdone,ends);
                int biggest31445 = 0;
                if(ends[26]>=biggest31445){
                  biggest31445=ends[26];
                }
                if(ends[27]>=biggest31445){
                  biggest31445=ends[27];
                }
                if(ends[30]>=biggest31445){
                  biggest31445=ends[30];
                }
                if(biggest31445 == 1){
                  active[25]=1;
                  ends[25]=1;
                  break RUN;
                }
              }
              else {
                S1879=1;
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
