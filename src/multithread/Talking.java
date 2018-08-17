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
    Boolean isAsking;
    int question_answer_number;
    HashMap<Integer,String> questions = new HashMap<Integer,String>();
    HashMap<Integer,String> answers = new HashMap<Integer,String>();
    
    Talking(){
        isAsking = true;
        question_answer_number = 0;
        setQuestions();
        setAnswers();
    }
    
    public void ask(){
        if(isAsking){
            
        }
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
