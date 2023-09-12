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
  private int S12055 = 1;
  private int S11464 = 1;
  private int S11418 = 1;
  private int S11517 = 1;
  private int S11471 = 1;
  private int S11570 = 1;
  private int S11524 = 1;
  private int S11623 = 1;
  private int S11577 = 1;
  private int S11655 = 1;
  private int S11625 = 1;
  private int S11721 = 1;
  private int S11663 = 1;
  private int S11657 = 1;
  private int S11671 = 1;
  private int S11679 = 1;
  private int S11687 = 1;
  private int S11695 = 1;
  private int S11703 = 1;
  private int S11711 = 1;
  private int S11719 = 1;
  private int S11732 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread12089(int [] tdone, int [] ends){
        switch(S11732){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(modeGUI.getprestatus()){//sysj\plant.sysj line: 100, column: 12
          mode = modeGUI;//sysj\plant.sysj line: 101, column: 5
          mode.setPresent();//sysj\plant.sysj line: 102, column: 5
          currsigs.addElement(mode);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread12087(int [] tdone, int [] ends){
        switch(S11719){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottlePos5Disp.getprestatus()){//sysj\plant.sysj line: 95, column: 24
          bottlePos5DispE.setPresent();//sysj\plant.sysj line: 95, column: 40
          currsigs.addElement(bottlePos5DispE);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread12086(int [] tdone, int [] ends){
        switch(S11711){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(gripperAtFinal.getprestatus()){//sysj\plant.sysj line: 93, column: 24
          gripperAtFinalE.setPresent();//sysj\plant.sysj line: 93, column: 40
          currsigs.addElement(gripperAtFinalE);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread12085(int [] tdone, int [] ends){
        switch(S11703){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(capperLowered.getprestatus()){//sysj\plant.sysj line: 91, column: 24
          capperLoweredE.setPresent();//sysj\plant.sysj line: 91, column: 39
          currsigs.addElement(capperLoweredE);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread12084(int [] tdone, int [] ends){
        switch(S11695){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(capperRaised.getprestatus()){//sysj\plant.sysj line: 89, column: 24
          capperRaisedE.setPresent();//sysj\plant.sysj line: 89, column: 38
          currsigs.addElement(capperRaisedE);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread12083(int [] tdone, int [] ends){
        switch(S11687){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperAtHome.getprestatus()){//sysj\plant.sysj line: 87, column: 24
          gripperAtHomeE.setPresent();//sysj\plant.sysj line: 87, column: 39
          currsigs.addElement(gripperAtHomeE);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread12082(int [] tdone, int [] ends){
        switch(S11679){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperClose.getprestatus()){//sysj\plant.sysj line: 85, column: 24
          gripperCloseE.setPresent();//sysj\plant.sysj line: 85, column: 38
          currsigs.addElement(gripperCloseE);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread12081(int [] tdone, int [] ends){
        switch(S11671){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(clampOpen.getprestatus()){//sysj\plant.sysj line: 83, column: 24
          clampOpenE.setPresent();//sysj\plant.sysj line: 83, column: 35
          currsigs.addElement(clampOpenE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread12080(int [] tdone, int [] ends){
        switch(S11663){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S11657){
          case 0 : 
            S11657=0;
            if(clampClose.getprestatus()){//sysj\plant.sysj line: 81, column: 24
              clampCloseE.setPresent();//sysj\plant.sysj line: 81, column: 36
              currsigs.addElement(clampCloseE);
              S11657=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S11657=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S11657=1;
            S11657=0;
            if(clampClose.getprestatus()){//sysj\plant.sysj line: 81, column: 24
              clampCloseE.setPresent();//sysj\plant.sysj line: 81, column: 36
              currsigs.addElement(clampCloseE);
              S11657=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S11657=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread12079(int [] tdone, int [] ends){
        switch(S11721){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread12080(tdone,ends);
        thread12081(tdone,ends);
        thread12082(tdone,ends);
        thread12083(tdone,ends);
        thread12084(tdone,ends);
        thread12085(tdone,ends);
        thread12086(tdone,ends);
        thread12087(tdone,ends);
        int biggest12088 = 0;
        if(ends[8]>=biggest12088){
          biggest12088=ends[8];
        }
        if(ends[9]>=biggest12088){
          biggest12088=ends[9];
        }
        if(ends[10]>=biggest12088){
          biggest12088=ends[10];
        }
        if(ends[11]>=biggest12088){
          biggest12088=ends[11];
        }
        if(ends[12]>=biggest12088){
          biggest12088=ends[12];
        }
        if(ends[13]>=biggest12088){
          biggest12088=ends[13];
        }
        if(ends[14]>=biggest12088){
          biggest12088=ends[14];
        }
        if(ends[15]>=biggest12088){
          biggest12088=ends[15];
        }
        if(biggest12088 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest12088 == 0){
          S11721=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread12078(int [] tdone, int [] ends){
        switch(S11655){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S11625){
          case 0 : 
            if(bottlePos5.getprestatus() && capperRaised.getprestatus()){//sysj\plant.sysj line: 70, column: 10
              S11625=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S11625=1;
            S11625=2;
            bottlePos5Disp.setPresent();//sysj\plant.sysj line: 75, column: 5
            currsigs.addElement(bottlePos5Disp);
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
          case 2 : 
            if(!bottlePos5.getprestatus()){//sysj\plant.sysj line: 74, column: 10
              S11625=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottlePos5Disp.setPresent();//sysj\plant.sysj line: 75, column: 5
              currsigs.addElement(bottlePos5Disp);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread12077(int [] tdone, int [] ends){
        switch(S11623){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S11577){
          case 0 : 
            if(lowerCapper.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 57, column: 10
              S11577=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capperRaised.setPresent();//sysj\plant.sysj line: 58, column: 5
              currsigs.addElement(capperRaised);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 60, column: 10
              S11577=2;
              capperLowered.setPresent();//sysj\plant.sysj line: 62, column: 5
              currsigs.addElement(capperLowered);
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
          
          case 2 : 
            if(!lowerCapper.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 61, column: 10
              S11577=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capperLowered.setPresent();//sysj\plant.sysj line: 62, column: 5
              currsigs.addElement(capperLowered);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 64, column: 10
              S11577=0;
              capperRaised.setPresent();//sysj\plant.sysj line: 58, column: 5
              currsigs.addElement(capperRaised);
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
          
        }
        break;
      
    }
  }

  public void thread12076(int [] tdone, int [] ends){
        switch(S11570){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S11524){
          case 0 : 
            if(turnGripperFinal.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 44, column: 10
              S11524=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperAtHome.setPresent();//sysj\plant.sysj line: 45, column: 5
              currsigs.addElement(gripperAtHome);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 47, column: 10
              S11524=2;
              gripperAtFinal.setPresent();//sysj\plant.sysj line: 49, column: 5
              currsigs.addElement(gripperAtFinal);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            if(turnGripperHome.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 48, column: 10
              S11524=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperAtFinal.setPresent();//sysj\plant.sysj line: 49, column: 5
              currsigs.addElement(gripperAtFinal);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 51, column: 10
              S11524=0;
              gripperAtHome.setPresent();//sysj\plant.sysj line: 45, column: 5
              currsigs.addElement(gripperAtHome);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread12075(int [] tdone, int [] ends){
        switch(S11517){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S11471){
          case 0 : 
            if(gripCap.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 31, column: 10
              S11471=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperOpen.setPresent();//sysj\plant.sysj line: 32, column: 5
              currsigs.addElement(gripperOpen);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 34, column: 10
              S11471=2;
              gripperClose.setPresent();//sysj\plant.sysj line: 36, column: 5
              currsigs.addElement(gripperClose);
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
          
          case 2 : 
            if(!gripCap.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 35, column: 10
              S11471=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperClose.setPresent();//sysj\plant.sysj line: 36, column: 5
              currsigs.addElement(gripperClose);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 38, column: 10
              S11471=0;
              gripperOpen.setPresent();//sysj\plant.sysj line: 32, column: 5
              currsigs.addElement(gripperOpen);
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

  public void thread12074(int [] tdone, int [] ends){
        switch(S11464){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S11418){
          case 0 : 
            if(clampBottle.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 18, column: 10
              S11418=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              clampOpen.setPresent();//sysj\plant.sysj line: 19, column: 5
              currsigs.addElement(clampOpen);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 21, column: 10
              S11418=2;
              clampClose.setPresent();//sysj\plant.sysj line: 23, column: 5
              currsigs.addElement(clampClose);
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
          
          case 2 : 
            if(!clampBottle.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 22, column: 10
              S11418=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              clampClose.setPresent();//sysj\plant.sysj line: 23, column: 5
              currsigs.addElement(clampClose);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 25, column: 10
              S11418=0;
              clampOpen.setPresent();//sysj\plant.sysj line: 19, column: 5
              currsigs.addElement(clampOpen);
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

  public void thread12072(int [] tdone, int [] ends){
        S11732=1;
    if(modeGUI.getprestatus()){//sysj\plant.sysj line: 100, column: 12
      mode = modeGUI;//sysj\plant.sysj line: 101, column: 5
      mode.setPresent();//sysj\plant.sysj line: 102, column: 5
      currsigs.addElement(mode);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread12070(int [] tdone, int [] ends){
        S11719=1;
    if(bottlePos5Disp.getprestatus()){//sysj\plant.sysj line: 95, column: 24
      bottlePos5DispE.setPresent();//sysj\plant.sysj line: 95, column: 40
      currsigs.addElement(bottlePos5DispE);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread12069(int [] tdone, int [] ends){
        S11711=1;
    if(gripperAtFinal.getprestatus()){//sysj\plant.sysj line: 93, column: 24
      gripperAtFinalE.setPresent();//sysj\plant.sysj line: 93, column: 40
      currsigs.addElement(gripperAtFinalE);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread12068(int [] tdone, int [] ends){
        S11703=1;
    if(capperLowered.getprestatus()){//sysj\plant.sysj line: 91, column: 24
      capperLoweredE.setPresent();//sysj\plant.sysj line: 91, column: 39
      currsigs.addElement(capperLoweredE);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread12067(int [] tdone, int [] ends){
        S11695=1;
    if(capperRaised.getprestatus()){//sysj\plant.sysj line: 89, column: 24
      capperRaisedE.setPresent();//sysj\plant.sysj line: 89, column: 38
      currsigs.addElement(capperRaisedE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread12066(int [] tdone, int [] ends){
        S11687=1;
    if(gripperAtHome.getprestatus()){//sysj\plant.sysj line: 87, column: 24
      gripperAtHomeE.setPresent();//sysj\plant.sysj line: 87, column: 39
      currsigs.addElement(gripperAtHomeE);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread12065(int [] tdone, int [] ends){
        S11679=1;
    if(gripperClose.getprestatus()){//sysj\plant.sysj line: 85, column: 24
      gripperCloseE.setPresent();//sysj\plant.sysj line: 85, column: 38
      currsigs.addElement(gripperCloseE);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread12064(int [] tdone, int [] ends){
        S11671=1;
    if(clampOpen.getprestatus()){//sysj\plant.sysj line: 83, column: 24
      clampOpenE.setPresent();//sysj\plant.sysj line: 83, column: 35
      currsigs.addElement(clampOpenE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread12063(int [] tdone, int [] ends){
        S11663=1;
    S11657=0;
    if(clampClose.getprestatus()){//sysj\plant.sysj line: 81, column: 24
      clampCloseE.setPresent();//sysj\plant.sysj line: 81, column: 36
      currsigs.addElement(clampCloseE);
      S11657=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S11657=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread12062(int [] tdone, int [] ends){
        S11721=1;
    thread12063(tdone,ends);
    thread12064(tdone,ends);
    thread12065(tdone,ends);
    thread12066(tdone,ends);
    thread12067(tdone,ends);
    thread12068(tdone,ends);
    thread12069(tdone,ends);
    thread12070(tdone,ends);
    int biggest12071 = 0;
    if(ends[8]>=biggest12071){
      biggest12071=ends[8];
    }
    if(ends[9]>=biggest12071){
      biggest12071=ends[9];
    }
    if(ends[10]>=biggest12071){
      biggest12071=ends[10];
    }
    if(ends[11]>=biggest12071){
      biggest12071=ends[11];
    }
    if(ends[12]>=biggest12071){
      biggest12071=ends[12];
    }
    if(ends[13]>=biggest12071){
      biggest12071=ends[13];
    }
    if(ends[14]>=biggest12071){
      biggest12071=ends[14];
    }
    if(ends[15]>=biggest12071){
      biggest12071=ends[15];
    }
    if(biggest12071 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread12061(int [] tdone, int [] ends){
        S11655=1;
    S11625=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread12060(int [] tdone, int [] ends){
        S11623=1;
    S11577=0;
    capperRaised.setPresent();//sysj\plant.sysj line: 58, column: 5
    currsigs.addElement(capperRaised);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread12059(int [] tdone, int [] ends){
        S11570=1;
    S11524=0;
    gripperAtHome.setPresent();//sysj\plant.sysj line: 45, column: 5
    currsigs.addElement(gripperAtHome);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread12058(int [] tdone, int [] ends){
        S11517=1;
    S11471=0;
    gripperOpen.setPresent();//sysj\plant.sysj line: 32, column: 5
    currsigs.addElement(gripperOpen);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread12057(int [] tdone, int [] ends){
        S11464=1;
    S11418=0;
    clampOpen.setPresent();//sysj\plant.sysj line: 19, column: 5
    currsigs.addElement(clampOpen);
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
      switch(S12055){
        case 0 : 
          S12055=0;
          break RUN;
        
        case 1 : 
          S12055=2;
          S12055=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 14, column: 2
          thread12057(tdone,ends);
          thread12058(tdone,ends);
          thread12059(tdone,ends);
          thread12060(tdone,ends);
          thread12061(tdone,ends);
          thread12062(tdone,ends);
          thread12072(tdone,ends);
          int biggest12073 = 0;
          if(ends[2]>=biggest12073){
            biggest12073=ends[2];
          }
          if(ends[3]>=biggest12073){
            biggest12073=ends[3];
          }
          if(ends[4]>=biggest12073){
            biggest12073=ends[4];
          }
          if(ends[5]>=biggest12073){
            biggest12073=ends[5];
          }
          if(ends[6]>=biggest12073){
            biggest12073=ends[6];
          }
          if(ends[7]>=biggest12073){
            biggest12073=ends[7];
          }
          if(ends[16]>=biggest12073){
            biggest12073=ends[16];
          }
          if(biggest12073 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread12074(tdone,ends);
          thread12075(tdone,ends);
          thread12076(tdone,ends);
          thread12077(tdone,ends);
          thread12078(tdone,ends);
          thread12079(tdone,ends);
          thread12089(tdone,ends);
          int biggest12090 = 0;
          if(ends[2]>=biggest12090){
            biggest12090=ends[2];
          }
          if(ends[3]>=biggest12090){
            biggest12090=ends[3];
          }
          if(ends[4]>=biggest12090){
            biggest12090=ends[4];
          }
          if(ends[5]>=biggest12090){
            biggest12090=ends[5];
          }
          if(ends[6]>=biggest12090){
            biggest12090=ends[6];
          }
          if(ends[7]>=biggest12090){
            biggest12090=ends[7];
          }
          if(ends[16]>=biggest12090){
            biggest12090=ends[16];
          }
          if(biggest12090 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest12090 == 0){
            S12055=0;
            active[1]=0;
            ends[1]=0;
            S12055=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
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
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
