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
  private int S52667 = 1;
  private int S52037 = 1;
  private int S51865 = 1;
  private int S51825 = 1;
  private int S51841 = 1;
  private int S51827 = 1;
  private int S52255 = 1;
  private int S52083 = 1;
  private int S52043 = 1;
  private int S52059 = 1;
  private int S52473 = 1;
  private int S52301 = 1;
  private int S52261 = 1;
  private int S52277 = 1;
  private int S52665 = 1;
  private int S52493 = 1;
  private int S52479 = 1;
  private int S52482 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread52712(int [] tdone, int [] ends){
        active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread52711(int [] tdone, int [] ends){
        active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread52710(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread52708(int [] tdone, int [] ends){
        close_door3.setPresent();//sysj\SACScontroller.sysj line: 60, column: 50
    currsigs.addElement(close_door3);
    active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread52707(int [] tdone, int [] ends){
        close_door2.setPresent();//sysj\SACScontroller.sysj line: 60, column: 27
    currsigs.addElement(close_door2);
    active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread52706(int [] tdone, int [] ends){
        close_door1.setPresent();//sysj\SACScontroller.sysj line: 60, column: 4
    currsigs.addElement(close_door1);
    active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread52704(int [] tdone, int [] ends){
        close_door3.setPresent();//sysj\SACScontroller.sysj line: 60, column: 50
    currsigs.addElement(close_door3);
    active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread52703(int [] tdone, int [] ends){
        close_door2.setPresent();//sysj\SACScontroller.sysj line: 60, column: 27
    currsigs.addElement(close_door2);
    active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread52702(int [] tdone, int [] ends){
        close_door1.setPresent();//sysj\SACScontroller.sysj line: 60, column: 4
    currsigs.addElement(close_door1);
    active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread52700(int [] tdone, int [] ends){
        switch(S52482){
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

  public void thread52699(int [] tdone, int [] ends){
        switch(S52479){
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

  public void thread52697(int [] tdone, int [] ends){
        S52482=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread52696(int [] tdone, int [] ends){
        S52479=1;
    open_door3.setPresent();//sysj\SACScontroller.sysj line: 58, column: 8
    currsigs.addElement(open_door3);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread52695(int [] tdone, int [] ends){
        switch(S52665){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S52493){
          case 0 : 
            if(smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 55, column: 12
              S52493=1;
              thread52696(tdone,ends);
              thread52697(tdone,ends);
              int biggest52698 = 0;
              if(ends[12]>=biggest52698){
                biggest52698=ends[12];
              }
              if(ends[13]>=biggest52698){
                biggest52698=ends[13];
              }
              if(biggest52698 == 1){
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
            thread52699(tdone,ends);
            thread52700(tdone,ends);
            int biggest52701 = 0;
            if(ends[12]>=biggest52701){
              biggest52701=ends[12];
            }
            if(ends[13]>=biggest52701){
              biggest52701=ends[13];
            }
            if(biggest52701 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            if(biggest52701 == 2){
              ends[11]=2;
              ;//sysj\SACScontroller.sysj line: 57, column: 6
              S52493=2;
              thread52702(tdone,ends);
              thread52703(tdone,ends);
              thread52704(tdone,ends);
              int biggest52705 = 0;
              if(ends[14]>=biggest52705){
                biggest52705=ends[14];
              }
              if(ends[15]>=biggest52705){
                biggest52705=ends[15];
              }
              if(ends[16]>=biggest52705){
                biggest52705=ends[16];
              }
              //FINXME code
              if(biggest52705 == 0){
                S52493=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            //FINXME code
            if(biggest52701 == 0){
              S52493=2;
              thread52706(tdone,ends);
              thread52707(tdone,ends);
              thread52708(tdone,ends);
              int biggest52709 = 0;
              if(ends[14]>=biggest52709){
                biggest52709=ends[14];
              }
              if(ends[15]>=biggest52709){
                biggest52709=ends[15];
              }
              if(ends[16]>=biggest52709){
                biggest52709=ends[16];
              }
              //FINXME code
              if(biggest52709 == 0){
                S52493=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            break;
          
          case 2 : 
            thread52710(tdone,ends);
            thread52711(tdone,ends);
            thread52712(tdone,ends);
            int biggest52713 = 0;
            if(ends[14]>=biggest52713){
              biggest52713=ends[14];
            }
            if(ends[15]>=biggest52713){
              biggest52713=ends[15];
            }
            if(ends[16]>=biggest52713){
              biggest52713=ends[16];
            }
            //FINXME code
            if(biggest52713 == 0){
              S52493=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52693(int [] tdone, int [] ends){
        switch(S52277){
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

  public void thread52692(int [] tdone, int [] ends){
        switch(S52261){
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

  public void thread52690(int [] tdone, int [] ends){
        S52277=1;
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

  public void thread52689(int [] tdone, int [] ends){
        S52261=1;
    open_door3.setPresent();//sysj\SACScontroller.sysj line: 44, column: 5
    currsigs.addElement(open_door3);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread52688(int [] tdone, int [] ends){
        switch(S52473){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S52301){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 41, column: 9
              S52301=1;
              thread52689(tdone,ends);
              thread52690(tdone,ends);
              int biggest52691 = 0;
              if(ends[9]>=biggest52691){
                biggest52691=ends[9];
              }
              if(ends[10]>=biggest52691){
                biggest52691=ends[10];
              }
              if(biggest52691 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest52691 == 2){
                ends[8]=2;
                ;//sysj\SACScontroller.sysj line: 43, column: 3
                close_door3.setPresent();//sysj\SACScontroller.sysj line: 46, column: 3
                currsigs.addElement(close_door3);
                S52301=2;
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
            thread52692(tdone,ends);
            thread52693(tdone,ends);
            int biggest52694 = 0;
            if(ends[9]>=biggest52694){
              biggest52694=ends[9];
            }
            if(ends[10]>=biggest52694){
              biggest52694=ends[10];
            }
            if(biggest52694 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            if(biggest52694 == 2){
              ends[8]=2;
              ;//sysj\SACScontroller.sysj line: 43, column: 3
              close_door3.setPresent();//sysj\SACScontroller.sysj line: 46, column: 3
              currsigs.addElement(close_door3);
              S52301=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest52694 == 0){
              close_door3.setPresent();//sysj\SACScontroller.sysj line: 46, column: 3
              currsigs.addElement(close_door3);
              S52301=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus()){//sysj\SACScontroller.sysj line: 48, column: 9
              S52301=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              if(!open_door3.getprestatus()){//sysj\SACScontroller.sysj line: 49, column: 16
                S52301=0;
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

  public void thread52686(int [] tdone, int [] ends){
        switch(S52059){
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

  public void thread52685(int [] tdone, int [] ends){
        switch(S52043){
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

  public void thread52683(int [] tdone, int [] ends){
        S52059=1;
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

  public void thread52682(int [] tdone, int [] ends){
        S52043=1;
    open_door2.setPresent();//sysj\SACScontroller.sysj line: 30, column: 5
    currsigs.addElement(open_door2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread52681(int [] tdone, int [] ends){
        switch(S52255){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S52083){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 27, column: 9
              S52083=1;
              thread52682(tdone,ends);
              thread52683(tdone,ends);
              int biggest52684 = 0;
              if(ends[6]>=biggest52684){
                biggest52684=ends[6];
              }
              if(ends[7]>=biggest52684){
                biggest52684=ends[7];
              }
              if(biggest52684 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest52684 == 2){
                ends[5]=2;
                ;//sysj\SACScontroller.sysj line: 29, column: 3
                close_door2.setPresent();//sysj\SACScontroller.sysj line: 32, column: 3
                currsigs.addElement(close_door2);
                S52083=2;
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
            thread52685(tdone,ends);
            thread52686(tdone,ends);
            int biggest52687 = 0;
            if(ends[6]>=biggest52687){
              biggest52687=ends[6];
            }
            if(ends[7]>=biggest52687){
              biggest52687=ends[7];
            }
            if(biggest52687 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest52687 == 2){
              ends[5]=2;
              ;//sysj\SACScontroller.sysj line: 29, column: 3
              close_door2.setPresent();//sysj\SACScontroller.sysj line: 32, column: 3
              currsigs.addElement(close_door2);
              S52083=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest52687 == 0){
              close_door2.setPresent();//sysj\SACScontroller.sysj line: 32, column: 3
              currsigs.addElement(close_door2);
              S52083=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus()){//sysj\SACScontroller.sysj line: 34, column: 9
              S52083=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              if(!open_door2.getprestatus()){//sysj\SACScontroller.sysj line: 35, column: 16
                S52083=0;
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

  public void thread52679(int [] tdone, int [] ends){
        switch(S51841){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S51827){
          case 0 : 
            S51827=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=3;
              ;//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S51827=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S51827=1;
            S51827=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=3;
              ;//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S51827=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52678(int [] tdone, int [] ends){
        switch(S51825){
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

  public void thread52676(int [] tdone, int [] ends){
        S51841=1;
    __start_thread_4 = com.systemj.Timer.getMs();//sysj\SACScontroller.sysj line: 13, column: 30
    S51827=0;
    if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 13, column: 30
      ends[4]=3;
      ;//sysj\SACScontroller.sysj line: 13, column: 30
      ends[4]=2;
      tdone[4]=1;
    }
    else {
      S51827=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread52675(int [] tdone, int [] ends){
        S51825=1;
    open_door1.setPresent();//sysj\SACScontroller.sysj line: 13, column: 6
    currsigs.addElement(open_door1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread52674(int [] tdone, int [] ends){
        switch(S52037){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S51865){
          case 0 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 10, column: 9
              S51865=1;
              thread52675(tdone,ends);
              thread52676(tdone,ends);
              int biggest52677 = 0;
              if(ends[3]>=biggest52677){
                biggest52677=ends[3];
              }
              if(ends[4]>=biggest52677){
                biggest52677=ends[4];
              }
              if(biggest52677 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest52677 == 2){
                ends[2]=2;
                ;//sysj\SACScontroller.sysj line: 11, column: 4
                close_door1.setPresent();//sysj\SACScontroller.sysj line: 16, column: 4
                currsigs.addElement(close_door1);
                S51865=2;
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
            thread52678(tdone,ends);
            thread52679(tdone,ends);
            int biggest52680 = 0;
            if(ends[3]>=biggest52680){
              biggest52680=ends[3];
            }
            if(ends[4]>=biggest52680){
              biggest52680=ends[4];
            }
            if(biggest52680 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest52680 == 2){
              ends[2]=2;
              ;//sysj\SACScontroller.sysj line: 11, column: 4
              close_door1.setPresent();//sysj\SACScontroller.sysj line: 16, column: 4
              currsigs.addElement(close_door1);
              S51865=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest52680 == 0){
              close_door1.setPresent();//sysj\SACScontroller.sysj line: 16, column: 4
              currsigs.addElement(close_door1);
              S51865=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus()){//sysj\SACScontroller.sysj line: 18, column: 10
              S51865=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              if(!open_door1.getprestatus()){//sysj\SACScontroller.sysj line: 19, column: 17
                S51865=0;
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

  public void thread52672(int [] tdone, int [] ends){
        S52665=1;
    S52493=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread52671(int [] tdone, int [] ends){
        S52473=1;
    S52301=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread52670(int [] tdone, int [] ends){
        S52255=1;
    S52083=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread52669(int [] tdone, int [] ends){
        S52037=1;
    S51865=0;
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
      switch(S52667){
        case 0 : 
          S52667=0;
          break RUN;
        
        case 1 : 
          S52667=2;
          S52667=2;
          thread52669(tdone,ends);
          thread52670(tdone,ends);
          thread52671(tdone,ends);
          thread52672(tdone,ends);
          int biggest52673 = 0;
          if(ends[2]>=biggest52673){
            biggest52673=ends[2];
          }
          if(ends[5]>=biggest52673){
            biggest52673=ends[5];
          }
          if(ends[8]>=biggest52673){
            biggest52673=ends[8];
          }
          if(ends[11]>=biggest52673){
            biggest52673=ends[11];
          }
          if(biggest52673 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread52674(tdone,ends);
          thread52681(tdone,ends);
          thread52688(tdone,ends);
          thread52695(tdone,ends);
          int biggest52714 = 0;
          if(ends[2]>=biggest52714){
            biggest52714=ends[2];
          }
          if(ends[5]>=biggest52714){
            biggest52714=ends[5];
          }
          if(ends[8]>=biggest52714){
            biggest52714=ends[8];
          }
          if(ends[11]>=biggest52714){
            biggest52714=ends[11];
          }
          if(biggest52714 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest52714 == 0){
            S52667=0;
            active[1]=0;
            ends[1]=0;
            S52667=0;
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
