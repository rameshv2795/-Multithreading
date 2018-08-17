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
public class Resource {
    private int r[];
    
    Resource(){
        r = new int[] {0,1,2,3,4,5};
    }
    
    public void printResource() throws InterruptedException{
        for(int i = 0; i < r.length; i++){
            System.out.println(r[i]);
            Thread.sleep(1000);
        }
    }
}
