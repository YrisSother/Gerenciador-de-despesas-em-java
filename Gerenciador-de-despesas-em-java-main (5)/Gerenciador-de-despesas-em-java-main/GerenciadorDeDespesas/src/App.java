import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario obj = new Usuario();
        
        Categorias obj2 = new Categorias();

        DespesaJava obj3 = new DespesaJava();
        
        obj.nome();
        obj3.mensalidade();
        obj2.opcoes();

        sc.close();
    }
}
