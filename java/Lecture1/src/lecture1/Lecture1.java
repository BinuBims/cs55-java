/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author binu
 * name of the class always starts with capital then new word start with capital
 */
public class Lecture1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 60;
        int y = 80;
        System.out.println(x + y +"------>"+ x + y);//be careful with + after concatanetion
        System.out.println(x + y +"------>"+ (x + y));
        
        showStringEquals();
        showOutput();
        showInputOutput();
        // TODO code application logic here
//        System.out.print("Hello Everyone\n");
//        System.out.println("Hello Everyone"); //println go to a different line
//        System.out.printf("%s\n","Hello World");
//        JOptionPane.showMessageDialog(null, "EveryOne This is JOption");
//          Scanner input = new Scanner(System.in);
//          System.out.print("Enter an integer:");
//          int num = input.nextInt();
//          System.out.println("you entered "+ num);
//          
//          System.out.print("Enter a double:");
//          double d = input.nextDouble();
//          System.out.println("you entered "+ d);
//          System.out.printf("You entered:%.2f\n", d);
//          
//          System.out.print("Enter yourname:");
//          input.nextLine();
//          String name = input.nextLine();
//          System.out.println("your name is "+ name);
//          
//          System.out.print("Enter True or False:");
//          Boolean b = input.nextBoolean();
//          System.out.println("your boolean is: "+ b);
//          System.out.printf("your boolean is:%b\n", b);
//          
//          System.out.print("Enter a char: ");
//          char ch = input.next().charAt(0);
//          System.out.println("your boolean is: "+ ch);
//          System.out.printf("your boolean is:%c\n", ch);
//       
//            String s1 = "hello";
//            String s2 = "hello";
//            String s3 = new String("hello");
//            String s4 = new String("hello");
//            System.out.println("s1 == s1: " + (s1 == s2));
//            System.out.println("s1 == s3: " + (s1 == s3));
//            System.out.println("s3 == s4: " + (s4 == s3));
//            System.out.println("s1 == s3: " + s1.equals(s3));
    }
    
    public static void showStringEquals(){
            String s1 = "hello";
            String s2 = "hello";
            String s3 = new String("hello");
            String s4 = new String("hello");
            System.out.println("s1 == s1: " + (s1 == s2));
            System.out.println("s1 == s3: " + (s1 == s3));
            System.out.println("s3 == s4: " + (s4 == s3));
            System.out.println("s1 == s3: " + s1.equals(s3));
        
    }
    public static void showOutput(){
        System.out.print("Hello Everyone\n");
        System.out.println("Hello Everyone"); //println go to a different line
        System.out.printf("%s\n","Hello World");
        JOptionPane.showMessageDialog(null, "EveryOne This is JOption");
    }
    
    public static void showInputOutput(){
        Scanner input = new Scanner(System.in);
          System.out.print("Enter an integer:");
          int num = input.nextInt();
          System.out.println("you entered "+ num);
          
          System.out.print("Enter a double:");
          double d = input.nextDouble();
          System.out.println("you entered "+ d);
          System.out.printf("You entered:%.2f\n", d);
          
          System.out.print("Enter yourname:");
          input.nextLine();
          String name = input.nextLine();
          System.out.println("your name is "+ name);
          
          System.out.print("Enter True or False:");
          Boolean b = input.nextBoolean();
          System.out.println("your boolean is: "+ b);
          System.out.printf("your boolean is:%b\n", b);
          
          System.out.print("Enter a char: ");
          char ch = input.next().charAt(0);
          System.out.println("your boolean is: "+ ch);
          System.out.printf("your boolean is:%c\n", ch);
        
    }
    
}
