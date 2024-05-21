package SistemaTransportes;

class Bus implements Transport {
    private int capacidade;
    private String metodoPagamento;
    private String rotaPartida;
    private String rotaDestino;
    private int passageirosAtuais;

    public Bus(int capacidade, String metodoPagamento, String rotaPartida, String rotaDestino) {
        this.capacidade = capacidade;
        this.metodoPagamento = metodoPagamento;
        this.rotaPartida = rotaPartida;
        this.rotaDestino = rotaDestino;
        this.passageirosAtuais = 0;
    }

    public void exibirDetalhes() {
        System.out.println("Ônibus - Capacidade: " + capacidade + ", Método de Pagamento: " + metodoPagamento + 
                           ", Rota: " + rotaPartida + " -> " + rotaDestino);
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
