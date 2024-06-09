import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Des {

    String titulo;
    float valor;

    Des(String titulo, float valor) {
        this.titulo = titulo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Despesa [titulo=" + titulo + ", valor=R$" + valor + "]";
    }
}

public class DespesaJava {

    Scanner sc = new Scanner(System.in);

    public void Template() {
        DateFormat formaData = new SimpleDateFormat("HH:mm:ss");
        Date data = new Date();
        System.out.println(formaData.format(data));
    }

    ArrayList<Des> despesasFixas = new ArrayList<>();
    ArrayList<Des> despesasVariaveis = new ArrayList<>();
    ArrayList<Des> despesasOpcionais = new ArrayList<>();
    ArrayList<Des> despesasEmergenciais = new ArrayList<>();
    ArrayList<Des> despesasInvestimentos = new ArrayList<>();

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

    public void adicionarDespesa(ArrayList<Des> lista, String categoria) {
        System.out.println("Digite o título da despesa para " + categoria + ": ");
        String titulo = sc.nextLine();
        System.out.println("Digite o valor da despesa da categoria " + categoria + ": ");
        float valor = sc.nextFloat();
        sc.nextLine(); 

        Des despesa = new Des(titulo, valor);
        lista.add(despesa);
        System.out.println("Despesa adicionada na categoria " + categoria + ".");
    }

    public void removerDespesas(ArrayList<Des> lista, String categoria) {
        System.out.println("Despesas na categoria " + categoria + ":");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i));
        }
        System.out.println("Digite o índice da despesa para remover da categoria " + categoria + ": ");
        int index = sc.nextInt();
        sc.nextLine(); 

        if (index >= 0 && index < lista.size()) {
            lista.remove(index);
            System.out.println("Despesa removida da categoria " + categoria + ".");
        } else {
            System.out.println("Índice inválido. Tente novamente.");
        }
    }
}
