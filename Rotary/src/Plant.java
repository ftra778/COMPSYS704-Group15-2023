import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal turn = new Signal("turn", Signal.INPUT);
  public Signal stop = new Signal("stop", Signal.INPUT);
  public Signal turnE = new Signal("turnE", Signal.OUTPUT);
  public Signal stopE = new Signal("stopE", Signal.OUTPUT);
  private int S331 = 1;
  private int S279 = 1;
  private int S267 = 1;
  private int S297 = 1;
  private int S287 = 1;
  private int S281 = 1;
  private int S295 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread342(int [] tdone, int [] ends){
        switch(S295){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(stop.getprestatus()){//sysj\plant.sysj line: 34, column: 24
          stopE.setPresent();//sysj\plant.sysj line: 34, column: 30
          currsigs.addElement(stopE);
          ;//sysj\plant.sysj line: 34, column: 42
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          ;//sysj\plant.sysj line: 34, column: 42
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread341(int [] tdone, int [] ends){
        switch(S287){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S281){
          case 0 : 
            S281=0;
            if(turn.getprestatus()){//sysj\plant.sysj line: 32, column: 24
              turnE.setPresent();//sysj\plant.sysj line: 32, column: 30
              currsigs.addElement(turnE);
              ;//sysj\plant.sysj line: 32, column: 42
              S281=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              ;//sysj\plant.sysj line: 32, column: 42
              S281=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S281=1;
            S281=0;
            if(turn.getprestatus()){//sysj\plant.sysj line: 32, column: 24
              turnE.setPresent();//sysj\plant.sysj line: 32, column: 30
              currsigs.addElement(turnE);
              ;//sysj\plant.sysj line: 32, column: 42
              S281=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              ;//sysj\plant.sysj line: 32, column: 42
              S281=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread340(int [] tdone, int [] ends){
        switch(S297){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread341(tdone,ends);
        thread342(tdone,ends);
        int biggest343 = 0;
        if(ends[4]>=biggest343){
          biggest343=ends[4];
        }
        if(ends[5]>=biggest343){
          biggest343=ends[5];
        }
        if(biggest343 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest343 == 0){
          S297=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread339(int [] tdone, int [] ends){
        switch(S279){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S267){
          case 0 : 
            if(turn.getprestatus()){//sysj\plant.sysj line: 14, column: 10
              System.out.println("TURN");//sysj\plant.sysj line: 16, column: 5
              S267=1;
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
          
          case 1 : 
            if(stop.getprestatus()){//sysj\plant.sysj line: 19, column: 10
              System.out.println("STOP");//sysj\plant.sysj line: 21, column: 5
              S267=0;
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
        break;
      
    }
  }

  public void thread336(int [] tdone, int [] ends){
        S295=1;
    if(stop.getprestatus()){//sysj\plant.sysj line: 34, column: 24
      stopE.setPresent();//sysj\plant.sysj line: 34, column: 30
      currsigs.addElement(stopE);
      ;//sysj\plant.sysj line: 34, column: 42
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      ;//sysj\plant.sysj line: 34, column: 42
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread335(int [] tdone, int [] ends){
        S287=1;
    S281=0;
    if(turn.getprestatus()){//sysj\plant.sysj line: 32, column: 24
      turnE.setPresent();//sysj\plant.sysj line: 32, column: 30
      currsigs.addElement(turnE);
      ;//sysj\plant.sysj line: 32, column: 42
      S281=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      ;//sysj\plant.sysj line: 32, column: 42
      S281=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread334(int [] tdone, int [] ends){
        S297=1;
    thread335(tdone,ends);
    thread336(tdone,ends);
    int biggest337 = 0;
    if(ends[4]>=biggest337){
      biggest337=ends[4];
    }
    if(ends[5]>=biggest337){
      biggest337=ends[5];
    }
    if(biggest337 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread333(int [] tdone, int [] ends){
        S279=1;
    S267=0;
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
      switch(S331){
        case 0 : 
          S331=0;
          break RUN;
        
        case 1 : 
          S331=2;
          S331=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 10, column: 2
          thread333(tdone,ends);
          thread334(tdone,ends);
          int biggest338 = 0;
          if(ends[2]>=biggest338){
            biggest338=ends[2];
          }
          if(ends[3]>=biggest338){
            biggest338=ends[3];
          }
          if(biggest338 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread339(tdone,ends);
          thread340(tdone,ends);
          int biggest344 = 0;
          if(ends[2]>=biggest344){
            biggest344=ends[2];
          }
          if(ends[3]>=biggest344){
            biggest344=ends[3];
          }
          if(biggest344 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest344 == 0){
            S331=0;
            active[1]=0;
            ends[1]=0;
            S331=0;
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        turn.gethook();
        stop.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
