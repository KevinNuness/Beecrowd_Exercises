import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        float salario = scan.nextFloat();
        int percentual = 0;
        
        if (salario <= 400.00){
            percentual = 15;
        } else if (salario <= 800.00){
            percentual = 12;
        } else if (salario <= 1200.00){
            percentual = 10;
        } else if (salario <= 2000.00){
            percentual = 7;
        } else {
            percentual = 4; }
        
        float reajuste = (salario * (percentual / 100.0f));
        float salario_novo = (reajuste + salario);
        
        System.out.printf("Novo salario: %.2f\n", salario_novo);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);
	}
}
