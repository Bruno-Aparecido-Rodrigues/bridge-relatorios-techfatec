package implementacao;

import java.util.List;

/**
 * Implementor do padrão Bridge.
 * Define as operações primitivas que todo formato de exportação deve oferecer.
 */
public interface FormatoExportacao {

    void desenharCabecalho(String titulo);

    void desenharCorpo(List<String> dados);

    void finalizarArquivo();
}