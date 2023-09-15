import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\ABScontroller.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABScontroller.sysj line: 2, column: 1

public class ABSCoordinator extends ClockDomain{
  public ABSCoordinator(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal emergency = new Signal("emergency", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal bottleInTable = new Signal("bottleInTable", Signal.INPUT);
  public Signal bottleFilled = new Signal("bottleFilled", Signal.INPUT);
  public Signal bottleCapOn = new Signal("bottleCapOn", Signal.INPUT);
  public Signal bottleCapped = new Signal("bottleCapped", Signal.INPUT);
  public Signal idleConveyor = new Signal("idleConveyor", Signal.INPUT);
  public Signal idleFiller = new Signal("idleFiller", Signal.INPUT);
  public Signal idleLoader = new Signal("idleLoader", Signal.INPUT);
  public Signal idleCapper = new Signal("idleCapper", Signal.INPUT);
  public Signal orderPOS = new Signal("orderPOS", Signal.INPUT);
  public Signal presence = new Signal("presence", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public Signal emergencyConveyor = new Signal("emergencyConveyor", Signal.OUTPUT);
  public Signal emergencyRotary = new Signal("emergencyRotary", Signal.OUTPUT);
  public Signal emergencyFiller = new Signal("emergencyFiller", Signal.OUTPUT);
  public Signal emergencyCapLoader = new Signal("emergencyCapLoader", Signal.OUTPUT);
  public Signal emergencyCapper = new Signal("emergencyCapper", Signal.OUTPUT);
  public Signal emergencyPOS = new Signal("emergencyPOS", Signal.OUTPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal tableAlignedWithSensors = new Signal("tableAlignedWithSensors", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal order = new Signal("order", Signal.OUTPUT);
  public Signal rotaryTableTriggerConveyor = new Signal("rotaryTableTriggerConveyor", Signal.OUTPUT);
  public Signal rotaryTableTriggerFiller = new Signal("rotaryTableTriggerFiller", Signal.OUTPUT);
  public Signal rotaryTableTriggerLoader = new Signal("rotaryTableTriggerLoader", Signal.OUTPUT);
  public Signal rotaryTableTriggerCapper = new Signal("rotaryTableTriggerCapper", Signal.OUTPUT);
  private int S246 = 1;
  private int S7 = 1;
  private int S1 = 1;
  private int S15 = 1;
  private int S53 = 1;
  private int S27 = 1;
  private int S61 = 1;
  private int S69 = 1;
  private int S77 = 1;
  private int S244 = 1;
  private int S132 = 1;
  private int S82 = 1;
  private int S87 = 1;
  private int S92 = 1;
  private int S97 = 1;
  private int S102 = 1;
  
  private int[] ends = new int[93];
  private int[] tdone = new int[93];
  
  public void thread43465(int [] tdone, int [] ends){
        S102=1;
    emergencyCapper.setPresent();//sysj\ABScontroller.sysj line: 58, column: 140
    currsigs.addElement(emergencyCapper);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread43464(int [] tdone, int [] ends){
        S97=1;
    emergencyCapLoader.setPresent();//sysj\ABScontroller.sysj line: 58, column: 105
    currsigs.addElement(emergencyCapLoader);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread43463(int [] tdone, int [] ends){
        S92=1;
    emergencyFiller.setPresent();//sysj\ABScontroller.sysj line: 58, column: 73
    currsigs.addElement(emergencyFiller);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread43462(int [] tdone, int [] ends){
        S87=1;
    emergencyRotary.setPresent();//sysj\ABScontroller.sysj line: 58, column: 41
    currsigs.addElement(emergencyRotary);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread43461(int [] tdone, int [] ends){
        S82=1;
    emergencyConveyor.setPresent();//sysj\ABScontroller.sysj line: 58, column: 7
    currsigs.addElement(emergencyConveyor);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread43459(int [] tdone, int [] ends){
        switch(S102){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        emergencyCapper.setPresent();//sysj\ABScontroller.sysj line: 58, column: 140
        currsigs.addElement(emergencyCapper);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread43458(int [] tdone, int [] ends){
        switch(S97){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        emergencyCapLoader.setPresent();//sysj\ABScontroller.sysj line: 58, column: 105
        currsigs.addElement(emergencyCapLoader);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread43457(int [] tdone, int [] ends){
        switch(S92){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        emergencyFiller.setPresent();//sysj\ABScontroller.sysj line: 58, column: 73
        currsigs.addElement(emergencyFiller);
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread43456(int [] tdone, int [] ends){
        switch(S87){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        emergencyRotary.setPresent();//sysj\ABScontroller.sysj line: 58, column: 41
        currsigs.addElement(emergencyRotary);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread43455(int [] tdone, int [] ends){
        switch(S82){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        emergencyConveyor.setPresent();//sysj\ABScontroller.sysj line: 58, column: 7
        currsigs.addElement(emergencyConveyor);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread43454(int [] tdone, int [] ends){
        switch(S244){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S132){
          case 0 : 
            if(!emergency.getprestatus()){//sysj\ABScontroller.sysj line: 57, column: 10
              S132=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              thread43455(tdone,ends);
              thread43456(tdone,ends);
              thread43457(tdone,ends);
              thread43458(tdone,ends);
              thread43459(tdone,ends);
              int biggest43460 = 0;
              if(ends[14]>=biggest43460){
                biggest43460=ends[14];
              }
              if(ends[15]>=biggest43460){
                biggest43460=ends[15];
              }
              if(ends[16]>=biggest43460){
                biggest43460=ends[16];
              }
              if(ends[17]>=biggest43460){
                biggest43460=ends[17];
              }
              if(ends[18]>=biggest43460){
                biggest43460=ends[18];
              }
              if(biggest43460 == 1){
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              //FINXME code
              if(biggest43460 == 0){
                S132=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            break;
          
          case 1 : 
            S132=1;
            S132=0;
            if(emergency.getprestatus()){//sysj\ABScontroller.sysj line: 55, column: 11
              System.out.println("emergency");//sysj\ABScontroller.sysj line: 56, column: 4
              thread43461(tdone,ends);
              thread43462(tdone,ends);
              thread43463(tdone,ends);
              thread43464(tdone,ends);
              thread43465(tdone,ends);
              int biggest43466 = 0;
              if(ends[14]>=biggest43466){
                biggest43466=ends[14];
              }
              if(ends[15]>=biggest43466){
                biggest43466=ends[15];
              }
              if(ends[16]>=biggest43466){
                biggest43466=ends[16];
              }
              if(ends[17]>=biggest43466){
                biggest43466=ends[17];
              }
              if(ends[18]>=biggest43466){
                biggest43466=ends[18];
              }
              if(biggest43466 == 1){
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              S132=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43453(int [] tdone, int [] ends){
        switch(S77){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottleCapped.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 50, column: 17
          bottleAtPos5.setPresent();//sysj\ABScontroller.sysj line: 50, column: 55
          currsigs.addElement(bottleAtPos5);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread43452(int [] tdone, int [] ends){
        switch(S69){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleCapOn.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 46, column: 17
          bottleAtPos4.setPresent();//sysj\ABScontroller.sysj line: 46, column: 54
          currsigs.addElement(bottleAtPos4);
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

  public void thread43451(int [] tdone, int [] ends){
        switch(S61){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottleFilled.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 42, column: 17
          bottleAtPos3.setPresent();//sysj\ABScontroller.sysj line: 42, column: 55
          currsigs.addElement(bottleAtPos3);
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

  public void thread43449(int [] tdone, int [] ends){
        rotaryTableTriggerCapper.setPresent();//sysj\ABScontroller.sysj line: 33, column: 156
    currsigs.addElement(rotaryTableTriggerCapper);
    active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread43448(int [] tdone, int [] ends){
        rotaryTableTriggerLoader.setPresent();//sysj\ABScontroller.sysj line: 33, column: 118
    currsigs.addElement(rotaryTableTriggerLoader);
    active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread43447(int [] tdone, int [] ends){
        rotaryTableTriggerFiller.setPresent();//sysj\ABScontroller.sysj line: 33, column: 80
    currsigs.addElement(rotaryTableTriggerFiller);
    active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread43446(int [] tdone, int [] ends){
        rotaryTableTriggerConveyor.setPresent();//sysj\ABScontroller.sysj line: 33, column: 40
    currsigs.addElement(rotaryTableTriggerConveyor);
    active[6]=0;
    ends[6]=0;
    tdone[6]=1;
  }

  public void thread43445(int [] tdone, int [] ends){
        rotaryTableTrigger.setPresent();//sysj\ABScontroller.sysj line: 33, column: 8
    currsigs.addElement(rotaryTableTrigger);
    active[5]=0;
    ends[5]=0;
    tdone[5]=1;
  }

  public void thread43443(int [] tdone, int [] ends){
        active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread43442(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread43441(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread43440(int [] tdone, int [] ends){
        active[6]=0;
    ends[6]=0;
    tdone[6]=1;
  }

  public void thread43439(int [] tdone, int [] ends){
        active[5]=0;
    ends[5]=0;
    tdone[5]=1;
  }

  public void thread43438(int [] tdone, int [] ends){
        switch(S53){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S27){
          case 0 : 
            thread43439(tdone,ends);
            thread43440(tdone,ends);
            thread43441(tdone,ends);
            thread43442(tdone,ends);
            thread43443(tdone,ends);
            int biggest43444 = 0;
            if(ends[5]>=biggest43444){
              biggest43444=ends[5];
            }
            if(ends[6]>=biggest43444){
              biggest43444=ends[6];
            }
            if(ends[7]>=biggest43444){
              biggest43444=ends[7];
            }
            if(ends[8]>=biggest43444){
              biggest43444=ends[8];
            }
            if(ends[9]>=biggest43444){
              biggest43444=ends[9];
            }
            //FINXME code
            if(biggest43444 == 0){
              S27=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S27=1;
            S27=0;
            if((bottleInTable.getprestatus() || idleConveyor.getprestatus()) && (bottleFilled.getprestatus() || idleFiller.getprestatus()) && (bottleCapOn.getprestatus() || idleLoader.getprestatus()) && (bottleCapped.getprestatus() || idleCapper.getprestatus()) && !(idleConveyor.getprestatus() && idleFiller.getprestatus() && idleLoader.getprestatus() && idleCapper.getprestatus())){//sysj\ABScontroller.sysj line: 29, column: 13
              thread43445(tdone,ends);
              thread43446(tdone,ends);
              thread43447(tdone,ends);
              thread43448(tdone,ends);
              thread43449(tdone,ends);
              int biggest43450 = 0;
              if(ends[5]>=biggest43450){
                biggest43450=ends[5];
              }
              if(ends[6]>=biggest43450){
                biggest43450=ends[6];
              }
              if(ends[7]>=biggest43450){
                biggest43450=ends[7];
              }
              if(ends[8]>=biggest43450){
                biggest43450=ends[8];
              }
              if(ends[9]>=biggest43450){
                biggest43450=ends[9];
              }
              //FINXME code
              if(biggest43450 == 0){
                S27=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S27=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43437(int [] tdone, int [] ends){
        switch(S15){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(bottleInTable.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 22, column: 17
          bottleAtPos2.setPresent();//sysj\ABScontroller.sysj line: 22, column: 56
          currsigs.addElement(bottleAtPos2);
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

  public void thread43436(int [] tdone, int [] ends){
        switch(S7){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1){
          case 0 : 
            S1=0;
            if(idleConveyor.getprestatus() && idleFiller.getprestatus() && idleLoader.getprestatus() && idleCapper.getprestatus()){//sysj\ABScontroller.sysj line: 18, column: 17
              System.out.println("idle");//sysj\ABScontroller.sysj line: 18, column: 75
              S1=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S1=1;
            S1=0;
            if(idleConveyor.getprestatus() && idleFiller.getprestatus() && idleLoader.getprestatus() && idleCapper.getprestatus()){//sysj\ABScontroller.sysj line: 18, column: 17
              System.out.println("idle");//sysj\ABScontroller.sysj line: 18, column: 75
              S1=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread43433(int [] tdone, int [] ends){
        S102=1;
    emergencyCapper.setPresent();//sysj\ABScontroller.sysj line: 58, column: 140
    currsigs.addElement(emergencyCapper);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread43432(int [] tdone, int [] ends){
        S97=1;
    emergencyCapLoader.setPresent();//sysj\ABScontroller.sysj line: 58, column: 105
    currsigs.addElement(emergencyCapLoader);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread43431(int [] tdone, int [] ends){
        S92=1;
    emergencyFiller.setPresent();//sysj\ABScontroller.sysj line: 58, column: 73
    currsigs.addElement(emergencyFiller);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread43430(int [] tdone, int [] ends){
        S87=1;
    emergencyRotary.setPresent();//sysj\ABScontroller.sysj line: 58, column: 41
    currsigs.addElement(emergencyRotary);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread43429(int [] tdone, int [] ends){
        S82=1;
    emergencyConveyor.setPresent();//sysj\ABScontroller.sysj line: 58, column: 7
    currsigs.addElement(emergencyConveyor);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread43428(int [] tdone, int [] ends){
        S244=1;
    S132=0;
    if(emergency.getprestatus()){//sysj\ABScontroller.sysj line: 55, column: 11
      System.out.println("emergency");//sysj\ABScontroller.sysj line: 56, column: 4
      thread43429(tdone,ends);
      thread43430(tdone,ends);
      thread43431(tdone,ends);
      thread43432(tdone,ends);
      thread43433(tdone,ends);
      int biggest43434 = 0;
      if(ends[14]>=biggest43434){
        biggest43434=ends[14];
      }
      if(ends[15]>=biggest43434){
        biggest43434=ends[15];
      }
      if(ends[16]>=biggest43434){
        biggest43434=ends[16];
      }
      if(ends[17]>=biggest43434){
        biggest43434=ends[17];
      }
      if(ends[18]>=biggest43434){
        biggest43434=ends[18];
      }
      if(biggest43434 == 1){
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
    }
    else {
      S132=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread43427(int [] tdone, int [] ends){
        S77=1;
    if(bottleCapped.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 50, column: 17
      bottleAtPos5.setPresent();//sysj\ABScontroller.sysj line: 50, column: 55
      currsigs.addElement(bottleAtPos5);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread43426(int [] tdone, int [] ends){
        S69=1;
    if(bottleCapOn.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 46, column: 17
      bottleAtPos4.setPresent();//sysj\ABScontroller.sysj line: 46, column: 54
      currsigs.addElement(bottleAtPos4);
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

  public void thread43425(int [] tdone, int [] ends){
        S61=1;
    if(bottleFilled.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 42, column: 17
      bottleAtPos3.setPresent();//sysj\ABScontroller.sysj line: 42, column: 55
      currsigs.addElement(bottleAtPos3);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread43423(int [] tdone, int [] ends){
        rotaryTableTriggerCapper.setPresent();//sysj\ABScontroller.sysj line: 33, column: 156
    currsigs.addElement(rotaryTableTriggerCapper);
    active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread43422(int [] tdone, int [] ends){
        rotaryTableTriggerLoader.setPresent();//sysj\ABScontroller.sysj line: 33, column: 118
    currsigs.addElement(rotaryTableTriggerLoader);
    active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread43421(int [] tdone, int [] ends){
        rotaryTableTriggerFiller.setPresent();//sysj\ABScontroller.sysj line: 33, column: 80
    currsigs.addElement(rotaryTableTriggerFiller);
    active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread43420(int [] tdone, int [] ends){
        rotaryTableTriggerConveyor.setPresent();//sysj\ABScontroller.sysj line: 33, column: 40
    currsigs.addElement(rotaryTableTriggerConveyor);
    active[6]=0;
    ends[6]=0;
    tdone[6]=1;
  }

  public void thread43419(int [] tdone, int [] ends){
        rotaryTableTrigger.setPresent();//sysj\ABScontroller.sysj line: 33, column: 8
    currsigs.addElement(rotaryTableTrigger);
    active[5]=0;
    ends[5]=0;
    tdone[5]=1;
  }

  public void thread43418(int [] tdone, int [] ends){
        S53=1;
    S27=0;
    if((bottleInTable.getprestatus() || idleConveyor.getprestatus()) && (bottleFilled.getprestatus() || idleFiller.getprestatus()) && (bottleCapOn.getprestatus() || idleLoader.getprestatus()) && (bottleCapped.getprestatus() || idleCapper.getprestatus()) && !(idleConveyor.getprestatus() && idleFiller.getprestatus() && idleLoader.getprestatus() && idleCapper.getprestatus())){//sysj\ABScontroller.sysj line: 29, column: 13
      thread43419(tdone,ends);
      thread43420(tdone,ends);
      thread43421(tdone,ends);
      thread43422(tdone,ends);
      thread43423(tdone,ends);
      int biggest43424 = 0;
      if(ends[5]>=biggest43424){
        biggest43424=ends[5];
      }
      if(ends[6]>=biggest43424){
        biggest43424=ends[6];
      }
      if(ends[7]>=biggest43424){
        biggest43424=ends[7];
      }
      if(ends[8]>=biggest43424){
        biggest43424=ends[8];
      }
      if(ends[9]>=biggest43424){
        biggest43424=ends[9];
      }
      //FINXME code
      if(biggest43424 == 0){
        S27=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S27=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread43417(int [] tdone, int [] ends){
        S15=1;
    if(bottleInTable.getprestatus() && rotaryTableTrigger.getprestatus()){//sysj\ABScontroller.sysj line: 22, column: 17
      bottleAtPos2.setPresent();//sysj\ABScontroller.sysj line: 22, column: 56
      currsigs.addElement(bottleAtPos2);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread43416(int [] tdone, int [] ends){
        S7=1;
    S1=0;
    if(idleConveyor.getprestatus() && idleFiller.getprestatus() && idleLoader.getprestatus() && idleCapper.getprestatus()){//sysj\ABScontroller.sysj line: 18, column: 17
      System.out.println("idle");//sysj\ABScontroller.sysj line: 18, column: 75
      S1=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S1=1;
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
      switch(S246){
        case 0 : 
          S246=0;
          break RUN;
        
        case 1 : 
          S246=2;
          S246=2;
          thread43416(tdone,ends);
          thread43417(tdone,ends);
          thread43418(tdone,ends);
          thread43425(tdone,ends);
          thread43426(tdone,ends);
          thread43427(tdone,ends);
          thread43428(tdone,ends);
          int biggest43435 = 0;
          if(ends[2]>=biggest43435){
            biggest43435=ends[2];
          }
          if(ends[3]>=biggest43435){
            biggest43435=ends[3];
          }
          if(ends[4]>=biggest43435){
            biggest43435=ends[4];
          }
          if(ends[10]>=biggest43435){
            biggest43435=ends[10];
          }
          if(ends[11]>=biggest43435){
            biggest43435=ends[11];
          }
          if(ends[12]>=biggest43435){
            biggest43435=ends[12];
          }
          if(ends[13]>=biggest43435){
            biggest43435=ends[13];
          }
          if(biggest43435 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread43436(tdone,ends);
          thread43437(tdone,ends);
          thread43438(tdone,ends);
          thread43451(tdone,ends);
          thread43452(tdone,ends);
          thread43453(tdone,ends);
          thread43454(tdone,ends);
          int biggest43467 = 0;
          if(ends[2]>=biggest43467){
            biggest43467=ends[2];
          }
          if(ends[3]>=biggest43467){
            biggest43467=ends[3];
          }
          if(ends[4]>=biggest43467){
            biggest43467=ends[4];
          }
          if(ends[10]>=biggest43467){
            biggest43467=ends[10];
          }
          if(ends[11]>=biggest43467){
            biggest43467=ends[11];
          }
          if(ends[12]>=biggest43467){
            biggest43467=ends[12];
          }
          if(ends[13]>=biggest43467){
            biggest43467=ends[13];
          }
          if(biggest43467 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest43467 == 0){
            S246=0;
            active[1]=0;
            ends[1]=0;
            S246=0;
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
          emergency.gethook();
          motConveyorOnOff.gethook();
          bottleInTable.gethook();
          bottleFilled.gethook();
          bottleCapOn.gethook();
          bottleCapped.gethook();
          idleConveyor.gethook();
          idleFiller.gethook();
          idleLoader.gethook();
          idleCapper.gethook();
          orderPOS.gethook();
          presence.gethook();
          df = true;
        }
        runClockDomain();
      }
      emergency.setpreclear();
      motConveyorOnOff.setpreclear();
      bottleInTable.setpreclear();
      bottleFilled.setpreclear();
      bottleCapOn.setpreclear();
      bottleCapped.setpreclear();
      idleConveyor.setpreclear();
      idleFiller.setpreclear();
      idleLoader.setpreclear();
      idleCapper.setpreclear();
      orderPOS.setpreclear();
      presence.setpreclear();
      rotaryTableTrigger.setpreclear();
      emergencyConveyor.setpreclear();
      emergencyRotary.setpreclear();
      emergencyFiller.setpreclear();
      emergencyCapLoader.setpreclear();
      emergencyCapper.setpreclear();
      emergencyPOS.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      tableAlignedWithSensors.setpreclear();
      capOnBottleAtPos1.setpreclear();
      order.setpreclear();
      rotaryTableTriggerConveyor.setpreclear();
      rotaryTableTriggerFiller.setpreclear();
      rotaryTableTriggerLoader.setpreclear();
      rotaryTableTriggerCapper.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = emergency.getStatus() ? emergency.setprepresent() : emergency.setpreclear();
      emergency.setpreval(emergency.getValue());
      emergency.setClear();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = bottleInTable.getStatus() ? bottleInTable.setprepresent() : bottleInTable.setpreclear();
      bottleInTable.setpreval(bottleInTable.getValue());
      bottleInTable.setClear();
      dummyint = bottleFilled.getStatus() ? bottleFilled.setprepresent() : bottleFilled.setpreclear();
      bottleFilled.setpreval(bottleFilled.getValue());
      bottleFilled.setClear();
      dummyint = bottleCapOn.getStatus() ? bottleCapOn.setprepresent() : bottleCapOn.setpreclear();
      bottleCapOn.setpreval(bottleCapOn.getValue());
      bottleCapOn.setClear();
      dummyint = bottleCapped.getStatus() ? bottleCapped.setprepresent() : bottleCapped.setpreclear();
      bottleCapped.setpreval(bottleCapped.getValue());
      bottleCapped.setClear();
      dummyint = idleConveyor.getStatus() ? idleConveyor.setprepresent() : idleConveyor.setpreclear();
      idleConveyor.setpreval(idleConveyor.getValue());
      idleConveyor.setClear();
      dummyint = idleFiller.getStatus() ? idleFiller.setprepresent() : idleFiller.setpreclear();
      idleFiller.setpreval(idleFiller.getValue());
      idleFiller.setClear();
      dummyint = idleLoader.getStatus() ? idleLoader.setprepresent() : idleLoader.setpreclear();
      idleLoader.setpreval(idleLoader.getValue());
      idleLoader.setClear();
      dummyint = idleCapper.getStatus() ? idleCapper.setprepresent() : idleCapper.setpreclear();
      idleCapper.setpreval(idleCapper.getValue());
      idleCapper.setClear();
      dummyint = orderPOS.getStatus() ? orderPOS.setprepresent() : orderPOS.setpreclear();
      orderPOS.setpreval(orderPOS.getValue());
      orderPOS.setClear();
      dummyint = presence.getStatus() ? presence.setprepresent() : presence.setpreclear();
      presence.setpreval(presence.getValue());
      presence.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      emergencyConveyor.sethook();
      emergencyConveyor.setClear();
      emergencyRotary.sethook();
      emergencyRotary.setClear();
      emergencyFiller.sethook();
      emergencyFiller.setClear();
      emergencyCapLoader.sethook();
      emergencyCapLoader.setClear();
      emergencyCapper.sethook();
      emergencyCapper.setClear();
      emergencyPOS.sethook();
      emergencyPOS.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      tableAlignedWithSensors.sethook();
      tableAlignedWithSensors.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      order.sethook();
      order.setClear();
      rotaryTableTriggerConveyor.sethook();
      rotaryTableTriggerConveyor.setClear();
      rotaryTableTriggerFiller.sethook();
      rotaryTableTriggerFiller.setClear();
      rotaryTableTriggerLoader.sethook();
      rotaryTableTriggerLoader.setClear();
      rotaryTableTriggerCapper.sethook();
      rotaryTableTriggerCapper.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        emergency.gethook();
        motConveyorOnOff.gethook();
        bottleInTable.gethook();
        bottleFilled.gethook();
        bottleCapOn.gethook();
        bottleCapped.gethook();
        idleConveyor.gethook();
        idleFiller.gethook();
        idleLoader.gethook();
        idleCapper.gethook();
        orderPOS.gethook();
        presence.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
