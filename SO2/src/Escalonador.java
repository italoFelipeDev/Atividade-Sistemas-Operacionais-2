public interface Escalonador {

    public Processo getProcesso();

    public void excluirProcesso(Processo processo);

    public void incluirProcesso(Processo processo);

    public Boolean hasProcesso();
}