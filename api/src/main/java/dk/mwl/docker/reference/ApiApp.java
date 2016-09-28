package dk.mwl.docker.reference;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties
@EnableScheduling
@ComponentScan
@EnableSwagger2
public class ApiApp {
    @Bean
    public Docket registryApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder().title("Docker reference app API").version("1").description("Refefence implementation of a Docker enabled app").build())
                .pathMapping("/")
                .select().build();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(ApiApp.class)
                .run(args);
    }
}
