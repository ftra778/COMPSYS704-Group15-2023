import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal accessDoor1 = new Signal("accessDoor1", Signal.INPUT);
  public Signal accessDoor2 = new Signal("accessDoor2", Signal.INPUT);
  public Signal accessDoor3 = new Signal("accessDoor3", Signal.INPUT);
  public Signal officeAuthorised = new Signal("officeAuthorised", Signal.INPUT);
  public Signal ManufacturingAuthorised = new Signal("ManufacturingAuthorised", Signal.INPUT);
  public Signal smokeDetected = new Signal("smokeDetected", Signal.INPUT);
  public Signal open_door1 = new Signal("open_door1", Signal.OUTPUT);
  public Signal open_door2 = new Signal("open_door2", Signal.OUTPUT);
  public Signal open_door3 = new Signal("open_door3", Signal.OUTPUT);
  public Signal close_door1 = new Signal("close_door1", Signal.OUTPUT);
  public Signal close_door2 = new Signal("close_door2", Signal.OUTPUT);
  public Signal close_door3 = new Signal("close_door3", Signal.OUTPUT);
  private long __start_thread_4;//sysj\controller.sysj line: 13, column: 30
  private long __start_thread_7;//sysj\controller.sysj line: 30, column: 29
  private long __start_thread_10;//sysj\controller.sysj line: 44, column: 29
  private int S847 = 1;
  private int S217 = 1;
  private int S45 = 1;
  private int S5 = 1;
  private int S21 = 1;
  private int S7 = 1;
  private int S435 = 1;
  private int S263 = 1;
  private int S223 = 1;
  private int S239 = 1;
  private int S653 = 1;
  private int S481 = 1;
  private int S441 = 1;
  private int S457 = 1;
  private int S845 = 1;
  private int S673 = 1;
  private int S659 = 1;
  private int S662 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread892(int [] tdone, int [] ends){
        active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread891(int [] tdone, int [] ends){
        active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread890(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread888(int [] tdone, int [] ends){
        close_door3.setPresent();//sysj\controller.sysj line: 60, column: 50
    currsigs.addElement(close_door3);
    active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread887(int [] tdone, int [] ends){
        close_door2.setPresent();//sysj\controller.sysj line: 60, column: 27
    currsigs.addElement(close_door2);
    active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread886(int [] tdone, int [] ends){
        close_door1.setPresent();//sysj\controller.sysj line: 60, column: 4
    currsigs.addElement(close_door1);
    active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread884(int [] tdone, int [] ends){
        close_door3.setPresent();//sysj\controller.sysj line: 60, column: 50
    currsigs.addElement(close_door3);
    active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread883(int [] tdone, int [] ends){
        close_door2.setPresent();//sysj\controller.sysj line: 60, column: 27
    currsigs.addElement(close_door2);
    active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread882(int [] tdone, int [] ends){
        close_door1.setPresent();//sysj\controller.sysj line: 60, column: 4
    currsigs.addElement(close_door1);
    active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread880(int [] tdone, int [] ends){
        switch(S662){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(!smokeDetected.getprestatus()){//sysj\controller.sysj line: 58, column: 39
          ends[13]=2;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread879(int [] tdone, int [] ends){
        switch(S659){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        open_door3.setPresent();//sysj\controller.sysj line: 58, column: 8
        currsigs.addElement(open_door3);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread877(int [] tdone, int [] ends){
        S662=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread876(int [] tdone, int [] ends){
        S659=1;
    open_door3.setPresent();//sysj\controller.sysj line: 58, column: 8
    currsigs.addElement(open_door3);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread875(int [] tdone, int [] ends){
        switch(S845){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S673){
          case 0 : 
            if(smokeDetected.getprestatus()){//sysj\controller.sysj line: 55, column: 12
              S673=1;
              thread876(tdone,ends);
              thread877(tdone,ends);
              int biggest878 = 0;
              if(ends[12]>=biggest878){
                biggest878=ends[12];
              }
              if(ends[13]>=biggest878){
                biggest878=ends[13];
              }
              if(biggest878 == 1){
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            thread879(tdone,ends);
            thread880(tdone,ends);
            int biggest881 = 0;
            if(ends[12]>=biggest881){
              biggest881=ends[12];
            }
            if(ends[13]>=biggest881){
              biggest881=ends[13];
            }
            if(biggest881 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            if(biggest881 == 2){
              ends[11]=2;
              ;//sysj\controller.sysj line: 57, column: 6
              S673=2;
              thread882(tdone,ends);
              thread883(tdone,ends);
              thread884(tdone,ends);
              int biggest885 = 0;
              if(ends[14]>=biggest885){
                biggest885=ends[14];
              }
              if(ends[15]>=biggest885){
                biggest885=ends[15];
              }
              if(ends[16]>=biggest885){
                biggest885=ends[16];
              }
              //FINXME code
              if(biggest885 == 0){
                S673=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            //FINXME code
            if(biggest881 == 0){
              S673=2;
              thread886(tdone,ends);
              thread887(tdone,ends);
              thread888(tdone,ends);
              int biggest889 = 0;
              if(ends[14]>=biggest889){
                biggest889=ends[14];
              }
              if(ends[15]>=biggest889){
                biggest889=ends[15];
              }
              if(ends[16]>=biggest889){
                biggest889=ends[16];
              }
              //FINXME code
              if(biggest889 == 0){
                S673=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            break;
          
          case 2 : 
            thread890(tdone,ends);
            thread891(tdone,ends);
            thread892(tdone,ends);
            int biggest893 = 0;
            if(ends[14]>=biggest893){
              biggest893=ends[14];
            }
            if(ends[15]>=biggest893){
              biggest893=ends[15];
            }
            if(ends[16]>=biggest893){
              biggest893=ends[16];
            }
            //FINXME code
            if(biggest893 == 0){
              S673=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread873(int [] tdone, int [] ends){
        switch(S457){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_10 >= (3.0) * 1000){//sysj\controller.sysj line: 44, column: 29
          ends[10]=3;
          ;//sysj\controller.sysj line: 44, column: 29
          ends[10]=2;
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

  public void thread872(int [] tdone, int [] ends){
        switch(S441){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        open_door3.setPresent();//sysj\controller.sysj line: 44, column: 5
        currsigs.addElement(open_door3);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread870(int [] tdone, int [] ends){
        S457=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 44, column: 29
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (3.0) * 1000){//sysj\controller.sysj line: 44, column: 29
      ends[10]=3;
      ;//sysj\controller.sysj line: 44, column: 29
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread869(int [] tdone, int [] ends){
        S441=1;
    open_door3.setPresent();//sysj\controller.sysj line: 44, column: 5
    currsigs.addElement(open_door3);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread868(int [] tdone, int [] ends){
        switch(S653){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S481){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus() && !smokeDetected.getprestatus()){//sysj\controller.sysj line: 41, column: 9
              S481=1;
              thread869(tdone,ends);
              thread870(tdone,ends);
              int biggest871 = 0;
              if(ends[9]>=biggest871){
                biggest871=ends[9];
              }
              if(ends[10]>=biggest871){
                biggest871=ends[10];
              }
              if(biggest871 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest871 == 2){
                ends[8]=2;
                ;//sysj\controller.sysj line: 43, column: 3
                close_door3.setPresent();//sysj\controller.sysj line: 46, column: 3
                currsigs.addElement(close_door3);
                S481=2;
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            thread872(tdone,ends);
            thread873(tdone,ends);
            int biggest874 = 0;
            if(ends[9]>=biggest874){
              biggest874=ends[9];
            }
            if(ends[10]>=biggest874){
              biggest874=ends[10];
            }
            if(biggest874 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            if(biggest874 == 2){
              ends[8]=2;
              ;//sysj\controller.sysj line: 43, column: 3
              close_door3.setPresent();//sysj\controller.sysj line: 46, column: 3
              currsigs.addElement(close_door3);
              S481=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest874 == 0){
              close_door3.setPresent();//sysj\controller.sysj line: 46, column: 3
              currsigs.addElement(close_door3);
              S481=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus()){//sysj\controller.sysj line: 48, column: 9
              S481=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              if(!open_door3.getprestatus()){//sysj\controller.sysj line: 49, column: 16
                S481=0;
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
            break;
          
        }
        break;
      
    }
  }

  public void thread866(int [] tdone, int [] ends){
        switch(S239){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_7 >= (3.0) * 1000){//sysj\controller.sysj line: 30, column: 29
          ends[7]=3;
          ;//sysj\controller.sysj line: 30, column: 29
          ends[7]=2;
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

  public void thread865(int [] tdone, int [] ends){
        switch(S223){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        open_door2.setPresent();//sysj\controller.sysj line: 30, column: 5
        currsigs.addElement(open_door2);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread863(int [] tdone, int [] ends){
        S239=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 30, column: 29
    if(com.systemj.Timer.getMs() - __start_thread_7 >= (3.0) * 1000){//sysj\controller.sysj line: 30, column: 29
      ends[7]=3;
      ;//sysj\controller.sysj line: 30, column: 29
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread862(int [] tdone, int [] ends){
        S223=1;
    open_door2.setPresent();//sysj\controller.sysj line: 30, column: 5
    currsigs.addElement(open_door2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread861(int [] tdone, int [] ends){
        switch(S435){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S263){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus() && !smokeDetected.getprestatus()){//sysj\controller.sysj line: 27, column: 9
              S263=1;
              thread862(tdone,ends);
              thread863(tdone,ends);
              int biggest864 = 0;
              if(ends[6]>=biggest864){
                biggest864=ends[6];
              }
              if(ends[7]>=biggest864){
                biggest864=ends[7];
              }
              if(biggest864 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest864 == 2){
                ends[5]=2;
                ;//sysj\controller.sysj line: 29, column: 3
                close_door2.setPresent();//sysj\controller.sysj line: 32, column: 3
                currsigs.addElement(close_door2);
                S263=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            thread865(tdone,ends);
            thread866(tdone,ends);
            int biggest867 = 0;
            if(ends[6]>=biggest867){
              biggest867=ends[6];
            }
            if(ends[7]>=biggest867){
              biggest867=ends[7];
            }
            if(biggest867 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest867 == 2){
              ends[5]=2;
              ;//sysj\controller.sysj line: 29, column: 3
              close_door2.setPresent();//sysj\controller.sysj line: 32, column: 3
              currsigs.addElement(close_door2);
              S263=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest867 == 0){
              close_door2.setPresent();//sysj\controller.sysj line: 32, column: 3
              currsigs.addElement(close_door2);
              S263=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus()){//sysj\controller.sysj line: 34, column: 9
              S263=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              if(!open_door2.getprestatus()){//sysj\controller.sysj line: 35, column: 16
                S263=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread859(int [] tdone, int [] ends){
        switch(S21){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S7){
          case 0 : 
            S7=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\controller.sysj line: 13, column: 30
              ends[4]=3;
              ;//sysj\controller.sysj line: 13, column: 30
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S7=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S7=1;
            S7=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\controller.sysj line: 13, column: 30
              ends[4]=3;
              ;//sysj\controller.sysj line: 13, column: 30
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S7=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread858(int [] tdone, int [] ends){
        switch(S5){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        open_door1.setPresent();//sysj\controller.sysj line: 13, column: 6
        currsigs.addElement(open_door1);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread856(int [] tdone, int [] ends){
        S21=1;
    __start_thread_4 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 13, column: 30
    S7=0;
    if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\controller.sysj line: 13, column: 30
      ends[4]=3;
      ;//sysj\controller.sysj line: 13, column: 30
      ends[4]=2;
      tdone[4]=1;
    }
    else {
      S7=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread855(int [] tdone, int [] ends){
        S5=1;
    open_door1.setPresent();//sysj\controller.sysj line: 13, column: 6
    currsigs.addElement(open_door1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread854(int [] tdone, int [] ends){
        switch(S217){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S45){
          case 0 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus() && !smokeDetected.getprestatus()){//sysj\controller.sysj line: 10, column: 9
              S45=1;
              thread855(tdone,ends);
              thread856(tdone,ends);
              int biggest857 = 0;
              if(ends[3]>=biggest857){
                biggest857=ends[3];
              }
              if(ends[4]>=biggest857){
                biggest857=ends[4];
              }
              if(biggest857 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest857 == 2){
                ends[2]=2;
                ;//sysj\controller.sysj line: 11, column: 4
                close_door1.setPresent();//sysj\controller.sysj line: 16, column: 4
                currsigs.addElement(close_door1);
                S45=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            thread858(tdone,ends);
            thread859(tdone,ends);
            int biggest860 = 0;
            if(ends[3]>=biggest860){
              biggest860=ends[3];
            }
            if(ends[4]>=biggest860){
              biggest860=ends[4];
            }
            if(biggest860 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest860 == 2){
              ends[2]=2;
              ;//sysj\controller.sysj line: 11, column: 4
              close_door1.setPresent();//sysj\controller.sysj line: 16, column: 4
              currsigs.addElement(close_door1);
              S45=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest860 == 0){
              close_door1.setPresent();//sysj\controller.sysj line: 16, column: 4
              currsigs.addElement(close_door1);
              S45=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus()){//sysj\controller.sysj line: 18, column: 10
              S45=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              if(!open_door1.getprestatus()){//sysj\controller.sysj line: 19, column: 17
                S45=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread852(int [] tdone, int [] ends){
        S845=1;
    S673=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread851(int [] tdone, int [] ends){
        S653=1;
    S481=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread850(int [] tdone, int [] ends){
        S435=1;
    S263=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread849(int [] tdone, int [] ends){
        S217=1;
    S45=0;
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
      switch(S847){
        case 0 : 
          S847=0;
          break RUN;
        
        case 1 : 
          S847=2;
          S847=2;
          thread849(tdone,ends);
          thread850(tdone,ends);
          thread851(tdone,ends);
          thread852(tdone,ends);
          int biggest853 = 0;
          if(ends[2]>=biggest853){
            biggest853=ends[2];
          }
          if(ends[5]>=biggest853){
            biggest853=ends[5];
          }
          if(ends[8]>=biggest853){
            biggest853=ends[8];
          }
          if(ends[11]>=biggest853){
            biggest853=ends[11];
          }
          if(biggest853 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread854(tdone,ends);
          thread861(tdone,ends);
          thread868(tdone,ends);
          thread875(tdone,ends);
          int biggest894 = 0;
          if(ends[2]>=biggest894){
            biggest894=ends[2];
          }
          if(ends[5]>=biggest894){
            biggest894=ends[5];
          }
          if(ends[8]>=biggest894){
            biggest894=ends[8];
          }
          if(ends[11]>=biggest894){
            biggest894=ends[11];
          }
          if(biggest894 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest894 == 0){
            S847=0;
            active[1]=0;
            ends[1]=0;
            S847=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          accessDoor1.gethook();
          accessDoor2.gethook();
          accessDoor3.gethook();
          officeAuthorised.gethook();
          ManufacturingAuthorised.gethook();
          smokeDetected.gethook();
          df = true;
        }
        runClockDomain();
      }
      accessDoor1.setpreclear();
      accessDoor2.setpreclear();
      accessDoor3.setpreclear();
      officeAuthorised.setpreclear();
      ManufacturingAuthorised.setpreclear();
      smokeDetected.setpreclear();
      open_door1.setpreclear();
      open_door2.setpreclear();
      open_door3.setpreclear();
      close_door1.setpreclear();
      close_door2.setpreclear();
      close_door3.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = accessDoor1.getStatus() ? accessDoor1.setprepresent() : accessDoor1.setpreclear();
      accessDoor1.setpreval(accessDoor1.getValue());
      accessDoor1.setClear();
      dummyint = accessDoor2.getStatus() ? accessDoor2.setprepresent() : accessDoor2.setpreclear();
      accessDoor2.setpreval(accessDoor2.getValue());
      accessDoor2.setClear();
      dummyint = accessDoor3.getStatus() ? accessDoor3.setprepresent() : accessDoor3.setpreclear();
      accessDoor3.setpreval(accessDoor3.getValue());
      accessDoor3.setClear();
      dummyint = officeAuthorised.getStatus() ? officeAuthorised.setprepresent() : officeAuthorised.setpreclear();
      officeAuthorised.setpreval(officeAuthorised.getValue());
      officeAuthorised.setClear();
      dummyint = ManufacturingAuthorised.getStatus() ? ManufacturingAuthorised.setprepresent() : ManufacturingAuthorised.setpreclear();
      ManufacturingAuthorised.setpreval(ManufacturingAuthorised.getValue());
      ManufacturingAuthorised.setClear();
      dummyint = smokeDetected.getStatus() ? smokeDetected.setprepresent() : smokeDetected.setpreclear();
      smokeDetected.setpreval(smokeDetected.getValue());
      smokeDetected.setClear();
      open_door1.sethook();
      open_door1.setClear();
      open_door2.sethook();
      open_door2.setClear();
      open_door3.sethook();
      open_door3.setClear();
      close_door1.sethook();
      close_door1.setClear();
      close_door2.sethook();
      close_door2.setClear();
      close_door3.sethook();
      close_door3.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        accessDoor1.gethook();
        accessDoor2.gethook();
        accessDoor3.gethook();
        officeAuthorised.gethook();
        ManufacturingAuthorised.gethook();
        smokeDetected.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
