import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal valveInjectorOnOff1 = new Signal("valveInjectorOnOff1", Signal.INPUT);
  public Signal valveInjectorOnOff2 = new Signal("valveInjectorOnOff2", Signal.INPUT);
  public Signal valveInjectorOnOff3 = new Signal("valveInjectorOnOff3", Signal.INPUT);
  public Signal valveInjectorOnOff4 = new Signal("valveInjectorOnOff4", Signal.INPUT);
  public Signal valveInletOnOff1 = new Signal("valveInletOnOff1", Signal.INPUT);
  public Signal valveInletOnOff2 = new Signal("valveInletOnOff2", Signal.INPUT);
  public Signal valveInletOnOff3 = new Signal("valveInletOnOff3", Signal.INPUT);
  public Signal valveInletOnOff4 = new Signal("valveInletOnOff4", Signal.INPUT);
  public Signal dosUnitValveRetract1 = new Signal("dosUnitValveRetract1", Signal.INPUT);
  public Signal dosUnitValveRetract2 = new Signal("dosUnitValveRetract2", Signal.INPUT);
  public Signal dosUnitValveRetract3 = new Signal("dosUnitValveRetract3", Signal.INPUT);
  public Signal dosUnitValveRetract4 = new Signal("dosUnitValveRetract4", Signal.INPUT);
  public Signal dosUnitExtend1 = new Signal("dosUnitExtend1", Signal.INPUT);
  public Signal dosUnitExtend2 = new Signal("dosUnitExtend2", Signal.INPUT);
  public Signal dosUnitExtend3 = new Signal("dosUnitExtend3", Signal.INPUT);
  public Signal dosUnitExtend4 = new Signal("dosUnitExtend4", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal dosUnitEvacE = new Signal("dosUnitEvacE", Signal.OUTPUT);
  public Signal dosUnitFilledE = new Signal("dosUnitFilledE", Signal.OUTPUT);
  public Signal liquidVolumeDetectorE = new Signal("liquidVolumeDetectorE", Signal.OUTPUT);
  public Signal liquidVolumeDetector = new Signal("liquidVolumeDetector", Signal.OUTPUT);
  private int S11711 = 1;
  private int S11369 = 1;
  private int S11380 = 1;
  private int S11412 = 1;
  private int S11390 = 1;
  private int S11444 = 1;
  private int S11422 = 1;
  private int S11455 = 1;
  private int S11466 = 1;
  private int S11498 = 1;
  private int S11476 = 1;
  private int S11530 = 1;
  private int S11508 = 1;
  private int S11541 = 1;
  private int S11552 = 1;
  private int S11584 = 1;
  private int S11562 = 1;
  private int S11616 = 1;
  private int S11594 = 1;
  private int S11627 = 1;
  private int S11638 = 1;
  private int S11649 = 1;
  private int S11681 = 1;
  private int S11659 = 1;
  private int S11709 = 1;
  private int S11689 = 1;
  private int S11697 = 1;
  private int S11702 = 1;
  private int S11707 = 1;
  
  private int[] ends = new int[23];
  private int[] tdone = new int[23];
  
  public void thread11756(int [] tdone, int [] ends){
        switch(S11707){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        liquidVolumeDetector.setPresent();//sysj\plant.sysj line: 270, column: 17
        currsigs.addElement(liquidVolumeDetector);
        liquidVolumeDetector.setValue((liquidVolumeDetector.getpreval() == null ? 0 : ((Integer)liquidVolumeDetector.getpreval()).intValue()));//sysj\plant.sysj line: 270, column: 17
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread11755(int [] tdone, int [] ends){
        switch(S11702){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        liquidVolumeDetectorE.setPresent();//sysj\plant.sysj line: 268, column: 17
        currsigs.addElement(liquidVolumeDetectorE);
        liquidVolumeDetectorE.setValue((liquidVolumeDetector.getpreval() == null ? 0 : ((Integer)liquidVolumeDetector.getpreval()).intValue()));//sysj\plant.sysj line: 268, column: 17
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread11754(int [] tdone, int [] ends){
        switch(S11697){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\plant.sysj line: 266, column: 25
          dosUnitFilledE.setPresent();//sysj\plant.sysj line: 266, column: 40
          currsigs.addElement(dosUnitFilledE);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread11753(int [] tdone, int [] ends){
        switch(S11689){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\plant.sysj line: 264, column: 25
          dosUnitEvacE.setPresent();//sysj\plant.sysj line: 264, column: 38
          currsigs.addElement(dosUnitEvacE);
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

  public void thread11752(int [] tdone, int [] ends){
        switch(S11709){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread11753(tdone,ends);
        thread11754(tdone,ends);
        thread11755(tdone,ends);
        thread11756(tdone,ends);
        int biggest11757 = 0;
        if(ends[19]>=biggest11757){
          biggest11757=ends[19];
        }
        if(ends[20]>=biggest11757){
          biggest11757=ends[20];
        }
        if(ends[21]>=biggest11757){
          biggest11757=ends[21];
        }
        if(ends[22]>=biggest11757){
          biggest11757=ends[22];
        }
        if(biggest11757 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest11757 == 0){
          S11709=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread11751(int [] tdone, int [] ends){
        switch(S11681){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S11659){
          case 0 : 
            if(!dosUnitValveRetract4.getprestatus()){//sysj\plant.sysj line: 250, column: 23
              S11659=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 253, column: 21
              currsigs.addElement(dosUnitFilled);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            S11659=1;
            S11659=0;
            if(dosUnitValveRetract4.getprestatus()){//sysj\plant.sysj line: 249, column: 21
              System.out.println("FillerPlant: valveRetract");//sysj\plant.sysj line: 252, column: 18
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 253, column: 21
              currsigs.addElement(dosUnitFilled);
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              S11659=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11750(int [] tdone, int [] ends){
        switch(S11649){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(dosUnitExtend4.getprestatus()){//sysj\plant.sysj line: 234, column: 21
          System.out.println("FillerPlant: valveExtend");//sysj\plant.sysj line: 237, column: 18
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

  public void thread11749(int [] tdone, int [] ends){
        switch(S11638){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff4.getprestatus()){//sysj\plant.sysj line: 220, column: 21
          System.out.println("FillerPlant: valveInletOnOff4");//sysj\plant.sysj line: 222, column: 21
          active[15]=1;
          ends[15]=1;
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

  public void thread11748(int [] tdone, int [] ends){
        switch(S11627){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff4.getprestatus()){//sysj\plant.sysj line: 206, column: 21
          System.out.println("FillerPlant: valveInjectorOnOff4");//sysj\plant.sysj line: 208, column: 21
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread11747(int [] tdone, int [] ends){
        switch(S11616){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S11594){
          case 0 : 
            if(!dosUnitValveRetract3.getprestatus()){//sysj\plant.sysj line: 191, column: 23
              S11594=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 194, column: 21
              currsigs.addElement(dosUnitFilled);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S11594=1;
            S11594=0;
            if(dosUnitValveRetract3.getprestatus()){//sysj\plant.sysj line: 190, column: 21
              System.out.println("FillerPlant: valveRetract");//sysj\plant.sysj line: 193, column: 18
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 194, column: 21
              currsigs.addElement(dosUnitFilled);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S11594=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11746(int [] tdone, int [] ends){
        switch(S11584){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S11562){
          case 0 : 
            if(!dosUnitExtend3.getprestatus()){//sysj\plant.sysj line: 175, column: 23
              S11562=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 178, column: 21
              currsigs.addElement(dosUnitEvac);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S11562=1;
            S11562=0;
            if(dosUnitExtend3.getprestatus()){//sysj\plant.sysj line: 174, column: 21
              System.out.println("FillerPlant: valveExtend");//sysj\plant.sysj line: 177, column: 18
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 178, column: 21
              currsigs.addElement(dosUnitEvac);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S11562=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11745(int [] tdone, int [] ends){
        switch(S11552){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff3.getprestatus()){//sysj\plant.sysj line: 160, column: 21
          System.out.println("FillerPlant: valveInletOnOff3");//sysj\plant.sysj line: 162, column: 21
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

  public void thread11744(int [] tdone, int [] ends){
        switch(S11541){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff3.getprestatus()){//sysj\plant.sysj line: 146, column: 21
          System.out.println("FillerPlant: valveInjectorOnOff3");//sysj\plant.sysj line: 148, column: 21
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

  public void thread11743(int [] tdone, int [] ends){
        switch(S11530){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S11508){
          case 0 : 
            if(!dosUnitValveRetract2.getprestatus()){//sysj\plant.sysj line: 131, column: 23
              S11508=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 134, column: 21
              currsigs.addElement(dosUnitFilled);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S11508=1;
            S11508=0;
            if(dosUnitValveRetract2.getprestatus()){//sysj\plant.sysj line: 130, column: 21
              System.out.println("FillerPlant: valveRetract");//sysj\plant.sysj line: 133, column: 18
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 134, column: 21
              currsigs.addElement(dosUnitFilled);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S11508=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11742(int [] tdone, int [] ends){
        switch(S11498){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S11476){
          case 0 : 
            if(!dosUnitExtend2.getprestatus()){//sysj\plant.sysj line: 115, column: 23
              S11476=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 118, column: 21
              currsigs.addElement(dosUnitEvac);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S11476=1;
            S11476=0;
            if(dosUnitExtend2.getprestatus()){//sysj\plant.sysj line: 114, column: 21
              System.out.println("FillerPlant: valveExtend");//sysj\plant.sysj line: 117, column: 18
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 118, column: 21
              currsigs.addElement(dosUnitEvac);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S11476=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11741(int [] tdone, int [] ends){
        switch(S11466){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff2.getprestatus()){//sysj\plant.sysj line: 100, column: 21
          System.out.println("FillerPlant: valveInletOnOff2");//sysj\plant.sysj line: 102, column: 21
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

  public void thread11740(int [] tdone, int [] ends){
        switch(S11455){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff2.getprestatus()){//sysj\plant.sysj line: 86, column: 21
          System.out.println("FillerPlant: valveInjectorOnOff2");//sysj\plant.sysj line: 88, column: 21
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

  public void thread11739(int [] tdone, int [] ends){
        switch(S11444){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S11422){
          case 0 : 
            if(!dosUnitValveRetract1.getprestatus()){//sysj\plant.sysj line: 71, column: 23
              S11422=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 74, column: 21
              currsigs.addElement(dosUnitFilled);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S11422=1;
            S11422=0;
            if(dosUnitValveRetract1.getprestatus()){//sysj\plant.sysj line: 70, column: 21
              System.out.println("FillerPlant: valveRetract");//sysj\plant.sysj line: 73, column: 18
              dosUnitFilled.setPresent();//sysj\plant.sysj line: 74, column: 21
              currsigs.addElement(dosUnitFilled);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S11422=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11738(int [] tdone, int [] ends){
        switch(S11412){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S11390){
          case 0 : 
            if(!dosUnitExtend1.getprestatus()){//sysj\plant.sysj line: 55, column: 23
              S11390=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 58, column: 21
              currsigs.addElement(dosUnitEvac);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S11390=1;
            S11390=0;
            if(dosUnitExtend1.getprestatus()){//sysj\plant.sysj line: 54, column: 21
              System.out.println("FillerPlant: valveExtend");//sysj\plant.sysj line: 57, column: 18
              dosUnitEvac.setPresent();//sysj\plant.sysj line: 58, column: 21
              currsigs.addElement(dosUnitEvac);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S11390=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread11737(int [] tdone, int [] ends){
        switch(S11380){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff1.getprestatus()){//sysj\plant.sysj line: 40, column: 21
          System.out.println("FillerPlant: valveInletOnOff1");//sysj\plant.sysj line: 42, column: 21
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

  public void thread11736(int [] tdone, int [] ends){
        switch(S11369){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff1.getprestatus()){//sysj\plant.sysj line: 26, column: 21
          System.out.println("FillerPlant: valveInjectorOnOff1");//sysj\plant.sysj line: 28, column: 21
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread11733(int [] tdone, int [] ends){
        S11707=1;
    liquidVolumeDetector.setPresent();//sysj\plant.sysj line: 270, column: 17
    currsigs.addElement(liquidVolumeDetector);
    liquidVolumeDetector.setValue((liquidVolumeDetector.getpreval() == null ? 0 : ((Integer)liquidVolumeDetector.getpreval()).intValue()));//sysj\plant.sysj line: 270, column: 17
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread11732(int [] tdone, int [] ends){
        S11702=1;
    liquidVolumeDetectorE.setPresent();//sysj\plant.sysj line: 268, column: 17
    currsigs.addElement(liquidVolumeDetectorE);
    liquidVolumeDetectorE.setValue((liquidVolumeDetector.getpreval() == null ? 0 : ((Integer)liquidVolumeDetector.getpreval()).intValue()));//sysj\plant.sysj line: 268, column: 17
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread11731(int [] tdone, int [] ends){
        S11697=1;
    if(dosUnitFilled.getprestatus()){//sysj\plant.sysj line: 266, column: 25
      dosUnitFilledE.setPresent();//sysj\plant.sysj line: 266, column: 40
      currsigs.addElement(dosUnitFilledE);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread11730(int [] tdone, int [] ends){
        S11689=1;
    if(dosUnitEvac.getprestatus()){//sysj\plant.sysj line: 264, column: 25
      dosUnitEvacE.setPresent();//sysj\plant.sysj line: 264, column: 38
      currsigs.addElement(dosUnitEvacE);
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

  public void thread11729(int [] tdone, int [] ends){
        S11709=1;
    thread11730(tdone,ends);
    thread11731(tdone,ends);
    thread11732(tdone,ends);
    thread11733(tdone,ends);
    int biggest11734 = 0;
    if(ends[19]>=biggest11734){
      biggest11734=ends[19];
    }
    if(ends[20]>=biggest11734){
      biggest11734=ends[20];
    }
    if(ends[21]>=biggest11734){
      biggest11734=ends[21];
    }
    if(ends[22]>=biggest11734){
      biggest11734=ends[22];
    }
    if(biggest11734 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread11728(int [] tdone, int [] ends){
        S11681=1;
    S11659=0;
    if(dosUnitValveRetract4.getprestatus()){//sysj\plant.sysj line: 249, column: 21
      System.out.println("FillerPlant: valveRetract");//sysj\plant.sysj line: 252, column: 18
      dosUnitFilled.setPresent();//sysj\plant.sysj line: 253, column: 21
      currsigs.addElement(dosUnitFilled);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      S11659=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread11727(int [] tdone, int [] ends){
        S11649=1;
    if(dosUnitExtend4.getprestatus()){//sysj\plant.sysj line: 234, column: 21
      System.out.println("FillerPlant: valveExtend");//sysj\plant.sysj line: 237, column: 18
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

  public void thread11726(int [] tdone, int [] ends){
        S11638=1;
    if(valveInletOnOff4.getprestatus()){//sysj\plant.sysj line: 220, column: 21
      System.out.println("FillerPlant: valveInletOnOff4");//sysj\plant.sysj line: 222, column: 21
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread11725(int [] tdone, int [] ends){
        S11627=1;
    if(valveInjectorOnOff4.getprestatus()){//sysj\plant.sysj line: 206, column: 21
      System.out.println("FillerPlant: valveInjectorOnOff4");//sysj\plant.sysj line: 208, column: 21
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

  public void thread11724(int [] tdone, int [] ends){
        S11616=1;
    S11594=0;
    if(dosUnitValveRetract3.getprestatus()){//sysj\plant.sysj line: 190, column: 21
      System.out.println("FillerPlant: valveRetract");//sysj\plant.sysj line: 193, column: 18
      dosUnitFilled.setPresent();//sysj\plant.sysj line: 194, column: 21
      currsigs.addElement(dosUnitFilled);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S11594=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread11723(int [] tdone, int [] ends){
        S11584=1;
    S11562=0;
    if(dosUnitExtend3.getprestatus()){//sysj\plant.sysj line: 174, column: 21
      System.out.println("FillerPlant: valveExtend");//sysj\plant.sysj line: 177, column: 18
      dosUnitEvac.setPresent();//sysj\plant.sysj line: 178, column: 21
      currsigs.addElement(dosUnitEvac);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S11562=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread11722(int [] tdone, int [] ends){
        S11552=1;
    if(valveInletOnOff3.getprestatus()){//sysj\plant.sysj line: 160, column: 21
      System.out.println("FillerPlant: valveInletOnOff3");//sysj\plant.sysj line: 162, column: 21
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

  public void thread11721(int [] tdone, int [] ends){
        S11541=1;
    if(valveInjectorOnOff3.getprestatus()){//sysj\plant.sysj line: 146, column: 21
      System.out.println("FillerPlant: valveInjectorOnOff3");//sysj\plant.sysj line: 148, column: 21
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

  public void thread11720(int [] tdone, int [] ends){
        S11530=1;
    S11508=0;
    if(dosUnitValveRetract2.getprestatus()){//sysj\plant.sysj line: 130, column: 21
      System.out.println("FillerPlant: valveRetract");//sysj\plant.sysj line: 133, column: 18
      dosUnitFilled.setPresent();//sysj\plant.sysj line: 134, column: 21
      currsigs.addElement(dosUnitFilled);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S11508=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread11719(int [] tdone, int [] ends){
        S11498=1;
    S11476=0;
    if(dosUnitExtend2.getprestatus()){//sysj\plant.sysj line: 114, column: 21
      System.out.println("FillerPlant: valveExtend");//sysj\plant.sysj line: 117, column: 18
      dosUnitEvac.setPresent();//sysj\plant.sysj line: 118, column: 21
      currsigs.addElement(dosUnitEvac);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S11476=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread11718(int [] tdone, int [] ends){
        S11466=1;
    if(valveInletOnOff2.getprestatus()){//sysj\plant.sysj line: 100, column: 21
      System.out.println("FillerPlant: valveInletOnOff2");//sysj\plant.sysj line: 102, column: 21
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread11717(int [] tdone, int [] ends){
        S11455=1;
    if(valveInjectorOnOff2.getprestatus()){//sysj\plant.sysj line: 86, column: 21
      System.out.println("FillerPlant: valveInjectorOnOff2");//sysj\plant.sysj line: 88, column: 21
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread11716(int [] tdone, int [] ends){
        S11444=1;
    S11422=0;
    if(dosUnitValveRetract1.getprestatus()){//sysj\plant.sysj line: 70, column: 21
      System.out.println("FillerPlant: valveRetract");//sysj\plant.sysj line: 73, column: 18
      dosUnitFilled.setPresent();//sysj\plant.sysj line: 74, column: 21
      currsigs.addElement(dosUnitFilled);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S11422=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread11715(int [] tdone, int [] ends){
        S11412=1;
    S11390=0;
    if(dosUnitExtend1.getprestatus()){//sysj\plant.sysj line: 54, column: 21
      System.out.println("FillerPlant: valveExtend");//sysj\plant.sysj line: 57, column: 18
      dosUnitEvac.setPresent();//sysj\plant.sysj line: 58, column: 21
      currsigs.addElement(dosUnitEvac);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S11390=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread11714(int [] tdone, int [] ends){
        S11380=1;
    if(valveInletOnOff1.getprestatus()){//sysj\plant.sysj line: 40, column: 21
      System.out.println("FillerPlant: valveInletOnOff1");//sysj\plant.sysj line: 42, column: 21
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

  public void thread11713(int [] tdone, int [] ends){
        S11369=1;
    if(valveInjectorOnOff1.getprestatus()){//sysj\plant.sysj line: 26, column: 21
      System.out.println("FillerPlant: valveInjectorOnOff1");//sysj\plant.sysj line: 28, column: 21
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

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S11711){
        case 0 : 
          S11711=0;
          break RUN;
        
        case 1 : 
          S11711=2;
          S11711=2;
          thread11713(tdone,ends);
          thread11714(tdone,ends);
          thread11715(tdone,ends);
          thread11716(tdone,ends);
          thread11717(tdone,ends);
          thread11718(tdone,ends);
          thread11719(tdone,ends);
          thread11720(tdone,ends);
          thread11721(tdone,ends);
          thread11722(tdone,ends);
          thread11723(tdone,ends);
          thread11724(tdone,ends);
          thread11725(tdone,ends);
          thread11726(tdone,ends);
          thread11727(tdone,ends);
          thread11728(tdone,ends);
          thread11729(tdone,ends);
          int biggest11735 = 0;
          if(ends[2]>=biggest11735){
            biggest11735=ends[2];
          }
          if(ends[3]>=biggest11735){
            biggest11735=ends[3];
          }
          if(ends[4]>=biggest11735){
            biggest11735=ends[4];
          }
          if(ends[5]>=biggest11735){
            biggest11735=ends[5];
          }
          if(ends[6]>=biggest11735){
            biggest11735=ends[6];
          }
          if(ends[7]>=biggest11735){
            biggest11735=ends[7];
          }
          if(ends[8]>=biggest11735){
            biggest11735=ends[8];
          }
          if(ends[9]>=biggest11735){
            biggest11735=ends[9];
          }
          if(ends[10]>=biggest11735){
            biggest11735=ends[10];
          }
          if(ends[11]>=biggest11735){
            biggest11735=ends[11];
          }
          if(ends[12]>=biggest11735){
            biggest11735=ends[12];
          }
          if(ends[13]>=biggest11735){
            biggest11735=ends[13];
          }
          if(ends[14]>=biggest11735){
            biggest11735=ends[14];
          }
          if(ends[15]>=biggest11735){
            biggest11735=ends[15];
          }
          if(ends[16]>=biggest11735){
            biggest11735=ends[16];
          }
          if(ends[17]>=biggest11735){
            biggest11735=ends[17];
          }
          if(ends[18]>=biggest11735){
            biggest11735=ends[18];
          }
          if(biggest11735 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread11736(tdone,ends);
          thread11737(tdone,ends);
          thread11738(tdone,ends);
          thread11739(tdone,ends);
          thread11740(tdone,ends);
          thread11741(tdone,ends);
          thread11742(tdone,ends);
          thread11743(tdone,ends);
          thread11744(tdone,ends);
          thread11745(tdone,ends);
          thread11746(tdone,ends);
          thread11747(tdone,ends);
          thread11748(tdone,ends);
          thread11749(tdone,ends);
          thread11750(tdone,ends);
          thread11751(tdone,ends);
          thread11752(tdone,ends);
          int biggest11758 = 0;
          if(ends[2]>=biggest11758){
            biggest11758=ends[2];
          }
          if(ends[3]>=biggest11758){
            biggest11758=ends[3];
          }
          if(ends[4]>=biggest11758){
            biggest11758=ends[4];
          }
          if(ends[5]>=biggest11758){
            biggest11758=ends[5];
          }
          if(ends[6]>=biggest11758){
            biggest11758=ends[6];
          }
          if(ends[7]>=biggest11758){
            biggest11758=ends[7];
          }
          if(ends[8]>=biggest11758){
            biggest11758=ends[8];
          }
          if(ends[9]>=biggest11758){
            biggest11758=ends[9];
          }
          if(ends[10]>=biggest11758){
            biggest11758=ends[10];
          }
          if(ends[11]>=biggest11758){
            biggest11758=ends[11];
          }
          if(ends[12]>=biggest11758){
            biggest11758=ends[12];
          }
          if(ends[13]>=biggest11758){
            biggest11758=ends[13];
          }
          if(ends[14]>=biggest11758){
            biggest11758=ends[14];
          }
          if(ends[15]>=biggest11758){
            biggest11758=ends[15];
          }
          if(ends[16]>=biggest11758){
            biggest11758=ends[16];
          }
          if(ends[17]>=biggest11758){
            biggest11758=ends[17];
          }
          if(ends[18]>=biggest11758){
            biggest11758=ends[18];
          }
          if(biggest11758 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest11758 == 0){
            S11711=0;
            active[1]=0;
            ends[1]=0;
            S11711=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          valveInjectorOnOff1.gethook();
          valveInjectorOnOff2.gethook();
          valveInjectorOnOff3.gethook();
          valveInjectorOnOff4.gethook();
          valveInletOnOff1.gethook();
          valveInletOnOff2.gethook();
          valveInletOnOff3.gethook();
          valveInletOnOff4.gethook();
          dosUnitValveRetract1.gethook();
          dosUnitValveRetract2.gethook();
          dosUnitValveRetract3.gethook();
          dosUnitValveRetract4.gethook();
          dosUnitExtend1.gethook();
          dosUnitExtend2.gethook();
          dosUnitExtend3.gethook();
          dosUnitExtend4.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff1.setpreclear();
      valveInjectorOnOff2.setpreclear();
      valveInjectorOnOff3.setpreclear();
      valveInjectorOnOff4.setpreclear();
      valveInletOnOff1.setpreclear();
      valveInletOnOff2.setpreclear();
      valveInletOnOff3.setpreclear();
      valveInletOnOff4.setpreclear();
      dosUnitValveRetract1.setpreclear();
      dosUnitValveRetract2.setpreclear();
      dosUnitValveRetract3.setpreclear();
      dosUnitValveRetract4.setpreclear();
      dosUnitExtend1.setpreclear();
      dosUnitExtend2.setpreclear();
      dosUnitExtend3.setpreclear();
      dosUnitExtend4.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      dosUnitEvacE.setpreclear();
      dosUnitFilledE.setpreclear();
      liquidVolumeDetectorE.setpreclear();
      liquidVolumeDetector.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = valveInjectorOnOff1.getStatus() ? valveInjectorOnOff1.setprepresent() : valveInjectorOnOff1.setpreclear();
      valveInjectorOnOff1.setpreval(valveInjectorOnOff1.getValue());
      valveInjectorOnOff1.setClear();
      dummyint = valveInjectorOnOff2.getStatus() ? valveInjectorOnOff2.setprepresent() : valveInjectorOnOff2.setpreclear();
      valveInjectorOnOff2.setpreval(valveInjectorOnOff2.getValue());
      valveInjectorOnOff2.setClear();
      dummyint = valveInjectorOnOff3.getStatus() ? valveInjectorOnOff3.setprepresent() : valveInjectorOnOff3.setpreclear();
      valveInjectorOnOff3.setpreval(valveInjectorOnOff3.getValue());
      valveInjectorOnOff3.setClear();
      dummyint = valveInjectorOnOff4.getStatus() ? valveInjectorOnOff4.setprepresent() : valveInjectorOnOff4.setpreclear();
      valveInjectorOnOff4.setpreval(valveInjectorOnOff4.getValue());
      valveInjectorOnOff4.setClear();
      dummyint = valveInletOnOff1.getStatus() ? valveInletOnOff1.setprepresent() : valveInletOnOff1.setpreclear();
      valveInletOnOff1.setpreval(valveInletOnOff1.getValue());
      valveInletOnOff1.setClear();
      dummyint = valveInletOnOff2.getStatus() ? valveInletOnOff2.setprepresent() : valveInletOnOff2.setpreclear();
      valveInletOnOff2.setpreval(valveInletOnOff2.getValue());
      valveInletOnOff2.setClear();
      dummyint = valveInletOnOff3.getStatus() ? valveInletOnOff3.setprepresent() : valveInletOnOff3.setpreclear();
      valveInletOnOff3.setpreval(valveInletOnOff3.getValue());
      valveInletOnOff3.setClear();
      dummyint = valveInletOnOff4.getStatus() ? valveInletOnOff4.setprepresent() : valveInletOnOff4.setpreclear();
      valveInletOnOff4.setpreval(valveInletOnOff4.getValue());
      valveInletOnOff4.setClear();
      dummyint = dosUnitValveRetract1.getStatus() ? dosUnitValveRetract1.setprepresent() : dosUnitValveRetract1.setpreclear();
      dosUnitValveRetract1.setpreval(dosUnitValveRetract1.getValue());
      dosUnitValveRetract1.setClear();
      dummyint = dosUnitValveRetract2.getStatus() ? dosUnitValveRetract2.setprepresent() : dosUnitValveRetract2.setpreclear();
      dosUnitValveRetract2.setpreval(dosUnitValveRetract2.getValue());
      dosUnitValveRetract2.setClear();
      dummyint = dosUnitValveRetract3.getStatus() ? dosUnitValveRetract3.setprepresent() : dosUnitValveRetract3.setpreclear();
      dosUnitValveRetract3.setpreval(dosUnitValveRetract3.getValue());
      dosUnitValveRetract3.setClear();
      dummyint = dosUnitValveRetract4.getStatus() ? dosUnitValveRetract4.setprepresent() : dosUnitValveRetract4.setpreclear();
      dosUnitValveRetract4.setpreval(dosUnitValveRetract4.getValue());
      dosUnitValveRetract4.setClear();
      dummyint = dosUnitExtend1.getStatus() ? dosUnitExtend1.setprepresent() : dosUnitExtend1.setpreclear();
      dosUnitExtend1.setpreval(dosUnitExtend1.getValue());
      dosUnitExtend1.setClear();
      dummyint = dosUnitExtend2.getStatus() ? dosUnitExtend2.setprepresent() : dosUnitExtend2.setpreclear();
      dosUnitExtend2.setpreval(dosUnitExtend2.getValue());
      dosUnitExtend2.setClear();
      dummyint = dosUnitExtend3.getStatus() ? dosUnitExtend3.setprepresent() : dosUnitExtend3.setpreclear();
      dosUnitExtend3.setpreval(dosUnitExtend3.getValue());
      dosUnitExtend3.setClear();
      dummyint = dosUnitExtend4.getStatus() ? dosUnitExtend4.setprepresent() : dosUnitExtend4.setpreclear();
      dosUnitExtend4.setpreval(dosUnitExtend4.getValue());
      dosUnitExtend4.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      dosUnitEvacE.sethook();
      dosUnitEvacE.setClear();
      dosUnitFilledE.sethook();
      dosUnitFilledE.setClear();
      liquidVolumeDetectorE.sethook();
      liquidVolumeDetectorE.setClear();
      liquidVolumeDetector.sethook();
      liquidVolumeDetector.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        valveInjectorOnOff1.gethook();
        valveInjectorOnOff2.gethook();
        valveInjectorOnOff3.gethook();
        valveInjectorOnOff4.gethook();
        valveInletOnOff1.gethook();
        valveInletOnOff2.gethook();
        valveInletOnOff3.gethook();
        valveInletOnOff4.gethook();
        dosUnitValveRetract1.gethook();
        dosUnitValveRetract2.gethook();
        dosUnitValveRetract3.gethook();
        dosUnitValveRetract4.gethook();
        dosUnitExtend1.gethook();
        dosUnitExtend2.gethook();
        dosUnitExtend3.gethook();
        dosUnitExtend4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
