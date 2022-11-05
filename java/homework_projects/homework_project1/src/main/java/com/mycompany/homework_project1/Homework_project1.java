/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.homework_project1;

import java.util.Scanner;

/**
 *
 * @author binu
 */
public class Homework_project1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean cont = true;
        while (cont){
            System.out.println("please include your month");
            String month = input.nextLine();
            month = month.toLowerCase();
            System.out.println("please include your day");
            int day = input.nextInt();
//            The dates for each season are:
//            Spring: March 20 - June 20
//            Summer: June 21 - September 21
//            Autumn: September 22 - December 20
//            Winter: December 21 - March 19
            if ("march".equals(month) && day>19 && day<=31|| "april".equals(month) && day>0 && day<=30
                    || "may".equals(month) && day>0 && day<=31|| "june".equals(month) && day>0 && day<=20){
                System.out.println("Spring");}
            else if ("june".equals(month) && day>20 && day<=30|| "july".equals(month) && day>0 && day<=31
                    || "august".equals(month) && day>0 && day<=31|| "september".equals(month) && day>0 && day<=21){
                System.out.println("Summer");}
            else if ("september".equals(month) && day>21 && day<=30|| "october".equals(month) && day>0 && day<=31
                    || "november".equals(month) && day>0 && day<=30|| "december".equals(month) && day>0 && day<=20){
                System.out.println("Autumn");}
            else if ("december".equals(month) && day>20 && day<=31|| "january".equals(month) && day>0 && day<=31
                    || "february".equals(month) && day>0 && day<=28|| "march".equals(month) && day>0 && day<=19){
                System.out.println("Autumn");}
           
            else{
                System.out.println("Invalid");
                
            
        }
            System.out.println("type Quit to exit");
            input.nextLine();
            String quit = input.nextLine();
            
            if ("Quit".equals(quit)){
                cont = false;
            }
            
        }

    }
}
