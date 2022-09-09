/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.truth.lorenzo.java;

/**
 *
 * @author TRUTH
 */
import java.util.Scanner;
public class Ex01TruthLorenzoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
Scanner sc = new Scanner(System.in);
    System.out.print("What is your name?");
    String name=sc.nextLine();
    System.out.printf("Hi, %s.", name);
    int age = Integer.parseInt(sc.nextLine());*/
    
    String studentA = "Jerome";
    String studentB= "Anna";
    String studentC = "Yeng";
    int studentAge= 12;
    int studentBge=13;
    int studentCge=18;
    double decimalJerome= 3.14 ;
    double decimalAnna= 2.09834321111 ;
    double decimalYeng = -4.322222222333 ;
    System.out.print("Student 1\n");
    System.out.println("Name: " + studentA);
    System.out.println("Age: " + studentAge);
    System.out.println("Favorite Decimal: " + decimalJerome);
    
    System.out.print("\nStudent 2\n");
    System.out.println("Name: " + studentB);
    System.out.println("Age: " + studentBge);
    System.out.println("Favorite Decimal: " + decimalAnna);
    
    System.out.print("\nStudent 3\n");
    System.out.println("Name: " + studentC);
    System.out.println("Age: " + studentCge);
    System.out.println("Favorite Decimal: " + decimalYeng);
    
    System.out.print("\nPositive or Negative\n");
    if(decimalJerome > 0){
        System.out.println("The number: " + decimalJerome + " is positive");
    }
    else{System.out.println("The number: " + decimalJerome + " is negative") ;}
    
       if(decimalJerome > 0){
        System.out.println("The number: " + decimalAnna + " is positive");
    }
    else{System.out.println("The number: " + decimalAnna + " is negative") ;}
          if(decimalJerome > 0){
        System.out.println("The number: " + decimalYeng + " is positive");
    }
    else{System.out.println("The number: " + decimalYeng + " is negative") ;}
    
          
    System.out.print("\nOldest and Youngest\n");
    if (studentAge > studentBge) {
        System.out.println(studentA + " is older than " + studentB);
        
    }
    else {
        System.out.println(studentB + " is older than " + studentA);
        
    
                }
        if (studentBge > studentCge) {
        System.out.println(studentB + " is older than " + studentC);
        
    }
    else {
        System.out.println(studentC + " is older than " + studentB);
        
    
                }
        if (studentAge > studentCge) {
        System.out.println(studentA + " is older than " + studentC);
        
    }
    else {
        System.out.println(studentC + " is older than " + studentA);
        
    
                }
        
    
    
    
    
    
    
    }
    }
   
