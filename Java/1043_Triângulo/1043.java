package main;

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
  
        float p = 0; 
		float A = scan.nextFloat();
		float B = scan.nextFloat();
		float C = scan.nextFloat();
		
		float[] numbers = new float [3];
		  numbers[0] = A;
		  numbers[1] = B;
		  numbers[2] = C;
		  
		  Arrays.sort(numbers);
		  
		  if ((numbers[0] + numbers[1]) > numbers[2]){
		      
		      for (int i = 0; i < numbers.length; i++){
		         p += numbers [i];
		      }
		      
		      System.out.println(String.format("Perimetro = %.1f", p));
		  }
		  
		  else {
		      
		      float a = ((A + B) * C)/2;
		      System.out.println(String.format("Area = %.1f", a));
		  }
     }
}
