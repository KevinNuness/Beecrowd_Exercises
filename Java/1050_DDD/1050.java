import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        HashMap<String, String> dddMap = new HashMap<>();
        dddMap.put("61", "Brasilia");
        dddMap.put("71", "Salvador");
        dddMap.put("11", "Sao Paulo");
        dddMap.put("21", "Rio de Janeiro");
        dddMap.put("32", "Juiz de Fora");
        dddMap.put("19", "Campinas");
        dddMap.put("27", "Vitoria");
        dddMap.put("31", "Belo Horizonte");

        String dddConsulta = scan.nextLine();
        String dddCidade = dddMap.get(dddConsulta);
        
        if (dddCidade != null ){
        System.out.println(dddCidade);}
        
        else{
        System.out.println("DDD nao cadastrado");}
    }
}
