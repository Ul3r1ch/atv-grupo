package br.com.senai.infob.loja.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Verano",
        version = "1.0",
        description = "verano.roupas@gmail.com"
    )
)
public class Swagger {
    
}
