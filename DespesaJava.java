import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Des {
    String titulo;
    double valor;

    Des(String titulo, double valor) {
        this.titulo = titulo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Despesa [titulo=" + titulo + ", valor=R$" + valor + "]";
    }

    public String getTitulo() {
        return titulo;
    }
}

public class DespesaJava {
    private Scanner sc = new Scanner(System.in);
    private double saldo;

    ArrayList<Des> despesasFixas = new ArrayList<>();
    ArrayList<Des> despesasVariaveis = new ArrayList<>();
    ArrayList<Des> despesasOpcionais = new ArrayList<>();
    ArrayList<Des> despesasEmergenciais = new ArrayList<>();
    ArrayList<Des> despesasInvestimentos = new ArrayList<>();

    private String nomeArquivo = "Histórico_De_Despesas.txt";
    private DateFormat formaData = new SimpleDateFormat("HH:mm:ss");

    public DespesaJava(double initialBalance) {
        this.saldo = initialBalance;
    }

    public void categorias2(int num) {
        switch (num) {
            case 1:
                adicionarDespesa(despesasFixas, "Despesas Fixas");
                break;
            case 2:
                adicionarDespesa(despesasVariaveis, "Despesas Variáveis");
                break;
            case 3:
                adicionarDespesa(despesasOpcionais, "Despesas Opcionais");
                break;
            case 4:
                adicionarDespesa(despesasEmergenciais, "Despesas Emergenciais");
                break;
            case 5:
                adicionarDespesa(despesasInvestimentos, "Despesas de Investimentos");
                break;
            case 6:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    public void removerDespesa(int num) {
        switch (num) {
            case 1:
                removerDespesas(despesasFixas, "Despesas Fixas");
                break;
            case 2:
                removerDespesas(despesasVariaveis, "Despesas Variáveis");
                break;
            case 3:
                removerDespesas(despesasOpcionais, "Despesas Opcionais");
                break;
            case 4:
                removerDespesas(despesasEmergenciais, "Despesas Emergenciais");
                break;
            case 5:
                removerDespesas(despesasInvestimentos, "Despesas de Investimentos");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    public void adicionarDespesa(List<Des> lista, String categoria) {
        try (FileWriter writer = new FileWriter(nomeArquivo, true)) {
            Date data = new Date();
            System.out.println(formaData.format(data));

            System.out.println("Digite o título da despesa para " + categoria + ": ");
            String titulo = sc.nextLine();
            System.out.println("Digite o valor da despesa da categoria " + categoria + ": ");
            double valor = sc.nextDouble();
            sc.nextLine();

            Des despesa = new Des(titulo, valor);
            lista.add(despesa);
            saldo -= valor;

            writer.write("Categoria: " + categoria + ", Título: " + titulo + ", Valor: R$" + valor + ", Data: "
                    + formaData.format(data) + "\n");
            System.out.println("Despesa adicionada na categoria " + categoria + ".");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public void removerDespesas(List<Des> lista, String categoria) {
        System.out.println("Despesas na categoria " + categoria + ":");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i).getTitulo());
        }

        System.out.println("\nDigite o título da despesa para remover da categoria " + categoria + ": ");
        String titulo = sc.nextLine();

        int index = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTitulo().equals(titulo)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Des despesa = lista.remove(index);
            saldo += despesa.valor; 
            System.out.println("Despesa removida da categoria " + categoria + ".");
        } else {
            System.out.println("Despesa com título '" + titulo + "' não encontrada na categoria " + categoria + ".");
        }
    }

    public void saldoAtual() {
        System.out.printf("O seu saldo atual é: R$%.2f\n", saldo);
    }
}
