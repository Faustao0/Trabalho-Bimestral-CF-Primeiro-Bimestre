package com.mycompany.clinicaveterinaria.model;

import java.util.Date;

public class MedicosVeterinarios extends Pessoa{
    
    private String crm;
    private String especialidade;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
