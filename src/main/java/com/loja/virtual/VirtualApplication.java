package com.loja.virtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VirtualApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirtualApplication.class, args);

        System.out.print("BANCO RODANDO :)");

    }

}