package com.itau.elegibilidade.inss.application.regras.modalidade;

public enum Modalidades {

    PCON(1),
    REFIN(2),
    PORTABILIDADE(3);

    public final Integer codigo;
    Modalidades(Integer codigo) {
        this.codigo = codigo;
    }
}
