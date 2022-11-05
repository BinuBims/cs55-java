/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fileprocessing;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author binu
 */
public class FileProcessing {

    public static void main(String[] args) throws Exception {
        Scanner user = new Scanner( System.in ); 
        System.out.println("please include name of the file?");
        String doc = user.nextLine();
        File infile = new File(doc);
        Scanner input = new Scanner(infile);
        File outfile = new File("out.txt");
        PrintWriter pr = new PrintWriter(outfile);
        
        
        String str = "";
        while(input.hasNext()){
            str += (" "+input.next());
        }
        
        while(input.hasNext()){
            String line = input.nextLine();
            pr.println(line);
        }
        input.close();
        pr.close();
        getVowels(str);
        getWord(str);
        
    }
    
    public static void getVowels(String x){
        int count = 0;
        for (int i = 0; i<x.length(); i++){
           if(x.charAt(i) == 'a'|| x.charAt(i) == 'e'|| 
          x.charAt(i) == 'i' || x.charAt(i) == 'o' || 
          x.charAt(i) == 'u'){
               count++;
           }
        }
        System.out.println("Total number of vowels in your document: "+count);
        
    }
    
    public static void getWord(String x){
        int count = 0;
        String [] data = x.split(" ");
        for (int i=0; i<data.length; i++){
            count++;
        }
        System.out.println("Total number of words in your document: "+(count-1));
    }
}
