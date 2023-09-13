import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\controller.sysj line: 1, column: 1

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleReady = new Signal("bottleReady", Signal.INPUT);
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
  private Signal auto_1;
  private int S11277 = 1;
  private int S2818 = 1;
  private int S2817 = 1;
  private int S10 = 1;
  private int S2 = 1;
  private int S2763 = 1;
  private int S134 = 1;
  private int S31 = 1;
  private int S30 = 1;
  private int S16 = 1;
  private int S21 = 1;
  private int S26 = 1;
  private int S164 = 1;
  private int S163 = 1;
  private int S139 = 1;
  private int S144 = 1;
  private int S149 = 1;
  private int S154 = 1;
  private int S159 = 1;
  private int S348 = 1;
  private int S347 = 1;
  private int S323 = 1;
  private int S328 = 1;
  private int S333 = 1;
  private int S338 = 1;
  private int S343 = 1;
  private int S611 = 1;
  private int S610 = 1;
  private int S596 = 1;
  private int S601 = 1;
  private int S606 = 1;
  private int S733 = 1;
  private int S732 = 1;
  private int S718 = 1;
  private int S723 = 1;
  private int S728 = 1;
  private int S850 = 1;
  private int S849 = 1;
  private int S840 = 1;
  private int S845 = 1;
  private int S2816 = 1;
  private int S2780 = 1;
  
  private int[] ends = new int[31];
  private int[] tdone = new int[31];
  
  public void thread11409(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus()){//sysj\controller.sysj line: 122, column: 16
      turnGripperHome.setPresent();//sysj\controller.sysj line: 122, column: 59
      currsigs.addElement(turnGripperHome);
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
    else {
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread11408(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus()){//sysj\controller.sysj line: 120, column: 16
      turnGripperFinal.setPresent();//sysj\controller.sysj line: 120, column: 59
      currsigs.addElement(turnGripperFinal);
      active[29]=0;
      ends[29]=0;
      tdone[29]=1;
    }
    else {
      active[29]=0;
      ends[29]=0;
      tdone[29]=1;
    }
  }

  public void thread11407(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus()){//sysj\controller.sysj line: 118, column: 16
      lowerCapper.setPresent();//sysj\controller.sysj line: 118, column: 40
      currsigs.addElement(lowerCapper);
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
    else {
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread11406(int [] tdone, int [] ends){
        if(gripCapM.getprestatus()){//sysj\controller.sysj line: 116, column: 16
      gripCap.setPresent();//sysj\controller.sysj line: 116, column: 37
      currsigs.addElement(gripCap);
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
    else {
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread11405(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus()){//sysj\controller.sysj line: 114, column: 16
      clampBottle.setPresent();//sysj\controller.sysj line: 114, column: 40
      currsigs.addElement(clampBottle);
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
    else {
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread11404(int [] tdone, int [] ends){
        S2816=1;
    S2780=0;
    if(!auto_1.getprestatus()){//sysj\controller.sysj line: 113, column: 14
      thread11405(tdone,ends);
      thread11406(tdone,ends);
      thread11407(tdone,ends);
      thread11408(tdone,ends);
      thread11409(tdone,ends);
      int biggest11410 = 0;
      if(ends[26]>=biggest11410){
        biggest11410=ends[26];
      }
      if(ends[27]>=biggest11410){
        biggest11410=ends[27];
      }
      if(ends[28]>=biggest11410){
        biggest11410=ends[28];
      }
      if(ends[29]>=biggest11410){
        biggest11410=ends[29];
      }
      if(ends[30]>=biggest11410){
        biggest11410=ends[30];
      }
      //FINXME code
      if(biggest11410 == 0){
        S2780=1;
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
    else {
      S2780=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread11403(int [] tdone, int [] ends){
        S2763=1;
    S134=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread11402(int [] tdone, int [] ends){
        S10=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 17, column: 9
      S2=0;
      auto_1.setPresent();//sysj\controller.sysj line: 18, column: 7
      currsigs.addElement(auto_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread11399(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus()){//sysj\controller.sysj line: 122, column: 16
      turnGripperHome.setPresent();//sysj\controller.sysj line: 122, column: 59
      currsigs.addElement(turnGripperHome);
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
    else {
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread11398(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus()){//sysj\controller.sysj line: 120, column: 16
      turnGripperFinal.setPresent();//sysj\controller.sysj line: 120, column: 59
      currsigs.addElement(turnGripperFinal);
      active[29]=0;
      ends[29]=0;
      tdone[29]=1;
    }
    else {
      active[29]=0;
      ends[29]=0;
      tdone[29]=1;
    }
  }

  public void thread11397(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus()){//sysj\controller.sysj line: 118, column: 16
      lowerCapper.setPresent();//sysj\controller.sysj line: 118, column: 40
      currsigs.addElement(lowerCapper);
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
    else {
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread11396(int [] tdone, int [] ends){
        if(gripCapM.getprestatus()){//sysj\controller.sysj line: 116, column: 16
      gripCap.setPresent();//sysj\controller.sysj line: 116, column: 37
      currsigs.addElement(gripCap);
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
    else {
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread11395(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus()){//sysj\controller.sysj line: 114, column: 16
      clampBottle.setPresent();//sysj\controller.sysj line: 114, column: 40
      currsigs.addElement(clampBottle);
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
    else {
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread11394(int [] tdone, int [] ends){
        S2816=1;
    S2780=0;
    if(!auto_1.getprestatus()){//sysj\controller.sysj line: 113, column: 14
      thread11395(tdone,ends);
      thread11396(tdone,ends);
      thread11397(tdone,ends);
      thread11398(tdone,ends);
      thread11399(tdone,ends);
      int biggest11400 = 0;
      if(ends[26]>=biggest11400){
        biggest11400=ends[26];
      }
      if(ends[27]>=biggest11400){
        biggest11400=ends[27];
      }
      if(ends[28]>=biggest11400){
        biggest11400=ends[28];
      }
      if(ends[29]>=biggest11400){
        biggest11400=ends[29];
      }
      if(ends[30]>=biggest11400){
        biggest11400=ends[30];
      }
      //FINXME code
      if(biggest11400 == 0){
        S2780=1;
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
    else {
      S2780=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread11393(int [] tdone, int [] ends){
        S2763=1;
    S134=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread11392(int [] tdone, int [] ends){
        S10=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 17, column: 9
      S2=0;
      auto_1.setPresent();//sysj\controller.sysj line: 18, column: 7
      currsigs.addElement(auto_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread11389(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus()){//sysj\controller.sysj line: 122, column: 16
      turnGripperHome.setPresent();//sysj\controller.sysj line: 122, column: 59
      currsigs.addElement(turnGripperHome);
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
    else {
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread11388(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus()){//sysj\controller.sysj line: 120, column: 16
      turnGripperFinal.setPresent();//sysj\controller.sysj line: 120, column: 59
      currsigs.addElement(turnGripperFinal);
      active[29]=0;
      ends[29]=0;
      tdone[29]=1;
    }
    else {
      active[29]=0;
      ends[29]=0;
      tdone[29]=1;
    }
  }

  public void thread11387(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus()){//sysj\controller.sysj line: 118, column: 16
      lowerCapper.setPresent();//sysj\controller.sysj line: 118, column: 40
      currsigs.addElement(lowerCapper);
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
    else {
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread11386(int [] tdone, int [] ends){
        if(gripCapM.getprestatus()){//sysj\controller.sysj line: 116, column: 16
      gripCap.setPresent();//sysj\controller.sysj line: 116, column: 37
      currsigs.addElement(gripCap);
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
    else {
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread11385(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus()){//sysj\controller.sysj line: 114, column: 16
      clampBottle.setPresent();//sysj\controller.sysj line: 114, column: 40
      currsigs.addElement(clampBottle);
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
    else {
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread11383(int [] tdone, int [] ends){
        active[30]=0;
    ends[30]=0;
    tdone[30]=1;
  }

  public void thread11382(int [] tdone, int [] ends){
        active[29]=0;
    ends[29]=0;
    tdone[29]=1;
  }

  public void thread11381(int [] tdone, int [] ends){
        active[28]=0;
    ends[28]=0;
    tdone[28]=1;
  }

  public void thread11380(int [] tdone, int [] ends){
        active[27]=0;
    ends[27]=0;
    tdone[27]=1;
  }

  public void thread11379(int [] tdone, int [] ends){
        active[26]=0;
    ends[26]=0;
    tdone[26]=1;
  }

  public void thread11378(int [] tdone, int [] ends){
        switch(S2816){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S2780){
          case 0 : 
            thread11379(tdone,ends);
            thread11380(tdone,ends);
            thread11381(tdone,ends);
            thread11382(tdone,ends);
            thread11383(tdone,ends);
            int biggest11384 = 0;
            if(ends[26]>=biggest11384){
              biggest11384=ends[26];
            }
            if(ends[27]>=biggest11384){
              biggest11384=ends[27];
            }
            if(ends[28]>=biggest11384){
              biggest11384=ends[28];
            }
            if(ends[29]>=biggest11384){
              biggest11384=ends[29];
            }
            if(ends[30]>=biggest11384){
              biggest11384=ends[30];
            }
            //FINXME code
            if(biggest11384 == 0){
              S2780=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 1 : 
            S2780=1;
            S2780=0;
            if(!auto_1.getprestatus()){//sysj\controller.sysj line: 113, column: 14
              thread11385(tdone,ends);
              thread11386(tdone,ends);
              thread11387(tdone,ends);
              thread11388(tdone,ends);
              thread11389(tdone,ends);
              int biggest11390 = 0;
              if(ends[26]>=biggest11390){
                biggest11390=ends[26];
              }
              if(ends[27]>=biggest11390){
                biggest11390=ends[27];
              }
              if(ends[28]>=biggest11390){
                biggest11390=ends[28];
              }
              if(ends[29]>=biggest11390){
                biggest11390=ends[29];
              }
              if(ends[30]>=biggest11390){
                biggest11390=ends[30];
              }
              //FINXME code
              if(biggest11390 == 0){
                S2780=1;
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
            }
            else {
              S2780=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11376(int [] tdone, int [] ends){
        S845=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 99, column: 43
    currsigs.addElement(bottlePos5);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread11375(int [] tdone, int [] ends){
        S840=1;
    turnGripperHome.setPresent();//sysj\controller.sysj line: 99, column: 11
    currsigs.addElement(turnGripperHome);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread11373(int [] tdone, int [] ends){
        switch(S845){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\controller.sysj line: 99, column: 43
        currsigs.addElement(bottlePos5);
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
        break;
      
    }
  }

  public void thread11372(int [] tdone, int [] ends){
        switch(S840){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\controller.sysj line: 99, column: 11
        currsigs.addElement(turnGripperHome);
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
        break;
      
    }
  }

  public void thread11370(int [] tdone, int [] ends){
        S728=1;
    lowerCapper.setPresent();//sysj\controller.sysj line: 87, column: 70
    currsigs.addElement(lowerCapper);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread11369(int [] tdone, int [] ends){
        S723=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 87, column: 43
    currsigs.addElement(bottlePos5);
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread11368(int [] tdone, int [] ends){
        S718=1;
    turnGripperHome.setPresent();//sysj\controller.sysj line: 87, column: 11
    currsigs.addElement(turnGripperHome);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread11366(int [] tdone, int [] ends){
        switch(S728){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\controller.sysj line: 87, column: 70
        currsigs.addElement(lowerCapper);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread11365(int [] tdone, int [] ends){
        switch(S723){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\controller.sysj line: 87, column: 43
        currsigs.addElement(bottlePos5);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread11364(int [] tdone, int [] ends){
        switch(S718){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\controller.sysj line: 87, column: 11
        currsigs.addElement(turnGripperHome);
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
        break;
      
    }
  }

  public void thread11362(int [] tdone, int [] ends){
        S845=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 99, column: 43
    currsigs.addElement(bottlePos5);
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread11361(int [] tdone, int [] ends){
        S840=1;
    turnGripperHome.setPresent();//sysj\controller.sysj line: 99, column: 11
    currsigs.addElement(turnGripperHome);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread11359(int [] tdone, int [] ends){
        S606=1;
    lowerCapper.setPresent();//sysj\controller.sysj line: 75, column: 71
    currsigs.addElement(lowerCapper);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread11358(int [] tdone, int [] ends){
        S601=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 75, column: 44
    currsigs.addElement(bottlePos5);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread11357(int [] tdone, int [] ends){
        S596=1;
    turnGripperFinal.setPresent();//sysj\controller.sysj line: 75, column: 11
    currsigs.addElement(turnGripperFinal);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread11355(int [] tdone, int [] ends){
        switch(S606){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\controller.sysj line: 75, column: 71
        currsigs.addElement(lowerCapper);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread11354(int [] tdone, int [] ends){
        switch(S601){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\controller.sysj line: 75, column: 44
        currsigs.addElement(bottlePos5);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread11353(int [] tdone, int [] ends){
        switch(S596){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        turnGripperFinal.setPresent();//sysj\controller.sysj line: 75, column: 11
        currsigs.addElement(turnGripperFinal);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread11351(int [] tdone, int [] ends){
        S728=1;
    lowerCapper.setPresent();//sysj\controller.sysj line: 87, column: 70
    currsigs.addElement(lowerCapper);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread11350(int [] tdone, int [] ends){
        S723=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 87, column: 43
    currsigs.addElement(bottlePos5);
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread11349(int [] tdone, int [] ends){
        S718=1;
    turnGripperHome.setPresent();//sysj\controller.sysj line: 87, column: 11
    currsigs.addElement(turnGripperHome);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread11347(int [] tdone, int [] ends){
        S343=1;
    lowerCapper.setPresent();//sysj\controller.sysj line: 63, column: 123
    currsigs.addElement(lowerCapper);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread11346(int [] tdone, int [] ends){
        S338=1;
    clampBottle.setPresent();//sysj\controller.sysj line: 63, column: 95
    currsigs.addElement(clampBottle);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread11345(int [] tdone, int [] ends){
        S333=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 63, column: 68
    currsigs.addElement(bottlePos5);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread11344(int [] tdone, int [] ends){
        S328=1;
    gripCap.setPresent();//sysj\controller.sysj line: 63, column: 44
    currsigs.addElement(gripCap);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread11343(int [] tdone, int [] ends){
        S323=1;
    turnGripperFinal.setPresent();//sysj\controller.sysj line: 63, column: 11
    currsigs.addElement(turnGripperFinal);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread11341(int [] tdone, int [] ends){
        switch(S343){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\controller.sysj line: 63, column: 123
        currsigs.addElement(lowerCapper);
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread11340(int [] tdone, int [] ends){
        switch(S338){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        clampBottle.setPresent();//sysj\controller.sysj line: 63, column: 95
        currsigs.addElement(clampBottle);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread11339(int [] tdone, int [] ends){
        switch(S333){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\controller.sysj line: 63, column: 68
        currsigs.addElement(bottlePos5);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread11338(int [] tdone, int [] ends){
        switch(S328){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        gripCap.setPresent();//sysj\controller.sysj line: 63, column: 44
        currsigs.addElement(gripCap);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread11337(int [] tdone, int [] ends){
        switch(S323){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        turnGripperFinal.setPresent();//sysj\controller.sysj line: 63, column: 11
        currsigs.addElement(turnGripperFinal);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread11335(int [] tdone, int [] ends){
        S606=1;
    lowerCapper.setPresent();//sysj\controller.sysj line: 75, column: 71
    currsigs.addElement(lowerCapper);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread11334(int [] tdone, int [] ends){
        S601=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 75, column: 44
    currsigs.addElement(bottlePos5);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread11333(int [] tdone, int [] ends){
        S596=1;
    turnGripperFinal.setPresent();//sysj\controller.sysj line: 75, column: 11
    currsigs.addElement(turnGripperFinal);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread11331(int [] tdone, int [] ends){
        S159=1;
    gripCap.setPresent();//sysj\controller.sysj line: 50, column: 127
    currsigs.addElement(gripCap);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread11330(int [] tdone, int [] ends){
        S154=1;
    clampBottle.setPresent();//sysj\controller.sysj line: 50, column: 99
    currsigs.addElement(clampBottle);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread11329(int [] tdone, int [] ends){
        S149=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 50, column: 72
    currsigs.addElement(bottlePos5);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread11328(int [] tdone, int [] ends){
        S144=1;
    lowerCapper.setPresent();//sysj\controller.sysj line: 50, column: 44
    currsigs.addElement(lowerCapper);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread11327(int [] tdone, int [] ends){
        S139=1;
    turnGripperHome.setPresent();//sysj\controller.sysj line: 50, column: 12
    currsigs.addElement(turnGripperHome);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread11325(int [] tdone, int [] ends){
        switch(S159){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        gripCap.setPresent();//sysj\controller.sysj line: 50, column: 127
        currsigs.addElement(gripCap);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread11324(int [] tdone, int [] ends){
        switch(S154){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        clampBottle.setPresent();//sysj\controller.sysj line: 50, column: 99
        currsigs.addElement(clampBottle);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread11323(int [] tdone, int [] ends){
        switch(S149){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\controller.sysj line: 50, column: 72
        currsigs.addElement(bottlePos5);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread11322(int [] tdone, int [] ends){
        switch(S144){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\controller.sysj line: 50, column: 44
        currsigs.addElement(lowerCapper);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread11321(int [] tdone, int [] ends){
        switch(S139){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\controller.sysj line: 50, column: 12
        currsigs.addElement(turnGripperHome);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread11319(int [] tdone, int [] ends){
        S343=1;
    lowerCapper.setPresent();//sysj\controller.sysj line: 63, column: 123
    currsigs.addElement(lowerCapper);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread11318(int [] tdone, int [] ends){
        S338=1;
    clampBottle.setPresent();//sysj\controller.sysj line: 63, column: 95
    currsigs.addElement(clampBottle);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread11317(int [] tdone, int [] ends){
        S333=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 63, column: 68
    currsigs.addElement(bottlePos5);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread11316(int [] tdone, int [] ends){
        S328=1;
    gripCap.setPresent();//sysj\controller.sysj line: 63, column: 44
    currsigs.addElement(gripCap);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread11315(int [] tdone, int [] ends){
        S323=1;
    turnGripperFinal.setPresent();//sysj\controller.sysj line: 63, column: 11
    currsigs.addElement(turnGripperFinal);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread11313(int [] tdone, int [] ends){
        S343=1;
    lowerCapper.setPresent();//sysj\controller.sysj line: 63, column: 123
    currsigs.addElement(lowerCapper);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread11312(int [] tdone, int [] ends){
        S338=1;
    clampBottle.setPresent();//sysj\controller.sysj line: 63, column: 95
    currsigs.addElement(clampBottle);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread11311(int [] tdone, int [] ends){
        S333=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 63, column: 68
    currsigs.addElement(bottlePos5);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread11310(int [] tdone, int [] ends){
        S328=1;
    gripCap.setPresent();//sysj\controller.sysj line: 63, column: 44
    currsigs.addElement(gripCap);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread11309(int [] tdone, int [] ends){
        S323=1;
    turnGripperFinal.setPresent();//sysj\controller.sysj line: 63, column: 11
    currsigs.addElement(turnGripperFinal);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread11307(int [] tdone, int [] ends){
        S26=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 37, column: 71
    currsigs.addElement(bottlePos5);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread11306(int [] tdone, int [] ends){
        S21=1;
    lowerCapper.setPresent();//sysj\controller.sysj line: 37, column: 43
    currsigs.addElement(lowerCapper);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread11305(int [] tdone, int [] ends){
        S16=1;
    turnGripperHome.setPresent();//sysj\controller.sysj line: 37, column: 11
    currsigs.addElement(turnGripperHome);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread11303(int [] tdone, int [] ends){
        switch(S26){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        bottlePos5.setPresent();//sysj\controller.sysj line: 37, column: 71
        currsigs.addElement(bottlePos5);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread11302(int [] tdone, int [] ends){
        switch(S21){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        lowerCapper.setPresent();//sysj\controller.sysj line: 37, column: 43
        currsigs.addElement(lowerCapper);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread11301(int [] tdone, int [] ends){
        switch(S16){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        turnGripperHome.setPresent();//sysj\controller.sysj line: 37, column: 11
        currsigs.addElement(turnGripperHome);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread11299(int [] tdone, int [] ends){
        S159=1;
    gripCap.setPresent();//sysj\controller.sysj line: 50, column: 127
    currsigs.addElement(gripCap);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread11298(int [] tdone, int [] ends){
        S154=1;
    clampBottle.setPresent();//sysj\controller.sysj line: 50, column: 99
    currsigs.addElement(clampBottle);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread11297(int [] tdone, int [] ends){
        S149=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 50, column: 72
    currsigs.addElement(bottlePos5);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread11296(int [] tdone, int [] ends){
        S144=1;
    lowerCapper.setPresent();//sysj\controller.sysj line: 50, column: 44
    currsigs.addElement(lowerCapper);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread11295(int [] tdone, int [] ends){
        S139=1;
    turnGripperHome.setPresent();//sysj\controller.sysj line: 50, column: 12
    currsigs.addElement(turnGripperHome);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread11293(int [] tdone, int [] ends){
        S26=1;
    bottlePos5.setPresent();//sysj\controller.sysj line: 37, column: 71
    currsigs.addElement(bottlePos5);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread11292(int [] tdone, int [] ends){
        S21=1;
    lowerCapper.setPresent();//sysj\controller.sysj line: 37, column: 43
    currsigs.addElement(lowerCapper);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread11291(int [] tdone, int [] ends){
        S16=1;
    turnGripperHome.setPresent();//sysj\controller.sysj line: 37, column: 11
    currsigs.addElement(turnGripperHome);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread11290(int [] tdone, int [] ends){
        switch(S2763){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S134){
          case 0 : 
            if(bottleReady.getprestatus() && capperRaised.getprestatus() && gripperAtHome.getprestatus()){//sysj\controller.sysj line: 29, column: 12
              S134=1;
              S31=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 36, column: 16
                S30=0;
                thread11291(tdone,ends);
                thread11292(tdone,ends);
                thread11293(tdone,ends);
                int biggest11294 = 0;
                if(ends[4]>=biggest11294){
                  biggest11294=ends[4];
                }
                if(ends[5]>=biggest11294){
                  biggest11294=ends[5];
                }
                if(ends[6]>=biggest11294){
                  biggest11294=ends[6];
                }
                if(biggest11294 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S30=1;
                bottlePos5.setPresent();//sysj\controller.sysj line: 39, column: 9
                currsigs.addElement(bottlePos5);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(capperLowered.getprestatus() && clampOpen.getprestatus() && gripperOpen.getprestatus()){//sysj\controller.sysj line: 34, column: 12
              S134=2;
              S164=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 49, column: 17
                S163=0;
                thread11295(tdone,ends);
                thread11296(tdone,ends);
                thread11297(tdone,ends);
                thread11298(tdone,ends);
                thread11299(tdone,ends);
                int biggest11300 = 0;
                if(ends[7]>=biggest11300){
                  biggest11300=ends[7];
                }
                if(ends[8]>=biggest11300){
                  biggest11300=ends[8];
                }
                if(ends[9]>=biggest11300){
                  biggest11300=ends[9];
                }
                if(ends[10]>=biggest11300){
                  biggest11300=ends[10];
                }
                if(ends[11]>=biggest11300){
                  biggest11300=ends[11];
                }
                if(biggest11300 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S163=1;
                bottlePos5.setPresent();//sysj\controller.sysj line: 52, column: 10
                currsigs.addElement(bottlePos5);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              switch(S31){
                case 0 : 
                  switch(S30){
                    case 0 : 
                      thread11301(tdone,ends);
                      thread11302(tdone,ends);
                      thread11303(tdone,ends);
                      int biggest11304 = 0;
                      if(ends[4]>=biggest11304){
                        biggest11304=ends[4];
                      }
                      if(ends[5]>=biggest11304){
                        biggest11304=ends[5];
                      }
                      if(ends[6]>=biggest11304){
                        biggest11304=ends[6];
                      }
                      if(biggest11304 == 1){
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      //FINXME code
                      if(biggest11304 == 0){
                        S31=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\controller.sysj line: 39, column: 9
                      currsigs.addElement(bottlePos5);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S31=1;
                  S31=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 36, column: 16
                    S30=0;
                    thread11305(tdone,ends);
                    thread11306(tdone,ends);
                    thread11307(tdone,ends);
                    int biggest11308 = 0;
                    if(ends[4]>=biggest11308){
                      biggest11308=ends[4];
                    }
                    if(ends[5]>=biggest11308){
                      biggest11308=ends[5];
                    }
                    if(ends[6]>=biggest11308){
                      biggest11308=ends[6];
                    }
                    if(biggest11308 == 1){
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    S30=1;
                    bottlePos5.setPresent();//sysj\controller.sysj line: 39, column: 9
                    currsigs.addElement(bottlePos5);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(capperLowered.getprestatus() && clampClose.getprestatus() && !gripperAtFinal.getprestatus() && gripperClose.getprestatus()){//sysj\controller.sysj line: 46, column: 12
              S134=3;
              S348=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 62, column: 16
                S347=0;
                thread11309(tdone,ends);
                thread11310(tdone,ends);
                thread11311(tdone,ends);
                thread11312(tdone,ends);
                thread11313(tdone,ends);
                int biggest11314 = 0;
                if(ends[12]>=biggest11314){
                  biggest11314=ends[12];
                }
                if(ends[13]>=biggest11314){
                  biggest11314=ends[13];
                }
                if(ends[14]>=biggest11314){
                  biggest11314=ends[14];
                }
                if(ends[15]>=biggest11314){
                  biggest11314=ends[15];
                }
                if(ends[16]>=biggest11314){
                  biggest11314=ends[16];
                }
                if(biggest11314 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S347=1;
                bottlePos5.setPresent();//sysj\controller.sysj line: 65, column: 9
                currsigs.addElement(bottlePos5);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              if(clampClose.getprestatus() && !gripperAtFinal.getprestatus() && gripperClose.getprestatus()){//sysj\controller.sysj line: 47, column: 13
                S134=3;
                S348=0;
                if(auto_1.getprestatus()){//sysj\controller.sysj line: 62, column: 16
                  S347=0;
                  thread11315(tdone,ends);
                  thread11316(tdone,ends);
                  thread11317(tdone,ends);
                  thread11318(tdone,ends);
                  thread11319(tdone,ends);
                  int biggest11320 = 0;
                  if(ends[12]>=biggest11320){
                    biggest11320=ends[12];
                  }
                  if(ends[13]>=biggest11320){
                    biggest11320=ends[13];
                  }
                  if(ends[14]>=biggest11320){
                    biggest11320=ends[14];
                  }
                  if(ends[15]>=biggest11320){
                    biggest11320=ends[15];
                  }
                  if(ends[16]>=biggest11320){
                    biggest11320=ends[16];
                  }
                  if(biggest11320 == 1){
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                }
                else {
                  S347=1;
                  bottlePos5.setPresent();//sysj\controller.sysj line: 65, column: 9
                  currsigs.addElement(bottlePos5);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                switch(S164){
                  case 0 : 
                    switch(S163){
                      case 0 : 
                        thread11321(tdone,ends);
                        thread11322(tdone,ends);
                        thread11323(tdone,ends);
                        thread11324(tdone,ends);
                        thread11325(tdone,ends);
                        int biggest11326 = 0;
                        if(ends[7]>=biggest11326){
                          biggest11326=ends[7];
                        }
                        if(ends[8]>=biggest11326){
                          biggest11326=ends[8];
                        }
                        if(ends[9]>=biggest11326){
                          biggest11326=ends[9];
                        }
                        if(ends[10]>=biggest11326){
                          biggest11326=ends[10];
                        }
                        if(ends[11]>=biggest11326){
                          biggest11326=ends[11];
                        }
                        if(biggest11326 == 1){
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        //FINXME code
                        if(biggest11326 == 0){
                          S164=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        break;
                      
                      case 1 : 
                        bottlePos5.setPresent();//sysj\controller.sysj line: 52, column: 10
                        currsigs.addElement(bottlePos5);
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    S164=1;
                    S164=0;
                    if(auto_1.getprestatus()){//sysj\controller.sysj line: 49, column: 17
                      S163=0;
                      thread11327(tdone,ends);
                      thread11328(tdone,ends);
                      thread11329(tdone,ends);
                      thread11330(tdone,ends);
                      thread11331(tdone,ends);
                      int biggest11332 = 0;
                      if(ends[7]>=biggest11332){
                        biggest11332=ends[7];
                      }
                      if(ends[8]>=biggest11332){
                        biggest11332=ends[8];
                      }
                      if(ends[9]>=biggest11332){
                        biggest11332=ends[9];
                      }
                      if(ends[10]>=biggest11332){
                        biggest11332=ends[10];
                      }
                      if(ends[11]>=biggest11332){
                        biggest11332=ends[11];
                      }
                      if(biggest11332 == 1){
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                    else {
                      S163=1;
                      bottlePos5.setPresent();//sysj\controller.sysj line: 52, column: 10
                      currsigs.addElement(bottlePos5);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                }
              }
            }
            break;
          
          case 3 : 
            if(gripperAtFinal.getprestatus() && clampClose.getprestatus() && gripperClose.getprestatus() && !capperRaised.getprestatus()){//sysj\controller.sysj line: 60, column: 12
              S134=4;
              S611=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 74, column: 16
                S610=0;
                thread11333(tdone,ends);
                thread11334(tdone,ends);
                thread11335(tdone,ends);
                int biggest11336 = 0;
                if(ends[17]>=biggest11336){
                  biggest11336=ends[17];
                }
                if(ends[18]>=biggest11336){
                  biggest11336=ends[18];
                }
                if(ends[19]>=biggest11336){
                  biggest11336=ends[19];
                }
                if(biggest11336 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S610=1;
                bottlePos5.setPresent();//sysj\controller.sysj line: 77, column: 9
                currsigs.addElement(bottlePos5);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              switch(S348){
                case 0 : 
                  switch(S347){
                    case 0 : 
                      thread11337(tdone,ends);
                      thread11338(tdone,ends);
                      thread11339(tdone,ends);
                      thread11340(tdone,ends);
                      thread11341(tdone,ends);
                      int biggest11342 = 0;
                      if(ends[12]>=biggest11342){
                        biggest11342=ends[12];
                      }
                      if(ends[13]>=biggest11342){
                        biggest11342=ends[13];
                      }
                      if(ends[14]>=biggest11342){
                        biggest11342=ends[14];
                      }
                      if(ends[15]>=biggest11342){
                        biggest11342=ends[15];
                      }
                      if(ends[16]>=biggest11342){
                        biggest11342=ends[16];
                      }
                      if(biggest11342 == 1){
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      //FINXME code
                      if(biggest11342 == 0){
                        S348=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\controller.sysj line: 65, column: 9
                      currsigs.addElement(bottlePos5);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S348=1;
                  S348=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 62, column: 16
                    S347=0;
                    thread11343(tdone,ends);
                    thread11344(tdone,ends);
                    thread11345(tdone,ends);
                    thread11346(tdone,ends);
                    thread11347(tdone,ends);
                    int biggest11348 = 0;
                    if(ends[12]>=biggest11348){
                      biggest11348=ends[12];
                    }
                    if(ends[13]>=biggest11348){
                      biggest11348=ends[13];
                    }
                    if(ends[14]>=biggest11348){
                      biggest11348=ends[14];
                    }
                    if(ends[15]>=biggest11348){
                      biggest11348=ends[15];
                    }
                    if(ends[16]>=biggest11348){
                      biggest11348=ends[16];
                    }
                    if(biggest11348 == 1){
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    S347=1;
                    bottlePos5.setPresent();//sysj\controller.sysj line: 65, column: 9
                    currsigs.addElement(bottlePos5);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 4 : 
            if(gripperOpen.getprestatus() && !gripperAtHome.getprestatus() && clampOpen.getprestatus() && !capperRaised.getprestatus()){//sysj\controller.sysj line: 72, column: 12
              S134=5;
              S733=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 86, column: 16
                S732=0;
                thread11349(tdone,ends);
                thread11350(tdone,ends);
                thread11351(tdone,ends);
                int biggest11352 = 0;
                if(ends[20]>=biggest11352){
                  biggest11352=ends[20];
                }
                if(ends[21]>=biggest11352){
                  biggest11352=ends[21];
                }
                if(ends[22]>=biggest11352){
                  biggest11352=ends[22];
                }
                if(biggest11352 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S732=1;
                bottlePos5.setPresent();//sysj\controller.sysj line: 89, column: 9
                currsigs.addElement(bottlePos5);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              switch(S611){
                case 0 : 
                  switch(S610){
                    case 0 : 
                      thread11353(tdone,ends);
                      thread11354(tdone,ends);
                      thread11355(tdone,ends);
                      int biggest11356 = 0;
                      if(ends[17]>=biggest11356){
                        biggest11356=ends[17];
                      }
                      if(ends[18]>=biggest11356){
                        biggest11356=ends[18];
                      }
                      if(ends[19]>=biggest11356){
                        biggest11356=ends[19];
                      }
                      if(biggest11356 == 1){
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      //FINXME code
                      if(biggest11356 == 0){
                        S611=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\controller.sysj line: 77, column: 9
                      currsigs.addElement(bottlePos5);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S611=1;
                  S611=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 74, column: 16
                    S610=0;
                    thread11357(tdone,ends);
                    thread11358(tdone,ends);
                    thread11359(tdone,ends);
                    int biggest11360 = 0;
                    if(ends[17]>=biggest11360){
                      biggest11360=ends[17];
                    }
                    if(ends[18]>=biggest11360){
                      biggest11360=ends[18];
                    }
                    if(ends[19]>=biggest11360){
                      biggest11360=ends[19];
                    }
                    if(biggest11360 == 1){
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    S610=1;
                    bottlePos5.setPresent();//sysj\controller.sysj line: 77, column: 9
                    currsigs.addElement(bottlePos5);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 5 : 
            if(gripperAtHome.getprestatus() && !gripperAtFinal.getprestatus() && clampOpen.getprestatus() && !capperRaised.getprestatus() && gripperOpen.getprestatus()){//sysj\controller.sysj line: 84, column: 12
              S134=6;
              S850=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 98, column: 16
                S849=0;
                thread11361(tdone,ends);
                thread11362(tdone,ends);
                int biggest11363 = 0;
                if(ends[23]>=biggest11363){
                  biggest11363=ends[23];
                }
                if(ends[24]>=biggest11363){
                  biggest11363=ends[24];
                }
                if(biggest11363 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S849=1;
                bottlePos5.setPresent();//sysj\controller.sysj line: 101, column: 9
                currsigs.addElement(bottlePos5);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              switch(S733){
                case 0 : 
                  switch(S732){
                    case 0 : 
                      thread11364(tdone,ends);
                      thread11365(tdone,ends);
                      thread11366(tdone,ends);
                      int biggest11367 = 0;
                      if(ends[20]>=biggest11367){
                        biggest11367=ends[20];
                      }
                      if(ends[21]>=biggest11367){
                        biggest11367=ends[21];
                      }
                      if(ends[22]>=biggest11367){
                        biggest11367=ends[22];
                      }
                      if(biggest11367 == 1){
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      //FINXME code
                      if(biggest11367 == 0){
                        S733=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\controller.sysj line: 89, column: 9
                      currsigs.addElement(bottlePos5);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S733=1;
                  S733=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 86, column: 16
                    S732=0;
                    thread11368(tdone,ends);
                    thread11369(tdone,ends);
                    thread11370(tdone,ends);
                    int biggest11371 = 0;
                    if(ends[20]>=biggest11371){
                      biggest11371=ends[20];
                    }
                    if(ends[21]>=biggest11371){
                      biggest11371=ends[21];
                    }
                    if(ends[22]>=biggest11371){
                      biggest11371=ends[22];
                    }
                    if(biggest11371 == 1){
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    S732=1;
                    bottlePos5.setPresent();//sysj\controller.sysj line: 89, column: 9
                    currsigs.addElement(bottlePos5);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 6 : 
            if(capperRaised.getprestatus() && clampOpen.getprestatus() && gripperOpen.getprestatus()){//sysj\controller.sysj line: 96, column: 12
              bottlePos5.setPresent();//sysj\controller.sysj line: 106, column: 6
              currsigs.addElement(bottlePos5);
              S134=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S850){
                case 0 : 
                  switch(S849){
                    case 0 : 
                      thread11372(tdone,ends);
                      thread11373(tdone,ends);
                      int biggest11374 = 0;
                      if(ends[23]>=biggest11374){
                        biggest11374=ends[23];
                      }
                      if(ends[24]>=biggest11374){
                        biggest11374=ends[24];
                      }
                      if(biggest11374 == 1){
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      //FINXME code
                      if(biggest11374 == 0){
                        S850=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      bottlePos5.setPresent();//sysj\controller.sysj line: 101, column: 9
                      currsigs.addElement(bottlePos5);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S850=1;
                  S850=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 98, column: 16
                    S849=0;
                    thread11375(tdone,ends);
                    thread11376(tdone,ends);
                    int biggest11377 = 0;
                    if(ends[23]>=biggest11377){
                      biggest11377=ends[23];
                    }
                    if(ends[24]>=biggest11377){
                      biggest11377=ends[24];
                    }
                    if(biggest11377 == 1){
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    S849=1;
                    bottlePos5.setPresent();//sysj\controller.sysj line: 101, column: 9
                    currsigs.addElement(bottlePos5);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11289(int [] tdone, int [] ends){
        switch(S10){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2){
          case 0 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 17, column: 9
              S2=0;
              auto_1.setPresent();//sysj\controller.sysj line: 18, column: 7
              currsigs.addElement(auto_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S2=1;
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 17, column: 9
              S2=0;
              auto_1.setPresent();//sysj\controller.sysj line: 18, column: 7
              currsigs.addElement(auto_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11286(int [] tdone, int [] ends){
        if(!turnGripperFinalM.getprestatus() && turnGripperHomeM.getprestatus()){//sysj\controller.sysj line: 122, column: 16
      turnGripperHome.setPresent();//sysj\controller.sysj line: 122, column: 59
      currsigs.addElement(turnGripperHome);
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
    else {
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread11285(int [] tdone, int [] ends){
        if(turnGripperFinalM.getprestatus() && !turnGripperHomeM.getprestatus()){//sysj\controller.sysj line: 120, column: 16
      turnGripperFinal.setPresent();//sysj\controller.sysj line: 120, column: 59
      currsigs.addElement(turnGripperFinal);
      active[29]=0;
      ends[29]=0;
      tdone[29]=1;
    }
    else {
      active[29]=0;
      ends[29]=0;
      tdone[29]=1;
    }
  }

  public void thread11284(int [] tdone, int [] ends){
        if(lowerCapperM.getprestatus()){//sysj\controller.sysj line: 118, column: 16
      lowerCapper.setPresent();//sysj\controller.sysj line: 118, column: 40
      currsigs.addElement(lowerCapper);
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
    else {
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread11283(int [] tdone, int [] ends){
        if(gripCapM.getprestatus()){//sysj\controller.sysj line: 116, column: 16
      gripCap.setPresent();//sysj\controller.sysj line: 116, column: 37
      currsigs.addElement(gripCap);
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
    else {
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread11282(int [] tdone, int [] ends){
        if(clampBottleM.getprestatus()){//sysj\controller.sysj line: 114, column: 16
      clampBottle.setPresent();//sysj\controller.sysj line: 114, column: 40
      currsigs.addElement(clampBottle);
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
    else {
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread11281(int [] tdone, int [] ends){
        S2816=1;
    S2780=0;
    if(!auto_1.getprestatus()){//sysj\controller.sysj line: 113, column: 14
      thread11282(tdone,ends);
      thread11283(tdone,ends);
      thread11284(tdone,ends);
      thread11285(tdone,ends);
      thread11286(tdone,ends);
      int biggest11287 = 0;
      if(ends[26]>=biggest11287){
        biggest11287=ends[26];
      }
      if(ends[27]>=biggest11287){
        biggest11287=ends[27];
      }
      if(ends[28]>=biggest11287){
        biggest11287=ends[28];
      }
      if(ends[29]>=biggest11287){
        biggest11287=ends[29];
      }
      if(ends[30]>=biggest11287){
        biggest11287=ends[30];
      }
      //FINXME code
      if(biggest11287 == 0){
        S2780=1;
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
    else {
      S2780=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread11280(int [] tdone, int [] ends){
        S2763=1;
    S134=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread11279(int [] tdone, int [] ends){
        S10=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 17, column: 9
      S2=0;
      auto_1.setPresent();//sysj\controller.sysj line: 18, column: 7
      currsigs.addElement(auto_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S11277){
        case 0 : 
          S11277=0;
          break RUN;
        
        case 1 : 
          S11277=2;
          S11277=2;
          if(mode.getprestatus()){//sysj\controller.sysj line: 13, column: 11
            S2818=0;
            auto_1.setClear();//sysj\controller.sysj line: 14, column: 4
            S2817=0;
            thread11279(tdone,ends);
            thread11280(tdone,ends);
            thread11281(tdone,ends);
            int biggest11288 = 0;
            if(ends[2]>=biggest11288){
              biggest11288=ends[2];
            }
            if(ends[3]>=biggest11288){
              biggest11288=ends[3];
            }
            if(ends[25]>=biggest11288){
              biggest11288=ends[25];
            }
            if(biggest11288 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
          else {
            S2818=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S2818){
            case 0 : 
              auto_1.setClear();//sysj\controller.sysj line: 14, column: 4
              switch(S2817){
                case 0 : 
                  thread11289(tdone,ends);
                  thread11290(tdone,ends);
                  thread11378(tdone,ends);
                  int biggest11391 = 0;
                  if(ends[2]>=biggest11391){
                    biggest11391=ends[2];
                  }
                  if(ends[3]>=biggest11391){
                    biggest11391=ends[3];
                  }
                  if(ends[25]>=biggest11391){
                    biggest11391=ends[25];
                  }
                  if(biggest11391 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest11391 == 0){
                    S2817=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S2817=1;
                  if(mode.getprestatus()){//sysj\controller.sysj line: 13, column: 11
                    S2818=0;
                    auto_1.setClear();//sysj\controller.sysj line: 14, column: 4
                    S2817=0;
                    thread11392(tdone,ends);
                    thread11393(tdone,ends);
                    thread11394(tdone,ends);
                    int biggest11401 = 0;
                    if(ends[2]>=biggest11401){
                      biggest11401=ends[2];
                    }
                    if(ends[3]>=biggest11401){
                      biggest11401=ends[3];
                    }
                    if(ends[25]>=biggest11401){
                      biggest11401=ends[25];
                    }
                    if(biggest11401 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S2818=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S2818=1;
              if(mode.getprestatus()){//sysj\controller.sysj line: 13, column: 11
                S2818=0;
                auto_1.setClear();//sysj\controller.sysj line: 14, column: 4
                S2817=0;
                thread11402(tdone,ends);
                thread11403(tdone,ends);
                thread11404(tdone,ends);
                int biggest11411 = 0;
                if(ends[2]>=biggest11411){
                  biggest11411=ends[2];
                }
                if(ends[3]>=biggest11411){
                  biggest11411=ends[3];
                }
                if(ends[25]>=biggest11411){
                  biggest11411=ends[25];
                }
                if(biggest11411 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S2818=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    auto_1 = new Signal();
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
          bottleReady.gethook();
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
      auto_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleReady.getStatus() ? bottleReady.setprepresent() : bottleReady.setpreclear();
      bottleReady.setpreval(bottleReady.getValue());
      bottleReady.setClear();
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
      auto_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleReady.gethook();
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
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
