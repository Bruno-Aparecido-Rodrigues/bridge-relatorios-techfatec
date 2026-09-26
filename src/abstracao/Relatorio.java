package abstracao;

import implementacao.FormatoExportacao;
import java.util.Objects;

/**
 * Abstraction do padrão Bridge.
 * Mantém uma referência (agregação) para o Implementor, recebida via construtor.
 * Nenhuma classe deste pacote instancia um exportador concreto.
 */
public abstract class Relatorio {

    protected FormatoExportacao exportador;

    public Relatorio(FormatoExportacao exportador) {
        this.exportador = Objects.requireNonNull(exportador, "O exportador não pode ser nulo.");
    }

    /** Permite trocar o formato em tempo de execução (a "ponte" é substituível). */
    public void setExportador(FormatoExportacao exportador) {
        this.exportador = Objects.requireNonNull(exportador, "O exportador não pode ser nulo.");
    }

    public abstract void gerarRelatorio();
}