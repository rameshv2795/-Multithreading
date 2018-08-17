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
public class QuestionAnswer implements Runnable {
    private Talking talk;
    private Thread t;
    private Boolean isAsker;
    
    QuestionAnswer(Boolean ia, String n, Talking ta){
        isAsker = ia;
        if(ia){
            t = new Thread(this,"Q");
            t.start();
        }
        else{
            t = new Thread(this,"A");
            t.start();
        }        
        talk = ta;
    }
    
    @Override
    public void run(){
        
        if(t.getName().equals("Q")){
            for(int i = 0; i < 4; i++){
                //System.out.println("Q: ");
                talk.ask();
                System.out.println("");
            }
        }    
        else{
                for(int i = 0; i < 4; i++){
                    //System.out.println("A: ");
                    talk.answer();
                    System.out.println("");
                }
        }         
    }

}
