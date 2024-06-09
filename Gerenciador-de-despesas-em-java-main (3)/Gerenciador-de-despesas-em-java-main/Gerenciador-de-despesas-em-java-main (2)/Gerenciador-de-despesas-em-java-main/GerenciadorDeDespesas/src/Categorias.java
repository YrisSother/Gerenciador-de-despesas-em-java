import java.util.Scanner;

public class Categorias {

    Scanner sc = new Scanner(System.in);
    int num;

    void OCategoria() {

        System.out.println("CATEGORIAS: ");
        System.out.println("1 - Despesas fixas");
        System.out.println("2 - Despesas variáveis");
        System.out.println("3 - Despesas opcionais");
        System.out.println("4 - Despesas emergenciais");
        System.out.println("5 - Despesas de investimentos");
        System.out.println("6 - Sair");
        System.out.println();
    }

    void OOpcoes() {
        System.out.println("Escolha uma categoria (1 - 6): ");
        num = sc.nextInt();
        sc.nextLine(); 
    }

    public void CategoriaOpcoes() {
        OCategoria();
        OOpcoes();

    }

    public void opcoes() {

        System.out.println("Insira 1 para adicionar e insira 2 para remover uma despesa:");
        int opc = sc.nextInt();
        sc.nextLine(); 

        switch (opc) {
            case 1:
                CategoriaOpcoes();
                break;
            case 2:
                CategoriaOpcoes();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

}
