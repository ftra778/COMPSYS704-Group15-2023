import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\ABSplant.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABSplant.sysj line: 2, column: 1

public class SACSPlant extends ClockDomain{
  public SACSPlant(String name){super(name);}
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
  private int S57199 = 1;
  private int S57147 = 1;
  private int S56937 = 1;
  private int S56945 = 1;
  private int S56953 = 1;
  private int S56961 = 1;
  private int S56969 = 1;
  private int S56977 = 1;
  private int S56985 = 1;
  private int S56993 = 1;
  private int S57001 = 1;
  private int S57197 = 1;
  private int S57155 = 1;
  private int S57163 = 1;
  private int S57171 = 1;
  private int S57179 = 1;
  private int S57187 = 1;
  private int S57195 = 1;
  
  private int[] ends = new int[96];
  private int[] tdone = new int[96];
  
  public void thread57410(int [] tdone, int [] ends){
        switch(S57195){
      case 0 : 
        active[95]=0;
        ends[95]=0;
        tdone[95]=1;
        break;
      
      case 1 : 
        if(close_door3.getprestatus()){//sysj\ABSplant.sysj line: 873, column: 24
          door3_closed.setPresent();//sysj\ABSplant.sysj line: 873, column: 37
          currsigs.addElement(door3_closed);
          active[95]=1;
          ends[95]=1;
          tdone[95]=1;
        }
        else {
          active[95]=1;
          ends[95]=1;
          tdone[95]=1;
        }
        break;
      
    }
  }

  public void thread57409(int [] tdone, int [] ends){
        switch(S57187){
      case 0 : 
        active[94]=0;
        ends[94]=0;
        tdone[94]=1;
        break;
      
      case 1 : 
        if(close_door2.getprestatus()){//sysj\ABSplant.sysj line: 871, column: 24
          door2_closed.setPresent();//sysj\ABSplant.sysj line: 871, column: 37
          currsigs.addElement(door2_closed);
          active[94]=1;
          ends[94]=1;
          tdone[94]=1;
        }
        else {
          active[94]=1;
          ends[94]=1;
          tdone[94]=1;
        }
        break;
      
    }
  }

  public void thread57408(int [] tdone, int [] ends){
        switch(S57179){
      case 0 : 
        active[93]=0;
        ends[93]=0;
        tdone[93]=1;
        break;
      
      case 1 : 
        if(close_door1.getprestatus()){//sysj\ABSplant.sysj line: 869, column: 24
          door1_closed.setPresent();//sysj\ABSplant.sysj line: 869, column: 37
          currsigs.addElement(door1_closed);
          active[93]=1;
          ends[93]=1;
          tdone[93]=1;
        }
        else {
          active[93]=1;
          ends[93]=1;
          tdone[93]=1;
        }
        break;
      
    }
  }

  public void thread57407(int [] tdone, int [] ends){
        switch(S57171){
      case 0 : 
        active[92]=0;
        ends[92]=0;
        tdone[92]=1;
        break;
      
      case 1 : 
        if(open_door3.getprestatus()){//sysj\ABSplant.sysj line: 867, column: 24
          door3_opened.setPresent();//sysj\ABSplant.sysj line: 867, column: 36
          currsigs.addElement(door3_opened);
          ;//sysj\ABSplant.sysj line: 867, column: 55
          active[92]=1;
          ends[92]=1;
          tdone[92]=1;
        }
        else {
          ;//sysj\ABSplant.sysj line: 867, column: 55
          active[92]=1;
          ends[92]=1;
          tdone[92]=1;
        }
        break;
      
    }
  }

  public void thread57406(int [] tdone, int [] ends){
        switch(S57163){
      case 0 : 
        active[91]=0;
        ends[91]=0;
        tdone[91]=1;
        break;
      
      case 1 : 
        if(open_door2.getprestatus()){//sysj\ABSplant.sysj line: 865, column: 24
          door2_opened.setPresent();//sysj\ABSplant.sysj line: 865, column: 36
          currsigs.addElement(door2_opened);
          ;//sysj\ABSplant.sysj line: 865, column: 55
          active[91]=1;
          ends[91]=1;
          tdone[91]=1;
        }
        else {
          ;//sysj\ABSplant.sysj line: 865, column: 55
          active[91]=1;
          ends[91]=1;
          tdone[91]=1;
        }
        break;
      
    }
  }

  public void thread57405(int [] tdone, int [] ends){
        switch(S57155){
      case 0 : 
        active[90]=0;
        ends[90]=0;
        tdone[90]=1;
        break;
      
      case 1 : 
        if(open_door1.getprestatus()){//sysj\ABSplant.sysj line: 863, column: 24
          door1_opened.setPresent();//sysj\ABSplant.sysj line: 863, column: 36
          currsigs.addElement(door1_opened);
          ;//sysj\ABSplant.sysj line: 863, column: 55
          active[90]=1;
          ends[90]=1;
          tdone[90]=1;
        }
        else {
          ;//sysj\ABSplant.sysj line: 863, column: 55
          active[90]=1;
          ends[90]=1;
          tdone[90]=1;
        }
        break;
      
    }
  }

  public void thread57404(int [] tdone, int [] ends){
        switch(S57197){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        thread57405(tdone,ends);
        thread57406(tdone,ends);
        thread57407(tdone,ends);
        thread57408(tdone,ends);
        thread57409(tdone,ends);
        thread57410(tdone,ends);
        int biggest57411 = 0;
        if(ends[90]>=biggest57411){
          biggest57411=ends[90];
        }
        if(ends[91]>=biggest57411){
          biggest57411=ends[91];
        }
        if(ends[92]>=biggest57411){
          biggest57411=ends[92];
        }
        if(ends[93]>=biggest57411){
          biggest57411=ends[93];
        }
        if(ends[94]>=biggest57411){
          biggest57411=ends[94];
        }
        if(ends[95]>=biggest57411){
          biggest57411=ends[95];
        }
        if(biggest57411 == 1){
          active[89]=1;
          ends[89]=1;
          tdone[89]=1;
        }
        //FINXME code
        if(biggest57411 == 0){
          S57197=0;
          active[89]=0;
          ends[89]=0;
          tdone[89]=1;
        }
        break;
      
    }
  }

  public void thread57402(int [] tdone, int [] ends){
        S57001=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread57401(int [] tdone, int [] ends){
        S56993=1;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread57400(int [] tdone, int [] ends){
        S56985=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread57399(int [] tdone, int [] ends){
        S56977=1;
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread57398(int [] tdone, int [] ends){
        S56969=1;
    active[84]=1;
    ends[84]=1;
    tdone[84]=1;
  }

  public void thread57397(int [] tdone, int [] ends){
        S56961=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread57396(int [] tdone, int [] ends){
        S56953=1;
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread57395(int [] tdone, int [] ends){
        S56945=1;
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread57394(int [] tdone, int [] ends){
        S56937=1;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread57392(int [] tdone, int [] ends){
        switch(S57001){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        if(hp7.getprestatus()){//sysj\ABSplant.sysj line: 849, column: 11
          System.out.println("Human Detected in zone 7");//sysj\ABSplant.sysj line: 851, column: 6
          active[88]=1;
          ends[88]=1;
          tdone[88]=1;
        }
        else {
          active[88]=1;
          ends[88]=1;
          tdone[88]=1;
        }
        break;
      
    }
  }

  public void thread57391(int [] tdone, int [] ends){
        switch(S56993){
      case 0 : 
        active[87]=0;
        ends[87]=0;
        tdone[87]=1;
        break;
      
      case 1 : 
        if(hp6.getprestatus()){//sysj\ABSplant.sysj line: 841, column: 11
          System.out.println("Human Detected in zone 6");//sysj\ABSplant.sysj line: 843, column: 6
          active[87]=1;
          ends[87]=1;
          tdone[87]=1;
        }
        else {
          active[87]=1;
          ends[87]=1;
          tdone[87]=1;
        }
        break;
      
    }
  }

  public void thread57390(int [] tdone, int [] ends){
        switch(S56985){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        if(hp5.getprestatus()){//sysj\ABSplant.sysj line: 833, column: 11
          System.out.println("Human Detected in zone 5");//sysj\ABSplant.sysj line: 835, column: 6
          active[86]=1;
          ends[86]=1;
          tdone[86]=1;
        }
        else {
          active[86]=1;
          ends[86]=1;
          tdone[86]=1;
        }
        break;
      
    }
  }

  public void thread57389(int [] tdone, int [] ends){
        switch(S56977){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        if(hp4.getprestatus()){//sysj\ABSplant.sysj line: 825, column: 11
          System.out.println("Human Detected in zone 4");//sysj\ABSplant.sysj line: 827, column: 6
          active[85]=1;
          ends[85]=1;
          tdone[85]=1;
        }
        else {
          active[85]=1;
          ends[85]=1;
          tdone[85]=1;
        }
        break;
      
    }
  }

  public void thread57388(int [] tdone, int [] ends){
        switch(S56969){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        if(hp3.getprestatus()){//sysj\ABSplant.sysj line: 817, column: 11
          System.out.println("Human Detected in zone 3");//sysj\ABSplant.sysj line: 819, column: 6
          active[84]=1;
          ends[84]=1;
          tdone[84]=1;
        }
        else {
          active[84]=1;
          ends[84]=1;
          tdone[84]=1;
        }
        break;
      
    }
  }

  public void thread57387(int [] tdone, int [] ends){
        switch(S56961){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        if(hp2.getprestatus()){//sysj\ABSplant.sysj line: 809, column: 11
          System.out.println("Human Detected in zone 2");//sysj\ABSplant.sysj line: 811, column: 6
          active[83]=1;
          ends[83]=1;
          tdone[83]=1;
        }
        else {
          active[83]=1;
          ends[83]=1;
          tdone[83]=1;
        }
        break;
      
    }
  }

  public void thread57386(int [] tdone, int [] ends){
        switch(S56953){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        if(hp1.getprestatus()){//sysj\ABSplant.sysj line: 801, column: 11
          System.out.println("Human Detected in zone 1");//sysj\ABSplant.sysj line: 803, column: 6
          active[82]=1;
          ends[82]=1;
          tdone[82]=1;
        }
        else {
          active[82]=1;
          ends[82]=1;
          tdone[82]=1;
        }
        break;
      
    }
  }

  public void thread57385(int [] tdone, int [] ends){
        switch(S56945){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        if(close_door1.getprestatus() || close_door2.getprestatus() || close_door3.getprestatus()){//sysj\ABSplant.sysj line: 791, column: 11
          System.out.println("Close Door");//sysj\ABSplant.sysj line: 793, column: 6
          active[81]=1;
          ends[81]=1;
          tdone[81]=1;
        }
        else {
          active[81]=1;
          ends[81]=1;
          tdone[81]=1;
        }
        break;
      
    }
  }

  public void thread57384(int [] tdone, int [] ends){
        switch(S56937){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        if(open_door1.getprestatus() || open_door2.getprestatus() || open_door3.getprestatus()){//sysj\ABSplant.sysj line: 782, column: 11
          System.out.println("Open Door");//sysj\ABSplant.sysj line: 784, column: 6
          active[80]=1;
          ends[80]=1;
          tdone[80]=1;
        }
        else {
          active[80]=1;
          ends[80]=1;
          tdone[80]=1;
        }
        break;
      
    }
  }

  public void thread57383(int [] tdone, int [] ends){
        switch(S57147){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        thread57384(tdone,ends);
        thread57385(tdone,ends);
        thread57386(tdone,ends);
        thread57387(tdone,ends);
        thread57388(tdone,ends);
        thread57389(tdone,ends);
        thread57390(tdone,ends);
        thread57391(tdone,ends);
        thread57392(tdone,ends);
        int biggest57393 = 0;
        if(ends[80]>=biggest57393){
          biggest57393=ends[80];
        }
        if(ends[81]>=biggest57393){
          biggest57393=ends[81];
        }
        if(ends[82]>=biggest57393){
          biggest57393=ends[82];
        }
        if(ends[83]>=biggest57393){
          biggest57393=ends[83];
        }
        if(ends[84]>=biggest57393){
          biggest57393=ends[84];
        }
        if(ends[85]>=biggest57393){
          biggest57393=ends[85];
        }
        if(ends[86]>=biggest57393){
          biggest57393=ends[86];
        }
        if(ends[87]>=biggest57393){
          biggest57393=ends[87];
        }
        if(ends[88]>=biggest57393){
          biggest57393=ends[88];
        }
        if(biggest57393 == 1){
          active[79]=1;
          ends[79]=1;
          tdone[79]=1;
        }
        //FINXME code
        if(biggest57393 == 0){
          thread57394(tdone,ends);
          thread57395(tdone,ends);
          thread57396(tdone,ends);
          thread57397(tdone,ends);
          thread57398(tdone,ends);
          thread57399(tdone,ends);
          thread57400(tdone,ends);
          thread57401(tdone,ends);
          thread57402(tdone,ends);
          int biggest57403 = 0;
          if(ends[80]>=biggest57403){
            biggest57403=ends[80];
          }
          if(ends[81]>=biggest57403){
            biggest57403=ends[81];
          }
          if(ends[82]>=biggest57403){
            biggest57403=ends[82];
          }
          if(ends[83]>=biggest57403){
            biggest57403=ends[83];
          }
          if(ends[84]>=biggest57403){
            biggest57403=ends[84];
          }
          if(ends[85]>=biggest57403){
            biggest57403=ends[85];
          }
          if(ends[86]>=biggest57403){
            biggest57403=ends[86];
          }
          if(ends[87]>=biggest57403){
            biggest57403=ends[87];
          }
          if(ends[88]>=biggest57403){
            biggest57403=ends[88];
          }
          if(biggest57403 == 1){
            active[79]=1;
            ends[79]=1;
            tdone[79]=1;
          }
        }
        break;
      
    }
  }

  public void thread57380(int [] tdone, int [] ends){
        S57195=1;
    if(close_door3.getprestatus()){//sysj\ABSplant.sysj line: 873, column: 24
      door3_closed.setPresent();//sysj\ABSplant.sysj line: 873, column: 37
      currsigs.addElement(door3_closed);
      active[95]=1;
      ends[95]=1;
      tdone[95]=1;
    }
    else {
      active[95]=1;
      ends[95]=1;
      tdone[95]=1;
    }
  }

  public void thread57379(int [] tdone, int [] ends){
        S57187=1;
    if(close_door2.getprestatus()){//sysj\ABSplant.sysj line: 871, column: 24
      door2_closed.setPresent();//sysj\ABSplant.sysj line: 871, column: 37
      currsigs.addElement(door2_closed);
      active[94]=1;
      ends[94]=1;
      tdone[94]=1;
    }
    else {
      active[94]=1;
      ends[94]=1;
      tdone[94]=1;
    }
  }

  public void thread57378(int [] tdone, int [] ends){
        S57179=1;
    if(close_door1.getprestatus()){//sysj\ABSplant.sysj line: 869, column: 24
      door1_closed.setPresent();//sysj\ABSplant.sysj line: 869, column: 37
      currsigs.addElement(door1_closed);
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
    else {
      active[93]=1;
      ends[93]=1;
      tdone[93]=1;
    }
  }

  public void thread57377(int [] tdone, int [] ends){
        S57171=1;
    if(open_door3.getprestatus()){//sysj\ABSplant.sysj line: 867, column: 24
      door3_opened.setPresent();//sysj\ABSplant.sysj line: 867, column: 36
      currsigs.addElement(door3_opened);
      ;//sysj\ABSplant.sysj line: 867, column: 55
      active[92]=1;
      ends[92]=1;
      tdone[92]=1;
    }
    else {
      ;//sysj\ABSplant.sysj line: 867, column: 55
      active[92]=1;
      ends[92]=1;
      tdone[92]=1;
    }
  }

  public void thread57376(int [] tdone, int [] ends){
        S57163=1;
    if(open_door2.getprestatus()){//sysj\ABSplant.sysj line: 865, column: 24
      door2_opened.setPresent();//sysj\ABSplant.sysj line: 865, column: 36
      currsigs.addElement(door2_opened);
      ;//sysj\ABSplant.sysj line: 865, column: 55
      active[91]=1;
      ends[91]=1;
      tdone[91]=1;
    }
    else {
      ;//sysj\ABSplant.sysj line: 865, column: 55
      active[91]=1;
      ends[91]=1;
      tdone[91]=1;
    }
  }

  public void thread57375(int [] tdone, int [] ends){
        S57155=1;
    if(open_door1.getprestatus()){//sysj\ABSplant.sysj line: 863, column: 24
      door1_opened.setPresent();//sysj\ABSplant.sysj line: 863, column: 36
      currsigs.addElement(door1_opened);
      ;//sysj\ABSplant.sysj line: 863, column: 55
      active[90]=1;
      ends[90]=1;
      tdone[90]=1;
    }
    else {
      ;//sysj\ABSplant.sysj line: 863, column: 55
      active[90]=1;
      ends[90]=1;
      tdone[90]=1;
    }
  }

  public void thread57374(int [] tdone, int [] ends){
        S57197=1;
    thread57375(tdone,ends);
    thread57376(tdone,ends);
    thread57377(tdone,ends);
    thread57378(tdone,ends);
    thread57379(tdone,ends);
    thread57380(tdone,ends);
    int biggest57381 = 0;
    if(ends[90]>=biggest57381){
      biggest57381=ends[90];
    }
    if(ends[91]>=biggest57381){
      biggest57381=ends[91];
    }
    if(ends[92]>=biggest57381){
      biggest57381=ends[92];
    }
    if(ends[93]>=biggest57381){
      biggest57381=ends[93];
    }
    if(ends[94]>=biggest57381){
      biggest57381=ends[94];
    }
    if(ends[95]>=biggest57381){
      biggest57381=ends[95];
    }
    if(biggest57381 == 1){
      active[89]=1;
      ends[89]=1;
      tdone[89]=1;
    }
  }

  public void thread57372(int [] tdone, int [] ends){
        S57001=1;
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread57371(int [] tdone, int [] ends){
        S56993=1;
    active[87]=1;
    ends[87]=1;
    tdone[87]=1;
  }

  public void thread57370(int [] tdone, int [] ends){
        S56985=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread57369(int [] tdone, int [] ends){
        S56977=1;
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread57368(int [] tdone, int [] ends){
        S56969=1;
    active[84]=1;
    ends[84]=1;
    tdone[84]=1;
  }

  public void thread57367(int [] tdone, int [] ends){
        S56961=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread57366(int [] tdone, int [] ends){
        S56953=1;
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread57365(int [] tdone, int [] ends){
        S56945=1;
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread57364(int [] tdone, int [] ends){
        S56937=1;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread57363(int [] tdone, int [] ends){
        S57147=1;
    thread57364(tdone,ends);
    thread57365(tdone,ends);
    thread57366(tdone,ends);
    thread57367(tdone,ends);
    thread57368(tdone,ends);
    thread57369(tdone,ends);
    thread57370(tdone,ends);
    thread57371(tdone,ends);
    thread57372(tdone,ends);
    int biggest57373 = 0;
    if(ends[80]>=biggest57373){
      biggest57373=ends[80];
    }
    if(ends[81]>=biggest57373){
      biggest57373=ends[81];
    }
    if(ends[82]>=biggest57373){
      biggest57373=ends[82];
    }
    if(ends[83]>=biggest57373){
      biggest57373=ends[83];
    }
    if(ends[84]>=biggest57373){
      biggest57373=ends[84];
    }
    if(ends[85]>=biggest57373){
      biggest57373=ends[85];
    }
    if(ends[86]>=biggest57373){
      biggest57373=ends[86];
    }
    if(ends[87]>=biggest57373){
      biggest57373=ends[87];
    }
    if(ends[88]>=biggest57373){
      biggest57373=ends[88];
    }
    if(biggest57373 == 1){
      active[79]=1;
      ends[79]=1;
      tdone[79]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S57199){
        case 0 : 
          S57199=0;
          break RUN;
        
        case 1 : 
          S57199=2;
          S57199=2;
          thread57363(tdone,ends);
          thread57374(tdone,ends);
          int biggest57382 = 0;
          if(ends[79]>=biggest57382){
            biggest57382=ends[79];
          }
          if(ends[89]>=biggest57382){
            biggest57382=ends[89];
          }
          if(biggest57382 == 1){
            active[78]=1;
            ends[78]=1;
            break RUN;
          }
        
        case 2 : 
          thread57383(tdone,ends);
          thread57404(tdone,ends);
          int biggest57412 = 0;
          if(ends[79]>=biggest57412){
            biggest57412=ends[79];
          }
          if(ends[89]>=biggest57412){
            biggest57412=ends[89];
          }
          if(biggest57412 == 1){
            active[78]=1;
            ends[78]=1;
            break RUN;
          }
          //FINXME code
          if(biggest57412 == 0){
            S57199=0;
            active[78]=0;
            ends[78]=0;
            S57199=0;
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
    while(active[78] != 0){
      int index = 78;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[78]!=0 || suspended[78]!=0 || active[78]!=1);
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
      if(paused[78]!=0 || suspended[78]!=0 || active[78]!=1);
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
      if(active[78] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
