package dio.web.api.doc;

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
}
