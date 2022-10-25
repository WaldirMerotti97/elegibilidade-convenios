package com.itau.elegibilidade.inss.application.regras.dominio;

public enum Dominios {

    OP(1),
    EP(2),
    INSS(3);

    public final Integer codigo;

    Dominios(Integer codigo) {
        this.codigo = codigo;
    }

}
