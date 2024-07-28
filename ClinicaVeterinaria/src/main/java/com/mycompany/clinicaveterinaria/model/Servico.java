package com.mycompany.clinicaveterinaria.model;

import com.mycompany.clinicaveterinaria.domain.TipoServicoEnum;
import java.util.Date;

public class Servico {
   
    private Animal animal;
    private MedicosVeterinarios medicosVeterinarios;
    private Date dtServico;
    private TipoServicoEnum tipoServicoEnum;
    private Double preco;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public MedicosVeterinarios getMedicosVeterinarios() {
        return medicosVeterinarios;
    }

    public void setMedicosVeterinarios(MedicosVeterinarios medicosVeterinarios) {
        this.medicosVeterinarios = medicosVeterinarios;
    }

    public Date getDtServico() {
        return dtServico;
    }

    public void setDtServico(Date dtServico) {
        this.dtServico = dtServico;
    }

    public TipoServicoEnum getTipoServicoEnum() {
        return tipoServicoEnum;
    }

    public void setTipoServicoEnum(TipoServicoEnum tipoServicoEnum) {
        this.tipoServicoEnum = tipoServicoEnum;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
