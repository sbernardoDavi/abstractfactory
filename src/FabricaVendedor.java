public class FabricaVendedor implements AbstractFabric{

    @Override
    public Cracha criarCracha() {
        return new CrachaVendedor();
    }

    @Override
    public NotaFiscal emitirNotaFiscal(){
        return new NotaFiscalVendedor();
    }
}
