
import java.util.ArrayList;

public class Conta {
    public float somarDespesas(ArrayList<Des> despesas) {
        float total = 0;
        for (Des despesa : despesas) {
            total += despesa.valor;
        }
        return total;
    }

    
}
