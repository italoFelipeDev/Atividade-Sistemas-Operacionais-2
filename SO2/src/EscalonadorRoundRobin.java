import java.util.ArrayList;
import java.util.List;

public class EscalonadorRoundRobin  implements Escalonador{

    List<Processo> processos = new ArrayList<>();

    public Processo getProcesso() {
            return processos.get(0);
    }

    public void interromperProcesso () {
        processos.add(processos.get(0));
        processos.remove(0);
    }

    public void excluirProcesso(Processo processo) {
        if (processo.hasInstrucao()){
            interromperProcesso();
        }
        processos.remove(processo);
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
