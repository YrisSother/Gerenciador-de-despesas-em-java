import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario obj = new Usuario();
        Categorias obj2 = new Categorias();

        obj.nome();
        obj.mensalidade();
        obj2.opcoes();

        sc.close();
    }
}
