package com.mycompany.clinicaveterinaria.model;

public class BanhoTosa extends Servico{
    
    private boolean banhoOuTosaMarcado;

    public boolean isBanhoOuTosaMarcado() {
        return banhoOuTosaMarcado;
    }

    public void setBanhoOuTosaMarcado(boolean banhoOuTosaMarcado) {
        this.banhoOuTosaMarcado = banhoOuTosaMarcado;
    }
}
