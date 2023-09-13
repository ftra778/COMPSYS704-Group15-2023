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
  public Signal ConveyorON = new Signal("ConveyorON", Signal.INPUT);
  public Signal ConveyorOFF = new Signal("ConveyorOFF", Signal.INPUT);
  public Signal ConveyorONe = new Signal("ConveyorONe", Signal.OUTPUT);
  public Signal ConveyorOFFe = new Signal("ConveyorOFFe", Signal.OUTPUT);
  private int S290 = 1;
  private int S266 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S290){
        case 0 : 
          S290=0;
          break RUN;
        
        case 1 : 
          S290=2;
          S290=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 9, column: 2
          S266=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S266){
            case 0 : 
              if(ConveyorON.getprestatus()){//sysj\plant.sysj line: 13, column: 10
                System.out.println("ConveyorON");//sysj\plant.sysj line: 15, column: 5
                ConveyorONe.setPresent();//sysj\plant.sysj line: 16, column: 5
                currsigs.addElement(ConveyorONe);
                S266=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(ConveyorOFF.getprestatus()){//sysj\plant.sysj line: 19, column: 10
                System.out.println("Conveyor OFF");//sysj\plant.sysj line: 21, column: 5
                ConveyorOFFe.setPresent();//sysj\plant.sysj line: 22, column: 5
                currsigs.addElement(ConveyorOFFe);
                S266=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
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
          ConveyorON.gethook();
          ConveyorOFF.gethook();
          df = true;
        }
        runClockDomain();
      }
      ConveyorON.setpreclear();
      ConveyorOFF.setpreclear();
      ConveyorONe.setpreclear();
      ConveyorOFFe.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = ConveyorON.getStatus() ? ConveyorON.setprepresent() : ConveyorON.setpreclear();
      ConveyorON.setpreval(ConveyorON.getValue());
      ConveyorON.setClear();
      dummyint = ConveyorOFF.getStatus() ? ConveyorOFF.setprepresent() : ConveyorOFF.setpreclear();
      ConveyorOFF.setpreval(ConveyorOFF.getValue());
      ConveyorOFF.setClear();
      ConveyorONe.sethook();
      ConveyorONe.setClear();
      ConveyorOFFe.sethook();
      ConveyorOFFe.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        ConveyorON.gethook();
        ConveyorOFF.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
