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
  public Signal open_door1 = new Signal("open_door1", Signal.INPUT);
  public Signal open_door2 = new Signal("open_door2", Signal.INPUT);
  public Signal open_door3 = new Signal("open_door3", Signal.INPUT);
  public Signal close_door1 = new Signal("close_door1", Signal.INPUT);
  public Signal close_door2 = new Signal("close_door2", Signal.INPUT);
  public Signal close_door3 = new Signal("close_door3", Signal.INPUT);
  public Signal hp1 = new Signal("hp1", Signal.INPUT);
  public Signal hp2 = new Signal("hp2", Signal.INPUT);
  public Signal hp3 = new Signal("hp3", Signal.INPUT);
  public Signal door1_opened = new Signal("door1_opened", Signal.OUTPUT);
  public Signal door2_opened = new Signal("door2_opened", Signal.OUTPUT);
  public Signal door3_opened = new Signal("door3_opened", Signal.OUTPUT);
  public Signal door1_closed = new Signal("door1_closed", Signal.OUTPUT);
  public Signal door2_closed = new Signal("door2_closed", Signal.OUTPUT);
  public Signal door3_closed = new Signal("door3_closed", Signal.OUTPUT);
  private int S1448 = 1;
  private int S1314 = 1;
  private int S1284 = 1;
  private int S1364 = 1;
  private int S1322 = 1;
  private int S1316 = 1;
  private int S1330 = 1;
  private int S1338 = 1;
  private int S1346 = 1;
  private int S1354 = 1;
  private int S1362 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread1467(int [] tdone, int [] ends){
        switch(S1362){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(close_door3.getprestatus()){//sysj\plant.sysj line: 59, column: 24
          door3_closed.setPresent();//sysj\plant.sysj line: 59, column: 37
          currsigs.addElement(door3_closed);
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

  public void thread1466(int [] tdone, int [] ends){
        switch(S1354){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(close_door2.getprestatus()){//sysj\plant.sysj line: 57, column: 24
          door2_closed.setPresent();//sysj\plant.sysj line: 57, column: 37
          currsigs.addElement(door2_closed);
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

  public void thread1465(int [] tdone, int [] ends){
        switch(S1346){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(close_door1.getprestatus()){//sysj\plant.sysj line: 55, column: 24
          door1_closed.setPresent();//sysj\plant.sysj line: 55, column: 37
          currsigs.addElement(door1_closed);
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

  public void thread1464(int [] tdone, int [] ends){
        switch(S1338){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(open_door3.getprestatus()){//sysj\plant.sysj line: 53, column: 24
          door3_opened.setPresent();//sysj\plant.sysj line: 53, column: 36
          currsigs.addElement(door3_opened);
          ;//sysj\plant.sysj line: 53, column: 55
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          ;//sysj\plant.sysj line: 53, column: 55
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread1463(int [] tdone, int [] ends){
        switch(S1330){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(open_door2.getprestatus()){//sysj\plant.sysj line: 51, column: 24
          door2_opened.setPresent();//sysj\plant.sysj line: 51, column: 36
          currsigs.addElement(door2_opened);
          ;//sysj\plant.sysj line: 51, column: 55
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          ;//sysj\plant.sysj line: 51, column: 55
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread1462(int [] tdone, int [] ends){
        switch(S1322){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1316){
          case 0 : 
            S1316=0;
            if(open_door1.getprestatus()){//sysj\plant.sysj line: 49, column: 24
              door1_opened.setPresent();//sysj\plant.sysj line: 49, column: 36
              currsigs.addElement(door1_opened);
              ;//sysj\plant.sysj line: 49, column: 55
              S1316=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              ;//sysj\plant.sysj line: 49, column: 55
              S1316=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S1316=1;
            S1316=0;
            if(open_door1.getprestatus()){//sysj\plant.sysj line: 49, column: 24
              door1_opened.setPresent();//sysj\plant.sysj line: 49, column: 36
              currsigs.addElement(door1_opened);
              ;//sysj\plant.sysj line: 49, column: 55
              S1316=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              ;//sysj\plant.sysj line: 49, column: 55
              S1316=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1461(int [] tdone, int [] ends){
        switch(S1364){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread1462(tdone,ends);
        thread1463(tdone,ends);
        thread1464(tdone,ends);
        thread1465(tdone,ends);
        thread1466(tdone,ends);
        thread1467(tdone,ends);
        int biggest1468 = 0;
        if(ends[4]>=biggest1468){
          biggest1468=ends[4];
        }
        if(ends[5]>=biggest1468){
          biggest1468=ends[5];
        }
        if(ends[6]>=biggest1468){
          biggest1468=ends[6];
        }
        if(ends[7]>=biggest1468){
          biggest1468=ends[7];
        }
        if(ends[8]>=biggest1468){
          biggest1468=ends[8];
        }
        if(ends[9]>=biggest1468){
          biggest1468=ends[9];
        }
        if(biggest1468 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest1468 == 0){
          S1364=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread1460(int [] tdone, int [] ends){
        switch(S1314){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1284){
          case 0 : 
            if(open_door1.getprestatus() || open_door2.getprestatus() || open_door3.getprestatus()){//sysj\plant.sysj line: 14, column: 10
              System.out.println("Open Door");//sysj\plant.sysj line: 16, column: 5
              S1284=1;
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
          
          case 1 : 
            if(close_door1.getprestatus() || close_door2.getprestatus() || close_door3.getprestatus()){//sysj\plant.sysj line: 19, column: 10
              System.out.println("Close Door");//sysj\plant.sysj line: 21, column: 5
              S1284=2;
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
            if(hp1.getprestatus()){//sysj\plant.sysj line: 25, column: 10
              System.out.println("Human Detected in zone 1 & 7");//sysj\plant.sysj line: 27, column: 5
              S1284=3;
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
          
          case 3 : 
            if(hp2.getprestatus()){//sysj\plant.sysj line: 30, column: 10
              System.out.println("Human Detected in zone 2 & 3");//sysj\plant.sysj line: 32, column: 5
              S1284=4;
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
          
          case 4 : 
            if(hp3.getprestatus()){//sysj\plant.sysj line: 35, column: 10
              System.out.println("Human Detected in zone 4 & 5 & 6");//sysj\plant.sysj line: 37, column: 5
              S1284=0;
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

  public void thread1457(int [] tdone, int [] ends){
        S1362=1;
    if(close_door3.getprestatus()){//sysj\plant.sysj line: 59, column: 24
      door3_closed.setPresent();//sysj\plant.sysj line: 59, column: 37
      currsigs.addElement(door3_closed);
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

  public void thread1456(int [] tdone, int [] ends){
        S1354=1;
    if(close_door2.getprestatus()){//sysj\plant.sysj line: 57, column: 24
      door2_closed.setPresent();//sysj\plant.sysj line: 57, column: 37
      currsigs.addElement(door2_closed);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1455(int [] tdone, int [] ends){
        S1346=1;
    if(close_door1.getprestatus()){//sysj\plant.sysj line: 55, column: 24
      door1_closed.setPresent();//sysj\plant.sysj line: 55, column: 37
      currsigs.addElement(door1_closed);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1454(int [] tdone, int [] ends){
        S1338=1;
    if(open_door3.getprestatus()){//sysj\plant.sysj line: 53, column: 24
      door3_opened.setPresent();//sysj\plant.sysj line: 53, column: 36
      currsigs.addElement(door3_opened);
      ;//sysj\plant.sysj line: 53, column: 55
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      ;//sysj\plant.sysj line: 53, column: 55
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1453(int [] tdone, int [] ends){
        S1330=1;
    if(open_door2.getprestatus()){//sysj\plant.sysj line: 51, column: 24
      door2_opened.setPresent();//sysj\plant.sysj line: 51, column: 36
      currsigs.addElement(door2_opened);
      ;//sysj\plant.sysj line: 51, column: 55
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      ;//sysj\plant.sysj line: 51, column: 55
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1452(int [] tdone, int [] ends){
        S1322=1;
    S1316=0;
    if(open_door1.getprestatus()){//sysj\plant.sysj line: 49, column: 24
      door1_opened.setPresent();//sysj\plant.sysj line: 49, column: 36
      currsigs.addElement(door1_opened);
      ;//sysj\plant.sysj line: 49, column: 55
      S1316=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      ;//sysj\plant.sysj line: 49, column: 55
      S1316=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1451(int [] tdone, int [] ends){
        S1364=1;
    thread1452(tdone,ends);
    thread1453(tdone,ends);
    thread1454(tdone,ends);
    thread1455(tdone,ends);
    thread1456(tdone,ends);
    thread1457(tdone,ends);
    int biggest1458 = 0;
    if(ends[4]>=biggest1458){
      biggest1458=ends[4];
    }
    if(ends[5]>=biggest1458){
      biggest1458=ends[5];
    }
    if(ends[6]>=biggest1458){
      biggest1458=ends[6];
    }
    if(ends[7]>=biggest1458){
      biggest1458=ends[7];
    }
    if(ends[8]>=biggest1458){
      biggest1458=ends[8];
    }
    if(ends[9]>=biggest1458){
      biggest1458=ends[9];
    }
    if(biggest1458 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1450(int [] tdone, int [] ends){
        S1314=1;
    S1284=0;
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
      switch(S1448){
        case 0 : 
          S1448=0;
          break RUN;
        
        case 1 : 
          S1448=2;
          S1448=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 10, column: 2
          thread1450(tdone,ends);
          thread1451(tdone,ends);
          int biggest1459 = 0;
          if(ends[2]>=biggest1459){
            biggest1459=ends[2];
          }
          if(ends[3]>=biggest1459){
            biggest1459=ends[3];
          }
          if(biggest1459 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1460(tdone,ends);
          thread1461(tdone,ends);
          int biggest1469 = 0;
          if(ends[2]>=biggest1469){
            biggest1469=ends[2];
          }
          if(ends[3]>=biggest1469){
            biggest1469=ends[3];
          }
          if(biggest1469 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1469 == 0){
            S1448=0;
            active[1]=0;
            ends[1]=0;
            S1448=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
