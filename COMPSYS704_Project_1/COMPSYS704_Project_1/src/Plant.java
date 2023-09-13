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
  private int S52984 = 1;
  private int S52664 = 1;
  private int S52454 = 1;
  private int S52462 = 1;
  private int S52470 = 1;
  private int S52478 = 1;
  private int S52486 = 1;
  private int S52494 = 1;
  private int S52502 = 1;
  private int S52510 = 1;
  private int S52518 = 1;
  private int S52714 = 1;
  private int S52672 = 1;
  private int S52666 = 1;
  private int S52680 = 1;
  private int S52688 = 1;
  private int S52696 = 1;
  private int S52704 = 1;
  private int S52712 = 1;
  
  private int[] ends = new int[19];
  private int[] tdone = new int[19];
  
  public void thread53033(int [] tdone, int [] ends){
        switch(S52712){
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

  public void thread53032(int [] tdone, int [] ends){
        switch(S52704){
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

  public void thread53031(int [] tdone, int [] ends){
        switch(S52696){
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

  public void thread53030(int [] tdone, int [] ends){
        switch(S52688){
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

  public void thread53029(int [] tdone, int [] ends){
        switch(S52680){
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

  public void thread53028(int [] tdone, int [] ends){
        switch(S52672){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S52666){
          case 0 : 
            S52666=0;
            if(open_door1.getprestatus()){//sysj\SACSplant.sysj line: 97, column: 24
              door1_opened.setPresent();//sysj\SACSplant.sysj line: 97, column: 36
              currsigs.addElement(door1_opened);
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S52666=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S52666=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S52666=1;
            S52666=0;
            if(open_door1.getprestatus()){//sysj\SACSplant.sysj line: 97, column: 24
              door1_opened.setPresent();//sysj\SACSplant.sysj line: 97, column: 36
              currsigs.addElement(door1_opened);
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S52666=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              ;//sysj\SACSplant.sysj line: 97, column: 55
              S52666=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread53027(int [] tdone, int [] ends){
        switch(S52714){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        thread53028(tdone,ends);
        thread53029(tdone,ends);
        thread53030(tdone,ends);
        thread53031(tdone,ends);
        thread53032(tdone,ends);
        thread53033(tdone,ends);
        int biggest53034 = 0;
        if(ends[13]>=biggest53034){
          biggest53034=ends[13];
        }
        if(ends[14]>=biggest53034){
          biggest53034=ends[14];
        }
        if(ends[15]>=biggest53034){
          biggest53034=ends[15];
        }
        if(ends[16]>=biggest53034){
          biggest53034=ends[16];
        }
        if(ends[17]>=biggest53034){
          biggest53034=ends[17];
        }
        if(ends[18]>=biggest53034){
          biggest53034=ends[18];
        }
        if(biggest53034 == 1){
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        //FINXME code
        if(biggest53034 == 0){
          S52714=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread53025(int [] tdone, int [] ends){
        S52518=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread53024(int [] tdone, int [] ends){
        S52510=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread53023(int [] tdone, int [] ends){
        S52502=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread53022(int [] tdone, int [] ends){
        S52494=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread53021(int [] tdone, int [] ends){
        S52486=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread53020(int [] tdone, int [] ends){
        S52478=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread53019(int [] tdone, int [] ends){
        S52470=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread53018(int [] tdone, int [] ends){
        S52462=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread53017(int [] tdone, int [] ends){
        S52454=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread53015(int [] tdone, int [] ends){
        switch(S52518){
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

  public void thread53014(int [] tdone, int [] ends){
        switch(S52510){
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

  public void thread53013(int [] tdone, int [] ends){
        switch(S52502){
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

  public void thread53012(int [] tdone, int [] ends){
        switch(S52494){
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

  public void thread53011(int [] tdone, int [] ends){
        switch(S52486){
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

  public void thread53010(int [] tdone, int [] ends){
        switch(S52478){
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

  public void thread53009(int [] tdone, int [] ends){
        switch(S52470){
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

  public void thread53008(int [] tdone, int [] ends){
        switch(S52462){
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

  public void thread53007(int [] tdone, int [] ends){
        switch(S52454){
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

  public void thread53006(int [] tdone, int [] ends){
        switch(S52664){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread53007(tdone,ends);
        thread53008(tdone,ends);
        thread53009(tdone,ends);
        thread53010(tdone,ends);
        thread53011(tdone,ends);
        thread53012(tdone,ends);
        thread53013(tdone,ends);
        thread53014(tdone,ends);
        thread53015(tdone,ends);
        int biggest53016 = 0;
        if(ends[3]>=biggest53016){
          biggest53016=ends[3];
        }
        if(ends[4]>=biggest53016){
          biggest53016=ends[4];
        }
        if(ends[5]>=biggest53016){
          biggest53016=ends[5];
        }
        if(ends[6]>=biggest53016){
          biggest53016=ends[6];
        }
        if(ends[7]>=biggest53016){
          biggest53016=ends[7];
        }
        if(ends[8]>=biggest53016){
          biggest53016=ends[8];
        }
        if(ends[9]>=biggest53016){
          biggest53016=ends[9];
        }
        if(ends[10]>=biggest53016){
          biggest53016=ends[10];
        }
        if(ends[11]>=biggest53016){
          biggest53016=ends[11];
        }
        if(biggest53016 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest53016 == 0){
          thread53017(tdone,ends);
          thread53018(tdone,ends);
          thread53019(tdone,ends);
          thread53020(tdone,ends);
          thread53021(tdone,ends);
          thread53022(tdone,ends);
          thread53023(tdone,ends);
          thread53024(tdone,ends);
          thread53025(tdone,ends);
          int biggest53026 = 0;
          if(ends[3]>=biggest53026){
            biggest53026=ends[3];
          }
          if(ends[4]>=biggest53026){
            biggest53026=ends[4];
          }
          if(ends[5]>=biggest53026){
            biggest53026=ends[5];
          }
          if(ends[6]>=biggest53026){
            biggest53026=ends[6];
          }
          if(ends[7]>=biggest53026){
            biggest53026=ends[7];
          }
          if(ends[8]>=biggest53026){
            biggest53026=ends[8];
          }
          if(ends[9]>=biggest53026){
            biggest53026=ends[9];
          }
          if(ends[10]>=biggest53026){
            biggest53026=ends[10];
          }
          if(ends[11]>=biggest53026){
            biggest53026=ends[11];
          }
          if(biggest53026 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread53003(int [] tdone, int [] ends){
        S52712=1;
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

  public void thread53002(int [] tdone, int [] ends){
        S52704=1;
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

  public void thread53001(int [] tdone, int [] ends){
        S52696=1;
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

  public void thread53000(int [] tdone, int [] ends){
        S52688=1;
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

  public void thread52999(int [] tdone, int [] ends){
        S52680=1;
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

  public void thread52998(int [] tdone, int [] ends){
        S52672=1;
    S52666=0;
    if(open_door1.getprestatus()){//sysj\SACSplant.sysj line: 97, column: 24
      door1_opened.setPresent();//sysj\SACSplant.sysj line: 97, column: 36
      currsigs.addElement(door1_opened);
      ;//sysj\SACSplant.sysj line: 97, column: 55
      S52666=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      ;//sysj\SACSplant.sysj line: 97, column: 55
      S52666=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread52997(int [] tdone, int [] ends){
        S52714=1;
    thread52998(tdone,ends);
    thread52999(tdone,ends);
    thread53000(tdone,ends);
    thread53001(tdone,ends);
    thread53002(tdone,ends);
    thread53003(tdone,ends);
    int biggest53004 = 0;
    if(ends[13]>=biggest53004){
      biggest53004=ends[13];
    }
    if(ends[14]>=biggest53004){
      biggest53004=ends[14];
    }
    if(ends[15]>=biggest53004){
      biggest53004=ends[15];
    }
    if(ends[16]>=biggest53004){
      biggest53004=ends[16];
    }
    if(ends[17]>=biggest53004){
      biggest53004=ends[17];
    }
    if(ends[18]>=biggest53004){
      biggest53004=ends[18];
    }
    if(biggest53004 == 1){
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread52995(int [] tdone, int [] ends){
        S52518=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread52994(int [] tdone, int [] ends){
        S52510=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread52993(int [] tdone, int [] ends){
        S52502=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread52992(int [] tdone, int [] ends){
        S52494=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread52991(int [] tdone, int [] ends){
        S52486=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread52990(int [] tdone, int [] ends){
        S52478=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread52989(int [] tdone, int [] ends){
        S52470=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread52988(int [] tdone, int [] ends){
        S52462=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread52987(int [] tdone, int [] ends){
        S52454=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread52986(int [] tdone, int [] ends){
        S52664=1;
    thread52987(tdone,ends);
    thread52988(tdone,ends);
    thread52989(tdone,ends);
    thread52990(tdone,ends);
    thread52991(tdone,ends);
    thread52992(tdone,ends);
    thread52993(tdone,ends);
    thread52994(tdone,ends);
    thread52995(tdone,ends);
    int biggest52996 = 0;
    if(ends[3]>=biggest52996){
      biggest52996=ends[3];
    }
    if(ends[4]>=biggest52996){
      biggest52996=ends[4];
    }
    if(ends[5]>=biggest52996){
      biggest52996=ends[5];
    }
    if(ends[6]>=biggest52996){
      biggest52996=ends[6];
    }
    if(ends[7]>=biggest52996){
      biggest52996=ends[7];
    }
    if(ends[8]>=biggest52996){
      biggest52996=ends[8];
    }
    if(ends[9]>=biggest52996){
      biggest52996=ends[9];
    }
    if(ends[10]>=biggest52996){
      biggest52996=ends[10];
    }
    if(ends[11]>=biggest52996){
      biggest52996=ends[11];
    }
    if(biggest52996 == 1){
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
      switch(S52984){
        case 0 : 
          S52984=0;
          break RUN;
        
        case 1 : 
          S52984=2;
          S52984=2;
          new Thread(new GUI()).start();//sysj\SACSplant.sysj line: 10, column: 2
          thread52986(tdone,ends);
          thread52997(tdone,ends);
          int biggest53005 = 0;
          if(ends[2]>=biggest53005){
            biggest53005=ends[2];
          }
          if(ends[12]>=biggest53005){
            biggest53005=ends[12];
          }
          if(biggest53005 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread53006(tdone,ends);
          thread53027(tdone,ends);
          int biggest53035 = 0;
          if(ends[2]>=biggest53035){
            biggest53035=ends[2];
          }
          if(ends[12]>=biggest53035){
            biggest53035=ends[12];
          }
          if(biggest53035 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest53035 == 0){
            S52984=0;
            active[1]=0;
            ends[1]=0;
            S52984=0;
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
