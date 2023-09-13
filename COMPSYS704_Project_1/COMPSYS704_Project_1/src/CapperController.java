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
  private Signal auto_35;
  private int S30554 = 1;
  private int S10819 = 1;
  private int S10818 = 1;
  private int S8011 = 1;
  private int S8003 = 1;
  private int S10764 = 1;
  private int S8013 = 1;
  private int S8033 = 1;
  private int S8032 = 1;
  private int S8018 = 1;
  private int S8023 = 1;
  private int S8028 = 1;
  private int S8165 = 1;
  private int S8164 = 1;
  private int S8140 = 1;
  private int S8145 = 1;
  private int S8150 = 1;
  private int S8155 = 1;
  private int S8160 = 1;
  private int S8349 = 1;
  private int S8348 = 1;
  private int S8324 = 1;
  private int S8329 = 1;
  private int S8334 = 1;
  private int S8339 = 1;
  private int S8344 = 1;
  private int S8612 = 1;
  private int S8611 = 1;
  private int S8597 = 1;
  private int S8602 = 1;
  private int S8607 = 1;
  private int S8734 = 1;
  private int S8733 = 1;
  private int S8719 = 1;
  private int S8724 = 1;
  private int S8729 = 1;
  private int S8851 = 1;
  private int S8850 = 1;
  private int S8841 = 1;
  private int S8846 = 1;
  private int S10817 = 1;
  private int S10781 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void thread31570(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 399, column: 59
      currsigs.addElement(turnGripperHome);
      active[64]=0;
      ends[64]=0;
      tdone[64]=1;
    }
    else {
      active[64]=0;
      ends[64]=0;
      tdone[64]=1;
    }
  }

  public void thread31569(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus()){//sysj\ABScontroller.sysj line: 397, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 397, column: 59
      currsigs.addElement(turnGripperFinal);
      active[63]=0;
      ends[63]=0;
      tdone[63]=1;
    }
    else {
      active[63]=0;
      ends[63]=0;
      tdone[63]=1;
    }
  }

  public void thread31568(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus()){//sysj\ABScontroller.sysj line: 395, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 395, column: 40
      currsigs.addElement(lowerCapper);
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
    else {
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
  }

  public void thread31567(int [] tdone, int [] ends){
        if(gripCapM.getprestatus()){//sysj\ABScontroller.sysj line: 393, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 393, column: 37
      currsigs.addElement(gripCap);
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
    else {
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
  }

  public void thread31566(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus()){//sysj\ABScontroller.sysj line: 391, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 391, column: 40
      currsigs.addElement(clampBottle);
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
    else {
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
  }

  public void thread31565(int [] tdone, int [] ends){
        S10817=1;
    S10781=0;
    if(!auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 390, column: 14
      thread31566(tdone,ends);
      thread31567(tdone,ends);
      thread31568(tdone,ends);
      thread31569(tdone,ends);
      thread31570(tdone,ends);
      int biggest31571 = 0;
      if(ends[60]>=biggest31571){
        biggest31571=ends[60];
      }
      if(ends[61]>=biggest31571){
        biggest31571=ends[61];
      }
      if(ends[62]>=biggest31571){
        biggest31571=ends[62];
      }
      if(ends[63]>=biggest31571){
        biggest31571=ends[63];
      }
      if(ends[64]>=biggest31571){
        biggest31571=ends[64];
      }
      //FINXME code
      if(biggest31571 == 0){
        S10781=1;
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
      }
    }
    else {
      S10781=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread31564(int [] tdone, int [] ends){
        S10764=1;
    S8013=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31563(int [] tdone, int [] ends){
        S8011=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 292, column: 9
      S8003=0;
      auto_35.setPresent();//sysj\ABScontroller.sysj line: 293, column: 7
      currsigs.addElement(auto_35);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S8003=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread31560(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 399, column: 59
      currsigs.addElement(turnGripperHome);
      active[64]=0;
      ends[64]=0;
      tdone[64]=1;
    }
    else {
      active[64]=0;
      ends[64]=0;
      tdone[64]=1;
    }
  }

  public void thread31559(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus()){//sysj\ABScontroller.sysj line: 397, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 397, column: 59
      currsigs.addElement(turnGripperFinal);
      active[63]=0;
      ends[63]=0;
      tdone[63]=1;
    }
    else {
      active[63]=0;
      ends[63]=0;
      tdone[63]=1;
    }
  }

  public void thread31558(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus()){//sysj\ABScontroller.sysj line: 395, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 395, column: 40
      currsigs.addElement(lowerCapper);
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
    else {
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
  }

  public void thread31557(int [] tdone, int [] ends){
        if(gripCapM.getprestatus()){//sysj\ABScontroller.sysj line: 393, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 393, column: 37
      currsigs.addElement(gripCap);
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
    else {
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
  }

  public void thread31556(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus()){//sysj\ABScontroller.sysj line: 391, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 391, column: 40
      currsigs.addElement(clampBottle);
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
    else {
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
  }

  public void thread31555(int [] tdone, int [] ends){
        S10817=1;
    S10781=0;
    if(!auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 390, column: 14
      thread31556(tdone,ends);
      thread31557(tdone,ends);
      thread31558(tdone,ends);
      thread31559(tdone,ends);
      thread31560(tdone,ends);
      int biggest31561 = 0;
      if(ends[60]>=biggest31561){
        biggest31561=ends[60];
      }
      if(ends[61]>=biggest31561){
        biggest31561=ends[61];
      }
      if(ends[62]>=biggest31561){
        biggest31561=ends[62];
      }
      if(ends[63]>=biggest31561){
        biggest31561=ends[63];
      }
      if(ends[64]>=biggest31561){
        biggest31561=ends[64];
      }
      //FINXME code
      if(biggest31561 == 0){
        S10781=1;
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
      }
    }
    else {
      S10781=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread31554(int [] tdone, int [] ends){
        S10764=1;
    S8013=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31553(int [] tdone, int [] ends){
        S8011=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 292, column: 9
      S8003=0;
      auto_35.setPresent();//sysj\ABScontroller.sysj line: 293, column: 7
      currsigs.addElement(auto_35);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S8003=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread31550(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 399, column: 59
      currsigs.addElement(turnGripperHome);
      active[64]=0;
      ends[64]=0;
      tdone[64]=1;
    }
    else {
      active[64]=0;
      ends[64]=0;
      tdone[64]=1;
    }
  }

  public void thread31549(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus()){//sysj\ABScontroller.sysj line: 397, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 397, column: 59
      currsigs.addElement(turnGripperFinal);
      active[63]=0;
      ends[63]=0;
      tdone[63]=1;
    }
    else {
      active[63]=0;
      ends[63]=0;
      tdone[63]=1;
    }
  }

  public void thread31548(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus()){//sysj\ABScontroller.sysj line: 395, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 395, column: 40
      currsigs.addElement(lowerCapper);
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
    else {
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
  }

  public void thread31547(int [] tdone, int [] ends){
        if(gripCapM.getprestatus()){//sysj\ABScontroller.sysj line: 393, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 393, column: 37
      currsigs.addElement(gripCap);
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
    else {
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
  }

  public void thread31546(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus()){//sysj\ABScontroller.sysj line: 391, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 391, column: 40
      currsigs.addElement(clampBottle);
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
    else {
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
  }

  public void thread31544(int [] tdone, int [] ends){
        active[64]=0;
    ends[64]=0;
    tdone[64]=1;
  }

  public void thread31543(int [] tdone, int [] ends){
        active[63]=0;
    ends[63]=0;
    tdone[63]=1;
  }

  public void thread31542(int [] tdone, int [] ends){
        active[62]=0;
    ends[62]=0;
    tdone[62]=1;
  }

  public void thread31541(int [] tdone, int [] ends){
        active[61]=0;
    ends[61]=0;
    tdone[61]=1;
  }

  public void thread31540(int [] tdone, int [] ends){
        active[60]=0;
    ends[60]=0;
    tdone[60]=1;
  }

  public void thread31539(int [] tdone, int [] ends){
        switch(S10817){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        switch(S10781){
          case 0 : 
            thread31540(tdone,ends);
            thread31541(tdone,ends);
            thread31542(tdone,ends);
            thread31543(tdone,ends);
            thread31544(tdone,ends);
            int biggest31545 = 0;
            if(ends[60]>=biggest31545){
              biggest31545=ends[60];
            }
            if(ends[61]>=biggest31545){
              biggest31545=ends[61];
            }
            if(ends[62]>=biggest31545){
              biggest31545=ends[62];
            }
            if(ends[63]>=biggest31545){
              biggest31545=ends[63];
            }
            if(ends[64]>=biggest31545){
              biggest31545=ends[64];
            }
            //FINXME code
            if(biggest31545 == 0){
              S10781=1;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 1 : 
            S10781=1;
            S10781=0;
            if(!auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 390, column: 14
              thread31546(tdone,ends);
              thread31547(tdone,ends);
              thread31548(tdone,ends);
              thread31549(tdone,ends);
              thread31550(tdone,ends);
              int biggest31551 = 0;
              if(ends[60]>=biggest31551){
                biggest31551=ends[60];
              }
              if(ends[61]>=biggest31551){
                biggest31551=ends[61];
              }
              if(ends[62]>=biggest31551){
                biggest31551=ends[62];
              }
              if(ends[63]>=biggest31551){
                biggest31551=ends[63];
              }
              if(ends[64]>=biggest31551){
                biggest31551=ends[64];
              }
              //FINXME code
              if(biggest31551 == 0){
                S10781=1;
                active[59]=1;
                ends[59]=1;
                tdone[59]=1;
              }
            }
            else {
              S10781=1;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31537(int [] tdone, int [] ends){
        S8846=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 375, column: 43
    currsigs.addElement(bottlePos5);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31536(int [] tdone, int [] ends){
        S8841=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 375, column: 11
    currsigs.addElement(turnGripperHome);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread31534(int [] tdone, int [] ends){
        switch(S8846){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 375, column: 43
        currsigs.addElement(bottlePos5);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread31533(int [] tdone, int [] ends){
        switch(S8841){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 375, column: 11
        currsigs.addElement(turnGripperHome);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread31531(int [] tdone, int [] ends){
        S8729=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 363, column: 70
    currsigs.addElement(lowerCapper);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31530(int [] tdone, int [] ends){
        S8724=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 363, column: 43
    currsigs.addElement(bottlePos5);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31529(int [] tdone, int [] ends){
        S8719=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 363, column: 11
    currsigs.addElement(turnGripperHome);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread31527(int [] tdone, int [] ends){
        switch(S8729){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 363, column: 70
        currsigs.addElement(lowerCapper);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread31526(int [] tdone, int [] ends){
        switch(S8724){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 363, column: 43
        currsigs.addElement(bottlePos5);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread31525(int [] tdone, int [] ends){
        switch(S8719){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 363, column: 11
        currsigs.addElement(turnGripperHome);
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
        break;
      
    }
  }

  public void thread31523(int [] tdone, int [] ends){
        S8846=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 375, column: 43
    currsigs.addElement(bottlePos5);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31522(int [] tdone, int [] ends){
        S8841=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 375, column: 11
    currsigs.addElement(turnGripperHome);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread31520(int [] tdone, int [] ends){
        S8607=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 351, column: 71
    currsigs.addElement(lowerCapper);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread31519(int [] tdone, int [] ends){
        S8602=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 351, column: 44
    currsigs.addElement(bottlePos5);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread31518(int [] tdone, int [] ends){
        S8597=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 351, column: 11
    currsigs.addElement(turnGripperFinal);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread31516(int [] tdone, int [] ends){
        switch(S8607){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 351, column: 71
        currsigs.addElement(lowerCapper);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread31515(int [] tdone, int [] ends){
        switch(S8602){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 351, column: 44
        currsigs.addElement(bottlePos5);
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
        break;
      
    }
  }

  public void thread31514(int [] tdone, int [] ends){
        switch(S8597){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 351, column: 11
        currsigs.addElement(turnGripperFinal);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread31512(int [] tdone, int [] ends){
        S8729=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 363, column: 70
    currsigs.addElement(lowerCapper);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31511(int [] tdone, int [] ends){
        S8724=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 363, column: 43
    currsigs.addElement(bottlePos5);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31510(int [] tdone, int [] ends){
        S8719=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 363, column: 11
    currsigs.addElement(turnGripperHome);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread31508(int [] tdone, int [] ends){
        S8344=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 339, column: 123
    currsigs.addElement(lowerCapper);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread31507(int [] tdone, int [] ends){
        S8339=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 339, column: 95
    currsigs.addElement(clampBottle);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread31506(int [] tdone, int [] ends){
        S8334=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 339, column: 68
    currsigs.addElement(bottlePos5);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread31505(int [] tdone, int [] ends){
        S8329=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 339, column: 44
    currsigs.addElement(gripCap);
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31504(int [] tdone, int [] ends){
        S8324=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 339, column: 11
    currsigs.addElement(turnGripperFinal);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread31502(int [] tdone, int [] ends){
        switch(S8344){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 339, column: 123
        currsigs.addElement(lowerCapper);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread31501(int [] tdone, int [] ends){
        switch(S8339){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        clampBottle.setPresent();//sysj\ABScontroller.sysj line: 339, column: 95
        currsigs.addElement(clampBottle);
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
        break;
      
    }
  }

  public void thread31500(int [] tdone, int [] ends){
        switch(S8334){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 339, column: 68
        currsigs.addElement(bottlePos5);
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
        break;
      
    }
  }

  public void thread31499(int [] tdone, int [] ends){
        switch(S8329){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        gripCap.setPresent();//sysj\ABScontroller.sysj line: 339, column: 44
        currsigs.addElement(gripCap);
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
        break;
      
    }
  }

  public void thread31498(int [] tdone, int [] ends){
        switch(S8324){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 339, column: 11
        currsigs.addElement(turnGripperFinal);
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
        break;
      
    }
  }

  public void thread31496(int [] tdone, int [] ends){
        S8607=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 351, column: 71
    currsigs.addElement(lowerCapper);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread31495(int [] tdone, int [] ends){
        S8602=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 351, column: 44
    currsigs.addElement(bottlePos5);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread31494(int [] tdone, int [] ends){
        S8597=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 351, column: 11
    currsigs.addElement(turnGripperFinal);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread31492(int [] tdone, int [] ends){
        S8160=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 326, column: 127
    currsigs.addElement(gripCap);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31491(int [] tdone, int [] ends){
        S8155=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 326, column: 99
    currsigs.addElement(clampBottle);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31490(int [] tdone, int [] ends){
        S8150=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 326, column: 72
    currsigs.addElement(bottlePos5);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread31489(int [] tdone, int [] ends){
        S8145=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 326, column: 44
    currsigs.addElement(lowerCapper);
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread31488(int [] tdone, int [] ends){
        S8140=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 326, column: 12
    currsigs.addElement(turnGripperHome);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread31486(int [] tdone, int [] ends){
        switch(S8160){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        gripCap.setPresent();//sysj\ABScontroller.sysj line: 326, column: 127
        currsigs.addElement(gripCap);
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
        break;
      
    }
  }

  public void thread31485(int [] tdone, int [] ends){
        switch(S8155){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        clampBottle.setPresent();//sysj\ABScontroller.sysj line: 326, column: 99
        currsigs.addElement(clampBottle);
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
        break;
      
    }
  }

  public void thread31484(int [] tdone, int [] ends){
        switch(S8150){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 326, column: 72
        currsigs.addElement(bottlePos5);
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
        break;
      
    }
  }

  public void thread31483(int [] tdone, int [] ends){
        switch(S8145){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 326, column: 44
        currsigs.addElement(lowerCapper);
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
        break;
      
    }
  }

  public void thread31482(int [] tdone, int [] ends){
        switch(S8140){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 326, column: 12
        currsigs.addElement(turnGripperHome);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
        break;
      
    }
  }

  public void thread31480(int [] tdone, int [] ends){
        S8344=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 339, column: 123
    currsigs.addElement(lowerCapper);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread31479(int [] tdone, int [] ends){
        S8339=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 339, column: 95
    currsigs.addElement(clampBottle);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread31478(int [] tdone, int [] ends){
        S8334=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 339, column: 68
    currsigs.addElement(bottlePos5);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread31477(int [] tdone, int [] ends){
        S8329=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 339, column: 44
    currsigs.addElement(gripCap);
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31476(int [] tdone, int [] ends){
        S8324=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 339, column: 11
    currsigs.addElement(turnGripperFinal);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread31474(int [] tdone, int [] ends){
        S8344=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 339, column: 123
    currsigs.addElement(lowerCapper);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread31473(int [] tdone, int [] ends){
        S8339=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 339, column: 95
    currsigs.addElement(clampBottle);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread31472(int [] tdone, int [] ends){
        S8334=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 339, column: 68
    currsigs.addElement(bottlePos5);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread31471(int [] tdone, int [] ends){
        S8329=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 339, column: 44
    currsigs.addElement(gripCap);
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31470(int [] tdone, int [] ends){
        S8324=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 339, column: 11
    currsigs.addElement(turnGripperFinal);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread31468(int [] tdone, int [] ends){
        S8028=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 313, column: 71
    currsigs.addElement(bottlePos5);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread31467(int [] tdone, int [] ends){
        S8023=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 313, column: 43
    currsigs.addElement(lowerCapper);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31466(int [] tdone, int [] ends){
        S8018=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 313, column: 11
    currsigs.addElement(turnGripperHome);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31464(int [] tdone, int [] ends){
        switch(S8028){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 313, column: 71
        currsigs.addElement(bottlePos5);
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
        break;
      
    }
  }

  public void thread31463(int [] tdone, int [] ends){
        switch(S8023){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 313, column: 43
        currsigs.addElement(lowerCapper);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
        break;
      
    }
  }

  public void thread31462(int [] tdone, int [] ends){
        switch(S8018){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 313, column: 11
        currsigs.addElement(turnGripperHome);
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
        break;
      
    }
  }

  public void thread31460(int [] tdone, int [] ends){
        S8160=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 326, column: 127
    currsigs.addElement(gripCap);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31459(int [] tdone, int [] ends){
        S8155=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 326, column: 99
    currsigs.addElement(clampBottle);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31458(int [] tdone, int [] ends){
        S8150=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 326, column: 72
    currsigs.addElement(bottlePos5);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread31457(int [] tdone, int [] ends){
        S8145=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 326, column: 44
    currsigs.addElement(lowerCapper);
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread31456(int [] tdone, int [] ends){
        S8140=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 326, column: 12
    currsigs.addElement(turnGripperHome);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread31454(int [] tdone, int [] ends){
        S8028=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 313, column: 71
    currsigs.addElement(bottlePos5);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread31453(int [] tdone, int [] ends){
        S8023=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 313, column: 43
    currsigs.addElement(lowerCapper);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31452(int [] tdone, int [] ends){
        S8018=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 313, column: 11
    currsigs.addElement(turnGripperHome);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31451(int [] tdone, int [] ends){
        switch(S10764){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S8013){
          case 0 : 
            if(bottleReady.getprestatus() && capperRaised.getprestatus() && gripperAtHome.getprestatus()){//sysj\ABScontroller.sysj line: 304, column: 12
              System.out.println("bottleReady");//sysj\ABScontroller.sysj line: 307, column: 6
              S8013=1;
              S8033=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 312, column: 16
                S8032=0;
                thread31452(tdone,ends);
                thread31453(tdone,ends);
                thread31454(tdone,ends);
                int biggest31455 = 0;
                if(ends[38]>=biggest31455){
                  biggest31455=ends[38];
                }
                if(ends[39]>=biggest31455){
                  biggest31455=ends[39];
                }
                if(ends[40]>=biggest31455){
                  biggest31455=ends[40];
                }
                if(biggest31455 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                S8032=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 315, column: 9
                currsigs.addElement(bottlePos5);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 1 : 
            if(capperLowered.getprestatus() && clampOpen.getprestatus() && gripperOpen.getprestatus()){//sysj\ABScontroller.sysj line: 310, column: 12
              S8013=2;
              S8165=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 325, column: 17
                S8164=0;
                thread31456(tdone,ends);
                thread31457(tdone,ends);
                thread31458(tdone,ends);
                thread31459(tdone,ends);
                thread31460(tdone,ends);
                int biggest31461 = 0;
                if(ends[41]>=biggest31461){
                  biggest31461=ends[41];
                }
                if(ends[42]>=biggest31461){
                  biggest31461=ends[42];
                }
                if(ends[43]>=biggest31461){
                  biggest31461=ends[43];
                }
                if(ends[44]>=biggest31461){
                  biggest31461=ends[44];
                }
                if(ends[45]>=biggest31461){
                  biggest31461=ends[45];
                }
                if(biggest31461 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                S8164=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 328, column: 10
                currsigs.addElement(bottlePos5);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              switch(S8033){
                case 0 : 
                  switch(S8032){
                    case 0 : 
                      thread31462(tdone,ends);
                      thread31463(tdone,ends);
                      thread31464(tdone,ends);
                      int biggest31465 = 0;
                      if(ends[38]>=biggest31465){
                        biggest31465=ends[38];
                      }
                      if(ends[39]>=biggest31465){
                        biggest31465=ends[39];
                      }
                      if(ends[40]>=biggest31465){
                        biggest31465=ends[40];
                      }
                      if(biggest31465 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      //FINXME code
                      if(biggest31465 == 0){
                        S8033=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 315, column: 9
                      currsigs.addElement(bottlePos5);
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S8033=1;
                  S8033=0;
                  if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 312, column: 16
                    S8032=0;
                    thread31466(tdone,ends);
                    thread31467(tdone,ends);
                    thread31468(tdone,ends);
                    int biggest31469 = 0;
                    if(ends[38]>=biggest31469){
                      biggest31469=ends[38];
                    }
                    if(ends[39]>=biggest31469){
                      biggest31469=ends[39];
                    }
                    if(ends[40]>=biggest31469){
                      biggest31469=ends[40];
                    }
                    if(biggest31469 == 1){
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    S8032=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 315, column: 9
                    currsigs.addElement(bottlePos5);
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(capperLowered.getprestatus() && clampClose.getprestatus() && !gripperAtFinal.getprestatus() && gripperClose.getprestatus()){//sysj\ABScontroller.sysj line: 322, column: 12
              S8013=3;
              S8349=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 338, column: 16
                S8348=0;
                thread31470(tdone,ends);
                thread31471(tdone,ends);
                thread31472(tdone,ends);
                thread31473(tdone,ends);
                thread31474(tdone,ends);
                int biggest31475 = 0;
                if(ends[46]>=biggest31475){
                  biggest31475=ends[46];
                }
                if(ends[47]>=biggest31475){
                  biggest31475=ends[47];
                }
                if(ends[48]>=biggest31475){
                  biggest31475=ends[48];
                }
                if(ends[49]>=biggest31475){
                  biggest31475=ends[49];
                }
                if(ends[50]>=biggest31475){
                  biggest31475=ends[50];
                }
                if(biggest31475 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                S8348=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 341, column: 9
                currsigs.addElement(bottlePos5);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              if(clampClose.getprestatus() && !gripperAtFinal.getprestatus() && gripperClose.getprestatus()){//sysj\ABScontroller.sysj line: 323, column: 13
                S8013=3;
                S8349=0;
                if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 338, column: 16
                  S8348=0;
                  thread31476(tdone,ends);
                  thread31477(tdone,ends);
                  thread31478(tdone,ends);
                  thread31479(tdone,ends);
                  thread31480(tdone,ends);
                  int biggest31481 = 0;
                  if(ends[46]>=biggest31481){
                    biggest31481=ends[46];
                  }
                  if(ends[47]>=biggest31481){
                    biggest31481=ends[47];
                  }
                  if(ends[48]>=biggest31481){
                    biggest31481=ends[48];
                  }
                  if(ends[49]>=biggest31481){
                    biggest31481=ends[49];
                  }
                  if(ends[50]>=biggest31481){
                    biggest31481=ends[50];
                  }
                  if(biggest31481 == 1){
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                else {
                  S8348=1;
                  bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 341, column: 9
                  currsigs.addElement(bottlePos5);
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                switch(S8165){
                  case 0 : 
                    switch(S8164){
                      case 0 : 
                        thread31482(tdone,ends);
                        thread31483(tdone,ends);
                        thread31484(tdone,ends);
                        thread31485(tdone,ends);
                        thread31486(tdone,ends);
                        int biggest31487 = 0;
                        if(ends[41]>=biggest31487){
                          biggest31487=ends[41];
                        }
                        if(ends[42]>=biggest31487){
                          biggest31487=ends[42];
                        }
                        if(ends[43]>=biggest31487){
                          biggest31487=ends[43];
                        }
                        if(ends[44]>=biggest31487){
                          biggest31487=ends[44];
                        }
                        if(ends[45]>=biggest31487){
                          biggest31487=ends[45];
                        }
                        if(biggest31487 == 1){
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                        //FINXME code
                        if(biggest31487 == 0){
                          S8165=1;
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                        break;
                      
                      case 1 : 
                        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 328, column: 10
                        currsigs.addElement(bottlePos5);
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    S8165=1;
                    S8165=0;
                    if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 325, column: 17
                      S8164=0;
                      thread31488(tdone,ends);
                      thread31489(tdone,ends);
                      thread31490(tdone,ends);
                      thread31491(tdone,ends);
                      thread31492(tdone,ends);
                      int biggest31493 = 0;
                      if(ends[41]>=biggest31493){
                        biggest31493=ends[41];
                      }
                      if(ends[42]>=biggest31493){
                        biggest31493=ends[42];
                      }
                      if(ends[43]>=biggest31493){
                        biggest31493=ends[43];
                      }
                      if(ends[44]>=biggest31493){
                        biggest31493=ends[44];
                      }
                      if(ends[45]>=biggest31493){
                        biggest31493=ends[45];
                      }
                      if(biggest31493 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                    }
                    else {
                      S8164=1;
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 328, column: 10
                      currsigs.addElement(bottlePos5);
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                    break;
                  
                }
              }
            }
            break;
          
          case 3 : 
            if(gripperAtFinal.getprestatus() && clampClose.getprestatus() && gripperClose.getprestatus() && !capperRaised.getprestatus()){//sysj\ABScontroller.sysj line: 336, column: 12
              S8013=4;
              S8612=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 350, column: 16
                S8611=0;
                thread31494(tdone,ends);
                thread31495(tdone,ends);
                thread31496(tdone,ends);
                int biggest31497 = 0;
                if(ends[51]>=biggest31497){
                  biggest31497=ends[51];
                }
                if(ends[52]>=biggest31497){
                  biggest31497=ends[52];
                }
                if(ends[53]>=biggest31497){
                  biggest31497=ends[53];
                }
                if(biggest31497 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                S8611=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 353, column: 9
                currsigs.addElement(bottlePos5);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              switch(S8349){
                case 0 : 
                  switch(S8348){
                    case 0 : 
                      thread31498(tdone,ends);
                      thread31499(tdone,ends);
                      thread31500(tdone,ends);
                      thread31501(tdone,ends);
                      thread31502(tdone,ends);
                      int biggest31503 = 0;
                      if(ends[46]>=biggest31503){
                        biggest31503=ends[46];
                      }
                      if(ends[47]>=biggest31503){
                        biggest31503=ends[47];
                      }
                      if(ends[48]>=biggest31503){
                        biggest31503=ends[48];
                      }
                      if(ends[49]>=biggest31503){
                        biggest31503=ends[49];
                      }
                      if(ends[50]>=biggest31503){
                        biggest31503=ends[50];
                      }
                      if(biggest31503 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      //FINXME code
                      if(biggest31503 == 0){
                        S8349=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 341, column: 9
                      currsigs.addElement(bottlePos5);
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S8349=1;
                  S8349=0;
                  if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 338, column: 16
                    S8348=0;
                    thread31504(tdone,ends);
                    thread31505(tdone,ends);
                    thread31506(tdone,ends);
                    thread31507(tdone,ends);
                    thread31508(tdone,ends);
                    int biggest31509 = 0;
                    if(ends[46]>=biggest31509){
                      biggest31509=ends[46];
                    }
                    if(ends[47]>=biggest31509){
                      biggest31509=ends[47];
                    }
                    if(ends[48]>=biggest31509){
                      biggest31509=ends[48];
                    }
                    if(ends[49]>=biggest31509){
                      biggest31509=ends[49];
                    }
                    if(ends[50]>=biggest31509){
                      biggest31509=ends[50];
                    }
                    if(biggest31509 == 1){
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    S8348=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 341, column: 9
                    currsigs.addElement(bottlePos5);
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 4 : 
            if(gripperOpen.getprestatus() && !gripperAtHome.getprestatus() && clampOpen.getprestatus() && !capperRaised.getprestatus()){//sysj\ABScontroller.sysj line: 348, column: 12
              S8013=5;
              S8734=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 362, column: 16
                S8733=0;
                thread31510(tdone,ends);
                thread31511(tdone,ends);
                thread31512(tdone,ends);
                int biggest31513 = 0;
                if(ends[54]>=biggest31513){
                  biggest31513=ends[54];
                }
                if(ends[55]>=biggest31513){
                  biggest31513=ends[55];
                }
                if(ends[56]>=biggest31513){
                  biggest31513=ends[56];
                }
                if(biggest31513 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                S8733=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 365, column: 9
                currsigs.addElement(bottlePos5);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              switch(S8612){
                case 0 : 
                  switch(S8611){
                    case 0 : 
                      thread31514(tdone,ends);
                      thread31515(tdone,ends);
                      thread31516(tdone,ends);
                      int biggest31517 = 0;
                      if(ends[51]>=biggest31517){
                        biggest31517=ends[51];
                      }
                      if(ends[52]>=biggest31517){
                        biggest31517=ends[52];
                      }
                      if(ends[53]>=biggest31517){
                        biggest31517=ends[53];
                      }
                      if(biggest31517 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      //FINXME code
                      if(biggest31517 == 0){
                        S8612=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 353, column: 9
                      currsigs.addElement(bottlePos5);
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S8612=1;
                  S8612=0;
                  if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 350, column: 16
                    S8611=0;
                    thread31518(tdone,ends);
                    thread31519(tdone,ends);
                    thread31520(tdone,ends);
                    int biggest31521 = 0;
                    if(ends[51]>=biggest31521){
                      biggest31521=ends[51];
                    }
                    if(ends[52]>=biggest31521){
                      biggest31521=ends[52];
                    }
                    if(ends[53]>=biggest31521){
                      biggest31521=ends[53];
                    }
                    if(biggest31521 == 1){
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    S8611=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 353, column: 9
                    currsigs.addElement(bottlePos5);
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 5 : 
            if(gripperAtHome.getprestatus() && !gripperAtFinal.getprestatus() && clampOpen.getprestatus() && !capperRaised.getprestatus() && gripperOpen.getprestatus()){//sysj\ABScontroller.sysj line: 360, column: 12
              S8013=6;
              S8851=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 374, column: 16
                S8850=0;
                thread31522(tdone,ends);
                thread31523(tdone,ends);
                int biggest31524 = 0;
                if(ends[57]>=biggest31524){
                  biggest31524=ends[57];
                }
                if(ends[58]>=biggest31524){
                  biggest31524=ends[58];
                }
                if(biggest31524 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                S8850=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 377, column: 9
                currsigs.addElement(bottlePos5);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              switch(S8734){
                case 0 : 
                  switch(S8733){
                    case 0 : 
                      thread31525(tdone,ends);
                      thread31526(tdone,ends);
                      thread31527(tdone,ends);
                      int biggest31528 = 0;
                      if(ends[54]>=biggest31528){
                        biggest31528=ends[54];
                      }
                      if(ends[55]>=biggest31528){
                        biggest31528=ends[55];
                      }
                      if(ends[56]>=biggest31528){
                        biggest31528=ends[56];
                      }
                      if(biggest31528 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      //FINXME code
                      if(biggest31528 == 0){
                        S8734=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 365, column: 9
                      currsigs.addElement(bottlePos5);
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S8734=1;
                  S8734=0;
                  if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 362, column: 16
                    S8733=0;
                    thread31529(tdone,ends);
                    thread31530(tdone,ends);
                    thread31531(tdone,ends);
                    int biggest31532 = 0;
                    if(ends[54]>=biggest31532){
                      biggest31532=ends[54];
                    }
                    if(ends[55]>=biggest31532){
                      biggest31532=ends[55];
                    }
                    if(ends[56]>=biggest31532){
                      biggest31532=ends[56];
                    }
                    if(biggest31532 == 1){
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    S8733=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 365, column: 9
                    currsigs.addElement(bottlePos5);
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 6 : 
            if(capperRaised.getprestatus() && clampOpen.getprestatus() && gripperOpen.getprestatus()){//sysj\ABScontroller.sysj line: 372, column: 12
              bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 382, column: 6
              currsigs.addElement(bottlePos5);
              bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 383, column: 6
              currsigs.addElement(bottlePos5);
              S8013=0;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              switch(S8851){
                case 0 : 
                  switch(S8850){
                    case 0 : 
                      thread31533(tdone,ends);
                      thread31534(tdone,ends);
                      int biggest31535 = 0;
                      if(ends[57]>=biggest31535){
                        biggest31535=ends[57];
                      }
                      if(ends[58]>=biggest31535){
                        biggest31535=ends[58];
                      }
                      if(biggest31535 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      //FINXME code
                      if(biggest31535 == 0){
                        S8851=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 377, column: 9
                      currsigs.addElement(bottlePos5);
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S8851=1;
                  S8851=0;
                  if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 374, column: 16
                    S8850=0;
                    thread31536(tdone,ends);
                    thread31537(tdone,ends);
                    int biggest31538 = 0;
                    if(ends[57]>=biggest31538){
                      biggest31538=ends[57];
                    }
                    if(ends[58]>=biggest31538){
                      biggest31538=ends[58];
                    }
                    if(biggest31538 == 1){
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    S8850=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 377, column: 9
                    currsigs.addElement(bottlePos5);
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31450(int [] tdone, int [] ends){
        switch(S8011){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S8003){
          case 0 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 292, column: 9
              S8003=0;
              auto_35.setPresent();//sysj\ABScontroller.sysj line: 293, column: 7
              currsigs.addElement(auto_35);
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            else {
              S8003=1;
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            break;
          
          case 1 : 
            S8003=1;
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 292, column: 9
              S8003=0;
              auto_35.setPresent();//sysj\ABScontroller.sysj line: 293, column: 7
              currsigs.addElement(auto_35);
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            else {
              S8003=1;
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31447(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 399, column: 59
      currsigs.addElement(turnGripperHome);
      active[64]=0;
      ends[64]=0;
      tdone[64]=1;
    }
    else {
      active[64]=0;
      ends[64]=0;
      tdone[64]=1;
    }
  }

  public void thread31446(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus()){//sysj\ABScontroller.sysj line: 397, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 397, column: 59
      currsigs.addElement(turnGripperFinal);
      active[63]=0;
      ends[63]=0;
      tdone[63]=1;
    }
    else {
      active[63]=0;
      ends[63]=0;
      tdone[63]=1;
    }
  }

  public void thread31445(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus()){//sysj\ABScontroller.sysj line: 395, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 395, column: 40
      currsigs.addElement(lowerCapper);
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
    else {
      active[62]=0;
      ends[62]=0;
      tdone[62]=1;
    }
  }

  public void thread31444(int [] tdone, int [] ends){
        if(gripCapM.getprestatus()){//sysj\ABScontroller.sysj line: 393, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 393, column: 37
      currsigs.addElement(gripCap);
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
    else {
      active[61]=0;
      ends[61]=0;
      tdone[61]=1;
    }
  }

  public void thread31443(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus()){//sysj\ABScontroller.sysj line: 391, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 391, column: 40
      currsigs.addElement(clampBottle);
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
    else {
      active[60]=0;
      ends[60]=0;
      tdone[60]=1;
    }
  }

  public void thread31442(int [] tdone, int [] ends){
        S10817=1;
    S10781=0;
    if(!auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 390, column: 14
      thread31443(tdone,ends);
      thread31444(tdone,ends);
      thread31445(tdone,ends);
      thread31446(tdone,ends);
      thread31447(tdone,ends);
      int biggest31448 = 0;
      if(ends[60]>=biggest31448){
        biggest31448=ends[60];
      }
      if(ends[61]>=biggest31448){
        biggest31448=ends[61];
      }
      if(ends[62]>=biggest31448){
        biggest31448=ends[62];
      }
      if(ends[63]>=biggest31448){
        biggest31448=ends[63];
      }
      if(ends[64]>=biggest31448){
        biggest31448=ends[64];
      }
      //FINXME code
      if(biggest31448 == 0){
        S10781=1;
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
      }
    }
    else {
      S10781=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread31441(int [] tdone, int [] ends){
        S10764=1;
    S8013=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31440(int [] tdone, int [] ends){
        S8011=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 292, column: 9
      S8003=0;
      auto_35.setPresent();//sysj\ABScontroller.sysj line: 293, column: 7
      currsigs.addElement(auto_35);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S8003=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S30554){
        case 0 : 
          S30554=0;
          break RUN;
        
        case 1 : 
          S30554=2;
          S30554=2;
          System.out.println("CapperController");//sysj\ABScontroller.sysj line: 286, column: 2
          if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 288, column: 11
            S10819=0;
            auto_35.setClear();//sysj\ABScontroller.sysj line: 289, column: 4
            S10818=0;
            thread31440(tdone,ends);
            thread31441(tdone,ends);
            thread31442(tdone,ends);
            int biggest31449 = 0;
            if(ends[36]>=biggest31449){
              biggest31449=ends[36];
            }
            if(ends[37]>=biggest31449){
              biggest31449=ends[37];
            }
            if(ends[59]>=biggest31449){
              biggest31449=ends[59];
            }
            if(biggest31449 == 1){
              active[35]=1;
              ends[35]=1;
              break RUN;
            }
          }
          else {
            S10819=1;
            active[35]=1;
            ends[35]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S10819){
            case 0 : 
              auto_35.setClear();//sysj\ABScontroller.sysj line: 289, column: 4
              switch(S10818){
                case 0 : 
                  thread31450(tdone,ends);
                  thread31451(tdone,ends);
                  thread31539(tdone,ends);
                  int biggest31552 = 0;
                  if(ends[36]>=biggest31552){
                    biggest31552=ends[36];
                  }
                  if(ends[37]>=biggest31552){
                    biggest31552=ends[37];
                  }
                  if(ends[59]>=biggest31552){
                    biggest31552=ends[59];
                  }
                  if(biggest31552 == 1){
                    active[35]=1;
                    ends[35]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest31552 == 0){
                    S10818=1;
                    active[35]=1;
                    ends[35]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S10818=1;
                  if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 288, column: 11
                    S10819=0;
                    auto_35.setClear();//sysj\ABScontroller.sysj line: 289, column: 4
                    S10818=0;
                    thread31553(tdone,ends);
                    thread31554(tdone,ends);
                    thread31555(tdone,ends);
                    int biggest31562 = 0;
                    if(ends[36]>=biggest31562){
                      biggest31562=ends[36];
                    }
                    if(ends[37]>=biggest31562){
                      biggest31562=ends[37];
                    }
                    if(ends[59]>=biggest31562){
                      biggest31562=ends[59];
                    }
                    if(biggest31562 == 1){
                      active[35]=1;
                      ends[35]=1;
                      break RUN;
                    }
                  }
                  else {
                    S10819=1;
                    active[35]=1;
                    ends[35]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S10819=1;
              if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 288, column: 11
                S10819=0;
                auto_35.setClear();//sysj\ABScontroller.sysj line: 289, column: 4
                S10818=0;
                thread31563(tdone,ends);
                thread31564(tdone,ends);
                thread31565(tdone,ends);
                int biggest31572 = 0;
                if(ends[36]>=biggest31572){
                  biggest31572=ends[36];
                }
                if(ends[37]>=biggest31572){
                  biggest31572=ends[37];
                }
                if(ends[59]>=biggest31572){
                  biggest31572=ends[59];
                }
                if(biggest31572 == 1){
                  active[35]=1;
                  ends[35]=1;
                  break RUN;
                }
              }
              else {
                S10819=1;
                active[35]=1;
                ends[35]=1;
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
    auto_35 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[35] != 0){
      int index = 35;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[35]!=0 || suspended[35]!=0 || active[35]!=1);
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
      auto_35.setpreclear();
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
      auto_35.setClear();
      if(paused[35]!=0 || suspended[35]!=0 || active[35]!=1);
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
        clampBottleM.gethook();
        gripCapM.gethook();
        lowerCapperM.gethook();
        turnGripperFinalM.gethook();
        turnGripperHomeM.gethook();
      }
      runFinisher();
      if(active[35] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
