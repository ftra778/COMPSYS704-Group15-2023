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
  private long __start_thread_4;//sysj\SACScontroller.sysj line: 12, column: 30
  private long __start_thread_7;//sysj\SACScontroller.sysj line: 29, column: 29
  private long __start_thread_10;//sysj\SACScontroller.sysj line: 43, column: 29
  private int S65271 = 1;
  private int S64533 = 1;
  private int S64361 = 1;
  private int S64321 = 1;
  private int S64337 = 1;
  private int S64323 = 1;
  private int S64751 = 1;
  private int S64579 = 1;
  private int S64539 = 1;
  private int S64555 = 1;
  private int S64969 = 1;
  private int S64797 = 1;
  private int S64757 = 1;
  private int S64773 = 1;
  private int S65261 = 1;
  private int S65009 = 1;
  private int S64975 = 1;
  private int S64980 = 1;
  private int S64985 = 1;
  private int S64988 = 1;
  private int S65269 = 1;
  
  private int[] ends = new int[20];
  private int[] tdone = new int[20];
  
  public void thread65323(int [] tdone, int [] ends){
        switch(S65269){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(open_door3.getprestatus()){//sysj\SACScontroller.sysj line: 65, column: 11
          System.out.println("open_door3");//sysj\SACScontroller.sysj line: 65, column: 23
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread65321(int [] tdone, int [] ends){
        active[18]=0;
    ends[18]=0;
    tdone[18]=1;
  }

  public void thread65320(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread65319(int [] tdone, int [] ends){
        active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread65317(int [] tdone, int [] ends){
        close_door3.setPresent();//sysj\SACScontroller.sysj line: 59, column: 50
    currsigs.addElement(close_door3);
    System.out.println("smoke NOT detected. CLOSE DOOR");//sysj\SACScontroller.sysj line: 59, column: 68
    active[18]=0;
    ends[18]=0;
    tdone[18]=1;
  }

  public void thread65316(int [] tdone, int [] ends){
        close_door2.setPresent();//sysj\SACScontroller.sysj line: 59, column: 27
    currsigs.addElement(close_door2);
    active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread65315(int [] tdone, int [] ends){
        close_door1.setPresent();//sysj\SACScontroller.sysj line: 59, column: 4
    currsigs.addElement(close_door1);
    active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread65313(int [] tdone, int [] ends){
        close_door3.setPresent();//sysj\SACScontroller.sysj line: 59, column: 50
    currsigs.addElement(close_door3);
    System.out.println("smoke NOT detected. CLOSE DOOR");//sysj\SACScontroller.sysj line: 59, column: 68
    active[18]=0;
    ends[18]=0;
    tdone[18]=1;
  }

  public void thread65312(int [] tdone, int [] ends){
        close_door2.setPresent();//sysj\SACScontroller.sysj line: 59, column: 27
    currsigs.addElement(close_door2);
    active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread65311(int [] tdone, int [] ends){
        close_door1.setPresent();//sysj\SACScontroller.sysj line: 59, column: 4
    currsigs.addElement(close_door1);
    active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread65309(int [] tdone, int [] ends){
        switch(S64988){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(!smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 57, column: 89
          ends[15]=2;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread65308(int [] tdone, int [] ends){
        switch(S64985){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        open_door3.setPresent();//sysj\SACScontroller.sysj line: 57, column: 58
        currsigs.addElement(open_door3);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread65307(int [] tdone, int [] ends){
        switch(S64980){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        open_door2.setPresent();//sysj\SACScontroller.sysj line: 57, column: 33
        currsigs.addElement(open_door2);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread65306(int [] tdone, int [] ends){
        switch(S64975){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        open_door1.setPresent();//sysj\SACScontroller.sysj line: 57, column: 8
        currsigs.addElement(open_door1);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread65304(int [] tdone, int [] ends){
        S64988=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread65303(int [] tdone, int [] ends){
        S64985=1;
    open_door3.setPresent();//sysj\SACScontroller.sysj line: 57, column: 58
    currsigs.addElement(open_door3);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread65302(int [] tdone, int [] ends){
        S64980=1;
    open_door2.setPresent();//sysj\SACScontroller.sysj line: 57, column: 33
    currsigs.addElement(open_door2);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread65301(int [] tdone, int [] ends){
        S64975=1;
    open_door1.setPresent();//sysj\SACScontroller.sysj line: 57, column: 8
    currsigs.addElement(open_door1);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread65300(int [] tdone, int [] ends){
        switch(S65261){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S65009){
          case 0 : 
            if(smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 54, column: 12
              S65009=1;
              thread65301(tdone,ends);
              thread65302(tdone,ends);
              thread65303(tdone,ends);
              thread65304(tdone,ends);
              int biggest65305 = 0;
              if(ends[12]>=biggest65305){
                biggest65305=ends[12];
              }
              if(ends[13]>=biggest65305){
                biggest65305=ends[13];
              }
              if(ends[14]>=biggest65305){
                biggest65305=ends[14];
              }
              if(ends[15]>=biggest65305){
                biggest65305=ends[15];
              }
              if(biggest65305 == 1){
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
            thread65306(tdone,ends);
            thread65307(tdone,ends);
            thread65308(tdone,ends);
            thread65309(tdone,ends);
            int biggest65310 = 0;
            if(ends[12]>=biggest65310){
              biggest65310=ends[12];
            }
            if(ends[13]>=biggest65310){
              biggest65310=ends[13];
            }
            if(ends[14]>=biggest65310){
              biggest65310=ends[14];
            }
            if(ends[15]>=biggest65310){
              biggest65310=ends[15];
            }
            if(biggest65310 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            if(biggest65310 == 2){
              ends[11]=2;
              ;//sysj\SACScontroller.sysj line: 56, column: 6
              S65009=2;
              thread65311(tdone,ends);
              thread65312(tdone,ends);
              thread65313(tdone,ends);
              int biggest65314 = 0;
              if(ends[16]>=biggest65314){
                biggest65314=ends[16];
              }
              if(ends[17]>=biggest65314){
                biggest65314=ends[17];
              }
              if(ends[18]>=biggest65314){
                biggest65314=ends[18];
              }
              //FINXME code
              if(biggest65314 == 0){
                S65009=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            //FINXME code
            if(biggest65310 == 0){
              S65009=2;
              thread65315(tdone,ends);
              thread65316(tdone,ends);
              thread65317(tdone,ends);
              int biggest65318 = 0;
              if(ends[16]>=biggest65318){
                biggest65318=ends[16];
              }
              if(ends[17]>=biggest65318){
                biggest65318=ends[17];
              }
              if(ends[18]>=biggest65318){
                biggest65318=ends[18];
              }
              //FINXME code
              if(biggest65318 == 0){
                S65009=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            break;
          
          case 2 : 
            thread65319(tdone,ends);
            thread65320(tdone,ends);
            thread65321(tdone,ends);
            int biggest65322 = 0;
            if(ends[16]>=biggest65322){
              biggest65322=ends[16];
            }
            if(ends[17]>=biggest65322){
              biggest65322=ends[17];
            }
            if(ends[18]>=biggest65322){
              biggest65322=ends[18];
            }
            //FINXME code
            if(biggest65322 == 0){
              S65009=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread65298(int [] tdone, int [] ends){
        switch(S64773){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_10 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 43, column: 29
          ends[10]=3;
          ;//sysj\SACScontroller.sysj line: 43, column: 29
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

  public void thread65297(int [] tdone, int [] ends){
        switch(S64757){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        open_door3.setPresent();//sysj\SACScontroller.sysj line: 43, column: 5
        currsigs.addElement(open_door3);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread65295(int [] tdone, int [] ends){
        S64773=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\SACScontroller.sysj line: 43, column: 29
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 43, column: 29
      ends[10]=3;
      ;//sysj\SACScontroller.sysj line: 43, column: 29
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread65294(int [] tdone, int [] ends){
        S64757=1;
    open_door3.setPresent();//sysj\SACScontroller.sysj line: 43, column: 5
    currsigs.addElement(open_door3);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread65293(int [] tdone, int [] ends){
        switch(S64969){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S64797){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 40, column: 9
              S64797=1;
              thread65294(tdone,ends);
              thread65295(tdone,ends);
              int biggest65296 = 0;
              if(ends[9]>=biggest65296){
                biggest65296=ends[9];
              }
              if(ends[10]>=biggest65296){
                biggest65296=ends[10];
              }
              if(biggest65296 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest65296 == 2){
                ends[8]=2;
                ;//sysj\SACScontroller.sysj line: 42, column: 3
                close_door3.setPresent();//sysj\SACScontroller.sysj line: 45, column: 3
                currsigs.addElement(close_door3);
                S64797=2;
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
            thread65297(tdone,ends);
            thread65298(tdone,ends);
            int biggest65299 = 0;
            if(ends[9]>=biggest65299){
              biggest65299=ends[9];
            }
            if(ends[10]>=biggest65299){
              biggest65299=ends[10];
            }
            if(biggest65299 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            if(biggest65299 == 2){
              ends[8]=2;
              ;//sysj\SACScontroller.sysj line: 42, column: 3
              close_door3.setPresent();//sysj\SACScontroller.sysj line: 45, column: 3
              currsigs.addElement(close_door3);
              S64797=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest65299 == 0){
              close_door3.setPresent();//sysj\SACScontroller.sysj line: 45, column: 3
              currsigs.addElement(close_door3);
              S64797=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus()){//sysj\SACScontroller.sysj line: 47, column: 9
              S64797=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              if(!open_door3.getprestatus()){//sysj\SACScontroller.sysj line: 48, column: 16
                S64797=0;
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

  public void thread65291(int [] tdone, int [] ends){
        switch(S64555){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_7 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 29, column: 29
          ends[7]=3;
          ;//sysj\SACScontroller.sysj line: 29, column: 29
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

  public void thread65290(int [] tdone, int [] ends){
        switch(S64539){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        open_door2.setPresent();//sysj\SACScontroller.sysj line: 29, column: 5
        currsigs.addElement(open_door2);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread65288(int [] tdone, int [] ends){
        S64555=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\SACScontroller.sysj line: 29, column: 29
    if(com.systemj.Timer.getMs() - __start_thread_7 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 29, column: 29
      ends[7]=3;
      ;//sysj\SACScontroller.sysj line: 29, column: 29
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread65287(int [] tdone, int [] ends){
        S64539=1;
    open_door2.setPresent();//sysj\SACScontroller.sysj line: 29, column: 5
    currsigs.addElement(open_door2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread65286(int [] tdone, int [] ends){
        switch(S64751){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S64579){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 26, column: 9
              S64579=1;
              thread65287(tdone,ends);
              thread65288(tdone,ends);
              int biggest65289 = 0;
              if(ends[6]>=biggest65289){
                biggest65289=ends[6];
              }
              if(ends[7]>=biggest65289){
                biggest65289=ends[7];
              }
              if(biggest65289 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest65289 == 2){
                ends[5]=2;
                ;//sysj\SACScontroller.sysj line: 28, column: 3
                close_door2.setPresent();//sysj\SACScontroller.sysj line: 31, column: 3
                currsigs.addElement(close_door2);
                S64579=2;
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
            thread65290(tdone,ends);
            thread65291(tdone,ends);
            int biggest65292 = 0;
            if(ends[6]>=biggest65292){
              biggest65292=ends[6];
            }
            if(ends[7]>=biggest65292){
              biggest65292=ends[7];
            }
            if(biggest65292 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest65292 == 2){
              ends[5]=2;
              ;//sysj\SACScontroller.sysj line: 28, column: 3
              close_door2.setPresent();//sysj\SACScontroller.sysj line: 31, column: 3
              currsigs.addElement(close_door2);
              S64579=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest65292 == 0){
              close_door2.setPresent();//sysj\SACScontroller.sysj line: 31, column: 3
              currsigs.addElement(close_door2);
              S64579=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus()){//sysj\SACScontroller.sysj line: 33, column: 9
              S64579=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              if(!open_door2.getprestatus()){//sysj\SACScontroller.sysj line: 34, column: 16
                S64579=0;
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

  public void thread65284(int [] tdone, int [] ends){
        switch(S64337){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S64323){
          case 0 : 
            S64323=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 12, column: 30
              ends[4]=3;
              ;//sysj\SACScontroller.sysj line: 12, column: 30
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S64323=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S64323=1;
            S64323=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 12, column: 30
              ends[4]=3;
              ;//sysj\SACScontroller.sysj line: 12, column: 30
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S64323=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread65283(int [] tdone, int [] ends){
        switch(S64321){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        open_door1.setPresent();//sysj\SACScontroller.sysj line: 12, column: 6
        currsigs.addElement(open_door1);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread65281(int [] tdone, int [] ends){
        S64337=1;
    __start_thread_4 = com.systemj.Timer.getMs();//sysj\SACScontroller.sysj line: 12, column: 30
    S64323=0;
    if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\SACScontroller.sysj line: 12, column: 30
      ends[4]=3;
      ;//sysj\SACScontroller.sysj line: 12, column: 30
      ends[4]=2;
      tdone[4]=1;
    }
    else {
      S64323=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread65280(int [] tdone, int [] ends){
        S64321=1;
    open_door1.setPresent();//sysj\SACScontroller.sysj line: 12, column: 6
    currsigs.addElement(open_door1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread65279(int [] tdone, int [] ends){
        switch(S64533){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S64361){
          case 0 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus() && !smokeDetected.getprestatus()){//sysj\SACScontroller.sysj line: 9, column: 9
              S64361=1;
              thread65280(tdone,ends);
              thread65281(tdone,ends);
              int biggest65282 = 0;
              if(ends[3]>=biggest65282){
                biggest65282=ends[3];
              }
              if(ends[4]>=biggest65282){
                biggest65282=ends[4];
              }
              if(biggest65282 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest65282 == 2){
                ends[2]=2;
                ;//sysj\SACScontroller.sysj line: 10, column: 4
                close_door1.setPresent();//sysj\SACScontroller.sysj line: 15, column: 4
                currsigs.addElement(close_door1);
                S64361=2;
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
            thread65283(tdone,ends);
            thread65284(tdone,ends);
            int biggest65285 = 0;
            if(ends[3]>=biggest65285){
              biggest65285=ends[3];
            }
            if(ends[4]>=biggest65285){
              biggest65285=ends[4];
            }
            if(biggest65285 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest65285 == 2){
              ends[2]=2;
              ;//sysj\SACScontroller.sysj line: 10, column: 4
              close_door1.setPresent();//sysj\SACScontroller.sysj line: 15, column: 4
              currsigs.addElement(close_door1);
              S64361=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest65285 == 0){
              close_door1.setPresent();//sysj\SACScontroller.sysj line: 15, column: 4
              currsigs.addElement(close_door1);
              S64361=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus()){//sysj\SACScontroller.sysj line: 17, column: 10
              S64361=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              if(!open_door1.getprestatus()){//sysj\SACScontroller.sysj line: 18, column: 17
                S64361=0;
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

  public void thread65277(int [] tdone, int [] ends){
        S65269=1;
    if(open_door3.getprestatus()){//sysj\SACScontroller.sysj line: 65, column: 11
      System.out.println("open_door3");//sysj\SACScontroller.sysj line: 65, column: 23
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread65276(int [] tdone, int [] ends){
        S65261=1;
    S65009=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread65275(int [] tdone, int [] ends){
        S64969=1;
    S64797=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread65274(int [] tdone, int [] ends){
        S64751=1;
    S64579=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread65273(int [] tdone, int [] ends){
        S64533=1;
    S64361=0;
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
      switch(S65271){
        case 0 : 
          S65271=0;
          break RUN;
        
        case 1 : 
          S65271=2;
          S65271=2;
          thread65273(tdone,ends);
          thread65274(tdone,ends);
          thread65275(tdone,ends);
          thread65276(tdone,ends);
          thread65277(tdone,ends);
          int biggest65278 = 0;
          if(ends[2]>=biggest65278){
            biggest65278=ends[2];
          }
          if(ends[5]>=biggest65278){
            biggest65278=ends[5];
          }
          if(ends[8]>=biggest65278){
            biggest65278=ends[8];
          }
          if(ends[11]>=biggest65278){
            biggest65278=ends[11];
          }
          if(ends[19]>=biggest65278){
            biggest65278=ends[19];
          }
          if(biggest65278 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread65279(tdone,ends);
          thread65286(tdone,ends);
          thread65293(tdone,ends);
          thread65300(tdone,ends);
          thread65323(tdone,ends);
          int biggest65324 = 0;
          if(ends[2]>=biggest65324){
            biggest65324=ends[2];
          }
          if(ends[5]>=biggest65324){
            biggest65324=ends[5];
          }
          if(ends[8]>=biggest65324){
            biggest65324=ends[8];
          }
          if(ends[11]>=biggest65324){
            biggest65324=ends[11];
          }
          if(ends[19]>=biggest65324){
            biggest65324=ends[19];
          }
          if(biggest65324 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest65324 == 0){
            S65271=0;
            active[1]=0;
            ends[1]=0;
            S65271=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
