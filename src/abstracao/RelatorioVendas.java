package abstracao;

import implementacao.FormatoExportacao;
import java.util.List;

public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        exportador.desenharCabecalho("Relatório de Vendas");
        exportador.desenharCorpo(obterDados());
        exportador.finalizarArquivo();
    }

    private List<String> obterDados() {
        return List.of(
            "Notebook Dell - 12 unidades - R$ 54.000,00",
            "Monitor LG 24\" - 30 unidades - R$ 27.000,00",
            "Teclado Mecânico - 45 unidades - R$ 13.500,00",
            "TOTAL: R$ 94.500,00"
        );
    }
}