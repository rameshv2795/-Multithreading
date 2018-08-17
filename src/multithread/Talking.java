/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multithread;

import java.util.HashMap;

/**
 *
 * @author Vinod Ramesh
 */
public class Talking {
    private Boolean isAsking;
    private int question_answer_number;
    private HashMap<Integer,String> questions = new HashMap<Integer,String>();
    private HashMap<Integer,String> answers = new HashMap<Integer,String>();
    
    Talking(){
        isAsking = true;
        question_answer_number = 0;
        setQuestions();
        setAnswers();
    }
    
    public synchronized void ask(){
        
        if(!isAsking){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Interrupted");
            }
        }
        //Thread.sleep(2000);
        System.out.println(questions.get(question_answer_number));  
        isAsking = false;
        notify();
    }
    
    public synchronized void answer(){
        System.out.println("Here");
        if(isAsking){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Interrupted");
            }
        }
        //Thread.sleep(2000);
        System.out.println(answers.get(question_answer_number));      
        question_answer_number++;
        isAsking = true;
        notify();
    }    
    
    private void setQuestions(){
        questions.put(0,"What is your name?");
        questions.put(1,"What is your favorite sport?");
        questions.put(2,"Where are you from?");
        questions.put(3,"What is your favorite color?");        
    }
    private void setAnswers(){
        answers.put(0,"Jason Terry");
        answers.put(1,"Football (soccer)");
        answers.put(2,"United States");
        answers.put(3,"Green");           
    }    
}
