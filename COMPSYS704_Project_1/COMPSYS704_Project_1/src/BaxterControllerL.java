import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\ABScontroller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABScontroller.sysj line: 2, column: 1

public class BaxterControllerL extends ClockDomain{
  public BaxterControllerL(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleReady = new Signal("bottleReady", Signal.INPUT);
  public Signal bottleAtPoint = new Signal("bottleAtPoint", Signal.INPUT);
  public Signal emergency = new Signal("emergency", Signal.INPUT);
  public Signal CMDfb = new Signal("CMDfb", Signal.INPUT);
  public Signal CMD = new Signal("CMD", Signal.OUTPUT);
  private int S32106 = 1;
  private int S31724 = 1;
  
  private int[] ends = new int[75];
  private int[] tdone = new int[75];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S32106){
        case 0 : 
          S32106=0;
          break RUN;
        
        case 1 : 
          S32106=2;
          S32106=2;
          System.out.println("BaxterControllerL");//sysj\ABScontroller.sysj line: 514, column: 2
          S31724=0;
          active[74]=1;
          ends[74]=1;
          break RUN;
        
        case 2 : 
          switch(S31724){
            case 0 : 
              if(bottleReady.getprestatus()){//sysj\ABScontroller.sysj line: 518, column: 10
                S31724=1;
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 1 : 
              if(!bottleReady.getprestatus()){//sysj\ABScontroller.sysj line: 519, column: 10
                System.out.println("bottleReadyL");//sysj\ABScontroller.sysj line: 520, column: 4
                S31724=2;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 524, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb B");//sysj\ABScontroller.sysj line: 524, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 2 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 523, column: 10
                S31724=3;
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 524, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb B");//sysj\ABScontroller.sysj line: 524, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 3 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 526, column: 10
                S31724=4;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 530, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper left_limb close");//sysj\ABScontroller.sysj line: 530, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 4 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 529, column: 10
                S31724=5;
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 530, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper left_limb close");//sysj\ABScontroller.sysj line: 530, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 5 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 532, column: 10
                S31724=6;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 536, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb C");//sysj\ABScontroller.sysj line: 536, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 6 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 535, column: 10
                S31724=7;
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 536, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb C");//sysj\ABScontroller.sysj line: 536, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 7 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 538, column: 10
                S31724=8;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 542, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb D");//sysj\ABScontroller.sysj line: 542, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 8 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 541, column: 10
                S31724=9;
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 542, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb D");//sysj\ABScontroller.sysj line: 542, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 9 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 544, column: 10
                S31724=10;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 548, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper left_limb open");//sysj\ABScontroller.sysj line: 548, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 10 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 547, column: 10
                S31724=11;
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 548, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_gripper left_limb open");//sysj\ABScontroller.sysj line: 548, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 11 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 550, column: 10
                S31724=12;
                CMD.setPresent();//sysj\ABScontroller.sysj line: 554, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb A");//sysj\ABScontroller.sysj line: 554, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 12 : 
              if(CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 553, column: 10
                S31724=13;
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                CMD.setPresent();//sysj\ABScontroller.sysj line: 554, column: 5
                currsigs.addElement(CMD);
                CMD.setValue("limb_moveto left_limb A");//sysj\ABScontroller.sysj line: 554, column: 5
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
            case 13 : 
              if(!CMDfb.getprestatus()){//sysj\ABScontroller.sysj line: 556, column: 10
                S31724=0;
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
              else {
                active[74]=1;
                ends[74]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[74] != 0){
      int index = 74;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[74]!=0 || suspended[74]!=0 || active[74]!=1);
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
      CMD.sethook();
      CMD.setClear();
      if(paused[74]!=0 || suspended[74]!=0 || active[74]!=1);
      else{
        bottleReady.gethook();
        bottleAtPoint.gethook();
        emergency.gethook();
        CMDfb.gethook();
      }
      runFinisher();
      if(active[74] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
