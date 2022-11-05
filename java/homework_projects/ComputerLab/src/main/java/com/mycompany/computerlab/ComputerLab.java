/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.computerlab;

import java.util.Scanner;

/**
 *
 * @author binu
 */
public class ComputerLab {

    public static void main(String[] args) {
        String [][] labArr = {
              {"1 ","1: Empty ","2: Empty ","3: Empty ","4: Empty " ,"5: Empty "},
              {"1 ","1: Empty ","2: Empty ","3: Empty ","4: Empty " ,"5: Empty ","6: Empty "},
              {"1 ","1: Empty ","2: Empty ","3: Empty ","4: Empty"},
              {"1 ","1: Empty ","2: Empty ","3: Empty ",}
          };

        for (int i=0; i< labArr.length;i++){
            for(int j=0; j<labArr[i].length; j++){
                
                System.out.print(labArr[i][j]);
            }
        System.out.println();
        }
        while(true){
    System.out.println("MAIN MENU \n"+
                            "0) Quit\n" +
                            "1) Simulate login\n" +
                            "2) Simulate logoff\n" +
                            "3) Search");
    Scanner input = new Scanner(System.in);
//    input.nextLine()
    int userInput = input.nextInt();
    if(userInput == 1){
        logIn(input,labArr);
    }
    else if(userInput == 2){
        logOff(input,labArr);  
        }
    else if(userInput == 3){
        String output = userSearch(input,labArr);
        System.out.println(output);
    }
    else if(userInput == 0){
        System.out.println("Thank you! looking forward to see you agin.");
        break;

    }
}}
public static void logIn(Scanner input,String [][] x){
    System.out.println("Enter the 5 digit ID number of the user logging in:");
        int id = input.nextInt();
        System.out.println("Enter the lab number the user is logging in from (1-4)");
        int labNumber = input.nextInt();
        System.out.println("Enter computer station number the user is logging in to (1-"+(x[labNumber].length-1)+"):");
        int stationNumber = input.nextInt();
        x[labNumber-1][stationNumber] = String.valueOf(stationNumber)+": " +String.valueOf(id)+" ";
        for (int i=0; i< x.length;i++){
            for(int j=0; j<x[i].length; j++){
                System.out.print(x[i][j]+" ");
            }
        System.out.println();
    }
}
public static void logOff(Scanner input, String [][] x){
        System.out.println("Enter the 5 digit ID number of the user logged off:");
        int id = input.nextInt();
        for (int i=0; i< x.length;i++){
            for(int j=0; j<x[i].length; j++){
                if(x[i][j].equals(String.valueOf(j)+": " +String.valueOf(id)+" ")){
                    x[i][j] = String.valueOf(j)+": Empty ";
                }
            }}
        for (int i=0; i< x.length;i++){
            for(int j=0; j<x[i].length; j++){
//                labArr[i][j] = "Empty";
                System.out.print(x[i][j]+" ");
            }
        System.out.println();
    }
}
public static String userSearch(Scanner input, String [][] x){
        System.out.println("Enter the 5 digit ID number of the user to find:");
        int id = input.nextInt();
        for (int i=0; i< x.length;i++){
            for(int j=0; j<x[i].length; j++){
                if(x[i][j].equals(String.valueOf(j)+": " +String.valueOf(id)+" ")){
                    return "Lab Number: "+(i+1)+", "+"Station Number: "+(j);
                }
            }}
        return "None";
}
}
