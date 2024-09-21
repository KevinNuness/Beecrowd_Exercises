import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String c1 = scan.next();
		String c2 = scan.next();
		String c3 = scan.next();
		String animal = "Respostas inválidas";
		
		if (c1.equals ("vertebrado")){
		    if (c2.equals("ave")){
		        if (c3.equals("carnivoro")){
		            animal = "aguia";
		        }
		        else if (c3.equals("onivoro")){
		            animal = "pomba";
		        }
		    }
		    else if (c2.equals("mamifero")){
		        if (c3.equals("onivoro")){
		            animal = "homem";
		        }
		        else if (c3.equals ("herbivoro")){
		            animal = "vaca"; 
		        }
		    }
		}
		else if (c1.equals ("invertebrado")) {
		    if (c2.equals("inseto")){
		        if (c3.equals("hematofago")){
		            animal = "pulga";
		        }
		        else if (c3.equals("herbivoro")){
		            animal = "lagarta";
		        }
		    }
		    else if (c2.equals("anelideo")){
		        if (c3.equals("hematofago")){
		            animal = "sanguessuga";
		        }
		        else if (c3.equals ("onivoro")){
		            animal = "minhoca"; 
		        }
		    }
		}
		System.out.println(animal);
	}
}
