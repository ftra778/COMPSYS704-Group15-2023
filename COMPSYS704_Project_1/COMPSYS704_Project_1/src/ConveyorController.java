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
  public Signal ConveyorON = new Signal("ConveyorON", Signal.OUTPUT);
  public Signal ConveyorOFF = new Signal("ConveyorOFF", Signal.OUTPUT);
  public Signal emergencyStopPlant = new Signal("emergencyStopPlant", Signal.OUTPUT);
  public Signal bottleReady = new Signal("bottleReady", Signal.OUTPUT);
  public Signal bottleInTable = new Signal("bottleInTable", Signal.OUTPUT);
  private int S508 = 1;
  private int S312 = 1;
  private int S226 = 1;
  private int S212 = 1;
  private int S215 = 1;
  private int S356 = 1;
  private int S316 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void thread31368(int [] tdone, int [] ends){
        switch(S356){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S316){
          case 0 : 
            if(emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 69, column: 9
              S316=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            if(!emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 70, column: 9
              S316=2;
              emergencyStopPlant.setPresent();//sysj\ABScontroller.sysj line: 72, column: 4
              currsigs.addElement(emergencyStopPlant);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 2 : 
            if(emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 71, column: 9
              S316=3;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              emergencyStopPlant.setPresent();//sysj\ABScontroller.sysj line: 72, column: 4
              currsigs.addElement(emergencyStopPlant);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 3 : 
            if(!emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 74, column: 9
              S316=0;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31366(int [] tdone, int [] ends){
        switch(S215){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\ABScontroller.sysj line: 57, column: 36
          ends[15]=2;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread31365(int [] tdone, int [] ends){
        switch(S212){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        ConveyorON.setPresent();//sysj\ABScontroller.sysj line: 57, column: 5
        currsigs.addElement(ConveyorON);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread31363(int [] tdone, int [] ends){
        S215=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread31362(int [] tdone, int [] ends){
        S212=1;
    ConveyorON.setPresent();//sysj\ABScontroller.sysj line: 57, column: 5
    currsigs.addElement(ConveyorON);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31361(int [] tdone, int [] ends){
        switch(S312){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S226){
          case 0 : 
            if(bottleLeftPos5.getprestatus() && (emptyBottleReady.getprestatus() || bottleAtPos5.getprestatus()) && !emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 54, column: 9
              S226=1;
              thread31362(tdone,ends);
              thread31363(tdone,ends);
              int biggest31364 = 0;
              if(ends[14]>=biggest31364){
                biggest31364=ends[14];
              }
              if(ends[15]>=biggest31364){
                biggest31364=ends[15];
              }
              if(biggest31364 == 1){
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            thread31365(tdone,ends);
            thread31366(tdone,ends);
            int biggest31367 = 0;
            if(ends[14]>=biggest31367){
              biggest31367=ends[14];
            }
            if(ends[15]>=biggest31367){
              biggest31367=ends[15];
            }
            if(biggest31367 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest31367 == 2){
              ends[13]=2;
              ;//sysj\ABScontroller.sysj line: 56, column: 3
              ConveyorOFF.setPresent();//sysj\ABScontroller.sysj line: 59, column: 3
              currsigs.addElement(ConveyorOFF);
              S226=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest31367 == 0){
              ConveyorOFF.setPresent();//sysj\ABScontroller.sysj line: 59, column: 3
              currsigs.addElement(ConveyorOFF);
              S226=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 2 : 
            if(bottleLeftPos5.getprestatus() && emptyBottleReady.getprestatus()){//sysj\ABScontroller.sysj line: 61, column: 9
              bottleInTable.setPresent();//sysj\ABScontroller.sysj line: 64, column: 3
              currsigs.addElement(bottleInTable);
              S226=0;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              if(!ConveyorON.getprestatus()){//sysj\ABScontroller.sysj line: 62, column: 10
                bottleInTable.setPresent();//sysj\ABScontroller.sysj line: 64, column: 3
                currsigs.addElement(bottleInTable);
                S226=0;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31359(int [] tdone, int [] ends){
        S356=1;
    S316=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31358(int [] tdone, int [] ends){
        S312=1;
    S226=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S508){
        case 0 : 
          S508=0;
          break RUN;
        
        case 1 : 
          S508=2;
          S508=2;
          System.out.println("ConveyorController");//sysj\ABScontroller.sysj line: 52, column: 2
          thread31358(tdone,ends);
          thread31359(tdone,ends);
          int biggest31360 = 0;
          if(ends[13]>=biggest31360){
            biggest31360=ends[13];
          }
          if(ends[16]>=biggest31360){
            biggest31360=ends[16];
          }
          if(biggest31360 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
        
        case 2 : 
          thread31361(tdone,ends);
          thread31368(tdone,ends);
          int biggest31369 = 0;
          if(ends[13]>=biggest31369){
            biggest31369=ends[13];
          }
          if(ends[16]>=biggest31369){
            biggest31369=ends[16];
          }
          if(biggest31369 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          //FINXME code
          if(biggest31369 == 0){
            S508=0;
            active[12]=0;
            ends[12]=0;
            S508=0;
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
    while(active[12] != 0){
      int index = 12;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        if(!df){
          emptyBottleReady.gethook();
          bottleAtPos1.gethook();
          bottleAtPos5.gethook();
          bottleLeftPos5.gethook();
          emergencyStop.gethook();
          df = true;
        }
        runClockDomain();
      }
      emptyBottleReady.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos5.setpreclear();
      bottleLeftPos5.setpreclear();
      emergencyStop.setpreclear();
      ConveyorON.setpreclear();
      ConveyorOFF.setpreclear();
      emergencyStopPlant.setpreclear();
      bottleReady.setpreclear();
      bottleInTable.setpreclear();
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
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        emptyBottleReady.gethook();
        bottleAtPos1.gethook();
        bottleAtPos5.gethook();
        bottleLeftPos5.gethook();
        emergencyStop.gethook();
      }
      runFinisher();
      if(active[12] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
