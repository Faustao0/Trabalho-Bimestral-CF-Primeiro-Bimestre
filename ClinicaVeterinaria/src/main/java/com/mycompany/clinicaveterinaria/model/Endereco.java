package com.mycompany.clinicaveterinaria.model;

public class Endereco {
    
    private String cidade;
    private String rua;
    private int nrRua;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNrRua() {
        return nrRua;
    }

    public void setNrRua(int nrRua) {
        this.nrRua = nrRua;
    }

    @Override
    public String toString() {
        return  "Cidade: "+cidade+ rua + ", Número da casa: " + nrRua;
    }
}
