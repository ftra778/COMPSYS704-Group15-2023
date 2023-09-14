import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\controller.sysj line: 1, column: 1
import java.util.ArrayList;//sysj\controller.sysj line: 2, column: 1
import org.compsys704.*;//sysj\controller.sysj line: 3, column: 1

public class POSController extends ClockDomain{
  public POSController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal orderQuantity = new Signal("orderQuantity", Signal.INPUT);
  public Signal bottleReady = new Signal("bottleReady", Signal.INPUT);
  public Signal suspendOrders = new Signal("suspendOrders", Signal.INPUT);
  public Signal liquidRatio = new Signal("liquidRatio", Signal.INPUT);
  public Signal sendOrder = new Signal("sendOrder", Signal.INPUT);
  public Signal liquidRatioOrder = new Signal("liquidRatioOrder", Signal.OUTPUT);
  private Signal orderQueue_1;
  private int currentCount_thread_2;//sysj\controller.sysj line: 27, column: 3
  private List orderQueueVar_thread_2;//sysj\controller.sysj line: 30, column: 4
  private int S172 = 1;
  private int S152 = 1;
  private int S2 = 1;
  private int S170 = 1;
  private int S160 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread178(int [] tdone, int [] ends){
        switch(S170){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S160){
          case 0 : 
            if(bottleReady.getprestatus() && !suspendOrders.getprestatus()){//sysj\controller.sysj line: 51, column: 9
              S160=1;
              liquidRatioOrder.setPresent();//sysj\controller.sysj line: 54, column: 3
              currsigs.addElement(liquidRatioOrder);
              liquidRatioOrder.setValue((orderQueue_1.getpreval() == null ? null : ((List)orderQueue_1.getpreval())).get(0));//sysj\controller.sysj line: 54, column: 3
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
          
          case 1 : 
            liquidRatioOrder.setPresent();//sysj\controller.sysj line: 54, column: 3
            currsigs.addElement(liquidRatioOrder);
            liquidRatioOrder.setValue((orderQueue_1.getpreval() == null ? null : ((List)orderQueue_1.getpreval())).get(0));//sysj\controller.sysj line: 54, column: 3
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread177(int [] tdone, int [] ends){
        switch(S152){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2){
          case 0 : 
            if(sendOrder.getprestatus()){//sysj\controller.sysj line: 25, column: 9
              currentCount_thread_2 = 0;//sysj\controller.sysj line: 27, column: 3
              S2=1;
              orderQueueVar_thread_2 = Arrays.asList();//sysj\controller.sysj line: 30, column: 4
              if(currentCount_thread_2 == (Integer)(orderQuantity.getpreval() == null ? 0 : ((Integer)orderQuantity.getpreval()).intValue())){//sysj\controller.sysj line: 33, column: 8
                ends[2]=2;
                ;//sysj\controller.sysj line: 29, column: 3
                S2=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                orderQueueVar_thread_2.add((List)(liquidRatio.getpreval() == null ? null : ((List)liquidRatio.getpreval())));//sysj\controller.sysj line: 37, column: 5
                System.out.println("Order added, number " + (currentCount_thread_2 + 1));//sysj\controller.sysj line: 38, column: 5
                currentCount_thread_2 = currentCount_thread_2 + 1;//sysj\controller.sysj line: 39, column: 5
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
            if(currentCount_thread_2 == (Integer)(orderQuantity.getpreval() == null ? 0 : ((Integer)orderQuantity.getpreval()).intValue())){//sysj\controller.sysj line: 33, column: 8
              ends[2]=2;
              ;//sysj\controller.sysj line: 29, column: 3
              S2=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              orderQueueVar_thread_2.add((List)(liquidRatio.getpreval() == null ? null : ((List)liquidRatio.getpreval())));//sysj\controller.sysj line: 37, column: 5
              System.out.println("Order added, number " + (currentCount_thread_2 + 1));//sysj\controller.sysj line: 38, column: 5
              currentCount_thread_2 = currentCount_thread_2 + 1;//sysj\controller.sysj line: 39, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread175(int [] tdone, int [] ends){
        S170=1;
    S160=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread174(int [] tdone, int [] ends){
        S152=1;
    S2=0;
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
      switch(S172){
        case 0 : 
          S172=0;
          break RUN;
        
        case 1 : 
          S172=2;
          S172=2;
          orderQueue_1.setClear();//sysj\controller.sysj line: 19, column: 2
          thread174(tdone,ends);
          thread175(tdone,ends);
          int biggest176 = 0;
          if(ends[2]>=biggest176){
            biggest176=ends[2];
          }
          if(ends[3]>=biggest176){
            biggest176=ends[3];
          }
          if(biggest176 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          orderQueue_1.setClear();//sysj\controller.sysj line: 19, column: 2
          thread177(tdone,ends);
          thread178(tdone,ends);
          int biggest179 = 0;
          if(ends[2]>=biggest179){
            biggest179=ends[2];
          }
          if(ends[3]>=biggest179){
            biggest179=ends[3];
          }
          if(biggest179 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest179 == 0){
            S172=0;
            active[1]=0;
            ends[1]=0;
            S172=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    orderQueue_1 = new Signal();
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
          orderQuantity.gethook();
          bottleReady.gethook();
          suspendOrders.gethook();
          liquidRatio.gethook();
          sendOrder.gethook();
          df = true;
        }
        runClockDomain();
      }
      orderQuantity.setpreclear();
      bottleReady.setpreclear();
      suspendOrders.setpreclear();
      liquidRatio.setpreclear();
      sendOrder.setpreclear();
      liquidRatioOrder.setpreclear();
      orderQueue_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = orderQuantity.getStatus() ? orderQuantity.setprepresent() : orderQuantity.setpreclear();
      orderQuantity.setpreval(orderQuantity.getValue());
      orderQuantity.setClear();
      dummyint = bottleReady.getStatus() ? bottleReady.setprepresent() : bottleReady.setpreclear();
      bottleReady.setpreval(bottleReady.getValue());
      bottleReady.setClear();
      dummyint = suspendOrders.getStatus() ? suspendOrders.setprepresent() : suspendOrders.setpreclear();
      suspendOrders.setpreval(suspendOrders.getValue());
      suspendOrders.setClear();
      dummyint = liquidRatio.getStatus() ? liquidRatio.setprepresent() : liquidRatio.setpreclear();
      liquidRatio.setpreval(liquidRatio.getValue());
      liquidRatio.setClear();
      dummyint = sendOrder.getStatus() ? sendOrder.setprepresent() : sendOrder.setpreclear();
      sendOrder.setpreval(sendOrder.getValue());
      sendOrder.setClear();
      liquidRatioOrder.sethook();
      liquidRatioOrder.setClear();
      orderQueue_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        orderQuantity.gethook();
        bottleReady.gethook();
        suspendOrders.gethook();
        liquidRatio.gethook();
        sendOrder.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
