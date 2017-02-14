/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brian Snyder
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    private static int number, guess, maxValue;
    
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        number = rand.nextInt(100);
        
        while (guess != number){
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            
            if (guess < number){
                System.out.println("Too low");
            }
            if (guess > number){
                System.out.println("Too high");
            }
        }
        System.out.println("You won!");
    }
    
}
