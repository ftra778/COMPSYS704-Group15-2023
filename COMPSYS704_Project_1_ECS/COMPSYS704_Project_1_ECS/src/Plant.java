import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1
import org.compsys704.*;//sysj\plant.sysj line: 2, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tempState = new Signal("tempState", Signal.INPUT);
  public Signal humidityState = new Signal("humidityState", Signal.INPUT);
  public Signal lightState = new Signal("lightState", Signal.INPUT);
  public Signal presenceState = new Signal("presenceState", Signal.INPUT);
  public Signal smokeState = new Signal("smokeState", Signal.INPUT);
  public Signal closedState = new Signal("closedState", Signal.INPUT);
  public Signal updatep = new Signal("updatep", Signal.OUTPUT);
  public Signal updates = new Signal("updates", Signal.OUTPUT);
  public Signal tempHotE = new Signal("tempHotE", Signal.OUTPUT);
  public Signal tempColdE = new Signal("tempColdE", Signal.OUTPUT);
  public Signal tempOffE = new Signal("tempOffE", Signal.OUTPUT);
  public Signal humidityIncE = new Signal("humidityIncE", Signal.OUTPUT);
  public Signal humidityRedE = new Signal("humidityRedE", Signal.OUTPUT);
  public Signal humidityOffE = new Signal("humidityOffE", Signal.OUTPUT);
  public Signal lightOnE = new Signal("lightOnE", Signal.OUTPUT);
  public Signal lightOffE = new Signal("lightOffE", Signal.OUTPUT);
  private List tempOut_thread_2;//sysj\plant.sysj line: 39, column: 4
  private List humidityOut_thread_2;//sysj\plant.sysj line: 40, column: 4
  private List lightOut_thread_2;//sysj\plant.sysj line: 41, column: 4
  private List presence_thread_2;//sysj\plant.sysj line: 42, column: 4
  private int closed_thread_2;//sysj\plant.sysj line: 43, column: 4
  private int i_thread_2;//sysj\plant.sysj line: 44, column: 8
  private int smoke_thread_3;//sysj\plant.sysj line: 86, column: 4
  private int S18053 = 1;
  private int S15449 = 1;
  private int S12921 = 1;
  private int S12984 = 1;
  private int S12972 = 1;
  private int S12971 = 1;
  private int S12995 = 1;
  private int S12994 = 1;
  private int S13035 = 1;
  private int S15481 = 1;
  private int S15459 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread18059(int [] tdone, int [] ends){
        switch(S15481){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S15459){
          case 0 : 
            if(smokeState.getprestatus()){//sysj\plant.sysj line: 82, column: 10
              S15459=1;
              updates.setPresent();//sysj\plant.sysj line: 84, column: 5
              currsigs.addElement(updates);
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
          
          case 1 : 
            if(!smokeState.getprestatus()){//sysj\plant.sysj line: 83, column: 10
              smoke_thread_3 = (smokeState.getpreval() == null ? 0 : ((Integer)smokeState.getpreval()).intValue());//sysj\plant.sysj line: 86, column: 4
              if((int)smoke_thread_3 == 1) {//sysj\plant.sysj line: 87, column: 25
                States.SMOKE_STATE = 1;//sysj\plant.sysj line: 88, column: 5
              }
              else {//sysj\plant.sysj line: 89, column: 11
                States.SMOKE_STATE = 0;//sysj\plant.sysj line: 90, column: 5
              }
              S15459=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              updates.setPresent();//sysj\plant.sysj line: 84, column: 5
              currsigs.addElement(updates);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18058(int [] tdone, int [] ends){
        switch(S15449){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S12921){
          case 0 : 
            if(tempState.getprestatus()){//sysj\plant.sysj line: 17, column: 10
              S12921=1;
              updatep.setPresent();//sysj\plant.sysj line: 19, column: 5
              currsigs.addElement(updatep);
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
          
          case 1 : 
            if(!tempState.getprestatus()){//sysj\plant.sysj line: 18, column: 10
              S12921=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              updatep.setPresent();//sysj\plant.sysj line: 19, column: 5
              currsigs.addElement(updatep);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(humidityState.getprestatus()){//sysj\plant.sysj line: 21, column: 10
              S12921=3;
              updatep.setPresent();//sysj\plant.sysj line: 23, column: 5
              currsigs.addElement(updatep);
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
          
          case 3 : 
            if(!humidityState.getprestatus()){//sysj\plant.sysj line: 22, column: 10
              S12921=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              updatep.setPresent();//sysj\plant.sysj line: 23, column: 5
              currsigs.addElement(updatep);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            if(lightState.getprestatus()){//sysj\plant.sysj line: 25, column: 10
              S12921=5;
              updatep.setPresent();//sysj\plant.sysj line: 27, column: 5
              currsigs.addElement(updatep);
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
          
          case 5 : 
            if(!lightState.getprestatus()){//sysj\plant.sysj line: 26, column: 10
              S12921=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              updatep.setPresent();//sysj\plant.sysj line: 27, column: 5
              currsigs.addElement(updatep);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(presenceState.getprestatus()){//sysj\plant.sysj line: 29, column: 10
              S12921=7;
              updatep.setPresent();//sysj\plant.sysj line: 31, column: 5
              currsigs.addElement(updatep);
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
          
          case 7 : 
            if(!presenceState.getprestatus()){//sysj\plant.sysj line: 30, column: 10
              S12921=8;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              updatep.setPresent();//sysj\plant.sysj line: 31, column: 5
              currsigs.addElement(updatep);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 8 : 
            if(closedState.getprestatus()){//sysj\plant.sysj line: 33, column: 10
              S12921=9;
              updatep.setPresent();//sysj\plant.sysj line: 35, column: 5
              currsigs.addElement(updatep);
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
          
          case 9 : 
            if(!closedState.getprestatus()){//sysj\plant.sysj line: 34, column: 10
              tempOut_thread_2 = (tempState.getpreval() == null ? null : ((List)tempState.getpreval()));//sysj\plant.sysj line: 39, column: 4
              humidityOut_thread_2 = (humidityState.getpreval() == null ? null : ((List)humidityState.getpreval()));//sysj\plant.sysj line: 40, column: 4
              lightOut_thread_2 = (lightState.getpreval() == null ? null : ((List)lightState.getpreval()));//sysj\plant.sysj line: 41, column: 4
              presence_thread_2 = (presenceState.getpreval() == null ? null : ((List)presenceState.getpreval()));//sysj\plant.sysj line: 42, column: 4
              closed_thread_2 = (closedState.getpreval() == null ? 0 : ((Integer)closedState.getpreval()).intValue());//sysj\plant.sysj line: 43, column: 4
              i_thread_2 = 0;//sysj\plant.sysj line: 44, column: 8
              S12921=10;
              if(i_thread_2 < 7){//sysj\plant.sysj line: 44, column: 19
                States.CURR_ZONE = i_thread_2;//sysj\plant.sysj line: 45, column: 5
                S12984=0;
                if(((int)tempOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 46, column: 9
                  S12972=0;
                  tempHotE.setPresent();//sysj\plant.sysj line: 47, column: 6
                  currsigs.addElement(tempHotE);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S12972=1;
                  if(((int)tempOut_thread_2.get(i_thread_2) == 2) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 49, column: 16
                    S12971=0;
                    tempColdE.setPresent();//sysj\plant.sysj line: 50, column: 6
                    currsigs.addElement(tempColdE);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S12971=1;
                    tempOffE.setPresent();//sysj\plant.sysj line: 53, column: 6
                    currsigs.addElement(tempOffE);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                ends[2]=2;
                ;//sysj\plant.sysj line: 14, column: 2
                S12921=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              updatep.setPresent();//sysj\plant.sysj line: 35, column: 5
              currsigs.addElement(updatep);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 10 : 
            switch(S12984){
              case 0 : 
                switch(S12972){
                  case 0 : 
                    if(!tempHotE.getprestatus()){//sysj\plant.sysj line: 48, column: 12
                      S12984=1;
                      if(((int)humidityOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 56, column: 9
                        S12995=0;
                        humidityIncE.setPresent();//sysj\plant.sysj line: 57, column: 6
                        currsigs.addElement(humidityIncE);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S12995=1;
                        if(((int)humidityOut_thread_2.get(i_thread_2) == 2) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 59, column: 16
                          S12994=0;
                          humidityRedE.setPresent();//sysj\plant.sysj line: 60, column: 6
                          currsigs.addElement(humidityRedE);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S12994=1;
                          humidityOffE.setPresent();//sysj\plant.sysj line: 63, column: 6
                          currsigs.addElement(humidityOffE);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                  case 1 : 
                    switch(S12971){
                      case 0 : 
                        if(!tempColdE.getprestatus()){//sysj\plant.sysj line: 51, column: 12
                          S12984=1;
                          if(((int)humidityOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 56, column: 9
                            S12995=0;
                            humidityIncE.setPresent();//sysj\plant.sysj line: 57, column: 6
                            currsigs.addElement(humidityIncE);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S12995=1;
                            if(((int)humidityOut_thread_2.get(i_thread_2) == 2) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 59, column: 16
                              S12994=0;
                              humidityRedE.setPresent();//sysj\plant.sysj line: 60, column: 6
                              currsigs.addElement(humidityRedE);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S12994=1;
                              humidityOffE.setPresent();//sysj\plant.sysj line: 63, column: 6
                              currsigs.addElement(humidityOffE);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        break;
                      
                      case 1 : 
                        if(!tempOffE.getprestatus()){//sysj\plant.sysj line: 54, column: 12
                          S12984=1;
                          if(((int)humidityOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 56, column: 9
                            S12995=0;
                            humidityIncE.setPresent();//sysj\plant.sysj line: 57, column: 6
                            currsigs.addElement(humidityIncE);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S12995=1;
                            if(((int)humidityOut_thread_2.get(i_thread_2) == 2) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 59, column: 16
                              S12994=0;
                              humidityRedE.setPresent();//sysj\plant.sysj line: 60, column: 6
                              currsigs.addElement(humidityRedE);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S12994=1;
                              humidityOffE.setPresent();//sysj\plant.sysj line: 63, column: 6
                              currsigs.addElement(humidityOffE);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
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
                break;
              
              case 1 : 
                switch(S12995){
                  case 0 : 
                    if(!humidityIncE.getprestatus()){//sysj\plant.sysj line: 58, column: 12
                      S12984=2;
                      if(((int)lightOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 66, column: 9
                        S13035=0;
                        lightOnE.setPresent();//sysj\plant.sysj line: 67, column: 6
                        currsigs.addElement(lightOnE);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S13035=1;
                        lightOffE.setPresent();//sysj\plant.sysj line: 70, column: 6
                        currsigs.addElement(lightOffE);
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
                  
                  case 1 : 
                    switch(S12994){
                      case 0 : 
                        if(!humidityRedE.getprestatus()){//sysj\plant.sysj line: 61, column: 12
                          S12984=2;
                          if(((int)lightOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 66, column: 9
                            S13035=0;
                            lightOnE.setPresent();//sysj\plant.sysj line: 67, column: 6
                            currsigs.addElement(lightOnE);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S13035=1;
                            lightOffE.setPresent();//sysj\plant.sysj line: 70, column: 6
                            currsigs.addElement(lightOffE);
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
                      
                      case 1 : 
                        if(!humidityOffE.getprestatus()){//sysj\plant.sysj line: 64, column: 12
                          S12984=2;
                          if(((int)lightOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 66, column: 9
                            S13035=0;
                            lightOnE.setPresent();//sysj\plant.sysj line: 67, column: 6
                            currsigs.addElement(lightOnE);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S13035=1;
                            lightOffE.setPresent();//sysj\plant.sysj line: 70, column: 6
                            currsigs.addElement(lightOffE);
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
                    break;
                  
                }
                break;
              
              case 2 : 
                switch(S13035){
                  case 0 : 
                    if(!lightOnE.getprestatus()){//sysj\plant.sysj line: 68, column: 12
                      S12984=3;
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
                  
                  case 1 : 
                    if(!lightOffE.getprestatus()){//sysj\plant.sysj line: 71, column: 12
                      S12984=3;
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
              
              case 3 : 
                S12984=3;
                i_thread_2 = i_thread_2 + 1;//sysj\plant.sysj line: 44, column: 26
                if(i_thread_2 < 7){//sysj\plant.sysj line: 44, column: 19
                  States.CURR_ZONE = i_thread_2;//sysj\plant.sysj line: 45, column: 5
                  S12984=0;
                  if(((int)tempOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 46, column: 9
                    S12972=0;
                    tempHotE.setPresent();//sysj\plant.sysj line: 47, column: 6
                    currsigs.addElement(tempHotE);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S12972=1;
                    if(((int)tempOut_thread_2.get(i_thread_2) == 2) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\plant.sysj line: 49, column: 16
                      S12971=0;
                      tempColdE.setPresent();//sysj\plant.sysj line: 50, column: 6
                      currsigs.addElement(tempColdE);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S12971=1;
                      tempOffE.setPresent();//sysj\plant.sysj line: 53, column: 6
                      currsigs.addElement(tempOffE);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  ends[2]=2;
                  ;//sysj\plant.sysj line: 14, column: 2
                  S12921=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18056(int [] tdone, int [] ends){
        S15481=1;
    S15459=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread18055(int [] tdone, int [] ends){
        S15449=1;
    S12921=0;
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
      switch(S18053){
        case 0 : 
          S18053=0;
          break RUN;
        
        case 1 : 
          S18053=2;
          S18053=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 13, column: 2
          thread18055(tdone,ends);
          thread18056(tdone,ends);
          int biggest18057 = 0;
          if(ends[2]>=biggest18057){
            biggest18057=ends[2];
          }
          if(ends[3]>=biggest18057){
            biggest18057=ends[3];
          }
          if(biggest18057 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread18058(tdone,ends);
          thread18059(tdone,ends);
          int biggest18060 = 0;
          if(ends[2]>=biggest18060){
            biggest18060=ends[2];
          }
          if(ends[3]>=biggest18060){
            biggest18060=ends[3];
          }
          if(biggest18060 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest18060 == 0){
            S18053=0;
            active[1]=0;
            ends[1]=0;
            S18053=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
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
          tempState.gethook();
          humidityState.gethook();
          lightState.gethook();
          presenceState.gethook();
          smokeState.gethook();
          closedState.gethook();
          df = true;
        }
        runClockDomain();
      }
      tempState.setpreclear();
      humidityState.setpreclear();
      lightState.setpreclear();
      presenceState.setpreclear();
      smokeState.setpreclear();
      closedState.setpreclear();
      updatep.setpreclear();
      updates.setpreclear();
      tempHotE.setpreclear();
      tempColdE.setpreclear();
      tempOffE.setpreclear();
      humidityIncE.setpreclear();
      humidityRedE.setpreclear();
      humidityOffE.setpreclear();
      lightOnE.setpreclear();
      lightOffE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tempState.getStatus() ? tempState.setprepresent() : tempState.setpreclear();
      tempState.setpreval(tempState.getValue());
      tempState.setClear();
      dummyint = humidityState.getStatus() ? humidityState.setprepresent() : humidityState.setpreclear();
      humidityState.setpreval(humidityState.getValue());
      humidityState.setClear();
      dummyint = lightState.getStatus() ? lightState.setprepresent() : lightState.setpreclear();
      lightState.setpreval(lightState.getValue());
      lightState.setClear();
      dummyint = presenceState.getStatus() ? presenceState.setprepresent() : presenceState.setpreclear();
      presenceState.setpreval(presenceState.getValue());
      presenceState.setClear();
      dummyint = smokeState.getStatus() ? smokeState.setprepresent() : smokeState.setpreclear();
      smokeState.setpreval(smokeState.getValue());
      smokeState.setClear();
      dummyint = closedState.getStatus() ? closedState.setprepresent() : closedState.setpreclear();
      closedState.setpreval(closedState.getValue());
      closedState.setClear();
      updatep.sethook();
      updatep.setClear();
      updates.sethook();
      updates.setClear();
      tempHotE.sethook();
      tempHotE.setClear();
      tempColdE.sethook();
      tempColdE.setClear();
      tempOffE.sethook();
      tempOffE.setClear();
      humidityIncE.sethook();
      humidityIncE.setClear();
      humidityRedE.sethook();
      humidityRedE.setClear();
      humidityOffE.sethook();
      humidityOffE.setClear();
      lightOnE.sethook();
      lightOnE.setClear();
      lightOffE.sethook();
      lightOffE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tempState.gethook();
        humidityState.gethook();
        lightState.gethook();
        presenceState.gethook();
        smokeState.gethook();
        closedState.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
