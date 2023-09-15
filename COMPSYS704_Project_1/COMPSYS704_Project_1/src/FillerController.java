import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\ABScontroller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABScontroller.sysj line: 2, column: 1

public class FillerController extends ClockDomain{
  public FillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal emergencyStop = new Signal("emergencyStop", Signal.INPUT);
  public Signal rotaryTableTriggerFiller = new Signal("rotaryTableTriggerFiller", Signal.INPUT);
  public Signal liquidRatio = new Signal("liquidRatio", Signal.INPUT);
  public Signal liquidVolumeDetector = new Signal("liquidVolumeDetector", Signal.INPUT);
  public Signal bottleFilled = new Signal("bottleFilled", Signal.OUTPUT);
  public Signal valveInjectorOnOff1 = new Signal("valveInjectorOnOff1", Signal.OUTPUT);
  public Signal valveInjectorOnOff2 = new Signal("valveInjectorOnOff2", Signal.OUTPUT);
  public Signal valveInjectorOnOff3 = new Signal("valveInjectorOnOff3", Signal.OUTPUT);
  public Signal valveInjectorOnOff4 = new Signal("valveInjectorOnOff4", Signal.OUTPUT);
  public Signal valveInletOnOff1 = new Signal("valveInletOnOff1", Signal.OUTPUT);
  public Signal valveInletOnOff2 = new Signal("valveInletOnOff2", Signal.OUTPUT);
  public Signal valveInletOnOff3 = new Signal("valveInletOnOff3", Signal.OUTPUT);
  public Signal valveInletOnOff4 = new Signal("valveInletOnOff4", Signal.OUTPUT);
  public Signal dosUnitValveRetract1 = new Signal("dosUnitValveRetract1", Signal.OUTPUT);
  public Signal dosUnitValveRetract2 = new Signal("dosUnitValveRetract2", Signal.OUTPUT);
  public Signal dosUnitValveRetract3 = new Signal("dosUnitValveRetract3", Signal.OUTPUT);
  public Signal dosUnitValveRetract4 = new Signal("dosUnitValveRetract4", Signal.OUTPUT);
  public Signal dosUnitExtend1 = new Signal("dosUnitExtend1", Signal.OUTPUT);
  public Signal dosUnitExtend2 = new Signal("dosUnitExtend2", Signal.OUTPUT);
  public Signal dosUnitExtend3 = new Signal("dosUnitExtend3", Signal.OUTPUT);
  public Signal dosUnitExtend4 = new Signal("dosUnitExtend4", Signal.OUTPUT);
  public Signal idle = new Signal("idle", Signal.OUTPUT);
  private Signal fillerNum_36;
  private List liquids_thread_36;//sysj\ABScontroller.sysj line: 169, column: 17
  private long __start_thread_36;//sysj\ABScontroller.sysj line: 182, column: 32
  private int S13330 = 1;
  private int S5642 = 1;
  private int S5568 = 1;
  private int S1804 = 1;
  private int S1827 = 1;
  private int S1809 = 1;
  private int S1814 = 1;
  private int S1896 = 1;
  private int S1901 = 1;
  private int S1907 = 1;
  private int S1912 = 1;
  private int S2020 = 1;
  private int S2025 = 1;
  private int S2031 = 1;
  private int S2036 = 1;
  private int S2144 = 1;
  private int S2149 = 1;
  private int S2155 = 1;
  private int S2160 = 1;
  private int S2268 = 1;
  private int S2273 = 1;
  
  private int[] ends = new int[93];
  private int[] tdone = new int[93];
  
  public void thread43576(int [] tdone, int [] ends){
        S1814=1;
    dosUnitValveRetract1.setPresent();//sysj\ABScontroller.sysj line: 177, column: 30
    currsigs.addElement(dosUnitValveRetract1);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread43575(int [] tdone, int [] ends){
        S1809=1;
    valveInjectorOnOff1.setPresent();//sysj\ABScontroller.sysj line: 175, column: 30
    currsigs.addElement(valveInjectorOnOff1);
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread43573(int [] tdone, int [] ends){
        switch(S2273){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        dosUnitExtend4.setPresent();//sysj\ABScontroller.sysj line: 240, column: 30
        currsigs.addElement(dosUnitExtend4);
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
        break;
      
    }
  }

  public void thread43572(int [] tdone, int [] ends){
        switch(S2268){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        valveInletOnOff4.setPresent();//sysj\ABScontroller.sysj line: 238, column: 30
        currsigs.addElement(valveInletOnOff4);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread43570(int [] tdone, int [] ends){
        S1814=1;
    dosUnitValveRetract1.setPresent();//sysj\ABScontroller.sysj line: 177, column: 30
    currsigs.addElement(dosUnitValveRetract1);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread43569(int [] tdone, int [] ends){
        S1809=1;
    valveInjectorOnOff1.setPresent();//sysj\ABScontroller.sysj line: 175, column: 30
    currsigs.addElement(valveInjectorOnOff1);
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread43567(int [] tdone, int [] ends){
        switch(S2160){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract4.setPresent();//sysj\ABScontroller.sysj line: 231, column: 30
        currsigs.addElement(dosUnitValveRetract4);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread43566(int [] tdone, int [] ends){
        switch(S2155){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff4.setPresent();//sysj\ABScontroller.sysj line: 229, column: 30
        currsigs.addElement(valveInjectorOnOff4);
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
        break;
      
    }
  }

  public void thread43564(int [] tdone, int [] ends){
        S2160=1;
    dosUnitValveRetract4.setPresent();//sysj\ABScontroller.sysj line: 231, column: 30
    currsigs.addElement(dosUnitValveRetract4);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread43563(int [] tdone, int [] ends){
        S2155=1;
    valveInjectorOnOff4.setPresent();//sysj\ABScontroller.sysj line: 229, column: 30
    currsigs.addElement(valveInjectorOnOff4);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread43561(int [] tdone, int [] ends){
        switch(S2149){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        dosUnitExtend3.setPresent();//sysj\ABScontroller.sysj line: 222, column: 30
        currsigs.addElement(dosUnitExtend3);
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
        break;
      
    }
  }

  public void thread43560(int [] tdone, int [] ends){
        switch(S2144){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        valveInletOnOff3.setPresent();//sysj\ABScontroller.sysj line: 220, column: 30
        currsigs.addElement(valveInletOnOff3);
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
        break;
      
    }
  }

  public void thread43558(int [] tdone, int [] ends){
        S2160=1;
    dosUnitValveRetract4.setPresent();//sysj\ABScontroller.sysj line: 231, column: 30
    currsigs.addElement(dosUnitValveRetract4);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread43557(int [] tdone, int [] ends){
        S2155=1;
    valveInjectorOnOff4.setPresent();//sysj\ABScontroller.sysj line: 229, column: 30
    currsigs.addElement(valveInjectorOnOff4);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread43555(int [] tdone, int [] ends){
        switch(S2036){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract3.setPresent();//sysj\ABScontroller.sysj line: 213, column: 30
        currsigs.addElement(dosUnitValveRetract3);
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
        break;
      
    }
  }

  public void thread43554(int [] tdone, int [] ends){
        switch(S2031){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff3.setPresent();//sysj\ABScontroller.sysj line: 211, column: 30
        currsigs.addElement(valveInjectorOnOff3);
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
        break;
      
    }
  }

  public void thread43552(int [] tdone, int [] ends){
        S2036=1;
    dosUnitValveRetract3.setPresent();//sysj\ABScontroller.sysj line: 213, column: 30
    currsigs.addElement(dosUnitValveRetract3);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread43551(int [] tdone, int [] ends){
        S2031=1;
    valveInjectorOnOff3.setPresent();//sysj\ABScontroller.sysj line: 211, column: 30
    currsigs.addElement(valveInjectorOnOff3);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread43549(int [] tdone, int [] ends){
        switch(S2025){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        dosUnitExtend2.setPresent();//sysj\ABScontroller.sysj line: 205, column: 30
        currsigs.addElement(dosUnitExtend2);
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
        break;
      
    }
  }

  public void thread43548(int [] tdone, int [] ends){
        switch(S2020){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        valveInletOnOff2.setPresent();//sysj\ABScontroller.sysj line: 203, column: 30
        currsigs.addElement(valveInletOnOff2);
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
        break;
      
    }
  }

  public void thread43546(int [] tdone, int [] ends){
        S2036=1;
    dosUnitValveRetract3.setPresent();//sysj\ABScontroller.sysj line: 213, column: 30
    currsigs.addElement(dosUnitValveRetract3);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread43545(int [] tdone, int [] ends){
        S2031=1;
    valveInjectorOnOff3.setPresent();//sysj\ABScontroller.sysj line: 211, column: 30
    currsigs.addElement(valveInjectorOnOff3);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread43543(int [] tdone, int [] ends){
        switch(S1912){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract2.setPresent();//sysj\ABScontroller.sysj line: 196, column: 30
        currsigs.addElement(dosUnitValveRetract2);
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
        break;
      
    }
  }

  public void thread43542(int [] tdone, int [] ends){
        switch(S1907){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff2.setPresent();//sysj\ABScontroller.sysj line: 194, column: 30
        currsigs.addElement(valveInjectorOnOff2);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
        break;
      
    }
  }

  public void thread43540(int [] tdone, int [] ends){
        S1912=1;
    dosUnitValveRetract2.setPresent();//sysj\ABScontroller.sysj line: 196, column: 30
    currsigs.addElement(dosUnitValveRetract2);
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread43539(int [] tdone, int [] ends){
        S1907=1;
    valveInjectorOnOff2.setPresent();//sysj\ABScontroller.sysj line: 194, column: 30
    currsigs.addElement(valveInjectorOnOff2);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread43537(int [] tdone, int [] ends){
        switch(S1901){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        dosUnitExtend1.setPresent();//sysj\ABScontroller.sysj line: 187, column: 30
        currsigs.addElement(dosUnitExtend1);
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
        break;
      
    }
  }

  public void thread43536(int [] tdone, int [] ends){
        switch(S1896){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        valveInletOnOff1.setPresent();//sysj\ABScontroller.sysj line: 185, column: 30
        currsigs.addElement(valveInletOnOff1);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
        break;
      
    }
  }

  public void thread43534(int [] tdone, int [] ends){
        S1912=1;
    dosUnitValveRetract2.setPresent();//sysj\ABScontroller.sysj line: 196, column: 30
    currsigs.addElement(dosUnitValveRetract2);
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread43533(int [] tdone, int [] ends){
        S1907=1;
    valveInjectorOnOff2.setPresent();//sysj\ABScontroller.sysj line: 194, column: 30
    currsigs.addElement(valveInjectorOnOff2);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread43531(int [] tdone, int [] ends){
        switch(S1814){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract1.setPresent();//sysj\ABScontroller.sysj line: 177, column: 30
        currsigs.addElement(dosUnitValveRetract1);
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
        break;
      
    }
  }

  public void thread43530(int [] tdone, int [] ends){
        switch(S1809){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff1.setPresent();//sysj\ABScontroller.sysj line: 175, column: 30
        currsigs.addElement(valveInjectorOnOff1);
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
        break;
      
    }
  }

  public void thread43528(int [] tdone, int [] ends){
        S1814=1;
    dosUnitValveRetract1.setPresent();//sysj\ABScontroller.sysj line: 177, column: 30
    currsigs.addElement(dosUnitValveRetract1);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread43527(int [] tdone, int [] ends){
        S1809=1;
    valveInjectorOnOff1.setPresent();//sysj\ABScontroller.sysj line: 175, column: 30
    currsigs.addElement(valveInjectorOnOff1);
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S13330){
        case 0 : 
          S13330=0;
          break RUN;
        
        case 1 : 
          S13330=2;
          S13330=2;
          fillerNum_36.setClear();//sysj\ABScontroller.sysj line: 159, column: 1
          S5642=0;
          if((emergencyStop.getprestatus())){//sysj\ABScontroller.sysj line: 163, column: 17
            S5642=1;
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
          else {
            S5568=0;
            S1804=0;
            idle.setPresent();//sysj\ABScontroller.sysj line: 167, column: 18
            currsigs.addElement(idle);
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
        
        case 2 : 
          fillerNum_36.setClear();//sysj\ABScontroller.sysj line: 159, column: 1
          switch(S5642){
            case 0 : 
              if((emergencyStop.getprestatus())){//sysj\ABScontroller.sysj line: 163, column: 17
                S5642=1;
                active[36]=1;
                ends[36]=1;
                break RUN;
              }
              else {
                switch(S5568){
                  case 0 : 
                    switch(S1804){
                      case 0 : 
                        if(bottleAtPos2.getprestatus()){//sysj\ABScontroller.sysj line: 166, column: 23
                          liquids_thread_36 = Arrays.asList((liquidRatio.getpreval() == null ? null : ((List)liquidRatio.getpreval())));//sysj\ABScontroller.sysj line: 169, column: 17
                          liquids_thread_36 = Arrays.asList(25, 25, 25, 25);//sysj\ABScontroller.sysj line: 170, column: 17
                          S1804=1;
                          valveInjectorOnOff1.setPresent();//sysj\ABScontroller.sysj line: 173, column: 25
                          currsigs.addElement(valveInjectorOnOff1);
                          S1827=0;
                          if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 174, column: 40
                            System.out.println("Filler: 1, Fill Percent: " + (int)liquids_thread_36.get(0) + "%");//sysj\ABScontroller.sysj line: 181, column: 25
                            S1827=1;
                            __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 182, column: 32
                            if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 182, column: 32
                              ends[36]=9;
                              ;//sysj\ABScontroller.sysj line: 182, column: 32
                              ends[36]=11;
                              ;//sysj\ABScontroller.sysj line: 171, column: 17
                              ends[36]=2;
                              ;//sysj\ABScontroller.sysj line: 164, column: 9
                              System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                              S5568=1;
                              bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                              currsigs.addElement(bottleFilled);
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                            else {
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread43527(tdone,ends);
                            thread43528(tdone,ends);
                            int biggest43529 = 0;
                            if(ends[37]>=biggest43529){
                              biggest43529=ends[37];
                            }
                            if(ends[38]>=biggest43529){
                              biggest43529=ends[38];
                            }
                            if(biggest43529 == 1){
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          idle.setPresent();//sysj\ABScontroller.sysj line: 167, column: 18
                          currsigs.addElement(idle);
                          active[36]=1;
                          ends[36]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        switch(S1827){
                          case 0 : 
                            if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 174, column: 40
                              System.out.println("Filler: 1, Fill Percent: " + (int)liquids_thread_36.get(0) + "%");//sysj\ABScontroller.sysj line: 181, column: 25
                              S1827=1;
                              __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 182, column: 32
                              if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 182, column: 32
                                ends[36]=9;
                                ;//sysj\ABScontroller.sysj line: 182, column: 32
                                ends[36]=11;
                                ;//sysj\ABScontroller.sysj line: 171, column: 17
                                ends[36]=2;
                                ;//sysj\ABScontroller.sysj line: 164, column: 9
                                System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                S5568=1;
                                bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                currsigs.addElement(bottleFilled);
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              else {
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread43530(tdone,ends);
                              thread43531(tdone,ends);
                              int biggest43532 = 0;
                              if(ends[37]>=biggest43532){
                                biggest43532=ends[37];
                              }
                              if(ends[38]>=biggest43532){
                                biggest43532=ends[38];
                              }
                              if(biggest43532 == 1){
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest43532 == 0){
                                System.out.println("Filler: 1, Fill Percent: " + (int)liquids_thread_36.get(0) + "%");//sysj\ABScontroller.sysj line: 181, column: 25
                                S1827=1;
                                __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 182, column: 32
                                if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 182, column: 32
                                  ends[36]=9;
                                  ;//sysj\ABScontroller.sysj line: 182, column: 32
                                  ends[36]=11;
                                  ;//sysj\ABScontroller.sysj line: 171, column: 17
                                  ends[36]=2;
                                  ;//sysj\ABScontroller.sysj line: 164, column: 9
                                  System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                  S5568=1;
                                  bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                  currsigs.addElement(bottleFilled);
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                                else {
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                            }
                          
                          case 1 : 
                            if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 182, column: 32
                              ends[36]=9;
                              ;//sysj\ABScontroller.sysj line: 182, column: 32
                              ends[36]=11;
                              ;//sysj\ABScontroller.sysj line: 171, column: 17
                              ends[36]=2;
                              ;//sysj\ABScontroller.sysj line: 164, column: 9
                              System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                              S5568=1;
                              bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                              currsigs.addElement(bottleFilled);
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                            else {
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                          
                          case 2 : 
                            if((dosUnitEvac.getprestatus())){//sysj\ABScontroller.sysj line: 184, column: 40
                              System.out.println("dosUnitFilledFilerControllerHererererere");//sysj\ABScontroller.sysj line: 190, column: 25
                              valveInjectorOnOff2.setPresent();//sysj\ABScontroller.sysj line: 192, column: 25
                              currsigs.addElement(valveInjectorOnOff2);
                              S1827=3;
                              if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 193, column: 40
                                System.out.println("Filler: 2, Fill Percent: " + (int)liquids_thread_36.get(1) + "%");//sysj\ABScontroller.sysj line: 199, column: 25
                                S1827=4;
                                __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 200, column: 32
                                if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 200, column: 32
                                  ends[36]=7;
                                  ;//sysj\ABScontroller.sysj line: 200, column: 32
                                  ends[36]=11;
                                  ;//sysj\ABScontroller.sysj line: 171, column: 17
                                  ends[36]=2;
                                  ;//sysj\ABScontroller.sysj line: 164, column: 9
                                  System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                  S5568=1;
                                  bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                  currsigs.addElement(bottleFilled);
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                                else {
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread43533(tdone,ends);
                                thread43534(tdone,ends);
                                int biggest43535 = 0;
                                if(ends[41]>=biggest43535){
                                  biggest43535=ends[41];
                                }
                                if(ends[42]>=biggest43535){
                                  biggest43535=ends[42];
                                }
                                if(biggest43535 == 1){
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread43536(tdone,ends);
                              thread43537(tdone,ends);
                              int biggest43538 = 0;
                              if(ends[39]>=biggest43538){
                                biggest43538=ends[39];
                              }
                              if(ends[40]>=biggest43538){
                                biggest43538=ends[40];
                              }
                              if(biggest43538 == 1){
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest43538 == 0){
                                System.out.println("dosUnitFilledFilerControllerHererererere");//sysj\ABScontroller.sysj line: 190, column: 25
                                valveInjectorOnOff2.setPresent();//sysj\ABScontroller.sysj line: 192, column: 25
                                currsigs.addElement(valveInjectorOnOff2);
                                S1827=3;
                                if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 193, column: 40
                                  System.out.println("Filler: 2, Fill Percent: " + (int)liquids_thread_36.get(1) + "%");//sysj\ABScontroller.sysj line: 199, column: 25
                                  S1827=4;
                                  __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 200, column: 32
                                  if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 200, column: 32
                                    ends[36]=7;
                                    ;//sysj\ABScontroller.sysj line: 200, column: 32
                                    ends[36]=11;
                                    ;//sysj\ABScontroller.sysj line: 171, column: 17
                                    ends[36]=2;
                                    ;//sysj\ABScontroller.sysj line: 164, column: 9
                                    System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                    S5568=1;
                                    bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                    currsigs.addElement(bottleFilled);
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread43539(tdone,ends);
                                  thread43540(tdone,ends);
                                  int biggest43541 = 0;
                                  if(ends[41]>=biggest43541){
                                    biggest43541=ends[41];
                                  }
                                  if(ends[42]>=biggest43541){
                                    biggest43541=ends[42];
                                  }
                                  if(biggest43541 == 1){
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                          
                          case 3 : 
                            if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 193, column: 40
                              System.out.println("Filler: 2, Fill Percent: " + (int)liquids_thread_36.get(1) + "%");//sysj\ABScontroller.sysj line: 199, column: 25
                              S1827=4;
                              __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 200, column: 32
                              if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 200, column: 32
                                ends[36]=7;
                                ;//sysj\ABScontroller.sysj line: 200, column: 32
                                ends[36]=11;
                                ;//sysj\ABScontroller.sysj line: 171, column: 17
                                ends[36]=2;
                                ;//sysj\ABScontroller.sysj line: 164, column: 9
                                System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                S5568=1;
                                bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                currsigs.addElement(bottleFilled);
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              else {
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread43542(tdone,ends);
                              thread43543(tdone,ends);
                              int biggest43544 = 0;
                              if(ends[41]>=biggest43544){
                                biggest43544=ends[41];
                              }
                              if(ends[42]>=biggest43544){
                                biggest43544=ends[42];
                              }
                              if(biggest43544 == 1){
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest43544 == 0){
                                System.out.println("Filler: 2, Fill Percent: " + (int)liquids_thread_36.get(1) + "%");//sysj\ABScontroller.sysj line: 199, column: 25
                                S1827=4;
                                __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 200, column: 32
                                if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 200, column: 32
                                  ends[36]=7;
                                  ;//sysj\ABScontroller.sysj line: 200, column: 32
                                  ends[36]=11;
                                  ;//sysj\ABScontroller.sysj line: 171, column: 17
                                  ends[36]=2;
                                  ;//sysj\ABScontroller.sysj line: 164, column: 9
                                  System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                  S5568=1;
                                  bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                  currsigs.addElement(bottleFilled);
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                                else {
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                            }
                          
                          case 4 : 
                            if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 200, column: 32
                              ends[36]=7;
                              ;//sysj\ABScontroller.sysj line: 200, column: 32
                              ends[36]=11;
                              ;//sysj\ABScontroller.sysj line: 171, column: 17
                              ends[36]=2;
                              ;//sysj\ABScontroller.sysj line: 164, column: 9
                              System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                              S5568=1;
                              bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                              currsigs.addElement(bottleFilled);
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                            else {
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                          
                          case 5 : 
                            if((dosUnitEvac.getprestatus())){//sysj\ABScontroller.sysj line: 202, column: 40
                              valveInjectorOnOff3.setPresent();//sysj\ABScontroller.sysj line: 209, column: 25
                              currsigs.addElement(valveInjectorOnOff3);
                              S1827=6;
                              if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 210, column: 40
                                System.out.println("Filler: 3, Fill Percent: " + (int)liquids_thread_36.get(2) + "%");//sysj\ABScontroller.sysj line: 216, column: 25
                                S1827=7;
                                __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 217, column: 32
                                if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 217, column: 32
                                  ends[36]=5;
                                  ;//sysj\ABScontroller.sysj line: 217, column: 32
                                  ends[36]=11;
                                  ;//sysj\ABScontroller.sysj line: 171, column: 17
                                  ends[36]=2;
                                  ;//sysj\ABScontroller.sysj line: 164, column: 9
                                  System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                  S5568=1;
                                  bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                  currsigs.addElement(bottleFilled);
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                                else {
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread43545(tdone,ends);
                                thread43546(tdone,ends);
                                int biggest43547 = 0;
                                if(ends[45]>=biggest43547){
                                  biggest43547=ends[45];
                                }
                                if(ends[46]>=biggest43547){
                                  biggest43547=ends[46];
                                }
                                if(biggest43547 == 1){
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread43548(tdone,ends);
                              thread43549(tdone,ends);
                              int biggest43550 = 0;
                              if(ends[43]>=biggest43550){
                                biggest43550=ends[43];
                              }
                              if(ends[44]>=biggest43550){
                                biggest43550=ends[44];
                              }
                              if(biggest43550 == 1){
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest43550 == 0){
                                valveInjectorOnOff3.setPresent();//sysj\ABScontroller.sysj line: 209, column: 25
                                currsigs.addElement(valveInjectorOnOff3);
                                S1827=6;
                                if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 210, column: 40
                                  System.out.println("Filler: 3, Fill Percent: " + (int)liquids_thread_36.get(2) + "%");//sysj\ABScontroller.sysj line: 216, column: 25
                                  S1827=7;
                                  __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 217, column: 32
                                  if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 217, column: 32
                                    ends[36]=5;
                                    ;//sysj\ABScontroller.sysj line: 217, column: 32
                                    ends[36]=11;
                                    ;//sysj\ABScontroller.sysj line: 171, column: 17
                                    ends[36]=2;
                                    ;//sysj\ABScontroller.sysj line: 164, column: 9
                                    System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                    S5568=1;
                                    bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                    currsigs.addElement(bottleFilled);
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread43551(tdone,ends);
                                  thread43552(tdone,ends);
                                  int biggest43553 = 0;
                                  if(ends[45]>=biggest43553){
                                    biggest43553=ends[45];
                                  }
                                  if(ends[46]>=biggest43553){
                                    biggest43553=ends[46];
                                  }
                                  if(biggest43553 == 1){
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                          
                          case 6 : 
                            if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 210, column: 40
                              System.out.println("Filler: 3, Fill Percent: " + (int)liquids_thread_36.get(2) + "%");//sysj\ABScontroller.sysj line: 216, column: 25
                              S1827=7;
                              __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 217, column: 32
                              if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 217, column: 32
                                ends[36]=5;
                                ;//sysj\ABScontroller.sysj line: 217, column: 32
                                ends[36]=11;
                                ;//sysj\ABScontroller.sysj line: 171, column: 17
                                ends[36]=2;
                                ;//sysj\ABScontroller.sysj line: 164, column: 9
                                System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                S5568=1;
                                bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                currsigs.addElement(bottleFilled);
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              else {
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread43554(tdone,ends);
                              thread43555(tdone,ends);
                              int biggest43556 = 0;
                              if(ends[45]>=biggest43556){
                                biggest43556=ends[45];
                              }
                              if(ends[46]>=biggest43556){
                                biggest43556=ends[46];
                              }
                              if(biggest43556 == 1){
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest43556 == 0){
                                System.out.println("Filler: 3, Fill Percent: " + (int)liquids_thread_36.get(2) + "%");//sysj\ABScontroller.sysj line: 216, column: 25
                                S1827=7;
                                __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 217, column: 32
                                if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 217, column: 32
                                  ends[36]=5;
                                  ;//sysj\ABScontroller.sysj line: 217, column: 32
                                  ends[36]=11;
                                  ;//sysj\ABScontroller.sysj line: 171, column: 17
                                  ends[36]=2;
                                  ;//sysj\ABScontroller.sysj line: 164, column: 9
                                  System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                  S5568=1;
                                  bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                  currsigs.addElement(bottleFilled);
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                                else {
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                            }
                          
                          case 7 : 
                            if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 217, column: 32
                              ends[36]=5;
                              ;//sysj\ABScontroller.sysj line: 217, column: 32
                              ends[36]=11;
                              ;//sysj\ABScontroller.sysj line: 171, column: 17
                              ends[36]=2;
                              ;//sysj\ABScontroller.sysj line: 164, column: 9
                              System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                              S5568=1;
                              bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                              currsigs.addElement(bottleFilled);
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                            else {
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                          
                          case 8 : 
                            if((dosUnitEvac.getprestatus())){//sysj\ABScontroller.sysj line: 219, column: 40
                              valveInjectorOnOff4.setPresent();//sysj\ABScontroller.sysj line: 227, column: 25
                              currsigs.addElement(valveInjectorOnOff4);
                              S1827=9;
                              if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 228, column: 40
                                System.out.println("Filler: 4, Fill Percent: " + (int)liquids_thread_36.get(3) + "%");//sysj\ABScontroller.sysj line: 234, column: 25
                                S1827=10;
                                __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 235, column: 32
                                if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 235, column: 32
                                  ends[36]=3;
                                  ;//sysj\ABScontroller.sysj line: 235, column: 32
                                  ends[36]=11;
                                  ;//sysj\ABScontroller.sysj line: 171, column: 17
                                  ends[36]=2;
                                  ;//sysj\ABScontroller.sysj line: 164, column: 9
                                  System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                  S5568=1;
                                  bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                  currsigs.addElement(bottleFilled);
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                                else {
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread43557(tdone,ends);
                                thread43558(tdone,ends);
                                int biggest43559 = 0;
                                if(ends[49]>=biggest43559){
                                  biggest43559=ends[49];
                                }
                                if(ends[50]>=biggest43559){
                                  biggest43559=ends[50];
                                }
                                if(biggest43559 == 1){
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread43560(tdone,ends);
                              thread43561(tdone,ends);
                              int biggest43562 = 0;
                              if(ends[47]>=biggest43562){
                                biggest43562=ends[47];
                              }
                              if(ends[48]>=biggest43562){
                                biggest43562=ends[48];
                              }
                              if(biggest43562 == 1){
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest43562 == 0){
                                valveInjectorOnOff4.setPresent();//sysj\ABScontroller.sysj line: 227, column: 25
                                currsigs.addElement(valveInjectorOnOff4);
                                S1827=9;
                                if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 228, column: 40
                                  System.out.println("Filler: 4, Fill Percent: " + (int)liquids_thread_36.get(3) + "%");//sysj\ABScontroller.sysj line: 234, column: 25
                                  S1827=10;
                                  __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 235, column: 32
                                  if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 235, column: 32
                                    ends[36]=3;
                                    ;//sysj\ABScontroller.sysj line: 235, column: 32
                                    ends[36]=11;
                                    ;//sysj\ABScontroller.sysj line: 171, column: 17
                                    ends[36]=2;
                                    ;//sysj\ABScontroller.sysj line: 164, column: 9
                                    System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                    S5568=1;
                                    bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                    currsigs.addElement(bottleFilled);
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread43563(tdone,ends);
                                  thread43564(tdone,ends);
                                  int biggest43565 = 0;
                                  if(ends[49]>=biggest43565){
                                    biggest43565=ends[49];
                                  }
                                  if(ends[50]>=biggest43565){
                                    biggest43565=ends[50];
                                  }
                                  if(biggest43565 == 1){
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                          
                          case 9 : 
                            if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 228, column: 40
                              System.out.println("Filler: 4, Fill Percent: " + (int)liquids_thread_36.get(3) + "%");//sysj\ABScontroller.sysj line: 234, column: 25
                              S1827=10;
                              __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 235, column: 32
                              if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 235, column: 32
                                ends[36]=3;
                                ;//sysj\ABScontroller.sysj line: 235, column: 32
                                ends[36]=11;
                                ;//sysj\ABScontroller.sysj line: 171, column: 17
                                ends[36]=2;
                                ;//sysj\ABScontroller.sysj line: 164, column: 9
                                System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                S5568=1;
                                bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                currsigs.addElement(bottleFilled);
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              else {
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread43566(tdone,ends);
                              thread43567(tdone,ends);
                              int biggest43568 = 0;
                              if(ends[49]>=biggest43568){
                                biggest43568=ends[49];
                              }
                              if(ends[50]>=biggest43568){
                                biggest43568=ends[50];
                              }
                              if(biggest43568 == 1){
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest43568 == 0){
                                System.out.println("Filler: 4, Fill Percent: " + (int)liquids_thread_36.get(3) + "%");//sysj\ABScontroller.sysj line: 234, column: 25
                                S1827=10;
                                __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 235, column: 32
                                if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 235, column: 32
                                  ends[36]=3;
                                  ;//sysj\ABScontroller.sysj line: 235, column: 32
                                  ends[36]=11;
                                  ;//sysj\ABScontroller.sysj line: 171, column: 17
                                  ends[36]=2;
                                  ;//sysj\ABScontroller.sysj line: 164, column: 9
                                  System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                  S5568=1;
                                  bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                  currsigs.addElement(bottleFilled);
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                                else {
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                            }
                          
                          case 10 : 
                            if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 235, column: 32
                              ends[36]=3;
                              ;//sysj\ABScontroller.sysj line: 235, column: 32
                              ends[36]=11;
                              ;//sysj\ABScontroller.sysj line: 171, column: 17
                              ends[36]=2;
                              ;//sysj\ABScontroller.sysj line: 164, column: 9
                              System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                              S5568=1;
                              bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                              currsigs.addElement(bottleFilled);
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                            else {
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                          
                          case 11 : 
                            if((dosUnitEvac.getprestatus())){//sysj\ABScontroller.sysj line: 237, column: 40
                              valveInjectorOnOff1.setPresent();//sysj\ABScontroller.sysj line: 173, column: 25
                              currsigs.addElement(valveInjectorOnOff1);
                              S1827=0;
                              if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 174, column: 40
                                System.out.println("Filler: 1, Fill Percent: " + (int)liquids_thread_36.get(0) + "%");//sysj\ABScontroller.sysj line: 181, column: 25
                                S1827=1;
                                __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 182, column: 32
                                if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 182, column: 32
                                  ends[36]=9;
                                  ;//sysj\ABScontroller.sysj line: 182, column: 32
                                  ends[36]=11;
                                  ;//sysj\ABScontroller.sysj line: 171, column: 17
                                  ends[36]=2;
                                  ;//sysj\ABScontroller.sysj line: 164, column: 9
                                  System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                  S5568=1;
                                  bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                  currsigs.addElement(bottleFilled);
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                                else {
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread43569(tdone,ends);
                                thread43570(tdone,ends);
                                int biggest43571 = 0;
                                if(ends[37]>=biggest43571){
                                  biggest43571=ends[37];
                                }
                                if(ends[38]>=biggest43571){
                                  biggest43571=ends[38];
                                }
                                if(biggest43571 == 1){
                                  active[36]=1;
                                  ends[36]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread43572(tdone,ends);
                              thread43573(tdone,ends);
                              int biggest43574 = 0;
                              if(ends[51]>=biggest43574){
                                biggest43574=ends[51];
                              }
                              if(ends[52]>=biggest43574){
                                biggest43574=ends[52];
                              }
                              if(biggest43574 == 1){
                                active[36]=1;
                                ends[36]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest43574 == 0){
                                valveInjectorOnOff1.setPresent();//sysj\ABScontroller.sysj line: 173, column: 25
                                currsigs.addElement(valveInjectorOnOff1);
                                S1827=0;
                                if((dosUnitFilled.getprestatus())){//sysj\ABScontroller.sysj line: 174, column: 40
                                  System.out.println("Filler: 1, Fill Percent: " + (int)liquids_thread_36.get(0) + "%");//sysj\ABScontroller.sysj line: 181, column: 25
                                  S1827=1;
                                  __start_thread_36 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 182, column: 32
                                  if(com.systemj.Timer.getMs() - __start_thread_36 >= (1) * 1000){//sysj\ABScontroller.sysj line: 182, column: 32
                                    ends[36]=9;
                                    ;//sysj\ABScontroller.sysj line: 182, column: 32
                                    ends[36]=11;
                                    ;//sysj\ABScontroller.sysj line: 171, column: 17
                                    ends[36]=2;
                                    ;//sysj\ABScontroller.sysj line: 164, column: 9
                                    System.out.println("Bottle filled at pos 2");//sysj\ABScontroller.sysj line: 247, column: 9
                                    S5568=1;
                                    bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                                    currsigs.addElement(bottleFilled);
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread43575(tdone,ends);
                                  thread43576(tdone,ends);
                                  int biggest43577 = 0;
                                  if(ends[37]>=biggest43577){
                                    biggest43577=ends[37];
                                  }
                                  if(ends[38]>=biggest43577){
                                    biggest43577=ends[38];
                                  }
                                  if(biggest43577 == 1){
                                    active[36]=1;
                                    ends[36]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                          
                        }
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    if(rotaryTableTriggerFiller.getprestatus()){//sysj\ABScontroller.sysj line: 248, column: 15
                      S5568=2;
                      active[36]=1;
                      ends[36]=1;
                      break RUN;
                    }
                    else {
                      bottleFilled.setPresent();//sysj\ABScontroller.sysj line: 249, column: 10
                      currsigs.addElement(bottleFilled);
                      active[36]=1;
                      ends[36]=1;
                      break RUN;
                    }
                  
                  case 2 : 
                    S5568=2;
                    S5642=1;
                    active[36]=1;
                    ends[36]=1;
                    break RUN;
                  
                }
              }
              break;
            
            case 1 : 
              S5642=1;
              S5642=0;
              if((emergencyStop.getprestatus())){//sysj\ABScontroller.sysj line: 163, column: 17
                S5642=1;
                active[36]=1;
                ends[36]=1;
                break RUN;
              }
              else {
                S5568=0;
                S1804=0;
                idle.setPresent();//sysj\ABScontroller.sysj line: 167, column: 18
                currsigs.addElement(idle);
                active[36]=1;
                ends[36]=1;
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
    fillerNum_36 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[36] != 0){
      int index = 36;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[36]!=0 || suspended[36]!=0 || active[36]!=1);
      else{
        if(!df){
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          emergencyStop.gethook();
          rotaryTableTriggerFiller.gethook();
          liquidRatio.gethook();
          liquidVolumeDetector.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      emergencyStop.setpreclear();
      rotaryTableTriggerFiller.setpreclear();
      liquidRatio.setpreclear();
      liquidVolumeDetector.setpreclear();
      bottleFilled.setpreclear();
      valveInjectorOnOff1.setpreclear();
      valveInjectorOnOff2.setpreclear();
      valveInjectorOnOff3.setpreclear();
      valveInjectorOnOff4.setpreclear();
      valveInletOnOff1.setpreclear();
      valveInletOnOff2.setpreclear();
      valveInletOnOff3.setpreclear();
      valveInletOnOff4.setpreclear();
      dosUnitValveRetract1.setpreclear();
      dosUnitValveRetract2.setpreclear();
      dosUnitValveRetract3.setpreclear();
      dosUnitValveRetract4.setpreclear();
      dosUnitExtend1.setpreclear();
      dosUnitExtend2.setpreclear();
      dosUnitExtend3.setpreclear();
      dosUnitExtend4.setpreclear();
      idle.setpreclear();
      fillerNum_36.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      dummyint = emergencyStop.getStatus() ? emergencyStop.setprepresent() : emergencyStop.setpreclear();
      emergencyStop.setpreval(emergencyStop.getValue());
      emergencyStop.setClear();
      dummyint = rotaryTableTriggerFiller.getStatus() ? rotaryTableTriggerFiller.setprepresent() : rotaryTableTriggerFiller.setpreclear();
      rotaryTableTriggerFiller.setpreval(rotaryTableTriggerFiller.getValue());
      rotaryTableTriggerFiller.setClear();
      dummyint = liquidRatio.getStatus() ? liquidRatio.setprepresent() : liquidRatio.setpreclear();
      liquidRatio.setpreval(liquidRatio.getValue());
      liquidRatio.setClear();
      dummyint = liquidVolumeDetector.getStatus() ? liquidVolumeDetector.setprepresent() : liquidVolumeDetector.setpreclear();
      liquidVolumeDetector.setpreval(liquidVolumeDetector.getValue());
      liquidVolumeDetector.setClear();
      bottleFilled.sethook();
      bottleFilled.setClear();
      valveInjectorOnOff1.sethook();
      valveInjectorOnOff1.setClear();
      valveInjectorOnOff2.sethook();
      valveInjectorOnOff2.setClear();
      valveInjectorOnOff3.sethook();
      valveInjectorOnOff3.setClear();
      valveInjectorOnOff4.sethook();
      valveInjectorOnOff4.setClear();
      valveInletOnOff1.sethook();
      valveInletOnOff1.setClear();
      valveInletOnOff2.sethook();
      valveInletOnOff2.setClear();
      valveInletOnOff3.sethook();
      valveInletOnOff3.setClear();
      valveInletOnOff4.sethook();
      valveInletOnOff4.setClear();
      dosUnitValveRetract1.sethook();
      dosUnitValveRetract1.setClear();
      dosUnitValveRetract2.sethook();
      dosUnitValveRetract2.setClear();
      dosUnitValveRetract3.sethook();
      dosUnitValveRetract3.setClear();
      dosUnitValveRetract4.sethook();
      dosUnitValveRetract4.setClear();
      dosUnitExtend1.sethook();
      dosUnitExtend1.setClear();
      dosUnitExtend2.sethook();
      dosUnitExtend2.setClear();
      dosUnitExtend3.sethook();
      dosUnitExtend3.setClear();
      dosUnitExtend4.sethook();
      dosUnitExtend4.setClear();
      idle.sethook();
      idle.setClear();
      fillerNum_36.setClear();
      if(paused[36]!=0 || suspended[36]!=0 || active[36]!=1);
      else{
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        emergencyStop.gethook();
        rotaryTableTriggerFiller.gethook();
        liquidRatio.gethook();
        liquidVolumeDetector.gethook();
      }
      runFinisher();
      if(active[36] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
