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
  private int S514 = 1;
  private int S318 = 1;
  private int S232 = 1;
  private int S218 = 1;
  private int S221 = 1;
  private int S362 = 1;
  private int S322 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void thread31374(int [] tdone, int [] ends){
        switch(S362){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S322){
          case 0 : 
            if(emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 77, column: 9
              S322=1;
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
            if(!emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 78, column: 9
              S322=2;
              emergencyStopPlant.setPresent();//sysj\ABScontroller.sysj line: 80, column: 4
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
            if(emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 79, column: 9
              S322=3;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              emergencyStopPlant.setPresent();//sysj\ABScontroller.sysj line: 80, column: 4
              currsigs.addElement(emergencyStopPlant);
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 3 : 
            if(!emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 82, column: 9
              S322=0;
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

  public void thread31372(int [] tdone, int [] ends){
        switch(S221){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\ABScontroller.sysj line: 65, column: 36
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

  public void thread31371(int [] tdone, int [] ends){
        switch(S218){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        ConveyorON.setPresent();//sysj\ABScontroller.sysj line: 65, column: 5
        currsigs.addElement(ConveyorON);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread31369(int [] tdone, int [] ends){
        S221=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread31368(int [] tdone, int [] ends){
        S218=1;
    ConveyorON.setPresent();//sysj\ABScontroller.sysj line: 65, column: 5
    currsigs.addElement(ConveyorON);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31367(int [] tdone, int [] ends){
        switch(S318){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S232){
          case 0 : 
            if(bottleLeftPos5.getprestatus() && (emptyBottleReady.getprestatus() || bottleAtPos5.getprestatus()) && !emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 62, column: 9
              S232=1;
              thread31368(tdone,ends);
              thread31369(tdone,ends);
              int biggest31370 = 0;
              if(ends[14]>=biggest31370){
                biggest31370=ends[14];
              }
              if(ends[15]>=biggest31370){
                biggest31370=ends[15];
              }
              if(biggest31370 == 1){
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
            thread31371(tdone,ends);
            thread31372(tdone,ends);
            int biggest31373 = 0;
            if(ends[14]>=biggest31373){
              biggest31373=ends[14];
            }
            if(ends[15]>=biggest31373){
              biggest31373=ends[15];
            }
            if(biggest31373 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest31373 == 2){
              ends[13]=2;
              ;//sysj\ABScontroller.sysj line: 64, column: 3
              ConveyorOFF.setPresent();//sysj\ABScontroller.sysj line: 67, column: 3
              currsigs.addElement(ConveyorOFF);
              S232=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest31373 == 0){
              ConveyorOFF.setPresent();//sysj\ABScontroller.sysj line: 67, column: 3
              currsigs.addElement(ConveyorOFF);
              S232=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 2 : 
            if(bottleLeftPos5.getprestatus() && emptyBottleReady.getprestatus()){//sysj\ABScontroller.sysj line: 69, column: 9
              bottleInTable.setPresent();//sysj\ABScontroller.sysj line: 72, column: 3
              currsigs.addElement(bottleInTable);
              S232=0;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              if(!ConveyorON.getprestatus()){//sysj\ABScontroller.sysj line: 70, column: 10
                bottleInTable.setPresent();//sysj\ABScontroller.sysj line: 72, column: 3
                currsigs.addElement(bottleInTable);
                S232=0;
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

  public void thread31365(int [] tdone, int [] ends){
        S362=1;
    S322=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread31364(int [] tdone, int [] ends){
        S318=1;
    S232=0;
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
      switch(S514){
        case 0 : 
          S514=0;
          break RUN;
        
        case 1 : 
          S514=2;
          S514=2;
          System.out.println("ConveyorController");//sysj\ABScontroller.sysj line: 60, column: 2
          thread31364(tdone,ends);
          thread31365(tdone,ends);
          int biggest31366 = 0;
          if(ends[13]>=biggest31366){
            biggest31366=ends[13];
          }
          if(ends[16]>=biggest31366){
            biggest31366=ends[16];
          }
          if(biggest31366 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
        
        case 2 : 
          thread31367(tdone,ends);
          thread31374(tdone,ends);
          int biggest31375 = 0;
          if(ends[13]>=biggest31375){
            biggest31375=ends[13];
          }
          if(ends[16]>=biggest31375){
            biggest31375=ends[16];
          }
          if(biggest31375 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          //FINXME code
          if(biggest31375 == 0){
            S514=0;
            active[12]=0;
            ends[12]=0;
            S514=0;
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
