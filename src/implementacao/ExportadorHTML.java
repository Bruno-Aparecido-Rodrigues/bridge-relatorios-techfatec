package implementacao;

import java.util.List;

public class ExportadorHTML implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[HTML] <!DOCTYPE html>");
        System.out.println("[HTML] <html><head><meta charset=\"UTF-8\"><title>" + titulo + "</title></head>");
        System.out.println("[HTML] <body>");
        System.out.println("[HTML]   <h1>" + titulo + "</h1>");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[HTML]   <ul>");
        for (String linha : dados) {
            System.out.println("[HTML]     <li>" + linha + "</li>");
        }
        System.out.println("[HTML]   </ul>");
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[HTML] </body></html>");
        System.out.println("[HTML] Arquivo 'relatorio.html' gerado com sucesso.");
    }
}