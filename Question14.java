package dkatalis;

import java.util.Scanner;

public class Question14 {

public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        
        char [] arr1 = str.toCharArray();
        char [] arr2 = new char[arr1.length];
        
        for(int i = 0; i < arr1.length; i++){
            
            arr2[arr1.length-i-1] = arr1[i];
        }
        
        String temp = new String(arr2);
        
        if(temp.equals(str)){
            System.out.println("String is Palendrome");
        }
        else{
            System.out.println("String is not a palendrome");
        }
    }
}
