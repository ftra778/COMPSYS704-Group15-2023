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
  private int S44664 = 1;
  private int S44612 = 1;
  private int S44402 = 1;
  private int S44410 = 1;
  private int S44418 = 1;
  private int S44426 = 1;
  private int S44434 = 1;
  private int S44442 = 1;
  private int S44450 = 1;
  private int S44458 = 1;
  private int S44466 = 1;
  private int S44662 = 1;
  private int S44620 = 1;
  private int S44628 = 1;
  private int S44636 = 1;
  private int S44644 = 1;
  private int S44652 = 1;
  private int S44660 = 1;
  
  private int[] ends = new int[74];
  private int[] tdone = new int[74];
  
  public void thread44829(int [] tdone, int [] ends){
        switch(S44660){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        if(close_door3.getprestatus()){//sysj\ABSplant.sysj line: 599, column: 24
          door3_closed.setPresent();//sysj\ABSplant.sysj line: 599, column: 37
          currsigs.addElement(door3_closed);
          active[73]=1;
          ends[73]=1;
          tdone[73]=1;
        }
        else {
          active[73]=1;
          ends[73]=1;
          tdone[73]=1;
        }
        break;
      
    }
  }

  public void thread44828(int [] tdone, int [] ends){
        switch(S44652){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        if(close_door2.getprestatus()){//sysj\ABSplant.sysj line: 597, column: 24
          door2_closed.setPresent();//sysj\ABSplant.sysj line: 597, column: 37
          currsigs.addElement(door2_closed);
          active[72]=1;
          ends[72]=1;
          tdone[72]=1;
        }
        else {
          active[72]=1;
          ends[72]=1;
          tdone[72]=1;
        }
        break;
      
    }
  }

  public void thread44827(int [] tdone, int [] ends){
        switch(S44644){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        if(close_door1.getprestatus()){//sysj\ABSplant.sysj line: 595, column: 24
          door1_closed.setPresent();//sysj\ABSplant.sysj line: 595, column: 37
          currsigs.addElement(door1_closed);
          active[71]=1;
          ends[71]=1;
          tdone[71]=1;
        }
        else {
          active[71]=1;
          ends[71]=1;
          tdone[71]=1;
        }
        break;
      
    }
  }

  public void thread44826(int [] tdone, int [] ends){
        switch(S44636){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        if(open_door3.getprestatus()){//sysj\ABSplant.sysj line: 593, column: 24
          door3_opened.setPresent();//sysj\ABSplant.sysj line: 593, column: 36
          currsigs.addElement(door3_opened);
          ;//sysj\ABSplant.sysj line: 593, column: 55
          active[70]=1;
          ends[70]=1;
          tdone[70]=1;
        }
        else {
          ;//sysj\ABSplant.sysj line: 593, column: 55
          active[70]=1;
          ends[70]=1;
          tdone[70]=1;
        }
        break;
      
    }
  }

  public void thread44825(int [] tdone, int [] ends){
        switch(S44628){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        if(open_door2.getprestatus()){//sysj\ABSplant.sysj line: 591, column: 24
          door2_opened.setPresent();//sysj\ABSplant.sysj line: 591, column: 36
          currsigs.addElement(door2_opened);
          ;//sysj\ABSplant.sysj line: 591, column: 55
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
        else {
          ;//sysj\ABSplant.sysj line: 591, column: 55
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
        break;
      
    }
  }

  public void thread44824(int [] tdone, int [] ends){
        switch(S44620){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        if(open_door1.getprestatus()){//sysj\ABSplant.sysj line: 589, column: 24
          door1_opened.setPresent();//sysj\ABSplant.sysj line: 589, column: 36
          currsigs.addElement(door1_opened);
          ;//sysj\ABSplant.sysj line: 589, column: 55
          active[68]=1;
          ends[68]=1;
          tdone[68]=1;
        }
        else {
          ;//sysj\ABSplant.sysj line: 589, column: 55
          active[68]=1;
          ends[68]=1;
          tdone[68]=1;
        }
        break;
      
    }
  }

  public void thread44823(int [] tdone, int [] ends){
        switch(S44662){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        thread44824(tdone,ends);
        thread44825(tdone,ends);
        thread44826(tdone,ends);
        thread44827(tdone,ends);
        thread44828(tdone,ends);
        thread44829(tdone,ends);
        int biggest44830 = 0;
        if(ends[68]>=biggest44830){
          biggest44830=ends[68];
        }
        if(ends[69]>=biggest44830){
          biggest44830=ends[69];
        }
        if(ends[70]>=biggest44830){
          biggest44830=ends[70];
        }
        if(ends[71]>=biggest44830){
          biggest44830=ends[71];
        }
        if(ends[72]>=biggest44830){
          biggest44830=ends[72];
        }
        if(ends[73]>=biggest44830){
          biggest44830=ends[73];
        }
        if(biggest44830 == 1){
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
        //FINXME code
        if(biggest44830 == 0){
          S44662=0;
          active[67]=0;
          ends[67]=0;
          tdone[67]=1;
        }
        break;
      
    }
  }

  public void thread44821(int [] tdone, int [] ends){
        S44466=1;
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread44820(int [] tdone, int [] ends){
        S44458=1;
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread44819(int [] tdone, int [] ends){
        S44450=1;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread44818(int [] tdone, int [] ends){
        S44442=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread44817(int [] tdone, int [] ends){
        S44434=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread44816(int [] tdone, int [] ends){
        S44426=1;
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread44815(int [] tdone, int [] ends){
        S44418=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread44814(int [] tdone, int [] ends){
        S44410=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread44813(int [] tdone, int [] ends){
        S44402=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread44811(int [] tdone, int [] ends){
        switch(S44466){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        if(hp7.getprestatus()){//sysj\ABSplant.sysj line: 575, column: 11
          System.out.println("Human Detected in zone 7");//sysj\ABSplant.sysj line: 577, column: 6
          active[66]=1;
          ends[66]=1;
          tdone[66]=1;
        }
        else {
          active[66]=1;
          ends[66]=1;
          tdone[66]=1;
        }
        break;
      
    }
  }

  public void thread44810(int [] tdone, int [] ends){
        switch(S44458){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        if(hp6.getprestatus()){//sysj\ABSplant.sysj line: 567, column: 11
          System.out.println("Human Detected in zone 6");//sysj\ABSplant.sysj line: 569, column: 6
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
        else {
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
        break;
      
    }
  }

  public void thread44809(int [] tdone, int [] ends){
        switch(S44450){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        if(hp5.getprestatus()){//sysj\ABSplant.sysj line: 559, column: 11
          System.out.println("Human Detected in zone 5");//sysj\ABSplant.sysj line: 561, column: 6
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        else {
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        break;
      
    }
  }

  public void thread44808(int [] tdone, int [] ends){
        switch(S44442){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        if(hp4.getprestatus()){//sysj\ABSplant.sysj line: 551, column: 11
          System.out.println("Human Detected in zone 4");//sysj\ABSplant.sysj line: 553, column: 6
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
        else {
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
        break;
      
    }
  }

  public void thread44807(int [] tdone, int [] ends){
        switch(S44434){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        if(hp3.getprestatus()){//sysj\ABSplant.sysj line: 543, column: 11
          System.out.println("Human Detected in zone 3");//sysj\ABSplant.sysj line: 545, column: 6
          active[62]=1;
          ends[62]=1;
          tdone[62]=1;
        }
        else {
          active[62]=1;
          ends[62]=1;
          tdone[62]=1;
        }
        break;
      
    }
  }

  public void thread44806(int [] tdone, int [] ends){
        switch(S44426){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        if(hp2.getprestatus()){//sysj\ABSplant.sysj line: 535, column: 11
          System.out.println("Human Detected in zone 2");//sysj\ABSplant.sysj line: 537, column: 6
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        else {
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        break;
      
    }
  }

  public void thread44805(int [] tdone, int [] ends){
        switch(S44418){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        if(hp1.getprestatus()){//sysj\ABSplant.sysj line: 527, column: 11
          System.out.println("Human Detected in zone 1");//sysj\ABSplant.sysj line: 529, column: 6
          active[60]=1;
          ends[60]=1;
          tdone[60]=1;
        }
        else {
          active[60]=1;
          ends[60]=1;
          tdone[60]=1;
        }
        break;
      
    }
  }

  public void thread44804(int [] tdone, int [] ends){
        switch(S44410){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        if(close_door1.getprestatus() || close_door2.getprestatus() || close_door3.getprestatus()){//sysj\ABSplant.sysj line: 517, column: 11
          System.out.println("Close Door");//sysj\ABSplant.sysj line: 519, column: 6
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        else {
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        break;
      
    }
  }

  public void thread44803(int [] tdone, int [] ends){
        switch(S44402){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        if(open_door1.getprestatus() || open_door2.getprestatus() || open_door3.getprestatus()){//sysj\ABSplant.sysj line: 508, column: 11
          System.out.println("Open Door");//sysj\ABSplant.sysj line: 510, column: 6
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

  public void thread44802(int [] tdone, int [] ends){
        switch(S44612){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        thread44803(tdone,ends);
        thread44804(tdone,ends);
        thread44805(tdone,ends);
        thread44806(tdone,ends);
        thread44807(tdone,ends);
        thread44808(tdone,ends);
        thread44809(tdone,ends);
        thread44810(tdone,ends);
        thread44811(tdone,ends);
        int biggest44812 = 0;
        if(ends[58]>=biggest44812){
          biggest44812=ends[58];
        }
        if(ends[59]>=biggest44812){
          biggest44812=ends[59];
        }
        if(ends[60]>=biggest44812){
          biggest44812=ends[60];
        }
        if(ends[61]>=biggest44812){
          biggest44812=ends[61];
        }
        if(ends[62]>=biggest44812){
          biggest44812=ends[62];
        }
        if(ends[63]>=biggest44812){
          biggest44812=ends[63];
        }
        if(ends[64]>=biggest44812){
          biggest44812=ends[64];
        }
        if(ends[65]>=biggest44812){
          biggest44812=ends[65];
        }
        if(ends[66]>=biggest44812){
          biggest44812=ends[66];
        }
        if(biggest44812 == 1){
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        //FINXME code
        if(biggest44812 == 0){
          thread44813(tdone,ends);
          thread44814(tdone,ends);
          thread44815(tdone,ends);
          thread44816(tdone,ends);
          thread44817(tdone,ends);
          thread44818(tdone,ends);
          thread44819(tdone,ends);
          thread44820(tdone,ends);
          thread44821(tdone,ends);
          int biggest44822 = 0;
          if(ends[58]>=biggest44822){
            biggest44822=ends[58];
          }
          if(ends[59]>=biggest44822){
            biggest44822=ends[59];
          }
          if(ends[60]>=biggest44822){
            biggest44822=ends[60];
          }
          if(ends[61]>=biggest44822){
            biggest44822=ends[61];
          }
          if(ends[62]>=biggest44822){
            biggest44822=ends[62];
          }
          if(ends[63]>=biggest44822){
            biggest44822=ends[63];
          }
          if(ends[64]>=biggest44822){
            biggest44822=ends[64];
          }
          if(ends[65]>=biggest44822){
            biggest44822=ends[65];
          }
          if(ends[66]>=biggest44822){
            biggest44822=ends[66];
          }
          if(biggest44822 == 1){
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        break;
      
    }
  }

  public void thread44799(int [] tdone, int [] ends){
        S44660=1;
    if(close_door3.getprestatus()){//sysj\ABSplant.sysj line: 599, column: 24
      door3_closed.setPresent();//sysj\ABSplant.sysj line: 599, column: 37
      currsigs.addElement(door3_closed);
      active[73]=1;
      ends[73]=1;
      tdone[73]=1;
    }
    else {
      active[73]=1;
      ends[73]=1;
      tdone[73]=1;
    }
  }

  public void thread44798(int [] tdone, int [] ends){
        S44652=1;
    if(close_door2.getprestatus()){//sysj\ABSplant.sysj line: 597, column: 24
      door2_closed.setPresent();//sysj\ABSplant.sysj line: 597, column: 37
      currsigs.addElement(door2_closed);
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
    else {
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
  }

  public void thread44797(int [] tdone, int [] ends){
        S44644=1;
    if(close_door1.getprestatus()){//sysj\ABSplant.sysj line: 595, column: 24
      door1_closed.setPresent();//sysj\ABSplant.sysj line: 595, column: 37
      currsigs.addElement(door1_closed);
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
    else {
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
  }

  public void thread44796(int [] tdone, int [] ends){
        S44636=1;
    if(open_door3.getprestatus()){//sysj\ABSplant.sysj line: 593, column: 24
      door3_opened.setPresent();//sysj\ABSplant.sysj line: 593, column: 36
      currsigs.addElement(door3_opened);
      ;//sysj\ABSplant.sysj line: 593, column: 55
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
    else {
      ;//sysj\ABSplant.sysj line: 593, column: 55
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread44795(int [] tdone, int [] ends){
        S44628=1;
    if(open_door2.getprestatus()){//sysj\ABSplant.sysj line: 591, column: 24
      door2_opened.setPresent();//sysj\ABSplant.sysj line: 591, column: 36
      currsigs.addElement(door2_opened);
      ;//sysj\ABSplant.sysj line: 591, column: 55
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      ;//sysj\ABSplant.sysj line: 591, column: 55
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread44794(int [] tdone, int [] ends){
        S44620=1;
    if(open_door1.getprestatus()){//sysj\ABSplant.sysj line: 589, column: 24
      door1_opened.setPresent();//sysj\ABSplant.sysj line: 589, column: 36
      currsigs.addElement(door1_opened);
      ;//sysj\ABSplant.sysj line: 589, column: 55
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
    else {
      ;//sysj\ABSplant.sysj line: 589, column: 55
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
  }

  public void thread44793(int [] tdone, int [] ends){
        S44662=1;
    thread44794(tdone,ends);
    thread44795(tdone,ends);
    thread44796(tdone,ends);
    thread44797(tdone,ends);
    thread44798(tdone,ends);
    thread44799(tdone,ends);
    int biggest44800 = 0;
    if(ends[68]>=biggest44800){
      biggest44800=ends[68];
    }
    if(ends[69]>=biggest44800){
      biggest44800=ends[69];
    }
    if(ends[70]>=biggest44800){
      biggest44800=ends[70];
    }
    if(ends[71]>=biggest44800){
      biggest44800=ends[71];
    }
    if(ends[72]>=biggest44800){
      biggest44800=ends[72];
    }
    if(ends[73]>=biggest44800){
      biggest44800=ends[73];
    }
    if(biggest44800 == 1){
      active[67]=1;
      ends[67]=1;
      tdone[67]=1;
    }
  }

  public void thread44791(int [] tdone, int [] ends){
        S44466=1;
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread44790(int [] tdone, int [] ends){
        S44458=1;
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread44789(int [] tdone, int [] ends){
        S44450=1;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread44788(int [] tdone, int [] ends){
        S44442=1;
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread44787(int [] tdone, int [] ends){
        S44434=1;
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread44786(int [] tdone, int [] ends){
        S44426=1;
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread44785(int [] tdone, int [] ends){
        S44418=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread44784(int [] tdone, int [] ends){
        S44410=1;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread44783(int [] tdone, int [] ends){
        S44402=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread44782(int [] tdone, int [] ends){
        S44612=1;
    thread44783(tdone,ends);
    thread44784(tdone,ends);
    thread44785(tdone,ends);
    thread44786(tdone,ends);
    thread44787(tdone,ends);
    thread44788(tdone,ends);
    thread44789(tdone,ends);
    thread44790(tdone,ends);
    thread44791(tdone,ends);
    int biggest44792 = 0;
    if(ends[58]>=biggest44792){
      biggest44792=ends[58];
    }
    if(ends[59]>=biggest44792){
      biggest44792=ends[59];
    }
    if(ends[60]>=biggest44792){
      biggest44792=ends[60];
    }
    if(ends[61]>=biggest44792){
      biggest44792=ends[61];
    }
    if(ends[62]>=biggest44792){
      biggest44792=ends[62];
    }
    if(ends[63]>=biggest44792){
      biggest44792=ends[63];
    }
    if(ends[64]>=biggest44792){
      biggest44792=ends[64];
    }
    if(ends[65]>=biggest44792){
      biggest44792=ends[65];
    }
    if(ends[66]>=biggest44792){
      biggest44792=ends[66];
    }
    if(biggest44792 == 1){
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S44664){
        case 0 : 
          S44664=0;
          break RUN;
        
        case 1 : 
          S44664=2;
          S44664=2;
          thread44782(tdone,ends);
          thread44793(tdone,ends);
          int biggest44801 = 0;
          if(ends[57]>=biggest44801){
            biggest44801=ends[57];
          }
          if(ends[67]>=biggest44801){
            biggest44801=ends[67];
          }
          if(biggest44801 == 1){
            active[56]=1;
            ends[56]=1;
            break RUN;
          }
        
        case 2 : 
          thread44802(tdone,ends);
          thread44823(tdone,ends);
          int biggest44831 = 0;
          if(ends[57]>=biggest44831){
            biggest44831=ends[57];
          }
          if(ends[67]>=biggest44831){
            biggest44831=ends[67];
          }
          if(biggest44831 == 1){
            active[56]=1;
            ends[56]=1;
            break RUN;
          }
          //FINXME code
          if(biggest44831 == 0){
            S44664=0;
            active[56]=0;
            ends[56]=0;
            S44664=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[56] != 0){
      int index = 56;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[56]!=0 || suspended[56]!=0 || active[56]!=1);
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
      if(paused[56]!=0 || suspended[56]!=0 || active[56]!=1);
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
      if(active[56] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
