package SistemaTransportes;

class SubwayFactory implements TransportFactory {
    private int capacidade;
    private double velocidadeMedia;
    private String linhaPartida;
    private String linhaDestino;

    public SubwayFactory(int capacidade, double velocidadeMedia, String linhaPartida, String linhaDestino) {
        this.capacidade = capacidade;
        this.velocidadeMedia = velocidadeMedia;
        this.linhaPartida = linhaPartida;
        this.linhaDestino = linhaDestino;
    }

    public Transport criarTransporte() {
        return new Subway(capacidade, velocidadeMedia, linhaPartida, linhaDestino);
    }
}