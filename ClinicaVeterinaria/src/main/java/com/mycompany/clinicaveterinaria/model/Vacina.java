package com.mycompany.clinicaveterinaria.model;

import com.mycompany.clinicaveterinaria.domain.TipoServicoEnum;
import java.util.Date;

public class Vacina extends Servico{
    
    private String nomeVacina;
    private String fabricante;
    private Date segundaDose;    

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Date getSegundaDose() {
        return segundaDose;
    }

    public void setSegundaDose(Date segundaDose) {
        this.segundaDose = segundaDose;
    }
       
}
