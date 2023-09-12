import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1
import org.compsys704.*;//sysj\plant.sysj line: 2, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
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
  private int S882 = 1;
  private int S462 = 1;
  private int S412 = 1;
  private int S536 = 1;
  private int S486 = 1;
  private int S634 = 1;
  private int S544 = 1;
  private int S552 = 1;
  private int S560 = 1;
  private int S568 = 1;
  private int S576 = 1;
  private int S584 = 1;
  private int S592 = 1;
  private int S600 = 1;
  private int S608 = 1;
  private int S616 = 1;
  private int S624 = 1;
  private int S632 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread915(int [] tdone, int [] ends){
        switch(S632){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(RGE.getprestatus()){//sysj\plant.sysj line: 104, column: 17
          System.out.println("RG");//sysj\plant.sysj line: 104, column: 22
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

  public void thread914(int [] tdone, int [] ends){
        switch(S624){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(ROE.getprestatus()){//sysj\plant.sysj line: 102, column: 17
          System.out.println("RO");//sysj\plant.sysj line: 102, column: 22
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

  public void thread913(int [] tdone, int [] ends){
        switch(S616){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(RDE.getprestatus()){//sysj\plant.sysj line: 100, column: 17
          System.out.println("RD");//sysj\plant.sysj line: 100, column: 22
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

  public void thread912(int [] tdone, int [] ends){
        switch(S608){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(RCE.getprestatus()){//sysj\plant.sysj line: 98, column: 17
          System.out.println("RC");//sysj\plant.sysj line: 98, column: 22
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

  public void thread911(int [] tdone, int [] ends){
        switch(S600){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(RBE.getprestatus()){//sysj\plant.sysj line: 96, column: 17
          System.out.println("RB");//sysj\plant.sysj line: 96, column: 22
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

  public void thread910(int [] tdone, int [] ends){
        switch(S592){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(RAE.getprestatus()){//sysj\plant.sysj line: 94, column: 17
          System.out.println("RA");//sysj\plant.sysj line: 94, column: 22
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

  public void thread909(int [] tdone, int [] ends){
        switch(S584){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(LGE.getprestatus()){//sysj\plant.sysj line: 92, column: 17
          System.out.println("LG");//sysj\plant.sysj line: 92, column: 22
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

  public void thread908(int [] tdone, int [] ends){
        switch(S576){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(LOE.getprestatus()){//sysj\plant.sysj line: 90, column: 17
          System.out.println("LO");//sysj\plant.sysj line: 90, column: 22
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

  public void thread907(int [] tdone, int [] ends){
        switch(S568){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(LDE.getprestatus()){//sysj\plant.sysj line: 88, column: 17
          System.out.println("LD");//sysj\plant.sysj line: 88, column: 22
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

  public void thread906(int [] tdone, int [] ends){
        switch(S560){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(LCE.getprestatus()){//sysj\plant.sysj line: 86, column: 17
          System.out.println("LC");//sysj\plant.sysj line: 86, column: 22
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

  public void thread905(int [] tdone, int [] ends){
        switch(S552){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(LBE.getprestatus()){//sysj\plant.sysj line: 84, column: 17
          System.out.println("LB");//sysj\plant.sysj line: 84, column: 22
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

  public void thread904(int [] tdone, int [] ends){
        switch(S544){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(LAE.getprestatus()){//sysj\plant.sysj line: 82, column: 17
          System.out.println("LA");//sysj\plant.sysj line: 82, column: 22
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread903(int [] tdone, int [] ends){
        switch(S634){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread904(tdone,ends);
        thread905(tdone,ends);
        thread906(tdone,ends);
        thread907(tdone,ends);
        thread908(tdone,ends);
        thread909(tdone,ends);
        thread910(tdone,ends);
        thread911(tdone,ends);
        thread912(tdone,ends);
        thread913(tdone,ends);
        thread914(tdone,ends);
        thread915(tdone,ends);
        int biggest916 = 0;
        if(ends[5]>=biggest916){
          biggest916=ends[5];
        }
        if(ends[6]>=biggest916){
          biggest916=ends[6];
        }
        if(ends[7]>=biggest916){
          biggest916=ends[7];
        }
        if(ends[8]>=biggest916){
          biggest916=ends[8];
        }
        if(ends[9]>=biggest916){
          biggest916=ends[9];
        }
        if(ends[10]>=biggest916){
          biggest916=ends[10];
        }
        if(ends[11]>=biggest916){
          biggest916=ends[11];
        }
        if(ends[12]>=biggest916){
          biggest916=ends[12];
        }
        if(ends[13]>=biggest916){
          biggest916=ends[13];
        }
        if(ends[14]>=biggest916){
          biggest916=ends[14];
        }
        if(ends[15]>=biggest916){
          biggest916=ends[15];
        }
        if(ends[16]>=biggest916){
          biggest916=ends[16];
        }
        if(biggest916 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest916 == 0){
          S634=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread902(int [] tdone, int [] ends){
        switch(S536){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S486){
          case 0 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 51, column: 11
              if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("left_limb")){//sysj\plant.sysj line: 52, column: 5
                if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("limb_moveto")){//sysj\plant.sysj line: 53, column: 6
                  if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("A")){//sysj\plant.sysj line: 54, column: 7
                    LAE.setPresent();//sysj\plant.sysj line: 55, column: 8
                    currsigs.addElement(LAE);
                    CMDLfb.setPresent();//sysj\plant.sysj line: 74, column: 6
                    currsigs.addElement(CMDLfb);
                    S486=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("B")){//sysj\plant.sysj line: 56, column: 14
                      LBE.setPresent();//sysj\plant.sysj line: 57, column: 8
                      currsigs.addElement(LBE);
                      CMDLfb.setPresent();//sysj\plant.sysj line: 74, column: 6
                      currsigs.addElement(CMDLfb);
                      S486=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("C")){//sysj\plant.sysj line: 58, column: 14
                        LCE.setPresent();//sysj\plant.sysj line: 59, column: 8
                        currsigs.addElement(LCE);
                        CMDLfb.setPresent();//sysj\plant.sysj line: 74, column: 6
                        currsigs.addElement(CMDLfb);
                        S486=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("D")){//sysj\plant.sysj line: 60, column: 14
                          LDE.setPresent();//sysj\plant.sysj line: 61, column: 8
                          currsigs.addElement(LDE);
                          CMDLfb.setPresent();//sysj\plant.sysj line: 74, column: 6
                          currsigs.addElement(CMDLfb);
                          S486=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          System.err.println("Incorrect position argument");//sysj\plant.sysj line: 63, column: 8
                          CMDLfb.setPresent();//sysj\plant.sysj line: 74, column: 6
                          currsigs.addElement(CMDLfb);
                          S486=1;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("limb_gripper")){//sysj\plant.sysj line: 65, column: 13
                    if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("open")){//sysj\plant.sysj line: 66, column: 7
                      LOE.setPresent();//sysj\plant.sysj line: 67, column: 8
                      currsigs.addElement(LOE);
                      CMDLfb.setPresent();//sysj\plant.sysj line: 74, column: 6
                      currsigs.addElement(CMDLfb);
                      S486=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      if((CMDL.getpreval() == null ? null : ((String)CMDL.getpreval())).contains("close")){//sysj\plant.sysj line: 68, column: 14
                        LGE.setPresent();//sysj\plant.sysj line: 69, column: 8
                        currsigs.addElement(LGE);
                        CMDLfb.setPresent();//sysj\plant.sysj line: 74, column: 6
                        currsigs.addElement(CMDLfb);
                        S486=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        System.err.println("Incorrect position argument");//sysj\plant.sysj line: 71, column: 8
                        CMDLfb.setPresent();//sysj\plant.sysj line: 74, column: 6
                        currsigs.addElement(CMDLfb);
                        S486=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                  }
                  else {
                    CMDLfb.setPresent();//sysj\plant.sysj line: 74, column: 6
                    currsigs.addElement(CMDLfb);
                    S486=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                }
              }
              else {
                S486=1;
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
            S486=1;
            S486=0;
            if(CMDL.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 50, column: 12
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S486=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread901(int [] tdone, int [] ends){
        switch(S462){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S412){
          case 0 : 
            if(!enable.getprestatus()){//sysj\plant.sysj line: 18, column: 11
              if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("right_limb")){//sysj\plant.sysj line: 19, column: 5
                if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("limb_moveto")){//sysj\plant.sysj line: 20, column: 6
                  if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("A")){//sysj\plant.sysj line: 21, column: 7
                    RAE.setPresent();//sysj\plant.sysj line: 22, column: 8
                    currsigs.addElement(RAE);
                    CMDRfb.setPresent();//sysj\plant.sysj line: 41, column: 6
                    currsigs.addElement(CMDRfb);
                    S412=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("B")){//sysj\plant.sysj line: 23, column: 14
                      RBE.setPresent();//sysj\plant.sysj line: 24, column: 8
                      currsigs.addElement(RBE);
                      CMDRfb.setPresent();//sysj\plant.sysj line: 41, column: 6
                      currsigs.addElement(CMDRfb);
                      S412=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("C")){//sysj\plant.sysj line: 25, column: 14
                        RCE.setPresent();//sysj\plant.sysj line: 26, column: 8
                        currsigs.addElement(RCE);
                        CMDRfb.setPresent();//sysj\plant.sysj line: 41, column: 6
                        currsigs.addElement(CMDRfb);
                        S412=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("D")){//sysj\plant.sysj line: 27, column: 14
                          RDE.setPresent();//sysj\plant.sysj line: 28, column: 8
                          currsigs.addElement(RDE);
                          CMDRfb.setPresent();//sysj\plant.sysj line: 41, column: 6
                          currsigs.addElement(CMDRfb);
                          S412=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.err.println("Incorrect position argument");//sysj\plant.sysj line: 30, column: 8
                          CMDRfb.setPresent();//sysj\plant.sysj line: 41, column: 6
                          currsigs.addElement(CMDRfb);
                          S412=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("limb_gripper")){//sysj\plant.sysj line: 32, column: 13
                    if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("open")){//sysj\plant.sysj line: 33, column: 7
                      ROE.setPresent();//sysj\plant.sysj line: 34, column: 8
                      currsigs.addElement(ROE);
                      CMDRfb.setPresent();//sysj\plant.sysj line: 41, column: 6
                      currsigs.addElement(CMDRfb);
                      S412=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if((CMDR.getpreval() == null ? null : ((String)CMDR.getpreval())).contains("close")){//sysj\plant.sysj line: 35, column: 14
                        RGE.setPresent();//sysj\plant.sysj line: 36, column: 8
                        currsigs.addElement(RGE);
                        CMDRfb.setPresent();//sysj\plant.sysj line: 41, column: 6
                        currsigs.addElement(CMDRfb);
                        S412=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        System.err.println("Incorrect position argument");//sysj\plant.sysj line: 38, column: 8
                        CMDRfb.setPresent();//sysj\plant.sysj line: 41, column: 6
                        currsigs.addElement(CMDRfb);
                        S412=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    CMDRfb.setPresent();//sysj\plant.sysj line: 41, column: 6
                    currsigs.addElement(CMDRfb);
                    S412=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                S412=1;
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
            S412=1;
            S412=0;
            if(CMDR.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 17, column: 12
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S412=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread898(int [] tdone, int [] ends){
        S632=1;
    if(RGE.getprestatus()){//sysj\plant.sysj line: 104, column: 17
      System.out.println("RG");//sysj\plant.sysj line: 104, column: 22
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

  public void thread897(int [] tdone, int [] ends){
        S624=1;
    if(ROE.getprestatus()){//sysj\plant.sysj line: 102, column: 17
      System.out.println("RO");//sysj\plant.sysj line: 102, column: 22
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

  public void thread896(int [] tdone, int [] ends){
        S616=1;
    if(RDE.getprestatus()){//sysj\plant.sysj line: 100, column: 17
      System.out.println("RD");//sysj\plant.sysj line: 100, column: 22
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

  public void thread895(int [] tdone, int [] ends){
        S608=1;
    if(RCE.getprestatus()){//sysj\plant.sysj line: 98, column: 17
      System.out.println("RC");//sysj\plant.sysj line: 98, column: 22
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

  public void thread894(int [] tdone, int [] ends){
        S600=1;
    if(RBE.getprestatus()){//sysj\plant.sysj line: 96, column: 17
      System.out.println("RB");//sysj\plant.sysj line: 96, column: 22
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

  public void thread893(int [] tdone, int [] ends){
        S592=1;
    if(RAE.getprestatus()){//sysj\plant.sysj line: 94, column: 17
      System.out.println("RA");//sysj\plant.sysj line: 94, column: 22
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

  public void thread892(int [] tdone, int [] ends){
        S584=1;
    if(LGE.getprestatus()){//sysj\plant.sysj line: 92, column: 17
      System.out.println("LG");//sysj\plant.sysj line: 92, column: 22
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

  public void thread891(int [] tdone, int [] ends){
        S576=1;
    if(LOE.getprestatus()){//sysj\plant.sysj line: 90, column: 17
      System.out.println("LO");//sysj\plant.sysj line: 90, column: 22
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

  public void thread890(int [] tdone, int [] ends){
        S568=1;
    if(LDE.getprestatus()){//sysj\plant.sysj line: 88, column: 17
      System.out.println("LD");//sysj\plant.sysj line: 88, column: 22
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

  public void thread889(int [] tdone, int [] ends){
        S560=1;
    if(LCE.getprestatus()){//sysj\plant.sysj line: 86, column: 17
      System.out.println("LC");//sysj\plant.sysj line: 86, column: 22
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

  public void thread888(int [] tdone, int [] ends){
        S552=1;
    if(LBE.getprestatus()){//sysj\plant.sysj line: 84, column: 17
      System.out.println("LB");//sysj\plant.sysj line: 84, column: 22
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

  public void thread887(int [] tdone, int [] ends){
        S544=1;
    if(LAE.getprestatus()){//sysj\plant.sysj line: 82, column: 17
      System.out.println("LA");//sysj\plant.sysj line: 82, column: 22
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

  public void thread886(int [] tdone, int [] ends){
        S634=1;
    thread887(tdone,ends);
    thread888(tdone,ends);
    thread889(tdone,ends);
    thread890(tdone,ends);
    thread891(tdone,ends);
    thread892(tdone,ends);
    thread893(tdone,ends);
    thread894(tdone,ends);
    thread895(tdone,ends);
    thread896(tdone,ends);
    thread897(tdone,ends);
    thread898(tdone,ends);
    int biggest899 = 0;
    if(ends[5]>=biggest899){
      biggest899=ends[5];
    }
    if(ends[6]>=biggest899){
      biggest899=ends[6];
    }
    if(ends[7]>=biggest899){
      biggest899=ends[7];
    }
    if(ends[8]>=biggest899){
      biggest899=ends[8];
    }
    if(ends[9]>=biggest899){
      biggest899=ends[9];
    }
    if(ends[10]>=biggest899){
      biggest899=ends[10];
    }
    if(ends[11]>=biggest899){
      biggest899=ends[11];
    }
    if(ends[12]>=biggest899){
      biggest899=ends[12];
    }
    if(ends[13]>=biggest899){
      biggest899=ends[13];
    }
    if(ends[14]>=biggest899){
      biggest899=ends[14];
    }
    if(ends[15]>=biggest899){
      biggest899=ends[15];
    }
    if(ends[16]>=biggest899){
      biggest899=ends[16];
    }
    if(biggest899 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread885(int [] tdone, int [] ends){
        S536=1;
    S486=0;
    if(CMDL.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 50, column: 12
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S486=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread884(int [] tdone, int [] ends){
        S462=1;
    S412=0;
    if(CMDR.getprestatus() && enable.getprestatus()){//sysj\plant.sysj line: 17, column: 12
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S412=1;
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
      switch(S882){
        case 0 : 
          S882=0;
          break RUN;
        
        case 1 : 
          S882=2;
          S882=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 14, column: 2
          thread884(tdone,ends);
          thread885(tdone,ends);
          thread886(tdone,ends);
          int biggest900 = 0;
          if(ends[2]>=biggest900){
            biggest900=ends[2];
          }
          if(ends[3]>=biggest900){
            biggest900=ends[3];
          }
          if(ends[4]>=biggest900){
            biggest900=ends[4];
          }
          if(biggest900 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread901(tdone,ends);
          thread902(tdone,ends);
          thread903(tdone,ends);
          int biggest917 = 0;
          if(ends[2]>=biggest917){
            biggest917=ends[2];
          }
          if(ends[3]>=biggest917){
            biggest917=ends[3];
          }
          if(ends[4]>=biggest917){
            biggest917=ends[4];
          }
          if(biggest917 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest917 == 0){
            S882=0;
            active[1]=0;
            ends[1]=0;
            S882=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        CMDR.gethook();
        CMDL.gethook();
        enable.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
