package main;

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		float [] numbers = new float [3];
		
		numbers [0] = scan.nextFloat();
		numbers [1] = scan.nextFloat();
		numbers [2] = scan.nextFloat();
		
		Arrays.sort(numbers);
	
	    if (numbers[2] >= numbers[1] + numbers[0]){
	        System.out.println("NAO FORMA TRIANGULO");
	    } else {
		if (numbers[2] * numbers[2] == numbers[1] * numbers[1] + numbers[0] * numbers[0]){
	        System.out.println("TRIANGULO RETANGULO");
	    }
	    if (numbers[2] * numbers[2] > numbers[1] * numbers[1] + numbers[0] * numbers[0]){
	        System.out.println("TRIANGULO OBTUSANGULO");
	    }
	    if (numbers[2] * numbers[2] < numbers[1] * numbers[1] + numbers[0] * numbers[0]){
	        System.out.println("TRIANGULO ACUTANGULO");
	    }
	    if (numbers [2] == numbers[1] && numbers[1] == numbers[0]){
	        System.out.println("TRIANGULO EQUILATERO");
	    }
	    else if (numbers[0] == numbers[1] || numbers[1] == numbers[2] || numbers[0] == numbers[2]){
	        System.out.println("TRIANGULO ISOSCELES");
	    }
	  }
   }
}
