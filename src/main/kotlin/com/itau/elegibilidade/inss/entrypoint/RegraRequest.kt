package com.itau.elegibilidade.inss.entrypoint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.math.BigDecimal

@JsonIgnoreProperties(ignoreUnknown = true)
data class RegraRequest(
        val valorParcela: BigDecimal? = null,
        val valorSolicitado: BigDecimal? = null,
        val codigoBanco: Int? = null,
        val numeroAgencia: Int? = null,
        val numeroConta: Int? = null,
        val numeroDigitoConta: Int? = null,
        val codigoMeioPagamento: String? = null,
        val indicadorContaPrincipal: Boolean? = null,
        val siglaUfBeneficio: String? = null,
        val codigoConvenio: Int? = null,
        val codigoDominio: Int? = null,
        val codigoModalidade: Int? = null
)
