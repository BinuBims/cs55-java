/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simplecalculator;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author binu
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        //get two number from users
        //turn them into integer
        //get the one of the operations
        //use switch statement to print out the result
        //if user enter y Y play again, otherwise exist
        Scanner input = new Scanner(System.in);
        Boolean cont = true;
        do{
        System.out.println("Hi, I am really good at math! Put me to the test.\n" + "Please enter two numbers and then press Enter");
        BigDecimal fNum = input.nextBigDecimal();
        BigDecimal sNum = input.nextBigDecimal();
        System.out.println("Please enter one of the operations +, -, * or / and press Enter");
        String operation = input.next();
        switch(operation){
            case "+" -> System.out.println(fNum.add(sNum)  +""+'\n'+ "I'm great at addition! " );
            case "-" -> System.out.println(fNum.subtract(sNum) +""+'\n'+ "I'm great at subtraction! " );
            case "*" -> System.out.println(fNum.multiply(sNum) +""+'\n'+ "I'm great at multiplication! " );
            case "/" -> System.out.println(fNum.divide(sNum,6, RoundingMode.HALF_UP)+""+'\n'+ "I'm great at division! " );
            default -> System.out.println("I can compute really well, but what you entered is not one of the operations I know ...");
        }
        System.out.println("Play again [Y/N]?");
        String yesNo = input.next();
        if (!("y".equals(yesNo) || "Y".equals(yesNo))){
            cont = false;
        }
        }while(cont);
        System.out.println("Bye bye!");
    }
}
