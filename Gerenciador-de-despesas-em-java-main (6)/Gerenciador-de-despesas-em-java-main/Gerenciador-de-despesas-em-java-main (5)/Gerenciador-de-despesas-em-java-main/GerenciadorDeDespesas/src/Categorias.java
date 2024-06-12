import java.util.Scanner;

public class Categorias {

    Scanner sc = new Scanner(System.in);
    DespesaJava despesaJava = new DespesaJava(0);
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
                        despesaJava.adicionarDespesa(null, num);
                        CategoriaOpcoes();

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
                    float totaldespesasVariaveis = somaDespesa.somarDespesas(despesaJava.despesasVariaveis);
                    float totaldespesasOpcionais = somaDespesa.somarDespesas(despesaJava.despesasOpcionais);
                    float totaldespesasEmergenciais = somaDespesa.somarDespesas(despesaJava.despesasEmergenciais);
                    float totaldespesasInvestimentos = somaDespesa.somarDespesas(despesaJava.despesasInvestimentos);
                    System.out.println("Total de despesas fixas: R$" + totalDespesasFixas);
                    System.out.println("Total de despesas variaveis: R$" + totaldespesasVariaveis);
                    System.out.println("Total de despesas opcionais: R$" + totaldespesasOpcionais);
                    System.out.println("Total de despesas emergenciais: R$" + totaldespesasEmergenciais);
                    System.out.println("Total de despesas investimentos: R$" + totaldespesasInvestimentos);

                    despesaJava.SaldoAtual();
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
