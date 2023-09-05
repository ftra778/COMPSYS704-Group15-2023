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
  private Signal capDec_1;
  private Signal capPos_1;
  private int S12703 = 1;
  private int S11466 = 1;
  private int S11420 = 1;
  private int S11519 = 1;
  private int S11473 = 1;
  private int S11572 = 1;
  private int S11526 = 1;
  private int S11625 = 1;
  private int S11579 = 1;
  private int S11657 = 1;
  private int S11627 = 1;
  private int S11723 = 1;
  private int S11665 = 1;
  private int S11659 = 1;
  private int S11673 = 1;
  private int S11681 = 1;
  private int S11689 = 1;
  private int S11697 = 1;
  private int S11705 = 1;
  private int S11713 = 1;
  private int S11721 = 1;
  private int S11734 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread12737(int [] tdone, int [] ends){
        switch(S11734){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(modeGUI.getprestatus()){//sysj\plant.sysj line: 103, column: 12
          mode = modeGUI;//sysj\plant.sysj line: 104, column: 5
          mode.setPresent();//sysj\plant.sysj line: 105, column: 5
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

  public void thread12735(int [] tdone, int [] ends){
        switch(S11721){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottlePos5Disp.getprestatus()){//sysj\plant.sysj line: 98, column: 24
          bottlePos5DispE.setPresent();//sysj\plant.sysj line: 98, column: 40
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

  public void thread12734(int [] tdone, int [] ends){
        switch(S11713){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(gripperAtFinal.getprestatus()){//sysj\plant.sysj line: 96, column: 24
          gripperAtFinalE.setPresent();//sysj\plant.sysj line: 96, column: 40
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

  public void thread12733(int [] tdone, int [] ends){
        switch(S11705){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(capperLowered.getprestatus()){//sysj\plant.sysj line: 94, column: 24
          capperLoweredE.setPresent();//sysj\plant.sysj line: 94, column: 39
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

  public void thread12732(int [] tdone, int [] ends){
        switch(S11697){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(capperRaised.getprestatus()){//sysj\plant.sysj line: 92, column: 24
          capperRaisedE.setPresent();//sysj\plant.sysj line: 92, column: 38
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

  public void thread12731(int [] tdone, int [] ends){
        switch(S11689){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperAtHome.getprestatus()){//sysj\plant.sysj line: 90, column: 24
          gripperAtHomeE.setPresent();//sysj\plant.sysj line: 90, column: 39
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

  public void thread12730(int [] tdone, int [] ends){
        switch(S11681){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperClose.getprestatus()){//sysj\plant.sysj line: 88, column: 24
          gripperCloseE.setPresent();//sysj\plant.sysj line: 88, column: 38
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

  public void thread12729(int [] tdone, int [] ends){
        switch(S11673){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(clampOpen.getprestatus()){//sysj\plant.sysj line: 86, column: 24
          clampOpenE.setPresent();//sysj\plant.sysj line: 86, column: 35
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

  public void thread12728(int [] tdone, int [] ends){
        switch(S11665){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S11659){
          case 0 : 
            S11659=0;
            if(clampClose.getprestatus()){//sysj\plant.sysj line: 84, column: 24
              clampCloseE.setPresent();//sysj\plant.sysj line: 84, column: 36
              currsigs.addElement(clampCloseE);
              S11659=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S11659=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S11659=1;
            S11659=0;
            if(clampClose.getprestatus()){//sysj\plant.sysj line: 84, column: 24
              clampCloseE.setPresent();//sysj\plant.sysj line: 84, column: 36
              currsigs.addElement(clampCloseE);
              S11659=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S11659=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread12727(int [] tdone, int [] ends){
        switch(S11723){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread12728(tdone,ends);
        thread12729(tdone,ends);
        thread12730(tdone,ends);
        thread12731(tdone,ends);
        thread12732(tdone,ends);
        thread12733(tdone,ends);
        thread12734(tdone,ends);
        thread12735(tdone,ends);
        int biggest12736 = 0;
        if(ends[8]>=biggest12736){
          biggest12736=ends[8];
        }
        if(ends[9]>=biggest12736){
          biggest12736=ends[9];
        }
        if(ends[10]>=biggest12736){
          biggest12736=ends[10];
        }
        if(ends[11]>=biggest12736){
          biggest12736=ends[11];
        }
        if(ends[12]>=biggest12736){
          biggest12736=ends[12];
        }
        if(ends[13]>=biggest12736){
          biggest12736=ends[13];
        }
        if(ends[14]>=biggest12736){
          biggest12736=ends[14];
        }
        if(ends[15]>=biggest12736){
          biggest12736=ends[15];
        }
        if(biggest12736 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest12736 == 0){
          S11723=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread12726(int [] tdone, int [] ends){
        switch(S11657){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S11627){
          case 0 : 
            if(bottlePos5.getprestatus() && capperRaised.getprestatus()){//sysj\plant.sysj line: 73, column: 10
              S11627=1;
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
            S11627=1;
            S11627=2;
            bottlePos5Disp.setPresent();//sysj\plant.sysj line: 78, column: 5
            currsigs.addElement(bottlePos5Disp);
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
          case 2 : 
            if(!bottlePos5.getprestatus()){//sysj\plant.sysj line: 77, column: 10
              S11627=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottlePos5Disp.setPresent();//sysj\plant.sysj line: 78, column: 5
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

  public void thread12725(int [] tdone, int [] ends){
        switch(S11625){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S11579){
          case 0 : 
            if(lowerCapper.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 60, column: 10
              S11579=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capperRaised.setPresent();//sysj\plant.sysj line: 61, column: 5
              currsigs.addElement(capperRaised);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 63, column: 10
              S11579=2;
              capperLowered.setPresent();//sysj\plant.sysj line: 65, column: 5
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
            if(!lowerCapper.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 64, column: 10
              S11579=3;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              capperLowered.setPresent();//sysj\plant.sysj line: 65, column: 5
              currsigs.addElement(capperLowered);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 67, column: 10
              S11579=0;
              capperRaised.setPresent();//sysj\plant.sysj line: 61, column: 5
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

  public void thread12724(int [] tdone, int [] ends){
        switch(S11572){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S11526){
          case 0 : 
            if(turnGripperFinal.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 47, column: 10
              S11526=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperAtHome.setPresent();//sysj\plant.sysj line: 48, column: 5
              currsigs.addElement(gripperAtHome);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 50, column: 10
              S11526=2;
              gripperAtFinal.setPresent();//sysj\plant.sysj line: 52, column: 5
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
            if(turnGripperHome.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 51, column: 10
              S11526=3;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperAtFinal.setPresent();//sysj\plant.sysj line: 52, column: 5
              currsigs.addElement(gripperAtFinal);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 54, column: 10
              S11526=0;
              gripperAtHome.setPresent();//sysj\plant.sysj line: 48, column: 5
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

  public void thread12723(int [] tdone, int [] ends){
        switch(S11519){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S11473){
          case 0 : 
            if(gripCap.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 34, column: 10
              S11473=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperOpen.setPresent();//sysj\plant.sysj line: 35, column: 5
              currsigs.addElement(gripperOpen);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 37, column: 10
              S11473=2;
              gripperClose.setPresent();//sysj\plant.sysj line: 39, column: 5
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
            if(!gripCap.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 38, column: 10
              S11473=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperClose.setPresent();//sysj\plant.sysj line: 39, column: 5
              currsigs.addElement(gripperClose);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 41, column: 10
              S11473=0;
              gripperOpen.setPresent();//sysj\plant.sysj line: 35, column: 5
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

  public void thread12722(int [] tdone, int [] ends){
        switch(S11466){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S11420){
          case 0 : 
            if(clampBottle.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 21, column: 10
              S11420=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              clampOpen.setPresent();//sysj\plant.sysj line: 22, column: 5
              currsigs.addElement(clampOpen);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 24, column: 10
              S11420=2;
              clampClose.setPresent();//sysj\plant.sysj line: 26, column: 5
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
            if(!clampBottle.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 25, column: 10
              S11420=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              clampClose.setPresent();//sysj\plant.sysj line: 26, column: 5
              currsigs.addElement(clampClose);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 28, column: 10
              S11420=0;
              clampOpen.setPresent();//sysj\plant.sysj line: 22, column: 5
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

  public void thread12720(int [] tdone, int [] ends){
        S11734=1;
    if(modeGUI.getprestatus()){//sysj\plant.sysj line: 103, column: 12
      mode = modeGUI;//sysj\plant.sysj line: 104, column: 5
      mode.setPresent();//sysj\plant.sysj line: 105, column: 5
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

  public void thread12718(int [] tdone, int [] ends){
        S11721=1;
    if(bottlePos5Disp.getprestatus()){//sysj\plant.sysj line: 98, column: 24
      bottlePos5DispE.setPresent();//sysj\plant.sysj line: 98, column: 40
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

  public void thread12717(int [] tdone, int [] ends){
        S11713=1;
    if(gripperAtFinal.getprestatus()){//sysj\plant.sysj line: 96, column: 24
      gripperAtFinalE.setPresent();//sysj\plant.sysj line: 96, column: 40
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

  public void thread12716(int [] tdone, int [] ends){
        S11705=1;
    if(capperLowered.getprestatus()){//sysj\plant.sysj line: 94, column: 24
      capperLoweredE.setPresent();//sysj\plant.sysj line: 94, column: 39
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

  public void thread12715(int [] tdone, int [] ends){
        S11697=1;
    if(capperRaised.getprestatus()){//sysj\plant.sysj line: 92, column: 24
      capperRaisedE.setPresent();//sysj\plant.sysj line: 92, column: 38
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

  public void thread12714(int [] tdone, int [] ends){
        S11689=1;
    if(gripperAtHome.getprestatus()){//sysj\plant.sysj line: 90, column: 24
      gripperAtHomeE.setPresent();//sysj\plant.sysj line: 90, column: 39
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

  public void thread12713(int [] tdone, int [] ends){
        S11681=1;
    if(gripperClose.getprestatus()){//sysj\plant.sysj line: 88, column: 24
      gripperCloseE.setPresent();//sysj\plant.sysj line: 88, column: 38
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

  public void thread12712(int [] tdone, int [] ends){
        S11673=1;
    if(clampOpen.getprestatus()){//sysj\plant.sysj line: 86, column: 24
      clampOpenE.setPresent();//sysj\plant.sysj line: 86, column: 35
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

  public void thread12711(int [] tdone, int [] ends){
        S11665=1;
    S11659=0;
    if(clampClose.getprestatus()){//sysj\plant.sysj line: 84, column: 24
      clampCloseE.setPresent();//sysj\plant.sysj line: 84, column: 36
      currsigs.addElement(clampCloseE);
      S11659=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S11659=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread12710(int [] tdone, int [] ends){
        S11723=1;
    thread12711(tdone,ends);
    thread12712(tdone,ends);
    thread12713(tdone,ends);
    thread12714(tdone,ends);
    thread12715(tdone,ends);
    thread12716(tdone,ends);
    thread12717(tdone,ends);
    thread12718(tdone,ends);
    int biggest12719 = 0;
    if(ends[8]>=biggest12719){
      biggest12719=ends[8];
    }
    if(ends[9]>=biggest12719){
      biggest12719=ends[9];
    }
    if(ends[10]>=biggest12719){
      biggest12719=ends[10];
    }
    if(ends[11]>=biggest12719){
      biggest12719=ends[11];
    }
    if(ends[12]>=biggest12719){
      biggest12719=ends[12];
    }
    if(ends[13]>=biggest12719){
      biggest12719=ends[13];
    }
    if(ends[14]>=biggest12719){
      biggest12719=ends[14];
    }
    if(ends[15]>=biggest12719){
      biggest12719=ends[15];
    }
    if(biggest12719 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread12709(int [] tdone, int [] ends){
        S11657=1;
    S11627=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread12708(int [] tdone, int [] ends){
        S11625=1;
    S11579=0;
    capperRaised.setPresent();//sysj\plant.sysj line: 61, column: 5
    currsigs.addElement(capperRaised);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread12707(int [] tdone, int [] ends){
        S11572=1;
    S11526=0;
    gripperAtHome.setPresent();//sysj\plant.sysj line: 48, column: 5
    currsigs.addElement(gripperAtHome);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread12706(int [] tdone, int [] ends){
        S11519=1;
    S11473=0;
    gripperOpen.setPresent();//sysj\plant.sysj line: 35, column: 5
    currsigs.addElement(gripperOpen);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread12705(int [] tdone, int [] ends){
        S11466=1;
    S11420=0;
    clampOpen.setPresent();//sysj\plant.sysj line: 22, column: 5
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
      switch(S12703){
        case 0 : 
          S12703=0;
          break RUN;
        
        case 1 : 
          S12703=2;
          S12703=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 14, column: 2
          capDec_1.setClear();//sysj\plant.sysj line: 16, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 17, column: 2
          capPos_1.setPresent();//sysj\plant.sysj line: 18, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\plant.sysj line: 18, column: 2
          thread12705(tdone,ends);
          thread12706(tdone,ends);
          thread12707(tdone,ends);
          thread12708(tdone,ends);
          thread12709(tdone,ends);
          thread12710(tdone,ends);
          thread12720(tdone,ends);
          int biggest12721 = 0;
          if(ends[2]>=biggest12721){
            biggest12721=ends[2];
          }
          if(ends[3]>=biggest12721){
            biggest12721=ends[3];
          }
          if(ends[4]>=biggest12721){
            biggest12721=ends[4];
          }
          if(ends[5]>=biggest12721){
            biggest12721=ends[5];
          }
          if(ends[6]>=biggest12721){
            biggest12721=ends[6];
          }
          if(ends[7]>=biggest12721){
            biggest12721=ends[7];
          }
          if(ends[16]>=biggest12721){
            biggest12721=ends[16];
          }
          if(biggest12721 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\plant.sysj line: 16, column: 2
          capPos_1.setClear();//sysj\plant.sysj line: 17, column: 2
          thread12722(tdone,ends);
          thread12723(tdone,ends);
          thread12724(tdone,ends);
          thread12725(tdone,ends);
          thread12726(tdone,ends);
          thread12727(tdone,ends);
          thread12737(tdone,ends);
          int biggest12738 = 0;
          if(ends[2]>=biggest12738){
            biggest12738=ends[2];
          }
          if(ends[3]>=biggest12738){
            biggest12738=ends[3];
          }
          if(ends[4]>=biggest12738){
            biggest12738=ends[4];
          }
          if(ends[5]>=biggest12738){
            biggest12738=ends[5];
          }
          if(ends[6]>=biggest12738){
            biggest12738=ends[6];
          }
          if(ends[7]>=biggest12738){
            biggest12738=ends[7];
          }
          if(ends[16]>=biggest12738){
            biggest12738=ends[16];
          }
          if(biggest12738 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest12738 == 0){
            S12703=0;
            active[1]=0;
            ends[1]=0;
            S12703=0;
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
    capDec_1 = new Signal();
    capPos_1 = new Signal();
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
      capDec_1.setpreclear();
      capPos_1.setpreclear();
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
      capDec_1.setClear();
      capPos_1.setClear();
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
