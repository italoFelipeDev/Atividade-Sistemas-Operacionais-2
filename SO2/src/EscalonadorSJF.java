import java.util.ArrayList;
import java.util.List;

public class EscalonadorSJF implements Escalonador {

    List<Processo> processos = new ArrayList<>();

    @Override
    public Processo getProcesso() {
        return findShortestJob();
    }

    @Override
    public void excluirProcesso(Processo processo) {
        processos.remove(processo);
    }

    public Processo findShortestJob() {
        Processo menorProcesso = processos.get(0);
        for (int i = 1; i < processos.size(); i++) {
            Processo processo = processos.get(i);
            if (processo.getQuantidadeDeInstrucoes() < menorProcesso.getQuantidadeDeInstrucoes()) {
                menorProcesso = processo;
            }
        }
        return menorProcesso;
    }

    @Override
    public void incluirProcesso(Processo processo) {
        processos.add(processo);
    }

    @Override
    public Boolean hasProcesso() {
        return !processos.isEmpty();
    }
}
