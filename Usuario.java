import java.util.Scanner;

public class Usuario {
    private String nome;

    public void nome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bem vindo(a) insira o seu nome: ");
        this.nome = sc.nextLine();
    }

    public String getNome() {
        return nome;
    }
}
