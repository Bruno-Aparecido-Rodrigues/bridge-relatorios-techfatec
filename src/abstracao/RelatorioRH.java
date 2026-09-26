package abstracao;

import implementacao.FormatoExportacao;
import java.util.List;

public class RelatorioRH extends Relatorio {

    public RelatorioRH(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        exportador.desenharCabecalho("Relatório de Desempenho de RH");
        exportador.desenharCorpo(obterDados());
        exportador.finalizarArquivo();
    }

    private List<String> obterDados() {
        return List.of(
            "Ana Souza - Desenvolvimento - Avaliação: 9,2",
            "Carlos Lima - Suporte - Avaliação: 8,5",
            "Fernanda Rocha - Comercial - Avaliação: 9,7",
            "Média geral da equipe: 9,1"
        );
    }
}