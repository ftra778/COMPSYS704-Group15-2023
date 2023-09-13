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
  private int S1432 = 1;
  private int S1112 = 1;
  private int S902 = 1;
  private int S910 = 1;
  private int S918 = 1;
  private int S926 = 1;
  private int S934 = 1;
  private int S942 = 1;
  private int S950 = 1;
  private int S958 = 1;
  private int S966 = 1;
  private int S1162 = 1;
  private int S1120 = 1;
  private int S1114 = 1;
  private int S1128 = 1;
  private int S1136 = 1;
  private int S1144 = 1;
  private int S1152 = 1;
  private int S1160 = 1;
  
  private int[] ends = new int[19];
  private int[] tdone = new int[19];
  
  public void thread1481(int [] tdone, int [] ends){
        switch(S1160){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(close_door3.getprestatus()){//sysj\plant.sysj line: 107, column: 24
          door3_closed.setPresent();//sysj\plant.sysj line: 107, column: 37
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

  public void thread1480(int [] tdone, int [] ends){
        switch(S1152){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(close_door2.getprestatus()){//sysj\plant.sysj line: 105, column: 24
          door2_closed.setPresent();//sysj\plant.sysj line: 105, column: 37
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

  public void thread1479(int [] tdone, int [] ends){
        switch(S1144){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(close_door1.getprestatus()){//sysj\plant.sysj line: 103, column: 24
          door1_closed.setPresent();//sysj\plant.sysj line: 103, column: 37
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

  public void thread1478(int [] tdone, int [] ends){
        switch(S1136){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(open_door3.getprestatus()){//sysj\plant.sysj line: 101, column: 24
          door3_opened.setPresent();//sysj\plant.sysj line: 101, column: 36
          currsigs.addElement(door3_opened);
          ;//sysj\plant.sysj line: 101, column: 55
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          ;//sysj\plant.sysj line: 101, column: 55
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread1477(int [] tdone, int [] ends){
        switch(S1128){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(open_door2.getprestatus()){//sysj\plant.sysj line: 99, column: 24
          door2_opened.setPresent();//sysj\plant.sysj line: 99, column: 36
          currsigs.addElement(door2_opened);
          ;//sysj\plant.sysj line: 99, column: 55
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          ;//sysj\plant.sysj line: 99, column: 55
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread1476(int [] tdone, int [] ends){
        switch(S1120){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S1114){
          case 0 : 
            S1114=0;
            if(open_door1.getprestatus()){//sysj\plant.sysj line: 97, column: 24
              door1_opened.setPresent();//sysj\plant.sysj line: 97, column: 36
              currsigs.addElement(door1_opened);
              ;//sysj\plant.sysj line: 97, column: 55
              S1114=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              ;//sysj\plant.sysj line: 97, column: 55
              S1114=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S1114=1;
            S1114=0;
            if(open_door1.getprestatus()){//sysj\plant.sysj line: 97, column: 24
              door1_opened.setPresent();//sysj\plant.sysj line: 97, column: 36
              currsigs.addElement(door1_opened);
              ;//sysj\plant.sysj line: 97, column: 55
              S1114=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              ;//sysj\plant.sysj line: 97, column: 55
              S1114=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1475(int [] tdone, int [] ends){
        switch(S1162){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread1476(tdone,ends);
        thread1477(tdone,ends);
        thread1478(tdone,ends);
        thread1479(tdone,ends);
        thread1480(tdone,ends);
        thread1481(tdone,ends);
        int biggest1482 = 0;
        if(ends[13]>=biggest1482){
          biggest1482=ends[13];
        }
        if(ends[14]>=biggest1482){
          biggest1482=ends[14];
        }
        if(ends[15]>=biggest1482){
          biggest1482=ends[15];
        }
        if(ends[16]>=biggest1482){
          biggest1482=ends[16];
        }
        if(ends[17]>=biggest1482){
          biggest1482=ends[17];
        }
        if(ends[18]>=biggest1482){
          biggest1482=ends[18];
        }
        if(biggest1482 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest1482 == 0){
          S1162=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread1473(int [] tdone, int [] ends){
        S966=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread1472(int [] tdone, int [] ends){
        S958=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread1471(int [] tdone, int [] ends){
        S950=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1470(int [] tdone, int [] ends){
        S942=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread1469(int [] tdone, int [] ends){
        S934=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1468(int [] tdone, int [] ends){
        S926=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1467(int [] tdone, int [] ends){
        S918=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1466(int [] tdone, int [] ends){
        S910=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1465(int [] tdone, int [] ends){
        S902=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1463(int [] tdone, int [] ends){
        switch(S966){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(hp7.getprestatus()){//sysj\plant.sysj line: 83, column: 11
          System.out.println("Human Detected in zone 7");//sysj\plant.sysj line: 85, column: 6
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

  public void thread1462(int [] tdone, int [] ends){
        switch(S958){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(hp6.getprestatus()){//sysj\plant.sysj line: 75, column: 11
          System.out.println("Human Detected in zone 6");//sysj\plant.sysj line: 77, column: 6
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

  public void thread1461(int [] tdone, int [] ends){
        switch(S950){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(hp5.getprestatus()){//sysj\plant.sysj line: 67, column: 11
          System.out.println("Human Detected in zone 5");//sysj\plant.sysj line: 69, column: 6
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

  public void thread1460(int [] tdone, int [] ends){
        switch(S942){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(hp4.getprestatus()){//sysj\plant.sysj line: 59, column: 11
          System.out.println("Human Detected in zone 4");//sysj\plant.sysj line: 61, column: 6
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

  public void thread1459(int [] tdone, int [] ends){
        switch(S934){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(hp3.getprestatus()){//sysj\plant.sysj line: 51, column: 11
          System.out.println("Human Detected in zone 3");//sysj\plant.sysj line: 53, column: 6
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

  public void thread1458(int [] tdone, int [] ends){
        switch(S926){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(hp2.getprestatus()){//sysj\plant.sysj line: 43, column: 11
          System.out.println("Human Detected in zone 2");//sysj\plant.sysj line: 45, column: 6
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

  public void thread1457(int [] tdone, int [] ends){
        switch(S918){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(hp1.getprestatus()){//sysj\plant.sysj line: 35, column: 11
          System.out.println("Human Detected in zone 1");//sysj\plant.sysj line: 37, column: 6
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

  public void thread1456(int [] tdone, int [] ends){
        switch(S910){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(close_door1.getprestatus() || close_door2.getprestatus() || close_door3.getprestatus()){//sysj\plant.sysj line: 25, column: 11
          System.out.println("Close Door");//sysj\plant.sysj line: 27, column: 6
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

  public void thread1455(int [] tdone, int [] ends){
        switch(S902){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(open_door1.getprestatus() || open_door2.getprestatus() || open_door3.getprestatus()){//sysj\plant.sysj line: 16, column: 11
          System.out.println("Open Door");//sysj\plant.sysj line: 18, column: 6
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

  public void thread1454(int [] tdone, int [] ends){
        switch(S1112){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread1455(tdone,ends);
        thread1456(tdone,ends);
        thread1457(tdone,ends);
        thread1458(tdone,ends);
        thread1459(tdone,ends);
        thread1460(tdone,ends);
        thread1461(tdone,ends);
        thread1462(tdone,ends);
        thread1463(tdone,ends);
        int biggest1464 = 0;
        if(ends[3]>=biggest1464){
          biggest1464=ends[3];
        }
        if(ends[4]>=biggest1464){
          biggest1464=ends[4];
        }
        if(ends[5]>=biggest1464){
          biggest1464=ends[5];
        }
        if(ends[6]>=biggest1464){
          biggest1464=ends[6];
        }
        if(ends[7]>=biggest1464){
          biggest1464=ends[7];
        }
        if(ends[8]>=biggest1464){
          biggest1464=ends[8];
        }
        if(ends[9]>=biggest1464){
          biggest1464=ends[9];
        }
        if(ends[10]>=biggest1464){
          biggest1464=ends[10];
        }
        if(ends[11]>=biggest1464){
          biggest1464=ends[11];
        }
        if(biggest1464 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest1464 == 0){
          thread1465(tdone,ends);
          thread1466(tdone,ends);
          thread1467(tdone,ends);
          thread1468(tdone,ends);
          thread1469(tdone,ends);
          thread1470(tdone,ends);
          thread1471(tdone,ends);
          thread1472(tdone,ends);
          thread1473(tdone,ends);
          int biggest1474 = 0;
          if(ends[3]>=biggest1474){
            biggest1474=ends[3];
          }
          if(ends[4]>=biggest1474){
            biggest1474=ends[4];
          }
          if(ends[5]>=biggest1474){
            biggest1474=ends[5];
          }
          if(ends[6]>=biggest1474){
            biggest1474=ends[6];
          }
          if(ends[7]>=biggest1474){
            biggest1474=ends[7];
          }
          if(ends[8]>=biggest1474){
            biggest1474=ends[8];
          }
          if(ends[9]>=biggest1474){
            biggest1474=ends[9];
          }
          if(ends[10]>=biggest1474){
            biggest1474=ends[10];
          }
          if(ends[11]>=biggest1474){
            biggest1474=ends[11];
          }
          if(biggest1474 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread1451(int [] tdone, int [] ends){
        S1160=1;
    if(close_door3.getprestatus()){//sysj\plant.sysj line: 107, column: 24
      door3_closed.setPresent();//sysj\plant.sysj line: 107, column: 37
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

  public void thread1450(int [] tdone, int [] ends){
        S1152=1;
    if(close_door2.getprestatus()){//sysj\plant.sysj line: 105, column: 24
      door2_closed.setPresent();//sysj\plant.sysj line: 105, column: 37
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

  public void thread1449(int [] tdone, int [] ends){
        S1144=1;
    if(close_door1.getprestatus()){//sysj\plant.sysj line: 103, column: 24
      door1_closed.setPresent();//sysj\plant.sysj line: 103, column: 37
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

  public void thread1448(int [] tdone, int [] ends){
        S1136=1;
    if(open_door3.getprestatus()){//sysj\plant.sysj line: 101, column: 24
      door3_opened.setPresent();//sysj\plant.sysj line: 101, column: 36
      currsigs.addElement(door3_opened);
      ;//sysj\plant.sysj line: 101, column: 55
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      ;//sysj\plant.sysj line: 101, column: 55
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread1447(int [] tdone, int [] ends){
        S1128=1;
    if(open_door2.getprestatus()){//sysj\plant.sysj line: 99, column: 24
      door2_opened.setPresent();//sysj\plant.sysj line: 99, column: 36
      currsigs.addElement(door2_opened);
      ;//sysj\plant.sysj line: 99, column: 55
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      ;//sysj\plant.sysj line: 99, column: 55
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread1446(int [] tdone, int [] ends){
        S1120=1;
    S1114=0;
    if(open_door1.getprestatus()){//sysj\plant.sysj line: 97, column: 24
      door1_opened.setPresent();//sysj\plant.sysj line: 97, column: 36
      currsigs.addElement(door1_opened);
      ;//sysj\plant.sysj line: 97, column: 55
      S1114=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      ;//sysj\plant.sysj line: 97, column: 55
      S1114=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread1445(int [] tdone, int [] ends){
        S1162=1;
    thread1446(tdone,ends);
    thread1447(tdone,ends);
    thread1448(tdone,ends);
    thread1449(tdone,ends);
    thread1450(tdone,ends);
    thread1451(tdone,ends);
    int biggest1452 = 0;
    if(ends[13]>=biggest1452){
      biggest1452=ends[13];
    }
    if(ends[14]>=biggest1452){
      biggest1452=ends[14];
    }
    if(ends[15]>=biggest1452){
      biggest1452=ends[15];
    }
    if(ends[16]>=biggest1452){
      biggest1452=ends[16];
    }
    if(ends[17]>=biggest1452){
      biggest1452=ends[17];
    }
    if(ends[18]>=biggest1452){
      biggest1452=ends[18];
    }
    if(biggest1452 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread1443(int [] tdone, int [] ends){
        S966=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread1442(int [] tdone, int [] ends){
        S958=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread1441(int [] tdone, int [] ends){
        S950=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1440(int [] tdone, int [] ends){
        S942=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread1439(int [] tdone, int [] ends){
        S934=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1438(int [] tdone, int [] ends){
        S926=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1437(int [] tdone, int [] ends){
        S918=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1436(int [] tdone, int [] ends){
        S910=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1435(int [] tdone, int [] ends){
        S902=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1434(int [] tdone, int [] ends){
        S1112=1;
    thread1435(tdone,ends);
    thread1436(tdone,ends);
    thread1437(tdone,ends);
    thread1438(tdone,ends);
    thread1439(tdone,ends);
    thread1440(tdone,ends);
    thread1441(tdone,ends);
    thread1442(tdone,ends);
    thread1443(tdone,ends);
    int biggest1444 = 0;
    if(ends[3]>=biggest1444){
      biggest1444=ends[3];
    }
    if(ends[4]>=biggest1444){
      biggest1444=ends[4];
    }
    if(ends[5]>=biggest1444){
      biggest1444=ends[5];
    }
    if(ends[6]>=biggest1444){
      biggest1444=ends[6];
    }
    if(ends[7]>=biggest1444){
      biggest1444=ends[7];
    }
    if(ends[8]>=biggest1444){
      biggest1444=ends[8];
    }
    if(ends[9]>=biggest1444){
      biggest1444=ends[9];
    }
    if(ends[10]>=biggest1444){
      biggest1444=ends[10];
    }
    if(ends[11]>=biggest1444){
      biggest1444=ends[11];
    }
    if(biggest1444 == 1){
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
      switch(S1432){
        case 0 : 
          S1432=0;
          break RUN;
        
        case 1 : 
          S1432=2;
          S1432=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 10, column: 2
          thread1434(tdone,ends);
          thread1445(tdone,ends);
          int biggest1453 = 0;
          if(ends[2]>=biggest1453){
            biggest1453=ends[2];
          }
          if(ends[12]>=biggest1453){
            biggest1453=ends[12];
          }
          if(biggest1453 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1454(tdone,ends);
          thread1475(tdone,ends);
          int biggest1483 = 0;
          if(ends[2]>=biggest1483){
            biggest1483=ends[2];
          }
          if(ends[12]>=biggest1483){
            biggest1483=ends[12];
          }
          if(biggest1483 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1483 == 0){
            S1432=0;
            active[1]=0;
            ends[1]=0;
            S1432=0;
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
