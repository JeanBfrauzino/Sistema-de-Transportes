package SistemaTransportes;

class Subway implements Transport {
    private int capacidade;
    private double velocidadeMedia;
    private String linhaPartida;
    private String linhaDestino;
    private int passageirosAtuais;

    public Subway(int capacidade, double velocidadeMedia, String linhaPartida, String linhaDestino) {
        this.capacidade = capacidade;
        this.velocidadeMedia = velocidadeMedia;
        this.linhaPartida = linhaPartida;
        this.linhaDestino = linhaDestino;
        this.passageirosAtuais = 0;
    }

    public void exibirDetalhes() {
        System.out.println("Metrô - Capacidade: " + capacidade + ", Velocidade Média: " + velocidadeMedia + " km/h, " +
                           "Linha: " + linhaPartida + " -> " + linhaDestino);
    }

    public void embarcarPassageiros(int numero) {
        if (passageirosAtuais + numero <= capacidade) {
            passageirosAtuais += numero;
            System.out.println(numero + " passageiros embarcaram. Passageiros atuais: " + passageirosAtuais);
        } else {
            System.out.println("Capacidade excedida! Não é possível embarcar mais passageiros.");
        }
    }

    public void desembarcarPassageiros(int numero) {
        if (passageirosAtuais >= numero) {
            passageirosAtuais -= numero;
            System.out.println(numero + " passageiros desembarcaram. Passageiros atuais: " + passageirosAtuais);
        } else {
            System.out.println("Número de passageiros para desembarcar excede os passageiros atuais!");
        }
    }

    public int obterCapacidade() {
        return capacidade;
    }
}
