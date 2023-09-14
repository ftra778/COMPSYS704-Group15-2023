import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.List;//sysj\controller.sysj line: 1, column: 1
import java.util.ArrayList;//sysj\controller.sysj line: 2, column: 1
import org.compsys704.*;//sysj\controller.sysj line: 3, column: 1

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
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
  private List orderQueue_thread_1;//sysj\controller.sysj line: 19, column: 2
  private int currentCount_thread_2;//sysj\controller.sysj line: 27, column: 3
  private int S201 = 1;
  private int S81 = 1;
  private int S1 = 1;
  private int S99 = 1;
  private int S89 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread207(int [] tdone, int [] ends){
        switch(S99){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S89){
          case 0 : 
            if(bottleReady.getprestatus() && !suspendOrders.getprestatus()){//sysj\controller.sysj line: 50, column: 9
              S89=1;
              liquidRatioOrder.setPresent();//sysj\controller.sysj line: 53, column: 3
              currsigs.addElement(liquidRatioOrder);
              liquidRatioOrder.setValue(orderQueue.get(0));//sysj\controller.sysj line: 53, column: 3
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
            liquidRatioOrder.setPresent();//sysj\controller.sysj line: 53, column: 3
            currsigs.addElement(liquidRatioOrder);
            liquidRatioOrder.setValue(orderQueue.get(0));//sysj\controller.sysj line: 53, column: 3
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread206(int [] tdone, int [] ends){
        switch(S81){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1){
          case 0 : 
            if(sendOrder.getprestatus()){//sysj\controller.sysj line: 25, column: 9
              currentCount_thread_2 = 0;//sysj\controller.sysj line: 27, column: 3
              S1=1;
              if(currentCount_thread_2 == (Integer)(orderQuantity.getpreval() == null ? 0 : ((Integer)orderQuantity.getpreval()).intValue())){//sysj\controller.sysj line: 33, column: 8
                ends[2]=2;
                ;//sysj\controller.sysj line: 29, column: 3
                S1=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                orderQueue.add((List)(liquidRatio.getpreval() == null ? null : ((List)liquidRatio.getpreval())));//sysj\controller.sysj line: 37, column: 5
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
              S1=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              orderQueue.add((List)(liquidRatio.getpreval() == null ? null : ((List)liquidRatio.getpreval())));//sysj\controller.sysj line: 37, column: 5
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

  public void thread204(int [] tdone, int [] ends){
        S99=1;
    S89=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread203(int [] tdone, int [] ends){
        S81=1;
    S1=0;
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
      switch(S201){
        case 0 : 
          S201=0;
          break RUN;
        
        case 1 : 
          S201=2;
          S201=2;
          orderQueue_thread_1 = Arrays.asList();//sysj\controller.sysj line: 19, column: 2
          thread203(tdone,ends);
          thread204(tdone,ends);
          int biggest205 = 0;
          if(ends[2]>=biggest205){
            biggest205=ends[2];
          }
          if(ends[3]>=biggest205){
            biggest205=ends[3];
          }
          if(biggest205 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread206(tdone,ends);
          thread207(tdone,ends);
          int biggest208 = 0;
          if(ends[2]>=biggest208){
            biggest208=ends[2];
          }
          if(ends[3]>=biggest208){
            biggest208=ends[3];
          }
          if(biggest208 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest208 == 0){
            S201=0;
            active[1]=0;
            ends[1]=0;
            S201=0;
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
