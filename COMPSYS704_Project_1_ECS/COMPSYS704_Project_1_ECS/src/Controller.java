import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\controller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\controller.sysj line: 2, column: 1

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal update = new Signal("update", Signal.INPUT);
  public Signal updatep = new Signal("updatep", Signal.INPUT);
  public Signal updates = new Signal("updates", Signal.INPUT);
  public Signal time = new Signal("time", Signal.INPUT);
  public Signal SIGNAL_Z1_TEMP = new Signal("SIGNAL_Z1_TEMP", Signal.INPUT);
  public Signal SIGNAL_Z2_TEMP = new Signal("SIGNAL_Z2_TEMP", Signal.INPUT);
  public Signal SIGNAL_Z3_TEMP = new Signal("SIGNAL_Z3_TEMP", Signal.INPUT);
  public Signal SIGNAL_Z4_TEMP = new Signal("SIGNAL_Z4_TEMP", Signal.INPUT);
  public Signal SIGNAL_Z5_TEMP = new Signal("SIGNAL_Z5_TEMP", Signal.INPUT);
  public Signal SIGNAL_Z6_TEMP = new Signal("SIGNAL_Z6_TEMP", Signal.INPUT);
  public Signal SIGNAL_Z7_TEMP = new Signal("SIGNAL_Z7_TEMP", Signal.INPUT);
  public Signal SIGNAL_Z1_HUMIDITY = new Signal("SIGNAL_Z1_HUMIDITY", Signal.INPUT);
  public Signal SIGNAL_Z2_HUMIDITY = new Signal("SIGNAL_Z2_HUMIDITY", Signal.INPUT);
  public Signal SIGNAL_Z3_HUMIDITY = new Signal("SIGNAL_Z3_HUMIDITY", Signal.INPUT);
  public Signal SIGNAL_Z4_HUMIDITY = new Signal("SIGNAL_Z4_HUMIDITY", Signal.INPUT);
  public Signal SIGNAL_Z5_HUMIDITY = new Signal("SIGNAL_Z5_HUMIDITY", Signal.INPUT);
  public Signal SIGNAL_Z6_HUMIDITY = new Signal("SIGNAL_Z6_HUMIDITY", Signal.INPUT);
  public Signal SIGNAL_Z7_HUMIDITY = new Signal("SIGNAL_Z7_HUMIDITY", Signal.INPUT);
  public Signal SIGNAL_Z1_LIGHT = new Signal("SIGNAL_Z1_LIGHT", Signal.INPUT);
  public Signal SIGNAL_Z2_LIGHT = new Signal("SIGNAL_Z2_LIGHT", Signal.INPUT);
  public Signal SIGNAL_Z3_LIGHT = new Signal("SIGNAL_Z3_LIGHT", Signal.INPUT);
  public Signal SIGNAL_Z4_LIGHT = new Signal("SIGNAL_Z4_LIGHT", Signal.INPUT);
  public Signal SIGNAL_Z5_LIGHT = new Signal("SIGNAL_Z5_LIGHT", Signal.INPUT);
  public Signal SIGNAL_Z6_LIGHT = new Signal("SIGNAL_Z6_LIGHT", Signal.INPUT);
  public Signal SIGNAL_Z7_LIGHT = new Signal("SIGNAL_Z7_LIGHT", Signal.INPUT);
  public Signal SIGNAL_Z1_SMOKE = new Signal("SIGNAL_Z1_SMOKE", Signal.INPUT);
  public Signal SIGNAL_Z2_SMOKE = new Signal("SIGNAL_Z2_SMOKE", Signal.INPUT);
  public Signal SIGNAL_Z3_SMOKE = new Signal("SIGNAL_Z3_SMOKE", Signal.INPUT);
  public Signal SIGNAL_Z4_SMOKE = new Signal("SIGNAL_Z4_SMOKE", Signal.INPUT);
  public Signal SIGNAL_Z5_SMOKE = new Signal("SIGNAL_Z5_SMOKE", Signal.INPUT);
  public Signal SIGNAL_Z6_SMOKE = new Signal("SIGNAL_Z6_SMOKE", Signal.INPUT);
  public Signal SIGNAL_Z7_SMOKE = new Signal("SIGNAL_Z7_SMOKE", Signal.INPUT);
  public Signal SIGNAL_Z1_PRESENCE = new Signal("SIGNAL_Z1_PRESENCE", Signal.INPUT);
  public Signal SIGNAL_Z2_PRESENCE = new Signal("SIGNAL_Z2_PRESENCE", Signal.INPUT);
  public Signal SIGNAL_Z3_PRESENCE = new Signal("SIGNAL_Z3_PRESENCE", Signal.INPUT);
  public Signal SIGNAL_Z4_PRESENCE = new Signal("SIGNAL_Z4_PRESENCE", Signal.INPUT);
  public Signal SIGNAL_Z5_PRESENCE = new Signal("SIGNAL_Z5_PRESENCE", Signal.INPUT);
  public Signal SIGNAL_Z6_PRESENCE = new Signal("SIGNAL_Z6_PRESENCE", Signal.INPUT);
  public Signal SIGNAL_Z7_PRESENCE = new Signal("SIGNAL_Z7_PRESENCE", Signal.INPUT);
  public Signal tempState = new Signal("tempState", Signal.OUTPUT);
  public Signal humidityState = new Signal("humidityState", Signal.OUTPUT);
  public Signal lightState = new Signal("lightState", Signal.OUTPUT);
  public Signal presenceState = new Signal("presenceState", Signal.OUTPUT);
  public Signal smokeState = new Signal("smokeState", Signal.OUTPUT);
  public Signal closedState = new Signal("closedState", Signal.OUTPUT);
  private int setSmoke_thread_3;//sysj\controller.sysj line: 128, column: 4
  private List setTemp_thread_2;//sysj\controller.sysj line: 44, column: 5
  private List setHumidity_thread_2;//sysj\controller.sysj line: 45, column: 5
  private List setLight_thread_2;//sysj\controller.sysj line: 46, column: 5
  private List setPresence_thread_2;//sysj\controller.sysj line: 47, column: 5
  private String timeString_thread_2;//sysj\controller.sysj line: 48, column: 5
  private int setClosed_thread_2;//sysj\controller.sysj line: 49, column: 5
  private int j_thread_2;//sysj\controller.sysj line: 52, column: 5
  private int S6565 = 1;
  private int S2089 = 1;
  private int S3 = 1;
  private int S2187 = 1;
  private int S2103 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread6574(int [] tdone, int [] ends){
        S2187=1;
        if(SIGNAL_Z1_SMOKE.getprestatus() || SIGNAL_Z2_SMOKE.getprestatus() || SIGNAL_Z3_SMOKE.getprestatus() || SIGNAL_Z4_SMOKE.getprestatus() || SIGNAL_Z5_SMOKE.getprestatus() || SIGNAL_Z6_SMOKE.getprestatus() || SIGNAL_Z7_SMOKE.getprestatus()){//sysj\controller.sysj line: 131, column: 13
      setSmoke_thread_3 = 1;//sysj\controller.sysj line: 132, column: 6
      S2103=0;
      smokeState.setPresent();//sysj\controller.sysj line: 139, column: 7
      currsigs.addElement(smokeState);
      smokeState.setValue(setSmoke_thread_3);//sysj\controller.sysj line: 139, column: 7
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      setSmoke_thread_3 = 0;//sysj\controller.sysj line: 134, column: 6
      S2103=0;
      smokeState.setPresent();//sysj\controller.sysj line: 139, column: 7
      currsigs.addElement(smokeState);
      smokeState.setValue(setSmoke_thread_3);//sysj\controller.sysj line: 139, column: 7
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread6573(int [] tdone, int [] ends){
        S2089=1;
    S3=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread6571(int [] tdone, int [] ends){
        switch(S2187){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2103){
          case 0 : 
            if(updates.getprestatus()){//sysj\controller.sysj line: 138, column: 11
              S2103=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              smokeState.setPresent();//sysj\controller.sysj line: 139, column: 7
              currsigs.addElement(smokeState);
              smokeState.setValue(setSmoke_thread_3);//sysj\controller.sysj line: 139, column: 7
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!updates.getprestatus()){//sysj\controller.sysj line: 141, column: 11
              if(SIGNAL_Z1_SMOKE.getprestatus() || SIGNAL_Z2_SMOKE.getprestatus() || SIGNAL_Z3_SMOKE.getprestatus() || SIGNAL_Z4_SMOKE.getprestatus() || SIGNAL_Z5_SMOKE.getprestatus() || SIGNAL_Z6_SMOKE.getprestatus() || SIGNAL_Z7_SMOKE.getprestatus()){//sysj\controller.sysj line: 131, column: 13
                setSmoke_thread_3 = 1;//sysj\controller.sysj line: 132, column: 6
                S2103=0;
                smokeState.setPresent();//sysj\controller.sysj line: 139, column: 7
                currsigs.addElement(smokeState);
                smokeState.setValue(setSmoke_thread_3);//sysj\controller.sysj line: 139, column: 7
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                setSmoke_thread_3 = 0;//sysj\controller.sysj line: 134, column: 6
                S2103=0;
                smokeState.setPresent();//sysj\controller.sysj line: 139, column: 7
                currsigs.addElement(smokeState);
                smokeState.setValue(setSmoke_thread_3);//sysj\controller.sysj line: 139, column: 7
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
          
        }
        break;
      
    }
  }

  public void thread6570(int [] tdone, int [] ends){
        switch(S2089){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3){
          case 0 : 
            if(update.getprestatus()){//sysj\controller.sysj line: 41, column: 11
              S3=1;
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
            if(!update.getprestatus()){//sysj\controller.sysj line: 42, column: 11
              setTemp_thread_2 = Arrays.asList((SIGNAL_Z1_TEMP.getpreval() == null ? 0 : ((Integer)SIGNAL_Z1_TEMP.getpreval()).intValue()), (SIGNAL_Z2_TEMP.getpreval() == null ? 0 : ((Integer)SIGNAL_Z2_TEMP.getpreval()).intValue()), (SIGNAL_Z3_TEMP.getpreval() == null ? 0 : ((Integer)SIGNAL_Z3_TEMP.getpreval()).intValue()), (SIGNAL_Z4_TEMP.getpreval() == null ? 0 : ((Integer)SIGNAL_Z4_TEMP.getpreval()).intValue()), (SIGNAL_Z5_TEMP.getpreval() == null ? 0 : ((Integer)SIGNAL_Z5_TEMP.getpreval()).intValue()), (SIGNAL_Z6_TEMP.getpreval() == null ? 0 : ((Integer)SIGNAL_Z6_TEMP.getpreval()).intValue()), (SIGNAL_Z7_TEMP.getpreval() == null ? 0 : ((Integer)SIGNAL_Z7_TEMP.getpreval()).intValue()));//sysj\controller.sysj line: 44, column: 5
              setHumidity_thread_2 = Arrays.asList((SIGNAL_Z1_HUMIDITY.getpreval() == null ? 0 : ((Integer)SIGNAL_Z1_HUMIDITY.getpreval()).intValue()), (SIGNAL_Z2_HUMIDITY.getpreval() == null ? 0 : ((Integer)SIGNAL_Z2_HUMIDITY.getpreval()).intValue()), (SIGNAL_Z3_HUMIDITY.getpreval() == null ? 0 : ((Integer)SIGNAL_Z3_HUMIDITY.getpreval()).intValue()), (SIGNAL_Z4_HUMIDITY.getpreval() == null ? 0 : ((Integer)SIGNAL_Z4_HUMIDITY.getpreval()).intValue()), (SIGNAL_Z5_HUMIDITY.getpreval() == null ? 0 : ((Integer)SIGNAL_Z5_HUMIDITY.getpreval()).intValue()), (SIGNAL_Z6_HUMIDITY.getpreval() == null ? 0 : ((Integer)SIGNAL_Z6_HUMIDITY.getpreval()).intValue()), (SIGNAL_Z7_HUMIDITY.getpreval() == null ? 0 : ((Integer)SIGNAL_Z7_HUMIDITY.getpreval()).intValue()));//sysj\controller.sysj line: 45, column: 5
              setLight_thread_2 = Arrays.asList((SIGNAL_Z1_LIGHT.getpreval() == null ? 0 : ((Integer)SIGNAL_Z1_LIGHT.getpreval()).intValue()), (SIGNAL_Z2_LIGHT.getpreval() == null ? 0 : ((Integer)SIGNAL_Z2_LIGHT.getpreval()).intValue()), (SIGNAL_Z3_LIGHT.getpreval() == null ? 0 : ((Integer)SIGNAL_Z3_LIGHT.getpreval()).intValue()), (SIGNAL_Z4_LIGHT.getpreval() == null ? 0 : ((Integer)SIGNAL_Z4_LIGHT.getpreval()).intValue()), (SIGNAL_Z5_LIGHT.getpreval() == null ? 0 : ((Integer)SIGNAL_Z5_LIGHT.getpreval()).intValue()), (SIGNAL_Z6_LIGHT.getpreval() == null ? 0 : ((Integer)SIGNAL_Z6_LIGHT.getpreval()).intValue()), (SIGNAL_Z7_LIGHT.getpreval() == null ? 0 : ((Integer)SIGNAL_Z7_LIGHT.getpreval()).intValue()));//sysj\controller.sysj line: 46, column: 5
              setPresence_thread_2 = Arrays.asList(false, false, false, false, false, false, false);//sysj\controller.sysj line: 47, column: 5
              timeString_thread_2 = (time.getpreval() == null ? null : ((String)time.getpreval()));//sysj\controller.sysj line: 48, column: 5
              setClosed_thread_2 = 0;//sysj\controller.sysj line: 49, column: 5
              j_thread_2 = 0;//sysj\controller.sysj line: 52, column: 5
              for(int i_thread_2 = 0; i_thread_2 < setTemp_thread_2.size(); i_thread_2 = i_thread_2 + 1) {//sysj\controller.sysj line: 53, column: 46
                if((i_thread_2 == 0) || (i_thread_2 == 6)) {//sysj\controller.sysj line: 55, column: 33
                  j_thread_2 = 0;//sysj\controller.sysj line: 55, column: 35
                }
                else {//sysj\controller.sysj line: 55, column: 6
                  if((i_thread_2 == 1) || (i_thread_2 == 2)) {//sysj\controller.sysj line: 56, column: 38
                    j_thread_2 = 2;//sysj\controller.sysj line: 56, column: 40
                  }
                  else {//sysj\controller.sysj line: 57, column: 18
                    j_thread_2 = 4;//sysj\controller.sysj line: 57, column: 20
                  }
                }
                if((int)setTemp_thread_2.get(i_thread_2) < (int)Labels.envcond.get(j_thread_2)) {//sysj\controller.sysj line: 62, column: 65
                  setTemp_thread_2.set(i_thread_2, 0);//sysj\controller.sysj line: 62, column: 67
                }
                else {//sysj\controller.sysj line: 62, column: 6
                  if((int)setTemp_thread_2.get(i_thread_2) > (int)Labels.envcond.get(j_thread_2 + 1)) {//sysj\controller.sysj line: 63, column: 70
                    setTemp_thread_2.set(i_thread_2, 2);//sysj\controller.sysj line: 63, column: 72
                  }
                  else {//sysj\controller.sysj line: 64, column: 26
                    setTemp_thread_2.set(i_thread_2, 1);//sysj\controller.sysj line: 64, column: 28
                  }
                }
                if((int)setHumidity_thread_2.get(i_thread_2) < (int)Labels.envcond.get(6 + j_thread_2)) {//sysj\controller.sysj line: 69, column: 68
                  setHumidity_thread_2.set(i_thread_2, 0);//sysj\controller.sysj line: 69, column: 70
                }
                else {//sysj\controller.sysj line: 69, column: 6
                  if((int)setHumidity_thread_2.get(i_thread_2) > (int)Labels.envcond.get(6 + j_thread_2 + 1)) {//sysj\controller.sysj line: 70, column: 74
                    setHumidity_thread_2.set(i_thread_2, 2);//sysj\controller.sysj line: 70, column: 76
                  }
                  else {//sysj\controller.sysj line: 71, column: 27
                    setHumidity_thread_2.set(i_thread_2, 1);//sysj\controller.sysj line: 71, column: 29
                  }
                }
                if((int)setLight_thread_2.get(i_thread_2) < (int)Labels.envcond.get(12 + (j_thread_2 / 2))) {//sysj\controller.sysj line: 75, column: 69
                  setLight_thread_2.set(i_thread_2, ((int)Labels.envcond.get(12 + (j_thread_2 / 2)) - (int)setLight_thread_2.get(i_thread_2)));//sysj\controller.sysj line: 75, column: 71
                }
                else {//sysj\controller.sysj line: 76, column: 26
                  setLight_thread_2.set(i_thread_2, 0);//sysj\controller.sysj line: 76, column: 28
                }
              }
              if((Integer.parseInt(timeString_thread_2.substring(0, 2)) < (int)Labels.envcond.get(15)) || (Integer.parseInt(timeString_thread_2.substring(0, 2)) > (int)Labels.envcond.get(17))) {//sysj\controller.sysj line: 82, column: 88
                setClosed_thread_2 = 1;//sysj\controller.sysj line: 83, column: 6
              }
              else {//sysj\controller.sysj line: 81, column: 5
                if((Integer.parseInt(timeString_thread_2.substring(0, 2)) == (int)Labels.envcond.get(15)) && ((Integer.parseInt(timeString_thread_2.substring(3, 5)) < (int)Labels.envcond.get(16))) || ((Integer.parseInt(timeString_thread_2.substring(0, 2)) == (int)Labels.envcond.get(17)) && (Integer.parseInt(timeString_thread_2.substring(3, 5)) > (int)Labels.envcond.get(18)))) {//sysj\controller.sysj line: 85, column: 171
                  setClosed_thread_2 = 1;//sysj\controller.sysj line: 86, column: 6
                }
                else {//sysj\controller.sysj line: 87, column: 12
                  setClosed_thread_2 = 0;//sysj\controller.sysj line: 88, column: 6
                }
              }
              S3=2;
              if(SIGNAL_Z1_PRESENCE.getprestatus()){//sysj\controller.sysj line: 93, column: 13
                setPresence_thread_2.set(0, true);//sysj\controller.sysj line: 93, column: 35
                if(SIGNAL_Z2_PRESENCE.getprestatus()){//sysj\controller.sysj line: 94, column: 13
                  setPresence_thread_2.set(1, true);//sysj\controller.sysj line: 94, column: 35
                  if(SIGNAL_Z3_PRESENCE.getprestatus()){//sysj\controller.sysj line: 95, column: 13
                    setPresence_thread_2.set(2, true);//sysj\controller.sysj line: 95, column: 35
                    if(SIGNAL_Z4_PRESENCE.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                      setPresence_thread_2.set(3, true);//sysj\controller.sysj line: 96, column: 35
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                  else {
                    if(SIGNAL_Z4_PRESENCE.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                      setPresence_thread_2.set(3, true);//sysj\controller.sysj line: 96, column: 35
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  if(SIGNAL_Z3_PRESENCE.getprestatus()){//sysj\controller.sysj line: 95, column: 13
                    setPresence_thread_2.set(2, true);//sysj\controller.sysj line: 95, column: 35
                    if(SIGNAL_Z4_PRESENCE.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                      setPresence_thread_2.set(3, true);//sysj\controller.sysj line: 96, column: 35
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                  else {
                    if(SIGNAL_Z4_PRESENCE.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                      setPresence_thread_2.set(3, true);//sysj\controller.sysj line: 96, column: 35
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                }
              }
              else {
                if(SIGNAL_Z2_PRESENCE.getprestatus()){//sysj\controller.sysj line: 94, column: 13
                  setPresence_thread_2.set(1, true);//sysj\controller.sysj line: 94, column: 35
                  if(SIGNAL_Z3_PRESENCE.getprestatus()){//sysj\controller.sysj line: 95, column: 13
                    setPresence_thread_2.set(2, true);//sysj\controller.sysj line: 95, column: 35
                    if(SIGNAL_Z4_PRESENCE.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                      setPresence_thread_2.set(3, true);//sysj\controller.sysj line: 96, column: 35
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                  else {
                    if(SIGNAL_Z4_PRESENCE.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                      setPresence_thread_2.set(3, true);//sysj\controller.sysj line: 96, column: 35
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  if(SIGNAL_Z3_PRESENCE.getprestatus()){//sysj\controller.sysj line: 95, column: 13
                    setPresence_thread_2.set(2, true);//sysj\controller.sysj line: 95, column: 35
                    if(SIGNAL_Z4_PRESENCE.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                      setPresence_thread_2.set(3, true);//sysj\controller.sysj line: 96, column: 35
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                  else {
                    if(SIGNAL_Z4_PRESENCE.getprestatus()){//sysj\controller.sysj line: 96, column: 13
                      setPresence_thread_2.set(3, true);//sysj\controller.sysj line: 96, column: 35
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(SIGNAL_Z5_PRESENCE.getprestatus()){//sysj\controller.sysj line: 97, column: 13
                        setPresence_thread_2.set(4, true);//sysj\controller.sysj line: 97, column: 35
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(SIGNAL_Z6_PRESENCE.getprestatus()){//sysj\controller.sysj line: 98, column: 13
                          setPresence_thread_2.set(5, true);//sysj\controller.sysj line: 98, column: 35
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(SIGNAL_Z7_PRESENCE.getprestatus()){//sysj\controller.sysj line: 99, column: 13
                            setPresence_thread_2.set(6, true);//sysj\controller.sysj line: 99, column: 35
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3=3;
                            tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
                            currsigs.addElement(tempState);
                            tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S3=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            if(updatep.getprestatus()){//sysj\controller.sysj line: 102, column: 11
              S3=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              tempState.setPresent();//sysj\controller.sysj line: 103, column: 7
              currsigs.addElement(tempState);
              tempState.setValue(setTemp_thread_2);//sysj\controller.sysj line: 103, column: 7
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            if(!updatep.getprestatus()){//sysj\controller.sysj line: 105, column: 11
              S3=5;
              humidityState.setPresent();//sysj\controller.sysj line: 107, column: 7
              currsigs.addElement(humidityState);
              humidityState.setValue(setHumidity_thread_2);//sysj\controller.sysj line: 107, column: 7
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
            if(updatep.getprestatus()){//sysj\controller.sysj line: 106, column: 11
              S3=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              humidityState.setPresent();//sysj\controller.sysj line: 107, column: 7
              currsigs.addElement(humidityState);
              humidityState.setValue(setHumidity_thread_2);//sysj\controller.sysj line: 107, column: 7
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(!updatep.getprestatus()){//sysj\controller.sysj line: 109, column: 11
              S3=7;
              lightState.setPresent();//sysj\controller.sysj line: 111, column: 7
              currsigs.addElement(lightState);
              lightState.setValue(setLight_thread_2);//sysj\controller.sysj line: 111, column: 7
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
            if(updatep.getprestatus()){//sysj\controller.sysj line: 110, column: 11
              S3=8;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              lightState.setPresent();//sysj\controller.sysj line: 111, column: 7
              currsigs.addElement(lightState);
              lightState.setValue(setLight_thread_2);//sysj\controller.sysj line: 111, column: 7
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 8 : 
            if(!updatep.getprestatus()){//sysj\controller.sysj line: 113, column: 11
              S3=9;
              presenceState.setPresent();//sysj\controller.sysj line: 115, column: 7
              currsigs.addElement(presenceState);
              presenceState.setValue(setPresence_thread_2);//sysj\controller.sysj line: 115, column: 7
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
            if(updatep.getprestatus()){//sysj\controller.sysj line: 114, column: 11
              S3=10;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              presenceState.setPresent();//sysj\controller.sysj line: 115, column: 7
              currsigs.addElement(presenceState);
              presenceState.setValue(setPresence_thread_2);//sysj\controller.sysj line: 115, column: 7
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 10 : 
            if(!updatep.getprestatus()){//sysj\controller.sysj line: 117, column: 11
              S3=11;
              closedState.setPresent();//sysj\controller.sysj line: 119, column: 7
              currsigs.addElement(closedState);
              closedState.setValue(setClosed_thread_2);//sysj\controller.sysj line: 119, column: 7
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
          
          case 11 : 
            if(updatep.getprestatus()){//sysj\controller.sysj line: 118, column: 11
              S3=12;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              closedState.setPresent();//sysj\controller.sysj line: 119, column: 7
              currsigs.addElement(closedState);
              closedState.setValue(setClosed_thread_2);//sysj\controller.sysj line: 119, column: 7
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 12 : 
            if(!updatep.getprestatus()){//sysj\controller.sysj line: 121, column: 11
              S3=13;
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
          
          case 13 : 
            S3=13;
            S3=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread6568(int [] tdone, int [] ends){
        S2187=1;
        if(SIGNAL_Z1_SMOKE.getprestatus() || SIGNAL_Z2_SMOKE.getprestatus() || SIGNAL_Z3_SMOKE.getprestatus() || SIGNAL_Z4_SMOKE.getprestatus() || SIGNAL_Z5_SMOKE.getprestatus() || SIGNAL_Z6_SMOKE.getprestatus() || SIGNAL_Z7_SMOKE.getprestatus()){//sysj\controller.sysj line: 131, column: 13
      setSmoke_thread_3 = 1;//sysj\controller.sysj line: 132, column: 6
      S2103=0;
      smokeState.setPresent();//sysj\controller.sysj line: 139, column: 7
      currsigs.addElement(smokeState);
      smokeState.setValue(setSmoke_thread_3);//sysj\controller.sysj line: 139, column: 7
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      setSmoke_thread_3 = 0;//sysj\controller.sysj line: 134, column: 6
      S2103=0;
      smokeState.setPresent();//sysj\controller.sysj line: 139, column: 7
      currsigs.addElement(smokeState);
      smokeState.setValue(setSmoke_thread_3);//sysj\controller.sysj line: 139, column: 7
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread6567(int [] tdone, int [] ends){
        S2089=1;
    S3=0;
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
      switch(S6565){
        case 0 : 
          S6565=0;
          break RUN;
        
        case 1 : 
          S6565=2;
          S6565=2;
          thread6567(tdone,ends);
          thread6568(tdone,ends);
          int biggest6569 = 0;
          if(ends[2]>=biggest6569){
            biggest6569=ends[2];
          }
          if(ends[3]>=biggest6569){
            biggest6569=ends[3];
          }
          if(biggest6569 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread6570(tdone,ends);
          thread6571(tdone,ends);
          int biggest6572 = 0;
          if(ends[2]>=biggest6572){
            biggest6572=ends[2];
          }
          if(ends[3]>=biggest6572){
            biggest6572=ends[3];
          }
          if(biggest6572 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest6572 == 0){
            thread6573(tdone,ends);
            thread6574(tdone,ends);
            int biggest6575 = 0;
            if(ends[2]>=biggest6575){
              biggest6575=ends[2];
            }
            if(ends[3]>=biggest6575){
              biggest6575=ends[3];
            }
            if(biggest6575 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
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
          update.gethook();
          updatep.gethook();
          updates.gethook();
          time.gethook();
          SIGNAL_Z1_TEMP.gethook();
          SIGNAL_Z2_TEMP.gethook();
          SIGNAL_Z3_TEMP.gethook();
          SIGNAL_Z4_TEMP.gethook();
          SIGNAL_Z5_TEMP.gethook();
          SIGNAL_Z6_TEMP.gethook();
          SIGNAL_Z7_TEMP.gethook();
          SIGNAL_Z1_HUMIDITY.gethook();
          SIGNAL_Z2_HUMIDITY.gethook();
          SIGNAL_Z3_HUMIDITY.gethook();
          SIGNAL_Z4_HUMIDITY.gethook();
          SIGNAL_Z5_HUMIDITY.gethook();
          SIGNAL_Z6_HUMIDITY.gethook();
          SIGNAL_Z7_HUMIDITY.gethook();
          SIGNAL_Z1_LIGHT.gethook();
          SIGNAL_Z2_LIGHT.gethook();
          SIGNAL_Z3_LIGHT.gethook();
          SIGNAL_Z4_LIGHT.gethook();
          SIGNAL_Z5_LIGHT.gethook();
          SIGNAL_Z6_LIGHT.gethook();
          SIGNAL_Z7_LIGHT.gethook();
          SIGNAL_Z1_SMOKE.gethook();
          SIGNAL_Z2_SMOKE.gethook();
          SIGNAL_Z3_SMOKE.gethook();
          SIGNAL_Z4_SMOKE.gethook();
          SIGNAL_Z5_SMOKE.gethook();
          SIGNAL_Z6_SMOKE.gethook();
          SIGNAL_Z7_SMOKE.gethook();
          SIGNAL_Z1_PRESENCE.gethook();
          SIGNAL_Z2_PRESENCE.gethook();
          SIGNAL_Z3_PRESENCE.gethook();
          SIGNAL_Z4_PRESENCE.gethook();
          SIGNAL_Z5_PRESENCE.gethook();
          SIGNAL_Z6_PRESENCE.gethook();
          SIGNAL_Z7_PRESENCE.gethook();
          df = true;
        }
        runClockDomain();
      }
      update.setpreclear();
      updatep.setpreclear();
      updates.setpreclear();
      time.setpreclear();
      SIGNAL_Z1_TEMP.setpreclear();
      SIGNAL_Z2_TEMP.setpreclear();
      SIGNAL_Z3_TEMP.setpreclear();
      SIGNAL_Z4_TEMP.setpreclear();
      SIGNAL_Z5_TEMP.setpreclear();
      SIGNAL_Z6_TEMP.setpreclear();
      SIGNAL_Z7_TEMP.setpreclear();
      SIGNAL_Z1_HUMIDITY.setpreclear();
      SIGNAL_Z2_HUMIDITY.setpreclear();
      SIGNAL_Z3_HUMIDITY.setpreclear();
      SIGNAL_Z4_HUMIDITY.setpreclear();
      SIGNAL_Z5_HUMIDITY.setpreclear();
      SIGNAL_Z6_HUMIDITY.setpreclear();
      SIGNAL_Z7_HUMIDITY.setpreclear();
      SIGNAL_Z1_LIGHT.setpreclear();
      SIGNAL_Z2_LIGHT.setpreclear();
      SIGNAL_Z3_LIGHT.setpreclear();
      SIGNAL_Z4_LIGHT.setpreclear();
      SIGNAL_Z5_LIGHT.setpreclear();
      SIGNAL_Z6_LIGHT.setpreclear();
      SIGNAL_Z7_LIGHT.setpreclear();
      SIGNAL_Z1_SMOKE.setpreclear();
      SIGNAL_Z2_SMOKE.setpreclear();
      SIGNAL_Z3_SMOKE.setpreclear();
      SIGNAL_Z4_SMOKE.setpreclear();
      SIGNAL_Z5_SMOKE.setpreclear();
      SIGNAL_Z6_SMOKE.setpreclear();
      SIGNAL_Z7_SMOKE.setpreclear();
      SIGNAL_Z1_PRESENCE.setpreclear();
      SIGNAL_Z2_PRESENCE.setpreclear();
      SIGNAL_Z3_PRESENCE.setpreclear();
      SIGNAL_Z4_PRESENCE.setpreclear();
      SIGNAL_Z5_PRESENCE.setpreclear();
      SIGNAL_Z6_PRESENCE.setpreclear();
      SIGNAL_Z7_PRESENCE.setpreclear();
      tempState.setpreclear();
      humidityState.setpreclear();
      lightState.setpreclear();
      presenceState.setpreclear();
      smokeState.setpreclear();
      closedState.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = update.getStatus() ? update.setprepresent() : update.setpreclear();
      update.setpreval(update.getValue());
      update.setClear();
      dummyint = updatep.getStatus() ? updatep.setprepresent() : updatep.setpreclear();
      updatep.setpreval(updatep.getValue());
      updatep.setClear();
      dummyint = updates.getStatus() ? updates.setprepresent() : updates.setpreclear();
      updates.setpreval(updates.getValue());
      updates.setClear();
      dummyint = time.getStatus() ? time.setprepresent() : time.setpreclear();
      time.setpreval(time.getValue());
      time.setClear();
      dummyint = SIGNAL_Z1_TEMP.getStatus() ? SIGNAL_Z1_TEMP.setprepresent() : SIGNAL_Z1_TEMP.setpreclear();
      SIGNAL_Z1_TEMP.setpreval(SIGNAL_Z1_TEMP.getValue());
      SIGNAL_Z1_TEMP.setClear();
      dummyint = SIGNAL_Z2_TEMP.getStatus() ? SIGNAL_Z2_TEMP.setprepresent() : SIGNAL_Z2_TEMP.setpreclear();
      SIGNAL_Z2_TEMP.setpreval(SIGNAL_Z2_TEMP.getValue());
      SIGNAL_Z2_TEMP.setClear();
      dummyint = SIGNAL_Z3_TEMP.getStatus() ? SIGNAL_Z3_TEMP.setprepresent() : SIGNAL_Z3_TEMP.setpreclear();
      SIGNAL_Z3_TEMP.setpreval(SIGNAL_Z3_TEMP.getValue());
      SIGNAL_Z3_TEMP.setClear();
      dummyint = SIGNAL_Z4_TEMP.getStatus() ? SIGNAL_Z4_TEMP.setprepresent() : SIGNAL_Z4_TEMP.setpreclear();
      SIGNAL_Z4_TEMP.setpreval(SIGNAL_Z4_TEMP.getValue());
      SIGNAL_Z4_TEMP.setClear();
      dummyint = SIGNAL_Z5_TEMP.getStatus() ? SIGNAL_Z5_TEMP.setprepresent() : SIGNAL_Z5_TEMP.setpreclear();
      SIGNAL_Z5_TEMP.setpreval(SIGNAL_Z5_TEMP.getValue());
      SIGNAL_Z5_TEMP.setClear();
      dummyint = SIGNAL_Z6_TEMP.getStatus() ? SIGNAL_Z6_TEMP.setprepresent() : SIGNAL_Z6_TEMP.setpreclear();
      SIGNAL_Z6_TEMP.setpreval(SIGNAL_Z6_TEMP.getValue());
      SIGNAL_Z6_TEMP.setClear();
      dummyint = SIGNAL_Z7_TEMP.getStatus() ? SIGNAL_Z7_TEMP.setprepresent() : SIGNAL_Z7_TEMP.setpreclear();
      SIGNAL_Z7_TEMP.setpreval(SIGNAL_Z7_TEMP.getValue());
      SIGNAL_Z7_TEMP.setClear();
      dummyint = SIGNAL_Z1_HUMIDITY.getStatus() ? SIGNAL_Z1_HUMIDITY.setprepresent() : SIGNAL_Z1_HUMIDITY.setpreclear();
      SIGNAL_Z1_HUMIDITY.setpreval(SIGNAL_Z1_HUMIDITY.getValue());
      SIGNAL_Z1_HUMIDITY.setClear();
      dummyint = SIGNAL_Z2_HUMIDITY.getStatus() ? SIGNAL_Z2_HUMIDITY.setprepresent() : SIGNAL_Z2_HUMIDITY.setpreclear();
      SIGNAL_Z2_HUMIDITY.setpreval(SIGNAL_Z2_HUMIDITY.getValue());
      SIGNAL_Z2_HUMIDITY.setClear();
      dummyint = SIGNAL_Z3_HUMIDITY.getStatus() ? SIGNAL_Z3_HUMIDITY.setprepresent() : SIGNAL_Z3_HUMIDITY.setpreclear();
      SIGNAL_Z3_HUMIDITY.setpreval(SIGNAL_Z3_HUMIDITY.getValue());
      SIGNAL_Z3_HUMIDITY.setClear();
      dummyint = SIGNAL_Z4_HUMIDITY.getStatus() ? SIGNAL_Z4_HUMIDITY.setprepresent() : SIGNAL_Z4_HUMIDITY.setpreclear();
      SIGNAL_Z4_HUMIDITY.setpreval(SIGNAL_Z4_HUMIDITY.getValue());
      SIGNAL_Z4_HUMIDITY.setClear();
      dummyint = SIGNAL_Z5_HUMIDITY.getStatus() ? SIGNAL_Z5_HUMIDITY.setprepresent() : SIGNAL_Z5_HUMIDITY.setpreclear();
      SIGNAL_Z5_HUMIDITY.setpreval(SIGNAL_Z5_HUMIDITY.getValue());
      SIGNAL_Z5_HUMIDITY.setClear();
      dummyint = SIGNAL_Z6_HUMIDITY.getStatus() ? SIGNAL_Z6_HUMIDITY.setprepresent() : SIGNAL_Z6_HUMIDITY.setpreclear();
      SIGNAL_Z6_HUMIDITY.setpreval(SIGNAL_Z6_HUMIDITY.getValue());
      SIGNAL_Z6_HUMIDITY.setClear();
      dummyint = SIGNAL_Z7_HUMIDITY.getStatus() ? SIGNAL_Z7_HUMIDITY.setprepresent() : SIGNAL_Z7_HUMIDITY.setpreclear();
      SIGNAL_Z7_HUMIDITY.setpreval(SIGNAL_Z7_HUMIDITY.getValue());
      SIGNAL_Z7_HUMIDITY.setClear();
      dummyint = SIGNAL_Z1_LIGHT.getStatus() ? SIGNAL_Z1_LIGHT.setprepresent() : SIGNAL_Z1_LIGHT.setpreclear();
      SIGNAL_Z1_LIGHT.setpreval(SIGNAL_Z1_LIGHT.getValue());
      SIGNAL_Z1_LIGHT.setClear();
      dummyint = SIGNAL_Z2_LIGHT.getStatus() ? SIGNAL_Z2_LIGHT.setprepresent() : SIGNAL_Z2_LIGHT.setpreclear();
      SIGNAL_Z2_LIGHT.setpreval(SIGNAL_Z2_LIGHT.getValue());
      SIGNAL_Z2_LIGHT.setClear();
      dummyint = SIGNAL_Z3_LIGHT.getStatus() ? SIGNAL_Z3_LIGHT.setprepresent() : SIGNAL_Z3_LIGHT.setpreclear();
      SIGNAL_Z3_LIGHT.setpreval(SIGNAL_Z3_LIGHT.getValue());
      SIGNAL_Z3_LIGHT.setClear();
      dummyint = SIGNAL_Z4_LIGHT.getStatus() ? SIGNAL_Z4_LIGHT.setprepresent() : SIGNAL_Z4_LIGHT.setpreclear();
      SIGNAL_Z4_LIGHT.setpreval(SIGNAL_Z4_LIGHT.getValue());
      SIGNAL_Z4_LIGHT.setClear();
      dummyint = SIGNAL_Z5_LIGHT.getStatus() ? SIGNAL_Z5_LIGHT.setprepresent() : SIGNAL_Z5_LIGHT.setpreclear();
      SIGNAL_Z5_LIGHT.setpreval(SIGNAL_Z5_LIGHT.getValue());
      SIGNAL_Z5_LIGHT.setClear();
      dummyint = SIGNAL_Z6_LIGHT.getStatus() ? SIGNAL_Z6_LIGHT.setprepresent() : SIGNAL_Z6_LIGHT.setpreclear();
      SIGNAL_Z6_LIGHT.setpreval(SIGNAL_Z6_LIGHT.getValue());
      SIGNAL_Z6_LIGHT.setClear();
      dummyint = SIGNAL_Z7_LIGHT.getStatus() ? SIGNAL_Z7_LIGHT.setprepresent() : SIGNAL_Z7_LIGHT.setpreclear();
      SIGNAL_Z7_LIGHT.setpreval(SIGNAL_Z7_LIGHT.getValue());
      SIGNAL_Z7_LIGHT.setClear();
      dummyint = SIGNAL_Z1_SMOKE.getStatus() ? SIGNAL_Z1_SMOKE.setprepresent() : SIGNAL_Z1_SMOKE.setpreclear();
      SIGNAL_Z1_SMOKE.setpreval(SIGNAL_Z1_SMOKE.getValue());
      SIGNAL_Z1_SMOKE.setClear();
      dummyint = SIGNAL_Z2_SMOKE.getStatus() ? SIGNAL_Z2_SMOKE.setprepresent() : SIGNAL_Z2_SMOKE.setpreclear();
      SIGNAL_Z2_SMOKE.setpreval(SIGNAL_Z2_SMOKE.getValue());
      SIGNAL_Z2_SMOKE.setClear();
      dummyint = SIGNAL_Z3_SMOKE.getStatus() ? SIGNAL_Z3_SMOKE.setprepresent() : SIGNAL_Z3_SMOKE.setpreclear();
      SIGNAL_Z3_SMOKE.setpreval(SIGNAL_Z3_SMOKE.getValue());
      SIGNAL_Z3_SMOKE.setClear();
      dummyint = SIGNAL_Z4_SMOKE.getStatus() ? SIGNAL_Z4_SMOKE.setprepresent() : SIGNAL_Z4_SMOKE.setpreclear();
      SIGNAL_Z4_SMOKE.setpreval(SIGNAL_Z4_SMOKE.getValue());
      SIGNAL_Z4_SMOKE.setClear();
      dummyint = SIGNAL_Z5_SMOKE.getStatus() ? SIGNAL_Z5_SMOKE.setprepresent() : SIGNAL_Z5_SMOKE.setpreclear();
      SIGNAL_Z5_SMOKE.setpreval(SIGNAL_Z5_SMOKE.getValue());
      SIGNAL_Z5_SMOKE.setClear();
      dummyint = SIGNAL_Z6_SMOKE.getStatus() ? SIGNAL_Z6_SMOKE.setprepresent() : SIGNAL_Z6_SMOKE.setpreclear();
      SIGNAL_Z6_SMOKE.setpreval(SIGNAL_Z6_SMOKE.getValue());
      SIGNAL_Z6_SMOKE.setClear();
      dummyint = SIGNAL_Z7_SMOKE.getStatus() ? SIGNAL_Z7_SMOKE.setprepresent() : SIGNAL_Z7_SMOKE.setpreclear();
      SIGNAL_Z7_SMOKE.setpreval(SIGNAL_Z7_SMOKE.getValue());
      SIGNAL_Z7_SMOKE.setClear();
      dummyint = SIGNAL_Z1_PRESENCE.getStatus() ? SIGNAL_Z1_PRESENCE.setprepresent() : SIGNAL_Z1_PRESENCE.setpreclear();
      SIGNAL_Z1_PRESENCE.setpreval(SIGNAL_Z1_PRESENCE.getValue());
      SIGNAL_Z1_PRESENCE.setClear();
      dummyint = SIGNAL_Z2_PRESENCE.getStatus() ? SIGNAL_Z2_PRESENCE.setprepresent() : SIGNAL_Z2_PRESENCE.setpreclear();
      SIGNAL_Z2_PRESENCE.setpreval(SIGNAL_Z2_PRESENCE.getValue());
      SIGNAL_Z2_PRESENCE.setClear();
      dummyint = SIGNAL_Z3_PRESENCE.getStatus() ? SIGNAL_Z3_PRESENCE.setprepresent() : SIGNAL_Z3_PRESENCE.setpreclear();
      SIGNAL_Z3_PRESENCE.setpreval(SIGNAL_Z3_PRESENCE.getValue());
      SIGNAL_Z3_PRESENCE.setClear();
      dummyint = SIGNAL_Z4_PRESENCE.getStatus() ? SIGNAL_Z4_PRESENCE.setprepresent() : SIGNAL_Z4_PRESENCE.setpreclear();
      SIGNAL_Z4_PRESENCE.setpreval(SIGNAL_Z4_PRESENCE.getValue());
      SIGNAL_Z4_PRESENCE.setClear();
      dummyint = SIGNAL_Z5_PRESENCE.getStatus() ? SIGNAL_Z5_PRESENCE.setprepresent() : SIGNAL_Z5_PRESENCE.setpreclear();
      SIGNAL_Z5_PRESENCE.setpreval(SIGNAL_Z5_PRESENCE.getValue());
      SIGNAL_Z5_PRESENCE.setClear();
      dummyint = SIGNAL_Z6_PRESENCE.getStatus() ? SIGNAL_Z6_PRESENCE.setprepresent() : SIGNAL_Z6_PRESENCE.setpreclear();
      SIGNAL_Z6_PRESENCE.setpreval(SIGNAL_Z6_PRESENCE.getValue());
      SIGNAL_Z6_PRESENCE.setClear();
      dummyint = SIGNAL_Z7_PRESENCE.getStatus() ? SIGNAL_Z7_PRESENCE.setprepresent() : SIGNAL_Z7_PRESENCE.setpreclear();
      SIGNAL_Z7_PRESENCE.setpreval(SIGNAL_Z7_PRESENCE.getValue());
      SIGNAL_Z7_PRESENCE.setClear();
      tempState.sethook();
      tempState.setClear();
      humidityState.sethook();
      humidityState.setClear();
      lightState.sethook();
      lightState.setClear();
      presenceState.sethook();
      presenceState.setClear();
      smokeState.sethook();
      smokeState.setClear();
      closedState.sethook();
      closedState.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        update.gethook();
        updatep.gethook();
        updates.gethook();
        time.gethook();
        SIGNAL_Z1_TEMP.gethook();
        SIGNAL_Z2_TEMP.gethook();
        SIGNAL_Z3_TEMP.gethook();
        SIGNAL_Z4_TEMP.gethook();
        SIGNAL_Z5_TEMP.gethook();
        SIGNAL_Z6_TEMP.gethook();
        SIGNAL_Z7_TEMP.gethook();
        SIGNAL_Z1_HUMIDITY.gethook();
        SIGNAL_Z2_HUMIDITY.gethook();
        SIGNAL_Z3_HUMIDITY.gethook();
        SIGNAL_Z4_HUMIDITY.gethook();
        SIGNAL_Z5_HUMIDITY.gethook();
        SIGNAL_Z6_HUMIDITY.gethook();
        SIGNAL_Z7_HUMIDITY.gethook();
        SIGNAL_Z1_LIGHT.gethook();
        SIGNAL_Z2_LIGHT.gethook();
        SIGNAL_Z3_LIGHT.gethook();
        SIGNAL_Z4_LIGHT.gethook();
        SIGNAL_Z5_LIGHT.gethook();
        SIGNAL_Z6_LIGHT.gethook();
        SIGNAL_Z7_LIGHT.gethook();
        SIGNAL_Z1_SMOKE.gethook();
        SIGNAL_Z2_SMOKE.gethook();
        SIGNAL_Z3_SMOKE.gethook();
        SIGNAL_Z4_SMOKE.gethook();
        SIGNAL_Z5_SMOKE.gethook();
        SIGNAL_Z6_SMOKE.gethook();
        SIGNAL_Z7_SMOKE.gethook();
        SIGNAL_Z1_PRESENCE.gethook();
        SIGNAL_Z2_PRESENCE.gethook();
        SIGNAL_Z3_PRESENCE.gethook();
        SIGNAL_Z4_PRESENCE.gethook();
        SIGNAL_Z5_PRESENCE.gethook();
        SIGNAL_Z6_PRESENCE.gethook();
        SIGNAL_Z7_PRESENCE.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
