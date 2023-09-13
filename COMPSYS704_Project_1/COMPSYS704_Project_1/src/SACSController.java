import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class SACSController extends ClockDomain{
  public SACSController(String name){super(name);}
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
  private int S52399 = 1;
  private int S51769 = 1;
  private int S51597 = 1;
  private int S51557 = 1;
  private int S51573 = 1;
  private int S51559 = 1;
  private int S51987 = 1;
  private int S51815 = 1;
  private int S51775 = 1;
  private int S51791 = 1;
  private int S52205 = 1;
  private int S52033 = 1;
  private int S51993 = 1;
  private int S52009 = 1;
  private int S52397 = 1;
  private int S52225 = 1;
  private int S52211 = 1;
  private int S52214 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread52444(int [] tdone, int [] ends){
        active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread52443(int [] tdone, int [] ends){
        active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread52442(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread52440(int [] tdone, int [] ends){
        close_door3.setPresent();//sysj\SACScontroller.sysj line: 60, column: 50
    currsigs.addElement(close_door3);
    active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread52439(int [] tdone, int [] ends){
        close_door2.setPresent();//sysj\SACScontroller.sysj line: 60, column: 27
    currsigs.addElement(close_door2);
    active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread52438(int [] tdone, int [] ends){
        close_door1.setPresent();//sysj\SACScontroller.sysj line: 60, column: 4
    currsigs.addElement(close_door1);
    active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread52436(int [] tdone, int [] ends){
        close_door3.setPresent();//sysj\SACScontroller.sysj line: 60, column: 50
    currsigs.addElement(close_door3);
    active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread52435(int [] tdone, int [] ends){
        close_door2.setPresent();//sysj\SACScontroller.sysj line: 60, column: 27
    currsigs.addElement(close_door2);
    active[15]=0;
    ends[15]=0;
    tdone[15]=1;
  }

  public void thread52434(int [] tdone, int [] ends){
        close_door1.setPresent();//sysj\SACScontroller.sysj line: 60, column: 4
    currsigs.addElement(close_door1);
    active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread52432(int [] tdone, int [] ends){
        switch(S52214){
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

  public void thread52431(int [] tdone, int [] ends){
        switch(S52211){
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

  public void thread52429(int [] tdone, int [] ends){
        S52214=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread52428(int [] tdone, int [] ends){
        S52211=1;
    open_door3.setPresent();//sysj\SACScontroller.sysj line: 58, column: 8
    currsigs.addElement(open_door3);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread52427(int [] tdone, int [] ends){
        switch(S52397){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S52225){
          case 0 : 
            if(smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 55, column: 12
              S52225=1;
              thread52428(tdone,ends);
              thread52429(tdone,ends);
              int biggest52430 = 0;
              if(ends[12]>=biggest52430){
                biggest52430=ends[12];
              }
              if(ends[13]>=biggest52430){
                biggest52430=ends[13];
              }
              if(biggest52430 == 1){
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
            thread52431(tdone,ends);
            thread52432(tdone,ends);
            int biggest52433 = 0;
            if(ends[12]>=biggest52433){
              biggest52433=ends[12];
            }
            if(ends[13]>=biggest52433){
              biggest52433=ends[13];
            }
            if(biggest52433 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            if(biggest52433 == 2){
              ends[11]=2;
              ;//sysj\SACScontroller.sysj line: 57, column: 6
              S52225=2;
              thread52434(tdone,ends);
              thread52435(tdone,ends);
              thread52436(tdone,ends);
              int biggest52437 = 0;
              if(ends[14]>=biggest52437){
                biggest52437=ends[14];
              }
              if(ends[15]>=biggest52437){
                biggest52437=ends[15];
              }
              if(ends[16]>=biggest52437){
                biggest52437=ends[16];
              }
              //FINXME code
              if(biggest52437 == 0){
                S52225=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            //FINXME code
            if(biggest52433 == 0){
              S52225=2;
              thread52438(tdone,ends);
              thread52439(tdone,ends);
              thread52440(tdone,ends);
              int biggest52441 = 0;
              if(ends[14]>=biggest52441){
                biggest52441=ends[14];
              }
              if(ends[15]>=biggest52441){
                biggest52441=ends[15];
              }
              if(ends[16]>=biggest52441){
                biggest52441=ends[16];
              }
              //FINXME code
              if(biggest52441 == 0){
                S52225=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            break;
          
          case 2 : 
            thread52442(tdone,ends);
            thread52443(tdone,ends);
            thread52444(tdone,ends);
            int biggest52445 = 0;
            if(ends[14]>=biggest52445){
              biggest52445=ends[14];
            }
            if(ends[15]>=biggest52445){
              biggest52445=ends[15];
            }
            if(ends[16]>=biggest52445){
              biggest52445=ends[16];
            }
            //FINXME code
            if(biggest52445 == 0){
              S52225=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52425(int [] tdone, int [] ends){
        switch(S52009){
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

  public void thread52424(int [] tdone, int [] ends){
        switch(S51993){
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

  public void thread52422(int [] tdone, int [] ends){
        S52009=1;
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

  public void thread52421(int [] tdone, int [] ends){
        S51993=1;
    open_door3.setPresent();//sysj\SACScontroller.sysj line: 44, column: 5
    currsigs.addElement(open_door3);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread52420(int [] tdone, int [] ends){
        switch(S52205){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S52033){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 41, column: 9
              S52033=1;
              thread52421(tdone,ends);
              thread52422(tdone,ends);
              int biggest52423 = 0;
              if(ends[9]>=biggest52423){
                biggest52423=ends[9];
              }
              if(ends[10]>=biggest52423){
                biggest52423=ends[10];
              }
              if(biggest52423 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest52423 == 2){
                ends[8]=2;
                ;//sysj\SACScontroller.sysj line: 43, column: 3
                close_door3.setPresent();//sysj\SACScontroller.sysj line: 46, column: 3
                currsigs.addElement(close_door3);
                S52033=2;
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
            thread52424(tdone,ends);
            thread52425(tdone,ends);
            int biggest52426 = 0;
            if(ends[9]>=biggest52426){
              biggest52426=ends[9];
            }
            if(ends[10]>=biggest52426){
              biggest52426=ends[10];
            }
            if(biggest52426 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            if(biggest52426 == 2){
              ends[8]=2;
              ;//sysj\SACScontroller.sysj line: 43, column: 3
              close_door3.setPresent();//sysj\SACScontroller.sysj line: 46, column: 3
              currsigs.addElement(close_door3);
              S52033=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest52426 == 0){
              close_door3.setPresent();//sysj\SACScontroller.sysj line: 46, column: 3
              currsigs.addElement(close_door3);
              S52033=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus()){//sysj\SACScontroller.sysj line: 48, column: 9
              S52033=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              if(!open_door3.getprestatus()){//sysj\SACScontroller.sysj line: 49, column: 16
                S52033=0;
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

  public void thread52418(int [] tdone, int [] ends){
        switch(S51791){
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

  public void thread52417(int [] tdone, int [] ends){
        switch(S51775){
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

  public void thread52415(int [] tdone, int [] ends){
        S51791=1;
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

  public void thread52414(int [] tdone, int [] ends){
        S51775=1;
    open_door2.setPresent();//sysj\SACScontroller.sysj line: 30, column: 5
    currsigs.addElement(open_door2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread52413(int [] tdone, int [] ends){
        switch(S51987){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S51815){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 27, column: 9
              S51815=1;
              thread52414(tdone,ends);
              thread52415(tdone,ends);
              int biggest52416 = 0;
              if(ends[6]>=biggest52416){
                biggest52416=ends[6];
              }
              if(ends[7]>=biggest52416){
                biggest52416=ends[7];
              }
              if(biggest52416 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest52416 == 2){
                ends[5]=2;
                ;//sysj\SACScontroller.sysj line: 29, column: 3
                close_door2.setPresent();//sysj\SACScontroller.sysj line: 32, column: 3
                currsigs.addElement(close_door2);
                S51815=2;
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
            thread52417(tdone,ends);
            thread52418(tdone,ends);
            int biggest52419 = 0;
            if(ends[6]>=biggest52419){
              biggest52419=ends[6];
            }
            if(ends[7]>=biggest52419){
              biggest52419=ends[7];
            }
            if(biggest52419 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest52419 == 2){
              ends[5]=2;
              ;//sysj\SACScontroller.sysj line: 29, column: 3
              close_door2.setPresent();//sysj\SACScontroller.sysj line: 32, column: 3
              currsigs.addElement(close_door2);
              S51815=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest52419 == 0){
              close_door2.setPresent();//sysj\SACScontroller.sysj line: 32, column: 3
              currsigs.addElement(close_door2);
              S51815=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus()){//sysj\SACScontroller.sysj line: 34, column: 9
              S51815=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              if(!open_door2.getprestatus()){//sysj\SACScontroller.sysj line: 35, column: 16
                S51815=0;
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

  public void thread52411(int [] tdone, int [] ends){
        switch(S51573){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S51559){
          case 0 : 
            S51559=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=3;
              ;//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S51559=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S51559=1;
            S51559=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=3;
              ;//sysj\SACScontroller.sysj line: 13, column: 30
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S51559=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread52410(int [] tdone, int [] ends){
        switch(S51557){
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

  public void thread52408(int [] tdone, int [] ends){
        S51573=1;
    __start_thread_4 = com.systemj.Timer.getMs();//sysj\SACScontroller.sysj line: 13, column: 30
    S51559=0;
    if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 13, column: 30
      ends[4]=3;
      ;//sysj\SACScontroller.sysj line: 13, column: 30
      ends[4]=2;
      tdone[4]=1;
    }
    else {
      S51559=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread52407(int [] tdone, int [] ends){
        S51557=1;
    open_door1.setPresent();//sysj\SACScontroller.sysj line: 13, column: 6
    currsigs.addElement(open_door1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread52406(int [] tdone, int [] ends){
        switch(S51769){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S51597){
          case 0 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 10, column: 9
              S51597=1;
              thread52407(tdone,ends);
              thread52408(tdone,ends);
              int biggest52409 = 0;
              if(ends[3]>=biggest52409){
                biggest52409=ends[3];
              }
              if(ends[4]>=biggest52409){
                biggest52409=ends[4];
              }
              if(biggest52409 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest52409 == 2){
                ends[2]=2;
                ;//sysj\SACScontroller.sysj line: 11, column: 4
                close_door1.setPresent();//sysj\SACScontroller.sysj line: 16, column: 4
                currsigs.addElement(close_door1);
                S51597=2;
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
            thread52410(tdone,ends);
            thread52411(tdone,ends);
            int biggest52412 = 0;
            if(ends[3]>=biggest52412){
              biggest52412=ends[3];
            }
            if(ends[4]>=biggest52412){
              biggest52412=ends[4];
            }
            if(biggest52412 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest52412 == 2){
              ends[2]=2;
              ;//sysj\SACScontroller.sysj line: 11, column: 4
              close_door1.setPresent();//sysj\SACScontroller.sysj line: 16, column: 4
              currsigs.addElement(close_door1);
              S51597=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest52412 == 0){
              close_door1.setPresent();//sysj\SACScontroller.sysj line: 16, column: 4
              currsigs.addElement(close_door1);
              S51597=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus()){//sysj\SACScontroller.sysj line: 18, column: 10
              S51597=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              if(!open_door1.getprestatus()){//sysj\SACScontroller.sysj line: 19, column: 17
                S51597=0;
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

  public void thread52404(int [] tdone, int [] ends){
        S52397=1;
    S52225=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread52403(int [] tdone, int [] ends){
        S52205=1;
    S52033=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread52402(int [] tdone, int [] ends){
        S51987=1;
    S51815=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread52401(int [] tdone, int [] ends){
        S51769=1;
    S51597=0;
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
      switch(S52399){
        case 0 : 
          S52399=0;
          break RUN;
        
        case 1 : 
          S52399=2;
          S52399=2;
          thread52401(tdone,ends);
          thread52402(tdone,ends);
          thread52403(tdone,ends);
          thread52404(tdone,ends);
          int biggest52405 = 0;
          if(ends[2]>=biggest52405){
            biggest52405=ends[2];
          }
          if(ends[5]>=biggest52405){
            biggest52405=ends[5];
          }
          if(ends[8]>=biggest52405){
            biggest52405=ends[8];
          }
          if(ends[11]>=biggest52405){
            biggest52405=ends[11];
          }
          if(biggest52405 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread52406(tdone,ends);
          thread52413(tdone,ends);
          thread52420(tdone,ends);
          thread52427(tdone,ends);
          int biggest52446 = 0;
          if(ends[2]>=biggest52446){
            biggest52446=ends[2];
          }
          if(ends[5]>=biggest52446){
            biggest52446=ends[5];
          }
          if(ends[8]>=biggest52446){
            biggest52446=ends[8];
          }
          if(ends[11]>=biggest52446){
            biggest52446=ends[11];
          }
          if(biggest52446 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest52446 == 0){
            S52399=0;
            active[1]=0;
            ends[1]=0;
            S52399=0;
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
