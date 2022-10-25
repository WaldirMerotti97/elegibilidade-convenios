package com.itau.elegibilidade.inss.application.regras;

import com.itau.elegibilidade.inss.application.regras.convenio.Convenios;
import com.itau.elegibilidade.inss.application.regras.dominio.Dominios;
import com.itau.elegibilidade.inss.application.regras.modalidade.Modalidades;
import com.itau.elegibilidade.inss.entrypoint.RegraRequest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

@Component
public class Regra2 implements Regra {

    ParametrosRegra parametros = new ParametrosRegra(
            Convenios.IPSEMG.codigo,
            Dominios.OP.codigo,
            Modalidades.PORTABILIDADE.codigo);

    @Override
    public void executar(RegraRequest request) {

        if (parametros.respeitaRequest(request))
            System.out.println("Executando regra 2");
    }
}
