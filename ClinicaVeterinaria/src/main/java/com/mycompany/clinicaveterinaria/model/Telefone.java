package com.mycompany.clinicaveterinaria.model;

public class Telefone {
    
    private String numero;
    private String marca;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return numero + ", Marca: " + marca;
    }
}
