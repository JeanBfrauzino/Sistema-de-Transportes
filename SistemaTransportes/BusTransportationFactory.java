package SistemaTransportes;

class BusTransportationFactory extends TransportationFactory {
    private int capacidade;
    private String metodoPagamento;
    private String rotaPartida;
    private String rotaDestino;

    public BusTransportationFactory(int capacidade, String metodoPagamento, String rotaPartida, String rotaDestino) {
        this.capacidade = capacidade;
        this.metodoPagamento = metodoPagamento;
        this.rotaPartida = rotaPartida;
        this.rotaDestino = rotaDestino;
    }

    public TransportFactory getFactory(String tipo) {
        if (tipo.equalsIgnoreCase("Bus")) {
            return new BusFactory(capacidade, metodoPagamento, rotaPartida, rotaDestino);
        }
        return null;
    }
}
