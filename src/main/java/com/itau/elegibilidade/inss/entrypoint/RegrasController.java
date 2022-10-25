package com.itau.elegibilidade.inss.entrypoint;

import com.itau.elegibilidade.inss.application.regras.Regra;
import com.itau.elegibilidade.inss.application.regras.Regra1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/regras")
public class RegrasController {

    private final List<Regra> regras;

    public RegrasController(List<Regra> regras) {
        this.regras = regras;
    }

    @GetMapping
    public void executarRegras(@RequestBody RegraRequest request){
        regras.forEach(regra -> regra.executar(request));
    }

}
