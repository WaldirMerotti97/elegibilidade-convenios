package com.itau.elegibilidade.inss.application.regras.convenio;

public enum Convenios {

    INSS(1581),
    IPSEMG(3);

    public final Integer codigo;

    Convenios(Integer codigo) {
        this.codigo = codigo;
    }
}
