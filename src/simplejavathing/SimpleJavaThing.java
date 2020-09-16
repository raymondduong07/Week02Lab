/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejavathing;
import java.util.Scanner;
/**
 *
 * @author rayfi
 */
public class SimpleJavaThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, how old are you?");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");
    }
    
}