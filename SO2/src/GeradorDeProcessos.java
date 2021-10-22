import java.util.Random;

public class GeradorDeProcessos {

    private Long idAtual = 0l;

    public static final Long INCREMENTADOR_ID = 1L;

    public static final Integer VALOR_MAXIMO = 50;

    public static final Integer VALOR_MINIMO = 10;

    public static final Integer DIFERENCA = VALOR_MAXIMO - VALOR_MINIMO;

    public Long gerarQtdInstrucoes(){
        Random gerador = new Random(System.currentTimeMillis());
        return (long) (gerador.nextInt(DIFERENCA) + VALOR_MINIMO);
    }
    public Processo gerarProcesso(){
        this.idAtual += INCREMENTADOR_ID;
        Processo processo = new Processo(this.idAtual, this.gerarQtdInstrucoes());
        return processo;
    }
}

