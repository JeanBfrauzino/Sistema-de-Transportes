package SistemaTransportes;

interface Transport {
    void exibirDetalhes();
    void embarcarPassageiros(int numero);
    void desembarcarPassageiros(int numero);
    int obterCapacidade();
}
