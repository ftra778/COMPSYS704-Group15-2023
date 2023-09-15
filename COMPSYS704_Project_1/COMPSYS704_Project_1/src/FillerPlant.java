import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\ABSplant.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABSplant.sysj line: 2, column: 1

public class FillerPlant extends ClockDomain{
  public FillerPlant(String name){super(name);}
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
  private int S44205 = 1;
  private int S43863 = 1;
  private int S43874 = 1;
  private int S43906 = 1;
  private int S43884 = 1;
  private int S43938 = 1;
  private int S43916 = 1;
  private int S43949 = 1;
  private int S43960 = 1;
  private int S43992 = 1;
  private int S43970 = 1;
  private int S44024 = 1;
  private int S44002 = 1;
  private int S44035 = 1;
  private int S44046 = 1;
  private int S44078 = 1;
  private int S44056 = 1;
  private int S44110 = 1;
  private int S44088 = 1;
  private int S44121 = 1;
  private int S44132 = 1;
  private int S44143 = 1;
  private int S44175 = 1;
  private int S44153 = 1;
  private int S44203 = 1;
  private int S44183 = 1;
  private int S44191 = 1;
  private int S44196 = 1;
  private int S44201 = 1;
  
  private int[] ends = new int[96];
  private int[] tdone = new int[96];
  
  public void thread57256(int [] tdone, int [] ends){
        switch(S44201){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        liquidVolumeDetector.setPresent();//sysj\ABSplant.sysj line: 334, column: 17
        currsigs.addElement(liquidVolumeDetector);
        liquidVolumeDetector.setValue((liquidVolumeDetector.getpreval() == null ? 0 : ((Integer)liquidVolumeDetector.getpreval()).intValue()));//sysj\ABSplant.sysj line: 334, column: 17
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread57255(int [] tdone, int [] ends){
        switch(S44196){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        liquidVolumeDetectorE.setPresent();//sysj\ABSplant.sysj line: 332, column: 17
        currsigs.addElement(liquidVolumeDetectorE);
        liquidVolumeDetectorE.setValue((liquidVolumeDetector.getpreval() == null ? 0 : ((Integer)liquidVolumeDetector.getpreval()).intValue()));//sysj\ABSplant.sysj line: 332, column: 17
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
        break;
      
    }
  }

  public void thread57254(int [] tdone, int [] ends){
        switch(S44191){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\ABSplant.sysj line: 330, column: 25
          dosUnitFilledE.setPresent();//sysj\ABSplant.sysj line: 330, column: 40
          currsigs.addElement(dosUnitFilledE);
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread57253(int [] tdone, int [] ends){
        switch(S44183){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\ABSplant.sysj line: 328, column: 25
          dosUnitEvacE.setPresent();//sysj\ABSplant.sysj line: 328, column: 38
          currsigs.addElement(dosUnitEvacE);
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread57252(int [] tdone, int [] ends){
        switch(S44203){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        thread57253(tdone,ends);
        thread57254(tdone,ends);
        thread57255(tdone,ends);
        thread57256(tdone,ends);
        int biggest57257 = 0;
        if(ends[25]>=biggest57257){
          biggest57257=ends[25];
        }
        if(ends[26]>=biggest57257){
          biggest57257=ends[26];
        }
        if(ends[27]>=biggest57257){
          biggest57257=ends[27];
        }
        if(ends[28]>=biggest57257){
          biggest57257=ends[28];
        }
        if(biggest57257 == 1){
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        //FINXME code
        if(biggest57257 == 0){
          S44203=0;
          active[24]=0;
          ends[24]=0;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread57251(int [] tdone, int [] ends){
        switch(S44175){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S44153){
          case 0 : 
            if(!dosUnitValveRetract4.getprestatus()){//sysj\ABSplant.sysj line: 314, column: 20
              S44153=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 317, column: 18
              currsigs.addElement(dosUnitFilled);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
          case 1 : 
            S44153=1;
            S44153=0;
            if(dosUnitValveRetract4.getprestatus()){//sysj\ABSplant.sysj line: 313, column: 18
              System.out.println("FillerPlant: valveRetract");//sysj\ABSplant.sysj line: 316, column: 15
              dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 317, column: 18
              currsigs.addElement(dosUnitFilled);
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S44153=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57250(int [] tdone, int [] ends){
        switch(S44143){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(dosUnitExtend4.getprestatus()){//sysj\ABSplant.sysj line: 298, column: 18
          System.out.println("FillerPlant: valveExtend");//sysj\ABSplant.sysj line: 301, column: 15
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread57249(int [] tdone, int [] ends){
        switch(S44132){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff4.getprestatus()){//sysj\ABSplant.sysj line: 284, column: 18
          System.out.println("FillerPlant: valveInletOnOff4");//sysj\ABSplant.sysj line: 286, column: 18
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread57248(int [] tdone, int [] ends){
        switch(S44121){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff4.getprestatus()){//sysj\ABSplant.sysj line: 270, column: 18
          System.out.println("FillerPlant: valveInjectorOnOff4");//sysj\ABSplant.sysj line: 272, column: 18
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

  public void thread57247(int [] tdone, int [] ends){
        switch(S44110){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S44088){
          case 0 : 
            if(!dosUnitValveRetract3.getprestatus()){//sysj\ABSplant.sysj line: 255, column: 20
              S44088=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 258, column: 18
              currsigs.addElement(dosUnitFilled);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            S44088=1;
            S44088=0;
            if(dosUnitValveRetract3.getprestatus()){//sysj\ABSplant.sysj line: 254, column: 18
              System.out.println("FillerPlant: valveRetract");//sysj\ABSplant.sysj line: 257, column: 15
              dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 258, column: 18
              currsigs.addElement(dosUnitFilled);
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S44088=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57246(int [] tdone, int [] ends){
        switch(S44078){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S44056){
          case 0 : 
            if(!dosUnitExtend3.getprestatus()){//sysj\ABSplant.sysj line: 239, column: 20
              S44056=1;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\ABSplant.sysj line: 242, column: 18
              currsigs.addElement(dosUnitEvac);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            S44056=1;
            S44056=0;
            if(dosUnitExtend3.getprestatus()){//sysj\ABSplant.sysj line: 238, column: 18
              System.out.println("FillerPlant: valveExtend");//sysj\ABSplant.sysj line: 241, column: 15
              dosUnitEvac.setPresent();//sysj\ABSplant.sysj line: 242, column: 18
              currsigs.addElement(dosUnitEvac);
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              S44056=1;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57245(int [] tdone, int [] ends){
        switch(S44046){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff3.getprestatus()){//sysj\ABSplant.sysj line: 224, column: 18
          System.out.println("FillerPlant: valveInletOnOff3");//sysj\ABSplant.sysj line: 226, column: 18
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread57244(int [] tdone, int [] ends){
        switch(S44035){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff3.getprestatus()){//sysj\ABSplant.sysj line: 210, column: 18
          System.out.println("FillerPlant: valveInjectorOnOff3");//sysj\ABSplant.sysj line: 212, column: 18
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

  public void thread57243(int [] tdone, int [] ends){
        switch(S44024){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S44002){
          case 0 : 
            if(!dosUnitValveRetract2.getprestatus()){//sysj\ABSplant.sysj line: 195, column: 20
              S44002=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 198, column: 18
              currsigs.addElement(dosUnitFilled);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            S44002=1;
            S44002=0;
            if(dosUnitValveRetract2.getprestatus()){//sysj\ABSplant.sysj line: 194, column: 18
              System.out.println("FillerPlant: valveRetract");//sysj\ABSplant.sysj line: 197, column: 15
              dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 198, column: 18
              currsigs.addElement(dosUnitFilled);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              S44002=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57242(int [] tdone, int [] ends){
        switch(S43992){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S43970){
          case 0 : 
            if(!dosUnitExtend2.getprestatus()){//sysj\ABSplant.sysj line: 179, column: 20
              S43970=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\ABSplant.sysj line: 182, column: 18
              currsigs.addElement(dosUnitEvac);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            S43970=1;
            S43970=0;
            if(dosUnitExtend2.getprestatus()){//sysj\ABSplant.sysj line: 178, column: 18
              System.out.println("FillerPlant: valveExtend");//sysj\ABSplant.sysj line: 181, column: 15
              dosUnitEvac.setPresent();//sysj\ABSplant.sysj line: 182, column: 18
              currsigs.addElement(dosUnitEvac);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              S43970=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57241(int [] tdone, int [] ends){
        switch(S43960){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff2.getprestatus()){//sysj\ABSplant.sysj line: 164, column: 18
          System.out.println("FillerPlant: valveInletOnOff2");//sysj\ABSplant.sysj line: 166, column: 18
          active[13]=1;
          ends[13]=1;
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

  public void thread57240(int [] tdone, int [] ends){
        switch(S43949){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff2.getprestatus()){//sysj\ABSplant.sysj line: 150, column: 18
          System.out.println("FillerPlant: valveInjectorOnOff2");//sysj\ABSplant.sysj line: 152, column: 18
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

  public void thread57239(int [] tdone, int [] ends){
        switch(S43938){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S43916){
          case 0 : 
            if(!dosUnitValveRetract1.getprestatus()){//sysj\ABSplant.sysj line: 135, column: 20
              S43916=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 138, column: 18
              currsigs.addElement(dosUnitFilled);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            S43916=1;
            S43916=0;
            if(dosUnitValveRetract1.getprestatus()){//sysj\ABSplant.sysj line: 134, column: 18
              System.out.println("FillerPlant: valveRetract");//sysj\ABSplant.sysj line: 137, column: 15
              dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 138, column: 18
              currsigs.addElement(dosUnitFilled);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S43916=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57238(int [] tdone, int [] ends){
        switch(S43906){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S43884){
          case 0 : 
            if(!dosUnitExtend1.getprestatus()){//sysj\ABSplant.sysj line: 119, column: 20
              S43884=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\ABSplant.sysj line: 122, column: 18
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S43884=1;
            S43884=0;
            if(dosUnitExtend1.getprestatus()){//sysj\ABSplant.sysj line: 118, column: 18
              System.out.println("FillerPlant: valveExtend");//sysj\ABSplant.sysj line: 121, column: 15
              dosUnitEvac.setPresent();//sysj\ABSplant.sysj line: 122, column: 18
              currsigs.addElement(dosUnitEvac);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S43884=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57237(int [] tdone, int [] ends){
        switch(S43874){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff1.getprestatus()){//sysj\ABSplant.sysj line: 104, column: 18
          System.out.println("FillerPlant: valveInletOnOff1");//sysj\ABSplant.sysj line: 106, column: 18
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread57236(int [] tdone, int [] ends){
        switch(S43863){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff1.getprestatus()){//sysj\ABSplant.sysj line: 90, column: 18
          System.out.println("FillerPlant: valveInjectorOnOff1");//sysj\ABSplant.sysj line: 92, column: 18
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread57233(int [] tdone, int [] ends){
        S44201=1;
    liquidVolumeDetector.setPresent();//sysj\ABSplant.sysj line: 334, column: 17
    currsigs.addElement(liquidVolumeDetector);
    liquidVolumeDetector.setValue((liquidVolumeDetector.getpreval() == null ? 0 : ((Integer)liquidVolumeDetector.getpreval()).intValue()));//sysj\ABSplant.sysj line: 334, column: 17
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread57232(int [] tdone, int [] ends){
        S44196=1;
    liquidVolumeDetectorE.setPresent();//sysj\ABSplant.sysj line: 332, column: 17
    currsigs.addElement(liquidVolumeDetectorE);
    liquidVolumeDetectorE.setValue((liquidVolumeDetector.getpreval() == null ? 0 : ((Integer)liquidVolumeDetector.getpreval()).intValue()));//sysj\ABSplant.sysj line: 332, column: 17
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread57231(int [] tdone, int [] ends){
        S44191=1;
    if(dosUnitFilled.getprestatus()){//sysj\ABSplant.sysj line: 330, column: 25
      dosUnitFilledE.setPresent();//sysj\ABSplant.sysj line: 330, column: 40
      currsigs.addElement(dosUnitFilledE);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread57230(int [] tdone, int [] ends){
        S44183=1;
    if(dosUnitEvac.getprestatus()){//sysj\ABSplant.sysj line: 328, column: 25
      dosUnitEvacE.setPresent();//sysj\ABSplant.sysj line: 328, column: 38
      currsigs.addElement(dosUnitEvacE);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread57229(int [] tdone, int [] ends){
        S44203=1;
    thread57230(tdone,ends);
    thread57231(tdone,ends);
    thread57232(tdone,ends);
    thread57233(tdone,ends);
    int biggest57234 = 0;
    if(ends[25]>=biggest57234){
      biggest57234=ends[25];
    }
    if(ends[26]>=biggest57234){
      biggest57234=ends[26];
    }
    if(ends[27]>=biggest57234){
      biggest57234=ends[27];
    }
    if(ends[28]>=biggest57234){
      biggest57234=ends[28];
    }
    if(biggest57234 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread57228(int [] tdone, int [] ends){
        S44175=1;
    S44153=0;
    if(dosUnitValveRetract4.getprestatus()){//sysj\ABSplant.sysj line: 313, column: 18
      System.out.println("FillerPlant: valveRetract");//sysj\ABSplant.sysj line: 316, column: 15
      dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 317, column: 18
      currsigs.addElement(dosUnitFilled);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S44153=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread57227(int [] tdone, int [] ends){
        S44143=1;
    if(dosUnitExtend4.getprestatus()){//sysj\ABSplant.sysj line: 298, column: 18
      System.out.println("FillerPlant: valveExtend");//sysj\ABSplant.sysj line: 301, column: 15
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread57226(int [] tdone, int [] ends){
        S44132=1;
    if(valveInletOnOff4.getprestatus()){//sysj\ABSplant.sysj line: 284, column: 18
      System.out.println("FillerPlant: valveInletOnOff4");//sysj\ABSplant.sysj line: 286, column: 18
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread57225(int [] tdone, int [] ends){
        S44121=1;
    if(valveInjectorOnOff4.getprestatus()){//sysj\ABSplant.sysj line: 270, column: 18
      System.out.println("FillerPlant: valveInjectorOnOff4");//sysj\ABSplant.sysj line: 272, column: 18
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

  public void thread57224(int [] tdone, int [] ends){
        S44110=1;
    S44088=0;
    if(dosUnitValveRetract3.getprestatus()){//sysj\ABSplant.sysj line: 254, column: 18
      System.out.println("FillerPlant: valveRetract");//sysj\ABSplant.sysj line: 257, column: 15
      dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 258, column: 18
      currsigs.addElement(dosUnitFilled);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S44088=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread57223(int [] tdone, int [] ends){
        S44078=1;
    S44056=0;
    if(dosUnitExtend3.getprestatus()){//sysj\ABSplant.sysj line: 238, column: 18
      System.out.println("FillerPlant: valveExtend");//sysj\ABSplant.sysj line: 241, column: 15
      dosUnitEvac.setPresent();//sysj\ABSplant.sysj line: 242, column: 18
      currsigs.addElement(dosUnitEvac);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S44056=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread57222(int [] tdone, int [] ends){
        S44046=1;
    if(valveInletOnOff3.getprestatus()){//sysj\ABSplant.sysj line: 224, column: 18
      System.out.println("FillerPlant: valveInletOnOff3");//sysj\ABSplant.sysj line: 226, column: 18
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread57221(int [] tdone, int [] ends){
        S44035=1;
    if(valveInjectorOnOff3.getprestatus()){//sysj\ABSplant.sysj line: 210, column: 18
      System.out.println("FillerPlant: valveInjectorOnOff3");//sysj\ABSplant.sysj line: 212, column: 18
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

  public void thread57220(int [] tdone, int [] ends){
        S44024=1;
    S44002=0;
    if(dosUnitValveRetract2.getprestatus()){//sysj\ABSplant.sysj line: 194, column: 18
      System.out.println("FillerPlant: valveRetract");//sysj\ABSplant.sysj line: 197, column: 15
      dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 198, column: 18
      currsigs.addElement(dosUnitFilled);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S44002=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread57219(int [] tdone, int [] ends){
        S43992=1;
    S43970=0;
    if(dosUnitExtend2.getprestatus()){//sysj\ABSplant.sysj line: 178, column: 18
      System.out.println("FillerPlant: valveExtend");//sysj\ABSplant.sysj line: 181, column: 15
      dosUnitEvac.setPresent();//sysj\ABSplant.sysj line: 182, column: 18
      currsigs.addElement(dosUnitEvac);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S43970=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread57218(int [] tdone, int [] ends){
        S43960=1;
    if(valveInletOnOff2.getprestatus()){//sysj\ABSplant.sysj line: 164, column: 18
      System.out.println("FillerPlant: valveInletOnOff2");//sysj\ABSplant.sysj line: 166, column: 18
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread57217(int [] tdone, int [] ends){
        S43949=1;
    if(valveInjectorOnOff2.getprestatus()){//sysj\ABSplant.sysj line: 150, column: 18
      System.out.println("FillerPlant: valveInjectorOnOff2");//sysj\ABSplant.sysj line: 152, column: 18
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

  public void thread57216(int [] tdone, int [] ends){
        S43938=1;
    S43916=0;
    if(dosUnitValveRetract1.getprestatus()){//sysj\ABSplant.sysj line: 134, column: 18
      System.out.println("FillerPlant: valveRetract");//sysj\ABSplant.sysj line: 137, column: 15
      dosUnitFilled.setPresent();//sysj\ABSplant.sysj line: 138, column: 18
      currsigs.addElement(dosUnitFilled);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S43916=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread57215(int [] tdone, int [] ends){
        S43906=1;
    S43884=0;
    if(dosUnitExtend1.getprestatus()){//sysj\ABSplant.sysj line: 118, column: 18
      System.out.println("FillerPlant: valveExtend");//sysj\ABSplant.sysj line: 121, column: 15
      dosUnitEvac.setPresent();//sysj\ABSplant.sysj line: 122, column: 18
      currsigs.addElement(dosUnitEvac);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S43884=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread57214(int [] tdone, int [] ends){
        S43874=1;
    if(valveInletOnOff1.getprestatus()){//sysj\ABSplant.sysj line: 104, column: 18
      System.out.println("FillerPlant: valveInletOnOff1");//sysj\ABSplant.sysj line: 106, column: 18
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread57213(int [] tdone, int [] ends){
        S43863=1;
    if(valveInjectorOnOff1.getprestatus()){//sysj\ABSplant.sysj line: 90, column: 18
      System.out.println("FillerPlant: valveInjectorOnOff1");//sysj\ABSplant.sysj line: 92, column: 18
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

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S44205){
        case 0 : 
          S44205=0;
          break RUN;
        
        case 1 : 
          S44205=2;
          S44205=2;
          thread57213(tdone,ends);
          thread57214(tdone,ends);
          thread57215(tdone,ends);
          thread57216(tdone,ends);
          thread57217(tdone,ends);
          thread57218(tdone,ends);
          thread57219(tdone,ends);
          thread57220(tdone,ends);
          thread57221(tdone,ends);
          thread57222(tdone,ends);
          thread57223(tdone,ends);
          thread57224(tdone,ends);
          thread57225(tdone,ends);
          thread57226(tdone,ends);
          thread57227(tdone,ends);
          thread57228(tdone,ends);
          thread57229(tdone,ends);
          int biggest57235 = 0;
          if(ends[8]>=biggest57235){
            biggest57235=ends[8];
          }
          if(ends[9]>=biggest57235){
            biggest57235=ends[9];
          }
          if(ends[10]>=biggest57235){
            biggest57235=ends[10];
          }
          if(ends[11]>=biggest57235){
            biggest57235=ends[11];
          }
          if(ends[12]>=biggest57235){
            biggest57235=ends[12];
          }
          if(ends[13]>=biggest57235){
            biggest57235=ends[13];
          }
          if(ends[14]>=biggest57235){
            biggest57235=ends[14];
          }
          if(ends[15]>=biggest57235){
            biggest57235=ends[15];
          }
          if(ends[16]>=biggest57235){
            biggest57235=ends[16];
          }
          if(ends[17]>=biggest57235){
            biggest57235=ends[17];
          }
          if(ends[18]>=biggest57235){
            biggest57235=ends[18];
          }
          if(ends[19]>=biggest57235){
            biggest57235=ends[19];
          }
          if(ends[20]>=biggest57235){
            biggest57235=ends[20];
          }
          if(ends[21]>=biggest57235){
            biggest57235=ends[21];
          }
          if(ends[22]>=biggest57235){
            biggest57235=ends[22];
          }
          if(ends[23]>=biggest57235){
            biggest57235=ends[23];
          }
          if(ends[24]>=biggest57235){
            biggest57235=ends[24];
          }
          if(biggest57235 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
        
        case 2 : 
          thread57236(tdone,ends);
          thread57237(tdone,ends);
          thread57238(tdone,ends);
          thread57239(tdone,ends);
          thread57240(tdone,ends);
          thread57241(tdone,ends);
          thread57242(tdone,ends);
          thread57243(tdone,ends);
          thread57244(tdone,ends);
          thread57245(tdone,ends);
          thread57246(tdone,ends);
          thread57247(tdone,ends);
          thread57248(tdone,ends);
          thread57249(tdone,ends);
          thread57250(tdone,ends);
          thread57251(tdone,ends);
          thread57252(tdone,ends);
          int biggest57258 = 0;
          if(ends[8]>=biggest57258){
            biggest57258=ends[8];
          }
          if(ends[9]>=biggest57258){
            biggest57258=ends[9];
          }
          if(ends[10]>=biggest57258){
            biggest57258=ends[10];
          }
          if(ends[11]>=biggest57258){
            biggest57258=ends[11];
          }
          if(ends[12]>=biggest57258){
            biggest57258=ends[12];
          }
          if(ends[13]>=biggest57258){
            biggest57258=ends[13];
          }
          if(ends[14]>=biggest57258){
            biggest57258=ends[14];
          }
          if(ends[15]>=biggest57258){
            biggest57258=ends[15];
          }
          if(ends[16]>=biggest57258){
            biggest57258=ends[16];
          }
          if(ends[17]>=biggest57258){
            biggest57258=ends[17];
          }
          if(ends[18]>=biggest57258){
            biggest57258=ends[18];
          }
          if(ends[19]>=biggest57258){
            biggest57258=ends[19];
          }
          if(ends[20]>=biggest57258){
            biggest57258=ends[20];
          }
          if(ends[21]>=biggest57258){
            biggest57258=ends[21];
          }
          if(ends[22]>=biggest57258){
            biggest57258=ends[22];
          }
          if(ends[23]>=biggest57258){
            biggest57258=ends[23];
          }
          if(ends[24]>=biggest57258){
            biggest57258=ends[24];
          }
          if(biggest57258 == 1){
            active[7]=1;
            ends[7]=1;
            break RUN;
          }
          //FINXME code
          if(biggest57258 == 0){
            S44205=0;
            active[7]=0;
            ends[7]=0;
            S44205=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[7] != 0){
      int index = 7;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
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
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
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
      if(active[7] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
