import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\ABScontroller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABScontroller.sysj line: 2, column: 1

public class ConveyorController extends ClockDomain{
  public ConveyorController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal emptyBottleReady = new Signal("emptyBottleReady", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal emergencyStop = new Signal("emergencyStop", Signal.INPUT);
  public Signal rotaryTableTriggerConveyor = new Signal("rotaryTableTriggerConveyor", Signal.INPUT);
  public Signal ConveyorON = new Signal("ConveyorON", Signal.OUTPUT);
  public Signal ConveyorOFF = new Signal("ConveyorOFF", Signal.OUTPUT);
  public Signal emergencyStopPlant = new Signal("emergencyStopPlant", Signal.OUTPUT);
  public Signal bottleReady = new Signal("bottleReady", Signal.OUTPUT);
  public Signal bottleInTable = new Signal("bottleInTable", Signal.OUTPUT);
  public Signal idle = new Signal("idle", Signal.OUTPUT);
  private int S756 = 1;
  private int S456 = 1;
  private int S282 = 1;
  private int S251 = 1;
  private int S259 = 1;
  private int S262 = 1;
  private int S500 = 1;
  private int S460 = 1;
  
  private int[] ends = new int[93];
  private int[] tdone = new int[93];
  
  public void thread43493(int [] tdone, int [] ends){
        switch(S500){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S460){
          case 0 : 
            if(emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 95, column: 9
              S460=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 1 : 
            if(!emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 96, column: 9
              S460=2;
              emergencyStopPlant.setPresent();//sysj\ABScontroller.sysj line: 98, column: 4
              currsigs.addElement(emergencyStopPlant);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 2 : 
            if(emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 97, column: 9
              S460=3;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              emergencyStopPlant.setPresent();//sysj\ABScontroller.sysj line: 98, column: 4
              currsigs.addElement(emergencyStopPlant);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 3 : 
            if(!emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 100, column: 9
              S460=0;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43491(int [] tdone, int [] ends){
        System.out.println("idleConveyor");//sysj\ABScontroller.sysj line: 74, column: 22
    active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread43490(int [] tdone, int [] ends){
        S251=1;
    idle.setPresent();//sysj\ABScontroller.sysj line: 74, column: 5
    currsigs.addElement(idle);
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread43488(int [] tdone, int [] ends){
        System.out.println("idleConveyor");//sysj\ABScontroller.sysj line: 74, column: 22
    active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread43487(int [] tdone, int [] ends){
        S251=1;
    idle.setPresent();//sysj\ABScontroller.sysj line: 74, column: 5
    currsigs.addElement(idle);
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread43485(int [] tdone, int [] ends){
        switch(S262){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\ABScontroller.sysj line: 78, column: 36
          ends[24]=2;
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

  public void thread43484(int [] tdone, int [] ends){
        switch(S259){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        ConveyorON.setPresent();//sysj\ABScontroller.sysj line: 78, column: 5
        currsigs.addElement(ConveyorON);
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
        break;
      
    }
  }

  public void thread43482(int [] tdone, int [] ends){
        S262=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread43481(int [] tdone, int [] ends){
        S259=1;
    ConveyorON.setPresent();//sysj\ABScontroller.sysj line: 78, column: 5
    currsigs.addElement(ConveyorON);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread43479(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread43478(int [] tdone, int [] ends){
        switch(S251){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        idle.setPresent();//sysj\ABScontroller.sysj line: 74, column: 5
        currsigs.addElement(idle);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread43476(int [] tdone, int [] ends){
        S262=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread43475(int [] tdone, int [] ends){
        S259=1;
    ConveyorON.setPresent();//sysj\ABScontroller.sysj line: 78, column: 5
    currsigs.addElement(ConveyorON);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread43474(int [] tdone, int [] ends){
        switch(S456){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S282){
          case 0 : 
            if(bottleLeftPos5.getprestatus() && (emptyBottleReady.getprestatus() || bottleAtPos5.getprestatus()) && !emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 73, column: 9
              S282=1;
              thread43475(tdone,ends);
              thread43476(tdone,ends);
              int biggest43477 = 0;
              if(ends[23]>=biggest43477){
                biggest43477=ends[23];
              }
              if(ends[24]>=biggest43477){
                biggest43477=ends[24];
              }
              if(biggest43477 == 1){
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            else {
              thread43478(tdone,ends);
              thread43479(tdone,ends);
              int biggest43480 = 0;
              if(ends[21]>=biggest43480){
                biggest43480=ends[21];
              }
              if(ends[22]>=biggest43480){
                biggest43480=ends[22];
              }
              if(biggest43480 == 1){
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
              //FINXME code
              if(biggest43480 == 0){
                S282=1;
                thread43481(tdone,ends);
                thread43482(tdone,ends);
                int biggest43483 = 0;
                if(ends[23]>=biggest43483){
                  biggest43483=ends[23];
                }
                if(ends[24]>=biggest43483){
                  biggest43483=ends[24];
                }
                if(biggest43483 == 1){
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
              }
            }
            break;
          
          case 1 : 
            thread43484(tdone,ends);
            thread43485(tdone,ends);
            int biggest43486 = 0;
            if(ends[23]>=biggest43486){
              biggest43486=ends[23];
            }
            if(ends[24]>=biggest43486){
              biggest43486=ends[24];
            }
            if(biggest43486 == 1){
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            if(biggest43486 == 2){
              ends[20]=2;
              ;//sysj\ABScontroller.sysj line: 77, column: 3
              ConveyorOFF.setPresent();//sysj\ABScontroller.sysj line: 81, column: 3
              currsigs.addElement(ConveyorOFF);
              S282=2;
              bottleInTable.setPresent();//sysj\ABScontroller.sysj line: 84, column: 4
              currsigs.addElement(bottleInTable);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            //FINXME code
            if(biggest43486 == 0){
              ConveyorOFF.setPresent();//sysj\ABScontroller.sysj line: 81, column: 3
              currsigs.addElement(ConveyorOFF);
              S282=2;
              bottleInTable.setPresent();//sysj\ABScontroller.sysj line: 84, column: 4
              currsigs.addElement(bottleInTable);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 2 : 
            if(rotaryTableTriggerConveyor.getprestatus()){//sysj\ABScontroller.sysj line: 83, column: 9
              S282=3;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              bottleInTable.setPresent();//sysj\ABScontroller.sysj line: 84, column: 4
              currsigs.addElement(bottleInTable);
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 3 : 
            if(bottleLeftPos5.getprestatus() && emptyBottleReady.getprestatus()){//sysj\ABScontroller.sysj line: 87, column: 9
              S282=0;
              thread43487(tdone,ends);
              thread43488(tdone,ends);
              int biggest43489 = 0;
              if(ends[21]>=biggest43489){
                biggest43489=ends[21];
              }
              if(ends[22]>=biggest43489){
                biggest43489=ends[22];
              }
              if(biggest43489 == 1){
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            else {
              if(!ConveyorON.getprestatus()){//sysj\ABScontroller.sysj line: 88, column: 10
                S282=0;
                thread43490(tdone,ends);
                thread43491(tdone,ends);
                int biggest43492 = 0;
                if(ends[21]>=biggest43492){
                  biggest43492=ends[21];
                }
                if(ends[22]>=biggest43492){
                  biggest43492=ends[22];
                }
                if(biggest43492 == 1){
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
              }
              else {
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43472(int [] tdone, int [] ends){
        S500=1;
    S460=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread43470(int [] tdone, int [] ends){
        System.out.println("idleConveyor");//sysj\ABScontroller.sysj line: 74, column: 22
    active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread43469(int [] tdone, int [] ends){
        S251=1;
    idle.setPresent();//sysj\ABScontroller.sysj line: 74, column: 5
    currsigs.addElement(idle);
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread43468(int [] tdone, int [] ends){
        S456=1;
    S282=0;
    thread43469(tdone,ends);
    thread43470(tdone,ends);
    int biggest43471 = 0;
    if(ends[21]>=biggest43471){
      biggest43471=ends[21];
    }
    if(ends[22]>=biggest43471){
      biggest43471=ends[22];
    }
    if(biggest43471 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S756){
        case 0 : 
          S756=0;
          break RUN;
        
        case 1 : 
          S756=2;
          S756=2;
          System.out.println("ConveyorController");//sysj\ABScontroller.sysj line: 71, column: 2
          thread43468(tdone,ends);
          thread43472(tdone,ends);
          int biggest43473 = 0;
          if(ends[20]>=biggest43473){
            biggest43473=ends[20];
          }
          if(ends[25]>=biggest43473){
            biggest43473=ends[25];
          }
          if(biggest43473 == 1){
            active[19]=1;
            ends[19]=1;
            break RUN;
          }
        
        case 2 : 
          thread43474(tdone,ends);
          thread43493(tdone,ends);
          int biggest43494 = 0;
          if(ends[20]>=biggest43494){
            biggest43494=ends[20];
          }
          if(ends[25]>=biggest43494){
            biggest43494=ends[25];
          }
          if(biggest43494 == 1){
            active[19]=1;
            ends[19]=1;
            break RUN;
          }
          //FINXME code
          if(biggest43494 == 0){
            S756=0;
            active[19]=0;
            ends[19]=0;
            S756=0;
            break RUN;
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
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[19] != 0){
      int index = 19;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[19]!=0 || suspended[19]!=0 || active[19]!=1);
      else{
        if(!df){
          emptyBottleReady.gethook();
          bottleAtPos1.gethook();
          bottleAtPos5.gethook();
          bottleLeftPos5.gethook();
          emergencyStop.gethook();
          rotaryTableTriggerConveyor.gethook();
          df = true;
        }
        runClockDomain();
      }
      emptyBottleReady.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos5.setpreclear();
      bottleLeftPos5.setpreclear();
      emergencyStop.setpreclear();
      rotaryTableTriggerConveyor.setpreclear();
      ConveyorON.setpreclear();
      ConveyorOFF.setpreclear();
      emergencyStopPlant.setpreclear();
      bottleReady.setpreclear();
      bottleInTable.setpreclear();
      idle.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = emptyBottleReady.getStatus() ? emptyBottleReady.setprepresent() : emptyBottleReady.setpreclear();
      emptyBottleReady.setpreval(emptyBottleReady.getValue());
      emptyBottleReady.setClear();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = emergencyStop.getStatus() ? emergencyStop.setprepresent() : emergencyStop.setpreclear();
      emergencyStop.setpreval(emergencyStop.getValue());
      emergencyStop.setClear();
      dummyint = rotaryTableTriggerConveyor.getStatus() ? rotaryTableTriggerConveyor.setprepresent() : rotaryTableTriggerConveyor.setpreclear();
      rotaryTableTriggerConveyor.setpreval(rotaryTableTriggerConveyor.getValue());
      rotaryTableTriggerConveyor.setClear();
      ConveyorON.sethook();
      ConveyorON.setClear();
      ConveyorOFF.sethook();
      ConveyorOFF.setClear();
      emergencyStopPlant.sethook();
      emergencyStopPlant.setClear();
      bottleReady.sethook();
      bottleReady.setClear();
      bottleInTable.sethook();
      bottleInTable.setClear();
      idle.sethook();
      idle.setClear();
      if(paused[19]!=0 || suspended[19]!=0 || active[19]!=1);
      else{
        emptyBottleReady.gethook();
        bottleAtPos1.gethook();
        bottleAtPos5.gethook();
        bottleLeftPos5.gethook();
        emergencyStop.gethook();
        rotaryTableTriggerConveyor.gethook();
      }
      runFinisher();
      if(active[19] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
