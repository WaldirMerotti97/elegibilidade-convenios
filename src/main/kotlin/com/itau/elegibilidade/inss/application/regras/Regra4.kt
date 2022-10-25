package com.itau.elegibilidade.inss.application.regras;

import com.itau.elegibilidade.inss.application.regras.convenio.Convenios;
import com.itau.elegibilidade.inss.application.regras.dominio.Dominios;
import com.itau.elegibilidade.inss.application.regras.modalidade.Modalidades;
import com.itau.elegibilidade.inss.entrypoint.RegraRequest;
import org.springframework.stereotype.Component;

@Component
class Regra4 : Regra {

    val parametros = ParametrosRegra(
            codigoConvenio = Convenios.IPSEMG.codigo,
            codigoDominio = Dominios.OP.codigo,
            codigoBanco = Modalidades.PCON.codigo)

    override fun executar(request: RegraRequest) {

        if (parametros.respeitaCondicoesEntrada(request))
            System.out.println("Executando regra 4");
    }
}
