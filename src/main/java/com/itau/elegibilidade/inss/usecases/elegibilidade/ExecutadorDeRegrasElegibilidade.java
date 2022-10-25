package com.itau.elegibilidade.inss.usecases.elegibilidade;

import com.itau.elegibilidade.inss.application.regras.Regra;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ExecutadorDeRegrasElegibilidade {

    private final List<Regra> executors;

    public ExecutadorDeRegrasElegibilidade(List<Regra> executors) {
        this.executors = executors;
    }

    public void executarRegras() {
        //executors.forEach(regra -> regra.executar(request));
    }

}
