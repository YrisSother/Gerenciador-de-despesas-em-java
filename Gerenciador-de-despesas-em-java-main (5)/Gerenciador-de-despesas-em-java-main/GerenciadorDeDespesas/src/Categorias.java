import java.util.Scanner;

public class Categorias {

    Scanner sc = new Scanner(System.in);
    DespesaJava despesaJava = new DespesaJava();
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

        System.out.println("Insira 1 para adicionar e insira 2 para remover uma despesa e 3 para ver o saldo e a soma:");
        int opc = sc.nextInt();
        sc.nextLine(); 

        switch (opc) {
            case 1:

                do {

                    CategoriaOpcoes();
                    despesaJava.categorias2(num);
                    opcoes();

                    
                } while (num != 6);

                break;
            case 2:

                do {

                    CategoriaOpcoes();
                    despesaJava.removerDespesa(num);
                    opcoes();

                    
                } while (num != 6);
                  
                break;
            case 3:

                Conta somaDespesa = new Conta();
                float totalDespesasFixas = somaDespesa.somarDespesas(despesaJava.despesasFixas); 
                System.out.println("Total de despesas fixas: R$" + totalDespesasFixas);
                despesaJava.mostrarSaldo();
                
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

}
