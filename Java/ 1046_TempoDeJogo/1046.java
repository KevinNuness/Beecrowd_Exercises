import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int startAt = scan.nextInt();
		int finishAt = scan.nextInt();
		
		if (finishAt > startAt){
		    
		int total = finishAt - startAt;
		System.out.println("O JOGO DUROU " +total+ " HORA(S)");
		}
		
		else if (finishAt == startAt) {
		    System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		else {
		    int firstDay = 24 - startAt;
		    int tot = firstDay + finishAt;
		     System.out.println("O JOGO DUROU " +tot+ " HORA(S)");
		}
	}
}
