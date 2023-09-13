import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\ABSplant.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABSplant.sysj line: 2, column: 1

public class RotaryPlant extends ClockDomain{
  public RotaryPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal turn = new Signal("turn", Signal.INPUT);
  public Signal stop = new Signal("stop", Signal.INPUT);
  public Signal turnE = new Signal("turnE", Signal.OUTPUT);
  public Signal stopE = new Signal("stopE", Signal.OUTPUT);
  private int S31664 = 1;
  private int S31612 = 1;
  private int S31600 = 1;
  private int S31630 = 1;
  private int S31620 = 1;
  private int S31614 = 1;
  private int S31628 = 1;
  
  private int[] ends = new int[53];
  private int[] tdone = new int[53];
  
  public void thread34185(int [] tdone, int [] ends){
        switch(S31628){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(stop.getprestatus()){//sysj\ABSplant.sysj line: 62, column: 24
          stopE.setPresent();//sysj\ABSplant.sysj line: 62, column: 30
          currsigs.addElement(stopE);
          ;//sysj\ABSplant.sysj line: 62, column: 42
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          ;//sysj\ABSplant.sysj line: 62, column: 42
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread34184(int [] tdone, int [] ends){
        switch(S31620){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S31614){
          case 0 : 
            S31614=0;
            if(turn.getprestatus()){//sysj\ABSplant.sysj line: 60, column: 24
              turnE.setPresent();//sysj\ABSplant.sysj line: 60, column: 30
              currsigs.addElement(turnE);
              ;//sysj\ABSplant.sysj line: 60, column: 42
              S31614=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              ;//sysj\ABSplant.sysj line: 60, column: 42
              S31614=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S31614=1;
            S31614=0;
            if(turn.getprestatus()){//sysj\ABSplant.sysj line: 60, column: 24
              turnE.setPresent();//sysj\ABSplant.sysj line: 60, column: 30
              currsigs.addElement(turnE);
              ;//sysj\ABSplant.sysj line: 60, column: 42
              S31614=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              ;//sysj\ABSplant.sysj line: 60, column: 42
              S31614=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread34183(int [] tdone, int [] ends){
        switch(S31630){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread34184(tdone,ends);
        thread34185(tdone,ends);
        int biggest34186 = 0;
        if(ends[5]>=biggest34186){
          biggest34186=ends[5];
        }
        if(ends[6]>=biggest34186){
          biggest34186=ends[6];
        }
        if(biggest34186 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest34186 == 0){
          S31630=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread34182(int [] tdone, int [] ends){
        switch(S31612){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S31600){
          case 0 : 
            if(turn.getprestatus()){//sysj\ABSplant.sysj line: 42, column: 10
              System.out.println("TURN");//sysj\ABSplant.sysj line: 44, column: 5
              S31600=1;
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
          
          case 1 : 
            if(stop.getprestatus()){//sysj\ABSplant.sysj line: 47, column: 10
              System.out.println("STOP");//sysj\ABSplant.sysj line: 49, column: 5
              S31600=0;
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
        break;
      
    }
  }

  public void thread34179(int [] tdone, int [] ends){
        S31628=1;
    if(stop.getprestatus()){//sysj\ABSplant.sysj line: 62, column: 24
      stopE.setPresent();//sysj\ABSplant.sysj line: 62, column: 30
      currsigs.addElement(stopE);
      ;//sysj\ABSplant.sysj line: 62, column: 42
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      ;//sysj\ABSplant.sysj line: 62, column: 42
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread34178(int [] tdone, int [] ends){
        S31620=1;
    S31614=0;
    if(turn.getprestatus()){//sysj\ABSplant.sysj line: 60, column: 24
      turnE.setPresent();//sysj\ABSplant.sysj line: 60, column: 30
      currsigs.addElement(turnE);
      ;//sysj\ABSplant.sysj line: 60, column: 42
      S31614=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      ;//sysj\ABSplant.sysj line: 60, column: 42
      S31614=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread34177(int [] tdone, int [] ends){
        S31630=1;
    thread34178(tdone,ends);
    thread34179(tdone,ends);
    int biggest34180 = 0;
    if(ends[5]>=biggest34180){
      biggest34180=ends[5];
    }
    if(ends[6]>=biggest34180){
      biggest34180=ends[6];
    }
    if(biggest34180 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread34176(int [] tdone, int [] ends){
        S31612=1;
    S31600=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S31664){
        case 0 : 
          S31664=0;
          break RUN;
        
        case 1 : 
          S31664=2;
          S31664=2;
          System.out.println("RotaryPlant");//sysj\ABSplant.sysj line: 39, column: 2
          thread34176(tdone,ends);
          thread34177(tdone,ends);
          int biggest34181 = 0;
          if(ends[3]>=biggest34181){
            biggest34181=ends[3];
          }
          if(ends[4]>=biggest34181){
            biggest34181=ends[4];
          }
          if(biggest34181 == 1){
            active[2]=1;
            ends[2]=1;
            break RUN;
          }
        
        case 2 : 
          thread34182(tdone,ends);
          thread34183(tdone,ends);
          int biggest34187 = 0;
          if(ends[3]>=biggest34187){
            biggest34187=ends[3];
          }
          if(ends[4]>=biggest34187){
            biggest34187=ends[4];
          }
          if(biggest34187 == 1){
            active[2]=1;
            ends[2]=1;
            break RUN;
          }
          //FINXME code
          if(biggest34187 == 0){
            S31664=0;
            active[2]=0;
            ends[2]=0;
            S31664=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[2] != 0){
      int index = 2;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
        if(!df){
          turn.gethook();
          stop.gethook();
          df = true;
        }
        runClockDomain();
      }
      turn.setpreclear();
      stop.setpreclear();
      turnE.setpreclear();
      stopE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = turn.getStatus() ? turn.setprepresent() : turn.setpreclear();
      turn.setpreval(turn.getValue());
      turn.setClear();
      dummyint = stop.getStatus() ? stop.setprepresent() : stop.setpreclear();
      stop.setpreval(stop.getValue());
      stop.setClear();
      turnE.sethook();
      turnE.setClear();
      stopE.sethook();
      stopE.setClear();
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
        turn.gethook();
        stop.gethook();
      }
      runFinisher();
      if(active[2] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
