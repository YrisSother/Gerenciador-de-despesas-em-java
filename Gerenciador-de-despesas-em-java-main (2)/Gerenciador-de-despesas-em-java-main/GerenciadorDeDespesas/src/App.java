import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Usuario obj = new Usuario();
        obj.nome();
        obj.mensalidade();
        obj.opcoes();

        sc.close();
    }
}
