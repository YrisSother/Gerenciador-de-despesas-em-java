import java.util.Scanner;

public class Categorias {
    Scanner sc = new Scanner(System.in);
    DespesaJava despesaJava;

    public Categorias(double saldoInicial) {
        this.despesaJava = new DespesaJava(saldoInicial);
    }

    int num;
    int opc;

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
        do {
            System.out.println(
                    "Insira 1 para adicionar, 2 para remover uma despesa, 3 para ver o saldo e a soma, e 4 para sair:");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    do {
                        CategoriaOpcoes();
                        despesaJava.categorias2(num);
                    } while (num != 6);
                    break;
                case 2:
                    do {
                        CategoriaOpcoes();
                        despesaJava.removerDespesa(num);
                    } while (num != 6);
                    break;
                case 3:
                    Conta somaDespesa = new Conta();
                    float totalDespesasFixas = somaDespesa.somarDespesas(despesaJava.despesasFixas);
                    float totalDespesasVariaveis = somaDespesa.somarDespesas(despesaJava.despesasVariaveis);
                    float totalDespesasOpcionais = somaDespesa.somarDespesas(despesaJava.despesasOpcionais);
                    float totalDespesasEmergenciais = somaDespesa.somarDespesas(despesaJava.despesasEmergenciais);
                    float totalDespesasInvestimentos = somaDespesa.somarDespesas(despesaJava.despesasInvestimentos);
                    System.out.println("Total de despesas fixas: R$" + totalDespesasFixas);
                    System.out.println("Total de despesas variáveis: R$" + totalDespesasVariaveis);
                    System.out.println("Total de despesas opcionais: R$" + totalDespesasOpcionais);
                    System.out.println("Total de despesas emergenciais: R$" + totalDespesasEmergenciais);
                    System.out.println("Total de despesas investimentos: R$" + totalDespesasInvestimentos);

                    despesaJava.saldoAtual();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opc != 4);
    }
}
