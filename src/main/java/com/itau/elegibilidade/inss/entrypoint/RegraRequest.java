package com.itau.elegibilidade.inss.entrypoint;

public class RegraRequest {

    Integer codigoConvenio;
    Integer codigoDominio;
    Integer codigoModalidade;

    public Integer getCodigoConvenio() {
        return codigoConvenio;
    }

    public void setCodigoConvenio(Integer codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
    }

    public Integer getCodigoDominio() {
        return codigoDominio;
    }

    public void setCodigoDominio(Integer codigoDominio) {
        this.codigoDominio = codigoDominio;
    }

    public Integer getCodigoModalidade() {
        return codigoModalidade;
    }

    public void setCodigoModalidade(Integer codigoModalidade) {
        this.codigoModalidade = codigoModalidade;
    }
}
