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
  private int S30560 = 1;
  private int S10825 = 1;
  private int S10824 = 1;
  private int S8017 = 1;
  private int S8009 = 1;
  private int S10770 = 1;
  private int S8019 = 1;
  private int S8039 = 1;
  private int S8038 = 1;
  private int S8024 = 1;
  private int S8029 = 1;
  private int S8034 = 1;
  private int S8171 = 1;
  private int S8170 = 1;
  private int S8146 = 1;
  private int S8151 = 1;
  private int S8156 = 1;
  private int S8161 = 1;
  private int S8166 = 1;
  private int S8355 = 1;
  private int S8354 = 1;
  private int S8330 = 1;
  private int S8335 = 1;
  private int S8340 = 1;
  private int S8345 = 1;
  private int S8350 = 1;
  private int S8618 = 1;
  private int S8617 = 1;
  private int S8603 = 1;
  private int S8608 = 1;
  private int S8613 = 1;
  private int S8740 = 1;
  private int S8739 = 1;
  private int S8725 = 1;
  private int S8730 = 1;
  private int S8735 = 1;
  private int S8857 = 1;
  private int S8856 = 1;
  private int S8847 = 1;
  private int S8852 = 1;
  private int S10823 = 1;
  private int S10787 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void thread31576(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 407, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 407, column: 73
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

  public void thread31575(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 405, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 405, column: 73
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

  public void thread31574(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 403, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 403, column: 54
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

  public void thread31573(int [] tdone, int [] ends){
        if(gripCapM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 401, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 401, column: 51
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

  public void thread31572(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 399, column: 54
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

  public void thread31571(int [] tdone, int [] ends){
        S10823=1;
    S10787=0;
    if(!auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 398, column: 14
      thread31572(tdone,ends);
      thread31573(tdone,ends);
      thread31574(tdone,ends);
      thread31575(tdone,ends);
      thread31576(tdone,ends);
      int biggest31577 = 0;
      if(ends[60]>=biggest31577){
        biggest31577=ends[60];
      }
      if(ends[61]>=biggest31577){
        biggest31577=ends[61];
      }
      if(ends[62]>=biggest31577){
        biggest31577=ends[62];
      }
      if(ends[63]>=biggest31577){
        biggest31577=ends[63];
      }
      if(ends[64]>=biggest31577){
        biggest31577=ends[64];
      }
      //FINXME code
      if(biggest31577 == 0){
        S10787=1;
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
      }
    }
    else {
      S10787=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread31570(int [] tdone, int [] ends){
        S10770=1;
    S8019=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31569(int [] tdone, int [] ends){
        S8017=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 300, column: 9
      S8009=0;
      auto_35.setPresent();//sysj\ABScontroller.sysj line: 301, column: 7
      currsigs.addElement(auto_35);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S8009=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread31566(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 407, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 407, column: 73
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

  public void thread31565(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 405, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 405, column: 73
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

  public void thread31564(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 403, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 403, column: 54
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

  public void thread31563(int [] tdone, int [] ends){
        if(gripCapM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 401, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 401, column: 51
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

  public void thread31562(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 399, column: 54
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

  public void thread31561(int [] tdone, int [] ends){
        S10823=1;
    S10787=0;
    if(!auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 398, column: 14
      thread31562(tdone,ends);
      thread31563(tdone,ends);
      thread31564(tdone,ends);
      thread31565(tdone,ends);
      thread31566(tdone,ends);
      int biggest31567 = 0;
      if(ends[60]>=biggest31567){
        biggest31567=ends[60];
      }
      if(ends[61]>=biggest31567){
        biggest31567=ends[61];
      }
      if(ends[62]>=biggest31567){
        biggest31567=ends[62];
      }
      if(ends[63]>=biggest31567){
        biggest31567=ends[63];
      }
      if(ends[64]>=biggest31567){
        biggest31567=ends[64];
      }
      //FINXME code
      if(biggest31567 == 0){
        S10787=1;
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
      }
    }
    else {
      S10787=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread31560(int [] tdone, int [] ends){
        S10770=1;
    S8019=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31559(int [] tdone, int [] ends){
        S8017=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 300, column: 9
      S8009=0;
      auto_35.setPresent();//sysj\ABScontroller.sysj line: 301, column: 7
      currsigs.addElement(auto_35);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S8009=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread31556(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 407, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 407, column: 73
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

  public void thread31555(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 405, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 405, column: 73
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

  public void thread31554(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 403, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 403, column: 54
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

  public void thread31553(int [] tdone, int [] ends){
        if(gripCapM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 401, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 401, column: 51
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

  public void thread31552(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 399, column: 54
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

  public void thread31550(int [] tdone, int [] ends){
        active[64]=0;
    ends[64]=0;
    tdone[64]=1;
  }

  public void thread31549(int [] tdone, int [] ends){
        active[63]=0;
    ends[63]=0;
    tdone[63]=1;
  }

  public void thread31548(int [] tdone, int [] ends){
        active[62]=0;
    ends[62]=0;
    tdone[62]=1;
  }

  public void thread31547(int [] tdone, int [] ends){
        active[61]=0;
    ends[61]=0;
    tdone[61]=1;
  }

  public void thread31546(int [] tdone, int [] ends){
        active[60]=0;
    ends[60]=0;
    tdone[60]=1;
  }

  public void thread31545(int [] tdone, int [] ends){
        switch(S10823){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        switch(S10787){
          case 0 : 
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
              S10787=1;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 1 : 
            S10787=1;
            S10787=0;
            if(!auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 398, column: 14
              thread31552(tdone,ends);
              thread31553(tdone,ends);
              thread31554(tdone,ends);
              thread31555(tdone,ends);
              thread31556(tdone,ends);
              int biggest31557 = 0;
              if(ends[60]>=biggest31557){
                biggest31557=ends[60];
              }
              if(ends[61]>=biggest31557){
                biggest31557=ends[61];
              }
              if(ends[62]>=biggest31557){
                biggest31557=ends[62];
              }
              if(ends[63]>=biggest31557){
                biggest31557=ends[63];
              }
              if(ends[64]>=biggest31557){
                biggest31557=ends[64];
              }
              //FINXME code
              if(biggest31557 == 0){
                S10787=1;
                active[59]=1;
                ends[59]=1;
                tdone[59]=1;
              }
            }
            else {
              S10787=1;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31543(int [] tdone, int [] ends){
        S8852=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 383, column: 43
    currsigs.addElement(bottlePos5);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31542(int [] tdone, int [] ends){
        S8847=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 383, column: 11
    currsigs.addElement(turnGripperHome);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread31540(int [] tdone, int [] ends){
        switch(S8852){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 383, column: 43
        currsigs.addElement(bottlePos5);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread31539(int [] tdone, int [] ends){
        switch(S8847){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 383, column: 11
        currsigs.addElement(turnGripperHome);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread31537(int [] tdone, int [] ends){
        S8735=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 371, column: 70
    currsigs.addElement(lowerCapper);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31536(int [] tdone, int [] ends){
        S8730=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 371, column: 43
    currsigs.addElement(bottlePos5);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31535(int [] tdone, int [] ends){
        S8725=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 371, column: 11
    currsigs.addElement(turnGripperHome);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread31533(int [] tdone, int [] ends){
        switch(S8735){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 371, column: 70
        currsigs.addElement(lowerCapper);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread31532(int [] tdone, int [] ends){
        switch(S8730){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 371, column: 43
        currsigs.addElement(bottlePos5);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread31531(int [] tdone, int [] ends){
        switch(S8725){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 371, column: 11
        currsigs.addElement(turnGripperHome);
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
        break;
      
    }
  }

  public void thread31529(int [] tdone, int [] ends){
        S8852=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 383, column: 43
    currsigs.addElement(bottlePos5);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread31528(int [] tdone, int [] ends){
        S8847=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 383, column: 11
    currsigs.addElement(turnGripperHome);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread31526(int [] tdone, int [] ends){
        S8613=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 359, column: 71
    currsigs.addElement(lowerCapper);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread31525(int [] tdone, int [] ends){
        S8608=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 359, column: 44
    currsigs.addElement(bottlePos5);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread31524(int [] tdone, int [] ends){
        S8603=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 359, column: 11
    currsigs.addElement(turnGripperFinal);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread31522(int [] tdone, int [] ends){
        switch(S8613){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 359, column: 71
        currsigs.addElement(lowerCapper);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread31521(int [] tdone, int [] ends){
        switch(S8608){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 359, column: 44
        currsigs.addElement(bottlePos5);
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
        break;
      
    }
  }

  public void thread31520(int [] tdone, int [] ends){
        switch(S8603){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 359, column: 11
        currsigs.addElement(turnGripperFinal);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread31518(int [] tdone, int [] ends){
        S8735=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 371, column: 70
    currsigs.addElement(lowerCapper);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread31517(int [] tdone, int [] ends){
        S8730=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 371, column: 43
    currsigs.addElement(bottlePos5);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread31516(int [] tdone, int [] ends){
        S8725=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 371, column: 11
    currsigs.addElement(turnGripperHome);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread31514(int [] tdone, int [] ends){
        S8350=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 347, column: 123
    currsigs.addElement(lowerCapper);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread31513(int [] tdone, int [] ends){
        S8345=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 347, column: 95
    currsigs.addElement(clampBottle);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread31512(int [] tdone, int [] ends){
        S8340=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 347, column: 68
    currsigs.addElement(bottlePos5);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread31511(int [] tdone, int [] ends){
        S8335=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 347, column: 44
    currsigs.addElement(gripCap);
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31510(int [] tdone, int [] ends){
        S8330=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 347, column: 11
    currsigs.addElement(turnGripperFinal);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread31508(int [] tdone, int [] ends){
        switch(S8350){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 347, column: 123
        currsigs.addElement(lowerCapper);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread31507(int [] tdone, int [] ends){
        switch(S8345){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        clampBottle.setPresent();//sysj\ABScontroller.sysj line: 347, column: 95
        currsigs.addElement(clampBottle);
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
        break;
      
    }
  }

  public void thread31506(int [] tdone, int [] ends){
        switch(S8340){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 347, column: 68
        currsigs.addElement(bottlePos5);
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
        break;
      
    }
  }

  public void thread31505(int [] tdone, int [] ends){
        switch(S8335){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        gripCap.setPresent();//sysj\ABScontroller.sysj line: 347, column: 44
        currsigs.addElement(gripCap);
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
        break;
      
    }
  }

  public void thread31504(int [] tdone, int [] ends){
        switch(S8330){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 347, column: 11
        currsigs.addElement(turnGripperFinal);
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
        break;
      
    }
  }

  public void thread31502(int [] tdone, int [] ends){
        S8613=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 359, column: 71
    currsigs.addElement(lowerCapper);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread31501(int [] tdone, int [] ends){
        S8608=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 359, column: 44
    currsigs.addElement(bottlePos5);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread31500(int [] tdone, int [] ends){
        S8603=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 359, column: 11
    currsigs.addElement(turnGripperFinal);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread31498(int [] tdone, int [] ends){
        S8166=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 334, column: 127
    currsigs.addElement(gripCap);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31497(int [] tdone, int [] ends){
        S8161=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 334, column: 99
    currsigs.addElement(clampBottle);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31496(int [] tdone, int [] ends){
        S8156=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 334, column: 72
    currsigs.addElement(bottlePos5);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread31495(int [] tdone, int [] ends){
        S8151=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 334, column: 44
    currsigs.addElement(lowerCapper);
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread31494(int [] tdone, int [] ends){
        S8146=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 334, column: 12
    currsigs.addElement(turnGripperHome);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread31492(int [] tdone, int [] ends){
        switch(S8166){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        gripCap.setPresent();//sysj\ABScontroller.sysj line: 334, column: 127
        currsigs.addElement(gripCap);
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
        break;
      
    }
  }

  public void thread31491(int [] tdone, int [] ends){
        switch(S8161){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        clampBottle.setPresent();//sysj\ABScontroller.sysj line: 334, column: 99
        currsigs.addElement(clampBottle);
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
        break;
      
    }
  }

  public void thread31490(int [] tdone, int [] ends){
        switch(S8156){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 334, column: 72
        currsigs.addElement(bottlePos5);
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
        break;
      
    }
  }

  public void thread31489(int [] tdone, int [] ends){
        switch(S8151){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 334, column: 44
        currsigs.addElement(lowerCapper);
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
        break;
      
    }
  }

  public void thread31488(int [] tdone, int [] ends){
        switch(S8146){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 334, column: 12
        currsigs.addElement(turnGripperHome);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
        break;
      
    }
  }

  public void thread31486(int [] tdone, int [] ends){
        S8350=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 347, column: 123
    currsigs.addElement(lowerCapper);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread31485(int [] tdone, int [] ends){
        S8345=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 347, column: 95
    currsigs.addElement(clampBottle);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread31484(int [] tdone, int [] ends){
        S8340=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 347, column: 68
    currsigs.addElement(bottlePos5);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread31483(int [] tdone, int [] ends){
        S8335=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 347, column: 44
    currsigs.addElement(gripCap);
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31482(int [] tdone, int [] ends){
        S8330=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 347, column: 11
    currsigs.addElement(turnGripperFinal);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread31480(int [] tdone, int [] ends){
        S8350=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 347, column: 123
    currsigs.addElement(lowerCapper);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread31479(int [] tdone, int [] ends){
        S8345=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 347, column: 95
    currsigs.addElement(clampBottle);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread31478(int [] tdone, int [] ends){
        S8340=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 347, column: 68
    currsigs.addElement(bottlePos5);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread31477(int [] tdone, int [] ends){
        S8335=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 347, column: 44
    currsigs.addElement(gripCap);
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread31476(int [] tdone, int [] ends){
        S8330=1;
    turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 347, column: 11
    currsigs.addElement(turnGripperFinal);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread31474(int [] tdone, int [] ends){
        S8034=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 321, column: 71
    currsigs.addElement(bottlePos5);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread31473(int [] tdone, int [] ends){
        S8029=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 321, column: 43
    currsigs.addElement(lowerCapper);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31472(int [] tdone, int [] ends){
        S8024=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 321, column: 11
    currsigs.addElement(turnGripperHome);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31470(int [] tdone, int [] ends){
        switch(S8034){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 321, column: 71
        currsigs.addElement(bottlePos5);
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
        break;
      
    }
  }

  public void thread31469(int [] tdone, int [] ends){
        switch(S8029){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 321, column: 43
        currsigs.addElement(lowerCapper);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
        break;
      
    }
  }

  public void thread31468(int [] tdone, int [] ends){
        switch(S8024){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 321, column: 11
        currsigs.addElement(turnGripperHome);
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
        break;
      
    }
  }

  public void thread31466(int [] tdone, int [] ends){
        S8166=1;
    gripCap.setPresent();//sysj\ABScontroller.sysj line: 334, column: 127
    currsigs.addElement(gripCap);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31465(int [] tdone, int [] ends){
        S8161=1;
    clampBottle.setPresent();//sysj\ABScontroller.sysj line: 334, column: 99
    currsigs.addElement(clampBottle);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31464(int [] tdone, int [] ends){
        S8156=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 334, column: 72
    currsigs.addElement(bottlePos5);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread31463(int [] tdone, int [] ends){
        S8151=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 334, column: 44
    currsigs.addElement(lowerCapper);
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread31462(int [] tdone, int [] ends){
        S8146=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 334, column: 12
    currsigs.addElement(turnGripperHome);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread31460(int [] tdone, int [] ends){
        S8034=1;
    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 321, column: 71
    currsigs.addElement(bottlePos5);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread31459(int [] tdone, int [] ends){
        S8029=1;
    lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 321, column: 43
    currsigs.addElement(lowerCapper);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31458(int [] tdone, int [] ends){
        S8024=1;
    turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 321, column: 11
    currsigs.addElement(turnGripperHome);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31457(int [] tdone, int [] ends){
        switch(S10770){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S8019){
          case 0 : 
            if(bottleReady.getprestatus() && capperRaised.getprestatus() && gripperAtHome.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 312, column: 12
              System.out.println("bottleReady");//sysj\ABScontroller.sysj line: 315, column: 6
              S8019=1;
              S8039=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 320, column: 16
                S8038=0;
                thread31458(tdone,ends);
                thread31459(tdone,ends);
                thread31460(tdone,ends);
                int biggest31461 = 0;
                if(ends[38]>=biggest31461){
                  biggest31461=ends[38];
                }
                if(ends[39]>=biggest31461){
                  biggest31461=ends[39];
                }
                if(ends[40]>=biggest31461){
                  biggest31461=ends[40];
                }
                if(biggest31461 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                S8038=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 323, column: 9
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
            if(capperLowered.getprestatus() && clampOpen.getprestatus() && gripperOpen.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 318, column: 12
              S8019=2;
              S8171=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 333, column: 17
                S8170=0;
                thread31462(tdone,ends);
                thread31463(tdone,ends);
                thread31464(tdone,ends);
                thread31465(tdone,ends);
                thread31466(tdone,ends);
                int biggest31467 = 0;
                if(ends[41]>=biggest31467){
                  biggest31467=ends[41];
                }
                if(ends[42]>=biggest31467){
                  biggest31467=ends[42];
                }
                if(ends[43]>=biggest31467){
                  biggest31467=ends[43];
                }
                if(ends[44]>=biggest31467){
                  biggest31467=ends[44];
                }
                if(ends[45]>=biggest31467){
                  biggest31467=ends[45];
                }
                if(biggest31467 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                S8170=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 336, column: 10
                currsigs.addElement(bottlePos5);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              switch(S8039){
                case 0 : 
                  switch(S8038){
                    case 0 : 
                      thread31468(tdone,ends);
                      thread31469(tdone,ends);
                      thread31470(tdone,ends);
                      int biggest31471 = 0;
                      if(ends[38]>=biggest31471){
                        biggest31471=ends[38];
                      }
                      if(ends[39]>=biggest31471){
                        biggest31471=ends[39];
                      }
                      if(ends[40]>=biggest31471){
                        biggest31471=ends[40];
                      }
                      if(biggest31471 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      //FINXME code
                      if(biggest31471 == 0){
                        S8039=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 323, column: 9
                      currsigs.addElement(bottlePos5);
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S8039=1;
                  S8039=0;
                  if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 320, column: 16
                    S8038=0;
                    thread31472(tdone,ends);
                    thread31473(tdone,ends);
                    thread31474(tdone,ends);
                    int biggest31475 = 0;
                    if(ends[38]>=biggest31475){
                      biggest31475=ends[38];
                    }
                    if(ends[39]>=biggest31475){
                      biggest31475=ends[39];
                    }
                    if(ends[40]>=biggest31475){
                      biggest31475=ends[40];
                    }
                    if(biggest31475 == 1){
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    S8038=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 323, column: 9
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
            if(capperLowered.getprestatus() && clampClose.getprestatus() && !gripperAtFinal.getprestatus() && gripperClose.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 330, column: 12
              S8019=3;
              S8355=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 346, column: 16
                S8354=0;
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
                S8354=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 349, column: 9
                currsigs.addElement(bottlePos5);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              if(clampClose.getprestatus() && !gripperAtFinal.getprestatus() && gripperClose.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 331, column: 13
                S8019=3;
                S8355=0;
                if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 346, column: 16
                  S8354=0;
                  thread31482(tdone,ends);
                  thread31483(tdone,ends);
                  thread31484(tdone,ends);
                  thread31485(tdone,ends);
                  thread31486(tdone,ends);
                  int biggest31487 = 0;
                  if(ends[46]>=biggest31487){
                    biggest31487=ends[46];
                  }
                  if(ends[47]>=biggest31487){
                    biggest31487=ends[47];
                  }
                  if(ends[48]>=biggest31487){
                    biggest31487=ends[48];
                  }
                  if(ends[49]>=biggest31487){
                    biggest31487=ends[49];
                  }
                  if(ends[50]>=biggest31487){
                    biggest31487=ends[50];
                  }
                  if(biggest31487 == 1){
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                else {
                  S8354=1;
                  bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 349, column: 9
                  currsigs.addElement(bottlePos5);
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                switch(S8171){
                  case 0 : 
                    switch(S8170){
                      case 0 : 
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
                        //FINXME code
                        if(biggest31493 == 0){
                          S8171=1;
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                        break;
                      
                      case 1 : 
                        bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 336, column: 10
                        currsigs.addElement(bottlePos5);
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    S8171=1;
                    S8171=0;
                    if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 333, column: 17
                      S8170=0;
                      thread31494(tdone,ends);
                      thread31495(tdone,ends);
                      thread31496(tdone,ends);
                      thread31497(tdone,ends);
                      thread31498(tdone,ends);
                      int biggest31499 = 0;
                      if(ends[41]>=biggest31499){
                        biggest31499=ends[41];
                      }
                      if(ends[42]>=biggest31499){
                        biggest31499=ends[42];
                      }
                      if(ends[43]>=biggest31499){
                        biggest31499=ends[43];
                      }
                      if(ends[44]>=biggest31499){
                        biggest31499=ends[44];
                      }
                      if(ends[45]>=biggest31499){
                        biggest31499=ends[45];
                      }
                      if(biggest31499 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                    }
                    else {
                      S8170=1;
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 336, column: 10
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
            if(gripperAtFinal.getprestatus() && clampClose.getprestatus() && gripperClose.getprestatus() && !capperRaised.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 344, column: 12
              S8019=4;
              S8618=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 358, column: 16
                S8617=0;
                thread31500(tdone,ends);
                thread31501(tdone,ends);
                thread31502(tdone,ends);
                int biggest31503 = 0;
                if(ends[51]>=biggest31503){
                  biggest31503=ends[51];
                }
                if(ends[52]>=biggest31503){
                  biggest31503=ends[52];
                }
                if(ends[53]>=biggest31503){
                  biggest31503=ends[53];
                }
                if(biggest31503 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                S8617=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 361, column: 9
                currsigs.addElement(bottlePos5);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              switch(S8355){
                case 0 : 
                  switch(S8354){
                    case 0 : 
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
                      //FINXME code
                      if(biggest31509 == 0){
                        S8355=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 349, column: 9
                      currsigs.addElement(bottlePos5);
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S8355=1;
                  S8355=0;
                  if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 346, column: 16
                    S8354=0;
                    thread31510(tdone,ends);
                    thread31511(tdone,ends);
                    thread31512(tdone,ends);
                    thread31513(tdone,ends);
                    thread31514(tdone,ends);
                    int biggest31515 = 0;
                    if(ends[46]>=biggest31515){
                      biggest31515=ends[46];
                    }
                    if(ends[47]>=biggest31515){
                      biggest31515=ends[47];
                    }
                    if(ends[48]>=biggest31515){
                      biggest31515=ends[48];
                    }
                    if(ends[49]>=biggest31515){
                      biggest31515=ends[49];
                    }
                    if(ends[50]>=biggest31515){
                      biggest31515=ends[50];
                    }
                    if(biggest31515 == 1){
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    S8354=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 349, column: 9
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
            if(gripperOpen.getprestatus() && !gripperAtHome.getprestatus() && clampOpen.getprestatus() && !capperRaised.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 356, column: 12
              S8019=5;
              S8740=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 370, column: 16
                S8739=0;
                thread31516(tdone,ends);
                thread31517(tdone,ends);
                thread31518(tdone,ends);
                int biggest31519 = 0;
                if(ends[54]>=biggest31519){
                  biggest31519=ends[54];
                }
                if(ends[55]>=biggest31519){
                  biggest31519=ends[55];
                }
                if(ends[56]>=biggest31519){
                  biggest31519=ends[56];
                }
                if(biggest31519 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                S8739=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 373, column: 9
                currsigs.addElement(bottlePos5);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              switch(S8618){
                case 0 : 
                  switch(S8617){
                    case 0 : 
                      thread31520(tdone,ends);
                      thread31521(tdone,ends);
                      thread31522(tdone,ends);
                      int biggest31523 = 0;
                      if(ends[51]>=biggest31523){
                        biggest31523=ends[51];
                      }
                      if(ends[52]>=biggest31523){
                        biggest31523=ends[52];
                      }
                      if(ends[53]>=biggest31523){
                        biggest31523=ends[53];
                      }
                      if(biggest31523 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      //FINXME code
                      if(biggest31523 == 0){
                        S8618=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 361, column: 9
                      currsigs.addElement(bottlePos5);
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S8618=1;
                  S8618=0;
                  if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 358, column: 16
                    S8617=0;
                    thread31524(tdone,ends);
                    thread31525(tdone,ends);
                    thread31526(tdone,ends);
                    int biggest31527 = 0;
                    if(ends[51]>=biggest31527){
                      biggest31527=ends[51];
                    }
                    if(ends[52]>=biggest31527){
                      biggest31527=ends[52];
                    }
                    if(ends[53]>=biggest31527){
                      biggest31527=ends[53];
                    }
                    if(biggest31527 == 1){
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    S8617=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 361, column: 9
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
            if(gripperAtHome.getprestatus() && !gripperAtFinal.getprestatus() && clampOpen.getprestatus() && !capperRaised.getprestatus() && gripperOpen.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 368, column: 12
              S8019=6;
              S8857=0;
              if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 382, column: 16
                S8856=0;
                thread31528(tdone,ends);
                thread31529(tdone,ends);
                int biggest31530 = 0;
                if(ends[57]>=biggest31530){
                  biggest31530=ends[57];
                }
                if(ends[58]>=biggest31530){
                  biggest31530=ends[58];
                }
                if(biggest31530 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
              else {
                S8856=1;
                bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 385, column: 9
                currsigs.addElement(bottlePos5);
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              switch(S8740){
                case 0 : 
                  switch(S8739){
                    case 0 : 
                      thread31531(tdone,ends);
                      thread31532(tdone,ends);
                      thread31533(tdone,ends);
                      int biggest31534 = 0;
                      if(ends[54]>=biggest31534){
                        biggest31534=ends[54];
                      }
                      if(ends[55]>=biggest31534){
                        biggest31534=ends[55];
                      }
                      if(ends[56]>=biggest31534){
                        biggest31534=ends[56];
                      }
                      if(biggest31534 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      //FINXME code
                      if(biggest31534 == 0){
                        S8740=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 373, column: 9
                      currsigs.addElement(bottlePos5);
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S8740=1;
                  S8740=0;
                  if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 370, column: 16
                    S8739=0;
                    thread31535(tdone,ends);
                    thread31536(tdone,ends);
                    thread31537(tdone,ends);
                    int biggest31538 = 0;
                    if(ends[54]>=biggest31538){
                      biggest31538=ends[54];
                    }
                    if(ends[55]>=biggest31538){
                      biggest31538=ends[55];
                    }
                    if(ends[56]>=biggest31538){
                      biggest31538=ends[56];
                    }
                    if(biggest31538 == 1){
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    S8739=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 373, column: 9
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
            if(capperRaised.getprestatus() && clampOpen.getprestatus() && gripperOpen.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 380, column: 12
              bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 390, column: 6
              currsigs.addElement(bottlePos5);
              bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 391, column: 6
              currsigs.addElement(bottlePos5);
              S8019=0;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            else {
              switch(S8857){
                case 0 : 
                  switch(S8856){
                    case 0 : 
                      thread31539(tdone,ends);
                      thread31540(tdone,ends);
                      int biggest31541 = 0;
                      if(ends[57]>=biggest31541){
                        biggest31541=ends[57];
                      }
                      if(ends[58]>=biggest31541){
                        biggest31541=ends[58];
                      }
                      if(biggest31541 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      //FINXME code
                      if(biggest31541 == 0){
                        S8857=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 385, column: 9
                      currsigs.addElement(bottlePos5);
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S8857=1;
                  S8857=0;
                  if(auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 382, column: 16
                    S8856=0;
                    thread31542(tdone,ends);
                    thread31543(tdone,ends);
                    int biggest31544 = 0;
                    if(ends[57]>=biggest31544){
                      biggest31544=ends[57];
                    }
                    if(ends[58]>=biggest31544){
                      biggest31544=ends[58];
                    }
                    if(biggest31544 == 1){
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    S8856=1;
                    bottlePos5.setPresent();//sysj\ABScontroller.sysj line: 385, column: 9
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

  public void thread31456(int [] tdone, int [] ends){
        switch(S8017){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S8009){
          case 0 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 300, column: 9
              S8009=0;
              auto_35.setPresent();//sysj\ABScontroller.sysj line: 301, column: 7
              currsigs.addElement(auto_35);
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            else {
              S8009=1;
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            break;
          
          case 1 : 
            S8009=1;
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 300, column: 9
              S8009=0;
              auto_35.setPresent();//sysj\ABScontroller.sysj line: 301, column: 7
              currsigs.addElement(auto_35);
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            else {
              S8009=1;
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31453(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 407, column: 16
      turnGripperHome.setPresent();//sysj\ABScontroller.sysj line: 407, column: 73
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

  public void thread31452(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 405, column: 16
      turnGripperFinal.setPresent();//sysj\ABScontroller.sysj line: 405, column: 73
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

  public void thread31451(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 403, column: 16
      lowerCapper.setPresent();//sysj\ABScontroller.sysj line: 403, column: 54
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

  public void thread31450(int [] tdone, int [] ends){
        if(gripCapM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 401, column: 16
      gripCap.setPresent();//sysj\ABScontroller.sysj line: 401, column: 51
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

  public void thread31449(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus() && !emergency.getprestatus()){//sysj\ABScontroller.sysj line: 399, column: 16
      clampBottle.setPresent();//sysj\ABScontroller.sysj line: 399, column: 54
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

  public void thread31448(int [] tdone, int [] ends){
        S10823=1;
    S10787=0;
    if(!auto_35.getprestatus()){//sysj\ABScontroller.sysj line: 398, column: 14
      thread31449(tdone,ends);
      thread31450(tdone,ends);
      thread31451(tdone,ends);
      thread31452(tdone,ends);
      thread31453(tdone,ends);
      int biggest31454 = 0;
      if(ends[60]>=biggest31454){
        biggest31454=ends[60];
      }
      if(ends[61]>=biggest31454){
        biggest31454=ends[61];
      }
      if(ends[62]>=biggest31454){
        biggest31454=ends[62];
      }
      if(ends[63]>=biggest31454){
        biggest31454=ends[63];
      }
      if(ends[64]>=biggest31454){
        biggest31454=ends[64];
      }
      //FINXME code
      if(biggest31454 == 0){
        S10787=1;
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
      }
    }
    else {
      S10787=1;
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread31447(int [] tdone, int [] ends){
        S10770=1;
    S8019=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31446(int [] tdone, int [] ends){
        S8017=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\ABScontroller.sysj line: 300, column: 9
      S8009=0;
      auto_35.setPresent();//sysj\ABScontroller.sysj line: 301, column: 7
      currsigs.addElement(auto_35);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S8009=1;
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
      switch(S30560){
        case 0 : 
          S30560=0;
          break RUN;
        
        case 1 : 
          S30560=2;
          S30560=2;
          System.out.println("CapperController");//sysj\ABScontroller.sysj line: 294, column: 2
          if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 296, column: 11
            S10825=0;
            auto_35.setClear();//sysj\ABScontroller.sysj line: 297, column: 4
            S10824=0;
            thread31446(tdone,ends);
            thread31447(tdone,ends);
            thread31448(tdone,ends);
            int biggest31455 = 0;
            if(ends[36]>=biggest31455){
              biggest31455=ends[36];
            }
            if(ends[37]>=biggest31455){
              biggest31455=ends[37];
            }
            if(ends[59]>=biggest31455){
              biggest31455=ends[59];
            }
            if(biggest31455 == 1){
              active[35]=1;
              ends[35]=1;
              break RUN;
            }
          }
          else {
            S10825=1;
            active[35]=1;
            ends[35]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S10825){
            case 0 : 
              auto_35.setClear();//sysj\ABScontroller.sysj line: 297, column: 4
              switch(S10824){
                case 0 : 
                  thread31456(tdone,ends);
                  thread31457(tdone,ends);
                  thread31545(tdone,ends);
                  int biggest31558 = 0;
                  if(ends[36]>=biggest31558){
                    biggest31558=ends[36];
                  }
                  if(ends[37]>=biggest31558){
                    biggest31558=ends[37];
                  }
                  if(ends[59]>=biggest31558){
                    biggest31558=ends[59];
                  }
                  if(biggest31558 == 1){
                    active[35]=1;
                    ends[35]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest31558 == 0){
                    S10824=1;
                    active[35]=1;
                    ends[35]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S10824=1;
                  if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 296, column: 11
                    S10825=0;
                    auto_35.setClear();//sysj\ABScontroller.sysj line: 297, column: 4
                    S10824=0;
                    thread31559(tdone,ends);
                    thread31560(tdone,ends);
                    thread31561(tdone,ends);
                    int biggest31568 = 0;
                    if(ends[36]>=biggest31568){
                      biggest31568=ends[36];
                    }
                    if(ends[37]>=biggest31568){
                      biggest31568=ends[37];
                    }
                    if(ends[59]>=biggest31568){
                      biggest31568=ends[59];
                    }
                    if(biggest31568 == 1){
                      active[35]=1;
                      ends[35]=1;
                      break RUN;
                    }
                  }
                  else {
                    S10825=1;
                    active[35]=1;
                    ends[35]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S10825=1;
              if(mode.getprestatus()){//sysj\ABScontroller.sysj line: 296, column: 11
                S10825=0;
                auto_35.setClear();//sysj\ABScontroller.sysj line: 297, column: 4
                S10824=0;
                thread31569(tdone,ends);
                thread31570(tdone,ends);
                thread31571(tdone,ends);
                int biggest31578 = 0;
                if(ends[36]>=biggest31578){
                  biggest31578=ends[36];
                }
                if(ends[37]>=biggest31578){
                  biggest31578=ends[37];
                }
                if(ends[59]>=biggest31578){
                  biggest31578=ends[59];
                }
                if(biggest31578 == 1){
                  active[35]=1;
                  ends[35]=1;
                  break RUN;
                }
              }
              else {
                S10825=1;
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
