package SistemaTransportes;

class BusFactory implements TransportFactory {
    private int capacidade;
    private String metodoPagamento;
    private String rotaPartida;
    private String rotaDestino;

    public BusFactory(int capacidade, String metodoPagamento, String rotaPartida, String rotaDestino) {
        this.capacidade = capacidade;
        this.metodoPagamento = metodoPagamento;
        this.rotaPartida = rotaPartida;
        this.rotaDestino = rotaDestino;
    }

    public Transport criarTransporte() {
        return new Bus(capacidade, metodoPagamento, rotaPartida, rotaDestino);
    }
}