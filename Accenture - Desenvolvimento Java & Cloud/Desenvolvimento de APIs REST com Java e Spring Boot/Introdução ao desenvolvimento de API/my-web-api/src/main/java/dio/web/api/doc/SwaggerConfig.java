package dio.web.api.doc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato(){
        return new Contact(
                "Seu nome",
                "http://www.seusite.com.br",
                "voce@seusite.com.br"
        );
    }
    private ApiInfoBuilder informacoesApi(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Title - Rest API");
        apiInfoBuilder.description("API exemplo de uso de Springboot REST API");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
        apiInfoBuilder.license("Licença - Sua Empresa");
        apiInfoBuilder.licenseUrl("http://www.seusite.com.br");
        apiInfoBuilder.contact(this.contato());

        return apiInfoBuilder;
    }
}
