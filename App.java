import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario();
        usuario.nome();

        System.out.print("Qual o saldo disponível? : ");
        double saldoInicial = sc.nextDouble();
        sc.nextLine(); 

        Categorias categorias = new Categorias(saldoInicial);
        categorias.opcoes();

        sc.close();
    }
}
