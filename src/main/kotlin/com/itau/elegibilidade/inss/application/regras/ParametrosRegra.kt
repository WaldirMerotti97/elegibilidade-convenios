package com.itau.elegibilidade.inss.application.regras;

import com.itau.elegibilidade.inss.entrypoint.RegraRequest
import java.math.BigDecimal

data class ParametrosRegra(val valorParcela: BigDecimal? = null, val valorSolicitado: BigDecimal? = null, val codigoBanco: Int? = null, val numeroAgencia: Int? = null, val numeroConta: Int? = null, val numeroDigitoConta: Int? = null, val codigoMeioPagamento: String? = null, val indicadorContaPrincipal: Boolean? = null, val siglaUfBeneficio: String? = null, val codigoConvenio: Int? = null, val codigoDominio: Int? = null, val codigoModalidade: Int? = null) {

    fun respeitaCondicoesEntrada(regraRequest: RegraRequest): Boolean {

        if (valorParcela != regraRequest.valorParcela) return false
        if (valorSolicitado != regraRequest.valorSolicitado) return false
        if (codigoBanco != regraRequest.codigoBanco) return false
        if (numeroAgencia != regraRequest.numeroAgencia) return false
        if (numeroConta != regraRequest.numeroConta) return false
        if (numeroDigitoConta != regraRequest.numeroDigitoConta) return false
        if (codigoMeioPagamento != regraRequest.codigoMeioPagamento) return false
        if (indicadorContaPrincipal != regraRequest.indicadorContaPrincipal) return false
        if (siglaUfBeneficio != regraRequest.siglaUfBeneficio) return false
        if (codigoConvenio != regraRequest.codigoConvenio) return false
        if (codigoDominio != regraRequest.codigoDominio) return false
        if (codigoModalidade != regraRequest.codigoModalidade) return false

        return true
    }
}

