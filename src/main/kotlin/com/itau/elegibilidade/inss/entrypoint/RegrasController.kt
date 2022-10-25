package com.itau.elegibilidade.inss.entrypoint;

import com.itau.elegibilidade.inss.application.regras.Regra
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/regras")
class RegrasController(val regras: List<Regra>) {

    @GetMapping
    fun executarRegras(@RequestBody request: RegraRequest) {
        regras.forEach {
            it.executar(request)
        }
    }

}
