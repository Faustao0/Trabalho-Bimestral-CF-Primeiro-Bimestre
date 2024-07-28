package com.mycompany.clinicaveterinaria.model;

import com.mycompany.clinicaveterinaria.domain.TipoServicoEnum;
import java.util.Date;

public class Medicamento extends Servico{
    
    private String nomeMedicamento;
    private String fabricante;
    

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
