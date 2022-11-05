/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.formatname;

import java.util.Scanner;

/**
 *
 * @author binu
 */
public class FormatName {

    public static void main(String[] args) {
        getInputOutput();
    }
public static void getInputOutput(){
    System.out.println("Enter firstName middleName lastName separated by at least one blank, It may have more than one blank separating firstName middleName lastName.");
    Scanner input = new Scanner(System.in);
//    input.nextLine();
    String userInput = input.nextLine();
    int endIdxFname = userInput.indexOf(' ');
    String fName = userInput.substring(0,1);
    String userInputMiddle = userInput.substring(endIdxFname).trim();
    String mName = userInputMiddle.substring(0,1);
    String middleName = userInputMiddle.substring(0);
    int startIdxLname = userInput.lastIndexOf(' ');
    String lName = userInput.substring(startIdxLname+1);
//    System.out.println(middleName.equals(lName)+lName +middleName);
//    System.out.println(middleName.equals(middleName) +middleName +middleName);
    if (lName.equals(middleName)){
        System.out.println(lName + "," + fName+".");
    }else{
         System.out.println(lName + "," + fName + "." + mName + ".");
    }
    
}

}

