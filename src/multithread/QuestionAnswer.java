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
public class QuestionAnswer extends Thread {
    private Talking talk;
    private Thread t;
    private Boolean isAsker;
    private String name;
    
    QuestionAnswer(Boolean ia, String n, Talking ta){
        isAsker = ia;
        name = n;
        talk = ta;
    }
    
    @Override
    public void start(){
        if(isAsker){
            for(int i = 0; i < 4; i++){
                System.out.println(name + " Asks: ");
                talk.ask();
                System.out.println("");
            }
        }    
        else if(!isAsker){
                for(int i = 0; i < 4; i++){
                    System.out.println(name + " Answers: ");
                    talk.answer();
                    System.out.println("");
                }
        }         
    }
    public void run(){
        t = new Thread(this,name);
        t.start();
    }
}
