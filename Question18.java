package dkatalis;

import java.util.Arrays;
import java.util.Scanner;

public class Question18 {

public static void main(String [] args){
        
        String status = "Strings are Anagram";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String str2 = sc.nextLine();
        
        if(str1.length() == str2.length()){
            
            char [] arr1 = str1.toCharArray();
            char [] arr2 = str2.toCharArray();
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            for(int i = 0; i < arr1.length; i++){
                
                if(arr1[i] != arr2[i]){
                    status = "Sterings are not Anagram";
                }
            }
        }
        else{
            
            status = "Strings are not Anagaram";
        }
        
        System.out.println(status);
    }
}
