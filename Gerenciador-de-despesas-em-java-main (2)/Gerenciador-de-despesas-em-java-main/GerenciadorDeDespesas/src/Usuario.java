import java.util.Scanner;
public class Usuario {

    Scanner sc = new Scanner(System.in);

    public void nome() {

        System.out.println("Bem vindo(a) insira o seu  nome: ");
        sc.nextLine();


    }

    public void mensalidade() {

        System.out.println("Qual o saldo disponível? :");
        sc.nextFloat();
        
    }

    public void opcoes() {

        System.out.println("Insira 1 para adicionar e insira 2 para remover uma despesa:");
        int opc = sc.nextInt();
        
        switch (opc) {

            case 1:
                
                System.out.println("Em qual categoria deseja colocar?: ");
                sc.nextInt();

                break;

            case 2:

                System.out.println("Em qual categoria deseja remover?: ");
                sc.nextInt();

                break;

            default:

                throw new AssertionError();
        } 

        sc.close();

    }
}
