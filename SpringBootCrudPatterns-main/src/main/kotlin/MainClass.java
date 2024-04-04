import com.finan.orcamento.model.OrcamentoProxy;
import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.service.OrcamentoService;
import com.finan.orcamento.OrcamentoApplication;
import com.finan.orcamento.OrcamentoApplicationKt;

public class MainClass {
    public static void main(String[] args) {
        OrcamentoProxy proxy = new OrcamentoProxy(orcamento);
        System.out.println("Valor desconto antes = " + proxy.getDescontoOrcamento());
        System.out.println("Valor desconto depois= " + proxy.getDescontoOrcamento());
    }
}
