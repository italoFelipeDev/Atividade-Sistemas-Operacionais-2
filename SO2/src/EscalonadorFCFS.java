import java.util.ArrayList;
import java.util.List;

public class EscalonadorFCFS implements Escalonador{

    List<Processo> processos = new ArrayList<>();

    @Override
    public Processo getProcesso() {
        return processos.get(0);
    }

    @Override
    public void excluirProcesso(Processo processo) {
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
