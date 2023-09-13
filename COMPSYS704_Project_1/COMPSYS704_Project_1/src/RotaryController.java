import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\ABScontroller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABScontroller.sysj line: 2, column: 1

public class RotaryController extends ClockDomain{
  public RotaryController(String name){super(name);}
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
  private Signal readyToTurn_17;
  private long __start_thread_23;//sysj\ABScontroller.sysj line: 110, column: 32
  private int S1004 = 1;
  private int S597 = 1;
  private int S535 = 1;
  private int S521 = 1;
  private int S524 = 1;
  private int S749 = 1;
  private int S599 = 1;
  private int S604 = 1;
  private int S620 = 1;
  private int S757 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void thread31394(int [] tdone, int [] ends){
        switch(S757){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 121, column: 15
          stop.setPresent();//sysj\ABScontroller.sysj line: 122, column: 9
          currsigs.addElement(stop);
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread31392(int [] tdone, int [] ends){
        switch(S620){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_23 >= (0.5) * 1000){//sysj\ABScontroller.sysj line: 110, column: 32
          ends[23]=3;
          ;//sysj\ABScontroller.sysj line: 110, column: 32
          ends[23]=2;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread31391(int [] tdone, int [] ends){
        switch(S604){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        turn.setPresent();//sysj\ABScontroller.sysj line: 110, column: 14
        currsigs.addElement(turn);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread31389(int [] tdone, int [] ends){
        S620=1;
    __start_thread_23 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 110, column: 32
    if(com.systemj.Timer.getMs() - __start_thread_23 >= (0.5) * 1000){//sysj\ABScontroller.sysj line: 110, column: 32
      ends[23]=3;
      ;//sysj\ABScontroller.sysj line: 110, column: 32
      ends[23]=2;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread31388(int [] tdone, int [] ends){
        S604=1;
    turn.setPresent();//sysj\ABScontroller.sysj line: 110, column: 14
    currsigs.addElement(turn);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31387(int [] tdone, int [] ends){
        switch(S749){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S599){
          case 0 : 
            if(readyToTurn_17.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 106, column: 15
              System.out.println("rotaryTableTrigger");//sysj\ABScontroller.sysj line: 107, column: 9
              S599=1;
              thread31388(tdone,ends);
              thread31389(tdone,ends);
              int biggest31390 = 0;
              if(ends[22]>=biggest31390){
                biggest31390=ends[22];
              }
              if(ends[23]>=biggest31390){
                biggest31390=ends[23];
              }
              if(biggest31390 == 1){
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              if(biggest31390 == 2){
                ends[21]=2;
                ;//sysj\ABScontroller.sysj line: 109, column: 9
                stop.setPresent();//sysj\ABScontroller.sysj line: 113, column: 9
                currsigs.addElement(stop);
                S599=2;
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
            }
            else {
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            thread31391(tdone,ends);
            thread31392(tdone,ends);
            int biggest31393 = 0;
            if(ends[22]>=biggest31393){
              biggest31393=ends[22];
            }
            if(ends[23]>=biggest31393){
              biggest31393=ends[23];
            }
            if(biggest31393 == 1){
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            if(biggest31393 == 2){
              ends[21]=2;
              ;//sysj\ABScontroller.sysj line: 109, column: 9
              stop.setPresent();//sysj\ABScontroller.sysj line: 113, column: 9
              currsigs.addElement(stop);
              S599=2;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            //FINXME code
            if(biggest31393 == 0){
              stop.setPresent();//sysj\ABScontroller.sysj line: 113, column: 9
              currsigs.addElement(stop);
              S599=2;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 2 : 
            if(!readyToTurn_17.getprestatus() || !rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 114, column: 15
              S599=0;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            else {
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31385(int [] tdone, int [] ends){
        switch(S524){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(emergencyStop.getprestatus() || CapOnBottleAtPos1.getprestatus() || bottleAtPos5.getprestatus()){//sysj\ABScontroller.sysj line: 98, column: 46
          ends[20]=2;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread31384(int [] tdone, int [] ends){
        switch(S521){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        readyToTurn_17.setPresent();//sysj\ABScontroller.sysj line: 98, column: 14
        currsigs.addElement(readyToTurn_17);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread31382(int [] tdone, int [] ends){
        S524=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31381(int [] tdone, int [] ends){
        S521=1;
    readyToTurn_17.setPresent();//sysj\ABScontroller.sysj line: 98, column: 14
    currsigs.addElement(readyToTurn_17);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread31380(int [] tdone, int [] ends){
        switch(S597){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S535){
          case 0 : 
            if(tableAlignedWithSensor.getprestatus() && !CapOnBottleAtPos1.getprestatus() && !emergencyStop.getprestatus() && !bottleAtPos5.getprestatus()){//sysj\ABScontroller.sysj line: 96, column: 15
              S535=1;
              thread31381(tdone,ends);
              thread31382(tdone,ends);
              int biggest31383 = 0;
              if(ends[19]>=biggest31383){
                biggest31383=ends[19];
              }
              if(ends[20]>=biggest31383){
                biggest31383=ends[20];
              }
              if(biggest31383 == 1){
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
            }
            else {
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            thread31384(tdone,ends);
            thread31385(tdone,ends);
            int biggest31386 = 0;
            if(ends[19]>=biggest31386){
              biggest31386=ends[19];
            }
            if(ends[20]>=biggest31386){
              biggest31386=ends[20];
            }
            if(biggest31386 == 1){
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            if(biggest31386 == 2){
              ends[18]=2;
              ;//sysj\ABScontroller.sysj line: 97, column: 9
              System.out.println("readyToTurn");//sysj\ABScontroller.sysj line: 100, column: 9
              stop.setPresent();//sysj\ABScontroller.sysj line: 101, column: 9
              currsigs.addElement(stop);
              S535=0;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            //FINXME code
            if(biggest31386 == 0){
              System.out.println("readyToTurn");//sysj\ABScontroller.sysj line: 100, column: 9
              stop.setPresent();//sysj\ABScontroller.sysj line: 101, column: 9
              currsigs.addElement(stop);
              S535=0;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31378(int [] tdone, int [] ends){
        S757=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread31377(int [] tdone, int [] ends){
        S749=1;
    S599=0;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31376(int [] tdone, int [] ends){
        S597=1;
    S535=0;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1004){
        case 0 : 
          S1004=0;
          break RUN;
        
        case 1 : 
          S1004=2;
          S1004=2;
          System.out.println("RotaryController");//sysj\ABScontroller.sysj line: 91, column: 2
          readyToTurn_17.setClear();//sysj\ABScontroller.sysj line: 92, column: 5
          thread31376(tdone,ends);
          thread31377(tdone,ends);
          thread31378(tdone,ends);
          int biggest31379 = 0;
          if(ends[18]>=biggest31379){
            biggest31379=ends[18];
          }
          if(ends[21]>=biggest31379){
            biggest31379=ends[21];
          }
          if(ends[24]>=biggest31379){
            biggest31379=ends[24];
          }
          if(biggest31379 == 1){
            active[17]=1;
            ends[17]=1;
            break RUN;
          }
        
        case 2 : 
          readyToTurn_17.setClear();//sysj\ABScontroller.sysj line: 92, column: 5
          thread31380(tdone,ends);
          thread31387(tdone,ends);
          thread31394(tdone,ends);
          int biggest31395 = 0;
          if(ends[18]>=biggest31395){
            biggest31395=ends[18];
          }
          if(ends[21]>=biggest31395){
            biggest31395=ends[21];
          }
          if(ends[24]>=biggest31395){
            biggest31395=ends[24];
          }
          if(biggest31395 == 1){
            active[17]=1;
            ends[17]=1;
            break RUN;
          }
          //FINXME code
          if(biggest31395 == 0){
            S1004=0;
            active[17]=0;
            ends[17]=0;
            S1004=0;
            break RUN;
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
    readyToTurn_17 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[17] != 0){
      int index = 17;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[17]!=0 || suspended[17]!=0 || active[17]!=1);
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
      readyToTurn_17.setpreclear();
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
      readyToTurn_17.setClear();
      if(paused[17]!=0 || suspended[17]!=0 || active[17]!=1);
      else{
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        CapOnBottleAtPos1.gethook();
        rotaryTableTrigger.gethook();
        emergencyStop.gethook();
      }
      runFinisher();
      if(active[17] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
