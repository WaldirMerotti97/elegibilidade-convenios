package com.itau.elegibilidade.inss.application.regras;

import com.itau.elegibilidade.inss.entrypoint.RegraRequest;

interface Regra {

    fun executar(request: RegraRequest)
}

