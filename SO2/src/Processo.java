public class Processo {
    private Long id;
    private Long quantidadeDeInstrucoes;

    public Processo(Long id, Long quantidadeDeInstrucoes) {
        this.id = id;
        this.quantidadeDeInstrucoes = quantidadeDeInstrucoes;
    }

    public void setQuantidadeDeInstrucoes(Long quantidadeDeInstrucoes){
        this.quantidadeDeInstrucoes = quantidadeDeInstrucoes;
    }

    public Long getQuantidadeDeInstrucoes() {
        return quantidadeDeInstrucoes;
    }

    public boolean hasInstrucao() {
        return quantidadeDeInstrucoes > 0;
    }

    public void decrementarInstrucoes() {
        if(quantidadeDeInstrucoes > 0){
            quantidadeDeInstrucoes -=1;
        }
    }
}
