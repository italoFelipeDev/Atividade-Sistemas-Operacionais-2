public class CPU {
    Long ciclos = 4L;
    Escalonador escalonador;

    public CPU(Escalonador escalonador){
        this.escalonador = escalonador;
    }

    public void executarProcesso() {
        System.out.println("Inicio de execução de processo");
        while(escalonador.hasProcesso()) {
            Processo processo = escalonador.getProcesso();
            for (int i = 0; i < ciclos && processo.hasInstrucao(); i++) {
                processo.decrementarInstrucoes();
                System.out.println("Processo decrementado, restam: " + processo.getQuantidadeDeInstrucoes() +"processos.");


            }
            System.out.println("Fim de clock");

            if (!processo.hasInstrucao()) {
                escalonador.excluirProcesso(processo);
                System.out.println("Processo concluido.");
            }
        }
    }
}
