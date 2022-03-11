import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GerenteTest {

    //Teste1

    @Test
    public void deveCriarCrachaVendedor(){
        AbstractFabric fabric = new FabricaVendedor();
        Gerente gerente = new Gerente(fabric);
        assertEquals("Crachá vendedor", gerente.emitirCracha());

    }

    //Teste 2

    @Test
    public void deveEmitirNotaFiscalVendedor(){
        AbstractFabric fabric = new FabricaVendedor();
        Gerente gerente = new Gerente(fabric);
        assertEquals("nota fiscal emitida", gerente.emitirNotaFiscal());
    }


}