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
  public Signal emptyBottleReady = new Signal("emptyBottleReady", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal emergencyStop = new Signal("emergencyStop", Signal.INPUT);
  public Signal ConveyorON = new Signal("ConveyorON", Signal.OUTPUT);
  public Signal ConveyorOFF = new Signal("ConveyorOFF", Signal.OUTPUT);
  private long __start_thread_4;//sysj\controller.sysj line: 11, column: 29
  private int S251 = 1;
  private int S217 = 1;
  private int S45 = 1;
  private int S5 = 1;
  private int S21 = 1;
  private int S249 = 1;
  private int S227 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread263(int [] tdone, int [] ends){
        switch(S249){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S227){
          case 0 : 
            if(emergencyStop.getprestatus()){//sysj\controller.sysj line: 22, column: 9
              S227=1;
              ConveyorOFF.setPresent();//sysj\controller.sysj line: 25, column: 4
              currsigs.addElement(ConveyorOFF);
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
          
          case 1 : 
            if(!emergencyStop.getprestatus()){//sysj\controller.sysj line: 24, column: 9
              S227=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              ConveyorOFF.setPresent();//sysj\controller.sysj line: 25, column: 4
              currsigs.addElement(ConveyorOFF);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread261(int [] tdone, int [] ends){
        switch(S21){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\controller.sysj line: 11, column: 29
          ends[4]=3;
          ;//sysj\controller.sysj line: 11, column: 29
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

  public void thread260(int [] tdone, int [] ends){
        switch(S5){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        ConveyorON.setPresent();//sysj\controller.sysj line: 11, column: 5
        currsigs.addElement(ConveyorON);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread258(int [] tdone, int [] ends){
        S21=1;
    __start_thread_4 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 11, column: 29
    if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\controller.sysj line: 11, column: 29
      ends[4]=3;
      ;//sysj\controller.sysj line: 11, column: 29
      ends[4]=2;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread257(int [] tdone, int [] ends){
        S5=1;
    ConveyorON.setPresent();//sysj\controller.sysj line: 11, column: 5
    currsigs.addElement(ConveyorON);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread256(int [] tdone, int [] ends){
        switch(S217){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S45){
          case 0 : 
            if(bottleLeftPos5.getprestatus() && emptyBottleReady.getprestatus()){//sysj\controller.sysj line: 8, column: 9
              S45=1;
              thread257(tdone,ends);
              thread258(tdone,ends);
              int biggest259 = 0;
              if(ends[3]>=biggest259){
                biggest259=ends[3];
              }
              if(ends[4]>=biggest259){
                biggest259=ends[4];
              }
              if(biggest259 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest259 == 2){
                ends[2]=2;
                ;//sysj\controller.sysj line: 10, column: 3
                ConveyorOFF.setPresent();//sysj\controller.sysj line: 13, column: 3
                currsigs.addElement(ConveyorOFF);
                S45=2;
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
            thread260(tdone,ends);
            thread261(tdone,ends);
            int biggest262 = 0;
            if(ends[3]>=biggest262){
              biggest262=ends[3];
            }
            if(ends[4]>=biggest262){
              biggest262=ends[4];
            }
            if(biggest262 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest262 == 2){
              ends[2]=2;
              ;//sysj\controller.sysj line: 10, column: 3
              ConveyorOFF.setPresent();//sysj\controller.sysj line: 13, column: 3
              currsigs.addElement(ConveyorOFF);
              S45=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest262 == 0){
              ConveyorOFF.setPresent();//sysj\controller.sysj line: 13, column: 3
              currsigs.addElement(ConveyorOFF);
              S45=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(bottleLeftPos5.getprestatus() && emptyBottleReady.getprestatus()){//sysj\controller.sysj line: 15, column: 9
              S45=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              if(!ConveyorON.getprestatus()){//sysj\controller.sysj line: 16, column: 10
                S45=0;
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
            break;
          
        }
        break;
      
    }
  }

  public void thread254(int [] tdone, int [] ends){
        S249=1;
    S227=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread253(int [] tdone, int [] ends){
        S217=1;
    S45=0;
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
      switch(S251){
        case 0 : 
          S251=0;
          break RUN;
        
        case 1 : 
          S251=2;
          S251=2;
          thread253(tdone,ends);
          thread254(tdone,ends);
          int biggest255 = 0;
          if(ends[2]>=biggest255){
            biggest255=ends[2];
          }
          if(ends[5]>=biggest255){
            biggest255=ends[5];
          }
          if(biggest255 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread256(tdone,ends);
          thread263(tdone,ends);
          int biggest264 = 0;
          if(ends[2]>=biggest264){
            biggest264=ends[2];
          }
          if(ends[5]>=biggest264){
            biggest264=ends[5];
          }
          if(biggest264 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest264 == 0){
            S251=0;
            active[1]=0;
            ends[1]=0;
            S251=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        emptyBottleReady.gethook();
        bottleAtPos1.gethook();
        bottleAtPos5.gethook();
        bottleLeftPos5.gethook();
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
