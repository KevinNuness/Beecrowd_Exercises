package main;

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	int [] numbers = new int [2];
	numbers [0] = scan.nextInt();
	numbers [1] = scan.nextInt();
	
	Arrays.sort(numbers);
	
	if (numbers [1] % numbers [0] == 0){
	    System.out.println("Sao Multiplos");
	}
	else{
	    System.out.println("Nao sao Multiplos");
	}
  }
}
