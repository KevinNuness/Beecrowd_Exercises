import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contagem = 0;
        double soma = 0; 

        for (int i = 0; i < 6; i++) {
            double num = sc.nextDouble();
            if (num > 0) {
                soma += num;
                contagem++;
            }
        }

        System.out.println(contagem + " valores positivos");
        System.out.printf("%.1f\n", soma / contagem);

    }
}
