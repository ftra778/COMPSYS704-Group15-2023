import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\ECSplant.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ECSplant.sysj line: 2, column: 1

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
  private List tempOut_thread_2;//sysj\ECSplant.sysj line: 40, column: 4
  private List humidityOut_thread_2;//sysj\ECSplant.sysj line: 41, column: 4
  private List lightOut_thread_2;//sysj\ECSplant.sysj line: 42, column: 4
  private List presence_thread_2;//sysj\ECSplant.sysj line: 43, column: 4
  private int closed_thread_2;//sysj\ECSplant.sysj line: 44, column: 4
  private int i_thread_2;//sysj\ECSplant.sysj line: 45, column: 8
  private int smoke_thread_3;//sysj\ECSplant.sysj line: 87, column: 4
  private int S11726 = 1;
  private int S9122 = 1;
  private int S6594 = 1;
  private int S6657 = 1;
  private int S6645 = 1;
  private int S6644 = 1;
  private int S6668 = 1;
  private int S6667 = 1;
  private int S6708 = 1;
  private int S9154 = 1;
  private int S9132 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread11732(int [] tdone, int [] ends){
        switch(S9154){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S9132){
          case 0 : 
            if(smokeState.getprestatus()){//sysj\ECSplant.sysj line: 83, column: 10
              S9132=1;
              updates.setPresent();//sysj\ECSplant.sysj line: 85, column: 5
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
            if(!smokeState.getprestatus()){//sysj\ECSplant.sysj line: 84, column: 10
              smoke_thread_3 = (smokeState.getpreval() == null ? 0 : ((Integer)smokeState.getpreval()).intValue());//sysj\ECSplant.sysj line: 87, column: 4
              if((int)smoke_thread_3 == 1) {//sysj\ECSplant.sysj line: 88, column: 25
                States.SMOKE_STATE = 1;//sysj\ECSplant.sysj line: 89, column: 5
              }
              else {//sysj\ECSplant.sysj line: 90, column: 11
                States.SMOKE_STATE = 0;//sysj\ECSplant.sysj line: 91, column: 5
              }
              emergency.setPresent();//sysj\ECSplant.sysj line: 93, column: 4
              currsigs.addElement(emergency);
              S9132=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              updates.setPresent();//sysj\ECSplant.sysj line: 85, column: 5
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

  public void thread11731(int [] tdone, int [] ends){
        switch(S9122){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S6594){
          case 0 : 
            if(tempState.getprestatus()){//sysj\ECSplant.sysj line: 18, column: 10
              S6594=1;
              updatep.setPresent();//sysj\ECSplant.sysj line: 20, column: 5
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
            if(!tempState.getprestatus()){//sysj\ECSplant.sysj line: 19, column: 10
              S6594=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              updatep.setPresent();//sysj\ECSplant.sysj line: 20, column: 5
              currsigs.addElement(updatep);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(humidityState.getprestatus()){//sysj\ECSplant.sysj line: 22, column: 10
              S6594=3;
              updatep.setPresent();//sysj\ECSplant.sysj line: 24, column: 5
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
            if(!humidityState.getprestatus()){//sysj\ECSplant.sysj line: 23, column: 10
              S6594=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              updatep.setPresent();//sysj\ECSplant.sysj line: 24, column: 5
              currsigs.addElement(updatep);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            if(lightState.getprestatus()){//sysj\ECSplant.sysj line: 26, column: 10
              S6594=5;
              updatep.setPresent();//sysj\ECSplant.sysj line: 28, column: 5
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
            if(!lightState.getprestatus()){//sysj\ECSplant.sysj line: 27, column: 10
              S6594=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              updatep.setPresent();//sysj\ECSplant.sysj line: 28, column: 5
              currsigs.addElement(updatep);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(presenceState.getprestatus()){//sysj\ECSplant.sysj line: 30, column: 10
              S6594=7;
              updatep.setPresent();//sysj\ECSplant.sysj line: 32, column: 5
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
            if(!presenceState.getprestatus()){//sysj\ECSplant.sysj line: 31, column: 10
              S6594=8;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              updatep.setPresent();//sysj\ECSplant.sysj line: 32, column: 5
              currsigs.addElement(updatep);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 8 : 
            if(closedState.getprestatus()){//sysj\ECSplant.sysj line: 34, column: 10
              S6594=9;
              updatep.setPresent();//sysj\ECSplant.sysj line: 36, column: 5
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
            if(!closedState.getprestatus()){//sysj\ECSplant.sysj line: 35, column: 10
              tempOut_thread_2 = (tempState.getpreval() == null ? null : ((List)tempState.getpreval()));//sysj\ECSplant.sysj line: 40, column: 4
              humidityOut_thread_2 = (humidityState.getpreval() == null ? null : ((List)humidityState.getpreval()));//sysj\ECSplant.sysj line: 41, column: 4
              lightOut_thread_2 = (lightState.getpreval() == null ? null : ((List)lightState.getpreval()));//sysj\ECSplant.sysj line: 42, column: 4
              presence_thread_2 = (presenceState.getpreval() == null ? null : ((List)presenceState.getpreval()));//sysj\ECSplant.sysj line: 43, column: 4
              closed_thread_2 = (closedState.getpreval() == null ? 0 : ((Integer)closedState.getpreval()).intValue());//sysj\ECSplant.sysj line: 44, column: 4
              i_thread_2 = 0;//sysj\ECSplant.sysj line: 45, column: 8
              S6594=10;
              if(i_thread_2 < 7){//sysj\ECSplant.sysj line: 45, column: 19
                States.CURR_ZONE = i_thread_2;//sysj\ECSplant.sysj line: 46, column: 5
                S6657=0;
                if(((int)tempOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 47, column: 9
                  S6645=0;
                  tempHotE.setPresent();//sysj\ECSplant.sysj line: 48, column: 6
                  currsigs.addElement(tempHotE);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S6645=1;
                  if(((int)tempOut_thread_2.get(i_thread_2) == 2) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 50, column: 16
                    S6644=0;
                    tempColdE.setPresent();//sysj\ECSplant.sysj line: 51, column: 6
                    currsigs.addElement(tempColdE);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S6644=1;
                    tempOffE.setPresent();//sysj\ECSplant.sysj line: 54, column: 6
                    currsigs.addElement(tempOffE);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                ends[2]=2;
                ;//sysj\ECSplant.sysj line: 15, column: 2
                S6594=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              updatep.setPresent();//sysj\ECSplant.sysj line: 36, column: 5
              currsigs.addElement(updatep);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 10 : 
            switch(S6657){
              case 0 : 
                switch(S6645){
                  case 0 : 
                    if(!tempHotE.getprestatus()){//sysj\ECSplant.sysj line: 49, column: 12
                      S6657=1;
                      if(((int)humidityOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 57, column: 9
                        S6668=0;
                        humidityIncE.setPresent();//sysj\ECSplant.sysj line: 58, column: 6
                        currsigs.addElement(humidityIncE);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S6668=1;
                        if(((int)humidityOut_thread_2.get(i_thread_2) == 2) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 60, column: 16
                          S6667=0;
                          humidityRedE.setPresent();//sysj\ECSplant.sysj line: 61, column: 6
                          currsigs.addElement(humidityRedE);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S6667=1;
                          humidityOffE.setPresent();//sysj\ECSplant.sysj line: 64, column: 6
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
                    switch(S6644){
                      case 0 : 
                        if(!tempColdE.getprestatus()){//sysj\ECSplant.sysj line: 52, column: 12
                          S6657=1;
                          if(((int)humidityOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 57, column: 9
                            S6668=0;
                            humidityIncE.setPresent();//sysj\ECSplant.sysj line: 58, column: 6
                            currsigs.addElement(humidityIncE);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S6668=1;
                            if(((int)humidityOut_thread_2.get(i_thread_2) == 2) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 60, column: 16
                              S6667=0;
                              humidityRedE.setPresent();//sysj\ECSplant.sysj line: 61, column: 6
                              currsigs.addElement(humidityRedE);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S6667=1;
                              humidityOffE.setPresent();//sysj\ECSplant.sysj line: 64, column: 6
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
                        if(!tempOffE.getprestatus()){//sysj\ECSplant.sysj line: 55, column: 12
                          S6657=1;
                          if(((int)humidityOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 57, column: 9
                            S6668=0;
                            humidityIncE.setPresent();//sysj\ECSplant.sysj line: 58, column: 6
                            currsigs.addElement(humidityIncE);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S6668=1;
                            if(((int)humidityOut_thread_2.get(i_thread_2) == 2) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 60, column: 16
                              S6667=0;
                              humidityRedE.setPresent();//sysj\ECSplant.sysj line: 61, column: 6
                              currsigs.addElement(humidityRedE);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S6667=1;
                              humidityOffE.setPresent();//sysj\ECSplant.sysj line: 64, column: 6
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
                switch(S6668){
                  case 0 : 
                    if(!humidityIncE.getprestatus()){//sysj\ECSplant.sysj line: 59, column: 12
                      S6657=2;
                      if(((int)lightOut_thread_2.get(i_thread_2) > 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 67, column: 9
                        S6708=0;
                        lightOnE.setPresent();//sysj\ECSplant.sysj line: 68, column: 6
                        currsigs.addElement(lightOnE);
                        lightOnE.setValue(lightOut_thread_2.get(i_thread_2));//sysj\ECSplant.sysj line: 68, column: 6
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S6708=1;
                        lightOffE.setPresent();//sysj\ECSplant.sysj line: 71, column: 6
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
                    switch(S6667){
                      case 0 : 
                        if(!humidityRedE.getprestatus()){//sysj\ECSplant.sysj line: 62, column: 12
                          S6657=2;
                          if(((int)lightOut_thread_2.get(i_thread_2) > 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 67, column: 9
                            S6708=0;
                            lightOnE.setPresent();//sysj\ECSplant.sysj line: 68, column: 6
                            currsigs.addElement(lightOnE);
                            lightOnE.setValue(lightOut_thread_2.get(i_thread_2));//sysj\ECSplant.sysj line: 68, column: 6
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S6708=1;
                            lightOffE.setPresent();//sysj\ECSplant.sysj line: 71, column: 6
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
                        if(!humidityOffE.getprestatus()){//sysj\ECSplant.sysj line: 65, column: 12
                          S6657=2;
                          if(((int)lightOut_thread_2.get(i_thread_2) > 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 67, column: 9
                            S6708=0;
                            lightOnE.setPresent();//sysj\ECSplant.sysj line: 68, column: 6
                            currsigs.addElement(lightOnE);
                            lightOnE.setValue(lightOut_thread_2.get(i_thread_2));//sysj\ECSplant.sysj line: 68, column: 6
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S6708=1;
                            lightOffE.setPresent();//sysj\ECSplant.sysj line: 71, column: 6
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
                switch(S6708){
                  case 0 : 
                    if(!lightOnE.getprestatus()){//sysj\ECSplant.sysj line: 69, column: 12
                      S6657=3;
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
                    if(!lightOffE.getprestatus()){//sysj\ECSplant.sysj line: 72, column: 12
                      S6657=3;
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
                S6657=3;
                i_thread_2 = i_thread_2 + 1;//sysj\ECSplant.sysj line: 45, column: 26
                if(i_thread_2 < 7){//sysj\ECSplant.sysj line: 45, column: 19
                  States.CURR_ZONE = i_thread_2;//sysj\ECSplant.sysj line: 46, column: 5
                  S6657=0;
                  if(((int)tempOut_thread_2.get(i_thread_2) == 0) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 47, column: 9
                    S6645=0;
                    tempHotE.setPresent();//sysj\ECSplant.sysj line: 48, column: 6
                    currsigs.addElement(tempHotE);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S6645=1;
                    if(((int)tempOut_thread_2.get(i_thread_2) == 2) && (((Boolean)presence_thread_2.get(i_thread_2) == true) || ((int)closed_thread_2 == 0))){//sysj\ECSplant.sysj line: 50, column: 16
                      S6644=0;
                      tempColdE.setPresent();//sysj\ECSplant.sysj line: 51, column: 6
                      currsigs.addElement(tempColdE);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S6644=1;
                      tempOffE.setPresent();//sysj\ECSplant.sysj line: 54, column: 6
                      currsigs.addElement(tempOffE);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  ends[2]=2;
                  ;//sysj\ECSplant.sysj line: 15, column: 2
                  S6594=0;
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

  public void thread11729(int [] tdone, int [] ends){
        S9154=1;
    S9132=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread11728(int [] tdone, int [] ends){
        S9122=1;
    S6594=0;
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
      switch(S11726){
        case 0 : 
          S11726=0;
          break RUN;
        
        case 1 : 
          S11726=2;
          S11726=2;
          new Thread(new GUI()).start();//sysj\ECSplant.sysj line: 14, column: 2
          thread11728(tdone,ends);
          thread11729(tdone,ends);
          int biggest11730 = 0;
          if(ends[2]>=biggest11730){
            biggest11730=ends[2];
          }
          if(ends[3]>=biggest11730){
            biggest11730=ends[3];
          }
          if(biggest11730 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread11731(tdone,ends);
          thread11732(tdone,ends);
          int biggest11733 = 0;
          if(ends[2]>=biggest11733){
            biggest11733=ends[2];
          }
          if(ends[3]>=biggest11733){
            biggest11733=ends[3];
          }
          if(biggest11733 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest11733 == 0){
            S11726=0;
            active[1]=0;
            ends[1]=0;
            S11726=0;
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
