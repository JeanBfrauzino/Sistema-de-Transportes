package SistemaTransportes;

abstract class TransportationFactory {
    public abstract TransportFactory getFactory(String tipo);
}
