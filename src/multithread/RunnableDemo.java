/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multithread;

/**
 *
 * @author Vinod Ramesh
 */
class RunnableDemo implements Runnable {
    String threadName;
    Thread t;
    Resource res;
    
    RunnableDemo(String n, Resource r){
        threadName = n;
        res = r;
    }
    
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       try{
            /*for(int i = 0; i < 5; i++){
                System.out.println(threadName + " is " + i);
                Thread.sleep(1000);
            }*/
        synchronized(res){
            res.printResource();
        }
        }
        catch(InterruptedException e){
            System.out.println(threadName + " interrupted");
        }
        System.out.println(threadName + " finished");
    }
    
    public void start(){
        t = new Thread(this, threadName);
        t.start();
    }
    
    
}
