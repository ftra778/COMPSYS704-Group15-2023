import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\ABScontroller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABScontroller.sysj line: 2, column: 1

public class BaxterControllerR extends ClockDomain{
  public BaxterControllerR(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleReady = new Signal("bottleReady", Signal.INPUT);
  public Signal bottleAtPoint = new Signal("bottleAtPoint", Signal.INPUT);
  public Signal emergency = new Signal("emergency", Signal.INPUT);
  public Signal CMDfb = new Signal("CMDfb", Signal.INPUT);
  public Signal emptyBottleReady = new Signal("emptyBottleReady", Signal.OUTPUT);
  public Signal CMD = new Signal("CMD", Signal.OUTPUT);
  private int S30946 = 1;
  private int S30564 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S30946){
        case 0 : 
          S30946=0;
          break RUN;
        
        case 1 : 
          S30946=2;
          S30946=2;
          System.out.println("BaxterControllerR");//sysj\ABScontroller.sysj line: 428, column: 2
          S30564=0;
          active[65]=1;
          ends[65]=1;
          break RUN;
        
        case 2 : 
          switch(S30564){
            case 0 : 
              if(bottleReady.getprestatus()){//sysj\ABScontroller.sysj line: 432, column: 10
                S30564=1;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 1 : 
              if(!bottleReady.getprestatus()){//sysj\ABScontroller.sysj line: 433, column: 10
                System.out.println("bottleReadyR");//sysj\ABScontroller.sysj line: 434, column: 4
                S30564=2;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 438, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto right_limb B");//sysj\ABScontroller.sysj line: 438, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 2 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 437, column: 10
                S30564=3;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 438, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto right_limb B");//sysj\ABScontroller.sysj line: 438, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 3 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 440, column: 10
                S30564=4;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 444, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper right_limb close");//sysj\ABScontroller.sysj line: 444, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 4 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 443, column: 10
                S30564=5;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 444, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper right_limb close");//sysj\ABScontroller.sysj line: 444, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 5 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 446, column: 10
                S30564=6;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 450, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto right_limb C");//sysj\ABScontroller.sysj line: 450, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 6 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 449, column: 10
                S30564=7;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 450, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto right_limb C");//sysj\ABScontroller.sysj line: 450, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 7 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 452, column: 10
                S30564=8;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 456, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto right_limb D");//sysj\ABScontroller.sysj line: 456, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 8 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 455, column: 10
                S30564=9;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 456, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto right_limb D");//sysj\ABScontroller.sysj line: 456, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 9 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 458, column: 10
                S30564=10;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 462, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper right_limb open");//sysj\ABScontroller.sysj line: 462, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 10 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 461, column: 10
                S30564=11;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 462, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper right_limb open");//sysj\ABScontroller.sysj line: 462, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 11 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 464, column: 10
                S30564=12;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 468, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto right_limb A");//sysj\ABScontroller.sysj line: 468, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 12 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 467, column: 10
                S30564=13;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 468, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto right_limb A");//sysj\ABScontroller.sysj line: 468, column: 5
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 13 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 470, column: 10
                emptyBottleReady.setPresent();//sysj\ABScontroller.sysj line: 471, column: 4
                currsigs.addElement(emptyBottleReady);
                S30564=0;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
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
    while(active[65] != 0){
      int index = 65;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[65]!=0 || suspended[65]!=0 || active[65]!=1);
      else{
        if(!df){
          bottleReady.gethook();
          bottleAtPoint.gethook();
          emergency.gethook();
          CMDfb.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleReady.setpreclear();
      bottleAtPoint.setpreclear();
      emergency.setpreclear();
      CMDfb.setpreclear();
      emptyBottleReady.setpreclear();
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
      dummyint = emergency.getStatus() ? emergency.setprepresent() : emergency.setpreclear();
      emergency.setpreval(emergency.getValue());
      emergency.setClear();
      dummyint = CMDfb.getStatus() ? CMDfb.setprepresent() : CMDfb.setpreclear();
      CMDfb.setpreval(CMDfb.getValue());
      CMDfb.setClear();
      emptyBottleReady.sethook();
      emptyBottleReady.setClear();
      CMD.sethook();
      CMD.setClear();
      if(paused[65]!=0 || suspended[65]!=0 || active[65]!=1);
      else{
        bottleReady.gethook();
        bottleAtPoint.gethook();
        emergency.gethook();
        CMDfb.gethook();
      }
      runFinisher();
      if(active[65] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
