package com.mycompany.clinicaveterinaria.model;

import java.util.Date;

public class Proprietario extends Pessoa{
    
    private Date dtcadastro;

    public Date getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(Date dtcadastro) {
        this.dtcadastro = dtcadastro;
    }
}
