package com.itau.elegibilidade.inss.application.regras;

import com.itau.elegibilidade.inss.application.regras.convenio.Convenios;
import com.itau.elegibilidade.inss.application.regras.dominio.Dominios;
import com.itau.elegibilidade.inss.application.regras.modalidade.Modalidades;
import com.itau.elegibilidade.inss.entrypoint.RegraRequest;
import org.springframework.stereotype.Component;

@Component
public class Regra7 implements Regra {

    ParametrosRegra parametros = new ParametrosRegra(
            Convenios.IPSEMG.codigo,
            Dominios.OP.codigo,
            Modalidades.PORTABILIDADE.codigo);

    @Override
    public void executar(RegraRequest request) {

        if (parametros.respeitaRequest(request))
            System.out.println("Executando regra 7");
    }
}
