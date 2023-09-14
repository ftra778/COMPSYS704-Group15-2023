import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\controller.sysj line: 1, column: 1

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal emergencyStop = new Signal("emergencyStop", Signal.INPUT);
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
  private Signal fillerNum_1;
  private List liquids_thread_1;//sysj\controller.sysj line: 24, column: 18
  private long __start_thread_1;//sysj\controller.sysj line: 37, column: 33
  private int S11306 = 1;
  private int S3768 = 1;
  private int S3766 = 1;
  private int S2 = 1;
  private int S25 = 1;
  private int S7 = 1;
  private int S12 = 1;
  private int S27 = 1;
  private int S94 = 1;
  private int S99 = 1;
  private int S105 = 1;
  private int S110 = 1;
  private int S218 = 1;
  private int S223 = 1;
  private int S229 = 1;
  private int S234 = 1;
  private int S342 = 1;
  private int S347 = 1;
  private int S353 = 1;
  private int S358 = 1;
  private int S466 = 1;
  private int S471 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread11357(int [] tdone, int [] ends){
        S12=1;
    dosUnitValveRetract1.setPresent();//sysj\controller.sysj line: 32, column: 31
    currsigs.addElement(dosUnitValveRetract1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread11356(int [] tdone, int [] ends){
        S7=1;
    valveInjectorOnOff1.setPresent();//sysj\controller.sysj line: 30, column: 31
    currsigs.addElement(valveInjectorOnOff1);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread11354(int [] tdone, int [] ends){
        switch(S471){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        dosUnitExtend4.setPresent();//sysj\controller.sysj line: 94, column: 31
        currsigs.addElement(dosUnitExtend4);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread11353(int [] tdone, int [] ends){
        switch(S466){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        valveInletOnOff4.setPresent();//sysj\controller.sysj line: 92, column: 31
        currsigs.addElement(valveInletOnOff4);
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread11351(int [] tdone, int [] ends){
        S12=1;
    dosUnitValveRetract1.setPresent();//sysj\controller.sysj line: 32, column: 31
    currsigs.addElement(dosUnitValveRetract1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread11350(int [] tdone, int [] ends){
        S7=1;
    valveInjectorOnOff1.setPresent();//sysj\controller.sysj line: 30, column: 31
    currsigs.addElement(valveInjectorOnOff1);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread11348(int [] tdone, int [] ends){
        switch(S358){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract4.setPresent();//sysj\controller.sysj line: 85, column: 31
        currsigs.addElement(dosUnitValveRetract4);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread11347(int [] tdone, int [] ends){
        switch(S353){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff4.setPresent();//sysj\controller.sysj line: 83, column: 31
        currsigs.addElement(valveInjectorOnOff4);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread11345(int [] tdone, int [] ends){
        S358=1;
    dosUnitValveRetract4.setPresent();//sysj\controller.sysj line: 85, column: 31
    currsigs.addElement(dosUnitValveRetract4);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread11344(int [] tdone, int [] ends){
        S353=1;
    valveInjectorOnOff4.setPresent();//sysj\controller.sysj line: 83, column: 31
    currsigs.addElement(valveInjectorOnOff4);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread11342(int [] tdone, int [] ends){
        switch(S347){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        dosUnitExtend3.setPresent();//sysj\controller.sysj line: 76, column: 31
        currsigs.addElement(dosUnitExtend3);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread11341(int [] tdone, int [] ends){
        switch(S342){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        valveInletOnOff3.setPresent();//sysj\controller.sysj line: 74, column: 31
        currsigs.addElement(valveInletOnOff3);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread11339(int [] tdone, int [] ends){
        S358=1;
    dosUnitValveRetract4.setPresent();//sysj\controller.sysj line: 85, column: 31
    currsigs.addElement(dosUnitValveRetract4);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread11338(int [] tdone, int [] ends){
        S353=1;
    valveInjectorOnOff4.setPresent();//sysj\controller.sysj line: 83, column: 31
    currsigs.addElement(valveInjectorOnOff4);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread11336(int [] tdone, int [] ends){
        switch(S234){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract3.setPresent();//sysj\controller.sysj line: 67, column: 31
        currsigs.addElement(dosUnitValveRetract3);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread11335(int [] tdone, int [] ends){
        switch(S229){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff3.setPresent();//sysj\controller.sysj line: 65, column: 31
        currsigs.addElement(valveInjectorOnOff3);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread11333(int [] tdone, int [] ends){
        S234=1;
    dosUnitValveRetract3.setPresent();//sysj\controller.sysj line: 67, column: 31
    currsigs.addElement(dosUnitValveRetract3);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread11332(int [] tdone, int [] ends){
        S229=1;
    valveInjectorOnOff3.setPresent();//sysj\controller.sysj line: 65, column: 31
    currsigs.addElement(valveInjectorOnOff3);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread11330(int [] tdone, int [] ends){
        switch(S223){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        dosUnitExtend2.setPresent();//sysj\controller.sysj line: 59, column: 31
        currsigs.addElement(dosUnitExtend2);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread11329(int [] tdone, int [] ends){
        switch(S218){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        valveInletOnOff2.setPresent();//sysj\controller.sysj line: 57, column: 31
        currsigs.addElement(valveInletOnOff2);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread11327(int [] tdone, int [] ends){
        S234=1;
    dosUnitValveRetract3.setPresent();//sysj\controller.sysj line: 67, column: 31
    currsigs.addElement(dosUnitValveRetract3);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread11326(int [] tdone, int [] ends){
        S229=1;
    valveInjectorOnOff3.setPresent();//sysj\controller.sysj line: 65, column: 31
    currsigs.addElement(valveInjectorOnOff3);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread11324(int [] tdone, int [] ends){
        switch(S110){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract2.setPresent();//sysj\controller.sysj line: 50, column: 31
        currsigs.addElement(dosUnitValveRetract2);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread11323(int [] tdone, int [] ends){
        switch(S105){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff2.setPresent();//sysj\controller.sysj line: 48, column: 31
        currsigs.addElement(valveInjectorOnOff2);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread11321(int [] tdone, int [] ends){
        S110=1;
    dosUnitValveRetract2.setPresent();//sysj\controller.sysj line: 50, column: 31
    currsigs.addElement(dosUnitValveRetract2);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread11320(int [] tdone, int [] ends){
        S105=1;
    valveInjectorOnOff2.setPresent();//sysj\controller.sysj line: 48, column: 31
    currsigs.addElement(valveInjectorOnOff2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread11318(int [] tdone, int [] ends){
        switch(S99){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        dosUnitExtend1.setPresent();//sysj\controller.sysj line: 42, column: 31
        currsigs.addElement(dosUnitExtend1);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread11317(int [] tdone, int [] ends){
        switch(S94){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        valveInletOnOff1.setPresent();//sysj\controller.sysj line: 40, column: 31
        currsigs.addElement(valveInletOnOff1);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread11315(int [] tdone, int [] ends){
        S110=1;
    dosUnitValveRetract2.setPresent();//sysj\controller.sysj line: 50, column: 31
    currsigs.addElement(dosUnitValveRetract2);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread11314(int [] tdone, int [] ends){
        S105=1;
    valveInjectorOnOff2.setPresent();//sysj\controller.sysj line: 48, column: 31
    currsigs.addElement(valveInjectorOnOff2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread11312(int [] tdone, int [] ends){
        switch(S12){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract1.setPresent();//sysj\controller.sysj line: 32, column: 31
        currsigs.addElement(dosUnitValveRetract1);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread11311(int [] tdone, int [] ends){
        switch(S7){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff1.setPresent();//sysj\controller.sysj line: 30, column: 31
        currsigs.addElement(valveInjectorOnOff1);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread11309(int [] tdone, int [] ends){
        S12=1;
    dosUnitValveRetract1.setPresent();//sysj\controller.sysj line: 32, column: 31
    currsigs.addElement(dosUnitValveRetract1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread11308(int [] tdone, int [] ends){
        S7=1;
    valveInjectorOnOff1.setPresent();//sysj\controller.sysj line: 30, column: 31
    currsigs.addElement(valveInjectorOnOff1);
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
      switch(S11306){
        case 0 : 
          S11306=0;
          break RUN;
        
        case 1 : 
          S11306=2;
          S11306=2;
          fillerNum_1.setClear();//sysj\controller.sysj line: 15, column: 2
          S3768=0;
          if((emergencyStop.getprestatus())){//sysj\controller.sysj line: 19, column: 18
            S3768=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S3766=0;
            S2=0;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          fillerNum_1.setClear();//sysj\controller.sysj line: 15, column: 2
          switch(S3768){
            case 0 : 
              if((emergencyStop.getprestatus())){//sysj\controller.sysj line: 19, column: 18
                S3768=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                switch(S3766){
                  case 0 : 
                    switch(S2){
                      case 0 : 
                        if(bottleAtPos2.getprestatus()){//sysj\controller.sysj line: 22, column: 24
                          liquids_thread_1 = Arrays.asList((liquidRatio.getpreval() == null ? null : ((List)liquidRatio.getpreval())));//sysj\controller.sysj line: 24, column: 18
                          S2=1;
                          valveInjectorOnOff1.setPresent();//sysj\controller.sysj line: 28, column: 26
                          currsigs.addElement(valveInjectorOnOff1);
                          S25=0;
                          if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 29, column: 41
                            System.out.println("Filler: 1, Fill Percent: " + (int)liquids_thread_1.get(0) + "%");//sysj\controller.sysj line: 36, column: 26
                            S25=1;
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 37, column: 33
                            S27=0;
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 37, column: 33
                              ends[1]=9;
                              ;//sysj\controller.sysj line: 37, column: 33
                              ends[1]=11;
                              ;//sysj\controller.sysj line: 26, column: 18
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 20, column: 10
                              System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                              bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                              currsigs.addElement(bottleFilled);
                              S3766=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S27=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread11308(tdone,ends);
                            thread11309(tdone,ends);
                            int biggest11310 = 0;
                            if(ends[2]>=biggest11310){
                              biggest11310=ends[2];
                            }
                            if(ends[3]>=biggest11310){
                              biggest11310=ends[3];
                            }
                            if(biggest11310 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        switch(S25){
                          case 0 : 
                            if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 29, column: 41
                              System.out.println("Filler: 1, Fill Percent: " + (int)liquids_thread_1.get(0) + "%");//sysj\controller.sysj line: 36, column: 26
                              S25=1;
                              __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 37, column: 33
                              S27=0;
                              if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 37, column: 33
                                ends[1]=9;
                                ;//sysj\controller.sysj line: 37, column: 33
                                ends[1]=11;
                                ;//sysj\controller.sysj line: 26, column: 18
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 20, column: 10
                                System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                currsigs.addElement(bottleFilled);
                                S3766=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S27=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread11311(tdone,ends);
                              thread11312(tdone,ends);
                              int biggest11313 = 0;
                              if(ends[2]>=biggest11313){
                                biggest11313=ends[2];
                              }
                              if(ends[3]>=biggest11313){
                                biggest11313=ends[3];
                              }
                              if(biggest11313 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest11313 == 0){
                                System.out.println("Filler: 1, Fill Percent: " + (int)liquids_thread_1.get(0) + "%");//sysj\controller.sysj line: 36, column: 26
                                S25=1;
                                __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 37, column: 33
                                S27=0;
                                if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 37, column: 33
                                  ends[1]=9;
                                  ;//sysj\controller.sysj line: 37, column: 33
                                  ends[1]=11;
                                  ;//sysj\controller.sysj line: 26, column: 18
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 10
                                  System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                  bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                  currsigs.addElement(bottleFilled);
                                  S3766=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S27=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          
                          case 1 : 
                            switch(S27){
                              case 0 : 
                                S27=0;
                                if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 37, column: 33
                                  ends[1]=9;
                                  ;//sysj\controller.sysj line: 37, column: 33
                                  ends[1]=11;
                                  ;//sysj\controller.sysj line: 26, column: 18
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 10
                                  System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                  bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                  currsigs.addElement(bottleFilled);
                                  S3766=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S27=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                              case 1 : 
                                S27=1;
                                S27=0;
                                if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 37, column: 33
                                  ends[1]=9;
                                  ;//sysj\controller.sysj line: 37, column: 33
                                  ends[1]=11;
                                  ;//sysj\controller.sysj line: 26, column: 18
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 10
                                  System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                  bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                  currsigs.addElement(bottleFilled);
                                  S3766=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S27=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              
                            }
                            break;
                          
                          case 2 : 
                            if((dosUnitEvac.getprestatus())){//sysj\controller.sysj line: 39, column: 41
                              valveInjectorOnOff2.setPresent();//sysj\controller.sysj line: 46, column: 26
                              currsigs.addElement(valveInjectorOnOff2);
                              S25=3;
                              if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 47, column: 41
                                System.out.println("Filler: 2, Fill Percent: " + (int)liquids_thread_1.get(1) + "%");//sysj\controller.sysj line: 53, column: 26
                                S25=4;
                                __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 54, column: 33
                                if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 54, column: 33
                                  ends[1]=7;
                                  ;//sysj\controller.sysj line: 54, column: 33
                                  ends[1]=11;
                                  ;//sysj\controller.sysj line: 26, column: 18
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 10
                                  System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                  bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                  currsigs.addElement(bottleFilled);
                                  S3766=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread11314(tdone,ends);
                                thread11315(tdone,ends);
                                int biggest11316 = 0;
                                if(ends[6]>=biggest11316){
                                  biggest11316=ends[6];
                                }
                                if(ends[7]>=biggest11316){
                                  biggest11316=ends[7];
                                }
                                if(biggest11316 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread11317(tdone,ends);
                              thread11318(tdone,ends);
                              int biggest11319 = 0;
                              if(ends[4]>=biggest11319){
                                biggest11319=ends[4];
                              }
                              if(ends[5]>=biggest11319){
                                biggest11319=ends[5];
                              }
                              if(biggest11319 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest11319 == 0){
                                valveInjectorOnOff2.setPresent();//sysj\controller.sysj line: 46, column: 26
                                currsigs.addElement(valveInjectorOnOff2);
                                S25=3;
                                if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 47, column: 41
                                  System.out.println("Filler: 2, Fill Percent: " + (int)liquids_thread_1.get(1) + "%");//sysj\controller.sysj line: 53, column: 26
                                  S25=4;
                                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 54, column: 33
                                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 54, column: 33
                                    ends[1]=7;
                                    ;//sysj\controller.sysj line: 54, column: 33
                                    ends[1]=11;
                                    ;//sysj\controller.sysj line: 26, column: 18
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 20, column: 10
                                    System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                    bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                    currsigs.addElement(bottleFilled);
                                    S3766=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread11320(tdone,ends);
                                  thread11321(tdone,ends);
                                  int biggest11322 = 0;
                                  if(ends[6]>=biggest11322){
                                    biggest11322=ends[6];
                                  }
                                  if(ends[7]>=biggest11322){
                                    biggest11322=ends[7];
                                  }
                                  if(biggest11322 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                          
                          case 3 : 
                            if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 47, column: 41
                              System.out.println("Filler: 2, Fill Percent: " + (int)liquids_thread_1.get(1) + "%");//sysj\controller.sysj line: 53, column: 26
                              S25=4;
                              __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 54, column: 33
                              if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 54, column: 33
                                ends[1]=7;
                                ;//sysj\controller.sysj line: 54, column: 33
                                ends[1]=11;
                                ;//sysj\controller.sysj line: 26, column: 18
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 20, column: 10
                                System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                currsigs.addElement(bottleFilled);
                                S3766=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread11323(tdone,ends);
                              thread11324(tdone,ends);
                              int biggest11325 = 0;
                              if(ends[6]>=biggest11325){
                                biggest11325=ends[6];
                              }
                              if(ends[7]>=biggest11325){
                                biggest11325=ends[7];
                              }
                              if(biggest11325 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest11325 == 0){
                                System.out.println("Filler: 2, Fill Percent: " + (int)liquids_thread_1.get(1) + "%");//sysj\controller.sysj line: 53, column: 26
                                S25=4;
                                __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 54, column: 33
                                if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 54, column: 33
                                  ends[1]=7;
                                  ;//sysj\controller.sysj line: 54, column: 33
                                  ends[1]=11;
                                  ;//sysj\controller.sysj line: 26, column: 18
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 10
                                  System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                  bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                  currsigs.addElement(bottleFilled);
                                  S3766=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          
                          case 4 : 
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 54, column: 33
                              ends[1]=7;
                              ;//sysj\controller.sysj line: 54, column: 33
                              ends[1]=11;
                              ;//sysj\controller.sysj line: 26, column: 18
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 20, column: 10
                              System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                              bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                              currsigs.addElement(bottleFilled);
                              S3766=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          
                          case 5 : 
                            if((dosUnitEvac.getprestatus())){//sysj\controller.sysj line: 56, column: 41
                              valveInjectorOnOff3.setPresent();//sysj\controller.sysj line: 63, column: 26
                              currsigs.addElement(valveInjectorOnOff3);
                              S25=6;
                              if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 64, column: 41
                                System.out.println("Filler: 3, Fill Percent: " + (int)liquids_thread_1.get(2) + "%");//sysj\controller.sysj line: 70, column: 26
                                S25=7;
                                __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 71, column: 33
                                if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 71, column: 33
                                  ends[1]=5;
                                  ;//sysj\controller.sysj line: 71, column: 33
                                  ends[1]=11;
                                  ;//sysj\controller.sysj line: 26, column: 18
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 10
                                  System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                  bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                  currsigs.addElement(bottleFilled);
                                  S3766=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread11326(tdone,ends);
                                thread11327(tdone,ends);
                                int biggest11328 = 0;
                                if(ends[10]>=biggest11328){
                                  biggest11328=ends[10];
                                }
                                if(ends[11]>=biggest11328){
                                  biggest11328=ends[11];
                                }
                                if(biggest11328 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread11329(tdone,ends);
                              thread11330(tdone,ends);
                              int biggest11331 = 0;
                              if(ends[8]>=biggest11331){
                                biggest11331=ends[8];
                              }
                              if(ends[9]>=biggest11331){
                                biggest11331=ends[9];
                              }
                              if(biggest11331 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest11331 == 0){
                                valveInjectorOnOff3.setPresent();//sysj\controller.sysj line: 63, column: 26
                                currsigs.addElement(valveInjectorOnOff3);
                                S25=6;
                                if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 64, column: 41
                                  System.out.println("Filler: 3, Fill Percent: " + (int)liquids_thread_1.get(2) + "%");//sysj\controller.sysj line: 70, column: 26
                                  S25=7;
                                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 71, column: 33
                                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 71, column: 33
                                    ends[1]=5;
                                    ;//sysj\controller.sysj line: 71, column: 33
                                    ends[1]=11;
                                    ;//sysj\controller.sysj line: 26, column: 18
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 20, column: 10
                                    System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                    bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                    currsigs.addElement(bottleFilled);
                                    S3766=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread11332(tdone,ends);
                                  thread11333(tdone,ends);
                                  int biggest11334 = 0;
                                  if(ends[10]>=biggest11334){
                                    biggest11334=ends[10];
                                  }
                                  if(ends[11]>=biggest11334){
                                    biggest11334=ends[11];
                                  }
                                  if(biggest11334 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                          
                          case 6 : 
                            if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 64, column: 41
                              System.out.println("Filler: 3, Fill Percent: " + (int)liquids_thread_1.get(2) + "%");//sysj\controller.sysj line: 70, column: 26
                              S25=7;
                              __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 71, column: 33
                              if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 71, column: 33
                                ends[1]=5;
                                ;//sysj\controller.sysj line: 71, column: 33
                                ends[1]=11;
                                ;//sysj\controller.sysj line: 26, column: 18
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 20, column: 10
                                System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                currsigs.addElement(bottleFilled);
                                S3766=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread11335(tdone,ends);
                              thread11336(tdone,ends);
                              int biggest11337 = 0;
                              if(ends[10]>=biggest11337){
                                biggest11337=ends[10];
                              }
                              if(ends[11]>=biggest11337){
                                biggest11337=ends[11];
                              }
                              if(biggest11337 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest11337 == 0){
                                System.out.println("Filler: 3, Fill Percent: " + (int)liquids_thread_1.get(2) + "%");//sysj\controller.sysj line: 70, column: 26
                                S25=7;
                                __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 71, column: 33
                                if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 71, column: 33
                                  ends[1]=5;
                                  ;//sysj\controller.sysj line: 71, column: 33
                                  ends[1]=11;
                                  ;//sysj\controller.sysj line: 26, column: 18
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 10
                                  System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                  bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                  currsigs.addElement(bottleFilled);
                                  S3766=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          
                          case 7 : 
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 71, column: 33
                              ends[1]=5;
                              ;//sysj\controller.sysj line: 71, column: 33
                              ends[1]=11;
                              ;//sysj\controller.sysj line: 26, column: 18
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 20, column: 10
                              System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                              bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                              currsigs.addElement(bottleFilled);
                              S3766=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          
                          case 8 : 
                            if((dosUnitEvac.getprestatus())){//sysj\controller.sysj line: 73, column: 41
                              valveInjectorOnOff4.setPresent();//sysj\controller.sysj line: 81, column: 26
                              currsigs.addElement(valveInjectorOnOff4);
                              S25=9;
                              if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 82, column: 41
                                System.out.println("Filler: 4, Fill Percent: " + (int)liquids_thread_1.get(3) + "%");//sysj\controller.sysj line: 88, column: 26
                                S25=10;
                                __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 89, column: 33
                                if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 89, column: 33
                                  ends[1]=3;
                                  ;//sysj\controller.sysj line: 89, column: 33
                                  ends[1]=11;
                                  ;//sysj\controller.sysj line: 26, column: 18
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 10
                                  System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                  bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                  currsigs.addElement(bottleFilled);
                                  S3766=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread11338(tdone,ends);
                                thread11339(tdone,ends);
                                int biggest11340 = 0;
                                if(ends[14]>=biggest11340){
                                  biggest11340=ends[14];
                                }
                                if(ends[15]>=biggest11340){
                                  biggest11340=ends[15];
                                }
                                if(biggest11340 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread11341(tdone,ends);
                              thread11342(tdone,ends);
                              int biggest11343 = 0;
                              if(ends[12]>=biggest11343){
                                biggest11343=ends[12];
                              }
                              if(ends[13]>=biggest11343){
                                biggest11343=ends[13];
                              }
                              if(biggest11343 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest11343 == 0){
                                valveInjectorOnOff4.setPresent();//sysj\controller.sysj line: 81, column: 26
                                currsigs.addElement(valveInjectorOnOff4);
                                S25=9;
                                if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 82, column: 41
                                  System.out.println("Filler: 4, Fill Percent: " + (int)liquids_thread_1.get(3) + "%");//sysj\controller.sysj line: 88, column: 26
                                  S25=10;
                                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 89, column: 33
                                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 89, column: 33
                                    ends[1]=3;
                                    ;//sysj\controller.sysj line: 89, column: 33
                                    ends[1]=11;
                                    ;//sysj\controller.sysj line: 26, column: 18
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 20, column: 10
                                    System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                    bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                    currsigs.addElement(bottleFilled);
                                    S3766=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread11344(tdone,ends);
                                  thread11345(tdone,ends);
                                  int biggest11346 = 0;
                                  if(ends[14]>=biggest11346){
                                    biggest11346=ends[14];
                                  }
                                  if(ends[15]>=biggest11346){
                                    biggest11346=ends[15];
                                  }
                                  if(biggest11346 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                            }
                          
                          case 9 : 
                            if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 82, column: 41
                              System.out.println("Filler: 4, Fill Percent: " + (int)liquids_thread_1.get(3) + "%");//sysj\controller.sysj line: 88, column: 26
                              S25=10;
                              __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 89, column: 33
                              if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 89, column: 33
                                ends[1]=3;
                                ;//sysj\controller.sysj line: 89, column: 33
                                ends[1]=11;
                                ;//sysj\controller.sysj line: 26, column: 18
                                ends[1]=2;
                                ;//sysj\controller.sysj line: 20, column: 10
                                System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                currsigs.addElement(bottleFilled);
                                S3766=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread11347(tdone,ends);
                              thread11348(tdone,ends);
                              int biggest11349 = 0;
                              if(ends[14]>=biggest11349){
                                biggest11349=ends[14];
                              }
                              if(ends[15]>=biggest11349){
                                biggest11349=ends[15];
                              }
                              if(biggest11349 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest11349 == 0){
                                System.out.println("Filler: 4, Fill Percent: " + (int)liquids_thread_1.get(3) + "%");//sysj\controller.sysj line: 88, column: 26
                                S25=10;
                                __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 89, column: 33
                                if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 89, column: 33
                                  ends[1]=3;
                                  ;//sysj\controller.sysj line: 89, column: 33
                                  ends[1]=11;
                                  ;//sysj\controller.sysj line: 26, column: 18
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 10
                                  System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                  bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                  currsigs.addElement(bottleFilled);
                                  S3766=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          
                          case 10 : 
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 89, column: 33
                              ends[1]=3;
                              ;//sysj\controller.sysj line: 89, column: 33
                              ends[1]=11;
                              ;//sysj\controller.sysj line: 26, column: 18
                              ends[1]=2;
                              ;//sysj\controller.sysj line: 20, column: 10
                              System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                              bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                              currsigs.addElement(bottleFilled);
                              S3766=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          
                          case 11 : 
                            if((dosUnitEvac.getprestatus())){//sysj\controller.sysj line: 91, column: 41
                              valveInjectorOnOff1.setPresent();//sysj\controller.sysj line: 28, column: 26
                              currsigs.addElement(valveInjectorOnOff1);
                              S25=0;
                              if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 29, column: 41
                                System.out.println("Filler: 1, Fill Percent: " + (int)liquids_thread_1.get(0) + "%");//sysj\controller.sysj line: 36, column: 26
                                S25=1;
                                __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 37, column: 33
                                S27=0;
                                if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 37, column: 33
                                  ends[1]=9;
                                  ;//sysj\controller.sysj line: 37, column: 33
                                  ends[1]=11;
                                  ;//sysj\controller.sysj line: 26, column: 18
                                  ends[1]=2;
                                  ;//sysj\controller.sysj line: 20, column: 10
                                  System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                  bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                  currsigs.addElement(bottleFilled);
                                  S3766=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S27=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread11350(tdone,ends);
                                thread11351(tdone,ends);
                                int biggest11352 = 0;
                                if(ends[2]>=biggest11352){
                                  biggest11352=ends[2];
                                }
                                if(ends[3]>=biggest11352){
                                  biggest11352=ends[3];
                                }
                                if(biggest11352 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread11353(tdone,ends);
                              thread11354(tdone,ends);
                              int biggest11355 = 0;
                              if(ends[16]>=biggest11355){
                                biggest11355=ends[16];
                              }
                              if(ends[17]>=biggest11355){
                                biggest11355=ends[17];
                              }
                              if(biggest11355 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest11355 == 0){
                                valveInjectorOnOff1.setPresent();//sysj\controller.sysj line: 28, column: 26
                                currsigs.addElement(valveInjectorOnOff1);
                                S25=0;
                                if((dosUnitFilled.getprestatus())){//sysj\controller.sysj line: 29, column: 41
                                  System.out.println("Filler: 1, Fill Percent: " + (int)liquids_thread_1.get(0) + "%");//sysj\controller.sysj line: 36, column: 26
                                  S25=1;
                                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 37, column: 33
                                  S27=0;
                                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (1) * 1000){//sysj\controller.sysj line: 37, column: 33
                                    ends[1]=9;
                                    ;//sysj\controller.sysj line: 37, column: 33
                                    ends[1]=11;
                                    ;//sysj\controller.sysj line: 26, column: 18
                                    ends[1]=2;
                                    ;//sysj\controller.sysj line: 20, column: 10
                                    System.out.println("Bottle filled at pos 2");//sysj\controller.sysj line: 102, column: 10
                                    bottleFilled.setPresent();//sysj\controller.sysj line: 103, column: 10
                                    currsigs.addElement(bottleFilled);
                                    S3766=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S27=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread11356(tdone,ends);
                                  thread11357(tdone,ends);
                                  int biggest11358 = 0;
                                  if(ends[2]>=biggest11358){
                                    biggest11358=ends[2];
                                  }
                                  if(ends[3]>=biggest11358){
                                    biggest11358=ends[3];
                                  }
                                  if(biggest11358 == 1){
                                    active[1]=1;
                                    ends[1]=1;
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
                    S3766=1;
                    S3768=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  
                }
              }
              break;
            
            case 1 : 
              S3768=1;
              S3768=0;
              if((emergencyStop.getprestatus())){//sysj\controller.sysj line: 19, column: 18
                S3768=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S3766=0;
                S2=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    fillerNum_1 = new Signal();
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
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          emergencyStop.gethook();
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
      fillerNum_1.setpreclear();
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
      fillerNum_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        emergencyStop.gethook();
        liquidRatio.gethook();
        liquidVolumeDetector.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
