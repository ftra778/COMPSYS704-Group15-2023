import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\ABScontroller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABScontroller.sysj line: 2, column: 1

public class RotaryController extends ClockDomain{
  public RotaryController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal CapOnBottleAtPos1 = new Signal("CapOnBottleAtPos1", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal emergencyStop = new Signal("emergencyStop", Signal.INPUT);
  public Signal turn = new Signal("turn", Signal.OUTPUT);
  public Signal stop = new Signal("stop", Signal.OUTPUT);
  private Signal readyToTurn_26;
  private long __start_thread_32;//sysj\ABScontroller.sysj line: 128, column: 32
  private long __start_thread_34;//sysj\ABScontroller.sysj line: 131, column: 32
  private int S1798 = 1;
  private int S839 = 1;
  private int S777 = 1;
  private int S763 = 1;
  private int S766 = 1;
  private int S1267 = 1;
  private int S841 = 1;
  private int S848 = 1;
  private int S864 = 1;
  private int S892 = 1;
  private int S908 = 1;
  private int S1275 = 1;
  
  private int[] ends = new int[93];
  private int[] tdone = new int[93];
  
  public void thread43525(int [] tdone, int [] ends){
        switch(S1275){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(emergencyStop.getprestatus()){//sysj\ABScontroller.sysj line: 140, column: 15
          stop.setPresent();//sysj\ABScontroller.sysj line: 141, column: 9
          currsigs.addElement(stop);
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread43523(int [] tdone, int [] ends){
        switch(S908){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_34 >= (0.5) * 1000){//sysj\ABScontroller.sysj line: 131, column: 32
          ends[34]=3;
          ;//sysj\ABScontroller.sysj line: 131, column: 32
          ends[34]=2;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread43522(int [] tdone, int [] ends){
        switch(S892){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        stop.setPresent();//sysj\ABScontroller.sysj line: 131, column: 14
        currsigs.addElement(stop);
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
        break;
      
    }
  }

  public void thread43520(int [] tdone, int [] ends){
        S908=1;
    __start_thread_34 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 131, column: 32
    if(com.systemj.Timer.getMs() - __start_thread_34 >= (0.5) * 1000){//sysj\ABScontroller.sysj line: 131, column: 32
      ends[34]=3;
      ;//sysj\ABScontroller.sysj line: 131, column: 32
      ends[34]=2;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread43519(int [] tdone, int [] ends){
        S892=1;
    stop.setPresent();//sysj\ABScontroller.sysj line: 131, column: 14
    currsigs.addElement(stop);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread43517(int [] tdone, int [] ends){
        S908=1;
    __start_thread_34 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 131, column: 32
    if(com.systemj.Timer.getMs() - __start_thread_34 >= (0.5) * 1000){//sysj\ABScontroller.sysj line: 131, column: 32
      ends[34]=3;
      ;//sysj\ABScontroller.sysj line: 131, column: 32
      ends[34]=2;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread43516(int [] tdone, int [] ends){
        S892=1;
    stop.setPresent();//sysj\ABScontroller.sysj line: 131, column: 14
    currsigs.addElement(stop);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread43514(int [] tdone, int [] ends){
        switch(S864){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_32 >= (0.5) * 1000){//sysj\ABScontroller.sysj line: 128, column: 32
          ends[32]=3;
          ;//sysj\ABScontroller.sysj line: 128, column: 32
          ends[32]=2;
          tdone[32]=1;
        }
        else {
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread43513(int [] tdone, int [] ends){
        switch(S848){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        turn.setPresent();//sysj\ABScontroller.sysj line: 128, column: 14
        currsigs.addElement(turn);
        active[31]=1;
        ends[31]=1;
        tdone[31]=1;
        break;
      
    }
  }

  public void thread43511(int [] tdone, int [] ends){
        S908=1;
    __start_thread_34 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 131, column: 32
    if(com.systemj.Timer.getMs() - __start_thread_34 >= (0.5) * 1000){//sysj\ABScontroller.sysj line: 131, column: 32
      ends[34]=3;
      ;//sysj\ABScontroller.sysj line: 131, column: 32
      ends[34]=2;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread43510(int [] tdone, int [] ends){
        S892=1;
    stop.setPresent();//sysj\ABScontroller.sysj line: 131, column: 14
    currsigs.addElement(stop);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread43508(int [] tdone, int [] ends){
        S864=1;
    __start_thread_32 = com.systemj.Timer.getMs();//sysj\ABScontroller.sysj line: 128, column: 32
    if(com.systemj.Timer.getMs() - __start_thread_32 >= (0.5) * 1000){//sysj\ABScontroller.sysj line: 128, column: 32
      ends[32]=3;
      ;//sysj\ABScontroller.sysj line: 128, column: 32
      ends[32]=2;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread43507(int [] tdone, int [] ends){
        S848=1;
    turn.setPresent();//sysj\ABScontroller.sysj line: 128, column: 14
    currsigs.addElement(turn);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread43506(int [] tdone, int [] ends){
        switch(S1267){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S841){
          case 0 : 
            if(readyToTurn_26.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 124, column: 15
              System.out.println("rotaryTableTrigger");//sysj\ABScontroller.sysj line: 125, column: 9
              S841=1;
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            else {
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
          case 1 : 
            if(!rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 126, column: 15
              S841=2;
              thread43507(tdone,ends);
              thread43508(tdone,ends);
              int biggest43509 = 0;
              if(ends[31]>=biggest43509){
                biggest43509=ends[31];
              }
              if(ends[32]>=biggest43509){
                biggest43509=ends[32];
              }
              if(biggest43509 == 1){
                active[30]=1;
                ends[30]=1;
                tdone[30]=1;
              }
              if(biggest43509 == 2){
                ends[30]=2;
                ;//sysj\ABScontroller.sysj line: 127, column: 9
                S841=3;
                thread43510(tdone,ends);
                thread43511(tdone,ends);
                int biggest43512 = 0;
                if(ends[33]>=biggest43512){
                  biggest43512=ends[33];
                }
                if(ends[34]>=biggest43512){
                  biggest43512=ends[34];
                }
                if(biggest43512 == 1){
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
                if(biggest43512 == 2){
                  ends[30]=2;
                  ;//sysj\ABScontroller.sysj line: 130, column: 9
                  S841=4;
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
              }
            }
            else {
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
          case 2 : 
            thread43513(tdone,ends);
            thread43514(tdone,ends);
            int biggest43515 = 0;
            if(ends[31]>=biggest43515){
              biggest43515=ends[31];
            }
            if(ends[32]>=biggest43515){
              biggest43515=ends[32];
            }
            if(biggest43515 == 1){
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            if(biggest43515 == 2){
              ends[30]=2;
              ;//sysj\ABScontroller.sysj line: 127, column: 9
              S841=3;
              thread43516(tdone,ends);
              thread43517(tdone,ends);
              int biggest43518 = 0;
              if(ends[33]>=biggest43518){
                biggest43518=ends[33];
              }
              if(ends[34]>=biggest43518){
                biggest43518=ends[34];
              }
              if(biggest43518 == 1){
                active[30]=1;
                ends[30]=1;
                tdone[30]=1;
              }
              if(biggest43518 == 2){
                ends[30]=2;
                ;//sysj\ABScontroller.sysj line: 130, column: 9
                S841=4;
                active[30]=1;
                ends[30]=1;
                tdone[30]=1;
              }
            }
            //FINXME code
            if(biggest43515 == 0){
              S841=3;
              thread43519(tdone,ends);
              thread43520(tdone,ends);
              int biggest43521 = 0;
              if(ends[33]>=biggest43521){
                biggest43521=ends[33];
              }
              if(ends[34]>=biggest43521){
                biggest43521=ends[34];
              }
              if(biggest43521 == 1){
                active[30]=1;
                ends[30]=1;
                tdone[30]=1;
              }
              if(biggest43521 == 2){
                ends[30]=2;
                ;//sysj\ABScontroller.sysj line: 130, column: 9
                S841=4;
                active[30]=1;
                ends[30]=1;
                tdone[30]=1;
              }
            }
            break;
          
          case 3 : 
            thread43522(tdone,ends);
            thread43523(tdone,ends);
            int biggest43524 = 0;
            if(ends[33]>=biggest43524){
              biggest43524=ends[33];
            }
            if(ends[34]>=biggest43524){
              biggest43524=ends[34];
            }
            if(biggest43524 == 1){
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            if(biggest43524 == 2){
              ends[30]=2;
              ;//sysj\ABScontroller.sysj line: 130, column: 9
              S841=4;
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            //FINXME code
            if(biggest43524 == 0){
              S841=4;
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
          case 4 : 
            if(!readyToTurn_26.getprestatus() || !rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 133, column: 15
              S841=0;
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            else {
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43504(int [] tdone, int [] ends){
        switch(S766){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(emergencyStop.getprestatus() || CapOnBottleAtPos1.getprestatus() || bottleAtPos5.getprestatus()){//sysj\ABScontroller.sysj line: 116, column: 46
          ends[29]=2;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread43503(int [] tdone, int [] ends){
        switch(S763){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        readyToTurn_26.setPresent();//sysj\ABScontroller.sysj line: 116, column: 14
        currsigs.addElement(readyToTurn_26);
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread43501(int [] tdone, int [] ends){
        S766=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread43500(int [] tdone, int [] ends){
        S763=1;
    readyToTurn_26.setPresent();//sysj\ABScontroller.sysj line: 116, column: 14
    currsigs.addElement(readyToTurn_26);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread43499(int [] tdone, int [] ends){
        switch(S839){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S777){
          case 0 : 
            if(tableAlignedWithSensor.getprestatus() && !CapOnBottleAtPos1.getprestatus() && !emergencyStop.getprestatus() && !bottleAtPos5.getprestatus()){//sysj\ABScontroller.sysj line: 114, column: 15
              S777=1;
              thread43500(tdone,ends);
              thread43501(tdone,ends);
              int biggest43502 = 0;
              if(ends[28]>=biggest43502){
                biggest43502=ends[28];
              }
              if(ends[29]>=biggest43502){
                biggest43502=ends[29];
              }
              if(biggest43502 == 1){
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 1 : 
            thread43503(tdone,ends);
            thread43504(tdone,ends);
            int biggest43505 = 0;
            if(ends[28]>=biggest43505){
              biggest43505=ends[28];
            }
            if(ends[29]>=biggest43505){
              biggest43505=ends[29];
            }
            if(biggest43505 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            if(biggest43505 == 2){
              ends[27]=2;
              ;//sysj\ABScontroller.sysj line: 115, column: 9
              System.out.println("readyToTurn");//sysj\ABScontroller.sysj line: 118, column: 9
              stop.setPresent();//sysj\ABScontroller.sysj line: 119, column: 9
              currsigs.addElement(stop);
              S777=0;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest43505 == 0){
              System.out.println("readyToTurn");//sysj\ABScontroller.sysj line: 118, column: 9
              stop.setPresent();//sysj\ABScontroller.sysj line: 119, column: 9
              currsigs.addElement(stop);
              S777=0;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43497(int [] tdone, int [] ends){
        S1275=1;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread43496(int [] tdone, int [] ends){
        S1267=1;
    S841=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread43495(int [] tdone, int [] ends){
        S839=1;
    S777=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1798){
        case 0 : 
          S1798=0;
          break RUN;
        
        case 1 : 
          S1798=2;
          S1798=2;
          System.out.println("RotaryController");//sysj\ABScontroller.sysj line: 109, column: 2
          readyToTurn_26.setClear();//sysj\ABScontroller.sysj line: 110, column: 5
          thread43495(tdone,ends);
          thread43496(tdone,ends);
          thread43497(tdone,ends);
          int biggest43498 = 0;
          if(ends[27]>=biggest43498){
            biggest43498=ends[27];
          }
          if(ends[30]>=biggest43498){
            biggest43498=ends[30];
          }
          if(ends[35]>=biggest43498){
            biggest43498=ends[35];
          }
          if(biggest43498 == 1){
            active[26]=1;
            ends[26]=1;
            break RUN;
          }
        
        case 2 : 
          readyToTurn_26.setClear();//sysj\ABScontroller.sysj line: 110, column: 5
          thread43499(tdone,ends);
          thread43506(tdone,ends);
          thread43525(tdone,ends);
          int biggest43526 = 0;
          if(ends[27]>=biggest43526){
            biggest43526=ends[27];
          }
          if(ends[30]>=biggest43526){
            biggest43526=ends[30];
          }
          if(ends[35]>=biggest43526){
            biggest43526=ends[35];
          }
          if(biggest43526 == 1){
            active[26]=1;
            ends[26]=1;
            break RUN;
          }
          //FINXME code
          if(biggest43526 == 0){
            S1798=0;
            active[26]=0;
            ends[26]=0;
            S1798=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    readyToTurn_26 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[26] != 0){
      int index = 26;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
      else{
        if(!df){
          tableAlignedWithSensor.gethook();
          bottleAtPos5.gethook();
          CapOnBottleAtPos1.gethook();
          rotaryTableTrigger.gethook();
          emergencyStop.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      CapOnBottleAtPos1.setpreclear();
      rotaryTableTrigger.setpreclear();
      emergencyStop.setpreclear();
      turn.setpreclear();
      stop.setpreclear();
      readyToTurn_26.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = CapOnBottleAtPos1.getStatus() ? CapOnBottleAtPos1.setprepresent() : CapOnBottleAtPos1.setpreclear();
      CapOnBottleAtPos1.setpreval(CapOnBottleAtPos1.getValue());
      CapOnBottleAtPos1.setClear();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      dummyint = emergencyStop.getStatus() ? emergencyStop.setprepresent() : emergencyStop.setpreclear();
      emergencyStop.setpreval(emergencyStop.getValue());
      emergencyStop.setClear();
      turn.sethook();
      turn.setClear();
      stop.sethook();
      stop.setClear();
      readyToTurn_26.setClear();
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
      else{
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        CapOnBottleAtPos1.gethook();
        rotaryTableTrigger.gethook();
        emergencyStop.gethook();
      }
      runFinisher();
      if(active[26] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
