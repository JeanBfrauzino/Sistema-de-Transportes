package SistemaTransportes;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de transporte para criar:");
        System.out.println("1. Ônibus");
        System.out.println("2. Metrô");
        System.out.print("Digite o número correspondente ao tipo de transporte: ");
        
        int escolha = scanner.nextInt();
        TransportationFactory transportationFactory = null;
        TransportFactory factory = null;

        switch (escolha) {
            case 1:
                System.out.print("Digite a capacidade do ônibus: ");
                int capacidadeOnibus = scanner.nextInt();
                scanner.nextLine(); // Consumir nova linha
                System.out.print("Digite o método de pagamento do ônibus: ");
                String metodoPagamento = scanner.nextLine();
                System.out.print("Digite a rota de partida do ônibus: ");
                String rotaPartida = scanner.nextLine();
                System.out.print("Digite a rota de destino do ônibus: ");
                String rotaDestino = scanner.nextLine();

                transportationFactory = new BusTransportationFactory(capacidadeOnibus, metodoPagamento, rotaPartida, rotaDestino);
                factory = transportationFactory.getFactory("Bus");
                break;

            case 2:
                System.out.print("Digite a capacidade do metrô: ");
                int capacidadeMetro = scanner.nextInt();
                System.out.print("Digite a velocidade média do metrô (km/h): ");
                double velocidadeMedia = scanner.nextDouble();
                scanner.nextLine(); // Consumir nova linha
                System.out.print("Digite a estação de partida do metrô: ");
                String linhaPartida = scanner.nextLine();
                System.out.print("Digite a estação de destino do metrô: ");
                String linhaDestino = scanner.nextLine();

                transportationFactory = new SubwayTransportationFactory(capacidadeMetro, velocidadeMedia, linhaPartida, linhaDestino);
                factory = transportationFactory.getFactory("Subway");
                break;

            default:
                System.out.println("Escolha inválida.");
                System.exit(0);
        }

        Transport transporte = factory.criarTransporte();
        transporte.exibirDetalhes();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma ação:");
            System.out.println("1. Embarcar passageiros");
            System.out.println("2. Desembarcar passageiros");
            System.out.println("3. Exibir detalhes do veículo");
            System.out.println("4. Sair");
            System.out.print("Digite o número correspondente à ação: ");
            
            int acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    System.out.print("Digite o número de passageiros para embarcar: ");
                    int embarque = scanner.nextInt();
                    transporte.embarcarPassageiros(embarque);
                    break;
                case 2:
                    System.out.print("Digite o número de passageiros para desembarcar: ");
                    int desembarque = scanner.nextInt();
                    transporte.desembarcarPassageiros(desembarque);
                    break;
                case 3:
                    transporte.exibirDetalhes();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Ação inválida.");
            }
        }

        scanner.close();
        
    }
}
