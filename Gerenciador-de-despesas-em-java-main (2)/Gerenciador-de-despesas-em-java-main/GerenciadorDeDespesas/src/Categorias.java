import java.util.Scanner;
import java.util.ArrayList;

public class Categorias {

    Scanner sc = new Scanner(System.in);
    ArrayList<Despesa> despesasFixas = new ArrayList<>();
    ArrayList<Despesa> despesasVariaveis = new ArrayList<>();
    ArrayList<Despesa> despesasOpcionais = new ArrayList<>();
    ArrayList<Despesa> despesasEmergenciais = new ArrayList<>();
    ArrayList<Despesa> despesasInvestimentos = new ArrayList<>();

    class Despesas {

        String titulo;
        int valor;

        Despesas(String titulo, int valor) {

            this.titulo = titulo;
            this.valor = valor;

        }

        @Override
        public String toString() {
            return "titulo: " + titulo + ", valor: R$" + valor;
        }
    }

    public void categorias2() {

        int num;

        do {

            System.out.println("\n CATEGORIAS: \n");
            System.out.println("\n");

            System.out.println(" 1 - Despesas fixas");
            System.out.println("2 - Despesas váriaveis");
            System.out.println("3 - Despesas Opcionais");
            System.out.println("4 - Despesas emergenciais");
            System.out.println("5 - Despesas de investimentos");

            System.out.println("Escolha uma categoria (1 - 5): ");
            num = sc.nextInt();


            switch (num) {

                case 1:

                    adicionarDespesa(despesasFixas, "Despesas Fixas: ");
                    
                    break;

                case 2:

                    adicionarDespesas(despesasVariaveis, "Despesas váriaveis: ");

                    break;

                case 3:

                    adicionarDespesa(despesasOpcionais, "Despesas Opcionais: ");

                    break;

                case 4:

                    

                    break;

                default:
                    throw new AssertionError();
            } while
        }

    }

    
}
