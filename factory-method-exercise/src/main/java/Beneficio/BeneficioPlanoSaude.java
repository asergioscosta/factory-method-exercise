package Beneficio;

public class BeneficioPlanoSaude implements IBeneficio {

    public String aprovar() {
        return "Benefício Plano de Saúde Aprovado";
    }

    public String depositar() {
        return "Benefício Plano de Saúde Depositado";
    }
}
