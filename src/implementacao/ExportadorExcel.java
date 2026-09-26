package implementacao;

import java.util.List;

public class ExportadorExcel implements FormatoExportacao {

    private int linhaAtual;

    @Override
    public void desenharCabecalho(String titulo) {
        linhaAtual = 1;
        System.out.println("[XLSX] Criando planilha 'Plan1'...");
        System.out.println("[XLSX] A" + linhaAtual + " (mesclada, negrito): " + titulo);
        linhaAtual++;
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        for (String linha : dados) {
            System.out.println("[XLSX] A" + linhaAtual + ": " + linha);
            linhaAtual++;
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[XLSX] Aplicando autoajuste de colunas...");
        System.out.println("[XLSX] Arquivo 'relatorio.xlsx' gerado com sucesso.");
    }
}