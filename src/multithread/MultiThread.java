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
public class MultiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Resource r1 = new Resource();
        //RunnableDemo t1 = new RunnableDemo("Jason",r1);
        //RunnableDemo t2 = new RunnableDemo("Bob",r1);
        Talking talk = new Talking();
        QuestionAnswer q = new QuestionAnswer(true,"Jim",talk);
        QuestionAnswer a = new QuestionAnswer(false,"Larry",talk);
        
        q.start();
        a.start();
        //t1.start();
        //t2.start();
        //t1.run();
    }
    
    
}
