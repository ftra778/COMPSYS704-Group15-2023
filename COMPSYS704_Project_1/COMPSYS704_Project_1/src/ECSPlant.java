import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\ABSplant.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABSplant.sysj line: 2, column: 1

public class ECSPlant extends ClockDomain{
  public ECSPlant(String name){super(name);}
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
  public Signal lightOffE = new Signal("lightOffE", Signal.OUTPUT);
  public Signal emergency = new Signal("emergency", Signal.OUTPUT);
  public Signal lightOnE = new Signal("lightOnE", Signal.OUTPUT);
  private List tempOut_thread_54;//sysj\ABSplant.sysj line: 438, column: 4
  private List humidityOut_thread_54;//sysj\ABSplant.sysj line: 439, column: 4
  private List lightOut_thread_54;//sysj\ABSplant.sysj line: 440, column: 4
  private List presence_thread_54;//sysj\ABSplant.sysj line: 441, column: 4
  private int closed_thread_54;//sysj\ABSplant.sysj line: 442, column: 4
  private int i_thread_54;//sysj\ABSplant.sysj line: 443, column: 8
  private int smoke_thread_55;//sysj\ABSplant.sysj line: 485, column: 4
  private int S44394 = 1;
  private int S39254 = 1;
  private int S34190 = 1;
  private int S34253 = 1;
  private int S34241 = 1;
  private int S34240 = 1;
  private int S34264 = 1;
  private int S34263 = 1;
  private int S34304 = 1;
  private int S39286 = 1;
  private int S39264 = 1;
  
  private int[] ends = new int[74];
  private int[] tdone = new int[74];
  
  public void thread44780(int [] tdone, int [] ends){
        switch(S39286){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        switch(S39264){
          case 0 : 
            if(smokeState.getprestatus()){//sysj\ABSplant.sysj line: 481, column: 10
              S39264=1;
              updates.setPresent();//sysj\ABSplant.sysj line: 483, column: 5
              currsigs.addElement(updates);
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            else {
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            break;
          
          case 1 : 
            if(!smokeState.getprestatus()){//sysj\ABSplant.sysj line: 482, column: 10
              smoke_thread_55 = (smokeState.getpreval() == null ? 0 : ((Integer)smokeState.getpreval()).intValue());//sysj\ABSplant.sysj line: 485, column: 4
              if((int)smoke_thread_55 == 1) {//sysj\ABSplant.sysj line: 486, column: 25
                States.SMOKE_STATE = 1;//sysj\ABSplant.sysj line: 487, column: 5
              }
              else {//sysj\ABSplant.sysj line: 488, column: 11
                States.SMOKE_STATE = 0;//sysj\ABSplant.sysj line: 489, column: 5
              }
              S39264=0;
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            else {
              updates.setPresent();//sysj\ABSplant.sysj line: 483, column: 5
              currsigs.addElement(updates);
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44779(int [] tdone, int [] ends){
        switch(S39254){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S34190){
          case 0 : 
            if(tempState.getprestatus()){//sysj\ABSplant.sysj line: 416, column: 10
              S34190=1;
              updatep.setPresent();//sysj\ABSplant.sysj line: 418, column: 5
              currsigs.addElement(updatep);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 1 : 
            if(!tempState.getprestatus()){//sysj\ABSplant.sysj line: 417, column: 10
              S34190=2;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              updatep.setPresent();//sysj\ABSplant.sysj line: 418, column: 5
              currsigs.addElement(updatep);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 2 : 
            if(humidityState.getprestatus()){//sysj\ABSplant.sysj line: 420, column: 10
              S34190=3;
              updatep.setPresent();//sysj\ABSplant.sysj line: 422, column: 5
              currsigs.addElement(updatep);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 3 : 
            if(!humidityState.getprestatus()){//sysj\ABSplant.sysj line: 421, column: 10
              S34190=4;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              updatep.setPresent();//sysj\ABSplant.sysj line: 422, column: 5
              currsigs.addElement(updatep);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 4 : 
            if(lightState.getprestatus()){//sysj\ABSplant.sysj line: 424, column: 10
              S34190=5;
              updatep.setPresent();//sysj\ABSplant.sysj line: 426, column: 5
              currsigs.addElement(updatep);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 5 : 
            if(!lightState.getprestatus()){//sysj\ABSplant.sysj line: 425, column: 10
              S34190=6;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              updatep.setPresent();//sysj\ABSplant.sysj line: 426, column: 5
              currsigs.addElement(updatep);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 6 : 
            if(presenceState.getprestatus()){//sysj\ABSplant.sysj line: 428, column: 10
              S34190=7;
              updatep.setPresent();//sysj\ABSplant.sysj line: 430, column: 5
              currsigs.addElement(updatep);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 7 : 
            if(!presenceState.getprestatus()){//sysj\ABSplant.sysj line: 429, column: 10
              S34190=8;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              updatep.setPresent();//sysj\ABSplant.sysj line: 430, column: 5
              currsigs.addElement(updatep);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 8 : 
            if(closedState.getprestatus()){//sysj\ABSplant.sysj line: 432, column: 10
              S34190=9;
              updatep.setPresent();//sysj\ABSplant.sysj line: 434, column: 5
              currsigs.addElement(updatep);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 9 : 
            if(!closedState.getprestatus()){//sysj\ABSplant.sysj line: 433, column: 10
              tempOut_thread_54 = (tempState.getpreval() == null ? null : ((List)tempState.getpreval()));//sysj\ABSplant.sysj line: 438, column: 4
              humidityOut_thread_54 = (humidityState.getpreval() == null ? null : ((List)humidityState.getpreval()));//sysj\ABSplant.sysj line: 439, column: 4
              lightOut_thread_54 = (lightState.getpreval() == null ? null : ((List)lightState.getpreval()));//sysj\ABSplant.sysj line: 440, column: 4
              presence_thread_54 = (presenceState.getpreval() == null ? null : ((List)presenceState.getpreval()));//sysj\ABSplant.sysj line: 441, column: 4
              closed_thread_54 = (closedState.getpreval() == null ? 0 : ((Integer)closedState.getpreval()).intValue());//sysj\ABSplant.sysj line: 442, column: 4
              i_thread_54 = 0;//sysj\ABSplant.sysj line: 443, column: 8
              S34190=10;
              if(i_thread_54 < 7){//sysj\ABSplant.sysj line: 443, column: 19
                States.CURR_ZONE = i_thread_54;//sysj\ABSplant.sysj line: 444, column: 5
                S34253=0;
                if(((int)tempOut_thread_54.get(i_thread_54) == 0) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 445, column: 9
                  S34241=0;
                  tempHotE.setPresent();//sysj\ABSplant.sysj line: 446, column: 6
                  currsigs.addElement(tempHotE);
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  S34241=1;
                  if(((int)tempOut_thread_54.get(i_thread_54) == 2) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 448, column: 16
                    S34240=0;
                    tempColdE.setPresent();//sysj\ABSplant.sysj line: 449, column: 6
                    currsigs.addElement(tempColdE);
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  else {
                    S34240=1;
                    tempOffE.setPresent();//sysj\ABSplant.sysj line: 452, column: 6
                    currsigs.addElement(tempOffE);
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                }
              }
              else {
                ends[54]=2;
                ;//sysj\ABSplant.sysj line: 412, column: 2
                S34190=0;
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
            }
            else {
              updatep.setPresent();//sysj\ABSplant.sysj line: 434, column: 5
              currsigs.addElement(updatep);
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            break;
          
          case 10 : 
            switch(S34253){
              case 0 : 
                switch(S34241){
                  case 0 : 
                    if(!tempHotE.getprestatus()){//sysj\ABSplant.sysj line: 447, column: 12
                      S34253=1;
                      if(((int)humidityOut_thread_54.get(i_thread_54) == 0) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 455, column: 9
                        S34264=0;
                        humidityIncE.setPresent();//sysj\ABSplant.sysj line: 456, column: 6
                        currsigs.addElement(humidityIncE);
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                      else {
                        S34264=1;
                        if(((int)humidityOut_thread_54.get(i_thread_54) == 2) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 458, column: 16
                          S34263=0;
                          humidityRedE.setPresent();//sysj\ABSplant.sysj line: 459, column: 6
                          currsigs.addElement(humidityRedE);
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                        else {
                          S34263=1;
                          humidityOffE.setPresent();//sysj\ABSplant.sysj line: 462, column: 6
                          currsigs.addElement(humidityOffE);
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                      }
                    }
                    else {
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                    break;
                  
                  case 1 : 
                    switch(S34240){
                      case 0 : 
                        if(!tempColdE.getprestatus()){//sysj\ABSplant.sysj line: 450, column: 12
                          S34253=1;
                          if(((int)humidityOut_thread_54.get(i_thread_54) == 0) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 455, column: 9
                            S34264=0;
                            humidityIncE.setPresent();//sysj\ABSplant.sysj line: 456, column: 6
                            currsigs.addElement(humidityIncE);
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                          else {
                            S34264=1;
                            if(((int)humidityOut_thread_54.get(i_thread_54) == 2) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 458, column: 16
                              S34263=0;
                              humidityRedE.setPresent();//sysj\ABSplant.sysj line: 459, column: 6
                              currsigs.addElement(humidityRedE);
                              active[54]=1;
                              ends[54]=1;
                              tdone[54]=1;
                            }
                            else {
                              S34263=1;
                              humidityOffE.setPresent();//sysj\ABSplant.sysj line: 462, column: 6
                              currsigs.addElement(humidityOffE);
                              active[54]=1;
                              ends[54]=1;
                              tdone[54]=1;
                            }
                          }
                        }
                        else {
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                        break;
                      
                      case 1 : 
                        if(!tempOffE.getprestatus()){//sysj\ABSplant.sysj line: 453, column: 12
                          S34253=1;
                          if(((int)humidityOut_thread_54.get(i_thread_54) == 0) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 455, column: 9
                            S34264=0;
                            humidityIncE.setPresent();//sysj\ABSplant.sysj line: 456, column: 6
                            currsigs.addElement(humidityIncE);
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                          else {
                            S34264=1;
                            if(((int)humidityOut_thread_54.get(i_thread_54) == 2) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 458, column: 16
                              S34263=0;
                              humidityRedE.setPresent();//sysj\ABSplant.sysj line: 459, column: 6
                              currsigs.addElement(humidityRedE);
                              active[54]=1;
                              ends[54]=1;
                              tdone[54]=1;
                            }
                            else {
                              S34263=1;
                              humidityOffE.setPresent();//sysj\ABSplant.sysj line: 462, column: 6
                              currsigs.addElement(humidityOffE);
                              active[54]=1;
                              ends[54]=1;
                              tdone[54]=1;
                            }
                          }
                        }
                        else {
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S34264){
                  case 0 : 
                    if(!humidityIncE.getprestatus()){//sysj\ABSplant.sysj line: 457, column: 12
                      S34253=2;
                      if(((int)lightOut_thread_54.get(i_thread_54) > 0) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 465, column: 9
                        S34304=0;
                        lightOnE.setPresent();//sysj\ABSplant.sysj line: 466, column: 6
                        currsigs.addElement(lightOnE);
                        lightOnE.setValue(lightOut_thread_54.get(i_thread_54));//sysj\ABSplant.sysj line: 466, column: 6
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                      else {
                        S34304=1;
                        lightOffE.setPresent();//sysj\ABSplant.sysj line: 469, column: 6
                        currsigs.addElement(lightOffE);
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                    }
                    else {
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                    break;
                  
                  case 1 : 
                    switch(S34263){
                      case 0 : 
                        if(!humidityRedE.getprestatus()){//sysj\ABSplant.sysj line: 460, column: 12
                          S34253=2;
                          if(((int)lightOut_thread_54.get(i_thread_54) > 0) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 465, column: 9
                            S34304=0;
                            lightOnE.setPresent();//sysj\ABSplant.sysj line: 466, column: 6
                            currsigs.addElement(lightOnE);
                            lightOnE.setValue(lightOut_thread_54.get(i_thread_54));//sysj\ABSplant.sysj line: 466, column: 6
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                          else {
                            S34304=1;
                            lightOffE.setPresent();//sysj\ABSplant.sysj line: 469, column: 6
                            currsigs.addElement(lightOffE);
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                        }
                        else {
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                        break;
                      
                      case 1 : 
                        if(!humidityOffE.getprestatus()){//sysj\ABSplant.sysj line: 463, column: 12
                          S34253=2;
                          if(((int)lightOut_thread_54.get(i_thread_54) > 0) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 465, column: 9
                            S34304=0;
                            lightOnE.setPresent();//sysj\ABSplant.sysj line: 466, column: 6
                            currsigs.addElement(lightOnE);
                            lightOnE.setValue(lightOut_thread_54.get(i_thread_54));//sysj\ABSplant.sysj line: 466, column: 6
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                          else {
                            S34304=1;
                            lightOffE.setPresent();//sysj\ABSplant.sysj line: 469, column: 6
                            currsigs.addElement(lightOffE);
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                        }
                        else {
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                switch(S34304){
                  case 0 : 
                    if(!lightOnE.getprestatus()){//sysj\ABSplant.sysj line: 467, column: 12
                      S34253=3;
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                    else {
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(!lightOffE.getprestatus()){//sysj\ABSplant.sysj line: 470, column: 12
                      S34253=3;
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                    else {
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                    break;
                  
                }
                break;
              
              case 3 : 
                S34253=3;
                i_thread_54 = i_thread_54 + 1;//sysj\ABSplant.sysj line: 443, column: 26
                if(i_thread_54 < 7){//sysj\ABSplant.sysj line: 443, column: 19
                  States.CURR_ZONE = i_thread_54;//sysj\ABSplant.sysj line: 444, column: 5
                  S34253=0;
                  if(((int)tempOut_thread_54.get(i_thread_54) == 0) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 445, column: 9
                    S34241=0;
                    tempHotE.setPresent();//sysj\ABSplant.sysj line: 446, column: 6
                    currsigs.addElement(tempHotE);
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  else {
                    S34241=1;
                    if(((int)tempOut_thread_54.get(i_thread_54) == 2) && (((Boolean)presence_thread_54.get(i_thread_54) == true) || ((int)closed_thread_54 == 0))){//sysj\ABSplant.sysj line: 448, column: 16
                      S34240=0;
                      tempColdE.setPresent();//sysj\ABSplant.sysj line: 449, column: 6
                      currsigs.addElement(tempColdE);
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                    else {
                      S34240=1;
                      tempOffE.setPresent();//sysj\ABSplant.sysj line: 452, column: 6
                      currsigs.addElement(tempOffE);
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                  }
                }
                else {
                  ends[54]=2;
                  ;//sysj\ABSplant.sysj line: 412, column: 2
                  S34190=0;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44777(int [] tdone, int [] ends){
        S39286=1;
    S39264=0;
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread44776(int [] tdone, int [] ends){
        S39254=1;
    System.out.println("ECSPlant");//sysj\ABSplant.sysj line: 413, column: 3
    S34190=0;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S44394){
        case 0 : 
          S44394=0;
          break RUN;
        
        case 1 : 
          S44394=2;
          S44394=2;
          new Thread(new GUI()).start();//sysj\ABSplant.sysj line: 411, column: 2
          thread44776(tdone,ends);
          thread44777(tdone,ends);
          int biggest44778 = 0;
          if(ends[54]>=biggest44778){
            biggest44778=ends[54];
          }
          if(ends[55]>=biggest44778){
            biggest44778=ends[55];
          }
          if(biggest44778 == 1){
            active[53]=1;
            ends[53]=1;
            break RUN;
          }
        
        case 2 : 
          thread44779(tdone,ends);
          thread44780(tdone,ends);
          int biggest44781 = 0;
          if(ends[54]>=biggest44781){
            biggest44781=ends[54];
          }
          if(ends[55]>=biggest44781){
            biggest44781=ends[55];
          }
          if(biggest44781 == 1){
            active[53]=1;
            ends[53]=1;
            break RUN;
          }
          //FINXME code
          if(biggest44781 == 0){
            S44394=0;
            active[53]=0;
            ends[53]=0;
            S44394=0;
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
      lightOffE.setpreclear();
      emergency.setpreclear();
      lightOnE.setpreclear();
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
      lightOffE.sethook();
      lightOffE.setClear();
      emergency.sethook();
      emergency.setClear();
      lightOnE.sethook();
      lightOnE.setClear();
      if(paused[53]!=0 || suspended[53]!=0 || active[53]!=1);
      else{
        tempState.gethook();
        humidityState.gethook();
        lightState.gethook();
        presenceState.gethook();
        smokeState.gethook();
        closedState.gethook();
      }
      runFinisher();
      if(active[53] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
