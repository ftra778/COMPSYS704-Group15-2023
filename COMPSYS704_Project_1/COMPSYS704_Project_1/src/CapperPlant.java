import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\ABSplant.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABSplant.sysj line: 2, column: 1

public class CapperPlant extends ClockDomain{
  public CapperPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal modeGUI = new Signal("modeGUI", Signal.INPUT);
  public Signal clampBottle = new Signal("clampBottle", Signal.INPUT);
  public Signal gripCap = new Signal("gripCap", Signal.INPUT);
  public Signal lowerCapper = new Signal("lowerCapper", Signal.INPUT);
  public Signal turnGripperFinal = new Signal("turnGripperFinal", Signal.INPUT);
  public Signal turnGripperHome = new Signal("turnGripperHome", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.OUTPUT);
  public Signal clampClose = new Signal("clampClose", Signal.OUTPUT);
  public Signal clampOpen = new Signal("clampOpen", Signal.OUTPUT);
  public Signal gripperClose = new Signal("gripperClose", Signal.OUTPUT);
  public Signal gripperOpen = new Signal("gripperOpen", Signal.OUTPUT);
  public Signal capperRaised = new Signal("capperRaised", Signal.OUTPUT);
  public Signal capperLowered = new Signal("capperLowered", Signal.OUTPUT);
  public Signal gripperAtFinal = new Signal("gripperAtFinal", Signal.OUTPUT);
  public Signal gripperAtHome = new Signal("gripperAtHome", Signal.OUTPUT);
  public Signal bottlePos5Disp = new Signal("bottlePos5Disp", Signal.OUTPUT);
  public Signal clampCloseE = new Signal("clampCloseE", Signal.OUTPUT);
  public Signal clampOpenE = new Signal("clampOpenE", Signal.OUTPUT);
  public Signal gripperCloseE = new Signal("gripperCloseE", Signal.OUTPUT);
  public Signal gripperOpenE = new Signal("gripperOpenE", Signal.OUTPUT);
  public Signal capperRaisedE = new Signal("capperRaisedE", Signal.OUTPUT);
  public Signal capperLoweredE = new Signal("capperLoweredE", Signal.OUTPUT);
  public Signal gripperAtFinalE = new Signal("gripperAtFinalE", Signal.OUTPUT);
  public Signal gripperAtHomeE = new Signal("gripperAtHomeE", Signal.OUTPUT);
  public Signal bottlePos5DispE = new Signal("bottlePos5DispE", Signal.OUTPUT);
  private int S33680 = 1;
  private int S33089 = 1;
  private int S33043 = 1;
  private int S33142 = 1;
  private int S33096 = 1;
  private int S33195 = 1;
  private int S33149 = 1;
  private int S33248 = 1;
  private int S33202 = 1;
  private int S33280 = 1;
  private int S33250 = 1;
  private int S33346 = 1;
  private int S33288 = 1;
  private int S33296 = 1;
  private int S33304 = 1;
  private int S33312 = 1;
  private int S33320 = 1;
  private int S33328 = 1;
  private int S33336 = 1;
  private int S33344 = 1;
  private int S33357 = 1;
  
  private int[] ends = new int[53];
  private int[] tdone = new int[53];
  
  public void thread34250(int [] tdone, int [] ends){
        switch(S33357){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(modeGUI.getprestatus()){//sysj\ABSplant.sysj line: 286, column: 12
          mode = modeGUI;//sysj\ABSplant.sysj line: 287, column: 5
          mode.setPresent();//sysj\ABSplant.sysj line: 288, column: 5
          currsigs.addElement(mode);
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        break;
      
    }
  }

  public void thread34248(int [] tdone, int [] ends){
        switch(S33344){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(bottlePos5Disp.getprestatus()){//sysj\ABSplant.sysj line: 281, column: 24
          bottlePos5DispE.setPresent();//sysj\ABSplant.sysj line: 281, column: 40
          currsigs.addElement(bottlePos5DispE);
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread34247(int [] tdone, int [] ends){
        switch(S33336){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(gripperAtFinal.getprestatus()){//sysj\ABSplant.sysj line: 279, column: 24
          gripperAtFinalE.setPresent();//sysj\ABSplant.sysj line: 279, column: 40
          currsigs.addElement(gripperAtFinalE);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread34246(int [] tdone, int [] ends){
        switch(S33328){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(capperLowered.getprestatus()){//sysj\ABSplant.sysj line: 277, column: 24
          capperLoweredE.setPresent();//sysj\ABSplant.sysj line: 277, column: 39
          currsigs.addElement(capperLoweredE);
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread34245(int [] tdone, int [] ends){
        switch(S33320){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(capperRaised.getprestatus()){//sysj\ABSplant.sysj line: 275, column: 24
          capperRaisedE.setPresent();//sysj\ABSplant.sysj line: 275, column: 38
          currsigs.addElement(capperRaisedE);
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        else {
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread34244(int [] tdone, int [] ends){
        switch(S33312){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(gripperAtHome.getprestatus()){//sysj\ABSplant.sysj line: 273, column: 24
          gripperAtHomeE.setPresent();//sysj\ABSplant.sysj line: 273, column: 39
          currsigs.addElement(gripperAtHomeE);
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        else {
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread34243(int [] tdone, int [] ends){
        switch(S33304){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(gripperClose.getprestatus()){//sysj\ABSplant.sysj line: 271, column: 24
          gripperCloseE.setPresent();//sysj\ABSplant.sysj line: 271, column: 38
          currsigs.addElement(gripperCloseE);
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread34242(int [] tdone, int [] ends){
        switch(S33296){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(clampOpen.getprestatus()){//sysj\ABSplant.sysj line: 269, column: 24
          clampOpenE.setPresent();//sysj\ABSplant.sysj line: 269, column: 35
          currsigs.addElement(clampOpenE);
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread34241(int [] tdone, int [] ends){
        switch(S33288){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(clampClose.getprestatus()){//sysj\ABSplant.sysj line: 267, column: 24
          clampCloseE.setPresent();//sysj\ABSplant.sysj line: 267, column: 36
          currsigs.addElement(clampCloseE);
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread34240(int [] tdone, int [] ends){
        switch(S33346){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        thread34241(tdone,ends);
        thread34242(tdone,ends);
        thread34243(tdone,ends);
        thread34244(tdone,ends);
        thread34245(tdone,ends);
        thread34246(tdone,ends);
        thread34247(tdone,ends);
        thread34248(tdone,ends);
        int biggest34249 = 0;
        if(ends[28]>=biggest34249){
          biggest34249=ends[28];
        }
        if(ends[29]>=biggest34249){
          biggest34249=ends[29];
        }
        if(ends[30]>=biggest34249){
          biggest34249=ends[30];
        }
        if(ends[31]>=biggest34249){
          biggest34249=ends[31];
        }
        if(ends[32]>=biggest34249){
          biggest34249=ends[32];
        }
        if(ends[33]>=biggest34249){
          biggest34249=ends[33];
        }
        if(ends[34]>=biggest34249){
          biggest34249=ends[34];
        }
        if(ends[35]>=biggest34249){
          biggest34249=ends[35];
        }
        if(biggest34249 == 1){
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        //FINXME code
        if(biggest34249 == 0){
          S33346=0;
          active[27]=0;
          ends[27]=0;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread34239(int [] tdone, int [] ends){
        switch(S33280){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S33250){
          case 0 : 
            if(bottlePos5.getprestatus() && capperRaised.getprestatus()){//sysj\ABSplant.sysj line: 256, column: 10
              S33250=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            else {
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 1 : 
            S33250=1;
            S33250=2;
            bottlePos5Disp.setPresent();//sysj\ABSplant.sysj line: 261, column: 5
            currsigs.addElement(bottlePos5Disp);
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
            break;
          
          case 2 : 
            if(!bottlePos5.getprestatus()){//sysj\ABSplant.sysj line: 260, column: 10
              S33250=0;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            else {
              bottlePos5Disp.setPresent();//sysj\ABSplant.sysj line: 261, column: 5
              currsigs.addElement(bottlePos5Disp);
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread34238(int [] tdone, int [] ends){
        switch(S33248){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S33202){
          case 0 : 
            if(lowerCapper.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 243, column: 10
              S33202=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              capperRaised.setPresent();//sysj\ABSplant.sysj line: 244, column: 5
              currsigs.addElement(capperRaised);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 246, column: 10
              S33202=2;
              capperLowered.setPresent();//sysj\ABSplant.sysj line: 248, column: 5
              currsigs.addElement(capperLowered);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 2 : 
            if(!lowerCapper.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 247, column: 10
              S33202=3;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              capperLowered.setPresent();//sysj\ABSplant.sysj line: 248, column: 5
              currsigs.addElement(capperLowered);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 250, column: 10
              S33202=0;
              capperRaised.setPresent();//sysj\ABSplant.sysj line: 244, column: 5
              currsigs.addElement(capperRaised);
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread34237(int [] tdone, int [] ends){
        switch(S33195){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S33149){
          case 0 : 
            if(turnGripperFinal.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 230, column: 10
              S33149=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              gripperAtHome.setPresent();//sysj\ABSplant.sysj line: 231, column: 5
              currsigs.addElement(gripperAtHome);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 233, column: 10
              S33149=2;
              gripperAtFinal.setPresent();//sysj\ABSplant.sysj line: 235, column: 5
              currsigs.addElement(gripperAtFinal);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 2 : 
            if(turnGripperHome.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 234, column: 10
              S33149=3;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              gripperAtFinal.setPresent();//sysj\ABSplant.sysj line: 235, column: 5
              currsigs.addElement(gripperAtFinal);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 237, column: 10
              S33149=0;
              gripperAtHome.setPresent();//sysj\ABSplant.sysj line: 231, column: 5
              currsigs.addElement(gripperAtHome);
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread34236(int [] tdone, int [] ends){
        switch(S33142){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S33096){
          case 0 : 
            if(gripCap.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 217, column: 10
              S33096=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              gripperOpen.setPresent();//sysj\ABSplant.sysj line: 218, column: 5
              currsigs.addElement(gripperOpen);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 220, column: 10
              S33096=2;
              gripperClose.setPresent();//sysj\ABSplant.sysj line: 222, column: 5
              currsigs.addElement(gripperClose);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
          case 2 : 
            if(!gripCap.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 221, column: 10
              S33096=3;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              gripperClose.setPresent();//sysj\ABSplant.sysj line: 222, column: 5
              currsigs.addElement(gripperClose);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 224, column: 10
              S33096=0;
              gripperOpen.setPresent();//sysj\ABSplant.sysj line: 218, column: 5
              currsigs.addElement(gripperOpen);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread34235(int [] tdone, int [] ends){
        switch(S33089){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S33043){
          case 0 : 
            if(clampBottle.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 204, column: 10
              S33043=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              clampOpen.setPresent();//sysj\ABSplant.sysj line: 205, column: 5
              currsigs.addElement(clampOpen);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 207, column: 10
              S33043=2;
              clampClose.setPresent();//sysj\ABSplant.sysj line: 209, column: 5
              currsigs.addElement(clampClose);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 2 : 
            if(!clampBottle.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 208, column: 10
              S33043=3;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              clampClose.setPresent();//sysj\ABSplant.sysj line: 209, column: 5
              currsigs.addElement(clampClose);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 211, column: 10
              S33043=0;
              clampOpen.setPresent();//sysj\ABSplant.sysj line: 205, column: 5
              currsigs.addElement(clampOpen);
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread34233(int [] tdone, int [] ends){
        S33357=1;
    if(modeGUI.getprestatus()){//sysj\ABSplant.sysj line: 286, column: 12
      mode = modeGUI;//sysj\ABSplant.sysj line: 287, column: 5
      mode.setPresent();//sysj\ABSplant.sysj line: 288, column: 5
      currsigs.addElement(mode);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread34231(int [] tdone, int [] ends){
        S33344=1;
    if(bottlePos5Disp.getprestatus()){//sysj\ABSplant.sysj line: 281, column: 24
      bottlePos5DispE.setPresent();//sysj\ABSplant.sysj line: 281, column: 40
      currsigs.addElement(bottlePos5DispE);
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread34230(int [] tdone, int [] ends){
        S33336=1;
    if(gripperAtFinal.getprestatus()){//sysj\ABSplant.sysj line: 279, column: 24
      gripperAtFinalE.setPresent();//sysj\ABSplant.sysj line: 279, column: 40
      currsigs.addElement(gripperAtFinalE);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread34229(int [] tdone, int [] ends){
        S33328=1;
    if(capperLowered.getprestatus()){//sysj\ABSplant.sysj line: 277, column: 24
      capperLoweredE.setPresent();//sysj\ABSplant.sysj line: 277, column: 39
      currsigs.addElement(capperLoweredE);
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread34228(int [] tdone, int [] ends){
        S33320=1;
    if(capperRaised.getprestatus()){//sysj\ABSplant.sysj line: 275, column: 24
      capperRaisedE.setPresent();//sysj\ABSplant.sysj line: 275, column: 38
      currsigs.addElement(capperRaisedE);
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread34227(int [] tdone, int [] ends){
        S33312=1;
    if(gripperAtHome.getprestatus()){//sysj\ABSplant.sysj line: 273, column: 24
      gripperAtHomeE.setPresent();//sysj\ABSplant.sysj line: 273, column: 39
      currsigs.addElement(gripperAtHomeE);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread34226(int [] tdone, int [] ends){
        S33304=1;
    if(gripperClose.getprestatus()){//sysj\ABSplant.sysj line: 271, column: 24
      gripperCloseE.setPresent();//sysj\ABSplant.sysj line: 271, column: 38
      currsigs.addElement(gripperCloseE);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread34225(int [] tdone, int [] ends){
        S33296=1;
    if(clampOpen.getprestatus()){//sysj\ABSplant.sysj line: 269, column: 24
      clampOpenE.setPresent();//sysj\ABSplant.sysj line: 269, column: 35
      currsigs.addElement(clampOpenE);
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread34224(int [] tdone, int [] ends){
        S33288=1;
    if(clampClose.getprestatus()){//sysj\ABSplant.sysj line: 267, column: 24
      clampCloseE.setPresent();//sysj\ABSplant.sysj line: 267, column: 36
      currsigs.addElement(clampCloseE);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread34223(int [] tdone, int [] ends){
        S33346=1;
    thread34224(tdone,ends);
    thread34225(tdone,ends);
    thread34226(tdone,ends);
    thread34227(tdone,ends);
    thread34228(tdone,ends);
    thread34229(tdone,ends);
    thread34230(tdone,ends);
    thread34231(tdone,ends);
    int biggest34232 = 0;
    if(ends[28]>=biggest34232){
      biggest34232=ends[28];
    }
    if(ends[29]>=biggest34232){
      biggest34232=ends[29];
    }
    if(ends[30]>=biggest34232){
      biggest34232=ends[30];
    }
    if(ends[31]>=biggest34232){
      biggest34232=ends[31];
    }
    if(ends[32]>=biggest34232){
      biggest34232=ends[32];
    }
    if(ends[33]>=biggest34232){
      biggest34232=ends[33];
    }
    if(ends[34]>=biggest34232){
      biggest34232=ends[34];
    }
    if(ends[35]>=biggest34232){
      biggest34232=ends[35];
    }
    if(biggest34232 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread34222(int [] tdone, int [] ends){
        S33280=1;
    S33250=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread34221(int [] tdone, int [] ends){
        S33248=1;
    S33202=0;
    capperRaised.setPresent();//sysj\ABSplant.sysj line: 244, column: 5
    currsigs.addElement(capperRaised);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread34220(int [] tdone, int [] ends){
        S33195=1;
    S33149=0;
    gripperAtHome.setPresent();//sysj\ABSplant.sysj line: 231, column: 5
    currsigs.addElement(gripperAtHome);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread34219(int [] tdone, int [] ends){
        S33142=1;
    S33096=0;
    gripperOpen.setPresent();//sysj\ABSplant.sysj line: 218, column: 5
    currsigs.addElement(gripperOpen);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread34218(int [] tdone, int [] ends){
        S33089=1;
    S33043=0;
    clampOpen.setPresent();//sysj\ABSplant.sysj line: 205, column: 5
    currsigs.addElement(clampOpen);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S33680){
        case 0 : 
          S33680=0;
          break RUN;
        
        case 1 : 
          S33680=2;
          S33680=2;
          System.out.println("CapperPlant");//sysj\ABSplant.sysj line: 201, column: 2
          thread34218(tdone,ends);
          thread34219(tdone,ends);
          thread34220(tdone,ends);
          thread34221(tdone,ends);
          thread34222(tdone,ends);
          thread34223(tdone,ends);
          thread34233(tdone,ends);
          int biggest34234 = 0;
          if(ends[22]>=biggest34234){
            biggest34234=ends[22];
          }
          if(ends[23]>=biggest34234){
            biggest34234=ends[23];
          }
          if(ends[24]>=biggest34234){
            biggest34234=ends[24];
          }
          if(ends[25]>=biggest34234){
            biggest34234=ends[25];
          }
          if(ends[26]>=biggest34234){
            biggest34234=ends[26];
          }
          if(ends[27]>=biggest34234){
            biggest34234=ends[27];
          }
          if(ends[36]>=biggest34234){
            biggest34234=ends[36];
          }
          if(biggest34234 == 1){
            active[21]=1;
            ends[21]=1;
            break RUN;
          }
        
        case 2 : 
          thread34235(tdone,ends);
          thread34236(tdone,ends);
          thread34237(tdone,ends);
          thread34238(tdone,ends);
          thread34239(tdone,ends);
          thread34240(tdone,ends);
          thread34250(tdone,ends);
          int biggest34251 = 0;
          if(ends[22]>=biggest34251){
            biggest34251=ends[22];
          }
          if(ends[23]>=biggest34251){
            biggest34251=ends[23];
          }
          if(ends[24]>=biggest34251){
            biggest34251=ends[24];
          }
          if(ends[25]>=biggest34251){
            biggest34251=ends[25];
          }
          if(ends[26]>=biggest34251){
            biggest34251=ends[26];
          }
          if(ends[27]>=biggest34251){
            biggest34251=ends[27];
          }
          if(ends[36]>=biggest34251){
            biggest34251=ends[36];
          }
          if(biggest34251 == 1){
            active[21]=1;
            ends[21]=1;
            break RUN;
          }
          //FINXME code
          if(biggest34251 == 0){
            S33680=0;
            active[21]=0;
            ends[21]=0;
            S33680=0;
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
    while(active[21] != 0){
      int index = 21;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[21]!=0 || suspended[21]!=0 || active[21]!=1);
      else{
        if(!df){
          modeGUI.gethook();
          clampBottle.gethook();
          gripCap.gethook();
          lowerCapper.gethook();
          turnGripperFinal.gethook();
          turnGripperHome.gethook();
          enable.gethook();
          bottlePos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      modeGUI.setpreclear();
      clampBottle.setpreclear();
      gripCap.setpreclear();
      lowerCapper.setpreclear();
      turnGripperFinal.setpreclear();
      turnGripperHome.setpreclear();
      enable.setpreclear();
      bottlePos5.setpreclear();
      mode.setpreclear();
      clampClose.setpreclear();
      clampOpen.setpreclear();
      gripperClose.setpreclear();
      gripperOpen.setpreclear();
      capperRaised.setpreclear();
      capperLowered.setpreclear();
      gripperAtFinal.setpreclear();
      gripperAtHome.setpreclear();
      bottlePos5Disp.setpreclear();
      clampCloseE.setpreclear();
      clampOpenE.setpreclear();
      gripperCloseE.setpreclear();
      gripperOpenE.setpreclear();
      capperRaisedE.setpreclear();
      capperLoweredE.setpreclear();
      gripperAtFinalE.setpreclear();
      gripperAtHomeE.setpreclear();
      bottlePos5DispE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = modeGUI.getStatus() ? modeGUI.setprepresent() : modeGUI.setpreclear();
      modeGUI.setpreval(modeGUI.getValue());
      modeGUI.setClear();
      dummyint = clampBottle.getStatus() ? clampBottle.setprepresent() : clampBottle.setpreclear();
      clampBottle.setpreval(clampBottle.getValue());
      clampBottle.setClear();
      dummyint = gripCap.getStatus() ? gripCap.setprepresent() : gripCap.setpreclear();
      gripCap.setpreval(gripCap.getValue());
      gripCap.setClear();
      dummyint = lowerCapper.getStatus() ? lowerCapper.setprepresent() : lowerCapper.setpreclear();
      lowerCapper.setpreval(lowerCapper.getValue());
      lowerCapper.setClear();
      dummyint = turnGripperFinal.getStatus() ? turnGripperFinal.setprepresent() : turnGripperFinal.setpreclear();
      turnGripperFinal.setpreval(turnGripperFinal.getValue());
      turnGripperFinal.setClear();
      dummyint = turnGripperHome.getStatus() ? turnGripperHome.setprepresent() : turnGripperHome.setpreclear();
      turnGripperHome.setpreval(turnGripperHome.getValue());
      turnGripperHome.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = bottlePos5.getStatus() ? bottlePos5.setprepresent() : bottlePos5.setpreclear();
      bottlePos5.setpreval(bottlePos5.getValue());
      bottlePos5.setClear();
      mode.sethook();
      mode.setClear();
      clampClose.sethook();
      clampClose.setClear();
      clampOpen.sethook();
      clampOpen.setClear();
      gripperClose.sethook();
      gripperClose.setClear();
      gripperOpen.sethook();
      gripperOpen.setClear();
      capperRaised.sethook();
      capperRaised.setClear();
      capperLowered.sethook();
      capperLowered.setClear();
      gripperAtFinal.sethook();
      gripperAtFinal.setClear();
      gripperAtHome.sethook();
      gripperAtHome.setClear();
      bottlePos5Disp.sethook();
      bottlePos5Disp.setClear();
      clampCloseE.sethook();
      clampCloseE.setClear();
      clampOpenE.sethook();
      clampOpenE.setClear();
      gripperCloseE.sethook();
      gripperCloseE.setClear();
      gripperOpenE.sethook();
      gripperOpenE.setClear();
      capperRaisedE.sethook();
      capperRaisedE.setClear();
      capperLoweredE.sethook();
      capperLoweredE.setClear();
      gripperAtFinalE.sethook();
      gripperAtFinalE.setClear();
      gripperAtHomeE.sethook();
      gripperAtHomeE.setClear();
      bottlePos5DispE.sethook();
      bottlePos5DispE.setClear();
      if(paused[21]!=0 || suspended[21]!=0 || active[21]!=1);
      else{
        modeGUI.gethook();
        clampBottle.gethook();
        gripCap.gethook();
        lowerCapper.gethook();
        turnGripperFinal.gethook();
        turnGripperHome.gethook();
        enable.gethook();
        bottlePos5.gethook();
      }
      runFinisher();
      if(active[21] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
