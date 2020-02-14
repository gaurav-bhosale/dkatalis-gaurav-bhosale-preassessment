package dkatalis;

import java.util.Scanner;

public class Question16 {

public static void main(String [] args){
        
        int vallyCount = 0;
        int highest = 0;
        int deepest = 0;
        int current = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Path (U/D): ");
        String pathStr = sc.nextLine();
        
        char [] pathArr = pathStr.toCharArray();
        
        for(int i = 0; i < pathArr.length; i++){
            
            if(pathArr[i] == 'U'){
                
                if(current == 0){
                    highest++;
                }
                current ++;
            }
            else{
                if(current == 0){
                    vallyCount++;
                    deepest++;
                }
                current --;
            }
        }
        
        System.out.println("Highest : " + highest);
        System.out.println("Deepest : " + deepest);
        System.out.println("Vally Count : " + vallyCount);
    }
}
