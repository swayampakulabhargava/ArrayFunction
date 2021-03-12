
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ArraysFunctions {
    
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12,14,16,18,20};
        
        System.out.println("Total number: " + getTotal(array));
         System.out.println("Average number: " + getAverage(array));
        System.out.println("Highest number: " + getHighest(array));
        System.out.println("Lowest number: " + getLowest(array));
                
    }
    public static int getTotal(int[] x){
        int total =0;
        for(int i=0; i<x.length; i++){
            total = total+x[i];
            
        }
        return total;
    }
    public static int getAverage(int[] y){
        int average =0;
        int total=0;
        for(int i =0; i<y.length; i++){
            total = total + y[i]; 
        }
        average = total/y.length;
        return average;
    }
    public static int getHighest(int[] highnumber){
        int HighNumber =0;
        for(int i =0; i<highnumber.length; i++){
           if(highnumber[i]> HighNumber){
               HighNumber= highnumber[i];
           }
          
        }  
        return HighNumber;
    }
    public static int getLowest(int[] lowestnumber){
        int lowNumber =50;
        for(int i =0; i<lowestnumber.length; i++){
           if(lowestnumber[i]< lowNumber){
               lowNumber= lowestnumber[i];
           }
           
        }
        return lowNumber;
    }
}

