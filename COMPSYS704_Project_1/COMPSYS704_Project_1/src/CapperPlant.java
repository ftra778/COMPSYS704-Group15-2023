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
  private int S46221 = 1;
  private int S45630 = 1;
  private int S45584 = 1;
  private int S45683 = 1;
  private int S45637 = 1;
  private int S45736 = 1;
  private int S45690 = 1;
  private int S45789 = 1;
  private int S45743 = 1;
  private int S45821 = 1;
  private int S45791 = 1;
  private int S45887 = 1;
  private int S45829 = 1;
  private int S45837 = 1;
  private int S45845 = 1;
  private int S45853 = 1;
  private int S45861 = 1;
  private int S45869 = 1;
  private int S45877 = 1;
  private int S45885 = 1;
  private int S45898 = 1;
  
  private int[] ends = new int[96];
  private int[] tdone = new int[96];
  
  public void thread57321(int [] tdone, int [] ends){
        switch(S45898){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        if(modeGUI.getprestatus()){//sysj\ABSplant.sysj line: 560, column: 13
          mode = modeGUI;//sysj\ABSplant.sysj line: 561, column: 6
          mode.setPresent();//sysj\ABSplant.sysj line: 562, column: 6
          currsigs.addElement(mode);
          active[58]=1;
          ends[58]=1;
          tdone[58]=1;
        }
        else {
          active[58]=1;
          ends[58]=1;
          tdone[58]=1;
        }
        break;
      
    }
  }

  public void thread57319(int [] tdone, int [] ends){
        switch(S45885){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        if(bottlePos5Disp.getprestatus()){//sysj\ABSplant.sysj line: 555, column: 24
          bottlePos5DispE.setPresent();//sysj\ABSplant.sysj line: 555, column: 40
          currsigs.addElement(bottlePos5DispE);
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        break;
      
    }
  }

  public void thread57318(int [] tdone, int [] ends){
        switch(S45877){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        if(gripperAtFinal.getprestatus()){//sysj\ABSplant.sysj line: 553, column: 24
          gripperAtFinalE.setPresent();//sysj\ABSplant.sysj line: 553, column: 40
          currsigs.addElement(gripperAtFinalE);
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        else {
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        break;
      
    }
  }

  public void thread57317(int [] tdone, int [] ends){
        switch(S45869){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        if(capperLowered.getprestatus()){//sysj\ABSplant.sysj line: 551, column: 24
          capperLoweredE.setPresent();//sysj\ABSplant.sysj line: 551, column: 39
          currsigs.addElement(capperLoweredE);
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        break;
      
    }
  }

  public void thread57316(int [] tdone, int [] ends){
        switch(S45861){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        if(capperRaised.getprestatus()){//sysj\ABSplant.sysj line: 549, column: 24
          capperRaisedE.setPresent();//sysj\ABSplant.sysj line: 549, column: 38
          currsigs.addElement(capperRaisedE);
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        break;
      
    }
  }

  public void thread57315(int [] tdone, int [] ends){
        switch(S45853){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        if(gripperAtHome.getprestatus()){//sysj\ABSplant.sysj line: 547, column: 24
          gripperAtHomeE.setPresent();//sysj\ABSplant.sysj line: 547, column: 39
          currsigs.addElement(gripperAtHomeE);
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        else {
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        break;
      
    }
  }

  public void thread57314(int [] tdone, int [] ends){
        switch(S45845){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        if(gripperClose.getprestatus()){//sysj\ABSplant.sysj line: 545, column: 24
          gripperCloseE.setPresent();//sysj\ABSplant.sysj line: 545, column: 38
          currsigs.addElement(gripperCloseE);
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        else {
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        break;
      
    }
  }

  public void thread57313(int [] tdone, int [] ends){
        switch(S45837){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        if(clampOpen.getprestatus()){//sysj\ABSplant.sysj line: 543, column: 24
          clampOpenE.setPresent();//sysj\ABSplant.sysj line: 543, column: 35
          currsigs.addElement(clampOpenE);
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        break;
      
    }
  }

  public void thread57312(int [] tdone, int [] ends){
        switch(S45829){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(clampClose.getprestatus()){//sysj\ABSplant.sysj line: 541, column: 24
          clampCloseE.setPresent();//sysj\ABSplant.sysj line: 541, column: 36
          currsigs.addElement(clampCloseE);
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        else {
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread57311(int [] tdone, int [] ends){
        switch(S45887){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        thread57312(tdone,ends);
        thread57313(tdone,ends);
        thread57314(tdone,ends);
        thread57315(tdone,ends);
        thread57316(tdone,ends);
        thread57317(tdone,ends);
        thread57318(tdone,ends);
        thread57319(tdone,ends);
        int biggest57320 = 0;
        if(ends[50]>=biggest57320){
          biggest57320=ends[50];
        }
        if(ends[51]>=biggest57320){
          biggest57320=ends[51];
        }
        if(ends[52]>=biggest57320){
          biggest57320=ends[52];
        }
        if(ends[53]>=biggest57320){
          biggest57320=ends[53];
        }
        if(ends[54]>=biggest57320){
          biggest57320=ends[54];
        }
        if(ends[55]>=biggest57320){
          biggest57320=ends[55];
        }
        if(ends[56]>=biggest57320){
          biggest57320=ends[56];
        }
        if(ends[57]>=biggest57320){
          biggest57320=ends[57];
        }
        if(biggest57320 == 1){
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        //FINXME code
        if(biggest57320 == 0){
          S45887=0;
          active[49]=0;
          ends[49]=0;
          tdone[49]=1;
        }
        break;
      
    }
  }

  public void thread57310(int [] tdone, int [] ends){
        switch(S45821){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        switch(S45791){
          case 0 : 
            if(bottlePos5.getprestatus() && capperRaised.getprestatus()){//sysj\ABSplant.sysj line: 530, column: 10
              S45791=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            else {
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            break;
          
          case 1 : 
            S45791=1;
            S45791=2;
            bottlePos5Disp.setPresent();//sysj\ABSplant.sysj line: 535, column: 5
            currsigs.addElement(bottlePos5Disp);
            active[48]=1;
            ends[48]=1;
            tdone[48]=1;
            break;
          
          case 2 : 
            if(!bottlePos5.getprestatus()){//sysj\ABSplant.sysj line: 534, column: 10
              S45791=0;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            else {
              bottlePos5Disp.setPresent();//sysj\ABSplant.sysj line: 535, column: 5
              currsigs.addElement(bottlePos5Disp);
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57309(int [] tdone, int [] ends){
        switch(S45789){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        switch(S45743){
          case 0 : 
            if(lowerCapper.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 517, column: 10
              S45743=1;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            else {
              capperRaised.setPresent();//sysj\ABSplant.sysj line: 518, column: 5
              currsigs.addElement(capperRaised);
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 520, column: 10
              S45743=2;
              capperLowered.setPresent();//sysj\ABSplant.sysj line: 522, column: 5
              currsigs.addElement(capperLowered);
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            else {
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 2 : 
            if(!lowerCapper.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 521, column: 10
              S45743=3;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            else {
              capperLowered.setPresent();//sysj\ABSplant.sysj line: 522, column: 5
              currsigs.addElement(capperLowered);
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 524, column: 10
              S45743=0;
              capperRaised.setPresent();//sysj\ABSplant.sysj line: 518, column: 5
              currsigs.addElement(capperRaised);
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            else {
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57308(int [] tdone, int [] ends){
        switch(S45736){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        switch(S45690){
          case 0 : 
            if(turnGripperFinal.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 504, column: 10
              S45690=1;
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            else {
              gripperAtHome.setPresent();//sysj\ABSplant.sysj line: 505, column: 5
              currsigs.addElement(gripperAtHome);
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 507, column: 10
              S45690=2;
              gripperAtFinal.setPresent();//sysj\ABSplant.sysj line: 509, column: 5
              currsigs.addElement(gripperAtFinal);
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            else {
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            break;
          
          case 2 : 
            if(turnGripperHome.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 508, column: 10
              S45690=3;
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            else {
              gripperAtFinal.setPresent();//sysj\ABSplant.sysj line: 509, column: 5
              currsigs.addElement(gripperAtFinal);
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 511, column: 10
              S45690=0;
              gripperAtHome.setPresent();//sysj\ABSplant.sysj line: 505, column: 5
              currsigs.addElement(gripperAtHome);
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            else {
              active[46]=1;
              ends[46]=1;
              tdone[46]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57307(int [] tdone, int [] ends){
        switch(S45683){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S45637){
          case 0 : 
            if(gripCap.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 491, column: 10
              S45637=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            else {
              gripperOpen.setPresent();//sysj\ABSplant.sysj line: 492, column: 5
              currsigs.addElement(gripperOpen);
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 494, column: 10
              S45637=2;
              gripperClose.setPresent();//sysj\ABSplant.sysj line: 496, column: 5
              currsigs.addElement(gripperClose);
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            else {
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
          case 2 : 
            if(!gripCap.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 495, column: 10
              S45637=3;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            else {
              gripperClose.setPresent();//sysj\ABSplant.sysj line: 496, column: 5
              currsigs.addElement(gripperClose);
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 498, column: 10
              S45637=0;
              gripperOpen.setPresent();//sysj\ABSplant.sysj line: 492, column: 5
              currsigs.addElement(gripperOpen);
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            else {
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57306(int [] tdone, int [] ends){
        switch(S45630){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        switch(S45584){
          case 0 : 
            if(clampBottle.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 478, column: 10
              S45584=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            else {
              clampOpen.setPresent();//sysj\ABSplant.sysj line: 479, column: 5
              currsigs.addElement(clampOpen);
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 481, column: 10
              S45584=2;
              clampClose.setPresent();//sysj\ABSplant.sysj line: 483, column: 5
              currsigs.addElement(clampClose);
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            else {
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
          case 2 : 
            if(!clampBottle.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 482, column: 10
              S45584=3;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            else {
              clampClose.setPresent();//sysj\ABSplant.sysj line: 483, column: 5
              currsigs.addElement(clampClose);
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 485, column: 10
              S45584=0;
              clampOpen.setPresent();//sysj\ABSplant.sysj line: 479, column: 5
              currsigs.addElement(clampOpen);
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            else {
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57304(int [] tdone, int [] ends){
        S45898=1;
    if(modeGUI.getprestatus()){//sysj\ABSplant.sysj line: 560, column: 13
      mode = modeGUI;//sysj\ABSplant.sysj line: 561, column: 6
      mode.setPresent();//sysj\ABSplant.sysj line: 562, column: 6
      currsigs.addElement(mode);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread57302(int [] tdone, int [] ends){
        S45885=1;
    if(bottlePos5Disp.getprestatus()){//sysj\ABSplant.sysj line: 555, column: 24
      bottlePos5DispE.setPresent();//sysj\ABSplant.sysj line: 555, column: 40
      currsigs.addElement(bottlePos5DispE);
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread57301(int [] tdone, int [] ends){
        S45877=1;
    if(gripperAtFinal.getprestatus()){//sysj\ABSplant.sysj line: 553, column: 24
      gripperAtFinalE.setPresent();//sysj\ABSplant.sysj line: 553, column: 40
      currsigs.addElement(gripperAtFinalE);
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
    else {
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread57300(int [] tdone, int [] ends){
        S45869=1;
    if(capperLowered.getprestatus()){//sysj\ABSplant.sysj line: 551, column: 24
      capperLoweredE.setPresent();//sysj\ABSplant.sysj line: 551, column: 39
      currsigs.addElement(capperLoweredE);
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread57299(int [] tdone, int [] ends){
        S45861=1;
    if(capperRaised.getprestatus()){//sysj\ABSplant.sysj line: 549, column: 24
      capperRaisedE.setPresent();//sysj\ABSplant.sysj line: 549, column: 38
      currsigs.addElement(capperRaisedE);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread57298(int [] tdone, int [] ends){
        S45853=1;
    if(gripperAtHome.getprestatus()){//sysj\ABSplant.sysj line: 547, column: 24
      gripperAtHomeE.setPresent();//sysj\ABSplant.sysj line: 547, column: 39
      currsigs.addElement(gripperAtHomeE);
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread57297(int [] tdone, int [] ends){
        S45845=1;
    if(gripperClose.getprestatus()){//sysj\ABSplant.sysj line: 545, column: 24
      gripperCloseE.setPresent();//sysj\ABSplant.sysj line: 545, column: 38
      currsigs.addElement(gripperCloseE);
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread57296(int [] tdone, int [] ends){
        S45837=1;
    if(clampOpen.getprestatus()){//sysj\ABSplant.sysj line: 543, column: 24
      clampOpenE.setPresent();//sysj\ABSplant.sysj line: 543, column: 35
      currsigs.addElement(clampOpenE);
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread57295(int [] tdone, int [] ends){
        S45829=1;
    if(clampClose.getprestatus()){//sysj\ABSplant.sysj line: 541, column: 24
      clampCloseE.setPresent();//sysj\ABSplant.sysj line: 541, column: 36
      currsigs.addElement(clampCloseE);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread57294(int [] tdone, int [] ends){
        S45887=1;
    thread57295(tdone,ends);
    thread57296(tdone,ends);
    thread57297(tdone,ends);
    thread57298(tdone,ends);
    thread57299(tdone,ends);
    thread57300(tdone,ends);
    thread57301(tdone,ends);
    thread57302(tdone,ends);
    int biggest57303 = 0;
    if(ends[50]>=biggest57303){
      biggest57303=ends[50];
    }
    if(ends[51]>=biggest57303){
      biggest57303=ends[51];
    }
    if(ends[52]>=biggest57303){
      biggest57303=ends[52];
    }
    if(ends[53]>=biggest57303){
      biggest57303=ends[53];
    }
    if(ends[54]>=biggest57303){
      biggest57303=ends[54];
    }
    if(ends[55]>=biggest57303){
      biggest57303=ends[55];
    }
    if(ends[56]>=biggest57303){
      biggest57303=ends[56];
    }
    if(ends[57]>=biggest57303){
      biggest57303=ends[57];
    }
    if(biggest57303 == 1){
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread57293(int [] tdone, int [] ends){
        S45821=1;
    S45791=0;
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread57292(int [] tdone, int [] ends){
        S45789=1;
    S45743=0;
    capperRaised.setPresent();//sysj\ABSplant.sysj line: 518, column: 5
    currsigs.addElement(capperRaised);
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread57291(int [] tdone, int [] ends){
        S45736=1;
    S45690=0;
    gripperAtHome.setPresent();//sysj\ABSplant.sysj line: 505, column: 5
    currsigs.addElement(gripperAtHome);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread57290(int [] tdone, int [] ends){
        S45683=1;
    S45637=0;
    gripperOpen.setPresent();//sysj\ABSplant.sysj line: 492, column: 5
    currsigs.addElement(gripperOpen);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread57289(int [] tdone, int [] ends){
        S45630=1;
    S45584=0;
    clampOpen.setPresent();//sysj\ABSplant.sysj line: 479, column: 5
    currsigs.addElement(clampOpen);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S46221){
        case 0 : 
          S46221=0;
          break RUN;
        
        case 1 : 
          S46221=2;
          S46221=2;
          System.out.println("CapperPlant");//sysj\ABSplant.sysj line: 475, column: 2
          thread57289(tdone,ends);
          thread57290(tdone,ends);
          thread57291(tdone,ends);
          thread57292(tdone,ends);
          thread57293(tdone,ends);
          thread57294(tdone,ends);
          thread57304(tdone,ends);
          int biggest57305 = 0;
          if(ends[44]>=biggest57305){
            biggest57305=ends[44];
          }
          if(ends[45]>=biggest57305){
            biggest57305=ends[45];
          }
          if(ends[46]>=biggest57305){
            biggest57305=ends[46];
          }
          if(ends[47]>=biggest57305){
            biggest57305=ends[47];
          }
          if(ends[48]>=biggest57305){
            biggest57305=ends[48];
          }
          if(ends[49]>=biggest57305){
            biggest57305=ends[49];
          }
          if(ends[58]>=biggest57305){
            biggest57305=ends[58];
          }
          if(biggest57305 == 1){
            active[43]=1;
            ends[43]=1;
            break RUN;
          }
        
        case 2 : 
          thread57306(tdone,ends);
          thread57307(tdone,ends);
          thread57308(tdone,ends);
          thread57309(tdone,ends);
          thread57310(tdone,ends);
          thread57311(tdone,ends);
          thread57321(tdone,ends);
          int biggest57322 = 0;
          if(ends[44]>=biggest57322){
            biggest57322=ends[44];
          }
          if(ends[45]>=biggest57322){
            biggest57322=ends[45];
          }
          if(ends[46]>=biggest57322){
            biggest57322=ends[46];
          }
          if(ends[47]>=biggest57322){
            biggest57322=ends[47];
          }
          if(ends[48]>=biggest57322){
            biggest57322=ends[48];
          }
          if(ends[49]>=biggest57322){
            biggest57322=ends[49];
          }
          if(ends[58]>=biggest57322){
            biggest57322=ends[58];
          }
          if(biggest57322 == 1){
            active[43]=1;
            ends[43]=1;
            break RUN;
          }
          //FINXME code
          if(biggest57322 == 0){
            S46221=0;
            active[43]=0;
            ends[43]=0;
            S46221=0;
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
    while(active[43] != 0){
      int index = 43;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[43]!=0 || suspended[43]!=0 || active[43]!=1);
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
      if(paused[43]!=0 || suspended[43]!=0 || active[43]!=1);
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
      if(active[43] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
