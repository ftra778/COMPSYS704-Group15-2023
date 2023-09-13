import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\ABScontroller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABScontroller.sysj line: 2, column: 1

public class ABSCoordinator extends ClockDomain{
  public ABSCoordinator(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal emergency = new Signal("emergency", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal bottleInTable = new Signal("bottleInTable", Signal.INPUT);
  public Signal bottleFilled = new Signal("bottleFilled", Signal.INPUT);
  public Signal bottleCapOn = new Signal("bottleCapOn", Signal.INPUT);
  public Signal bottleCapped = new Signal("bottleCapped", Signal.INPUT);
  public Signal orderPOS = new Signal("orderPOS", Signal.INPUT);
  public Signal presence = new Signal("presence", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public Signal emergencyConveyor = new Signal("emergencyConveyor", Signal.OUTPUT);
  public Signal emergencyRotary = new Signal("emergencyRotary", Signal.OUTPUT);
  public Signal emergencyFiller = new Signal("emergencyFiller", Signal.OUTPUT);
  public Signal emergencyCapLoader = new Signal("emergencyCapLoader", Signal.OUTPUT);
  public Signal emergencyCapper = new Signal("emergencyCapper", Signal.OUTPUT);
  public Signal emergencyPOS = new Signal("emergencyPOS", Signal.OUTPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal tableAlignedWithSensors = new Signal("tableAlignedWithSensors", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal order = new Signal("order", Signal.OUTPUT);
  private int S212 = 1;
  private int S10 = 1;
  private int S21 = 1;
  private int S32 = 1;
  private int S43 = 1;
  private int S210 = 1;
  private int S98 = 1;
  private int S48 = 1;
  private int S53 = 1;
  private int S58 = 1;
  private int S63 = 1;
  private int S68 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void thread31361(int [] tdone, int [] ends){
        S68=1;
    emergencyCapper.setPresent();//sysj\ABScontroller.sysj line: 47, column: 140
    currsigs.addElement(emergencyCapper);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread31360(int [] tdone, int [] ends){
        S63=1;
    emergencyCapLoader.setPresent();//sysj\ABScontroller.sysj line: 47, column: 105
    currsigs.addElement(emergencyCapLoader);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread31359(int [] tdone, int [] ends){
        S58=1;
    emergencyFiller.setPresent();//sysj\ABScontroller.sysj line: 47, column: 73
    currsigs.addElement(emergencyFiller);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread31358(int [] tdone, int [] ends){
        S53=1;
    emergencyRotary.setPresent();//sysj\ABScontroller.sysj line: 47, column: 41
    currsigs.addElement(emergencyRotary);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread31357(int [] tdone, int [] ends){
        S48=1;
    emergencyConveyor.setPresent();//sysj\ABScontroller.sysj line: 47, column: 7
    currsigs.addElement(emergencyConveyor);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread31355(int [] tdone, int [] ends){
        switch(S68){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        emergencyCapper.setPresent();//sysj\ABScontroller.sysj line: 47, column: 140
        currsigs.addElement(emergencyCapper);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread31354(int [] tdone, int [] ends){
        switch(S63){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        emergencyCapLoader.setPresent();//sysj\ABScontroller.sysj line: 47, column: 105
        currsigs.addElement(emergencyCapLoader);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread31353(int [] tdone, int [] ends){
        switch(S58){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        emergencyFiller.setPresent();//sysj\ABScontroller.sysj line: 47, column: 73
        currsigs.addElement(emergencyFiller);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread31352(int [] tdone, int [] ends){
        switch(S53){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        emergencyRotary.setPresent();//sysj\ABScontroller.sysj line: 47, column: 41
        currsigs.addElement(emergencyRotary);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread31351(int [] tdone, int [] ends){
        switch(S48){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        emergencyConveyor.setPresent();//sysj\ABScontroller.sysj line: 47, column: 7
        currsigs.addElement(emergencyConveyor);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread31350(int [] tdone, int [] ends){
        switch(S210){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S98){
          case 0 : 
            if(!emergency.getprestatus()){//sysj\ABScontroller.sysj line: 46, column: 10
              S98=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              thread31351(tdone,ends);
              thread31352(tdone,ends);
              thread31353(tdone,ends);
              thread31354(tdone,ends);
              thread31355(tdone,ends);
              int biggest31356 = 0;
              if(ends[7]>=biggest31356){
                biggest31356=ends[7];
              }
              if(ends[8]>=biggest31356){
                biggest31356=ends[8];
              }
              if(ends[9]>=biggest31356){
                biggest31356=ends[9];
              }
              if(ends[10]>=biggest31356){
                biggest31356=ends[10];
              }
              if(ends[11]>=biggest31356){
                biggest31356=ends[11];
              }
              if(biggest31356 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              //FINXME code
              if(biggest31356 == 0){
                S98=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            break;
          
          case 1 : 
            S98=1;
            S98=0;
            if(emergency.getprestatus()){//sysj\ABScontroller.sysj line: 44, column: 11
              System.out.println("emergency");//sysj\ABScontroller.sysj line: 45, column: 4
              thread31357(tdone,ends);
              thread31358(tdone,ends);
              thread31359(tdone,ends);
              thread31360(tdone,ends);
              thread31361(tdone,ends);
              int biggest31362 = 0;
              if(ends[7]>=biggest31362){
                biggest31362=ends[7];
              }
              if(ends[8]>=biggest31362){
                biggest31362=ends[8];
              }
              if(ends[9]>=biggest31362){
                biggest31362=ends[9];
              }
              if(ends[10]>=biggest31362){
                biggest31362=ends[10];
              }
              if(ends[11]>=biggest31362){
                biggest31362=ends[11];
              }
              if(biggest31362 == 1){
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              S98=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31349(int [] tdone, int [] ends){
        switch(S43){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(bottleCapped.getprestatus()){//sysj\ABScontroller.sysj line: 39, column: 17
          bottleAtPos5.setPresent();//sysj\ABScontroller.sysj line: 39, column: 33
          currsigs.addElement(bottleAtPos5);
          System.out.println("bottleAtPos5");//sysj\ABScontroller.sysj line: 39, column: 51
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
  }

  public void thread31348(int [] tdone, int [] ends){
        switch(S32){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(bottleCapOn.getprestatus()){//sysj\ABScontroller.sysj line: 34, column: 17
          bottleAtPos4.setPresent();//sysj\ABScontroller.sysj line: 34, column: 32
          currsigs.addElement(bottleAtPos4);
          System.out.println("bottleAtPos4");//sysj\ABScontroller.sysj line: 34, column: 50
          active[4]=1;
          ends[4]=1;
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

  public void thread31347(int [] tdone, int [] ends){
        switch(S21){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if((bottleInTable.getprestatus() && bottleAtPos1.getprestatus()) || (bottleFilled.getprestatus() && bottleAtPos2.getprestatus()) || (bottleCapOn.getprestatus() && bottleAtPos3.getprestatus()) || (bottleCapped.getprestatus() && bottleAtPos4.getprestatus())){//sysj\ABScontroller.sysj line: 25, column: 17
          rotaryTableTrigger.setPresent();//sysj\ABScontroller.sysj line: 25, column: 153
          currsigs.addElement(rotaryTableTrigger);
          System.out.println("rotaryTableTrigger");//sysj\ABScontroller.sysj line: 25, column: 177
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
      
    }
  }

  public void thread31346(int [] tdone, int [] ends){
        switch(S10){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(bottleInTable.getprestatus()){//sysj\ABScontroller.sysj line: 21, column: 17
          bottleAtPos2.setPresent();//sysj\ABScontroller.sysj line: 21, column: 34
          currsigs.addElement(bottleAtPos2);
          System.out.println("bottleAtPos2");//sysj\ABScontroller.sysj line: 21, column: 52
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
  }

  public void thread31343(int [] tdone, int [] ends){
        S68=1;
    emergencyCapper.setPresent();//sysj\ABScontroller.sysj line: 47, column: 140
    currsigs.addElement(emergencyCapper);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread31342(int [] tdone, int [] ends){
        S63=1;
    emergencyCapLoader.setPresent();//sysj\ABScontroller.sysj line: 47, column: 105
    currsigs.addElement(emergencyCapLoader);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread31341(int [] tdone, int [] ends){
        S58=1;
    emergencyFiller.setPresent();//sysj\ABScontroller.sysj line: 47, column: 73
    currsigs.addElement(emergencyFiller);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread31340(int [] tdone, int [] ends){
        S53=1;
    emergencyRotary.setPresent();//sysj\ABScontroller.sysj line: 47, column: 41
    currsigs.addElement(emergencyRotary);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread31339(int [] tdone, int [] ends){
        S48=1;
    emergencyConveyor.setPresent();//sysj\ABScontroller.sysj line: 47, column: 7
    currsigs.addElement(emergencyConveyor);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread31338(int [] tdone, int [] ends){
        S210=1;
    S98=0;
    if(emergency.getprestatus()){//sysj\ABScontroller.sysj line: 44, column: 11
      System.out.println("emergency");//sysj\ABScontroller.sysj line: 45, column: 4
      thread31339(tdone,ends);
      thread31340(tdone,ends);
      thread31341(tdone,ends);
      thread31342(tdone,ends);
      thread31343(tdone,ends);
      int biggest31344 = 0;
      if(ends[7]>=biggest31344){
        biggest31344=ends[7];
      }
      if(ends[8]>=biggest31344){
        biggest31344=ends[8];
      }
      if(ends[9]>=biggest31344){
        biggest31344=ends[9];
      }
      if(ends[10]>=biggest31344){
        biggest31344=ends[10];
      }
      if(ends[11]>=biggest31344){
        biggest31344=ends[11];
      }
      if(biggest31344 == 1){
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S98=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread31337(int [] tdone, int [] ends){
        S43=1;
    if(bottleCapped.getprestatus()){//sysj\ABScontroller.sysj line: 39, column: 17
      bottleAtPos5.setPresent();//sysj\ABScontroller.sysj line: 39, column: 33
      currsigs.addElement(bottleAtPos5);
      System.out.println("bottleAtPos5");//sysj\ABScontroller.sysj line: 39, column: 51
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread31336(int [] tdone, int [] ends){
        S32=1;
    if(bottleCapOn.getprestatus()){//sysj\ABScontroller.sysj line: 34, column: 17
      bottleAtPos4.setPresent();//sysj\ABScontroller.sysj line: 34, column: 32
      currsigs.addElement(bottleAtPos4);
      System.out.println("bottleAtPos4");//sysj\ABScontroller.sysj line: 34, column: 50
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread31335(int [] tdone, int [] ends){
        S21=1;
    if((bottleInTable.getprestatus() && bottleAtPos1.getprestatus()) || (bottleFilled.getprestatus() && bottleAtPos2.getprestatus()) || (bottleCapOn.getprestatus() && bottleAtPos3.getprestatus()) || (bottleCapped.getprestatus() && bottleAtPos4.getprestatus())){//sysj\ABScontroller.sysj line: 25, column: 17
      rotaryTableTrigger.setPresent();//sysj\ABScontroller.sysj line: 25, column: 153
      currsigs.addElement(rotaryTableTrigger);
      System.out.println("rotaryTableTrigger");//sysj\ABScontroller.sysj line: 25, column: 177
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread31334(int [] tdone, int [] ends){
        S10=1;
    if(bottleInTable.getprestatus()){//sysj\ABScontroller.sysj line: 21, column: 17
      bottleAtPos2.setPresent();//sysj\ABScontroller.sysj line: 21, column: 34
      currsigs.addElement(bottleAtPos2);
      System.out.println("bottleAtPos2");//sysj\ABScontroller.sysj line: 21, column: 52
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S212){
        case 0 : 
          S212=0;
          break RUN;
        
        case 1 : 
          S212=2;
          S212=2;
          thread31334(tdone,ends);
          thread31335(tdone,ends);
          thread31336(tdone,ends);
          thread31337(tdone,ends);
          thread31338(tdone,ends);
          int biggest31345 = 0;
          if(ends[2]>=biggest31345){
            biggest31345=ends[2];
          }
          if(ends[3]>=biggest31345){
            biggest31345=ends[3];
          }
          if(ends[4]>=biggest31345){
            biggest31345=ends[4];
          }
          if(ends[5]>=biggest31345){
            biggest31345=ends[5];
          }
          if(ends[6]>=biggest31345){
            biggest31345=ends[6];
          }
          if(biggest31345 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread31346(tdone,ends);
          thread31347(tdone,ends);
          thread31348(tdone,ends);
          thread31349(tdone,ends);
          thread31350(tdone,ends);
          int biggest31363 = 0;
          if(ends[2]>=biggest31363){
            biggest31363=ends[2];
          }
          if(ends[3]>=biggest31363){
            biggest31363=ends[3];
          }
          if(ends[4]>=biggest31363){
            biggest31363=ends[4];
          }
          if(ends[5]>=biggest31363){
            biggest31363=ends[5];
          }
          if(ends[6]>=biggest31363){
            biggest31363=ends[6];
          }
          if(biggest31363 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest31363 == 0){
            S212=0;
            active[1]=0;
            ends[1]=0;
            S212=0;
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
          emergency.gethook();
          motConveyorOnOff.gethook();
          bottleInTable.gethook();
          bottleFilled.gethook();
          bottleCapOn.gethook();
          bottleCapped.gethook();
          orderPOS.gethook();
          presence.gethook();
          df = true;
        }
        runClockDomain();
      }
      emergency.setpreclear();
      motConveyorOnOff.setpreclear();
      bottleInTable.setpreclear();
      bottleFilled.setpreclear();
      bottleCapOn.setpreclear();
      bottleCapped.setpreclear();
      orderPOS.setpreclear();
      presence.setpreclear();
      rotaryTableTrigger.setpreclear();
      emergencyConveyor.setpreclear();
      emergencyRotary.setpreclear();
      emergencyFiller.setpreclear();
      emergencyCapLoader.setpreclear();
      emergencyCapper.setpreclear();
      emergencyPOS.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      tableAlignedWithSensors.setpreclear();
      capOnBottleAtPos1.setpreclear();
      order.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = emergency.getStatus() ? emergency.setprepresent() : emergency.setpreclear();
      emergency.setpreval(emergency.getValue());
      emergency.setClear();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = bottleInTable.getStatus() ? bottleInTable.setprepresent() : bottleInTable.setpreclear();
      bottleInTable.setpreval(bottleInTable.getValue());
      bottleInTable.setClear();
      dummyint = bottleFilled.getStatus() ? bottleFilled.setprepresent() : bottleFilled.setpreclear();
      bottleFilled.setpreval(bottleFilled.getValue());
      bottleFilled.setClear();
      dummyint = bottleCapOn.getStatus() ? bottleCapOn.setprepresent() : bottleCapOn.setpreclear();
      bottleCapOn.setpreval(bottleCapOn.getValue());
      bottleCapOn.setClear();
      dummyint = bottleCapped.getStatus() ? bottleCapped.setprepresent() : bottleCapped.setpreclear();
      bottleCapped.setpreval(bottleCapped.getValue());
      bottleCapped.setClear();
      dummyint = orderPOS.getStatus() ? orderPOS.setprepresent() : orderPOS.setpreclear();
      orderPOS.setpreval(orderPOS.getValue());
      orderPOS.setClear();
      dummyint = presence.getStatus() ? presence.setprepresent() : presence.setpreclear();
      presence.setpreval(presence.getValue());
      presence.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      emergencyConveyor.sethook();
      emergencyConveyor.setClear();
      emergencyRotary.sethook();
      emergencyRotary.setClear();
      emergencyFiller.sethook();
      emergencyFiller.setClear();
      emergencyCapLoader.sethook();
      emergencyCapLoader.setClear();
      emergencyCapper.sethook();
      emergencyCapper.setClear();
      emergencyPOS.sethook();
      emergencyPOS.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      tableAlignedWithSensors.sethook();
      tableAlignedWithSensors.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      order.sethook();
      order.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        emergency.gethook();
        motConveyorOnOff.gethook();
        bottleInTable.gethook();
        bottleFilled.gethook();
        bottleCapOn.gethook();
        bottleCapped.gethook();
        orderPOS.gethook();
        presence.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
