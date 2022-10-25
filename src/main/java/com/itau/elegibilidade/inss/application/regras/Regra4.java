package com.itau.elegibilidade.inss.application.regras;

import com.itau.elegibilidade.inss.application.regras.convenio.Convenios;
import com.itau.elegibilidade.inss.application.regras.dominio.Dominios;
import com.itau.elegibilidade.inss.application.regras.modalidade.Modalidades;
import com.itau.elegibilidade.inss.entrypoint.RegraRequest;
import org.springframework.stereotype.Component;

@Component
public class Regra4 implements Regra {

    ParametrosRegra parametros = new ParametrosRegra(
            Convenios.INSS.codigo,
            Dominios.OP.codigo,
            Modalidades.PCON.codigo);

    @Override
    public void executar(RegraRequest request) {

        if (parametros.respeitaRequest(request))
            System.out.println("Executando regra 4");
    }
}
