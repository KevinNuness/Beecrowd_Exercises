package main;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int[] numbers = new int[3];
        numbers[0] = A;
        numbers[1] = B;
        numbers[2] = C;
        
        Arrays.sort(numbers);
        
        for (int number : numbers) {
            System.out.println(number); 
        }
        
        System.out.println();
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
