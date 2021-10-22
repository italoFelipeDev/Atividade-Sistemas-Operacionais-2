public class Main {
    public static void main(String[] args) {
        CPU cpuFCFS = new CPU(new EscalonadorFCFS());
        CPU cpuSJF = new CPU(new EscalonadorSJF());
        CPU cpuRoundRobin = new CPU(new EscalonadorRoundRobin());

        GeradorDeProcessos geradorDeProcessos = new GeradorDeProcessos();

        cpuFCFS.escalonador.incluirProcesso(geradorDeProcessos.gerarProcesso());
        cpuFCFS.escalonador.incluirProcesso(geradorDeProcessos.gerarProcesso());
        cpuFCFS.escalonador.incluirProcesso(geradorDeProcessos.gerarProcesso());

        cpuRoundRobin.escalonador.incluirProcesso(geradorDeProcessos.gerarProcesso());
        cpuRoundRobin.escalonador.incluirProcesso(geradorDeProcessos.gerarProcesso());
        cpuRoundRobin.escalonador.incluirProcesso(geradorDeProcessos.gerarProcesso());

        cpuSJF.escalonador.incluirProcesso(geradorDeProcessos.gerarProcesso());
        cpuSJF.escalonador.incluirProcesso(geradorDeProcessos.gerarProcesso());
        cpuSJF.escalonador.incluirProcesso(geradorDeProcessos.gerarProcesso());

        cpuFCFS.executarProcesso();

        cpuSJF.executarProcesso();

        cpuRoundRobin.executarProcesso();
    }
}
