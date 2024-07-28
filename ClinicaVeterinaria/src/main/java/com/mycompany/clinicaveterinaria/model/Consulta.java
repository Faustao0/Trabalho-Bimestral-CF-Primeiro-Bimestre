package com.mycompany.clinicaveterinaria.model;

import java.util.List;

public class Consulta extends Servico{
    
    private List<Medicamento> medicamentos;
    private List<Exame> exames;

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }
  
}
