package com.itau.elegibilidade.inss.application.regras;

import com.itau.elegibilidade.inss.entrypoint.RegraRequest;

public interface Regra {

    void executar(RegraRequest request);
}
