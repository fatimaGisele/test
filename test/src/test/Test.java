/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.lang.*;

/**
 *
 * @author Usuario
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] nums1 = {1,4,3,9};
    int[] nums2 = {1,2,4,4};
    int sum = 0;
     int requiredSum = 8;
    for(int i=0; i<nums2.length ;i++){
            sum = nums2[i];
            for(int p=i+1; p<nums2.length ;p++){
            int j=nums2[p];
            sum +=j;  
            System.out.println("valor "+nums2[i]+ " suma "+sum+" posicion "+i);
            if(sum == requiredSum){
                System.out.println(true+" "+sum);
                }else{
                
                System.out.println(false+" "+sum);
                sum=0;
                 }
            }
            
        } 
    
}
  }

 