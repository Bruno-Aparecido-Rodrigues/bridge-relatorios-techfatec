package implementacao;

import java.util.List;

public class ExportadorPDF implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[PDF] Criando documento A4...");
        System.out.println("[PDF] Cabeçalho (fonte 18pt, negrito): " + titulo);
        System.out.println("[PDF] ----------------------------------------");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        for (String linha : dados) {
            System.out.println("[PDF]   " + linha);
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[PDF] ----------------------------------------");
        System.out.println("[PDF] Arquivo 'relatorio.pdf' gerado com sucesso.");
    }
}