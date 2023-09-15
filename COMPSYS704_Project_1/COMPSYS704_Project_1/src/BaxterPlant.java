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
  private int S46715 = 1;
  private int S46295 = 1;
  private int S46245 = 1;
  private int S46369 = 1;
  private int S46319 = 1;
  private int S46467 = 1;
  private int S46377 = 1;
  private int S46385 = 1;
  private int S46393 = 1;
  private int S46401 = 1;
  private int S46409 = 1;
  private int S46417 = 1;
  private int S46425 = 1;
  private int S46433 = 1;
  private int S46441 = 1;
  private int S46449 = 1;
  private int S46457 = 1;
  private int S46465 = 1;
  
  private int[] ends = new int[96];
  private int[] tdone = new int[96];
  
  public void thread57354(int [] tdone, int [] ends){
        switch(S46465){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        if(RGE.getprestatus()){//sysj\ABSplant.sysj line: 671, column: 17
          System.out.println("RG");//sysj\ABSplant.sysj line: 671, column: 22
          active[74]=1;
          ends[74]=1;
          tdone[74]=1;
        }
        else {
          active[74]=1;
          ends[74]=1;
          tdone[74]=1;
        }
        break;
      
    }
  }

  public void thread57353(int [] tdone, int [] ends){
        switch(S46457){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        if(ROE.getprestatus()){//sysj\ABSplant.sysj line: 669, column: 17
          System.out.println("RO");//sysj\ABSplant.sysj line: 669, column: 22
          active[73]=1;
          ends[73]=1;
          tdone[73]=1;
        }
        else {
          active[73]=1;
          ends[73]=1;
          tdone[73]=1;
        }
        break;
      
    }
  }

  public void thread57352(int [] tdone, int [] ends){
        switch(S46449){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        if(RDE.getprestatus()){//sysj\ABSplant.sysj line: 667, column: 17
          System.out.println("RD");//sysj\ABSplant.sysj line: 667, column: 22
          active[72]=1;
          ends[72]=1;
          tdone[72]=1;
        }
        else {
          active[72]=1;
          ends[72]=1;
          tdone[72]=1;
        }
        break;
      
    }
  }

  public void thread57351(int [] tdone, int [] ends){
        switch(S46441){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        if(RCE.getprestatus()){//sysj\ABSplant.sysj line: 665, column: 17
          System.out.println("RC");//sysj\ABSplant.sysj line: 665, column: 22
          active[71]=1;
          ends[71]=1;
          tdone[71]=1;
        }
        else {
          active[71]=1;
          ends[71]=1;
          tdone[71]=1;
        }
        break;
      
    }
  }

  public void thread57350(int [] tdone, int [] ends){
        switch(S46433){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        if(RBE.getprestatus()){//sysj\ABSplant.sysj line: 663, column: 17
          System.out.println("RB");//sysj\ABSplant.sysj line: 663, column: 22
          active[70]=1;
          ends[70]=1;
          tdone[70]=1;
        }
        else {
          active[70]=1;
          ends[70]=1;
          tdone[70]=1;
        }
        break;
      
    }
  }

  public void thread57349(int [] tdone, int [] ends){
        switch(S46425){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        if(RAE.getprestatus()){//sysj\ABSplant.sysj line: 661, column: 17
          System.out.println("RA");//sysj\ABSplant.sysj line: 661, column: 22
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
        break;
      
    }
  }

  public void thread57348(int [] tdone, int [] ends){
        switch(S46417){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        if(LGE.getprestatus()){//sysj\ABSplant.sysj line: 659, column: 17
          System.out.println("LG");//sysj\ABSplant.sysj line: 659, column: 22
          active[68]=1;
          ends[68]=1;
          tdone[68]=1;
        }
        else {
          active[68]=1;
          ends[68]=1;
          tdone[68]=1;
        }
        break;
      
    }
  }

  public void thread57347(int [] tdone, int [] ends){
        switch(S46409){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        if(LOE.getprestatus()){//sysj\ABSplant.sysj line: 657, column: 17
          System.out.println("LO");//sysj\ABSplant.sysj line: 657, column: 22
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
        else {
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
        break;
      
    }
  }

  public void thread57346(int [] tdone, int [] ends){
        switch(S46401){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        if(LDE.getprestatus()){//sysj\ABSplant.sysj line: 655, column: 17
          System.out.println("LD");//sysj\ABSplant.sysj line: 655, column: 22
          active[66]=1;
          ends[66]=1;
          tdone[66]=1;
        }
        else {
          active[66]=1;
          ends[66]=1;
          tdone[66]=1;
        }
        break;
      
    }
  }

  public void thread57345(int [] tdone, int [] ends){
        switch(S46393){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        if(LCE.getprestatus()){//sysj\ABSplant.sysj line: 653, column: 17
          System.out.println("LC");//sysj\ABSplant.sysj line: 653, column: 22
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
        else {
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
        break;
      
    }
  }

  public void thread57344(int [] tdone, int [] ends){
        switch(S46385){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        if(LBE.getprestatus()){//sysj\ABSplant.sysj line: 651, column: 17
          System.out.println("LB");//sysj\ABSplant.sysj line: 651, column: 22
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        else {
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        break;
      
    }
  }

  public void thread57343(int [] tdone, int [] ends){
        switch(S46377){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        if(LAE.getprestatus()){//sysj\ABSplant.sysj line: 649, column: 17
          System.out.println("LA");//sysj\ABSplant.sysj line: 649, column: 22
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
        else {
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
        break;
      
    }
  }

  public void thread57342(int [] tdone, int [] ends){
        switch(S46467){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        thread57343(tdone,ends);
        thread57344(tdone,ends);
        thread57345(tdone,ends);
        thread57346(tdone,ends);
        thread57347(tdone,ends);
        thread57348(tdone,ends);
        thread57349(tdone,ends);
        thread57350(tdone,ends);
        thread57351(tdone,ends);
        thread57352(tdone,ends);
        thread57353(tdone,ends);
        thread57354(tdone,ends);
        int biggest57355 = 0;
        if(ends[63]>=biggest57355){
          biggest57355=ends[63];
        }
        if(ends[64]>=biggest57355){
          biggest57355=ends[64];
        }
        if(ends[65]>=biggest57355){
          biggest57355=ends[65];
        }
        if(ends[66]>=biggest57355){
          biggest57355=ends[66];
        }
        if(ends[67]>=biggest57355){
          biggest57355=ends[67];
        }
        if(ends[68]>=biggest57355){
          biggest57355=ends[68];
        }
        if(ends[69]>=biggest57355){
          biggest57355=ends[69];
        }
        if(ends[70]>=biggest57355){
          biggest57355=ends[70];
        }
        if(ends[71]>=biggest57355){
          biggest57355=ends[71];
        }
        if(ends[72]>=biggest57355){
          biggest57355=ends[72];
        }
        if(ends[73]>=biggest57355){
          biggest57355=ends[73];
        }
        if(ends[74]>=biggest57355){
          biggest57355=ends[74];
        }
        if(biggest57355 == 1){
          active[62]=1;
          ends[62]=1;
          tdone[62]=1;
        }
        //FINXME code
        if(biggest57355 == 0){
          S46467=0;
          active[62]=0;
          ends[62]=0;
          tdone[62]=1;
        }
        break;
      
    }
  }

  public void thread57341(int [] tdone, int [] ends){
        switch(S46369){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        switch(S46319){
          case 0 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 618, column: 11
              if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("left_limb")){//sysj\ABSplant.sysj line: 619, column: 5
                if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("limb_moveto")){//sysj\ABSplant.sysj line: 620, column: 6
                  if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("A")){//sysj\ABSplant.sysj line: 621, column: 7
                    LAE.setPresent();//sysj\ABSplant.sysj line: 622, column: 8
                    currsigs.addElement(LAE);
                    CMDLfb.setPresent();//sysj\ABSplant.sysj line: 641, column: 6
                    currsigs.addElement(CMDLfb);
                    S46319=1;
                    active[61]=1;
                    ends[61]=1;
                    tdone[61]=1;
                  }
                  else {
                    if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("B")){//sysj\ABSplant.sysj line: 623, column: 14
                      LBE.setPresent();//sysj\ABSplant.sysj line: 624, column: 8
                      currsigs.addElement(LBE);
                      CMDLfb.setPresent();//sysj\ABSplant.sysj line: 641, column: 6
                      currsigs.addElement(CMDLfb);
                      S46319=1;
                      active[61]=1;
                      ends[61]=1;
                      tdone[61]=1;
                    }
                    else {
                      if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("C")){//sysj\ABSplant.sysj line: 625, column: 14
                        LCE.setPresent();//sysj\ABSplant.sysj line: 626, column: 8
                        currsigs.addElement(LCE);
                        CMDLfb.setPresent();//sysj\ABSplant.sysj line: 641, column: 6
                        currsigs.addElement(CMDLfb);
                        S46319=1;
                        active[61]=1;
                        ends[61]=1;
                        tdone[61]=1;
                      }
                      else {
                        if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("D")){//sysj\ABSplant.sysj line: 627, column: 14
                          LDE.setPresent();//sysj\ABSplant.sysj line: 628, column: 8
                          currsigs.addElement(LDE);
                          CMDLfb.setPresent();//sysj\ABSplant.sysj line: 641, column: 6
                          currsigs.addElement(CMDLfb);
                          S46319=1;
                          active[61]=1;
                          ends[61]=1;
                          tdone[61]=1;
                        }
                        else {
                          System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 630, column: 8
                          CMDLfb.setPresent();//sysj\ABSplant.sysj line: 641, column: 6
                          currsigs.addElement(CMDLfb);
                          S46319=1;
                          active[61]=1;
                          ends[61]=1;
                          tdone[61]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("limb_gripper")){//sysj\ABSplant.sysj line: 632, column: 13
                    if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("open")){//sysj\ABSplant.sysj line: 633, column: 7
                      LOE.setPresent();//sysj\ABSplant.sysj line: 634, column: 8
                      currsigs.addElement(LOE);
                      CMDLfb.setPresent();//sysj\ABSplant.sysj line: 641, column: 6
                      currsigs.addElement(CMDLfb);
                      S46319=1;
                      active[61]=1;
                      ends[61]=1;
                      tdone[61]=1;
                    }
                    else {
                      if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("close")){//sysj\ABSplant.sysj line: 635, column: 14
                        LGE.setPresent();//sysj\ABSplant.sysj line: 636, column: 8
                        currsigs.addElement(LGE);
                        CMDLfb.setPresent();//sysj\ABSplant.sysj line: 641, column: 6
                        currsigs.addElement(CMDLfb);
                        S46319=1;
                        active[61]=1;
                        ends[61]=1;
                        tdone[61]=1;
                      }
                      else {
                        System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 638, column: 8
                        CMDLfb.setPresent();//sysj\ABSplant.sysj line: 641, column: 6
                        currsigs.addElement(CMDLfb);
                        S46319=1;
                        active[61]=1;
                        ends[61]=1;
                        tdone[61]=1;
                      }
                    }
                  }
                  else {
                    CMDLfb.setPresent();//sysj\ABSplant.sysj line: 641, column: 6
                    currsigs.addElement(CMDLfb);
                    S46319=1;
                    active[61]=1;
                    ends[61]=1;
                    tdone[61]=1;
                  }
                }
              }
              else {
                S46319=1;
                active[61]=1;
                ends[61]=1;
                tdone[61]=1;
              }
            }
            else {
              active[61]=1;
              ends[61]=1;
              tdone[61]=1;
            }
            break;
          
          case 1 : 
            S46319=1;
            S46319=0;
            if(CMDL.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 617, column: 12
              active[61]=1;
              ends[61]=1;
              tdone[61]=1;
            }
            else {
              S46319=1;
              active[61]=1;
              ends[61]=1;
              tdone[61]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57340(int [] tdone, int [] ends){
        switch(S46295){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        switch(S46245){
          case 0 : 
            if(!enable.getprestatus()){//sysj\ABSplant.sysj line: 585, column: 11
              if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("right_limb")){//sysj\ABSplant.sysj line: 586, column: 5
                if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("limb_moveto")){//sysj\ABSplant.sysj line: 587, column: 6
                  if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("A")){//sysj\ABSplant.sysj line: 588, column: 7
                    RAE.setPresent();//sysj\ABSplant.sysj line: 589, column: 8
                    currsigs.addElement(RAE);
                    CMDRfb.setPresent();//sysj\ABSplant.sysj line: 608, column: 6
                    currsigs.addElement(CMDRfb);
                    S46245=1;
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                  else {
                    if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("B")){//sysj\ABSplant.sysj line: 590, column: 14
                      RBE.setPresent();//sysj\ABSplant.sysj line: 591, column: 8
                      currsigs.addElement(RBE);
                      CMDRfb.setPresent();//sysj\ABSplant.sysj line: 608, column: 6
                      currsigs.addElement(CMDRfb);
                      S46245=1;
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                    else {
                      if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("C")){//sysj\ABSplant.sysj line: 592, column: 14
                        RCE.setPresent();//sysj\ABSplant.sysj line: 593, column: 8
                        currsigs.addElement(RCE);
                        CMDRfb.setPresent();//sysj\ABSplant.sysj line: 608, column: 6
                        currsigs.addElement(CMDRfb);
                        S46245=1;
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                      else {
                        if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("D")){//sysj\ABSplant.sysj line: 594, column: 14
                          RDE.setPresent();//sysj\ABSplant.sysj line: 595, column: 8
                          currsigs.addElement(RDE);
                          CMDRfb.setPresent();//sysj\ABSplant.sysj line: 608, column: 6
                          currsigs.addElement(CMDRfb);
                          S46245=1;
                          active[60]=1;
                          ends[60]=1;
                          tdone[60]=1;
                        }
                        else {
                          System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 597, column: 8
                          CMDRfb.setPresent();//sysj\ABSplant.sysj line: 608, column: 6
                          currsigs.addElement(CMDRfb);
                          S46245=1;
                          active[60]=1;
                          ends[60]=1;
                          tdone[60]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("limb_gripper")){//sysj\ABSplant.sysj line: 599, column: 13
                    if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("open")){//sysj\ABSplant.sysj line: 600, column: 7
                      ROE.setPresent();//sysj\ABSplant.sysj line: 601, column: 8
                      currsigs.addElement(ROE);
                      CMDRfb.setPresent();//sysj\ABSplant.sysj line: 608, column: 6
                      currsigs.addElement(CMDRfb);
                      S46245=1;
                      active[60]=1;
                      ends[60]=1;
                      tdone[60]=1;
                    }
                    else {
                      if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("close")){//sysj\ABSplant.sysj line: 602, column: 14
                        RGE.setPresent();//sysj\ABSplant.sysj line: 603, column: 8
                        currsigs.addElement(RGE);
                        CMDRfb.setPresent();//sysj\ABSplant.sysj line: 608, column: 6
                        currsigs.addElement(CMDRfb);
                        S46245=1;
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                      else {
                        System.err.println("Incorrect position argument");//sysj\ABSplant.sysj line: 605, column: 8
                        CMDRfb.setPresent();//sysj\ABSplant.sysj line: 608, column: 6
                        currsigs.addElement(CMDRfb);
                        S46245=1;
                        active[60]=1;
                        ends[60]=1;
                        tdone[60]=1;
                      }
                    }
                  }
                  else {
                    CMDRfb.setPresent();//sysj\ABSplant.sysj line: 608, column: 6
                    currsigs.addElement(CMDRfb);
                    S46245=1;
                    active[60]=1;
                    ends[60]=1;
                    tdone[60]=1;
                  }
                }
              }
              else {
                S46245=1;
                active[60]=1;
                ends[60]=1;
                tdone[60]=1;
              }
            }
            else {
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            break;
          
          case 1 : 
            S46245=1;
            S46245=0;
            if(CMDR.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 584, column: 12
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            else {
              S46245=1;
              active[60]=1;
              ends[60]=1;
              tdone[60]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread57337(int [] tdone, int [] ends){
        S46465=1;
    if(RGE.getprestatus()){//sysj\ABSplant.sysj line: 671, column: 17
      System.out.println("RG");//sysj\ABSplant.sysj line: 671, column: 22
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread57336(int [] tdone, int [] ends){
        S46457=1;
    if(ROE.getprestatus()){//sysj\ABSplant.sysj line: 669, column: 17
      System.out.println("RO");//sysj\ABSplant.sysj line: 669, column: 22
      active[73]=1;
      ends[73]=1;
      tdone[73]=1;
    }
    else {
      active[73]=1;
      ends[73]=1;
      tdone[73]=1;
    }
  }

  public void thread57335(int [] tdone, int [] ends){
        S46449=1;
    if(RDE.getprestatus()){//sysj\ABSplant.sysj line: 667, column: 17
      System.out.println("RD");//sysj\ABSplant.sysj line: 667, column: 22
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
    else {
      active[72]=1;
      ends[72]=1;
      tdone[72]=1;
    }
  }

  public void thread57334(int [] tdone, int [] ends){
        S46441=1;
    if(RCE.getprestatus()){//sysj\ABSplant.sysj line: 665, column: 17
      System.out.println("RC");//sysj\ABSplant.sysj line: 665, column: 22
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
    else {
      active[71]=1;
      ends[71]=1;
      tdone[71]=1;
    }
  }

  public void thread57333(int [] tdone, int [] ends){
        S46433=1;
    if(RBE.getprestatus()){//sysj\ABSplant.sysj line: 663, column: 17
      System.out.println("RB");//sysj\ABSplant.sysj line: 663, column: 22
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
    else {
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread57332(int [] tdone, int [] ends){
        S46425=1;
    if(RAE.getprestatus()){//sysj\ABSplant.sysj line: 661, column: 17
      System.out.println("RA");//sysj\ABSplant.sysj line: 661, column: 22
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread57331(int [] tdone, int [] ends){
        S46417=1;
    if(LGE.getprestatus()){//sysj\ABSplant.sysj line: 659, column: 17
      System.out.println("LG");//sysj\ABSplant.sysj line: 659, column: 22
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
    else {
      active[68]=1;
      ends[68]=1;
      tdone[68]=1;
    }
  }

  public void thread57330(int [] tdone, int [] ends){
        S46409=1;
    if(LOE.getprestatus()){//sysj\ABSplant.sysj line: 657, column: 17
      System.out.println("LO");//sysj\ABSplant.sysj line: 657, column: 22
      active[67]=1;
      ends[67]=1;
      tdone[67]=1;
    }
    else {
      active[67]=1;
      ends[67]=1;
      tdone[67]=1;
    }
  }

  public void thread57329(int [] tdone, int [] ends){
        S46401=1;
    if(LDE.getprestatus()){//sysj\ABSplant.sysj line: 655, column: 17
      System.out.println("LD");//sysj\ABSplant.sysj line: 655, column: 22
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
    else {
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
  }

  public void thread57328(int [] tdone, int [] ends){
        S46393=1;
    if(LCE.getprestatus()){//sysj\ABSplant.sysj line: 653, column: 17
      System.out.println("LC");//sysj\ABSplant.sysj line: 653, column: 22
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
    else {
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
  }

  public void thread57327(int [] tdone, int [] ends){
        S46385=1;
    if(LBE.getprestatus()){//sysj\ABSplant.sysj line: 651, column: 17
      System.out.println("LB");//sysj\ABSplant.sysj line: 651, column: 22
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
    else {
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread57326(int [] tdone, int [] ends){
        S46377=1;
    if(LAE.getprestatus()){//sysj\ABSplant.sysj line: 649, column: 17
      System.out.println("LA");//sysj\ABSplant.sysj line: 649, column: 22
      active[63]=1;
      ends[63]=1;
      tdone[63]=1;
    }
    else {
      active[63]=1;
      ends[63]=1;
      tdone[63]=1;
    }
  }

  public void thread57325(int [] tdone, int [] ends){
        S46467=1;
    thread57326(tdone,ends);
    thread57327(tdone,ends);
    thread57328(tdone,ends);
    thread57329(tdone,ends);
    thread57330(tdone,ends);
    thread57331(tdone,ends);
    thread57332(tdone,ends);
    thread57333(tdone,ends);
    thread57334(tdone,ends);
    thread57335(tdone,ends);
    thread57336(tdone,ends);
    thread57337(tdone,ends);
    int biggest57338 = 0;
    if(ends[63]>=biggest57338){
      biggest57338=ends[63];
    }
    if(ends[64]>=biggest57338){
      biggest57338=ends[64];
    }
    if(ends[65]>=biggest57338){
      biggest57338=ends[65];
    }
    if(ends[66]>=biggest57338){
      biggest57338=ends[66];
    }
    if(ends[67]>=biggest57338){
      biggest57338=ends[67];
    }
    if(ends[68]>=biggest57338){
      biggest57338=ends[68];
    }
    if(ends[69]>=biggest57338){
      biggest57338=ends[69];
    }
    if(ends[70]>=biggest57338){
      biggest57338=ends[70];
    }
    if(ends[71]>=biggest57338){
      biggest57338=ends[71];
    }
    if(ends[72]>=biggest57338){
      biggest57338=ends[72];
    }
    if(ends[73]>=biggest57338){
      biggest57338=ends[73];
    }
    if(ends[74]>=biggest57338){
      biggest57338=ends[74];
    }
    if(biggest57338 == 1){
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread57324(int [] tdone, int [] ends){
        S46369=1;
    S46319=0;
    if(CMDL.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 617, column: 12
      active[61]=1;
      ends[61]=1;
      tdone[61]=1;
    }
    else {
      S46319=1;
      active[61]=1;
      ends[61]=1;
      tdone[61]=1;
    }
  }

  public void thread57323(int [] tdone, int [] ends){
        S46295=1;
    S46245=0;
    if(CMDR.getprestatus() && enable.getprestatus()){//sysj\ABSplant.sysj line: 584, column: 12
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
    else {
      S46245=1;
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S46715){
        case 0 : 
          S46715=0;
          break RUN;
        
        case 1 : 
          S46715=2;
          S46715=2;
          System.out.println("BaxterPlant");//sysj\ABSplant.sysj line: 580, column: 2
          thread57323(tdone,ends);
          thread57324(tdone,ends);
          thread57325(tdone,ends);
          int biggest57339 = 0;
          if(ends[60]>=biggest57339){
            biggest57339=ends[60];
          }
          if(ends[61]>=biggest57339){
            biggest57339=ends[61];
          }
          if(ends[62]>=biggest57339){
            biggest57339=ends[62];
          }
          if(biggest57339 == 1){
            active[59]=1;
            ends[59]=1;
            break RUN;
          }
        
        case 2 : 
          thread57340(tdone,ends);
          thread57341(tdone,ends);
          thread57342(tdone,ends);
          int biggest57356 = 0;
          if(ends[60]>=biggest57356){
            biggest57356=ends[60];
          }
          if(ends[61]>=biggest57356){
            biggest57356=ends[61];
          }
          if(ends[62]>=biggest57356){
            biggest57356=ends[62];
          }
          if(biggest57356 == 1){
            active[59]=1;
            ends[59]=1;
            break RUN;
          }
          //FINXME code
          if(biggest57356 == 0){
            S46715=0;
            active[59]=0;
            ends[59]=0;
            S46715=0;
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
    while(active[59] != 0){
      int index = 59;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[59]!=0 || suspended[59]!=0 || active[59]!=1);
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
      if(paused[59]!=0 || suspended[59]!=0 || active[59]!=1);
      else{
        CMDR.gethook();
        CMDL.gethook();
        enable.gethook();
      }
      runFinisher();
      if(active[59] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
