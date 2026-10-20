package tn.esprit.autoloc.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI autoLocOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("AutoLoc API")
                        .description("Documentation de l'API AutoLoc")
                        .version("1.0.0"));
    }
}
