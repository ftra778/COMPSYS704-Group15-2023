import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\ABScontroller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABScontroller.sysj line: 2, column: 1

public class CapperController extends ClockDomain{
  public CapperController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleReady = new Signal("bottleReady", Signal.INPUT);
  public Signal emergency = new Signal("emergency", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal clampClose = new Signal("clampClose", Signal.INPUT);
  public Signal clampOpen = new Signal("clampOpen", Signal.INPUT);
  public Signal gripperClose = new Signal("gripperClose", Signal.INPUT);
  public Signal gripperOpen = new Signal("gripperOpen", Signal.INPUT);
  public Signal capperRaised = new Signal("capperRaised", Signal.INPUT);
  public Signal capperLowered = new Signal("capperLowered", Signal.INPUT);
  public Signal gripperAtFinal = new Signal("gripperAtFinal", Signal.INPUT);
  public Signal gripperAtHome = new Signal("gripperAtHome", Signal.INPUT);
  public Signal rotaryTableTriggerCapper = new Signal("rotaryTableTriggerCapper", Signal.INPUT);
  public Signal clampBottleM = new Signal("clampBottleM", Signal.INPUT);
  public Signal gripCapM = new Signal("gripCapM", Signal.INPUT);
  public Signal lowerCapperM = new Signal("lowerCapperM", Signal.INPUT);
  public Signal turnGripperFinalM = new Signal("turnGripperFinalM", Signal.INPUT);
  public Signal turnGripperHomeM = new Signal("turnGripperHomeM", Signal.INPUT);
  public Signal clampBottle = new Signal("clampBottle", Signal.OUTPUT);
  public Signal gripCap = new Signal("gripCap", Signal.OUTPUT);
  public Signal lowerCapper = new Signal("lowerCapper", Signal.OUTPUT);
  public Signal turnGripperFinal = new Signal("turnGripperFinal", Signal.OUTPUT);
  public Signal turnGripperHome = new Signal("turnGripperHome", Signal.OUTPUT);
  public Signal bottlePos5 = new Signal("bottlePos5", Signal.OUTPUT);
  public Signal bottleCapped = new Signal("bottleCapped", Signal.OUTPUT);
  public Signal idle = new Signal("idle", Signal.OUTPUT);
  private Signal auto_63;
  private int S43414 = 1;
  private int S23448 = 1;
  private int S23447 = 1;
  private int S20607 = 1;
  private int S20599 = 1;
  private int S23393 = 1;
  private int S20612 = 1;
  private int S20632 = 1;
  private int S20631 = 1;
  private int S20617 = 1;
  private int S20622 = 1;
  private int S20627 = 1;
  private int S20764 = 1;
  private int S20763 = 1;
  private int S20739 = 1;
  private int S20744 = 1;
  private int S20749 = 1;
  private int S20754 = 1;
  private int S20759 = 1;
  private int S20948 = 1;
  private int S20947 = 1;
  private int S20923 = 1;
  private int S20928 = 1;
  private int S20933 = 1;
  private int S20938 = 1;
  private int S20943 = 1;
  private int S21211 = 1;
  private int S21210 = 1;
  private int S21196 = 1;
  private int S21201 = 1;
  private int S21206 = 1;
  private int S21333 = 1;
  private int S21332 = 1;
  private int S21318 = 1;
  private int S21323 = 1;
  private int S21328 = 1;
  private int S21450 = 1;
  private int S21449 = 1;
  private int S21440 = 1;
  private int S21445 = 1;
  private int S23446 = 1;
  private int S23410 = 1;
  
  private int[] ends = new int[93];
  private int[] tdone = new int[93];
  
  public void thread43758(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 545, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 545, column: 73
      currsigs.addElement(turnGripperHome);
      active[92]=0;
      ends[92]=0;
      tdone[92]=1;
    }
    else {
      active[92]=0;
      ends[92]=0;
      tdone[92]=1;
    }
  }

  public void thread43757(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 543, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 543, column: 73
      currsigs.addElement(turnGripperFinal);
      active[91]=0;
      ends[91]=0;
      tdone[91]=1;
    }
    else {
      active[91]=0;
      ends[91]=0;
      tdone[91]=1;
    }
  }

  public void thread43756(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 541, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 541, column: 54
      currsigs.addElement(lowerCapper);
      active[90]=0;
      ends[90]=0;
      tdone[90]=1;
    }
    else {
      active[90]=0;
      ends[90]=0;
      tdone[90]=1;
    }
  }

  public void thread43755(int [] tdone, int [] ends){
        if(gripCapM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 539, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 539, column: 51
      currsigs.addElement(gripCap);
      active[89]=0;
      ends[89]=0;
      tdone[89]=1;
    }
    else {
      active[89]=0;
      ends[89]=0;
      tdone[89]=1;
    }
  }

  public void thread43754(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 537, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 537, column: 54
      currsigs.addElement(clampBottle);
      active[88]=0;
      ends[88]=0;
      tdone[88]=1;
    }
    else {
      active[88]=0;
      ends[88]=0;
      tdone[88]=1;
    }
  }

  public void thread43753(int [] tdone, int [] ends){
        S23446=1;
    S23410=0;
    if(!auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 536, column: 14
      thread43754(tdone,ends);
      thread43755(tdone,ends);
      thread43756(tdone,ends);
      thread43757(tdone,ends);
      thread43758(tdone,ends);
      int biggest43759 = 0;
      if(ends[88]>=biggest43759){
        biggest43759=ends[88];
      }
      if(ends[89]>=biggest43759){
        biggest43759=ends[89];
      }
      if(ends[90]>=biggest43759){
        biggest43759=ends[90];
      }
      if(ends[91]>=biggest43759){
        biggest43759=ends[91];
      }
      if(ends[92]>=biggest43759){
        biggest43759=ends[92];
      }
      //FINXME code
      if(biggest43759 == 0){
        S23410=1;
        active[87]=1;
        ends[87]=1;
        tdone[87]=1;
      }
    }
    else {
      S23410=1;
      active[87]=1;
      ends[87]=1;
      tdone[87]=1;
    }
  }

  public void thread43752(int [] tdone, int [] ends){
        S23393=1;
    S20612=0;
    idle.setPresent();//sysj\ABScontroller.sysj line: 443, column: 7
    currsigs.addElement(idle);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread43751(int [] tdone, int [] ends){
        S20607=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 430, column: 9
      S20599=0;
      auto_63.setPresent();//sysj\ABScontroller.sysj line: 431, column: 7
      currsigs.addElement(auto_63);
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
    else {
      S20599=1;
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread43748(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 545, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 545, column: 73
      currsigs.addElement(turnGripperHome);
      active[92]=0;
      ends[92]=0;
      tdone[92]=1;
    }
    else {
      active[92]=0;
      ends[92]=0;
      tdone[92]=1;
    }
  }

  public void thread43747(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 543, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 543, column: 73
      currsigs.addElement(turnGripperFinal);
      active[91]=0;
      ends[91]=0;
      tdone[91]=1;
    }
    else {
      active[91]=0;
      ends[91]=0;
      tdone[91]=1;
    }
  }

  public void thread43746(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 541, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 541, column: 54
      currsigs.addElement(lowerCapper);
      active[90]=0;
      ends[90]=0;
      tdone[90]=1;
    }
    else {
      active[90]=0;
      ends[90]=0;
      tdone[90]=1;
    }
  }

  public void thread43745(int [] tdone, int [] ends){
        if(gripCapM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 539, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 539, column: 51
      currsigs.addElement(gripCap);
      active[89]=0;
      ends[89]=0;
      tdone[89]=1;
    }
    else {
      active[89]=0;
      ends[89]=0;
      tdone[89]=1;
    }
  }

  public void thread43744(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 537, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 537, column: 54
      currsigs.addElement(clampBottle);
      active[88]=0;
      ends[88]=0;
      tdone[88]=1;
    }
    else {
      active[88]=0;
      ends[88]=0;
      tdone[88]=1;
    }
  }

  public void thread43743(int [] tdone, int [] ends){
        S23446=1;
    S23410=0;
    if(!auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 536, column: 14
      thread43744(tdone,ends);
      thread43745(tdone,ends);
      thread43746(tdone,ends);
      thread43747(tdone,ends);
      thread43748(tdone,ends);
      int biggest43749 = 0;
      if(ends[88]>=biggest43749){
        biggest43749=ends[88];
      }
      if(ends[89]>=biggest43749){
        biggest43749=ends[89];
      }
      if(ends[90]>=biggest43749){
        biggest43749=ends[90];
      }
      if(ends[91]>=biggest43749){
        biggest43749=ends[91];
      }
      if(ends[92]>=biggest43749){
        biggest43749=ends[92];
      }
      //FINXME code
      if(biggest43749 == 0){
        S23410=1;
        active[87]=1;
        ends[87]=1;
        tdone[87]=1;
      }
    }
    else {
      S23410=1;
      active[87]=1;
      ends[87]=1;
      tdone[87]=1;
    }
  }

  public void thread43742(int [] tdone, int [] ends){
        S23393=1;
    S20612=0;
    idle.setPresent();//sysj\ABScontroller.sysj line: 443, column: 7
    currsigs.addElement(idle);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread43741(int [] tdone, int [] ends){
        S20607=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 430, column: 9
      S20599=0;
      auto_63.setPresent();//sysj\ABScontroller.sysj line: 431, column: 7
      currsigs.addElement(auto_63);
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
    else {
      S20599=1;
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread43738(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 545, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 545, column: 73
      currsigs.addElement(turnGripperHome);
      active[92]=0;
      ends[92]=0;
      tdone[92]=1;
    }
    else {
      active[92]=0;
      ends[92]=0;
      tdone[92]=1;
    }
  }

  public void thread43737(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 543, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 543, column: 73
      currsigs.addElement(turnGripperFinal);
      active[91]=0;
      ends[91]=0;
      tdone[91]=1;
    }
    else {
      active[91]=0;
      ends[91]=0;
      tdone[91]=1;
    }
  }

  public void thread43736(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 541, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 541, column: 54
      currsigs.addElement(lowerCapper);
      active[90]=0;
      ends[90]=0;
      tdone[90]=1;
    }
    else {
      active[90]=0;
      ends[90]=0;
      tdone[90]=1;
    }
  }

  public void thread43735(int [] tdone, int [] ends){
        if(gripCapM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 539, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 539, column: 51
      currsigs.addElement(gripCap);
      active[89]=0;
      ends[89]=0;
      tdone[89]=1;
    }
    else {
      active[89]=0;
      ends[89]=0;
      tdone[89]=1;
    }
  }

  public void thread43734(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 537, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 537, column: 54
      currsigs.addElement(clampBottle);
      active[88]=0;
      ends[88]=0;
      tdone[88]=1;
    }
    else {
      active[88]=0;
      ends[88]=0;
      tdone[88]=1;
    }
  }

  public void thread43732(int [] tdone, int [] ends){
        active[92]=0;
    ends[92]=0;
    tdone[92]=1;
  }

  public void thread43731(int [] tdone, int [] ends){
        active[91]=0;
    ends[91]=0;
    tdone[91]=1;
  }

  public void thread43730(int [] tdone, int [] ends){
        active[90]=0;
    ends[90]=0;
    tdone[90]=1;
  }

  public void thread43729(int [] tdone, int [] ends){
        active[89]=0;
    ends[89]=0;
    tdone[89]=1;
  }

  public void thread43728(int [] tdone, int [] ends){
        active[88]=0;
    ends[88]=0;
    tdone[88]=1;
  }

  public void thread43727(int [] tdone, int [] ends){
        switch(S23446){
      case 0 : 
        active[87]=0;
        ends[87]=0;
        tdone[87]=1;
        break;
      
      case 1 : 
        switch(S23410){
          case 0 : 
            thread43728(tdone,ends);
            thread43729(tdone,ends);
            thread43730(tdone,ends);
            thread43731(tdone,ends);
            thread43732(tdone,ends);
            int biggest43733 = 0;
            if(ends[88]>=biggest43733){
              biggest43733=ends[88];
            }
            if(ends[89]>=biggest43733){
              biggest43733=ends[89];
            }
            if(ends[90]>=biggest43733){
              biggest43733=ends[90];
            }
            if(ends[91]>=biggest43733){
              biggest43733=ends[91];
            }
            if(ends[92]>=biggest43733){
              biggest43733=ends[92];
            }
            //FINXME code
            if(biggest43733 == 0){
              S23410=1;
              active[87]=1;
              ends[87]=1;
              tdone[87]=1;
            }
            break;
          
          case 1 : 
            S23410=1;
            S23410=0;
            if(!auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 536, column: 14
              thread43734(tdone,ends);
              thread43735(tdone,ends);
              thread43736(tdone,ends);
              thread43737(tdone,ends);
              thread43738(tdone,ends);
              int biggest43739 = 0;
              if(ends[88]>=biggest43739){
                biggest43739=ends[88];
              }
              if(ends[89]>=biggest43739){
                biggest43739=ends[89];
              }
              if(ends[90]>=biggest43739){
                biggest43739=ends[90];
              }
              if(ends[91]>=biggest43739){
                biggest43739=ends[91];
              }
              if(ends[92]>=biggest43739){
                biggest43739=ends[92];
              }
              //FINXME code
              if(biggest43739 == 0){
                S23410=1;
                active[87]=1;
                ends[87]=1;
                tdone[87]=1;
              }
            }
            else {
              S23410=1;
              active[87]=1;
              ends[87]=1;
              tdone[87]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43725(int [] tdone, int [] ends){
        S21445=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 518, column: 43
    currsigs.addElement(bottlePos5);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread43724(int [] tdone, int [] ends){
        S21440=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 518, column: 11
    currsigs.addElement(turnGripperHome);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread43722(int [] tdone, int [] ends){
        switch(S21445){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 518, column: 43
        currsigs.addElement(bottlePos5);
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
        break;
      
    }
  }

  public void thread43721(int [] tdone, int [] ends){
        switch(S21440){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 518, column: 11
        currsigs.addElement(turnGripperHome);
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
        break;
      
    }
  }

  public void thread43719(int [] tdone, int [] ends){
        S21328=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 505, column: 70
    currsigs.addElement(lowerCapper);
    active[84]=1;
    ends[84]=1;
    tdone[84]=1;
  }

  public void thread43718(int [] tdone, int [] ends){
        S21323=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 505, column: 43
    currsigs.addElement(bottlePos5);
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread43717(int [] tdone, int [] ends){
        S21318=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 505, column: 11
    currsigs.addElement(turnGripperHome);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread43715(int [] tdone, int [] ends){
        switch(S21328){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 505, column: 70
        currsigs.addElement(lowerCapper);
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
        break;
      
    }
  }

  public void thread43714(int [] tdone, int [] ends){
        switch(S21323){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 505, column: 43
        currsigs.addElement(bottlePos5);
        active[83]=1;
        ends[83]=1;
        tdone[83]=1;
        break;
      
    }
  }

  public void thread43713(int [] tdone, int [] ends){
        switch(S21318){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 505, column: 11
        currsigs.addElement(turnGripperHome);
        active[82]=1;
        ends[82]=1;
        tdone[82]=1;
        break;
      
    }
  }

  public void thread43711(int [] tdone, int [] ends){
        S21445=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 518, column: 43
    currsigs.addElement(bottlePos5);
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread43710(int [] tdone, int [] ends){
        S21440=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 518, column: 11
    currsigs.addElement(turnGripperHome);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread43708(int [] tdone, int [] ends){
        S21206=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 492, column: 71
    currsigs.addElement(lowerCapper);
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread43707(int [] tdone, int [] ends){
        S21201=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 492, column: 44
    currsigs.addElement(bottlePos5);
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread43706(int [] tdone, int [] ends){
        S21196=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 492, column: 11
    currsigs.addElement(turnGripperFinal);
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread43704(int [] tdone, int [] ends){
        switch(S21206){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 492, column: 71
        currsigs.addElement(lowerCapper);
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
        break;
      
    }
  }

  public void thread43703(int [] tdone, int [] ends){
        switch(S21201){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 492, column: 44
        currsigs.addElement(bottlePos5);
        active[80]=1;
        ends[80]=1;
        tdone[80]=1;
        break;
      
    }
  }

  public void thread43702(int [] tdone, int [] ends){
        switch(S21196){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 492, column: 11
        currsigs.addElement(turnGripperFinal);
        active[79]=1;
        ends[79]=1;
        tdone[79]=1;
        break;
      
    }
  }

  public void thread43700(int [] tdone, int [] ends){
        S21328=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 505, column: 70
    currsigs.addElement(lowerCapper);
    active[84]=1;
    ends[84]=1;
    tdone[84]=1;
  }

  public void thread43699(int [] tdone, int [] ends){
        S21323=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 505, column: 43
    currsigs.addElement(bottlePos5);
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread43698(int [] tdone, int [] ends){
        S21318=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 505, column: 11
    currsigs.addElement(turnGripperHome);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread43696(int [] tdone, int [] ends){
        S20943=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 479, column: 123
    currsigs.addElement(lowerCapper);
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread43695(int [] tdone, int [] ends){
        S20938=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 479, column: 95
    currsigs.addElement(clampBottle);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread43694(int [] tdone, int [] ends){
        S20933=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 479, column: 68
    currsigs.addElement(bottlePos5);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread43693(int [] tdone, int [] ends){
        S20928=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 479, column: 44
    currsigs.addElement(gripCap);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread43692(int [] tdone, int [] ends){
        S20923=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 479, column: 11
    currsigs.addElement(turnGripperFinal);
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread43690(int [] tdone, int [] ends){
        switch(S20943){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 479, column: 123
        currsigs.addElement(lowerCapper);
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
        break;
      
    }
  }

  public void thread43689(int [] tdone, int [] ends){
        switch(S20938){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        clampBottle.setPresent();//sysj\ABScontroller.sysj line: 479, column: 95
        currsigs.addElement(clampBottle);
        active[77]=1;
        ends[77]=1;
        tdone[77]=1;
        break;
      
    }
  }

  public void thread43688(int [] tdone, int [] ends){
        switch(S20933){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 479, column: 68
        currsigs.addElement(bottlePos5);
        active[76]=1;
        ends[76]=1;
        tdone[76]=1;
        break;
      
    }
  }

  public void thread43687(int [] tdone, int [] ends){
        switch(S20928){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        gripCap.setPresent();//sysj\ABScontroller.sysj line: 479, column: 44
        currsigs.addElement(gripCap);
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
        break;
      
    }
  }

  public void thread43686(int [] tdone, int [] ends){
        switch(S20923){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 479, column: 11
        currsigs.addElement(turnGripperFinal);
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
        break;
      
    }
  }

  public void thread43684(int [] tdone, int [] ends){
        S21206=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 492, column: 71
    currsigs.addElement(lowerCapper);
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread43683(int [] tdone, int [] ends){
        S21201=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 492, column: 44
    currsigs.addElement(bottlePos5);
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread43682(int [] tdone, int [] ends){
        S21196=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 492, column: 11
    currsigs.addElement(turnGripperFinal);
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread43680(int [] tdone, int [] ends){
        S20759=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 465, column: 127
    currsigs.addElement(gripCap);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread43679(int [] tdone, int [] ends){
        S20754=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 465, column: 99
    currsigs.addElement(clampBottle);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread43678(int [] tdone, int [] ends){
        S20749=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 465, column: 72
    currsigs.addElement(bottlePos5);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread43677(int [] tdone, int [] ends){
        S20744=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 465, column: 44
    currsigs.addElement(lowerCapper);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread43676(int [] tdone, int [] ends){
        S20739=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 465, column: 12
    currsigs.addElement(turnGripperHome);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread43674(int [] tdone, int [] ends){
        switch(S20759){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        gripCap.setPresent();//sysj\ABScontroller.sysj line: 465, column: 127
        currsigs.addElement(gripCap);
        active[73]=1;
        ends[73]=1;
        tdone[73]=1;
        break;
      
    }
  }

  public void thread43673(int [] tdone, int [] ends){
        switch(S20754){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        clampBottle.setPresent();//sysj\ABScontroller.sysj line: 465, column: 99
        currsigs.addElement(clampBottle);
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
        break;
      
    }
  }

  public void thread43672(int [] tdone, int [] ends){
        switch(S20749){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 465, column: 72
        currsigs.addElement(bottlePos5);
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
        break;
      
    }
  }

  public void thread43671(int [] tdone, int [] ends){
        switch(S20744){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 465, column: 44
        currsigs.addElement(lowerCapper);
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
        break;
      
    }
  }

  public void thread43670(int [] tdone, int [] ends){
        switch(S20739){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 465, column: 12
        currsigs.addElement(turnGripperHome);
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
        break;
      
    }
  }

  public void thread43668(int [] tdone, int [] ends){
        S20943=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 479, column: 123
    currsigs.addElement(lowerCapper);
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread43667(int [] tdone, int [] ends){
        S20938=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 479, column: 95
    currsigs.addElement(clampBottle);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread43666(int [] tdone, int [] ends){
        S20933=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 479, column: 68
    currsigs.addElement(bottlePos5);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread43665(int [] tdone, int [] ends){
        S20928=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 479, column: 44
    currsigs.addElement(gripCap);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread43664(int [] tdone, int [] ends){
        S20923=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 479, column: 11
    currsigs.addElement(turnGripperFinal);
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread43662(int [] tdone, int [] ends){
        S20943=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 479, column: 123
    currsigs.addElement(lowerCapper);
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread43661(int [] tdone, int [] ends){
        S20938=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 479, column: 95
    currsigs.addElement(clampBottle);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread43660(int [] tdone, int [] ends){
        S20933=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 479, column: 68
    currsigs.addElement(bottlePos5);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread43659(int [] tdone, int [] ends){
        S20928=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 479, column: 44
    currsigs.addElement(gripCap);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread43658(int [] tdone, int [] ends){
        S20923=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 479, column: 11
    currsigs.addElement(turnGripperFinal);
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread43656(int [] tdone, int [] ends){
        S20627=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 451, column: 71
    currsigs.addElement(bottlePos5);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread43655(int [] tdone, int [] ends){
        S20622=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 451, column: 43
    currsigs.addElement(lowerCapper);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread43654(int [] tdone, int [] ends){
        S20617=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 451, column: 11
    currsigs.addElement(turnGripperHome);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread43652(int [] tdone, int [] ends){
        switch(S20627){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 451, column: 71
        currsigs.addElement(bottlePos5);
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
        break;
      
    }
  }

  public void thread43651(int [] tdone, int [] ends){
        switch(S20622){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 451, column: 43
        currsigs.addElement(lowerCapper);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread43650(int [] tdone, int [] ends){
        switch(S20617){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 451, column: 11
        currsigs.addElement(turnGripperHome);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread43648(int [] tdone, int [] ends){
        S20759=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 465, column: 127
    currsigs.addElement(gripCap);
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread43647(int [] tdone, int [] ends){
        S20754=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 465, column: 99
    currsigs.addElement(clampBottle);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread43646(int [] tdone, int [] ends){
        S20749=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 465, column: 72
    currsigs.addElement(bottlePos5);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread43645(int [] tdone, int [] ends){
        S20744=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 465, column: 44
    currsigs.addElement(lowerCapper);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread43644(int [] tdone, int [] ends){
        S20739=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 465, column: 12
    currsigs.addElement(turnGripperHome);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread43642(int [] tdone, int [] ends){
        S20627=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 451, column: 71
    currsigs.addElement(bottlePos5);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread43641(int [] tdone, int [] ends){
        S20622=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 451, column: 43
    currsigs.addElement(lowerCapper);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread43640(int [] tdone, int [] ends){
        S20617=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 451, column: 11
    currsigs.addElement(turnGripperHome);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread43639(int [] tdone, int [] ends){
        switch(S23393){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        switch(S20612){
          case 0 : 
            if(bottleReady.getprestatus() && capperRaised.getprestatus() && gripperAtHome.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 442, column: 12
              System.out.println("bottleReady");//sysj\ABScontroller.sysj line: 445, column: 6
              S20612=1;
              S20632=0;
              if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 450, column: 16
                S20631=0;
                thread43640(tdone,ends);
                thread43641(tdone,ends);
                thread43642(tdone,ends);
                int biggest43643 = 0;
                if(ends[66]>=biggest43643){
                  biggest43643=ends[66];
                }
                if(ends[67]>=biggest43643){
                  biggest43643=ends[67];
                }
                if(ends[68]>=biggest43643){
                  biggest43643=ends[68];
                }
                if(biggest43643 == 1){
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
              }
              else {
                S20631=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 453, column: 9
                currsigs.addElement(bottlePos5);
                active[65]=1;
                ends[65]=1;
                tdone[65]=1;
              }
            }
            else {
              idle.setPresent();//sysj\ABScontroller.sysj line: 443, column: 7
              currsigs.addElement(idle);
              active[65]=1;
              ends[65]=1;
              tdone[65]=1;
            }
            break;
          
          case 1 : 
            if(capperLowered.getprestatus() && clampOpen.getprestatus() && gripperOpen.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 448, column: 12
              System.out.println("gripperLowered");//sysj\ABScontroller.sysj line: 458, column: 6
              S20612=2;
              S20764=0;
              if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 464, column: 17
                S20763=0;
                thread43644(tdone,ends);
                thread43645(tdone,ends);
                thread43646(tdone,ends);
                thread43647(tdone,ends);
                thread43648(tdone,ends);
                int biggest43649 = 0;
                if(ends[69]>=biggest43649){
                  biggest43649=ends[69];
                }
                if(ends[70]>=biggest43649){
                  biggest43649=ends[70];
                }
                if(ends[71]>=biggest43649){
                  biggest43649=ends[71];
                }
                if(ends[72]>=biggest43649){
                  biggest43649=ends[72];
                }
                if(ends[73]>=biggest43649){
                  biggest43649=ends[73];
                }
                if(biggest43649 == 1){
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
              }
              else {
                S20763=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 467, column: 10
                currsigs.addElement(bottlePos5);
                active[65]=1;
                ends[65]=1;
                tdone[65]=1;
              }
            }
            else {
              switch(S20632){
                case 0 : 
                  switch(S20631){
                    case 0 : 
                      thread43650(tdone,ends);
                      thread43651(tdone,ends);
                      thread43652(tdone,ends);
                      int biggest43653 = 0;
                      if(ends[66]>=biggest43653){
                        biggest43653=ends[66];
                      }
                      if(ends[67]>=biggest43653){
                        biggest43653=ends[67];
                      }
                      if(ends[68]>=biggest43653){
                        biggest43653=ends[68];
                      }
                      if(biggest43653 == 1){
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      //FINXME code
                      if(biggest43653 == 0){
                        S20632=1;
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 453, column: 9
                      currsigs.addElement(bottlePos5);
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S20632=1;
                  S20632=0;
                  if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 450, column: 16
                    S20631=0;
                    thread43654(tdone,ends);
                    thread43655(tdone,ends);
                    thread43656(tdone,ends);
                    int biggest43657 = 0;
                    if(ends[66]>=biggest43657){
                      biggest43657=ends[66];
                    }
                    if(ends[67]>=biggest43657){
                      biggest43657=ends[67];
                    }
                    if(ends[68]>=biggest43657){
                      biggest43657=ends[68];
                    }
                    if(biggest43657 == 1){
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                    }
                  }
                  else {
                    S20631=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 453, column: 9
                    currsigs.addElement(bottlePos5);
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(capperLowered.getprestatus() && clampClose.getprestatus() && !gripperAtFinal.getprestatus() && gripperClose.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 461, column: 12
              System.out.println("bottleClamped & capGripped");//sysj\ABScontroller.sysj line: 473, column: 6
              S20612=3;
              S20948=0;
              if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 478, column: 16
                S20947=0;
                thread43658(tdone,ends);
                thread43659(tdone,ends);
                thread43660(tdone,ends);
                thread43661(tdone,ends);
                thread43662(tdone,ends);
                int biggest43663 = 0;
                if(ends[74]>=biggest43663){
                  biggest43663=ends[74];
                }
                if(ends[75]>=biggest43663){
                  biggest43663=ends[75];
                }
                if(ends[76]>=biggest43663){
                  biggest43663=ends[76];
                }
                if(ends[77]>=biggest43663){
                  biggest43663=ends[77];
                }
                if(ends[78]>=biggest43663){
                  biggest43663=ends[78];
                }
                if(biggest43663 == 1){
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
              }
              else {
                S20947=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 481, column: 9
                currsigs.addElement(bottlePos5);
                active[65]=1;
                ends[65]=1;
                tdone[65]=1;
              }
            }
            else {
              if(clampClose.getprestatus() && !gripperAtFinal.getprestatus() && gripperClose.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 462, column: 13
                System.out.println("bottleClamped & capGripped");//sysj\ABScontroller.sysj line: 473, column: 6
                S20612=3;
                S20948=0;
                if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 478, column: 16
                  S20947=0;
                  thread43664(tdone,ends);
                  thread43665(tdone,ends);
                  thread43666(tdone,ends);
                  thread43667(tdone,ends);
                  thread43668(tdone,ends);
                  int biggest43669 = 0;
                  if(ends[74]>=biggest43669){
                    biggest43669=ends[74];
                  }
                  if(ends[75]>=biggest43669){
                    biggest43669=ends[75];
                  }
                  if(ends[76]>=biggest43669){
                    biggest43669=ends[76];
                  }
                  if(ends[77]>=biggest43669){
                    biggest43669=ends[77];
                  }
                  if(ends[78]>=biggest43669){
                    biggest43669=ends[78];
                  }
                  if(biggest43669 == 1){
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                }
                else {
                  S20947=1;
                  bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 481, column: 9
                  currsigs.addElement(bottlePos5);
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
              }
              else {
                switch(S20764){
                  case 0 : 
                    switch(S20763){
                      case 0 : 
                        thread43670(tdone,ends);
                        thread43671(tdone,ends);
                        thread43672(tdone,ends);
                        thread43673(tdone,ends);
                        thread43674(tdone,ends);
                        int biggest43675 = 0;
                        if(ends[69]>=biggest43675){
                          biggest43675=ends[69];
                        }
                        if(ends[70]>=biggest43675){
                          biggest43675=ends[70];
                        }
                        if(ends[71]>=biggest43675){
                          biggest43675=ends[71];
                        }
                        if(ends[72]>=biggest43675){
                          biggest43675=ends[72];
                        }
                        if(ends[73]>=biggest43675){
                          biggest43675=ends[73];
                        }
                        if(biggest43675 == 1){
                          active[65]=1;
                          ends[65]=1;
                          tdone[65]=1;
                        }
                        //FINXME code
                        if(biggest43675 == 0){
                          S20764=1;
                          active[65]=1;
                          ends[65]=1;
                          tdone[65]=1;
                        }
                        break;
                      
                      case 1 : 
                        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 467, column: 10
                        currsigs.addElement(bottlePos5);
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    S20764=1;
                    S20764=0;
                    if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 464, column: 17
                      S20763=0;
                      thread43676(tdone,ends);
                      thread43677(tdone,ends);
                      thread43678(tdone,ends);
                      thread43679(tdone,ends);
                      thread43680(tdone,ends);
                      int biggest43681 = 0;
                      if(ends[69]>=biggest43681){
                        biggest43681=ends[69];
                      }
                      if(ends[70]>=biggest43681){
                        biggest43681=ends[70];
                      }
                      if(ends[71]>=biggest43681){
                        biggest43681=ends[71];
                      }
                      if(ends[72]>=biggest43681){
                        biggest43681=ends[72];
                      }
                      if(ends[73]>=biggest43681){
                        biggest43681=ends[73];
                      }
                      if(biggest43681 == 1){
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                    }
                    else {
                      S20763=1;
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 467, column: 10
                      currsigs.addElement(bottlePos5);
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                    }
                    break;
                  
                }
              }
            }
            break;
          
          case 3 : 
            if(gripperAtFinal.getprestatus() && clampClose.getprestatus() && gripperClose.getprestatus() && !capperRaised.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 476, column: 12
              System.out.println("capTwisted");//sysj\ABScontroller.sysj line: 486, column: 6
              S20612=4;
              S21211=0;
              if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 491, column: 16
                S21210=0;
                thread43682(tdone,ends);
                thread43683(tdone,ends);
                thread43684(tdone,ends);
                int biggest43685 = 0;
                if(ends[79]>=biggest43685){
                  biggest43685=ends[79];
                }
                if(ends[80]>=biggest43685){
                  biggest43685=ends[80];
                }
                if(ends[81]>=biggest43685){
                  biggest43685=ends[81];
                }
                if(biggest43685 == 1){
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
              }
              else {
                S21210=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 494, column: 9
                currsigs.addElement(bottlePos5);
                active[65]=1;
                ends[65]=1;
                tdone[65]=1;
              }
            }
            else {
              switch(S20948){
                case 0 : 
                  switch(S20947){
                    case 0 : 
                      thread43686(tdone,ends);
                      thread43687(tdone,ends);
                      thread43688(tdone,ends);
                      thread43689(tdone,ends);
                      thread43690(tdone,ends);
                      int biggest43691 = 0;
                      if(ends[74]>=biggest43691){
                        biggest43691=ends[74];
                      }
                      if(ends[75]>=biggest43691){
                        biggest43691=ends[75];
                      }
                      if(ends[76]>=biggest43691){
                        biggest43691=ends[76];
                      }
                      if(ends[77]>=biggest43691){
                        biggest43691=ends[77];
                      }
                      if(ends[78]>=biggest43691){
                        biggest43691=ends[78];
                      }
                      if(biggest43691 == 1){
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      //FINXME code
                      if(biggest43691 == 0){
                        S20948=1;
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 481, column: 9
                      currsigs.addElement(bottlePos5);
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S20948=1;
                  S20948=0;
                  if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 478, column: 16
                    S20947=0;
                    thread43692(tdone,ends);
                    thread43693(tdone,ends);
                    thread43694(tdone,ends);
                    thread43695(tdone,ends);
                    thread43696(tdone,ends);
                    int biggest43697 = 0;
                    if(ends[74]>=biggest43697){
                      biggest43697=ends[74];
                    }
                    if(ends[75]>=biggest43697){
                      biggest43697=ends[75];
                    }
                    if(ends[76]>=biggest43697){
                      biggest43697=ends[76];
                    }
                    if(ends[77]>=biggest43697){
                      biggest43697=ends[77];
                    }
                    if(ends[78]>=biggest43697){
                      biggest43697=ends[78];
                    }
                    if(biggest43697 == 1){
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                    }
                  }
                  else {
                    S20947=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 481, column: 9
                    currsigs.addElement(bottlePos5);
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 4 : 
            if(gripperOpen.getprestatus() && !gripperAtHome.getprestatus() && clampOpen.getprestatus() && !capperRaised.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 489, column: 12
              System.out.println("bottleUnclamped & capUngripped");//sysj\ABScontroller.sysj line: 499, column: 6
              S20612=5;
              S21333=0;
              if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 504, column: 16
                S21332=0;
                thread43698(tdone,ends);
                thread43699(tdone,ends);
                thread43700(tdone,ends);
                int biggest43701 = 0;
                if(ends[82]>=biggest43701){
                  biggest43701=ends[82];
                }
                if(ends[83]>=biggest43701){
                  biggest43701=ends[83];
                }
                if(ends[84]>=biggest43701){
                  biggest43701=ends[84];
                }
                if(biggest43701 == 1){
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
              }
              else {
                S21332=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 507, column: 9
                currsigs.addElement(bottlePos5);
                active[65]=1;
                ends[65]=1;
                tdone[65]=1;
              }
            }
            else {
              switch(S21211){
                case 0 : 
                  switch(S21210){
                    case 0 : 
                      thread43702(tdone,ends);
                      thread43703(tdone,ends);
                      thread43704(tdone,ends);
                      int biggest43705 = 0;
                      if(ends[79]>=biggest43705){
                        biggest43705=ends[79];
                      }
                      if(ends[80]>=biggest43705){
                        biggest43705=ends[80];
                      }
                      if(ends[81]>=biggest43705){
                        biggest43705=ends[81];
                      }
                      if(biggest43705 == 1){
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      //FINXME code
                      if(biggest43705 == 0){
                        S21211=1;
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 494, column: 9
                      currsigs.addElement(bottlePos5);
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S21211=1;
                  S21211=0;
                  if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 491, column: 16
                    S21210=0;
                    thread43706(tdone,ends);
                    thread43707(tdone,ends);
                    thread43708(tdone,ends);
                    int biggest43709 = 0;
                    if(ends[79]>=biggest43709){
                      biggest43709=ends[79];
                    }
                    if(ends[80]>=biggest43709){
                      biggest43709=ends[80];
                    }
                    if(ends[81]>=biggest43709){
                      biggest43709=ends[81];
                    }
                    if(biggest43709 == 1){
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                    }
                  }
                  else {
                    S21210=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 494, column: 9
                    currsigs.addElement(bottlePos5);
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 5 : 
            if(gripperAtHome.getprestatus() && !gripperAtFinal.getprestatus() && clampOpen.getprestatus() && !capperRaised.getprestatus() && gripperOpen.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 502, column: 12
              System.out.println("gripperUntwisted");//sysj\ABScontroller.sysj line: 512, column: 6
              S20612=6;
              S21450=0;
              if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 517, column: 16
                S21449=0;
                thread43710(tdone,ends);
                thread43711(tdone,ends);
                int biggest43712 = 0;
                if(ends[85]>=biggest43712){
                  biggest43712=ends[85];
                }
                if(ends[86]>=biggest43712){
                  biggest43712=ends[86];
                }
                if(biggest43712 == 1){
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
              }
              else {
                S21449=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 520, column: 9
                currsigs.addElement(bottlePos5);
                active[65]=1;
                ends[65]=1;
                tdone[65]=1;
              }
            }
            else {
              switch(S21333){
                case 0 : 
                  switch(S21332){
                    case 0 : 
                      thread43713(tdone,ends);
                      thread43714(tdone,ends);
                      thread43715(tdone,ends);
                      int biggest43716 = 0;
                      if(ends[82]>=biggest43716){
                        biggest43716=ends[82];
                      }
                      if(ends[83]>=biggest43716){
                        biggest43716=ends[83];
                      }
                      if(ends[84]>=biggest43716){
                        biggest43716=ends[84];
                      }
                      if(biggest43716 == 1){
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      //FINXME code
                      if(biggest43716 == 0){
                        S21333=1;
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 507, column: 9
                      currsigs.addElement(bottlePos5);
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S21333=1;
                  S21333=0;
                  if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 504, column: 16
                    S21332=0;
                    thread43717(tdone,ends);
                    thread43718(tdone,ends);
                    thread43719(tdone,ends);
                    int biggest43720 = 0;
                    if(ends[82]>=biggest43720){
                      biggest43720=ends[82];
                    }
                    if(ends[83]>=biggest43720){
                      biggest43720=ends[83];
                    }
                    if(ends[84]>=biggest43720){
                      biggest43720=ends[84];
                    }
                    if(biggest43720 == 1){
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                    }
                  }
                  else {
                    S21332=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 507, column: 9
                    currsigs.addElement(bottlePos5);
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 6 : 
            if(capperRaised.getprestatus() && clampOpen.getprestatus() && gripperOpen.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 515, column: 12
              System.out.println("gripperRaised");//sysj\ABScontroller.sysj line: 525, column: 6
              bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 526, column: 6
              currsigs.addElement(bottlePos5);
              S20612=7;
              bottleCapped.setPresent();//sysj\ABScontroller.sysj line: 528, column: 7
              currsigs.addElement(bottleCapped);
              active[65]=1;
              ends[65]=1;
              tdone[65]=1;
            }
            else {
              switch(S21450){
                case 0 : 
                  switch(S21449){
                    case 0 : 
                      thread43721(tdone,ends);
                      thread43722(tdone,ends);
                      int biggest43723 = 0;
                      if(ends[85]>=biggest43723){
                        biggest43723=ends[85];
                      }
                      if(ends[86]>=biggest43723){
                        biggest43723=ends[86];
                      }
                      if(biggest43723 == 1){
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      //FINXME code
                      if(biggest43723 == 0){
                        S21450=1;
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 520, column: 9
                      currsigs.addElement(bottlePos5);
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S21450=1;
                  S21450=0;
                  if(auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 517, column: 16
                    S21449=0;
                    thread43724(tdone,ends);
                    thread43725(tdone,ends);
                    int biggest43726 = 0;
                    if(ends[85]>=biggest43726){
                      biggest43726=ends[85];
                    }
                    if(ends[86]>=biggest43726){
                      biggest43726=ends[86];
                    }
                    if(biggest43726 == 1){
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                    }
                  }
                  else {
                    S21449=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 520, column: 9
                    currsigs.addElement(bottlePos5);
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 7 : 
            if(rotaryTableTriggerCapper.getprestatus()){//sysj\ABScontroller.sysj line: 527, column: 12
              S20612=0;
              idle.setPresent();//sysj\ABScontroller.sysj line: 443, column: 7
              currsigs.addElement(idle);
              active[65]=1;
              ends[65]=1;
              tdone[65]=1;
            }
            else {
              bottleCapped.setPresent();//sysj\ABScontroller.sysj line: 528, column: 7
              currsigs.addElement(bottleCapped);
              active[65]=1;
              ends[65]=1;
              tdone[65]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43638(int [] tdone, int [] ends){
        switch(S20607){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        switch(S20599){
          case 0 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 430, column: 9
              S20599=0;
              auto_63.setPresent();//sysj\ABScontroller.sysj line: 431, column: 7
              currsigs.addElement(auto_63);
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            else {
              S20599=1;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            break;
          
          case 1 : 
            S20599=1;
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 430, column: 9
              S20599=0;
              auto_63.setPresent();//sysj\ABScontroller.sysj line: 431, column: 7
              currsigs.addElement(auto_63);
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            else {
              S20599=1;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43635(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 545, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 545, column: 73
      currsigs.addElement(turnGripperHome);
      active[92]=0;
      ends[92]=0;
      tdone[92]=1;
    }
    else {
      active[92]=0;
      ends[92]=0;
      tdone[92]=1;
    }
  }

  public void thread43634(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 543, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 543, column: 73
      currsigs.addElement(turnGripperFinal);
      active[91]=0;
      ends[91]=0;
      tdone[91]=1;
    }
    else {
      active[91]=0;
      ends[91]=0;
      tdone[91]=1;
    }
  }

  public void thread43633(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 541, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 541, column: 54
      currsigs.addElement(lowerCapper);
      active[90]=0;
      ends[90]=0;
      tdone[90]=1;
    }
    else {
      active[90]=0;
      ends[90]=0;
      tdone[90]=1;
    }
  }

  public void thread43632(int [] tdone, int [] ends){
        if(gripCapM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 539, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 539, column: 51
      currsigs.addElement(gripCap);
      active[89]=0;
      ends[89]=0;
      tdone[89]=1;
    }
    else {
      active[89]=0;
      ends[89]=0;
      tdone[89]=1;
    }
  }

  public void thread43631(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 537, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 537, column: 54
      currsigs.addElement(clampBottle);
      active[88]=0;
      ends[88]=0;
      tdone[88]=1;
    }
    else {
      active[88]=0;
      ends[88]=0;
      tdone[88]=1;
    }
  }

  public void thread43630(int [] tdone, int [] ends){
        S23446=1;
    S23410=0;
    if(!auto_63.getprestatus()){//sysj\ABScontroller.sysj line: 536, column: 14
      thread43631(tdone,ends);
      thread43632(tdone,ends);
      thread43633(tdone,ends);
      thread43634(tdone,ends);
      thread43635(tdone,ends);
      int biggest43636 = 0;
      if(ends[88]>=biggest43636){
        biggest43636=ends[88];
      }
      if(ends[89]>=biggest43636){
        biggest43636=ends[89];
      }
      if(ends[90]>=biggest43636){
        biggest43636=ends[90];
      }
      if(ends[91]>=biggest43636){
        biggest43636=ends[91];
      }
      if(ends[92]>=biggest43636){
        biggest43636=ends[92];
      }
      //FINXME code
      if(biggest43636 == 0){
        S23410=1;
        active[87]=1;
        ends[87]=1;
        tdone[87]=1;
      }
    }
    else {
      S23410=1;
      active[87]=1;
      ends[87]=1;
      tdone[87]=1;
    }
  }

  public void thread43629(int [] tdone, int [] ends){
        S23393=1;
    S20612=0;
    idle.setPresent();//sysj\ABScontroller.sysj line: 443, column: 7
    currsigs.addElement(idle);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread43628(int [] tdone, int [] ends){
        S20607=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 430, column: 9
      S20599=0;
      auto_63.setPresent();//sysj\ABScontroller.sysj line: 431, column: 7
      currsigs.addElement(auto_63);
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
    else {
      S20599=1;
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S43414){
        case 0 : 
          S43414=0;
          break RUN;
        
        case 1 : 
          S43414=2;
          S43414=2;
          System.out.println("CapperController");//sysj\ABScontroller.sysj line: 424, column: 2
          if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 426, column: 11
            S23448=0;
            auto_63.setClear();//sysj\ABScontroller.sysj line: 427, column: 4
            S23447=0;
            thread43628(tdone,ends);
            thread43629(tdone,ends);
            thread43630(tdone,ends);
            int biggest43637 = 0;
            if(ends[64]>=biggest43637){
              biggest43637=ends[64];
            }
            if(ends[65]>=biggest43637){
              biggest43637=ends[65];
            }
            if(ends[87]>=biggest43637){
              biggest43637=ends[87];
            }
            if(biggest43637 == 1){
              active[63]=1;
              ends[63]=1;
              break RUN;
            }
          }
          else {
            S23448=1;
            active[63]=1;
            ends[63]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S23448){
            case 0 : 
              auto_63.setClear();//sysj\ABScontroller.sysj line: 427, column: 4
              switch(S23447){
                case 0 : 
                  thread43638(tdone,ends);
                  thread43639(tdone,ends);
                  thread43727(tdone,ends);
                  int biggest43740 = 0;
                  if(ends[64]>=biggest43740){
                    biggest43740=ends[64];
                  }
                  if(ends[65]>=biggest43740){
                    biggest43740=ends[65];
                  }
                  if(ends[87]>=biggest43740){
                    biggest43740=ends[87];
                  }
                  if(biggest43740 == 1){
                    active[63]=1;
                    ends[63]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest43740 == 0){
                    S23447=1;
                    active[63]=1;
                    ends[63]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S23447=1;
                  if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 426, column: 11
                    S23448=0;
                    auto_63.setClear();//sysj\ABScontroller.sysj line: 427, column: 4
                    S23447=0;
                    thread43741(tdone,ends);
                    thread43742(tdone,ends);
                    thread43743(tdone,ends);
                    int biggest43750 = 0;
                    if(ends[64]>=biggest43750){
                      biggest43750=ends[64];
                    }
                    if(ends[65]>=biggest43750){
                      biggest43750=ends[65];
                    }
                    if(ends[87]>=biggest43750){
                      biggest43750=ends[87];
                    }
                    if(biggest43750 == 1){
                      active[63]=1;
                      ends[63]=1;
                      break RUN;
                    }
                  }
                  else {
                    S23448=1;
                    active[63]=1;
                    ends[63]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S23448=1;
              if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 426, column: 11
                S23448=0;
                auto_63.setClear();//sysj\ABScontroller.sysj line: 427, column: 4
                S23447=0;
                thread43751(tdone,ends);
                thread43752(tdone,ends);
                thread43753(tdone,ends);
                int biggest43760 = 0;
                if(ends[64]>=biggest43760){
                  biggest43760=ends[64];
                }
                if(ends[65]>=biggest43760){
                  biggest43760=ends[65];
                }
                if(ends[87]>=biggest43760){
                  biggest43760=ends[87];
                }
                if(biggest43760 == 1){
                  active[63]=1;
                  ends[63]=1;
                  break RUN;
                }
              }
              else {
                S23448=1;
                active[63]=1;
                ends[63]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    auto_63 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[63] != 0){
      int index = 63;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[63]!=0 || suspended[63]!=0 || active[63]!=1);
      else{
        if(!df){
          bottleReady.gethook();
          emergency.gethook();
          mode.gethook();
          clampClose.gethook();
          clampOpen.gethook();
          gripperClose.gethook();
          gripperOpen.gethook();
          capperRaised.gethook();
          capperLowered.gethook();
          gripperAtFinal.gethook();
          gripperAtHome.gethook();
          rotaryTableTriggerCapper.gethook();
          clampBottleM.gethook();
          gripCapM.gethook();
          lowerCapperM.gethook();
          turnGripperFinalM.gethook();
          turnGripperHomeM.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleReady.setpreclear();
      emergency.setpreclear();
      mode.setpreclear();
      clampClose.setpreclear();
      clampOpen.setpreclear();
      gripperClose.setpreclear();
      gripperOpen.setpreclear();
      capperRaised.setpreclear();
      capperLowered.setpreclear();
      gripperAtFinal.setpreclear();
      gripperAtHome.setpreclear();
      rotaryTableTriggerCapper.setpreclear();
      clampBottleM.setpreclear();
      gripCapM.setpreclear();
      lowerCapperM.setpreclear();
      turnGripperFinalM.setpreclear();
      turnGripperHomeM.setpreclear();
      clampBottle.setpreclear();
      gripCap.setpreclear();
      lowerCapper.setpreclear();
      turnGripperFinal.setpreclear();
      turnGripperHome.setpreclear();
      bottlePos5.setpreclear();
      bottleCapped.setpreclear();
      idle.setpreclear();
      auto_63.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleReady.getStatus() ? bottleReady.setprepresent() : bottleReady.setpreclear();
      bottleReady.setpreval(bottleReady.getValue());
      bottleReady.setClear();
      dummyint = emergency.getStatus() ? emergency.setprepresent() : emergency.setpreclear();
      emergency.setpreval(emergency.getValue());
      emergency.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = clampClose.getStatus() ? clampClose.setprepresent() : clampClose.setpreclear();
      clampClose.setpreval(clampClose.getValue());
      clampClose.setClear();
      dummyint = clampOpen.getStatus() ? clampOpen.setprepresent() : clampOpen.setpreclear();
      clampOpen.setpreval(clampOpen.getValue());
      clampOpen.setClear();
      dummyint = gripperClose.getStatus() ? gripperClose.setprepresent() : gripperClose.setpreclear();
      gripperClose.setpreval(gripperClose.getValue());
      gripperClose.setClear();
      dummyint = gripperOpen.getStatus() ? gripperOpen.setprepresent() : gripperOpen.setpreclear();
      gripperOpen.setpreval(gripperOpen.getValue());
      gripperOpen.setClear();
      dummyint = capperRaised.getStatus() ? capperRaised.setprepresent() : capperRaised.setpreclear();
      capperRaised.setpreval(capperRaised.getValue());
      capperRaised.setClear();
      dummyint = capperLowered.getStatus() ? capperLowered.setprepresent() : capperLowered.setpreclear();
      capperLowered.setpreval(capperLowered.getValue());
      capperLowered.setClear();
      dummyint = gripperAtFinal.getStatus() ? gripperAtFinal.setprepresent() : gripperAtFinal.setpreclear();
      gripperAtFinal.setpreval(gripperAtFinal.getValue());
      gripperAtFinal.setClear();
      dummyint = gripperAtHome.getStatus() ? gripperAtHome.setprepresent() : gripperAtHome.setpreclear();
      gripperAtHome.setpreval(gripperAtHome.getValue());
      gripperAtHome.setClear();
      dummyint = rotaryTableTriggerCapper.getStatus() ? rotaryTableTriggerCapper.setprepresent() : rotaryTableTriggerCapper.setpreclear();
      rotaryTableTriggerCapper.setpreval(rotaryTableTriggerCapper.getValue());
      rotaryTableTriggerCapper.setClear();
      dummyint = clampBottleM.getStatus() ? clampBottleM.setprepresent() : clampBottleM.setpreclear();
      clampBottleM.setpreval(clampBottleM.getValue());
      clampBottleM.setClear();
      dummyint = gripCapM.getStatus() ? gripCapM.setprepresent() : gripCapM.setpreclear();
      gripCapM.setpreval(gripCapM.getValue());
      gripCapM.setClear();
      dummyint = lowerCapperM.getStatus() ? lowerCapperM.setprepresent() : lowerCapperM.setpreclear();
      lowerCapperM.setpreval(lowerCapperM.getValue());
      lowerCapperM.setClear();
      dummyint = turnGripperFinalM.getStatus() ? turnGripperFinalM.setprepresent() : turnGripperFinalM.setpreclear();
      turnGripperFinalM.setpreval(turnGripperFinalM.getValue());
      turnGripperFinalM.setClear();
      dummyint = turnGripperHomeM.getStatus() ? turnGripperHomeM.setprepresent() : turnGripperHomeM.setpreclear();
      turnGripperHomeM.setpreval(turnGripperHomeM.getValue());
      turnGripperHomeM.setClear();
      clampBottle.sethook();
      clampBottle.setClear();
      gripCap.sethook();
      gripCap.setClear();
      lowerCapper.sethook();
      lowerCapper.setClear();
      turnGripperFinal.sethook();
      turnGripperFinal.setClear();
      turnGripperHome.sethook();
      turnGripperHome.setClear();
      bottlePos5.sethook();
      bottlePos5.setClear();
      bottleCapped.sethook();
      bottleCapped.setClear();
      idle.sethook();
      idle.setClear();
      auto_63.setClear();
      if(paused[63]!=0 || suspended[63]!=0 || active[63]!=1);
      else{
        bottleReady.gethook();
        emergency.gethook();
        mode.gethook();
        clampClose.gethook();
        clampOpen.gethook();
        gripperClose.gethook();
        gripperOpen.gethook();
        capperRaised.gethook();
        capperLowered.gethook();
        gripperAtFinal.gethook();
        gripperAtHome.gethook();
        rotaryTableTriggerCapper.gethook();
        clampBottleM.gethook();
        gripCapM.gethook();
        lowerCapperM.gethook();
        turnGripperFinalM.gethook();
        turnGripperHomeM.gethook();
      }
      runFinisher();
      if(active[63] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
