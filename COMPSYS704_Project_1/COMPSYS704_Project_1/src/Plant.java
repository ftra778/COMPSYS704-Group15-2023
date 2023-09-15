import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\SACSplant.sysj line: 1, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal open_door1 = new Signal("open_door1", Signal.INPUT);
  public Signal open_door2 = new Signal("open_door2", Signal.INPUT);
  public Signal open_door3 = new Signal("open_door3", Signal.INPUT);
  public Signal close_door1 = new Signal("close_door1", Signal.INPUT);
  public Signal close_door2 = new Signal("close_door2", Signal.INPUT);
  public Signal close_door3 = new Signal("close_door3", Signal.INPUT);
  public Signal hp1 = new Signal("hp1", Signal.INPUT);
  public Signal hp2 = new Signal("hp2", Signal.INPUT);
  public Signal hp3 = new Signal("hp3", Signal.INPUT);
  public Signal hp4 = new Signal("hp4", Signal.INPUT);
  public Signal hp5 = new Signal("hp5", Signal.INPUT);
  public Signal hp6 = new Signal("hp6", Signal.INPUT);
  public Signal hp7 = new Signal("hp7", Signal.INPUT);
  public Signal door1_opened = new Signal("door1_opened", Signal.OUTPUT);
  public Signal door2_opened = new Signal("door2_opened", Signal.OUTPUT);
  public Signal door3_opened = new Signal("door3_opened", Signal.OUTPUT);
  public Signal door1_closed = new Signal("door1_closed", Signal.OUTPUT);
  public Signal door2_closed = new Signal("door2_closed", Signal.OUTPUT);
  public Signal door3_closed = new Signal("door3_closed", Signal.OUTPUT);
  private int S65862 = 1;
  private int S65542 = 1;
  private int S65332 = 1;
  private int S65340 = 1;
  private int S65348 = 1;
  private int S65356 = 1;
  private int S65364 = 1;
  private int S65372 = 1;
  private int S65380 = 1;
  private int S65388 = 1;
  private int S65396 = 1;
  private int S65592 = 1;
  private int S65550 = 1;
  private int S65544 = 1;
  private int S65558 = 1;
  private int S65566 = 1;
  private int S65574 = 1;
  private int S65582 = 1;
  private int S65590 = 1;
  
  private int[] ends = new int[19];
  private int[] tdone = new int[19];
  
  public void thread65911(int [] tdone, int [] ends){
        switch(S65590){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(close_door3.getprestatus()){//sysj\SACSplant.sysj line: 107, column: 24
          door3_closed.setPresent();//sysj\SACSplant.sysj line: 107, column: 37
          currsigs.addElement(door3_closed);
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread65910(int [] tdone, int [] ends){
        switch(S65582){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(close_door2.getprestatus()){//sysj\SACSplant.sysj line: 105, column: 24
          door2_closed.setPresent();//sysj\SACSplant.sysj line: 105, column: 37
          currsigs.addElement(door2_closed);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread65909(int [] tdone, int [] ends){
        switch(S65574){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(close_door1.getprestatus()){//sysj\SACSplant.sysj line: 103, column: 24
          door1_closed.setPresent();//sysj\SACSplant.sysj line: 103, column: 37
          currsigs.addElement(door1_closed);
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

  public void thread65908(int [] tdone, int [] ends){
        switch(S65566){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(open_door3.getprestatus()){//sysj\SACSplant.sysj line: 101, column: 24
          door3_opened.setPresent();//sysj\SACSplant.sysj line: 101, column: 36
          currsigs.addElement(door3_opened);
          ;//sysj\SACSplant.sysj line: 101, column: 55
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          ;//sysj\SACSplant.sysj line: 101, column: 55
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread65907(int [] tdone, int [] ends){
        switch(S65558){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(open_door2.getprestatus()){//sysj\SACSplant.sysj line: 99, column: 24
          door2_opened.setPresent();//sysj\SACSplant.sysj line: 99, column: 36
          currsigs.addElement(door2_opened);
          ;//sysj\SACSplant.sysj line: 99, column: 55
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          ;//sysj\SACSplant.sysj line: 99, column: 55
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread65906(int [] tdone, int [] ends){
        switch(S65550){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S65544){
          case 0 : 
            S65544=0;
            if(open_door1.getprestatus()){//sysj\SACSplant.sysj line: 97, column: 24
              door1_opened.setPresent();//sysj\SACSplant.sysj line: 97, column: 36
              currsigs.addElement(door1_opened);
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S65544=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S65544=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S65544=1;
            S65544=0;
            if(open_door1.getprestatus()){//sysj\SACSplant.sysj line: 97, column: 24
              door1_opened.setPresent();//sysj\SACSplant.sysj line: 97, column: 36
              currsigs.addElement(door1_opened);
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S65544=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S65544=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread65905(int [] tdone, int [] ends){
        switch(S65592){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread65906(tdone,ends);
        thread65907(tdone,ends);
        thread65908(tdone,ends);
        thread65909(tdone,ends);
        thread65910(tdone,ends);
        thread65911(tdone,ends);
        int biggest65912 = 0;
        if(ends[13]>=biggest65912){
          biggest65912=ends[13];
        }
        if(ends[14]>=biggest65912){
          biggest65912=ends[14];
        }
        if(ends[15]>=biggest65912){
          biggest65912=ends[15];
        }
        if(ends[16]>=biggest65912){
          biggest65912=ends[16];
        }
        if(ends[17]>=biggest65912){
          biggest65912=ends[17];
        }
        if(ends[18]>=biggest65912){
          biggest65912=ends[18];
        }
        if(biggest65912 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest65912 == 0){
          S65592=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread65903(int [] tdone, int [] ends){
        S65396=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread65902(int [] tdone, int [] ends){
        S65388=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread65901(int [] tdone, int [] ends){
        S65380=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread65900(int [] tdone, int [] ends){
        S65372=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread65899(int [] tdone, int [] ends){
        S65364=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread65898(int [] tdone, int [] ends){
        S65356=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread65897(int [] tdone, int [] ends){
        S65348=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread65896(int [] tdone, int [] ends){
        S65340=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread65895(int [] tdone, int [] ends){
        S65332=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread65893(int [] tdone, int [] ends){
        switch(S65396){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(hp7.getprestatus()){//sysj\SACSplant.sysj line: 83, column: 11
          System.out.println("Human Detected in zone 7");//sysj\SACSplant.sysj line: 85, column: 6
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

  public void thread65892(int [] tdone, int [] ends){
        switch(S65388){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(hp6.getprestatus()){//sysj\SACSplant.sysj line: 75, column: 11
          System.out.println("Human Detected in zone 6");//sysj\SACSplant.sysj line: 77, column: 6
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

  public void thread65891(int [] tdone, int [] ends){
        switch(S65380){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(hp5.getprestatus()){//sysj\SACSplant.sysj line: 67, column: 11
          System.out.println("Human Detected in zone 5");//sysj\SACSplant.sysj line: 69, column: 6
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

  public void thread65890(int [] tdone, int [] ends){
        switch(S65372){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(hp4.getprestatus()){//sysj\SACSplant.sysj line: 59, column: 11
          System.out.println("Human Detected in zone 4");//sysj\SACSplant.sysj line: 61, column: 6
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread65889(int [] tdone, int [] ends){
        switch(S65364){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(hp3.getprestatus()){//sysj\SACSplant.sysj line: 51, column: 11
          System.out.println("Human Detected in zone 3");//sysj\SACSplant.sysj line: 53, column: 6
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread65888(int [] tdone, int [] ends){
        switch(S65356){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(hp2.getprestatus()){//sysj\SACSplant.sysj line: 43, column: 11
          System.out.println("Human Detected in zone 2");//sysj\SACSplant.sysj line: 45, column: 6
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
      
    }
  }

  public void thread65887(int [] tdone, int [] ends){
        switch(S65348){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(hp1.getprestatus()){//sysj\SACSplant.sysj line: 35, column: 11
          System.out.println("Human Detected in zone 1");//sysj\SACSplant.sysj line: 37, column: 6
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
  }

  public void thread65886(int [] tdone, int [] ends){
        switch(S65340){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(close_door1.getprestatus() || close_door2.getprestatus() || close_door3.getprestatus()){//sysj\SACSplant.sysj line: 25, column: 11
          System.out.println("Close Door");//sysj\SACSplant.sysj line: 27, column: 6
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
  }

  public void thread65885(int [] tdone, int [] ends){
        switch(S65332){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(open_door1.getprestatus() || open_door2.getprestatus() || open_door3.getprestatus()){//sysj\SACSplant.sysj line: 16, column: 11
          System.out.println("Open Door");//sysj\SACSplant.sysj line: 18, column: 6
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
  }

  public void thread65884(int [] tdone, int [] ends){
        switch(S65542){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread65885(tdone,ends);
        thread65886(tdone,ends);
        thread65887(tdone,ends);
        thread65888(tdone,ends);
        thread65889(tdone,ends);
        thread65890(tdone,ends);
        thread65891(tdone,ends);
        thread65892(tdone,ends);
        thread65893(tdone,ends);
        int biggest65894 = 0;
        if(ends[3]>=biggest65894){
          biggest65894=ends[3];
        }
        if(ends[4]>=biggest65894){
          biggest65894=ends[4];
        }
        if(ends[5]>=biggest65894){
          biggest65894=ends[5];
        }
        if(ends[6]>=biggest65894){
          biggest65894=ends[6];
        }
        if(ends[7]>=biggest65894){
          biggest65894=ends[7];
        }
        if(ends[8]>=biggest65894){
          biggest65894=ends[8];
        }
        if(ends[9]>=biggest65894){
          biggest65894=ends[9];
        }
        if(ends[10]>=biggest65894){
          biggest65894=ends[10];
        }
        if(ends[11]>=biggest65894){
          biggest65894=ends[11];
        }
        if(biggest65894 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest65894 == 0){
          thread65895(tdone,ends);
          thread65896(tdone,ends);
          thread65897(tdone,ends);
          thread65898(tdone,ends);
          thread65899(tdone,ends);
          thread65900(tdone,ends);
          thread65901(tdone,ends);
          thread65902(tdone,ends);
          thread65903(tdone,ends);
          int biggest65904 = 0;
          if(ends[3]>=biggest65904){
            biggest65904=ends[3];
          }
          if(ends[4]>=biggest65904){
            biggest65904=ends[4];
          }
          if(ends[5]>=biggest65904){
            biggest65904=ends[5];
          }
          if(ends[6]>=biggest65904){
            biggest65904=ends[6];
          }
          if(ends[7]>=biggest65904){
            biggest65904=ends[7];
          }
          if(ends[8]>=biggest65904){
            biggest65904=ends[8];
          }
          if(ends[9]>=biggest65904){
            biggest65904=ends[9];
          }
          if(ends[10]>=biggest65904){
            biggest65904=ends[10];
          }
          if(ends[11]>=biggest65904){
            biggest65904=ends[11];
          }
          if(biggest65904 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread65881(int [] tdone, int [] ends){
        S65590=1;
    if(close_door3.getprestatus()){//sysj\SACSplant.sysj line: 107, column: 24
      door3_closed.setPresent();//sysj\SACSplant.sysj line: 107, column: 37
      currsigs.addElement(door3_closed);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread65880(int [] tdone, int [] ends){
        S65582=1;
    if(close_door2.getprestatus()){//sysj\SACSplant.sysj line: 105, column: 24
      door2_closed.setPresent();//sysj\SACSplant.sysj line: 105, column: 37
      currsigs.addElement(door2_closed);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread65879(int [] tdone, int [] ends){
        S65574=1;
    if(close_door1.getprestatus()){//sysj\SACSplant.sysj line: 103, column: 24
      door1_closed.setPresent();//sysj\SACSplant.sysj line: 103, column: 37
      currsigs.addElement(door1_closed);
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

  public void thread65878(int [] tdone, int [] ends){
        S65566=1;
    if(open_door3.getprestatus()){//sysj\SACSplant.sysj line: 101, column: 24
      door3_opened.setPresent();//sysj\SACSplant.sysj line: 101, column: 36
      currsigs.addElement(door3_opened);
      ;//sysj\SACSplant.sysj line: 101, column: 55
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      ;//sysj\SACSplant.sysj line: 101, column: 55
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread65877(int [] tdone, int [] ends){
        S65558=1;
    if(open_door2.getprestatus()){//sysj\SACSplant.sysj line: 99, column: 24
      door2_opened.setPresent();//sysj\SACSplant.sysj line: 99, column: 36
      currsigs.addElement(door2_opened);
      ;//sysj\SACSplant.sysj line: 99, column: 55
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      ;//sysj\SACSplant.sysj line: 99, column: 55
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread65876(int [] tdone, int [] ends){
        S65550=1;
    S65544=0;
    if(open_door1.getprestatus()){//sysj\SACSplant.sysj line: 97, column: 24
      door1_opened.setPresent();//sysj\SACSplant.sysj line: 97, column: 36
      currsigs.addElement(door1_opened);
      ;//sysj\SACSplant.sysj line: 97, column: 55
      S65544=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      ;//sysj\SACSplant.sysj line: 97, column: 55
      S65544=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread65875(int [] tdone, int [] ends){
        S65592=1;
    thread65876(tdone,ends);
    thread65877(tdone,ends);
    thread65878(tdone,ends);
    thread65879(tdone,ends);
    thread65880(tdone,ends);
    thread65881(tdone,ends);
    int biggest65882 = 0;
    if(ends[13]>=biggest65882){
      biggest65882=ends[13];
    }
    if(ends[14]>=biggest65882){
      biggest65882=ends[14];
    }
    if(ends[15]>=biggest65882){
      biggest65882=ends[15];
    }
    if(ends[16]>=biggest65882){
      biggest65882=ends[16];
    }
    if(ends[17]>=biggest65882){
      biggest65882=ends[17];
    }
    if(ends[18]>=biggest65882){
      biggest65882=ends[18];
    }
    if(biggest65882 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread65873(int [] tdone, int [] ends){
        S65396=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread65872(int [] tdone, int [] ends){
        S65388=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread65871(int [] tdone, int [] ends){
        S65380=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread65870(int [] tdone, int [] ends){
        S65372=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread65869(int [] tdone, int [] ends){
        S65364=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread65868(int [] tdone, int [] ends){
        S65356=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread65867(int [] tdone, int [] ends){
        S65348=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread65866(int [] tdone, int [] ends){
        S65340=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread65865(int [] tdone, int [] ends){
        S65332=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread65864(int [] tdone, int [] ends){
        S65542=1;
    thread65865(tdone,ends);
    thread65866(tdone,ends);
    thread65867(tdone,ends);
    thread65868(tdone,ends);
    thread65869(tdone,ends);
    thread65870(tdone,ends);
    thread65871(tdone,ends);
    thread65872(tdone,ends);
    thread65873(tdone,ends);
    int biggest65874 = 0;
    if(ends[3]>=biggest65874){
      biggest65874=ends[3];
    }
    if(ends[4]>=biggest65874){
      biggest65874=ends[4];
    }
    if(ends[5]>=biggest65874){
      biggest65874=ends[5];
    }
    if(ends[6]>=biggest65874){
      biggest65874=ends[6];
    }
    if(ends[7]>=biggest65874){
      biggest65874=ends[7];
    }
    if(ends[8]>=biggest65874){
      biggest65874=ends[8];
    }
    if(ends[9]>=biggest65874){
      biggest65874=ends[9];
    }
    if(ends[10]>=biggest65874){
      biggest65874=ends[10];
    }
    if(ends[11]>=biggest65874){
      biggest65874=ends[11];
    }
    if(biggest65874 == 1){
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
      switch(S65862){
        case 0 : 
          S65862=0;
          break RUN;
        
        case 1 : 
          S65862=2;
          S65862=2;
          new Thread(new GUI()).start();//sysj\SACSplant.sysj line: 10, column: 2
          thread65864(tdone,ends);
          thread65875(tdone,ends);
          int biggest65883 = 0;
          if(ends[2]>=biggest65883){
            biggest65883=ends[2];
          }
          if(ends[12]>=biggest65883){
            biggest65883=ends[12];
          }
          if(biggest65883 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread65884(tdone,ends);
          thread65905(tdone,ends);
          int biggest65913 = 0;
          if(ends[2]>=biggest65913){
            biggest65913=ends[2];
          }
          if(ends[12]>=biggest65913){
            biggest65913=ends[12];
          }
          if(biggest65913 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest65913 == 0){
            S65862=0;
            active[1]=0;
            ends[1]=0;
            S65862=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          open_door1.gethook();
          open_door2.gethook();
          open_door3.gethook();
          close_door1.gethook();
          close_door2.gethook();
          close_door3.gethook();
          hp1.gethook();
          hp2.gethook();
          hp3.gethook();
          hp4.gethook();
          hp5.gethook();
          hp6.gethook();
          hp7.gethook();
          df = true;
        }
        runClockDomain();
      }
      open_door1.setpreclear();
      open_door2.setpreclear();
      open_door3.setpreclear();
      close_door1.setpreclear();
      close_door2.setpreclear();
      close_door3.setpreclear();
      hp1.setpreclear();
      hp2.setpreclear();
      hp3.setpreclear();
      hp4.setpreclear();
      hp5.setpreclear();
      hp6.setpreclear();
      hp7.setpreclear();
      door1_opened.setpreclear();
      door2_opened.setpreclear();
      door3_opened.setpreclear();
      door1_closed.setpreclear();
      door2_closed.setpreclear();
      door3_closed.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = open_door1.getStatus() ? open_door1.setprepresent() : open_door1.setpreclear();
      open_door1.setpreval(open_door1.getValue());
      open_door1.setClear();
      dummyint = open_door2.getStatus() ? open_door2.setprepresent() : open_door2.setpreclear();
      open_door2.setpreval(open_door2.getValue());
      open_door2.setClear();
      dummyint = open_door3.getStatus() ? open_door3.setprepresent() : open_door3.setpreclear();
      open_door3.setpreval(open_door3.getValue());
      open_door3.setClear();
      dummyint = close_door1.getStatus() ? close_door1.setprepresent() : close_door1.setpreclear();
      close_door1.setpreval(close_door1.getValue());
      close_door1.setClear();
      dummyint = close_door2.getStatus() ? close_door2.setprepresent() : close_door2.setpreclear();
      close_door2.setpreval(close_door2.getValue());
      close_door2.setClear();
      dummyint = close_door3.getStatus() ? close_door3.setprepresent() : close_door3.setpreclear();
      close_door3.setpreval(close_door3.getValue());
      close_door3.setClear();
      dummyint = hp1.getStatus() ? hp1.setprepresent() : hp1.setpreclear();
      hp1.setpreval(hp1.getValue());
      hp1.setClear();
      dummyint = hp2.getStatus() ? hp2.setprepresent() : hp2.setpreclear();
      hp2.setpreval(hp2.getValue());
      hp2.setClear();
      dummyint = hp3.getStatus() ? hp3.setprepresent() : hp3.setpreclear();
      hp3.setpreval(hp3.getValue());
      hp3.setClear();
      dummyint = hp4.getStatus() ? hp4.setprepresent() : hp4.setpreclear();
      hp4.setpreval(hp4.getValue());
      hp4.setClear();
      dummyint = hp5.getStatus() ? hp5.setprepresent() : hp5.setpreclear();
      hp5.setpreval(hp5.getValue());
      hp5.setClear();
      dummyint = hp6.getStatus() ? hp6.setprepresent() : hp6.setpreclear();
      hp6.setpreval(hp6.getValue());
      hp6.setClear();
      dummyint = hp7.getStatus() ? hp7.setprepresent() : hp7.setpreclear();
      hp7.setpreval(hp7.getValue());
      hp7.setClear();
      door1_opened.sethook();
      door1_opened.setClear();
      door2_opened.sethook();
      door2_opened.setClear();
      door3_opened.sethook();
      door3_opened.setClear();
      door1_closed.sethook();
      door1_closed.setClear();
      door2_closed.sethook();
      door2_closed.setClear();
      door3_closed.sethook();
      door3_closed.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        open_door1.gethook();
        open_door2.gethook();
        open_door3.gethook();
        close_door1.gethook();
        close_door2.gethook();
        close_door3.gethook();
        hp1.gethook();
        hp2.gethook();
        hp3.gethook();
        hp4.gethook();
        hp5.gethook();
        hp6.gethook();
        hp7.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
