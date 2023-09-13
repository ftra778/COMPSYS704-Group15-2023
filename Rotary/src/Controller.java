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
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal CapOnBottleAtPos1 = new Signal("CapOnBottleAtPos1", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal emergencyStop = new Signal("emergencyStop", Signal.INPUT);
  public Signal turn = new Signal("turn", Signal.OUTPUT);
  public Signal stop = new Signal("stop", Signal.OUTPUT);
  private Signal readyToTurn_1;
  private long __start_thread_7;//sysj\controller.sysj line: 22, column: 32
  private int S244 = 1;
  private int S82 = 1;
  private int S20 = 1;
  private int S6 = 1;
  private int S9 = 1;
  private int S234 = 1;
  private int S128 = 1;
  private int S88 = 1;
  private int S104 = 1;
  private int S242 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread264(int [] tdone, int [] ends){
        switch(S242){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(emergencyStop.getprestatus()){//sysj\controller.sysj line: 33, column: 15
          stop.setPresent();//sysj\controller.sysj line: 34, column: 9
          currsigs.addElement(stop);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread262(int [] tdone, int [] ends){
        switch(S104){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_7 >= (0.5) * 1000){//sysj\controller.sysj line: 22, column: 32
          ends[7]=3;
          ;//sysj\controller.sysj line: 22, column: 32
          ends[7]=2;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread261(int [] tdone, int [] ends){
        switch(S88){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        turn.setPresent();//sysj\controller.sysj line: 22, column: 14
        currsigs.addElement(turn);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread259(int [] tdone, int [] ends){
        S104=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 22, column: 32
    if(com.systemj.Timer.getMs() - __start_thread_7 >= (0.5) * 1000){//sysj\controller.sysj line: 22, column: 32
      ends[7]=3;
      ;//sysj\controller.sysj line: 22, column: 32
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread258(int [] tdone, int [] ends){
        S88=1;
    turn.setPresent();//sysj\controller.sysj line: 22, column: 14
    currsigs.addElement(turn);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread257(int [] tdone, int [] ends){
        switch(S234){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S128){
          case 0 : 
            if(readyToTurn_1.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\controller.sysj line: 19, column: 15
              S128=1;
              thread258(tdone,ends);
              thread259(tdone,ends);
              int biggest260 = 0;
              if(ends[6]>=biggest260){
                biggest260=ends[6];
              }
              if(ends[7]>=biggest260){
                biggest260=ends[7];
              }
              if(biggest260 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest260 == 2){
                ends[5]=2;
                ;//sysj\controller.sysj line: 21, column: 9
                stop.setPresent();//sysj\controller.sysj line: 25, column: 9
                currsigs.addElement(stop);
                S128=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            thread261(tdone,ends);
            thread262(tdone,ends);
            int biggest263 = 0;
            if(ends[6]>=biggest263){
              biggest263=ends[6];
            }
            if(ends[7]>=biggest263){
              biggest263=ends[7];
            }
            if(biggest263 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest263 == 2){
              ends[5]=2;
              ;//sysj\controller.sysj line: 21, column: 9
              stop.setPresent();//sysj\controller.sysj line: 25, column: 9
              currsigs.addElement(stop);
              S128=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest263 == 0){
              stop.setPresent();//sysj\controller.sysj line: 25, column: 9
              currsigs.addElement(stop);
              S128=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(!readyToTurn_1.getprestatus() || !rotaryTableTrigger.getprestatus()){//sysj\controller.sysj line: 26, column: 15
              S128=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread255(int [] tdone, int [] ends){
        switch(S9){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(emergencyStop.getprestatus() || CapOnBottleAtPos1.getprestatus() || bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 12, column: 46
          ends[4]=2;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread254(int [] tdone, int [] ends){
        switch(S6){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        readyToTurn_1.setPresent();//sysj\controller.sysj line: 12, column: 14
        currsigs.addElement(readyToTurn_1);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread252(int [] tdone, int [] ends){
        S9=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread251(int [] tdone, int [] ends){
        S6=1;
    readyToTurn_1.setPresent();//sysj\controller.sysj line: 12, column: 14
    currsigs.addElement(readyToTurn_1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread250(int [] tdone, int [] ends){
        switch(S82){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S20){
          case 0 : 
            if(tableAlignedWithSensor.getprestatus() && !CapOnBottleAtPos1.getprestatus() && !emergencyStop.getprestatus() && !bottleAtPos5.getprestatus()){//sysj\controller.sysj line: 10, column: 15
              S20=1;
              thread251(tdone,ends);
              thread252(tdone,ends);
              int biggest253 = 0;
              if(ends[3]>=biggest253){
                biggest253=ends[3];
              }
              if(ends[4]>=biggest253){
                biggest253=ends[4];
              }
              if(biggest253 == 1){
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
            thread254(tdone,ends);
            thread255(tdone,ends);
            int biggest256 = 0;
            if(ends[3]>=biggest256){
              biggest256=ends[3];
            }
            if(ends[4]>=biggest256){
              biggest256=ends[4];
            }
            if(biggest256 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest256 == 2){
              ends[2]=2;
              ;//sysj\controller.sysj line: 11, column: 9
              stop.setPresent();//sysj\controller.sysj line: 14, column: 9
              currsigs.addElement(stop);
              S20=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest256 == 0){
              stop.setPresent();//sysj\controller.sysj line: 14, column: 9
              currsigs.addElement(stop);
              S20=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread248(int [] tdone, int [] ends){
        S242=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread247(int [] tdone, int [] ends){
        S234=1;
    S128=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread246(int [] tdone, int [] ends){
        S82=1;
    S20=0;
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
      switch(S244){
        case 0 : 
          S244=0;
          break RUN;
        
        case 1 : 
          S244=2;
          S244=2;
          readyToTurn_1.setClear();//sysj\controller.sysj line: 6, column: 5
          thread246(tdone,ends);
          thread247(tdone,ends);
          thread248(tdone,ends);
          int biggest249 = 0;
          if(ends[2]>=biggest249){
            biggest249=ends[2];
          }
          if(ends[5]>=biggest249){
            biggest249=ends[5];
          }
          if(ends[8]>=biggest249){
            biggest249=ends[8];
          }
          if(biggest249 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          readyToTurn_1.setClear();//sysj\controller.sysj line: 6, column: 5
          thread250(tdone,ends);
          thread257(tdone,ends);
          thread264(tdone,ends);
          int biggest265 = 0;
          if(ends[2]>=biggest265){
            biggest265=ends[2];
          }
          if(ends[5]>=biggest265){
            biggest265=ends[5];
          }
          if(ends[8]>=biggest265){
            biggest265=ends[8];
          }
          if(biggest265 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest265 == 0){
            S244=0;
            active[1]=0;
            ends[1]=0;
            S244=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    readyToTurn_1 = new Signal();
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
          tableAlignedWithSensor.gethook();
          bottleAtPos5.gethook();
          CapOnBottleAtPos1.gethook();
          rotaryTableTrigger.gethook();
          emergencyStop.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      CapOnBottleAtPos1.setpreclear();
      rotaryTableTrigger.setpreclear();
      emergencyStop.setpreclear();
      turn.setpreclear();
      stop.setpreclear();
      readyToTurn_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = CapOnBottleAtPos1.getStatus() ? CapOnBottleAtPos1.setprepresent() : CapOnBottleAtPos1.setpreclear();
      CapOnBottleAtPos1.setpreval(CapOnBottleAtPos1.getValue());
      CapOnBottleAtPos1.setClear();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      dummyint = emergencyStop.getStatus() ? emergencyStop.setprepresent() : emergencyStop.setpreclear();
      emergencyStop.setpreval(emergencyStop.getValue());
      emergencyStop.setClear();
      turn.sethook();
      turn.setClear();
      stop.sethook();
      stop.setClear();
      readyToTurn_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        CapOnBottleAtPos1.gethook();
        rotaryTableTrigger.gethook();
        emergencyStop.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
