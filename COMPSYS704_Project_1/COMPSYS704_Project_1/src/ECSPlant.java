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
  private List tempOut_thread_76;//sysj\ABSplant.sysj line: 712, column: 4
  private List humidityOut_thread_76;//sysj\ABSplant.sysj line: 713, column: 4
  private List lightOut_thread_76;//sysj\ABSplant.sysj line: 714, column: 4
  private List presence_thread_76;//sysj\ABSplant.sysj line: 715, column: 4
  private int closed_thread_76;//sysj\ABSplant.sysj line: 716, column: 4
  private int i_thread_76;//sysj\ABSplant.sysj line: 717, column: 8
  private int smoke_thread_77;//sysj\ABSplant.sysj line: 759, column: 4
  private int S56929 = 1;
  private int S51789 = 1;
  private int S46725 = 1;
  private int S46788 = 1;
  private int S46776 = 1;
  private int S46775 = 1;
  private int S46799 = 1;
  private int S46798 = 1;
  private int S46839 = 1;
  private int S51821 = 1;
  private int S51799 = 1;
  
  private int[] ends = new int[96];
  private int[] tdone = new int[96];
  
  public void thread57361(int [] tdone, int [] ends){
        switch(S51821){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        switch(S51799){
          case 0 : 
            if(smokeState.getprestatus()){//sysj\ABSplant.sysj line: 755, column: 10
              S51799=1;
              updates.setPresent();//sysj\ABSplant.sysj line: 757, column: 5
              currsigs.addElement(updates);
              active[77]=1;
              ends[77]=1;
              tdone[77]=1;
            }
            else {
              active[77]=1;
              ends[77]=1;
              tdone[77]=1;
            }
            break;
          
          case 1 : 
            if(!smokeState.getprestatus()){//sysj\ABSplant.sysj line: 756, column: 10
              smoke_thread_77 = (smokeState.getpreval() == null ? 0 : ((Integer)smokeState.getpreval()).intValue());//sysj\ABSplant.sysj line: 759, column: 4
              if((int)smoke_thread_77 == 1) {//sysj\ABSplant.sysj line: 760, column: 25
                States.SMOKE_STATE = 1;//sysj\ABSplant.sysj line: 761, column: 5
              }
              else {//sysj\ABSplant.sysj line: 762, column: 11
                States.SMOKE_STATE = 0;//sysj\ABSplant.sysj line: 763, column: 5
              }
              S51799=0;
              active[77]=1;
              ends[77]=1;
              tdone[77]=1;
            }
            else {
              updates.setPresent();//sysj\ABSplant.sysj line: 757, column: 5
              currsigs.addElement(updates);
              active[77]=1;
              ends[77]=1;
              tdone[77]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57360(int [] tdone, int [] ends){
        switch(S51789){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        switch(S46725){
          case 0 : 
            if(tempState.getprestatus()){//sysj\ABSplant.sysj line: 690, column: 10
              S46725=1;
              updatep.setPresent();//sysj\ABSplant.sysj line: 692, column: 5
              currsigs.addElement(updatep);
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            else {
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 1 : 
            if(!tempState.getprestatus()){//sysj\ABSplant.sysj line: 691, column: 10
              S46725=2;
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            else {
              updatep.setPresent();//sysj\ABSplant.sysj line: 692, column: 5
              currsigs.addElement(updatep);
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 2 : 
            if(humidityState.getprestatus()){//sysj\ABSplant.sysj line: 694, column: 10
              S46725=3;
              updatep.setPresent();//sysj\ABSplant.sysj line: 696, column: 5
              currsigs.addElement(updatep);
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            else {
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 3 : 
            if(!humidityState.getprestatus()){//sysj\ABSplant.sysj line: 695, column: 10
              S46725=4;
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            else {
              updatep.setPresent();//sysj\ABSplant.sysj line: 696, column: 5
              currsigs.addElement(updatep);
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 4 : 
            if(lightState.getprestatus()){//sysj\ABSplant.sysj line: 698, column: 10
              S46725=5;
              updatep.setPresent();//sysj\ABSplant.sysj line: 700, column: 5
              currsigs.addElement(updatep);
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            else {
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 5 : 
            if(!lightState.getprestatus()){//sysj\ABSplant.sysj line: 699, column: 10
              S46725=6;
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            else {
              updatep.setPresent();//sysj\ABSplant.sysj line: 700, column: 5
              currsigs.addElement(updatep);
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 6 : 
            if(presenceState.getprestatus()){//sysj\ABSplant.sysj line: 702, column: 10
              S46725=7;
              updatep.setPresent();//sysj\ABSplant.sysj line: 704, column: 5
              currsigs.addElement(updatep);
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            else {
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 7 : 
            if(!presenceState.getprestatus()){//sysj\ABSplant.sysj line: 703, column: 10
              S46725=8;
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            else {
              updatep.setPresent();//sysj\ABSplant.sysj line: 704, column: 5
              currsigs.addElement(updatep);
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 8 : 
            if(closedState.getprestatus()){//sysj\ABSplant.sysj line: 706, column: 10
              S46725=9;
              updatep.setPresent();//sysj\ABSplant.sysj line: 708, column: 5
              currsigs.addElement(updatep);
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            else {
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 9 : 
            if(!closedState.getprestatus()){//sysj\ABSplant.sysj line: 707, column: 10
              tempOut_thread_76 = (tempState.getpreval() == null ? null : ((List)tempState.getpreval()));//sysj\ABSplant.sysj line: 712, column: 4
              humidityOut_thread_76 = (humidityState.getpreval() == null ? null : ((List)humidityState.getpreval()));//sysj\ABSplant.sysj line: 713, column: 4
              lightOut_thread_76 = (lightState.getpreval() == null ? null : ((List)lightState.getpreval()));//sysj\ABSplant.sysj line: 714, column: 4
              presence_thread_76 = (presenceState.getpreval() == null ? null : ((List)presenceState.getpreval()));//sysj\ABSplant.sysj line: 715, column: 4
              closed_thread_76 = (closedState.getpreval() == null ? 0 : ((Integer)closedState.getpreval()).intValue());//sysj\ABSplant.sysj line: 716, column: 4
              i_thread_76 = 0;//sysj\ABSplant.sysj line: 717, column: 8
              S46725=10;
              if(i_thread_76 < 7){//sysj\ABSplant.sysj line: 717, column: 19
                States.CURR_ZONE = i_thread_76;//sysj\ABSplant.sysj line: 718, column: 5
                S46788=0;
                if(((int)tempOut_thread_76.get(i_thread_76) == 0) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 719, column: 9
                  S46776=0;
                  tempHotE.setPresent();//sysj\ABSplant.sysj line: 720, column: 6
                  currsigs.addElement(tempHotE);
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                else {
                  S46776=1;
                  if(((int)tempOut_thread_76.get(i_thread_76) == 2) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 722, column: 16
                    S46775=0;
                    tempColdE.setPresent();//sysj\ABSplant.sysj line: 723, column: 6
                    currsigs.addElement(tempColdE);
                    active[76]=1;
                    ends[76]=1;
                    tdone[76]=1;
                  }
                  else {
                    S46775=1;
                    tempOffE.setPresent();//sysj\ABSplant.sysj line: 726, column: 6
                    currsigs.addElement(tempOffE);
                    active[76]=1;
                    ends[76]=1;
                    tdone[76]=1;
                  }
                }
              }
              else {
                ends[76]=2;
                ;//sysj\ABSplant.sysj line: 686, column: 2
                S46725=0;
                active[76]=1;
                ends[76]=1;
                tdone[76]=1;
              }
            }
            else {
              updatep.setPresent();//sysj\ABSplant.sysj line: 708, column: 5
              currsigs.addElement(updatep);
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 10 : 
            switch(S46788){
              case 0 : 
                switch(S46776){
                  case 0 : 
                    if(!tempHotE.getprestatus()){//sysj\ABSplant.sysj line: 721, column: 12
                      S46788=1;
                      if(((int)humidityOut_thread_76.get(i_thread_76) == 0) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 729, column: 9
                        S46799=0;
                        humidityIncE.setPresent();//sysj\ABSplant.sysj line: 730, column: 6
                        currsigs.addElement(humidityIncE);
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      else {
                        S46799=1;
                        if(((int)humidityOut_thread_76.get(i_thread_76) == 2) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 732, column: 16
                          S46798=0;
                          humidityRedE.setPresent();//sysj\ABSplant.sysj line: 733, column: 6
                          currsigs.addElement(humidityRedE);
                          active[76]=1;
                          ends[76]=1;
                          tdone[76]=1;
                        }
                        else {
                          S46798=1;
                          humidityOffE.setPresent();//sysj\ABSplant.sysj line: 736, column: 6
                          currsigs.addElement(humidityOffE);
                          active[76]=1;
                          ends[76]=1;
                          tdone[76]=1;
                        }
                      }
                    }
                    else {
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    break;
                  
                  case 1 : 
                    switch(S46775){
                      case 0 : 
                        if(!tempColdE.getprestatus()){//sysj\ABSplant.sysj line: 724, column: 12
                          S46788=1;
                          if(((int)humidityOut_thread_76.get(i_thread_76) == 0) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 729, column: 9
                            S46799=0;
                            humidityIncE.setPresent();//sysj\ABSplant.sysj line: 730, column: 6
                            currsigs.addElement(humidityIncE);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            S46799=1;
                            if(((int)humidityOut_thread_76.get(i_thread_76) == 2) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 732, column: 16
                              S46798=0;
                              humidityRedE.setPresent();//sysj\ABSplant.sysj line: 733, column: 6
                              currsigs.addElement(humidityRedE);
                              active[76]=1;
                              ends[76]=1;
                              tdone[76]=1;
                            }
                            else {
                              S46798=1;
                              humidityOffE.setPresent();//sysj\ABSplant.sysj line: 736, column: 6
                              currsigs.addElement(humidityOffE);
                              active[76]=1;
                              ends[76]=1;
                              tdone[76]=1;
                            }
                          }
                        }
                        else {
                          active[76]=1;
                          ends[76]=1;
                          tdone[76]=1;
                        }
                        break;
                      
                      case 1 : 
                        if(!tempOffE.getprestatus()){//sysj\ABSplant.sysj line: 727, column: 12
                          S46788=1;
                          if(((int)humidityOut_thread_76.get(i_thread_76) == 0) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 729, column: 9
                            S46799=0;
                            humidityIncE.setPresent();//sysj\ABSplant.sysj line: 730, column: 6
                            currsigs.addElement(humidityIncE);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            S46799=1;
                            if(((int)humidityOut_thread_76.get(i_thread_76) == 2) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 732, column: 16
                              S46798=0;
                              humidityRedE.setPresent();//sysj\ABSplant.sysj line: 733, column: 6
                              currsigs.addElement(humidityRedE);
                              active[76]=1;
                              ends[76]=1;
                              tdone[76]=1;
                            }
                            else {
                              S46798=1;
                              humidityOffE.setPresent();//sysj\ABSplant.sysj line: 736, column: 6
                              currsigs.addElement(humidityOffE);
                              active[76]=1;
                              ends[76]=1;
                              tdone[76]=1;
                            }
                          }
                        }
                        else {
                          active[76]=1;
                          ends[76]=1;
                          tdone[76]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S46799){
                  case 0 : 
                    if(!humidityIncE.getprestatus()){//sysj\ABSplant.sysj line: 731, column: 12
                      S46788=2;
                      if(((int)lightOut_thread_76.get(i_thread_76) > 0) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 739, column: 9
                        S46839=0;
                        lightOnE.setPresent();//sysj\ABSplant.sysj line: 740, column: 6
                        currsigs.addElement(lightOnE);
                        lightOnE.setValue(lightOut_thread_76.get(i_thread_76));//sysj\ABSplant.sysj line: 740, column: 6
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                      else {
                        S46839=1;
                        lightOffE.setPresent();//sysj\ABSplant.sysj line: 743, column: 6
                        currsigs.addElement(lightOffE);
                        active[76]=1;
                        ends[76]=1;
                        tdone[76]=1;
                      }
                    }
                    else {
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    break;
                  
                  case 1 : 
                    switch(S46798){
                      case 0 : 
                        if(!humidityRedE.getprestatus()){//sysj\ABSplant.sysj line: 734, column: 12
                          S46788=2;
                          if(((int)lightOut_thread_76.get(i_thread_76) > 0) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 739, column: 9
                            S46839=0;
                            lightOnE.setPresent();//sysj\ABSplant.sysj line: 740, column: 6
                            currsigs.addElement(lightOnE);
                            lightOnE.setValue(lightOut_thread_76.get(i_thread_76));//sysj\ABSplant.sysj line: 740, column: 6
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            S46839=1;
                            lightOffE.setPresent();//sysj\ABSplant.sysj line: 743, column: 6
                            currsigs.addElement(lightOffE);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                        }
                        else {
                          active[76]=1;
                          ends[76]=1;
                          tdone[76]=1;
                        }
                        break;
                      
                      case 1 : 
                        if(!humidityOffE.getprestatus()){//sysj\ABSplant.sysj line: 737, column: 12
                          S46788=2;
                          if(((int)lightOut_thread_76.get(i_thread_76) > 0) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 739, column: 9
                            S46839=0;
                            lightOnE.setPresent();//sysj\ABSplant.sysj line: 740, column: 6
                            currsigs.addElement(lightOnE);
                            lightOnE.setValue(lightOut_thread_76.get(i_thread_76));//sysj\ABSplant.sysj line: 740, column: 6
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                          else {
                            S46839=1;
                            lightOffE.setPresent();//sysj\ABSplant.sysj line: 743, column: 6
                            currsigs.addElement(lightOffE);
                            active[76]=1;
                            ends[76]=1;
                            tdone[76]=1;
                          }
                        }
                        else {
                          active[76]=1;
                          ends[76]=1;
                          tdone[76]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                switch(S46839){
                  case 0 : 
                    if(!lightOnE.getprestatus()){//sysj\ABSplant.sysj line: 741, column: 12
                      S46788=3;
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    else {
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(!lightOffE.getprestatus()){//sysj\ABSplant.sysj line: 744, column: 12
                      S46788=3;
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    else {
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    break;
                  
                }
                break;
              
              case 3 : 
                S46788=3;
                i_thread_76 = i_thread_76 + 1;//sysj\ABSplant.sysj line: 717, column: 26
                if(i_thread_76 < 7){//sysj\ABSplant.sysj line: 717, column: 19
                  States.CURR_ZONE = i_thread_76;//sysj\ABSplant.sysj line: 718, column: 5
                  S46788=0;
                  if(((int)tempOut_thread_76.get(i_thread_76) == 0) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 719, column: 9
                    S46776=0;
                    tempHotE.setPresent();//sysj\ABSplant.sysj line: 720, column: 6
                    currsigs.addElement(tempHotE);
                    active[76]=1;
                    ends[76]=1;
                    tdone[76]=1;
                  }
                  else {
                    S46776=1;
                    if(((int)tempOut_thread_76.get(i_thread_76) == 2) && (((Boolean)presence_thread_76.get(i_thread_76) == true) || ((int)closed_thread_76 == 0))){//sysj\ABSplant.sysj line: 722, column: 16
                      S46775=0;
                      tempColdE.setPresent();//sysj\ABSplant.sysj line: 723, column: 6
                      currsigs.addElement(tempColdE);
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                    else {
                      S46775=1;
                      tempOffE.setPresent();//sysj\ABSplant.sysj line: 726, column: 6
                      currsigs.addElement(tempOffE);
                      active[76]=1;
                      ends[76]=1;
                      tdone[76]=1;
                    }
                  }
                }
                else {
                  ends[76]=2;
                  ;//sysj\ABSplant.sysj line: 686, column: 2
                  S46725=0;
                  active[76]=1;
                  ends[76]=1;
                  tdone[76]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57358(int [] tdone, int [] ends){
        S51821=1;
    S51799=0;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread57357(int [] tdone, int [] ends){
        S51789=1;
    System.out.println("ECSPlant");//sysj\ABSplant.sysj line: 687, column: 3
    S46725=0;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S56929){
        case 0 : 
          S56929=0;
          break RUN;
        
        case 1 : 
          S56929=2;
          S56929=2;
          new Thread(new GUI()).start();//sysj\ABSplant.sysj line: 685, column: 2
          thread57357(tdone,ends);
          thread57358(tdone,ends);
          int biggest57359 = 0;
          if(ends[76]>=biggest57359){
            biggest57359=ends[76];
          }
          if(ends[77]>=biggest57359){
            biggest57359=ends[77];
          }
          if(biggest57359 == 1){
            active[75]=1;
            ends[75]=1;
            break RUN;
          }
        
        case 2 : 
          thread57360(tdone,ends);
          thread57361(tdone,ends);
          int biggest57362 = 0;
          if(ends[76]>=biggest57362){
            biggest57362=ends[76];
          }
          if(ends[77]>=biggest57362){
            biggest57362=ends[77];
          }
          if(biggest57362 == 1){
            active[75]=1;
            ends[75]=1;
            break RUN;
          }
          //FINXME code
          if(biggest57362 == 0){
            S56929=0;
            active[75]=0;
            ends[75]=0;
            S56929=0;
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
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[75] != 0){
      int index = 75;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[75]!=0 || suspended[75]!=0 || active[75]!=1);
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
      if(paused[75]!=0 || suspended[75]!=0 || active[75]!=1);
      else{
        tempState.gethook();
        humidityState.gethook();
        lightState.gethook();
        presenceState.gethook();
        smokeState.gethook();
        closedState.gethook();
      }
      runFinisher();
      if(active[75] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
