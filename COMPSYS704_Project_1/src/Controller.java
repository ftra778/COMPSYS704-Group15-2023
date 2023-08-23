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
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  private Signal auto_1;
  private int S3117 = 1;
  private int S778 = 1;
  private int S777 = 1;
  private int S10 = 1;
  private int S2 = 1;
  private int S732 = 1;
  private int S12 = 1;
  private int S17 = 1;
  private int S16 = 1;
  private int S49 = 1;
  private int S48 = 1;
  private int S83 = 1;
  private int S82 = 1;
  private int S115 = 1;
  private int S114 = 1;
  private int S154 = 1;
  private int S153 = 1;
  private int S147 = 1;
  private int S152 = 1;
  private int S223 = 1;
  private int S222 = 1;
  private int S776 = 1;
  private int S746 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread3166(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\controller.sysj line: 130, column: 16
      armDest.setPresent();//sysj\controller.sysj line: 130, column: 44
      currsigs.addElement(armDest);
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
    else {
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
  }

  public void thread3165(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 128, column: 16
      vacOn.setPresent();//sysj\controller.sysj line: 128, column: 31
      currsigs.addElement(vacOn);
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread3164(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 126, column: 16
      pusherExtend.setPresent();//sysj\controller.sysj line: 126, column: 36
      currsigs.addElement(pusherExtend);
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
    else {
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
  }

  public void thread3163(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\controller.sysj line: 124, column: 16
      armSource.setPresent();//sysj\controller.sysj line: 124, column: 44
      currsigs.addElement(armSource);
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
    else {
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread3162(int [] tdone, int [] ends){
        S776=1;
    S746=0;
    if(!auto_1.getprestatus()){//sysj\controller.sysj line: 123, column: 14
      thread3163(tdone,ends);
      thread3164(tdone,ends);
      thread3165(tdone,ends);
      thread3166(tdone,ends);
      int biggest3167 = 0;
      if(ends[7]>=biggest3167){
        biggest3167=ends[7];
      }
      if(ends[8]>=biggest3167){
        biggest3167=ends[8];
      }
      if(ends[9]>=biggest3167){
        biggest3167=ends[9];
      }
      if(ends[10]>=biggest3167){
        biggest3167=ends[10];
      }
      //FINXME code
      if(biggest3167 == 0){
        S746=1;
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S746=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread3161(int [] tdone, int [] ends){
        S732=1;
    S12=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3160(int [] tdone, int [] ends){
        S10=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 14, column: 9
      S2=0;
      auto_1.setPresent();//sysj\controller.sysj line: 15, column: 7
      currsigs.addElement(auto_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread3157(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\controller.sysj line: 130, column: 16
      armDest.setPresent();//sysj\controller.sysj line: 130, column: 44
      currsigs.addElement(armDest);
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
    else {
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
  }

  public void thread3156(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 128, column: 16
      vacOn.setPresent();//sysj\controller.sysj line: 128, column: 31
      currsigs.addElement(vacOn);
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread3155(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 126, column: 16
      pusherExtend.setPresent();//sysj\controller.sysj line: 126, column: 36
      currsigs.addElement(pusherExtend);
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
    else {
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
  }

  public void thread3154(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\controller.sysj line: 124, column: 16
      armSource.setPresent();//sysj\controller.sysj line: 124, column: 44
      currsigs.addElement(armSource);
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
    else {
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread3153(int [] tdone, int [] ends){
        S776=1;
    S746=0;
    if(!auto_1.getprestatus()){//sysj\controller.sysj line: 123, column: 14
      thread3154(tdone,ends);
      thread3155(tdone,ends);
      thread3156(tdone,ends);
      thread3157(tdone,ends);
      int biggest3158 = 0;
      if(ends[7]>=biggest3158){
        biggest3158=ends[7];
      }
      if(ends[8]>=biggest3158){
        biggest3158=ends[8];
      }
      if(ends[9]>=biggest3158){
        biggest3158=ends[9];
      }
      if(ends[10]>=biggest3158){
        biggest3158=ends[10];
      }
      //FINXME code
      if(biggest3158 == 0){
        S746=1;
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S746=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread3152(int [] tdone, int [] ends){
        S732=1;
    S12=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3151(int [] tdone, int [] ends){
        S10=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 14, column: 9
      S2=0;
      auto_1.setPresent();//sysj\controller.sysj line: 15, column: 7
      currsigs.addElement(auto_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread3148(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\controller.sysj line: 130, column: 16
      armDest.setPresent();//sysj\controller.sysj line: 130, column: 44
      currsigs.addElement(armDest);
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
    else {
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
  }

  public void thread3147(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 128, column: 16
      vacOn.setPresent();//sysj\controller.sysj line: 128, column: 31
      currsigs.addElement(vacOn);
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread3146(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 126, column: 16
      pusherExtend.setPresent();//sysj\controller.sysj line: 126, column: 36
      currsigs.addElement(pusherExtend);
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
    else {
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
  }

  public void thread3145(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\controller.sysj line: 124, column: 16
      armSource.setPresent();//sysj\controller.sysj line: 124, column: 44
      currsigs.addElement(armSource);
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
    else {
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread3143(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread3142(int [] tdone, int [] ends){
        active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread3141(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread3140(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread3139(int [] tdone, int [] ends){
        switch(S776){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S746){
          case 0 : 
            thread3140(tdone,ends);
            thread3141(tdone,ends);
            thread3142(tdone,ends);
            thread3143(tdone,ends);
            int biggest3144 = 0;
            if(ends[7]>=biggest3144){
              biggest3144=ends[7];
            }
            if(ends[8]>=biggest3144){
              biggest3144=ends[8];
            }
            if(ends[9]>=biggest3144){
              biggest3144=ends[9];
            }
            if(ends[10]>=biggest3144){
              biggest3144=ends[10];
            }
            //FINXME code
            if(biggest3144 == 0){
              S746=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S746=1;
            S746=0;
            if(!auto_1.getprestatus()){//sysj\controller.sysj line: 123, column: 14
              thread3145(tdone,ends);
              thread3146(tdone,ends);
              thread3147(tdone,ends);
              thread3148(tdone,ends);
              int biggest3149 = 0;
              if(ends[7]>=biggest3149){
                biggest3149=ends[7];
              }
              if(ends[8]>=biggest3149){
                biggest3149=ends[8];
              }
              if(ends[9]>=biggest3149){
                biggest3149=ends[9];
              }
              if(ends[10]>=biggest3149){
                biggest3149=ends[10];
              }
              //FINXME code
              if(biggest3149 == 0){
                S746=1;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              S746=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3137(int [] tdone, int [] ends){
        S152=1;
    vacOn.setPresent();//sysj\controller.sysj line: 90, column: 35
    currsigs.addElement(vacOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3136(int [] tdone, int [] ends){
        S147=1;
    armDest.setPresent();//sysj\controller.sysj line: 90, column: 11
    currsigs.addElement(armDest);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3134(int [] tdone, int [] ends){
        switch(S152){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 90, column: 35
        currsigs.addElement(vacOn);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread3133(int [] tdone, int [] ends){
        switch(S147){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 90, column: 11
        currsigs.addElement(armDest);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread3131(int [] tdone, int [] ends){
        S152=1;
    vacOn.setPresent();//sysj\controller.sysj line: 90, column: 35
    currsigs.addElement(vacOn);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3130(int [] tdone, int [] ends){
        S147=1;
    armDest.setPresent();//sysj\controller.sysj line: 90, column: 11
    currsigs.addElement(armDest);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3129(int [] tdone, int [] ends){
        switch(S732){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S12){
          case 0 : 
            if(request.getprestatus()){//sysj\controller.sysj line: 26, column: 12
              System.out.println("req");//sysj\controller.sysj line: 27, column: 6
              S12=1;
              S17=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 31, column: 16
                S16=0;
                armDest.setPresent();//sysj\controller.sysj line: 32, column: 9
                currsigs.addElement(armDest);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S16=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\controller.sysj line: 28, column: 12
              System.out.println("armAtDest");//sysj\controller.sysj line: 40, column: 6
              S12=2;
              S49=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 44, column: 16
                S48=0;
                pusherExtend.setPresent();//sysj\controller.sysj line: 45, column: 9
                currsigs.addElement(pusherExtend);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S48=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              switch(S17){
                case 0 : 
                  switch(S16){
                    case 0 : 
                      armDest.setPresent();//sysj\controller.sysj line: 32, column: 9
                      currsigs.addElement(armDest);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                    case 1 : 
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S17=1;
                  S17=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 31, column: 16
                    S16=0;
                    armDest.setPresent();//sysj\controller.sysj line: 32, column: 9
                    currsigs.addElement(armDest);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S16=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 42, column: 12
              System.out.println("pusherEx");//sysj\controller.sysj line: 52, column: 6
              S12=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S49){
                case 0 : 
                  switch(S48){
                    case 0 : 
                      pusherExtend.setPresent();//sysj\controller.sysj line: 45, column: 9
                      currsigs.addElement(pusherExtend);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                    case 1 : 
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S49=1;
                  S49=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 44, column: 16
                    S48=0;
                    pusherExtend.setPresent();//sysj\controller.sysj line: 45, column: 9
                    currsigs.addElement(pusherExtend);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S48=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 3 : 
            if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 55, column: 12
              System.out.println("pusherRe");//sysj\controller.sysj line: 58, column: 6
              S12=4;
              S83=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 63, column: 16
                S82=0;
                armSource.setPresent();//sysj\controller.sysj line: 64, column: 9
                currsigs.addElement(armSource);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S82=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 4 : 
            if(armAtSource.getprestatus()){//sysj\controller.sysj line: 61, column: 12
              System.out.println("armAS");//sysj\controller.sysj line: 71, column: 6
              S12=5;
              S115=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 76, column: 16
                S114=0;
                vacOn.setPresent();//sysj\controller.sysj line: 77, column: 9
                currsigs.addElement(vacOn);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S114=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              switch(S83){
                case 0 : 
                  switch(S82){
                    case 0 : 
                      armSource.setPresent();//sysj\controller.sysj line: 64, column: 9
                      currsigs.addElement(armSource);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                    case 1 : 
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S83=1;
                  S83=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 63, column: 16
                    S82=0;
                    armSource.setPresent();//sysj\controller.sysj line: 64, column: 9
                    currsigs.addElement(armSource);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S82=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 5 : 
            if(WPgripped.getprestatus()){//sysj\controller.sysj line: 74, column: 12
              System.out.println("WPgripped");//sysj\controller.sysj line: 84, column: 6
              S12=6;
              S154=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 89, column: 16
                S153=0;
                thread3130(tdone,ends);
                thread3131(tdone,ends);
                int biggest3132 = 0;
                if(ends[4]>=biggest3132){
                  biggest3132=ends[4];
                }
                if(ends[5]>=biggest3132){
                  biggest3132=ends[5];
                }
                if(biggest3132 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S153=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              switch(S115){
                case 0 : 
                  switch(S114){
                    case 0 : 
                      vacOn.setPresent();//sysj\controller.sysj line: 77, column: 9
                      currsigs.addElement(vacOn);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                    case 1 : 
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S115=1;
                  S115=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 76, column: 16
                    S114=0;
                    vacOn.setPresent();//sysj\controller.sysj line: 77, column: 9
                    currsigs.addElement(vacOn);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S114=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 6 : 
            if(armAtDest.getprestatus()){//sysj\controller.sysj line: 87, column: 12
              System.out.println("armAD");//sysj\controller.sysj line: 97, column: 6
              S12=7;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S154){
                case 0 : 
                  switch(S153){
                    case 0 : 
                      thread3133(tdone,ends);
                      thread3134(tdone,ends);
                      int biggest3135 = 0;
                      if(ends[4]>=biggest3135){
                        biggest3135=ends[4];
                      }
                      if(ends[5]>=biggest3135){
                        biggest3135=ends[5];
                      }
                      if(biggest3135 == 1){
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      //FINXME code
                      if(biggest3135 == 0){
                        S154=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S154=1;
                  S154=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 89, column: 16
                    S153=0;
                    thread3136(tdone,ends);
                    thread3137(tdone,ends);
                    int biggest3138 = 0;
                    if(ends[4]>=biggest3138){
                      biggest3138=ends[4];
                    }
                    if(ends[5]>=biggest3138){
                      biggest3138=ends[5];
                    }
                    if(biggest3138 == 1){
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                  }
                  else {
                    S153=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 7 : 
            if(!WPgripped.getprestatus()){//sysj\controller.sysj line: 100, column: 12
              System.out.println("!WPgripped");//sysj\controller.sysj line: 103, column: 6
              S12=8;
              S223=0;
              if(auto_1.getprestatus()){//sysj\controller.sysj line: 108, column: 16
                S222=0;
                armSource.setPresent();//sysj\controller.sysj line: 109, column: 9
                currsigs.addElement(armSource);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S222=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 8 : 
            if(armAtSource.getprestatus()){//sysj\controller.sysj line: 106, column: 12
              System.out.println("armAS");//sysj\controller.sysj line: 116, column: 6
              S12=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S223){
                case 0 : 
                  switch(S222){
                    case 0 : 
                      armSource.setPresent();//sysj\controller.sysj line: 109, column: 9
                      currsigs.addElement(armSource);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                    case 1 : 
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  S223=1;
                  S223=0;
                  if(auto_1.getprestatus()){//sysj\controller.sysj line: 108, column: 16
                    S222=0;
                    armSource.setPresent();//sysj\controller.sysj line: 109, column: 9
                    currsigs.addElement(armSource);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S222=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3128(int [] tdone, int [] ends){
        switch(S10){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2){
          case 0 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 14, column: 9
              S2=0;
              auto_1.setPresent();//sysj\controller.sysj line: 15, column: 7
              currsigs.addElement(auto_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S2=1;
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 14, column: 9
              S2=0;
              auto_1.setPresent();//sysj\controller.sysj line: 15, column: 7
              currsigs.addElement(auto_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3125(int [] tdone, int [] ends){
        if(!armSourceM.getprestatus() && armDestM.getprestatus()){//sysj\controller.sysj line: 130, column: 16
      armDest.setPresent();//sysj\controller.sysj line: 130, column: 44
      currsigs.addElement(armDest);
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
    else {
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
  }

  public void thread3124(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 128, column: 16
      vacOn.setPresent();//sysj\controller.sysj line: 128, column: 31
      currsigs.addElement(vacOn);
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
    else {
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread3123(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 126, column: 16
      pusherExtend.setPresent();//sysj\controller.sysj line: 126, column: 36
      currsigs.addElement(pusherExtend);
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
    else {
      active[8]=0;
      ends[8]=0;
      tdone[8]=1;
    }
  }

  public void thread3122(int [] tdone, int [] ends){
        if(armSourceM.getprestatus() && !armDestM.getprestatus()){//sysj\controller.sysj line: 124, column: 16
      armSource.setPresent();//sysj\controller.sysj line: 124, column: 44
      currsigs.addElement(armSource);
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
    else {
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread3121(int [] tdone, int [] ends){
        S776=1;
    S746=0;
    if(!auto_1.getprestatus()){//sysj\controller.sysj line: 123, column: 14
      thread3122(tdone,ends);
      thread3123(tdone,ends);
      thread3124(tdone,ends);
      thread3125(tdone,ends);
      int biggest3126 = 0;
      if(ends[7]>=biggest3126){
        biggest3126=ends[7];
      }
      if(ends[8]>=biggest3126){
        biggest3126=ends[8];
      }
      if(ends[9]>=biggest3126){
        biggest3126=ends[9];
      }
      if(ends[10]>=biggest3126){
        biggest3126=ends[10];
      }
      //FINXME code
      if(biggest3126 == 0){
        S746=1;
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
    }
    else {
      S746=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread3120(int [] tdone, int [] ends){
        S732=1;
    S12=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3119(int [] tdone, int [] ends){
        S10=1;
    if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 14, column: 9
      S2=0;
      auto_1.setPresent();//sysj\controller.sysj line: 15, column: 7
      currsigs.addElement(auto_1);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2=1;
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
      switch(S3117){
        case 0 : 
          S3117=0;
          break RUN;
        
        case 1 : 
          S3117=2;
          S3117=2;
          if(mode.getprestatus()){//sysj\controller.sysj line: 10, column: 11
            S778=0;
            auto_1.setClear();//sysj\controller.sysj line: 11, column: 4
            S777=0;
            thread3119(tdone,ends);
            thread3120(tdone,ends);
            thread3121(tdone,ends);
            int biggest3127 = 0;
            if(ends[2]>=biggest3127){
              biggest3127=ends[2];
            }
            if(ends[3]>=biggest3127){
              biggest3127=ends[3];
            }
            if(ends[6]>=biggest3127){
              biggest3127=ends[6];
            }
            if(biggest3127 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
          else {
            S778=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S778){
            case 0 : 
              auto_1.setClear();//sysj\controller.sysj line: 11, column: 4
              switch(S777){
                case 0 : 
                  thread3128(tdone,ends);
                  thread3129(tdone,ends);
                  thread3139(tdone,ends);
                  int biggest3150 = 0;
                  if(ends[2]>=biggest3150){
                    biggest3150=ends[2];
                  }
                  if(ends[3]>=biggest3150){
                    biggest3150=ends[3];
                  }
                  if(ends[6]>=biggest3150){
                    biggest3150=ends[6];
                  }
                  if(biggest3150 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest3150 == 0){
                    S777=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  S777=1;
                  if(mode.getprestatus()){//sysj\controller.sysj line: 10, column: 11
                    S778=0;
                    auto_1.setClear();//sysj\controller.sysj line: 11, column: 4
                    S777=0;
                    thread3151(tdone,ends);
                    thread3152(tdone,ends);
                    thread3153(tdone,ends);
                    int biggest3159 = 0;
                    if(ends[2]>=biggest3159){
                      biggest3159=ends[2];
                    }
                    if(ends[3]>=biggest3159){
                      biggest3159=ends[3];
                    }
                    if(ends[6]>=biggest3159){
                      biggest3159=ends[6];
                    }
                    if(biggest3159 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S778=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
              }
              break;
            
            case 1 : 
              S778=1;
              if(mode.getprestatus()){//sysj\controller.sysj line: 10, column: 11
                S778=0;
                auto_1.setClear();//sysj\controller.sysj line: 11, column: 4
                S777=0;
                thread3160(tdone,ends);
                thread3161(tdone,ends);
                thread3162(tdone,ends);
                int biggest3168 = 0;
                if(ends[2]>=biggest3168){
                  biggest3168=ends[2];
                }
                if(ends[3]>=biggest3168){
                  biggest3168=ends[3];
                }
                if(ends[6]>=biggest3168){
                  biggest3168=ends[6];
                }
                if(biggest3168 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S778=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    auto_1 = new Signal();
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
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      auto_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      auto_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
