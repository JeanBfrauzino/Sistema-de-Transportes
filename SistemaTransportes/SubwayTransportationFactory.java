package SistemaTransportes;

class SubwayTransportationFactory extends TransportationFactory {
    private int capacidade;
    private double velocidadeMedia;
    private String linhaPartida;
    private String linhaDestino;

    public SubwayTransportationFactory(int capacidade, double velocidadeMedia, String linhaPartida, String linhaDestino) {
        this.capacidade = capacidade;
        this.velocidadeMedia = velocidadeMedia;
        this.linhaPartida = linhaPartida;
        this.linhaDestino = linhaDestino;
    }

    public TransportFactory getFactory(String tipo) {
        if (tipo.equalsIgnoreCase("Subway")) {
            return new SubwayFactory(capacidade, velocidadeMedia, linhaPartida, linhaDestino);
        }
        return null;
    }
}
