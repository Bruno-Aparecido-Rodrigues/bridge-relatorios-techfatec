package cliente;

import abstracao.Relatorio;
import abstracao.RelatorioRH;
import abstracao.RelatorioVendas;
import implementacao.ExportadorExcel;
import implementacao.ExportadorHTML;
import implementacao.ExportadorPDF;
import implementacao.FormatoExportacao;

public class Main {

    public static void main(String[] args) {

        // Rotina 1: Relatório de Vendas em PDF
        titulo("ROTINA 1 - Relatório de Vendas em PDF");
        FormatoExportacao pdf = new ExportadorPDF();
        Relatorio relatorioVendas = new RelatorioVendas(pdf); // injeção via construtor
        relatorioVendas.gerarRelatorio();

        // Rotina 2: mesmo objeto, formato trocado em tempo de execução
        titulo("ROTINA 2 - Mesmo Relatório de Vendas, agora em Excel");
        relatorioVendas.setExportador(new ExportadorExcel());
        relatorioVendas.gerarRelatorio();

        // Rotina 3: Relatório de RH em HTML
        titulo("ROTINA 3 - Relatório de RH em HTML");
        Relatorio relatorioRH = new RelatorioRH(new ExportadorHTML());
        relatorioRH.gerarRelatorio();
    }

    private static void titulo(String texto) {
        System.out.println();
        System.out.println("==================================================");
        System.out.println(" " + texto);
        System.out.println("==================================================");
    }
}