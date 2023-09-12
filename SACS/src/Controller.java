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
  private long __start_thread_4;//sysj\controller.sysj line: 11, column: 30
  private long __start_thread_7;//sysj\controller.sysj line: 26, column: 30
  private long __start_thread_10;//sysj\controller.sysj line: 41, column: 30
  private long __start_thread_13;//sysj\controller.sysj line: 56, column: 29
  private long __start_thread_16;//sysj\controller.sysj line: 70, column: 29
  private int S1229 = 1;
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
  private int S871 = 1;
  private int S699 = 1;
  private int S659 = 1;
  private int S675 = 1;
  private int S1089 = 1;
  private int S917 = 1;
  private int S877 = 1;
  private int S893 = 1;
  private int S1227 = 1;
  private int S1123 = 1;
  private int S1095 = 1;
  private int S1100 = 1;
  private int S1105 = 1;
  
  private int[] ends = new int[21];
  private int[] tdone = new int[21];
  
  public void thread1280(int [] tdone, int [] ends){
        switch(S1105){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        open_door3.setPresent();//sysj\controller.sysj line: 85, column: 61
        currsigs.addElement(open_door3);
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
        break;
      
    }
  }

  public void thread1279(int [] tdone, int [] ends){
        switch(S1100){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        open_door2.setPresent();//sysj\controller.sysj line: 85, column: 36
        currsigs.addElement(open_door2);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread1278(int [] tdone, int [] ends){
        switch(S1095){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        open_door1.setPresent();//sysj\controller.sysj line: 85, column: 11
        currsigs.addElement(open_door1);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread1276(int [] tdone, int [] ends){
        S1105=1;
    open_door3.setPresent();//sysj\controller.sysj line: 85, column: 61
    currsigs.addElement(open_door3);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread1275(int [] tdone, int [] ends){
        S1100=1;
    open_door2.setPresent();//sysj\controller.sysj line: 85, column: 36
    currsigs.addElement(open_door2);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread1274(int [] tdone, int [] ends){
        S1095=1;
    open_door1.setPresent();//sysj\controller.sysj line: 85, column: 11
    currsigs.addElement(open_door1);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread1273(int [] tdone, int [] ends){
        switch(S1227){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S1123){
          case 0 : 
            if(smokeDetected.getprestatus()){//sysj\controller.sysj line: 81, column: 12
              S1123=1;
              thread1274(tdone,ends);
              thread1275(tdone,ends);
              thread1276(tdone,ends);
              int biggest1277 = 0;
              if(ends[18]>=biggest1277){
                biggest1277=ends[18];
              }
              if(ends[19]>=biggest1277){
                biggest1277=ends[19];
              }
              if(ends[20]>=biggest1277){
                biggest1277=ends[20];
              }
              if(biggest1277 == 1){
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
            }
            else {
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            if(!smokeDetected.getprestatus()){//sysj\controller.sysj line: 83, column: 12
              S1123=0;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              thread1278(tdone,ends);
              thread1279(tdone,ends);
              thread1280(tdone,ends);
              int biggest1281 = 0;
              if(ends[18]>=biggest1281){
                biggest1281=ends[18];
              }
              if(ends[19]>=biggest1281){
                biggest1281=ends[19];
              }
              if(ends[20]>=biggest1281){
                biggest1281=ends[20];
              }
              if(biggest1281 == 1){
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
              //FINXME code
              if(biggest1281 == 0){
                S1123=0;
                active[17]=1;
                ends[17]=1;
                tdone[17]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1271(int [] tdone, int [] ends){
        switch(S893){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_16 >= (3.0) * 1000){//sysj\controller.sysj line: 70, column: 29
          ends[16]=3;
          ;//sysj\controller.sysj line: 70, column: 29
          ends[16]=2;
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

  public void thread1270(int [] tdone, int [] ends){
        switch(S877){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        open_door3.setPresent();//sysj\controller.sysj line: 70, column: 5
        currsigs.addElement(open_door3);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread1268(int [] tdone, int [] ends){
        S893=1;
    __start_thread_16 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 70, column: 29
    if(com.systemj.Timer.getMs() - __start_thread_16 >= (3.0) * 1000){//sysj\controller.sysj line: 70, column: 29
      ends[16]=3;
      ;//sysj\controller.sysj line: 70, column: 29
      ends[16]=2;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread1267(int [] tdone, int [] ends){
        S877=1;
    open_door3.setPresent();//sysj\controller.sysj line: 70, column: 5
    currsigs.addElement(open_door3);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread1266(int [] tdone, int [] ends){
        switch(S1089){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S917){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus()){//sysj\controller.sysj line: 67, column: 9
              S917=1;
              thread1267(tdone,ends);
              thread1268(tdone,ends);
              int biggest1269 = 0;
              if(ends[15]>=biggest1269){
                biggest1269=ends[15];
              }
              if(ends[16]>=biggest1269){
                biggest1269=ends[16];
              }
              if(biggest1269 == 1){
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
              if(biggest1269 == 2){
                ends[14]=2;
                ;//sysj\controller.sysj line: 69, column: 3
                close_door3.setPresent();//sysj\controller.sysj line: 72, column: 3
                currsigs.addElement(close_door3);
                S917=2;
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            else {
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            thread1270(tdone,ends);
            thread1271(tdone,ends);
            int biggest1272 = 0;
            if(ends[15]>=biggest1272){
              biggest1272=ends[15];
            }
            if(ends[16]>=biggest1272){
              biggest1272=ends[16];
            }
            if(biggest1272 == 1){
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            if(biggest1272 == 2){
              ends[14]=2;
              ;//sysj\controller.sysj line: 69, column: 3
              close_door3.setPresent();//sysj\controller.sysj line: 72, column: 3
              currsigs.addElement(close_door3);
              S917=2;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            //FINXME code
            if(biggest1272 == 0){
              close_door3.setPresent();//sysj\controller.sysj line: 72, column: 3
              currsigs.addElement(close_door3);
              S917=2;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor3.getprestatus()){//sysj\controller.sysj line: 74, column: 9
              S917=0;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              if(!open_door3.getprestatus()){//sysj\controller.sysj line: 75, column: 16
                S917=0;
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
              else {
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1264(int [] tdone, int [] ends){
        switch(S675){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_13 >= (3.0) * 1000){//sysj\controller.sysj line: 56, column: 29
          ends[13]=3;
          ;//sysj\controller.sysj line: 56, column: 29
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

  public void thread1263(int [] tdone, int [] ends){
        switch(S659){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        open_door2.setPresent();//sysj\controller.sysj line: 56, column: 5
        currsigs.addElement(open_door2);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread1261(int [] tdone, int [] ends){
        S675=1;
    __start_thread_13 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 56, column: 29
    if(com.systemj.Timer.getMs() - __start_thread_13 >= (3.0) * 1000){//sysj\controller.sysj line: 56, column: 29
      ends[13]=3;
      ;//sysj\controller.sysj line: 56, column: 29
      ends[13]=2;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread1260(int [] tdone, int [] ends){
        S659=1;
    open_door2.setPresent();//sysj\controller.sysj line: 56, column: 5
    currsigs.addElement(open_door2);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread1259(int [] tdone, int [] ends){
        switch(S871){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S699){
          case 0 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus()){//sysj\controller.sysj line: 53, column: 9
              S699=1;
              thread1260(tdone,ends);
              thread1261(tdone,ends);
              int biggest1262 = 0;
              if(ends[12]>=biggest1262){
                biggest1262=ends[12];
              }
              if(ends[13]>=biggest1262){
                biggest1262=ends[13];
              }
              if(biggest1262 == 1){
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              if(biggest1262 == 2){
                ends[11]=2;
                ;//sysj\controller.sysj line: 55, column: 3
                close_door2.setPresent();//sysj\controller.sysj line: 58, column: 3
                currsigs.addElement(close_door2);
                S699=2;
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
            thread1263(tdone,ends);
            thread1264(tdone,ends);
            int biggest1265 = 0;
            if(ends[12]>=biggest1265){
              biggest1265=ends[12];
            }
            if(ends[13]>=biggest1265){
              biggest1265=ends[13];
            }
            if(biggest1265 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            if(biggest1265 == 2){
              ends[11]=2;
              ;//sysj\controller.sysj line: 55, column: 3
              close_door2.setPresent();//sysj\controller.sysj line: 58, column: 3
              currsigs.addElement(close_door2);
              S699=2;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            //FINXME code
            if(biggest1265 == 0){
              close_door2.setPresent();//sysj\controller.sysj line: 58, column: 3
              currsigs.addElement(close_door2);
              S699=2;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 2 : 
            if(ManufacturingAuthorised.getprestatus() && accessDoor2.getprestatus()){//sysj\controller.sysj line: 60, column: 9
              S699=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              if(!open_door2.getprestatus()){//sysj\controller.sysj line: 61, column: 16
                S699=0;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1257(int [] tdone, int [] ends){
        switch(S457){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_10 >= (3.0) * 1000){//sysj\controller.sysj line: 41, column: 30
          ends[10]=3;
          ;//sysj\controller.sysj line: 41, column: 30
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

  public void thread1256(int [] tdone, int [] ends){
        switch(S441){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        open_door3.setPresent();//sysj\controller.sysj line: 41, column: 6
        currsigs.addElement(open_door3);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread1254(int [] tdone, int [] ends){
        S457=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 41, column: 30
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (3.0) * 1000){//sysj\controller.sysj line: 41, column: 30
      ends[10]=3;
      ;//sysj\controller.sysj line: 41, column: 30
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1253(int [] tdone, int [] ends){
        S441=1;
    open_door3.setPresent();//sysj\controller.sysj line: 41, column: 6
    currsigs.addElement(open_door3);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1252(int [] tdone, int [] ends){
        switch(S653){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S481){
          case 0 : 
            if(officeAuthorised.getprestatus() && accessDoor3.getprestatus()){//sysj\controller.sysj line: 38, column: 9
              S481=1;
              thread1253(tdone,ends);
              thread1254(tdone,ends);
              int biggest1255 = 0;
              if(ends[9]>=biggest1255){
                biggest1255=ends[9];
              }
              if(ends[10]>=biggest1255){
                biggest1255=ends[10];
              }
              if(biggest1255 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              if(biggest1255 == 2){
                ends[8]=2;
                ;//sysj\controller.sysj line: 40, column: 4
                close_door3.setPresent();//sysj\controller.sysj line: 43, column: 4
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
            thread1256(tdone,ends);
            thread1257(tdone,ends);
            int biggest1258 = 0;
            if(ends[9]>=biggest1258){
              biggest1258=ends[9];
            }
            if(ends[10]>=biggest1258){
              biggest1258=ends[10];
            }
            if(biggest1258 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            if(biggest1258 == 2){
              ends[8]=2;
              ;//sysj\controller.sysj line: 40, column: 4
              close_door3.setPresent();//sysj\controller.sysj line: 43, column: 4
              currsigs.addElement(close_door3);
              S481=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest1258 == 0){
              close_door3.setPresent();//sysj\controller.sysj line: 43, column: 4
              currsigs.addElement(close_door3);
              S481=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            if(officeAuthorised.getprestatus() && accessDoor3.getprestatus()){//sysj\controller.sysj line: 45, column: 10
              S481=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              if(!open_door3.getprestatus()){//sysj\controller.sysj line: 46, column: 17
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

  public void thread1250(int [] tdone, int [] ends){
        switch(S239){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_7 >= (3.0) * 1000){//sysj\controller.sysj line: 26, column: 30
          ends[7]=3;
          ;//sysj\controller.sysj line: 26, column: 30
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

  public void thread1249(int [] tdone, int [] ends){
        switch(S223){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        open_door2.setPresent();//sysj\controller.sysj line: 26, column: 6
        currsigs.addElement(open_door2);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread1247(int [] tdone, int [] ends){
        S239=1;
    __start_thread_7 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 26, column: 30
    if(com.systemj.Timer.getMs() - __start_thread_7 >= (3.0) * 1000){//sysj\controller.sysj line: 26, column: 30
      ends[7]=3;
      ;//sysj\controller.sysj line: 26, column: 30
      ends[7]=2;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1246(int [] tdone, int [] ends){
        S223=1;
    open_door2.setPresent();//sysj\controller.sysj line: 26, column: 6
    currsigs.addElement(open_door2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1245(int [] tdone, int [] ends){
        switch(S435){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S263){
          case 0 : 
            if(officeAuthorised.getprestatus() && accessDoor2.getprestatus()){//sysj\controller.sysj line: 23, column: 9
              S263=1;
              thread1246(tdone,ends);
              thread1247(tdone,ends);
              int biggest1248 = 0;
              if(ends[6]>=biggest1248){
                biggest1248=ends[6];
              }
              if(ends[7]>=biggest1248){
                biggest1248=ends[7];
              }
              if(biggest1248 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              if(biggest1248 == 2){
                ends[5]=2;
                ;//sysj\controller.sysj line: 25, column: 4
                close_door2.setPresent();//sysj\controller.sysj line: 28, column: 4
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
            thread1249(tdone,ends);
            thread1250(tdone,ends);
            int biggest1251 = 0;
            if(ends[6]>=biggest1251){
              biggest1251=ends[6];
            }
            if(ends[7]>=biggest1251){
              biggest1251=ends[7];
            }
            if(biggest1251 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest1251 == 2){
              ends[5]=2;
              ;//sysj\controller.sysj line: 25, column: 4
              close_door2.setPresent();//sysj\controller.sysj line: 28, column: 4
              currsigs.addElement(close_door2);
              S263=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest1251 == 0){
              close_door2.setPresent();//sysj\controller.sysj line: 28, column: 4
              currsigs.addElement(close_door2);
              S263=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus()){//sysj\controller.sysj line: 30, column: 10
              S263=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              if(!open_door2.getprestatus()){//sysj\controller.sysj line: 31, column: 17
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

  public void thread1243(int [] tdone, int [] ends){
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
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\controller.sysj line: 11, column: 30
              ends[4]=3;
              ;//sysj\controller.sysj line: 11, column: 30
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
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\controller.sysj line: 11, column: 30
              ends[4]=3;
              ;//sysj\controller.sysj line: 11, column: 30
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

  public void thread1242(int [] tdone, int [] ends){
        switch(S5){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        open_door1.setPresent();//sysj\controller.sysj line: 11, column: 6
        currsigs.addElement(open_door1);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread1240(int [] tdone, int [] ends){
        S21=1;
    __start_thread_4 = com.systemj.Timer.getMs();//sysj\controller.sysj line: 11, column: 30
    S7=0;
    if(com.systemj.Timer.getMs() - __start_thread_4 >= (3.0) * 1000){//sysj\controller.sysj line: 11, column: 30
      ends[4]=3;
      ;//sysj\controller.sysj line: 11, column: 30
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

  public void thread1239(int [] tdone, int [] ends){
        S5=1;
    open_door1.setPresent();//sysj\controller.sysj line: 11, column: 6
    currsigs.addElement(open_door1);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1238(int [] tdone, int [] ends){
        switch(S217){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S45){
          case 0 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus()){//sysj\controller.sysj line: 8, column: 9
              S45=1;
              thread1239(tdone,ends);
              thread1240(tdone,ends);
              int biggest1241 = 0;
              if(ends[3]>=biggest1241){
                biggest1241=ends[3];
              }
              if(ends[4]>=biggest1241){
                biggest1241=ends[4];
              }
              if(biggest1241 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest1241 == 2){
                ends[2]=2;
                ;//sysj\controller.sysj line: 10, column: 4
                close_door1.setPresent();//sysj\controller.sysj line: 13, column: 4
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
            thread1242(tdone,ends);
            thread1243(tdone,ends);
            int biggest1244 = 0;
            if(ends[3]>=biggest1244){
              biggest1244=ends[3];
            }
            if(ends[4]>=biggest1244){
              biggest1244=ends[4];
            }
            if(biggest1244 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest1244 == 2){
              ends[2]=2;
              ;//sysj\controller.sysj line: 10, column: 4
              close_door1.setPresent();//sysj\controller.sysj line: 13, column: 4
              currsigs.addElement(close_door1);
              S45=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest1244 == 0){
              close_door1.setPresent();//sysj\controller.sysj line: 13, column: 4
              currsigs.addElement(close_door1);
              S45=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(officeAuthorised.getprestatus() && accessDoor1.getprestatus()){//sysj\controller.sysj line: 15, column: 10
              S45=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              if(!open_door1.getprestatus()){//sysj\controller.sysj line: 16, column: 17
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

  public void thread1236(int [] tdone, int [] ends){
        S1227=1;
    S1123=0;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread1235(int [] tdone, int [] ends){
        S1089=1;
    S917=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread1234(int [] tdone, int [] ends){
        S871=1;
    S699=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread1233(int [] tdone, int [] ends){
        S653=1;
    S481=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread1232(int [] tdone, int [] ends){
        S435=1;
    S263=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1231(int [] tdone, int [] ends){
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
      switch(S1229){
        case 0 : 
          S1229=0;
          break RUN;
        
        case 1 : 
          S1229=2;
          S1229=2;
          thread1231(tdone,ends);
          thread1232(tdone,ends);
          thread1233(tdone,ends);
          thread1234(tdone,ends);
          thread1235(tdone,ends);
          thread1236(tdone,ends);
          int biggest1237 = 0;
          if(ends[2]>=biggest1237){
            biggest1237=ends[2];
          }
          if(ends[5]>=biggest1237){
            biggest1237=ends[5];
          }
          if(ends[8]>=biggest1237){
            biggest1237=ends[8];
          }
          if(ends[11]>=biggest1237){
            biggest1237=ends[11];
          }
          if(ends[14]>=biggest1237){
            biggest1237=ends[14];
          }
          if(ends[17]>=biggest1237){
            biggest1237=ends[17];
          }
          if(biggest1237 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1238(tdone,ends);
          thread1245(tdone,ends);
          thread1252(tdone,ends);
          thread1259(tdone,ends);
          thread1266(tdone,ends);
          thread1273(tdone,ends);
          int biggest1282 = 0;
          if(ends[2]>=biggest1282){
            biggest1282=ends[2];
          }
          if(ends[5]>=biggest1282){
            biggest1282=ends[5];
          }
          if(ends[8]>=biggest1282){
            biggest1282=ends[8];
          }
          if(ends[11]>=biggest1282){
            biggest1282=ends[11];
          }
          if(ends[14]>=biggest1282){
            biggest1282=ends[14];
          }
          if(ends[17]>=biggest1282){
            biggest1282=ends[17];
          }
          if(biggest1282 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1282 == 0){
            S1229=0;
            active[1]=0;
            ends[1]=0;
            S1229=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
