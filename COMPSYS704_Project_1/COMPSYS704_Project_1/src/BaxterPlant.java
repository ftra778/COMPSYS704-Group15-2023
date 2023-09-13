import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\ABSplant.sysj line: 1, column: 1
import org.compsys704.*;//sysj\ABSplant.sysj line: 2, column: 1

public class BaxterPlant extends ClockDomain{
  public BaxterPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal CMDR = new Signal("CMDR", Signal.INPUT);
  public Signal CMDL = new Signal("CMDL", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal CMDRfb = new Signal("CMDRfb", Signal.OUTPUT);
  public Signal CMDLfb = new Signal("CMDLfb", Signal.OUTPUT);
  public Signal LAE = new Signal("LAE", Signal.OUTPUT);
  public Signal LBE = new Signal("LBE", Signal.OUTPUT);
  public Signal LCE = new Signal("LCE", Signal.OUTPUT);
  public Signal LDE = new Signal("LDE", Signal.OUTPUT);
  public Signal LOE = new Signal("LOE", Signal.OUTPUT);
  public Signal LGE = new Signal("LGE", Signal.OUTPUT);
  public Signal RAE = new Signal("RAE", Signal.OUTPUT);
  public Signal RBE = new Signal("RBE", Signal.OUTPUT);
  public Signal RCE = new Signal("RCE", Signal.OUTPUT);
  public Signal RDE = new Signal("RDE", Signal.OUTPUT);
  public Signal ROE = new Signal("ROE", Signal.OUTPUT);
  public Signal RGE = new Signal("RGE", Signal.OUTPUT);
  private int S34180 = 1;
  private int S33760 = 1;
  private int S33710 = 1;
  private int S33834 = 1;
  private int S33784 = 1;
  private int S33932 = 1;
  private int S33842 = 1;
  private int S33850 = 1;
  private int S33858 = 1;
  private int S33866 = 1;
  private int S33874 = 1;
  private int S33882 = 1;
  private int S33890 = 1;
  private int S33898 = 1;
  private int S33906 = 1;
  private int S33914 = 1;
  private int S33922 = 1;
  private int S33930 = 1;
  
  private int[] ends = new int[74];
  private int[] tdone = new int[74];
  
  public void thread44773(int [] tdone, int [] ends){
        switch(S33930){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        if(RGE.getprestatus()){//sysj\ABSplant.sysj line: 397, column: 17
          System.out.println("RG");//sysj\ABSplant.sysj line: 397, column: 22
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        else {
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        break;
      
    }
  }

  public void thread44772(int [] tdone, int [] ends){
        switch(S33922){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        if(ROE.getprestatus()){//sysj\ABSplant.sysj line: 395, column: 17
          System.out.println("RO");//sysj\ABSplant.sysj line: 395, column: 22
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        break;
      
    }
  }

  public void thread44771(int [] tdone, int [] ends){
        switch(S33914){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(RDE.getprestatus()){//sysj\ABSplant.sysj line: 393, column: 17
          System.out.println("RD");//sysj\ABSplant.sysj line: 393, column: 22
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        else {
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread44770(int [] tdone, int [] ends){
        switch(S33906){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(RCE.getprestatus()){//sysj\ABSplant.sysj line: 391, column: 17
          System.out.println("RC");//sysj\ABSplant.sysj line: 391, column: 22
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        break;
      
    }
  }

  public void thread44769(int [] tdone, int [] ends){
        switch(S33898){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(RBE.getprestatus()){//sysj\ABSplant.sysj line: 389, column: 17
          System.out.println("RB");//sysj\ABSplant.sysj line: 389, column: 22
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        break;
      
    }
  }

  public void thread44768(int [] tdone, int [] ends){
        switch(S33890){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(RAE.getprestatus()){//sysj\ABSplant.sysj line: 387, column: 17
          System.out.println("RA");//sysj\ABSplant.sysj line: 387, column: 22
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread44767(int [] tdone, int [] ends){
        switch(S33882){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(LGE.getprestatus()){//sysj\ABSplant.sysj line: 385, column: 17
          System.out.println("LG");//sysj\ABSplant.sysj line: 385, column: 22
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        break;
      
    }
  }

  public void thread44766(int [] tdone, int [] ends){
        switch(S33874){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(LOE.getprestatus()){//sysj\ABSplant.sysj line: 383, column: 17
          System.out.println("LO");//sysj\ABSplant.sysj line: 383, column: 22
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        break;
      
    }
  }

  public void thread44765(int [] tdone, int [] ends){
        switch(S33866){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(LDE.getprestatus()){//sysj\ABSplant.sysj line: 381, column: 17
          System.out.println("LD");//sysj\ABSplant.sysj line: 381, column: 22
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        break;
      
    }
  }

  public void thread44764(int [] tdone, int [] ends){
        switch(S33858){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(LCE.getprestatus()){//sysj\ABSplant.sysj line: 379, column: 17
          System.out.println("LC");//sysj\ABSplant.sysj line: 379, column: 22
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        break;
      
    }
  }

  public void thread44763(int [] tdone, int [] ends){
        switch(S33850){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        if(LBE.getprestatus()){//sysj\ABSplant.sysj line: 377, column: 17
          System.out.println("LB");//sysj\ABSplant.sysj line: 377, column: 22
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread44762(int [] tdone, int [] ends){
        switch(S33842){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(LAE.getprestatus()){//sysj\ABSplant.sysj line: 375, column: 17
          System.out.println("LA");//sysj\ABSplant.sysj line: 375, column: 22
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        break;
      
    }
  }

  public void thread44761(int [] tdone, int [] ends){
        switch(S33932){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        thread44762(tdone,ends);
        thread44763(tdone,ends);
        thread44764(tdone,ends);
        thread44765(tdone,ends);
        thread44766(tdone,ends);
        thread44767(tdone,ends);
        thread44768(tdone,ends);
        thread44769(tdone,ends);
        thread44770(tdone,ends);
        thread44771(tdone,ends);
        thread44772(tdone,ends);
        thread44773(tdone,ends);
        int biggest44774 = 0;
        if(ends[41]>=biggest44774){
          biggest44774=ends[41];
        }
        if(ends[42]>=biggest44774){
          biggest44774=ends[42];
        }
        if(ends[43]>=biggest44774){
          biggest44774=ends[43];
        }
        if(ends[44]>=biggest44774){
          biggest44774=ends[44];
        }
        if(ends[45]>=biggest44774){
          biggest44774=ends[45];
        }
        if(ends[46]>=biggest44774){
          biggest44774=ends[46];
        }
        if(ends[47]>=biggest44774){
          biggest44774=ends[47];
        }
        if(ends[48]>=biggest44774){
          biggest44774=ends[48];
        }
        if(ends[49]>=biggest44774){
          biggest44774=ends[49];
        }
        if(ends[50]>=biggest44774){
          biggest44774=ends[50];
        }
        if(ends[51]>=biggest44774){
          biggest44774=ends[51];
        }
        if(ends[52]>=biggest44774){
          biggest44774=ends[52];
        }
        if(biggest44774 == 1){
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        //FINXME code
        if(biggest44774 == 0){
          S33932=0;
          active[40]=0;
          ends[40]=0;
          tdone[40]=1;
        }
        break;
      
    }
  }

  public void thread44760(int [] tdone, int [] ends){
        switch(S33834){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S33784){
          case 0 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 344, column: 11
              if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("left_limb")){//sysj\ABSplant.sysj line: 345, column: 5
                if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("limb_moveto")){//sysj\ABSplant.sysj line: 346, column: 6
                  if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("A")){//sysj\ABSplant.sysj line: 347, column: 7
                    LAE.setPresent();//sysj\ABSplant.sysj line: 348, column: 8
                    currsigs.addElement(LAE);
                    CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                    currsigs.addElement(CMDLfb);
                    S33784=1;
                    active[39]=1;
                    ends[39]=1;
                    tdone[39]=1;
                  }
                  else {
                    if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("B")){//sysj\ABSplant.sysj line: 349, column: 14
                      LBE.setPresent();//sysj\ABSplant.sysj line: 350, column: 8
                      currsigs.addElement(LBE);
                      CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                      currsigs.addElement(CMDLfb);
                      S33784=1;
                      active[39]=1;
                      ends[39]=1;
                      tdone[39]=1;
                    }
                    else {
                      if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("C")){//sysj\ABSplant.sysj line: 351, column: 14
                        LCE.setPresent();//sysj\ABSplant.sysj line: 352, column: 8
                        currsigs.addElement(LCE);
                        CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                        currsigs.addElement(CMDLfb);
                        S33784=1;
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      else {
                        if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("D")){//sysj\ABSplant.sysj line: 353, column: 14
                          LDE.setPresent();//sysj\ABSplant.sysj line: 354, column: 8
                          currsigs.addElement(LDE);
                          CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                          currsigs.addElement(CMDLfb);
                          S33784=1;
                          active[39]=1;
                          ends[39]=1;
                          tdone[39]=1;
                        }
                        else {
                          System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 356, column: 8
                          CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                          currsigs.addElement(CMDLfb);
                          S33784=1;
                          active[39]=1;
                          ends[39]=1;
                          tdone[39]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("limb_gripper")){//sysj\ABSplant.sysj line: 358, column: 13
                    if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("open")){//sysj\ABSplant.sysj line: 359, column: 7
                      LOE.setPresent();//sysj\ABSplant.sysj line: 360, column: 8
                      currsigs.addElement(LOE);
                      CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                      currsigs.addElement(CMDLfb);
                      S33784=1;
                      active[39]=1;
                      ends[39]=1;
                      tdone[39]=1;
                    }
                    else {
                      if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("close")){//sysj\ABSplant.sysj line: 361, column: 14
                        LGE.setPresent();//sysj\ABSplant.sysj line: 362, column: 8
                        currsigs.addElement(LGE);
                        CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                        currsigs.addElement(CMDLfb);
                        S33784=1;
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      else {
                        System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 364, column: 8
                        CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                        currsigs.addElement(CMDLfb);
                        S33784=1;
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                    }
                  }
                  else {
                    CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                    currsigs.addElement(CMDLfb);
                    S33784=1;
                    active[39]=1;
                    ends[39]=1;
                    tdone[39]=1;
                  }
                }
              }
              else {
                S33784=1;
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
            }
            else {
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
          case 1 : 
            S33784=1;
            S33784=0;
            if(CMDL.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 343, column: 12
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            else {
              S33784=1;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44759(int [] tdone, int [] ends){
        switch(S33760){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S33710){
          case 0 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 311, column: 11
              if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("right_limb")){//sysj\ABSplant.sysj line: 312, column: 5
                if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("limb_moveto")){//sysj\ABSplant.sysj line: 313, column: 6
                  if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("A")){//sysj\ABSplant.sysj line: 314, column: 7
                    RAE.setPresent();//sysj\ABSplant.sysj line: 315, column: 8
                    currsigs.addElement(RAE);
                    CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                    currsigs.addElement(CMDRfb);
                    S33710=1;
                    active[38]=1;
                    ends[38]=1;
                    tdone[38]=1;
                  }
                  else {
                    if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("B")){//sysj\ABSplant.sysj line: 316, column: 14
                      RBE.setPresent();//sysj\ABSplant.sysj line: 317, column: 8
                      currsigs.addElement(RBE);
                      CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                      currsigs.addElement(CMDRfb);
                      S33710=1;
                      active[38]=1;
                      ends[38]=1;
                      tdone[38]=1;
                    }
                    else {
                      if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("C")){//sysj\ABSplant.sysj line: 318, column: 14
                        RCE.setPresent();//sysj\ABSplant.sysj line: 319, column: 8
                        currsigs.addElement(RCE);
                        CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                        currsigs.addElement(CMDRfb);
                        S33710=1;
                        active[38]=1;
                        ends[38]=1;
                        tdone[38]=1;
                      }
                      else {
                        if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("D")){//sysj\ABSplant.sysj line: 320, column: 14
                          RDE.setPresent();//sysj\ABSplant.sysj line: 321, column: 8
                          currsigs.addElement(RDE);
                          CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                          currsigs.addElement(CMDRfb);
                          S33710=1;
                          active[38]=1;
                          ends[38]=1;
                          tdone[38]=1;
                        }
                        else {
                          System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 323, column: 8
                          CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                          currsigs.addElement(CMDRfb);
                          S33710=1;
                          active[38]=1;
                          ends[38]=1;
                          tdone[38]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("limb_gripper")){//sysj\ABSplant.sysj line: 325, column: 13
                    if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("open")){//sysj\ABSplant.sysj line: 326, column: 7
                      ROE.setPresent();//sysj\ABSplant.sysj line: 327, column: 8
                      currsigs.addElement(ROE);
                      CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                      currsigs.addElement(CMDRfb);
                      S33710=1;
                      active[38]=1;
                      ends[38]=1;
                      tdone[38]=1;
                    }
                    else {
                      if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("close")){//sysj\ABSplant.sysj line: 328, column: 14
                        RGE.setPresent();//sysj\ABSplant.sysj line: 329, column: 8
                        currsigs.addElement(RGE);
                        CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                        currsigs.addElement(CMDRfb);
                        S33710=1;
                        active[38]=1;
                        ends[38]=1;
                        tdone[38]=1;
                      }
                      else {
                        System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 331, column: 8
                        CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                        currsigs.addElement(CMDRfb);
                        S33710=1;
                        active[38]=1;
                        ends[38]=1;
                        tdone[38]=1;
                      }
                    }
                  }
                  else {
                    CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                    currsigs.addElement(CMDRfb);
                    S33710=1;
                    active[38]=1;
                    ends[38]=1;
                    tdone[38]=1;
                  }
                }
              }
              else {
                S33710=1;
                active[38]=1;
                ends[38]=1;
                tdone[38]=1;
              }
            }
            else {
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 1 : 
            S33710=1;
            S33710=0;
            if(CMDR.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 310, column: 12
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              S33710=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread44756(int [] tdone, int [] ends){
        S33930=1;
    if(RGE.getprestatus()){//sysj\ABSplant.sysj line: 397, column: 17
      System.out.println("RG");//sysj\ABSplant.sysj line: 397, column: 22
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread44755(int [] tdone, int [] ends){
        S33922=1;
    if(ROE.getprestatus()){//sysj\ABSplant.sysj line: 395, column: 17
      System.out.println("RO");//sysj\ABSplant.sysj line: 395, column: 22
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
  }

  public void thread44754(int [] tdone, int [] ends){
        S33914=1;
    if(RDE.getprestatus()){//sysj\ABSplant.sysj line: 393, column: 17
      System.out.println("RD");//sysj\ABSplant.sysj line: 393, column: 22
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread44753(int [] tdone, int [] ends){
        S33906=1;
    if(RCE.getprestatus()){//sysj\ABSplant.sysj line: 391, column: 17
      System.out.println("RC");//sysj\ABSplant.sysj line: 391, column: 22
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread44752(int [] tdone, int [] ends){
        S33898=1;
    if(RBE.getprestatus()){//sysj\ABSplant.sysj line: 389, column: 17
      System.out.println("RB");//sysj\ABSplant.sysj line: 389, column: 22
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread44751(int [] tdone, int [] ends){
        S33890=1;
    if(RAE.getprestatus()){//sysj\ABSplant.sysj line: 387, column: 17
      System.out.println("RA");//sysj\ABSplant.sysj line: 387, column: 22
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread44750(int [] tdone, int [] ends){
        S33882=1;
    if(LGE.getprestatus()){//sysj\ABSplant.sysj line: 385, column: 17
      System.out.println("LG");//sysj\ABSplant.sysj line: 385, column: 22
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread44749(int [] tdone, int [] ends){
        S33874=1;
    if(LOE.getprestatus()){//sysj\ABSplant.sysj line: 383, column: 17
      System.out.println("LO");//sysj\ABSplant.sysj line: 383, column: 22
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread44748(int [] tdone, int [] ends){
        S33866=1;
    if(LDE.getprestatus()){//sysj\ABSplant.sysj line: 381, column: 17
      System.out.println("LD");//sysj\ABSplant.sysj line: 381, column: 22
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread44747(int [] tdone, int [] ends){
        S33858=1;
    if(LCE.getprestatus()){//sysj\ABSplant.sysj line: 379, column: 17
      System.out.println("LC");//sysj\ABSplant.sysj line: 379, column: 22
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread44746(int [] tdone, int [] ends){
        S33850=1;
    if(LBE.getprestatus()){//sysj\ABSplant.sysj line: 377, column: 17
      System.out.println("LB");//sysj\ABSplant.sysj line: 377, column: 22
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread44745(int [] tdone, int [] ends){
        S33842=1;
    if(LAE.getprestatus()){//sysj\ABSplant.sysj line: 375, column: 17
      System.out.println("LA");//sysj\ABSplant.sysj line: 375, column: 22
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread44744(int [] tdone, int [] ends){
        S33932=1;
    thread44745(tdone,ends);
    thread44746(tdone,ends);
    thread44747(tdone,ends);
    thread44748(tdone,ends);
    thread44749(tdone,ends);
    thread44750(tdone,ends);
    thread44751(tdone,ends);
    thread44752(tdone,ends);
    thread44753(tdone,ends);
    thread44754(tdone,ends);
    thread44755(tdone,ends);
    thread44756(tdone,ends);
    int biggest44757 = 0;
    if(ends[41]>=biggest44757){
      biggest44757=ends[41];
    }
    if(ends[42]>=biggest44757){
      biggest44757=ends[42];
    }
    if(ends[43]>=biggest44757){
      biggest44757=ends[43];
    }
    if(ends[44]>=biggest44757){
      biggest44757=ends[44];
    }
    if(ends[45]>=biggest44757){
      biggest44757=ends[45];
    }
    if(ends[46]>=biggest44757){
      biggest44757=ends[46];
    }
    if(ends[47]>=biggest44757){
      biggest44757=ends[47];
    }
    if(ends[48]>=biggest44757){
      biggest44757=ends[48];
    }
    if(ends[49]>=biggest44757){
      biggest44757=ends[49];
    }
    if(ends[50]>=biggest44757){
      biggest44757=ends[50];
    }
    if(ends[51]>=biggest44757){
      biggest44757=ends[51];
    }
    if(ends[52]>=biggest44757){
      biggest44757=ends[52];
    }
    if(biggest44757 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread44743(int [] tdone, int [] ends){
        S33834=1;
    S33784=0;
    if(CMDL.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 343, column: 12
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S33784=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread44742(int [] tdone, int [] ends){
        S33760=1;
    S33710=0;
    if(CMDR.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 310, column: 12
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S33710=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S34180){
        case 0 : 
          S34180=0;
          break RUN;
        
        case 1 : 
          S34180=2;
          S34180=2;
          System.out.println("BaxterPlant");//sysj\ABSplant.sysj line: 306, column: 2
          thread44742(tdone,ends);
          thread44743(tdone,ends);
          thread44744(tdone,ends);
          int biggest44758 = 0;
          if(ends[38]>=biggest44758){
            biggest44758=ends[38];
          }
          if(ends[39]>=biggest44758){
            biggest44758=ends[39];
          }
          if(ends[40]>=biggest44758){
            biggest44758=ends[40];
          }
          if(biggest44758 == 1){
            active[37]=1;
            ends[37]=1;
            break RUN;
          }
        
        case 2 : 
          thread44759(tdone,ends);
          thread44760(tdone,ends);
          thread44761(tdone,ends);
          int biggest44775 = 0;
          if(ends[38]>=biggest44775){
            biggest44775=ends[38];
          }
          if(ends[39]>=biggest44775){
            biggest44775=ends[39];
          }
          if(ends[40]>=biggest44775){
            biggest44775=ends[40];
          }
          if(biggest44775 == 1){
            active[37]=1;
            ends[37]=1;
            break RUN;
          }
          //FINXME code
          if(biggest44775 == 0){
            S34180=0;
            active[37]=0;
            ends[37]=0;
            S34180=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[37] != 0){
      int index = 37;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[37]!=0 || suspended[37]!=0 || active[37]!=1);
      else{
        if(!df){
          CMDR.gethook();
          CMDL.gethook();
          enable.gethook();
          df = true;
        }
        runClockDomain();
      }
      CMDR.setpreclear();
      CMDL.setpreclear();
      enable.setpreclear();
      CMDRfb.setpreclear();
      CMDLfb.setpreclear();
      LAE.setpreclear();
      LBE.setpreclear();
      LCE.setpreclear();
      LDE.setpreclear();
      LOE.setpreclear();
      LGE.setpreclear();
      RAE.setpreclear();
      RBE.setpreclear();
      RCE.setpreclear();
      RDE.setpreclear();
      ROE.setpreclear();
      RGE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = CMDR.getStatus() ? CMDR.setprepresent() : CMDR.setpreclear();
      CMDR.setpreval(CMDR.getValue());
      CMDR.setClear();
      dummyint = CMDL.getStatus() ? CMDL.setprepresent() : CMDL.setpreclear();
      CMDL.setpreval(CMDL.getValue());
      CMDL.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      CMDRfb.sethook();
      CMDRfb.setClear();
      CMDLfb.sethook();
      CMDLfb.setClear();
      LAE.sethook();
      LAE.setClear();
      LBE.sethook();
      LBE.setClear();
      LCE.sethook();
      LCE.setClear();
      LDE.sethook();
      LDE.setClear();
      LOE.sethook();
      LOE.setClear();
      LGE.sethook();
      LGE.setClear();
      RAE.sethook();
      RAE.setClear();
      RBE.sethook();
      RBE.setClear();
      RCE.sethook();
      RCE.setClear();
      RDE.sethook();
      RDE.setClear();
      ROE.sethook();
      ROE.setClear();
      RGE.sethook();
      RGE.setClear();
      if(paused[37]!=0 || suspended[37]!=0 || active[37]!=1);
      else{
        CMDR.gethook();
        CMDL.gethook();
        enable.gethook();
      }
      runFinisher();
      if(active[37] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
