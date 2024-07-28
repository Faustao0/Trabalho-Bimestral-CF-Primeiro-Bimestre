package com.mycompany.clinicaveterinaria.model;

public class Animal {
    
    private int id;
    private String nome;
    private String especie;
    private String historicossaude;
    private int idade;
    private String raca;
    private Double peso;
    private Proprietario proprietario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHistoricossaude() {
        return historicossaude;
    }

    public void setHistoricossaude(String historicossaude) {
        this.historicossaude = historicossaude;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + ", especie=" + especie + ", historicossaude=" + historicossaude + ", idade=" + idade + ", raca=" + raca + ", peso=" + peso + ", proprietario=" + proprietario + '}';
    }

   

}