import java.util.List;

public class Conta {
    public float somarDespesas(List<Des> despesas) {
        float total = 0;
        for (Des despesa : despesas) {
            total += despesa.valor;
        }
        return total;
    }
}
