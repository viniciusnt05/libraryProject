package Models;

import java.util.ArrayList;
import java.util.List;

public abstract class HistoricoTransacao {
    private final List<String> historicoTransacoes = new ArrayList<>();

    public void adicionarTransacao(String detalhe) {
        historicoTransacoes.add(detalhe);
    }

    public List<String> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    // Método abstrato para obter detalhes específicos da transação
    public abstract String getDetalhesTransacao();
}
