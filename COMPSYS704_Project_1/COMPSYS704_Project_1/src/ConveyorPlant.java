import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\ABSplant.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABSplant.sysj line: 2, column: 1

public class ConveyorPlant extends ClockDomain{
  public ConveyorPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal ConveyorON = new Signal("ConveyorON", Signal.INPUT);
  public Signal ConveyorOFF = new Signal("ConveyorOFF", Signal.INPUT);
  public Signal emergencyStopPlant = new Signal("emergencyStopPlant", Signal.INPUT);
  public Signal ConveyorONe = new Signal("ConveyorONe", Signal.OUTPUT);
  public Signal ConveyorOFFe = new Signal("ConveyorOFFe", Signal.OUTPUT);
  private int S31598 = 1;
  private int S31574 = 1;
  
  private int[] ends = new int[53];
  private int[] tdone = new int[53];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S31598){
        case 0 : 
          S31598=0;
          break RUN;
        
        case 1 : 
          S31598=2;
          S31598=2;
          System.out.println("ConveyorPlant");//sysj\ABSplant.sysj line: 12, column: 2
          S31574=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S31574){
            case 0 : 
              if(ConveyorON.getprestatus() && !emergencyStopPlant.getprestatus()){//sysj\ABSplant.sysj line: 15, column: 10
                System.out.println("Conveyor ON");//sysj\ABSplant.sysj line: 17, column: 5
                ConveyorONe.setPresent();//sysj\ABSplant.sysj line: 18, column: 5
                currsigs.addElement(ConveyorONe);
                S31574=1;
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
              if(ConveyorOFF.getprestatus() || emergencyStopPlant.getprestatus()){//sysj\ABSplant.sysj line: 21, column: 10
                System.out.println("Conveyor OFF");//sysj\ABSplant.sysj line: 23, column: 5
                ConveyorOFFe.setPresent();//sysj\ABSplant.sysj line: 24, column: 5
                currsigs.addElement(ConveyorOFFe);
                S31574=0;
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
          emergencyStopPlant.gethook();
          df = true;
        }
        runClockDomain();
      }
      ConveyorON.setpreclear();
      ConveyorOFF.setpreclear();
      emergencyStopPlant.setpreclear();
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
      dummyint = emergencyStopPlant.getStatus() ? emergencyStopPlant.setprepresent() : emergencyStopPlant.setpreclear();
      emergencyStopPlant.setpreval(emergencyStopPlant.getValue());
      emergencyStopPlant.setClear();
      ConveyorONe.sethook();
      ConveyorONe.setClear();
      ConveyorOFFe.sethook();
      ConveyorOFFe.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        ConveyorON.gethook();
        ConveyorOFF.gethook();
        emergencyStopPlant.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
