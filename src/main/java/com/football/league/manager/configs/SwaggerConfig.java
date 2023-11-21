package com.football.league.manager.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.annotations.OpenAPI31;
import io.swagger.v3.oas.models.info.Info;

@Configuration
@OpenAPI31
public class SwaggerConfig
{
    @Bean
    public OpenAPI swaggerConfigV3()
    {
        return new OpenAPI()
            .info( new Info()
                .title( "Football League Manager" )
                .description( "The Football League Manager is responsible for controlling all features necessary to " +
                    "manage one league of football." )
                .version( "0.0.1" ) );
    }

}
