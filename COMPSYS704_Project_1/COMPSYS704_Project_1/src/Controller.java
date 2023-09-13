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
  private long __start_thread_4;//sysj\SACScontroller.sysj line: 13, column: 30
  private long __start_thread_7;//sysj\SACScontroller.sysj line: 30, column: 29
  private long __start_thread_10;//sysj\SACScontroller.sysj line: 44, column: 29
  private int S46867 = 1;
  private int S46237 = 1;
  private int S46065 = 1;
  private int S46025 = 1;
  private int S46041 = 1;
  private int S46027 = 1;
  private int S46455 = 1;
  private int S46283 = 1;
  private int S46243 = 1;
  private int S46259 = 1;
  private int S46673 = 1;
  private int S46501 = 1;
  private int S46461 = 1;
  private int S46477 = 1;
  private int S46865 = 1;
  private int S46693 = 1;
  private int S46679 = 1;
  private int S46682 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread46912(int [] tdone, int [] ends){
        active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread46911(int [] tdone, int [] ends){
        active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread46910(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread46908(int [] tdone, int [] ends){
        close_door3.setPresent();//sysj\SACScontroller.sysj line: 60, column: 50
    currsigs.addElement(close_door3);
    active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread46907(int [] tdone, int [] ends){
        close_door2.setPresent();//sysj\SACScontroller.sysj line: 60, column: 27
    currsigs.addElement(close_door2);
    active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread46906(int [] tdone, int [] ends){
        close_door1.setPresent();//sysj\SACScontroller.sysj line: 60, column: 4
    currsigs.addElement(close_door1);
    active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread46904(int [] tdone, int [] ends){
        close_door3.setPresent();//sysj\SACScontroller.sysj line: 60, column: 50
    currsigs.addElement(close_door3);
    active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread46903(int [] tdone, int [] ends){
        close_door2.setPresent();//sysj\SACScontroller.sysj line: 60, column: 27
    currsigs.addElement(close_door2);
    active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread46902(int [] tdone, int [] ends){
        close_door1.setPresent();//sysj\SACScontroller.sysj line: 60, column: 4
    currsigs.addElement(close_door1);
    active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread46900(int [] tdone, int [] ends){
        switch(S46682){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(!smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 58, column: 39
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

  public void thread46899(int [] tdone, int [] ends){
        switch(S46679){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        open_door3.setPresent();//sysj\SACScontroller.sysj line: 58, column: 8
        currsigs.addElement(open_door3);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread46897(int [] tdone, int [] ends){
        S46682=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread46896(int [] tdone, int [] ends){
        S46679=1;
    open_door3.setPresent();//sysj\SACScontroller.sysj line: 58, column: 8
    currsigs.addElement(open_door3);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread46895(int [] tdone, int [] ends){
        switch(S46865){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S46693){
          case 0 : 
            if(smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 55, column: 12
              S46693=1;
              thread46896(tdone,ends);
              thread46897(tdone,ends);
              int biggest46898 = 0;
              if(ends[12]>=biggest46898){
                biggest46898=ends[12];
              }
              if(ends[13]>=biggest46898){
                biggest46898=ends[13];
              }
              if(biggest46898 == 1){
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
            thread46899(tdone,ends);
            thread46900(tdone,ends);
            int biggest46901 = 0;
            if(ends[12]>=biggest46901){
              biggest46901=ends[12];
            }
            if(ends[13]>=biggest46901){
              biggest46901=ends[13];
            }
            if(biggest46901 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            if(biggest46901 == 2){
              ends[11]=2;
              ;//sysj\SACScontroller.sysj line: 57, column: 6
              S46693=2;
              thread46902(tdone,ends);
              thread46903(tdone,ends);
              thread46904(tdone,ends);
              int biggest46905 = 0;
              if(ends[14]>=biggest46905){
                biggest46905=ends[14];
              }
              if(ends[15]>=biggest46905){
                biggest46905=ends[15];
              }
              if(ends[16]>=biggest46905){
                biggest46905=ends[16];
              }
              //FINXME code
              if(biggest46905 == 0){
                S46693=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            //FINXME code
            if(biggest46901 == 0){
              S46693=2;
              thread46906(tdone,ends);
              thread46907(tdone,ends);
              thread46908(tdone,ends);
              int biggest46909 = 0;
              if(ends[14]>=biggest46909){
                biggest46909=ends[14];
              }
              if(ends[15]>=biggest46909){
                biggest46909=ends[15];
              }
              if(ends[16]>=biggest46909){
                biggest46909=ends[16];
              }
              //FINXME code
              if(biggest46909 == 0){
                S46693=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            break;
          
          case 2 : 
            thread46910(tdone,ends);
            thread46911(tdone,ends);
            thread46912(tdone,ends);
            int biggest46913 = 0;
            if(ends[14]>=biggest46913){
              biggest46913=ends[14];
            }
            if(ends[15]>=biggest46913){
              biggest46913=ends[15];
            }
            if(ends[16]>=biggest46913){
              biggest46913=ends[16];
            }
            //FINXME code
            if(biggest46913 == 0){
              S46693=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread46893(int [] tdone, int [] ends){
        switch(S46477){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_10 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 44, column: 29
          ends[10]=3;
          ;//sysj\SACScontroller.sysj line: 44, column: 29
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

  public void thread46892(int [] tdone, int [] ends){
        switch(S46461){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        open_door3.setPresent();//sysj\SACScontroller.sysj line: 44, column: 5
        currsigs.addElement(open_door3);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread46890(int [] tdone, int [] ends){
        S46477=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\SACScontroller.sysj line: 44, column: 29
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 44, column: 29
      ends[10]=3;
      ;//sysj\SACScontroller.sysj line: 44, column: 29
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread46889(int [] tdone, int [] ends){
        S46461=1;
    open_door3.setPresent();//sysj\SACScontroller.sysj line: 44, column: 5
    currsigs.addElement(open_door3);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread46888(int [] tdone, int [] ends){
        switch(S46673){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S46501){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 41, column: 9
              S46501=1;
              thread46889(tdone,ends);
              thread46890(tdone,ends);
              int biggest46891 = 0;
              if(ends[9]>=biggest46891){
                biggest46891=ends[9];
              }
              if(ends[10]>=biggest46891){
                biggest46891=ends[10];
              }
              if(biggest46891 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest46891 == 2){
                ends[8]=2;
                ;//sysj\SACScontroller.sysj line: 43, column: 3
                close_door3.setPresent();//sysj\SACScontroller.sysj line: 46, column: 3
                currsigs.addElement(close_door3);
                S46501=2;
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
            thread46892(tdone,ends);
            thread46893(tdone,ends);
            int biggest46894 = 0;
            if(ends[9]>=biggest46894){
              biggest46894=ends[9];
            }
            if(ends[10]>=biggest46894){
              biggest46894=ends[10];
            }
            if(biggest46894 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            if(biggest46894 == 2){
              ends[8]=2;
              ;//sysj\SACScontroller.sysj line: 43, column: 3
              close_door3.setPresent();//sysj\SACScontroller.sysj line: 46, column: 3
              currsigs.addElement(close_door3);
              S46501=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest46894 == 0){
              close_door3.setPresent();//sysj\SACScontroller.sysj line: 46, column: 3
              currsigs.addElement(close_door3);
              S46501=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus()){//sysj\SACScontroller.sysj line: 48, column: 9
              S46501=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              if(!open_door3.getprestatus()){//sysj\SACScontroller.sysj line: 49, column: 16
                S46501=0;
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

  public void thread46886(int [] tdone, int [] ends){
        switch(S46259){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_7 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 30, column: 29
          ends[7]=3;
          ;//sysj\SACScontroller.sysj line: 30, column: 29
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

  public void thread46885(int [] tdone, int [] ends){
        switch(S46243){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        open_door2.setPresent();//sysj\SACScontroller.sysj line: 30, column: 5
        currsigs.addElement(open_door2);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread46883(int [] tdone, int [] ends){
        S46259=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\SACScontroller.sysj line: 30, column: 29
    if(com.systemj.Timer.getMs() - __start_thread_7 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 30, column: 29
      ends[7]=3;
      ;//sysj\SACScontroller.sysj line: 30, column: 29
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread46882(int [] tdone, int [] ends){
        S46243=1;
    open_door2.setPresent();//sysj\SACScontroller.sysj line: 30, column: 5
    currsigs.addElement(open_door2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread46881(int [] tdone, int [] ends){
        switch(S46455){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S46283){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 27, column: 9
              S46283=1;
              thread46882(tdone,ends);
              thread46883(tdone,ends);
              int biggest46884 = 0;
              if(ends[6]>=biggest46884){
                biggest46884=ends[6];
              }
              if(ends[7]>=biggest46884){
                biggest46884=ends[7];
              }
              if(biggest46884 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest46884 == 2){
                ends[5]=2;
                ;//sysj\SACScontroller.sysj line: 29, column: 3
                close_door2.setPresent();//sysj\SACScontroller.sysj line: 32, column: 3
                currsigs.addElement(close_door2);
                S46283=2;
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
            thread46885(tdone,ends);
            thread46886(tdone,ends);
            int biggest46887 = 0;
            if(ends[6]>=biggest46887){
              biggest46887=ends[6];
            }
            if(ends[7]>=biggest46887){
              biggest46887=ends[7];
            }
            if(biggest46887 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest46887 == 2){
              ends[5]=2;
              ;//sysj\SACScontroller.sysj line: 29, column: 3
              close_door2.setPresent();//sysj\SACScontroller.sysj line: 32, column: 3
              currsigs.addElement(close_door2);
              S46283=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest46887 == 0){
              close_door2.setPresent();//sysj\SACScontroller.sysj line: 32, column: 3
              currsigs.addElement(close_door2);
              S46283=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus()){//sysj\SACScontroller.sysj line: 34, column: 9
              S46283=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              if(!open_door2.getprestatus()){//sysj\SACScontroller.sysj line: 35, column: 16
                S46283=0;
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

  public void thread46879(int [] tdone, int [] ends){
        switch(S46041){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S46027){
          case 0 : 
            S46027=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=3;
              ;//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S46027=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S46027=1;
            S46027=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=3;
              ;//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S46027=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread46878(int [] tdone, int [] ends){
        switch(S46025){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        open_door1.setPresent();//sysj\SACScontroller.sysj line: 13, column: 6
        currsigs.addElement(open_door1);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread46876(int [] tdone, int [] ends){
        S46041=1;
    __start_thread_4 = com.systemj.Timer.getMs();//sysj\SACScontroller.sysj line: 13, column: 30
    S46027=0;
    if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 13, column: 30
      ends[4]=3;
      ;//sysj\SACScontroller.sysj line: 13, column: 30
      ends[4]=2;
      tdone[4]=1;
    }
    else {
      S46027=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread46875(int [] tdone, int [] ends){
        S46025=1;
    open_door1.setPresent();//sysj\SACScontroller.sysj line: 13, column: 6
    currsigs.addElement(open_door1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread46874(int [] tdone, int [] ends){
        switch(S46237){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S46065){
          case 0 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 10, column: 9
              S46065=1;
              thread46875(tdone,ends);
              thread46876(tdone,ends);
              int biggest46877 = 0;
              if(ends[3]>=biggest46877){
                biggest46877=ends[3];
              }
              if(ends[4]>=biggest46877){
                biggest46877=ends[4];
              }
              if(biggest46877 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest46877 == 2){
                ends[2]=2;
                ;//sysj\SACScontroller.sysj line: 11, column: 4
                close_door1.setPresent();//sysj\SACScontroller.sysj line: 16, column: 4
                currsigs.addElement(close_door1);
                S46065=2;
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
            thread46878(tdone,ends);
            thread46879(tdone,ends);
            int biggest46880 = 0;
            if(ends[3]>=biggest46880){
              biggest46880=ends[3];
            }
            if(ends[4]>=biggest46880){
              biggest46880=ends[4];
            }
            if(biggest46880 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest46880 == 2){
              ends[2]=2;
              ;//sysj\SACScontroller.sysj line: 11, column: 4
              close_door1.setPresent();//sysj\SACScontroller.sysj line: 16, column: 4
              currsigs.addElement(close_door1);
              S46065=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest46880 == 0){
              close_door1.setPresent();//sysj\SACScontroller.sysj line: 16, column: 4
              currsigs.addElement(close_door1);
              S46065=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus()){//sysj\SACScontroller.sysj line: 18, column: 10
              S46065=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              if(!open_door1.getprestatus()){//sysj\SACScontroller.sysj line: 19, column: 17
                S46065=0;
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

  public void thread46872(int [] tdone, int [] ends){
        S46865=1;
    S46693=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread46871(int [] tdone, int [] ends){
        S46673=1;
    S46501=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread46870(int [] tdone, int [] ends){
        S46455=1;
    S46283=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread46869(int [] tdone, int [] ends){
        S46237=1;
    S46065=0;
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
      switch(S46867){
        case 0 : 
          S46867=0;
          break RUN;
        
        case 1 : 
          S46867=2;
          S46867=2;
          thread46869(tdone,ends);
          thread46870(tdone,ends);
          thread46871(tdone,ends);
          thread46872(tdone,ends);
          int biggest46873 = 0;
          if(ends[2]>=biggest46873){
            biggest46873=ends[2];
          }
          if(ends[5]>=biggest46873){
            biggest46873=ends[5];
          }
          if(ends[8]>=biggest46873){
            biggest46873=ends[8];
          }
          if(ends[11]>=biggest46873){
            biggest46873=ends[11];
          }
          if(biggest46873 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread46874(tdone,ends);
          thread46881(tdone,ends);
          thread46888(tdone,ends);
          thread46895(tdone,ends);
          int biggest46914 = 0;
          if(ends[2]>=biggest46914){
            biggest46914=ends[2];
          }
          if(ends[5]>=biggest46914){
            biggest46914=ends[5];
          }
          if(ends[8]>=biggest46914){
            biggest46914=ends[8];
          }
          if(ends[11]>=biggest46914){
            biggest46914=ends[11];
          }
          if(biggest46914 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest46914 == 0){
            S46867=0;
            active[1]=0;
            ends[1]=0;
            S46867=0;
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
