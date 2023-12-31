//package dev.thepaulcode.movies.doc;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Arrays;
//import java.util.HashSet;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    private springfox.documentation.service.Contact contato() {
//        return new Contact(
//                "Paulo Santos ",
//                "@thePaulCode",
//                "https://github.com/thePaulCode");
//    }
//    private ApiInfoBuilder informacoesApi() {
//
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//
//        apiInfoBuilder.title("Title - Project User Resgistration API REST Swagger");
//        apiInfoBuilder.description("API para aplicação de uso de Springboot REST API - Registrar Usuário.");
//        apiInfoBuilder.version("1.0");
//        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
//        apiInfoBuilder.license("Santander Bootcamp 2023 - DIO");
//        apiInfoBuilder.licenseUrl("https://github.com/thePaulCode");
//        apiInfoBuilder.contact(this.contato());
//
//        return apiInfoBuilder;
//
//    }
//    @Bean
//    public Docket detalheApi() {
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//
//        docket
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("dev.thepaulcode.movies.Controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(this.informacoesApi().build())
//                .consumes(new HashSet<String>(Arrays.asList("application/json")))
//                .produces(new HashSet<String>(Arrays.asList("application/json")));
//
//        return docket;
//    }
//}