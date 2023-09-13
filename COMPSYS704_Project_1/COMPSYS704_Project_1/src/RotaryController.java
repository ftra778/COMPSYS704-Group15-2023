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
  private long __start_thread_23;//sysj\ABScontroller.sysj line: 102, column: 32
  private int S998 = 1;
  private int S591 = 1;
  private int S529 = 1;
  private int S515 = 1;
  private int S518 = 1;
  private int S743 = 1;
  private int S593 = 1;
  private int S598 = 1;
  private int S614 = 1;
  private int S751 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void thread31388(int [] tdone, int [] ends){
        switch(S751){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 113, column: 15
          stop.setPresent();//sysj\ABScontroller.sysj line: 114, column: 9
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

  public void thread31386(int [] tdone, int [] ends){
        switch(S614){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_23 >= (0.5) * 1000){//sysj\ABScontroller.sysj line: 102, column: 32
          ends[23]=3;
          ;//sysj\ABScontroller.sysj line: 102, column: 32
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

  public void thread31385(int [] tdone, int [] ends){
        switch(S598){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        turn.setPresent();//sysj\ABScontroller.sysj line: 102, column: 14
        currsigs.addElement(turn);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread31383(int [] tdone, int [] ends){
        S614=1;
    __start_thread_23 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 102, column: 32
    if(com.systemj.Timer.getMs() - __start_thread_23 >= (0.5) * 1000){//sysj\ABScontroller.sysj line: 102, column: 32
      ends[23]=3;
      ;//sysj\ABScontroller.sysj line: 102, column: 32
      ends[23]=2;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread31382(int [] tdone, int [] ends){
        S598=1;
    turn.setPresent();//sysj\ABScontroller.sysj line: 102, column: 14
    currsigs.addElement(turn);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread31381(int [] tdone, int [] ends){
        switch(S743){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S593){
          case 0 : 
            if(readyToTurn_17.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 98, column: 15
              System.out.println("rotaryTableTrigger");//sysj\ABScontroller.sysj line: 99, column: 9
              S593=1;
              thread31382(tdone,ends);
              thread31383(tdone,ends);
              int biggest31384 = 0;
              if(ends[22]>=biggest31384){
                biggest31384=ends[22];
              }
              if(ends[23]>=biggest31384){
                biggest31384=ends[23];
              }
              if(biggest31384 == 1){
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
              if(biggest31384 == 2){
                ends[21]=2;
                ;//sysj\ABScontroller.sysj line: 101, column: 9
                stop.setPresent();//sysj\ABScontroller.sysj line: 105, column: 9
                currsigs.addElement(stop);
                S593=2;
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
            thread31385(tdone,ends);
            thread31386(tdone,ends);
            int biggest31387 = 0;
            if(ends[22]>=biggest31387){
              biggest31387=ends[22];
            }
            if(ends[23]>=biggest31387){
              biggest31387=ends[23];
            }
            if(biggest31387 == 1){
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            if(biggest31387 == 2){
              ends[21]=2;
              ;//sysj\ABScontroller.sysj line: 101, column: 9
              stop.setPresent();//sysj\ABScontroller.sysj line: 105, column: 9
              currsigs.addElement(stop);
              S593=2;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            //FINXME code
            if(biggest31387 == 0){
              stop.setPresent();//sysj\ABScontroller.sysj line: 105, column: 9
              currsigs.addElement(stop);
              S593=2;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 2 : 
            if(!readyToTurn_17.getprestatus() || !rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 106, column: 15
              S593=0;
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

  public void thread31379(int [] tdone, int [] ends){
        switch(S518){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(emergencyStop.getprestatus() || CapOnBottleAtPos1.getprestatus() || bottleAtPos5.getprestatus()){//sysj\ABScontroller.sysj line: 90, column: 46
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

  public void thread31378(int [] tdone, int [] ends){
        switch(S515){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        readyToTurn_17.setPresent();//sysj\ABScontroller.sysj line: 90, column: 14
        currsigs.addElement(readyToTurn_17);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread31376(int [] tdone, int [] ends){
        S518=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread31375(int [] tdone, int [] ends){
        S515=1;
    readyToTurn_17.setPresent();//sysj\ABScontroller.sysj line: 90, column: 14
    currsigs.addElement(readyToTurn_17);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread31374(int [] tdone, int [] ends){
        switch(S591){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S529){
          case 0 : 
            if(tableAlignedWithSensor.getprestatus() && !CapOnBottleAtPos1.getprestatus() && !emergencyStop.getprestatus() && !bottleAtPos5.getprestatus()){//sysj\ABScontroller.sysj line: 88, column: 15
              S529=1;
              thread31375(tdone,ends);
              thread31376(tdone,ends);
              int biggest31377 = 0;
              if(ends[19]>=biggest31377){
                biggest31377=ends[19];
              }
              if(ends[20]>=biggest31377){
                biggest31377=ends[20];
              }
              if(biggest31377 == 1){
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
            thread31378(tdone,ends);
            thread31379(tdone,ends);
            int biggest31380 = 0;
            if(ends[19]>=biggest31380){
              biggest31380=ends[19];
            }
            if(ends[20]>=biggest31380){
              biggest31380=ends[20];
            }
            if(biggest31380 == 1){
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            if(biggest31380 == 2){
              ends[18]=2;
              ;//sysj\ABScontroller.sysj line: 89, column: 9
              System.out.println("readyToTurn");//sysj\ABScontroller.sysj line: 92, column: 9
              stop.setPresent();//sysj\ABScontroller.sysj line: 93, column: 9
              currsigs.addElement(stop);
              S529=0;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            //FINXME code
            if(biggest31380 == 0){
              System.out.println("readyToTurn");//sysj\ABScontroller.sysj line: 92, column: 9
              stop.setPresent();//sysj\ABScontroller.sysj line: 93, column: 9
              currsigs.addElement(stop);
              S529=0;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31372(int [] tdone, int [] ends){
        S751=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread31371(int [] tdone, int [] ends){
        S743=1;
    S593=0;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread31370(int [] tdone, int [] ends){
        S591=1;
    S529=0;
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
      switch(S998){
        case 0 : 
          S998=0;
          break RUN;
        
        case 1 : 
          S998=2;
          S998=2;
          System.out.println("RotaryController");//sysj\ABScontroller.sysj line: 83, column: 2
          readyToTurn_17.setClear();//sysj\ABScontroller.sysj line: 84, column: 5
          thread31370(tdone,ends);
          thread31371(tdone,ends);
          thread31372(tdone,ends);
          int biggest31373 = 0;
          if(ends[18]>=biggest31373){
            biggest31373=ends[18];
          }
          if(ends[21]>=biggest31373){
            biggest31373=ends[21];
          }
          if(ends[24]>=biggest31373){
            biggest31373=ends[24];
          }
          if(biggest31373 == 1){
            active[17]=1;
            ends[17]=1;
            break RUN;
          }
        
        case 2 : 
          readyToTurn_17.setClear();//sysj\ABScontroller.sysj line: 84, column: 5
          thread31374(tdone,ends);
          thread31381(tdone,ends);
          thread31388(tdone,ends);
          int biggest31389 = 0;
          if(ends[18]>=biggest31389){
            biggest31389=ends[18];
          }
          if(ends[21]>=biggest31389){
            biggest31389=ends[21];
          }
          if(ends[24]>=biggest31389){
            biggest31389=ends[24];
          }
          if(biggest31389 == 1){
            active[17]=1;
            ends[17]=1;
            break RUN;
          }
          //FINXME code
          if(biggest31389 == 0){
            S998=0;
            active[17]=0;
            ends[17]=0;
            S998=0;
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
