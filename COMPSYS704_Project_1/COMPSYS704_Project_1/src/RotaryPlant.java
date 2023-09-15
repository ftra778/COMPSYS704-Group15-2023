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
  private int S43852 = 1;
  private int S43800 = 1;
  private int S43788 = 1;
  private int S43818 = 1;
  private int S43808 = 1;
  private int S43802 = 1;
  private int S43816 = 1;
  
  private int[] ends = new int[96];
  private int[] tdone = new int[96];
  
  public void thread57210(int [] tdone, int [] ends){
        switch(S43816){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(stop.getprestatus()){//sysj\ABSplant.sysj line: 63, column: 24
          stopE.setPresent();//sysj\ABSplant.sysj line: 63, column: 30
          currsigs.addElement(stopE);
          ;//sysj\ABSplant.sysj line: 63, column: 42
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          ;//sysj\ABSplant.sysj line: 63, column: 42
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread57209(int [] tdone, int [] ends){
        switch(S43808){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S43802){
          case 0 : 
            S43802=0;
            if(turn.getprestatus()){//sysj\ABSplant.sysj line: 61, column: 24
              turnE.setPresent();//sysj\ABSplant.sysj line: 61, column: 30
              currsigs.addElement(turnE);
              ;//sysj\ABSplant.sysj line: 61, column: 42
              S43802=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              ;//sysj\ABSplant.sysj line: 61, column: 42
              S43802=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S43802=1;
            S43802=0;
            if(turn.getprestatus()){//sysj\ABSplant.sysj line: 61, column: 24
              turnE.setPresent();//sysj\ABSplant.sysj line: 61, column: 30
              currsigs.addElement(turnE);
              ;//sysj\ABSplant.sysj line: 61, column: 42
              S43802=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              ;//sysj\ABSplant.sysj line: 61, column: 42
              S43802=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57208(int [] tdone, int [] ends){
        switch(S43818){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread57209(tdone,ends);
        thread57210(tdone,ends);
        int biggest57211 = 0;
        if(ends[5]>=biggest57211){
          biggest57211=ends[5];
        }
        if(ends[6]>=biggest57211){
          biggest57211=ends[6];
        }
        if(biggest57211 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest57211 == 0){
          S43818=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread57207(int [] tdone, int [] ends){
        switch(S43800){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S43788){
          case 0 : 
            if(turn.getprestatus()){//sysj\ABSplant.sysj line: 42, column: 10
              System.out.println("TURN");//sysj\ABSplant.sysj line: 44, column: 5
              S43788=1;
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
              S43788=0;
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

  public void thread57204(int [] tdone, int [] ends){
        S43816=1;
    if(stop.getprestatus()){//sysj\ABSplant.sysj line: 63, column: 24
      stopE.setPresent();//sysj\ABSplant.sysj line: 63, column: 30
      currsigs.addElement(stopE);
      ;//sysj\ABSplant.sysj line: 63, column: 42
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      ;//sysj\ABSplant.sysj line: 63, column: 42
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread57203(int [] tdone, int [] ends){
        S43808=1;
    S43802=0;
    if(turn.getprestatus()){//sysj\ABSplant.sysj line: 61, column: 24
      turnE.setPresent();//sysj\ABSplant.sysj line: 61, column: 30
      currsigs.addElement(turnE);
      ;//sysj\ABSplant.sysj line: 61, column: 42
      S43802=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      ;//sysj\ABSplant.sysj line: 61, column: 42
      S43802=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread57202(int [] tdone, int [] ends){
        S43818=1;
    thread57203(tdone,ends);
    thread57204(tdone,ends);
    int biggest57205 = 0;
    if(ends[5]>=biggest57205){
      biggest57205=ends[5];
    }
    if(ends[6]>=biggest57205){
      biggest57205=ends[6];
    }
    if(biggest57205 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread57201(int [] tdone, int [] ends){
        S43800=1;
    S43788=0;
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
      switch(S43852){
        case 0 : 
          S43852=0;
          break RUN;
        
        case 1 : 
          S43852=2;
          S43852=2;
          System.out.println("RotaryPlant");//sysj\ABSplant.sysj line: 39, column: 2
          thread57201(tdone,ends);
          thread57202(tdone,ends);
          int biggest57206 = 0;
          if(ends[3]>=biggest57206){
            biggest57206=ends[3];
          }
          if(ends[4]>=biggest57206){
            biggest57206=ends[4];
          }
          if(biggest57206 == 1){
            active[2]=1;
            ends[2]=1;
            break RUN;
          }
        
        case 2 : 
          thread57207(tdone,ends);
          thread57208(tdone,ends);
          int biggest57212 = 0;
          if(ends[3]>=biggest57212){
            biggest57212=ends[3];
          }
          if(ends[4]>=biggest57212){
            biggest57212=ends[4];
          }
          if(biggest57212 == 1){
            active[2]=1;
            ends[2]=1;
            break RUN;
          }
          //FINXME code
          if(biggest57212 == 0){
            S43852=0;
            active[2]=0;
            ends[2]=0;
            S43852=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
