import Beneficio.BeneficioAlimentacao;
import Beneficio.BeneficioFactory;
import Beneficio.IBeneficio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioAlimentacaoTest {

    @Test
    void deveRetornarAprovarBeneficioAlimentacao(){
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("Alimentacao");
        assertEquals("Benefício Alimentação Aprovado", beneficio.aprovar());
    }

    @Test
    void DeveRetornarDepositarBeneficioAlimentacao(){
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("Alimentacao");
        assertEquals("Benefício Alimentação Depositado", beneficio.depositar());
    }

}