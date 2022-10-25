package com.itau.elegibilidade.inss.application.regras;

import com.itau.elegibilidade.inss.entrypoint.RegraRequest;

import java.util.Objects;

public class ParametrosRegra {

    final Integer codigoConvenio;
    final Integer codigoDominio;
    final Integer codigoModalidade;

    public ParametrosRegra(Integer codigoConvenio, Integer codigoDominio, Integer codigoModalidade) {
        this.codigoConvenio = codigoConvenio;
        this.codigoDominio = codigoDominio;
        this.codigoModalidade = codigoModalidade;
    }

    public boolean respeitaRequest(RegraRequest regraRequest) {
        return Objects.equals(codigoConvenio, regraRequest.getCodigoConvenio()) &&
                Objects.equals(codigoDominio, regraRequest.getCodigoDominio()) &&
                Objects.equals(codigoModalidade, regraRequest.getCodigoModalidade());
    }

    public Integer getCodigoConvenio() {
        return codigoConvenio;
    }

    public Integer getCodigoDominio() {
        return codigoDominio;
    }

    public Integer getCodigoModalidade() {
        return codigoModalidade;
    }

}
