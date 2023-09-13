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
  private int S34174 = 1;
  private int S33755 = 1;
  private int S33705 = 1;
  private int S33829 = 1;
  private int S33779 = 1;
  private int S33927 = 1;
  private int S33837 = 1;
  private int S33845 = 1;
  private int S33853 = 1;
  private int S33861 = 1;
  private int S33869 = 1;
  private int S33877 = 1;
  private int S33885 = 1;
  private int S33893 = 1;
  private int S33901 = 1;
  private int S33909 = 1;
  private int S33917 = 1;
  private int S33925 = 1;
  
  private int[] ends = new int[53];
  private int[] tdone = new int[53];
  
  public void thread34283(int [] tdone, int [] ends){
        switch(S33925){
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

  public void thread34282(int [] tdone, int [] ends){
        switch(S33917){
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

  public void thread34281(int [] tdone, int [] ends){
        switch(S33909){
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

  public void thread34280(int [] tdone, int [] ends){
        switch(S33901){
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

  public void thread34279(int [] tdone, int [] ends){
        switch(S33893){
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

  public void thread34278(int [] tdone, int [] ends){
        switch(S33885){
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

  public void thread34277(int [] tdone, int [] ends){
        switch(S33877){
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

  public void thread34276(int [] tdone, int [] ends){
        switch(S33869){
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

  public void thread34275(int [] tdone, int [] ends){
        switch(S33861){
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

  public void thread34274(int [] tdone, int [] ends){
        switch(S33853){
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

  public void thread34273(int [] tdone, int [] ends){
        switch(S33845){
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

  public void thread34272(int [] tdone, int [] ends){
        switch(S33837){
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

  public void thread34271(int [] tdone, int [] ends){
        switch(S33927){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        thread34272(tdone,ends);
        thread34273(tdone,ends);
        thread34274(tdone,ends);
        thread34275(tdone,ends);
        thread34276(tdone,ends);
        thread34277(tdone,ends);
        thread34278(tdone,ends);
        thread34279(tdone,ends);
        thread34280(tdone,ends);
        thread34281(tdone,ends);
        thread34282(tdone,ends);
        thread34283(tdone,ends);
        int biggest34284 = 0;
        if(ends[41]>=biggest34284){
          biggest34284=ends[41];
        }
        if(ends[42]>=biggest34284){
          biggest34284=ends[42];
        }
        if(ends[43]>=biggest34284){
          biggest34284=ends[43];
        }
        if(ends[44]>=biggest34284){
          biggest34284=ends[44];
        }
        if(ends[45]>=biggest34284){
          biggest34284=ends[45];
        }
        if(ends[46]>=biggest34284){
          biggest34284=ends[46];
        }
        if(ends[47]>=biggest34284){
          biggest34284=ends[47];
        }
        if(ends[48]>=biggest34284){
          biggest34284=ends[48];
        }
        if(ends[49]>=biggest34284){
          biggest34284=ends[49];
        }
        if(ends[50]>=biggest34284){
          biggest34284=ends[50];
        }
        if(ends[51]>=biggest34284){
          biggest34284=ends[51];
        }
        if(ends[52]>=biggest34284){
          biggest34284=ends[52];
        }
        if(biggest34284 == 1){
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        //FINXME code
        if(biggest34284 == 0){
          S33927=0;
          active[40]=0;
          ends[40]=0;
          tdone[40]=1;
        }
        break;
      
    }
  }

  public void thread34270(int [] tdone, int [] ends){
        switch(S33829){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S33779){
          case 0 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 344, column: 11
              if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("left_limb")){//sysj\ABSplant.sysj line: 345, column: 5
                if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("limb_moveto")){//sysj\ABSplant.sysj line: 346, column: 6
                  if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("A")){//sysj\ABSplant.sysj line: 347, column: 7
                    LAE.setPresent();//sysj\ABSplant.sysj line: 348, column: 8
                    currsigs.addElement(LAE);
                    CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                    currsigs.addElement(CMDLfb);
                    S33779=1;
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
                      S33779=1;
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
                        S33779=1;
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
                          S33779=1;
                          active[39]=1;
                          ends[39]=1;
                          tdone[39]=1;
                        }
                        else {
                          System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 356, column: 8
                          CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                          currsigs.addElement(CMDLfb);
                          S33779=1;
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
                      S33779=1;
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
                        S33779=1;
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      else {
                        System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 364, column: 8
                        CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                        currsigs.addElement(CMDLfb);
                        S33779=1;
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                    }
                  }
                  else {
                    CMDLfb.setPresent();//sysj\ABSplant.sysj line: 367, column: 6
                    currsigs.addElement(CMDLfb);
                    S33779=1;
                    active[39]=1;
                    ends[39]=1;
                    tdone[39]=1;
                  }
                }
              }
              else {
                S33779=1;
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
            S33779=1;
            S33779=0;
            if(CMDL.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 343, column: 12
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            else {
              S33779=1;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread34269(int [] tdone, int [] ends){
        switch(S33755){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S33705){
          case 0 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 311, column: 11
              if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("right_limb")){//sysj\ABSplant.sysj line: 312, column: 5
                if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("limb_moveto")){//sysj\ABSplant.sysj line: 313, column: 6
                  if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("A")){//sysj\ABSplant.sysj line: 314, column: 7
                    RAE.setPresent();//sysj\ABSplant.sysj line: 315, column: 8
                    currsigs.addElement(RAE);
                    CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                    currsigs.addElement(CMDRfb);
                    S33705=1;
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
                      S33705=1;
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
                        S33705=1;
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
                          S33705=1;
                          active[38]=1;
                          ends[38]=1;
                          tdone[38]=1;
                        }
                        else {
                          System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 323, column: 8
                          CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                          currsigs.addElement(CMDRfb);
                          S33705=1;
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
                      S33705=1;
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
                        S33705=1;
                        active[38]=1;
                        ends[38]=1;
                        tdone[38]=1;
                      }
                      else {
                        System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 331, column: 8
                        CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                        currsigs.addElement(CMDRfb);
                        S33705=1;
                        active[38]=1;
                        ends[38]=1;
                        tdone[38]=1;
                      }
                    }
                  }
                  else {
                    CMDRfb.setPresent();//sysj\ABSplant.sysj line: 334, column: 6
                    currsigs.addElement(CMDRfb);
                    S33705=1;
                    active[38]=1;
                    ends[38]=1;
                    tdone[38]=1;
                  }
                }
              }
              else {
                S33705=1;
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
            S33705=1;
            S33705=0;
            if(CMDR.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 310, column: 12
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            else {
              S33705=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread34266(int [] tdone, int [] ends){
        S33925=1;
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

  public void thread34265(int [] tdone, int [] ends){
        S33917=1;
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

  public void thread34264(int [] tdone, int [] ends){
        S33909=1;
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

  public void thread34263(int [] tdone, int [] ends){
        S33901=1;
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

  public void thread34262(int [] tdone, int [] ends){
        S33893=1;
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

  public void thread34261(int [] tdone, int [] ends){
        S33885=1;
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

  public void thread34260(int [] tdone, int [] ends){
        S33877=1;
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

  public void thread34259(int [] tdone, int [] ends){
        S33869=1;
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

  public void thread34258(int [] tdone, int [] ends){
        S33861=1;
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

  public void thread34257(int [] tdone, int [] ends){
        S33853=1;
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

  public void thread34256(int [] tdone, int [] ends){
        S33845=1;
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

  public void thread34255(int [] tdone, int [] ends){
        S33837=1;
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

  public void thread34254(int [] tdone, int [] ends){
        S33927=1;
    thread34255(tdone,ends);
    thread34256(tdone,ends);
    thread34257(tdone,ends);
    thread34258(tdone,ends);
    thread34259(tdone,ends);
    thread34260(tdone,ends);
    thread34261(tdone,ends);
    thread34262(tdone,ends);
    thread34263(tdone,ends);
    thread34264(tdone,ends);
    thread34265(tdone,ends);
    thread34266(tdone,ends);
    int biggest34267 = 0;
    if(ends[41]>=biggest34267){
      biggest34267=ends[41];
    }
    if(ends[42]>=biggest34267){
      biggest34267=ends[42];
    }
    if(ends[43]>=biggest34267){
      biggest34267=ends[43];
    }
    if(ends[44]>=biggest34267){
      biggest34267=ends[44];
    }
    if(ends[45]>=biggest34267){
      biggest34267=ends[45];
    }
    if(ends[46]>=biggest34267){
      biggest34267=ends[46];
    }
    if(ends[47]>=biggest34267){
      biggest34267=ends[47];
    }
    if(ends[48]>=biggest34267){
      biggest34267=ends[48];
    }
    if(ends[49]>=biggest34267){
      biggest34267=ends[49];
    }
    if(ends[50]>=biggest34267){
      biggest34267=ends[50];
    }
    if(ends[51]>=biggest34267){
      biggest34267=ends[51];
    }
    if(ends[52]>=biggest34267){
      biggest34267=ends[52];
    }
    if(biggest34267 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread34253(int [] tdone, int [] ends){
        S33829=1;
    S33779=0;
    if(CMDL.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 343, column: 12
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S33779=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread34252(int [] tdone, int [] ends){
        S33755=1;
    S33705=0;
    if(CMDR.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 310, column: 12
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S33705=1;
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
      switch(S34174){
        case 0 : 
          S34174=0;
          break RUN;
        
        case 1 : 
          S34174=2;
          S34174=2;
          System.out.println("BaxterPlant");//sysj\ABSplant.sysj line: 306, column: 2
          new Thread(new GUI()).start();//sysj\ABSplant.sysj line: 307, column: 2
          thread34252(tdone,ends);
          thread34253(tdone,ends);
          thread34254(tdone,ends);
          int biggest34268 = 0;
          if(ends[38]>=biggest34268){
            biggest34268=ends[38];
          }
          if(ends[39]>=biggest34268){
            biggest34268=ends[39];
          }
          if(ends[40]>=biggest34268){
            biggest34268=ends[40];
          }
          if(biggest34268 == 1){
            active[37]=1;
            ends[37]=1;
            break RUN;
          }
        
        case 2 : 
          thread34269(tdone,ends);
          thread34270(tdone,ends);
          thread34271(tdone,ends);
          int biggest34285 = 0;
          if(ends[38]>=biggest34285){
            biggest34285=ends[38];
          }
          if(ends[39]>=biggest34285){
            biggest34285=ends[39];
          }
          if(ends[40]>=biggest34285){
            biggest34285=ends[40];
          }
          if(biggest34285 == 1){
            active[37]=1;
            ends[37]=1;
            break RUN;
          }
          //FINXME code
          if(biggest34285 == 0){
            S34174=0;
            active[37]=0;
            ends[37]=0;
            S34174=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
