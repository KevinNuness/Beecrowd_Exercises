import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int iH = scan.nextInt();
		int iM = scan.nextInt();
		int fH = scan.nextInt();
		int fM = scan.nextInt();
		
		int iT = iM + iH * 60;
		int fT = fM + fH * 60;
		
	    int total = fT - iT;
		
		if (fT <= iT){
		    total += 1440;
		}
		
		System.out.println("O JOGO DUROU " + total / 60 + " HORA(S) E " + total % 60 + " MINUTO(S)");
	}
}
