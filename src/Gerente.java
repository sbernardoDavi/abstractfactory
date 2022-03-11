public class Gerente {
    private Cracha cracha;
    private NotaFiscal notaFiscal;

    public Gerente(AbstractFabric fabric){
        this.cracha = fabric.criarCracha();
        this.notaFiscal = fabric.emitirNotaFiscal();
    }

    public String emitirCracha(){
        return this.cracha.criar();
    }

    public String emitirNotaFiscal(){
        return this.notaFiscal.emitir();
    }

}
