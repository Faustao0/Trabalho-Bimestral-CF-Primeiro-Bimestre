package com.mycompany.clinicaveterinaria.domain;

public enum TipoServicoEnum {
    
    CONSULTA("Tipo de Seriço: Consulta"),
    VACINACAO("Tipo de Serviço: Vacinação"),
    MEDICAMENTO("Tipo de Serviço: Medicamentos"),
    BANHO_E_TOSA("Tipo de Serviço: Banho e Tosa"),
    EXAME("Tipo de Serviço: Exame");
    
    private String descricao;

    private TipoServicoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
