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
  private int S47452 = 1;
  private int S47132 = 1;
  private int S46922 = 1;
  private int S46930 = 1;
  private int S46938 = 1;
  private int S46946 = 1;
  private int S46954 = 1;
  private int S46962 = 1;
  private int S46970 = 1;
  private int S46978 = 1;
  private int S46986 = 1;
  private int S47182 = 1;
  private int S47140 = 1;
  private int S47134 = 1;
  private int S47148 = 1;
  private int S47156 = 1;
  private int S47164 = 1;
  private int S47172 = 1;
  private int S47180 = 1;
  
  private int[] ends = new int[19];
  private int[] tdone = new int[19];
  
  public void thread47501(int [] tdone, int [] ends){
        switch(S47180){
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

  public void thread47500(int [] tdone, int [] ends){
        switch(S47172){
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

  public void thread47499(int [] tdone, int [] ends){
        switch(S47164){
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

  public void thread47498(int [] tdone, int [] ends){
        switch(S47156){
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

  public void thread47497(int [] tdone, int [] ends){
        switch(S47148){
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

  public void thread47496(int [] tdone, int [] ends){
        switch(S47140){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S47134){
          case 0 : 
            S47134=0;
            if(open_door1.getprestatus()){//sysj\SACSplant.sysj line: 97, column: 24
              door1_opened.setPresent();//sysj\SACSplant.sysj line: 97, column: 36
              currsigs.addElement(door1_opened);
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S47134=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S47134=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S47134=1;
            S47134=0;
            if(open_door1.getprestatus()){//sysj\SACSplant.sysj line: 97, column: 24
              door1_opened.setPresent();//sysj\SACSplant.sysj line: 97, column: 36
              currsigs.addElement(door1_opened);
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S47134=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S47134=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47495(int [] tdone, int [] ends){
        switch(S47182){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread47496(tdone,ends);
        thread47497(tdone,ends);
        thread47498(tdone,ends);
        thread47499(tdone,ends);
        thread47500(tdone,ends);
        thread47501(tdone,ends);
        int biggest47502 = 0;
        if(ends[13]>=biggest47502){
          biggest47502=ends[13];
        }
        if(ends[14]>=biggest47502){
          biggest47502=ends[14];
        }
        if(ends[15]>=biggest47502){
          biggest47502=ends[15];
        }
        if(ends[16]>=biggest47502){
          biggest47502=ends[16];
        }
        if(ends[17]>=biggest47502){
          biggest47502=ends[17];
        }
        if(ends[18]>=biggest47502){
          biggest47502=ends[18];
        }
        if(biggest47502 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest47502 == 0){
          S47182=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread47493(int [] tdone, int [] ends){
        S46986=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread47492(int [] tdone, int [] ends){
        S46978=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread47491(int [] tdone, int [] ends){
        S46970=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread47490(int [] tdone, int [] ends){
        S46962=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread47489(int [] tdone, int [] ends){
        S46954=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread47488(int [] tdone, int [] ends){
        S46946=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread47487(int [] tdone, int [] ends){
        S46938=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread47486(int [] tdone, int [] ends){
        S46930=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread47485(int [] tdone, int [] ends){
        S46922=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread47483(int [] tdone, int [] ends){
        switch(S46986){
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

  public void thread47482(int [] tdone, int [] ends){
        switch(S46978){
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

  public void thread47481(int [] tdone, int [] ends){
        switch(S46970){
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

  public void thread47480(int [] tdone, int [] ends){
        switch(S46962){
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

  public void thread47479(int [] tdone, int [] ends){
        switch(S46954){
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

  public void thread47478(int [] tdone, int [] ends){
        switch(S46946){
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

  public void thread47477(int [] tdone, int [] ends){
        switch(S46938){
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

  public void thread47476(int [] tdone, int [] ends){
        switch(S46930){
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

  public void thread47475(int [] tdone, int [] ends){
        switch(S46922){
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

  public void thread47474(int [] tdone, int [] ends){
        switch(S47132){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread47475(tdone,ends);
        thread47476(tdone,ends);
        thread47477(tdone,ends);
        thread47478(tdone,ends);
        thread47479(tdone,ends);
        thread47480(tdone,ends);
        thread47481(tdone,ends);
        thread47482(tdone,ends);
        thread47483(tdone,ends);
        int biggest47484 = 0;
        if(ends[3]>=biggest47484){
          biggest47484=ends[3];
        }
        if(ends[4]>=biggest47484){
          biggest47484=ends[4];
        }
        if(ends[5]>=biggest47484){
          biggest47484=ends[5];
        }
        if(ends[6]>=biggest47484){
          biggest47484=ends[6];
        }
        if(ends[7]>=biggest47484){
          biggest47484=ends[7];
        }
        if(ends[8]>=biggest47484){
          biggest47484=ends[8];
        }
        if(ends[9]>=biggest47484){
          biggest47484=ends[9];
        }
        if(ends[10]>=biggest47484){
          biggest47484=ends[10];
        }
        if(ends[11]>=biggest47484){
          biggest47484=ends[11];
        }
        if(biggest47484 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest47484 == 0){
          thread47485(tdone,ends);
          thread47486(tdone,ends);
          thread47487(tdone,ends);
          thread47488(tdone,ends);
          thread47489(tdone,ends);
          thread47490(tdone,ends);
          thread47491(tdone,ends);
          thread47492(tdone,ends);
          thread47493(tdone,ends);
          int biggest47494 = 0;
          if(ends[3]>=biggest47494){
            biggest47494=ends[3];
          }
          if(ends[4]>=biggest47494){
            biggest47494=ends[4];
          }
          if(ends[5]>=biggest47494){
            biggest47494=ends[5];
          }
          if(ends[6]>=biggest47494){
            biggest47494=ends[6];
          }
          if(ends[7]>=biggest47494){
            biggest47494=ends[7];
          }
          if(ends[8]>=biggest47494){
            biggest47494=ends[8];
          }
          if(ends[9]>=biggest47494){
            biggest47494=ends[9];
          }
          if(ends[10]>=biggest47494){
            biggest47494=ends[10];
          }
          if(ends[11]>=biggest47494){
            biggest47494=ends[11];
          }
          if(biggest47494 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread47471(int [] tdone, int [] ends){
        S47180=1;
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

  public void thread47470(int [] tdone, int [] ends){
        S47172=1;
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

  public void thread47469(int [] tdone, int [] ends){
        S47164=1;
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

  public void thread47468(int [] tdone, int [] ends){
        S47156=1;
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

  public void thread47467(int [] tdone, int [] ends){
        S47148=1;
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

  public void thread47466(int [] tdone, int [] ends){
        S47140=1;
    S47134=0;
    if(open_door1.getprestatus()){//sysj\SACSplant.sysj line: 97, column: 24
      door1_opened.setPresent();//sysj\SACSplant.sysj line: 97, column: 36
      currsigs.addElement(door1_opened);
      ;//sysj\SACSplant.sysj line: 97, column: 55
      S47134=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      ;//sysj\SACSplant.sysj line: 97, column: 55
      S47134=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread47465(int [] tdone, int [] ends){
        S47182=1;
    thread47466(tdone,ends);
    thread47467(tdone,ends);
    thread47468(tdone,ends);
    thread47469(tdone,ends);
    thread47470(tdone,ends);
    thread47471(tdone,ends);
    int biggest47472 = 0;
    if(ends[13]>=biggest47472){
      biggest47472=ends[13];
    }
    if(ends[14]>=biggest47472){
      biggest47472=ends[14];
    }
    if(ends[15]>=biggest47472){
      biggest47472=ends[15];
    }
    if(ends[16]>=biggest47472){
      biggest47472=ends[16];
    }
    if(ends[17]>=biggest47472){
      biggest47472=ends[17];
    }
    if(ends[18]>=biggest47472){
      biggest47472=ends[18];
    }
    if(biggest47472 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread47463(int [] tdone, int [] ends){
        S46986=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread47462(int [] tdone, int [] ends){
        S46978=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread47461(int [] tdone, int [] ends){
        S46970=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread47460(int [] tdone, int [] ends){
        S46962=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread47459(int [] tdone, int [] ends){
        S46954=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread47458(int [] tdone, int [] ends){
        S46946=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread47457(int [] tdone, int [] ends){
        S46938=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread47456(int [] tdone, int [] ends){
        S46930=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread47455(int [] tdone, int [] ends){
        S46922=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread47454(int [] tdone, int [] ends){
        S47132=1;
    thread47455(tdone,ends);
    thread47456(tdone,ends);
    thread47457(tdone,ends);
    thread47458(tdone,ends);
    thread47459(tdone,ends);
    thread47460(tdone,ends);
    thread47461(tdone,ends);
    thread47462(tdone,ends);
    thread47463(tdone,ends);
    int biggest47464 = 0;
    if(ends[3]>=biggest47464){
      biggest47464=ends[3];
    }
    if(ends[4]>=biggest47464){
      biggest47464=ends[4];
    }
    if(ends[5]>=biggest47464){
      biggest47464=ends[5];
    }
    if(ends[6]>=biggest47464){
      biggest47464=ends[6];
    }
    if(ends[7]>=biggest47464){
      biggest47464=ends[7];
    }
    if(ends[8]>=biggest47464){
      biggest47464=ends[8];
    }
    if(ends[9]>=biggest47464){
      biggest47464=ends[9];
    }
    if(ends[10]>=biggest47464){
      biggest47464=ends[10];
    }
    if(ends[11]>=biggest47464){
      biggest47464=ends[11];
    }
    if(biggest47464 == 1){
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
      switch(S47452){
        case 0 : 
          S47452=0;
          break RUN;
        
        case 1 : 
          S47452=2;
          S47452=2;
          new Thread(new GUI()).start();//sysj\SACSplant.sysj line: 10, column: 2
          thread47454(tdone,ends);
          thread47465(tdone,ends);
          int biggest47473 = 0;
          if(ends[2]>=biggest47473){
            biggest47473=ends[2];
          }
          if(ends[12]>=biggest47473){
            biggest47473=ends[12];
          }
          if(biggest47473 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread47474(tdone,ends);
          thread47495(tdone,ends);
          int biggest47503 = 0;
          if(ends[2]>=biggest47503){
            biggest47503=ends[2];
          }
          if(ends[12]>=biggest47503){
            biggest47503=ends[12];
          }
          if(biggest47503 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest47503 == 0){
            S47452=0;
            active[1]=0;
            ends[1]=0;
            S47452=0;
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
