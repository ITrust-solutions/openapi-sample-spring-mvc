package io.karolbryzgiel.openapidemo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created 22.07.2022
 *
 * @author Karol Bryzgiel {@literal (<karol.bryzgiel@soft-project.pl>)}
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("OpenApiDemo")
                        .description("Operations defined for OpenApi Demo")
                        .termsOfService("")
                        .version("1.0")
                        .license(new License()
                                .name("")
                                .url("http://unlicense.org"))
                        .contact(new Contact()
                                .email("karol.bryzgiel@soft-project.pl")));
    }

}
