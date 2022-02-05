/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countoccurence;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sa
 */
public class CountOccurence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];

        int num;
        System.out.println("Enter numbers");
        
        for (int i = 0; i < 10; i++) {
            num=scan.nextInt();
            if(num == 0){
                break;
            }
           arr[i]=num; 
           
        }
      System.out.println("array is "+ Arrays.toString(arr)); 
      Occurence(arr);
    }
    public static void Occurence(int[] array){
       
       int[] occured = new int[array.length];
       int visited=-1;
       
        for (int i = 0; i < array.length; i++) {
            int count=1;
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    count++;
                    occured[j]=visited;
                }
            }
            if(occured[i] != visited){
                occured[i]= count;
            }
            
        }
        for (int i = 0; i < occured.length; i++) {
            if(array[i]==0){
                break;
            }
            if(occured[i] != visited && occured[i]>1){
                System.out.println("Number "+array[i]+" occurs "+ occured[i]+" times ");
            }else if(occured[i] != visited && occured[i]==1){
                System.out.println("Number "+array[i]+" occurs "+ occured[i]+" time ");
            }
            
        }
            
        
    }
}
