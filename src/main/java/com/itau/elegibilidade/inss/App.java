package com.itau.elegibilidade.inss;

import com.itau.elegibilidade.inss.usecases.elegibilidade.ExecutadorDeRegrasElegibilidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class App implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Autowired
    ExecutadorDeRegrasElegibilidade executor;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        executor.executarRegras();

    }
}
