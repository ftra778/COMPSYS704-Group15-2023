import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\controller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\controller.sysj line: 2, column: 1

public class ControllerL extends ClockDomain{
  public ControllerL(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleReady = new Signal("bottleReady", Signal.INPUT);
  public Signal bottleAtPoint = new Signal("bottleAtPoint", Signal.INPUT);
  public Signal CMDfb = new Signal("CMDfb", Signal.INPUT);
  public Signal CMD = new Signal("CMD", Signal.OUTPUT);
  private int S387 = 1;
  private int S197 = 1;
  
  private int[] ends = new int[3];
  private int[] tdone = new int[3];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S387){
        case 0 : 
          S387=0;
          break RUN;
        
        case 1 : 
          S387=2;
          S387=2;
          S197=0;
          active[2]=1;
          ends[2]=1;
          break RUN;
        
        case 2 : 
          switch(S197){
            case 0 : 
              if(bottleReady.getprestatus()){//sysj\controller.sysj line: 67, column: 10
                S197=1;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 1 : 
              if(!bottleReady.getprestatus()){//sysj\controller.sysj line: 68, column: 10
                S197=2;
                CMD.setPresent();//sysj\controller.sysj line: 72, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb B");//sysj\controller.sysj line: 72, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 2 : 
              if(CMDfb.getprestatus()){//sysj\controller.sysj line: 71, column: 10
                S197=3;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\controller.sysj line: 72, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb B");//sysj\controller.sysj line: 72, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 3 : 
              if(!CMDfb.getprestatus()){//sysj\controller.sysj line: 74, column: 10
                S197=4;
                CMD.setPresent();//sysj\controller.sysj line: 78, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper left_limb close");//sysj\controller.sysj line: 78, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 4 : 
              if(CMDfb.getprestatus()){//sysj\controller.sysj line: 77, column: 10
                S197=5;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\controller.sysj line: 78, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper left_limb close");//sysj\controller.sysj line: 78, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 5 : 
              if(!CMDfb.getprestatus()){//sysj\controller.sysj line: 80, column: 10
                S197=6;
                CMD.setPresent();//sysj\controller.sysj line: 84, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb C");//sysj\controller.sysj line: 84, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 6 : 
              if(CMDfb.getprestatus()){//sysj\controller.sysj line: 83, column: 10
                S197=7;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\controller.sysj line: 84, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb C");//sysj\controller.sysj line: 84, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 7 : 
              if(!CMDfb.getprestatus()){//sysj\controller.sysj line: 86, column: 10
                S197=8;
                CMD.setPresent();//sysj\controller.sysj line: 90, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb D");//sysj\controller.sysj line: 90, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 8 : 
              if(CMDfb.getprestatus()){//sysj\controller.sysj line: 89, column: 10
                S197=9;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\controller.sysj line: 90, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb D");//sysj\controller.sysj line: 90, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 9 : 
              if(!CMDfb.getprestatus()){//sysj\controller.sysj line: 92, column: 10
                S197=10;
                CMD.setPresent();//sysj\controller.sysj line: 96, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper left_limb open");//sysj\controller.sysj line: 96, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 10 : 
              if(CMDfb.getprestatus()){//sysj\controller.sysj line: 95, column: 10
                S197=11;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\controller.sysj line: 96, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper left_limb open");//sysj\controller.sysj line: 96, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 11 : 
              if(!CMDfb.getprestatus()){//sysj\controller.sysj line: 98, column: 10
                S197=12;
                CMD.setPresent();//sysj\controller.sysj line: 102, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb A");//sysj\controller.sysj line: 102, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 12 : 
              if(CMDfb.getprestatus()){//sysj\controller.sysj line: 101, column: 10
                S197=13;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\controller.sysj line: 102, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb A");//sysj\controller.sysj line: 102, column: 5
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
            case 13 : 
              if(!CMDfb.getprestatus()){//sysj\controller.sysj line: 104, column: 10
                S197=0;
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
              else {
                active[2]=1;
                ends[2]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1};
    char [] paused1 = {0, 0, 0};
    char [] suspended1 = {0, 0, 0};
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
          bottleReady.gethook();
          bottleAtPoint.gethook();
          CMDfb.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleReady.setpreclear();
      bottleAtPoint.setpreclear();
      CMDfb.setpreclear();
      CMD.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleReady.getStatus() ? bottleReady.setprepresent() : bottleReady.setpreclear();
      bottleReady.setpreval(bottleReady.getValue());
      bottleReady.setClear();
      dummyint = bottleAtPoint.getStatus() ? bottleAtPoint.setprepresent() : bottleAtPoint.setpreclear();
      bottleAtPoint.setpreval(bottleAtPoint.getValue());
      bottleAtPoint.setClear();
      dummyint = CMDfb.getStatus() ? CMDfb.setprepresent() : CMDfb.setpreclear();
      CMDfb.setpreval(CMDfb.getValue());
      CMDfb.setClear();
      CMD.sethook();
      CMD.setClear();
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
        bottleReady.gethook();
        bottleAtPoint.gethook();
        CMDfb.gethook();
      }
      runFinisher();
      if(active[2] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
