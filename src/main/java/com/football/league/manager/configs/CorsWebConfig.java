package com.football.league.manager.configs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Configuration
public class CorsWebConfig
{
    private static final String PATH = "/**";

    @Value( "${cors.allowed.origins:*}" )
    private String[] allowedOrigins;

    @Value( "${cors.allowed.headers:Origin,Content-Type,Accept,Authorization,Referer," +
        "access-control-request-method,access-control-request-headers}" )
    private String[] allowedHeaders;

    @Value( "${cors.exposed.headers:Content-Length,Transfer-Encoding}" )
    private String[] exposedHeaders;

    @Value( "${cors.allowed.methods:GET,POST,OPTIONS,PUT,DELETE}" )
    private String[] allowedMethods;

    @Value( "${cors.allow.credentials:false}" )
    private boolean allowCredentials;

    @Bean
    public CorsFilter corsFilterConfiguration()
    {
        log.info( "Setting up CORS Globally" );

        final CorsConfiguration config = new CorsConfiguration();

        config.setAllowedOrigins( Arrays.asList( allowedOrigins ) );
        config.setAllowedHeaders( Arrays.asList( allowedHeaders ) );
        config.setExposedHeaders( Arrays.asList( exposedHeaders ) );
        config.setAllowedMethods( Arrays.asList( allowedMethods ) );
        config.setAllowCredentials( allowCredentials );

        final UrlBasedCorsConfigurationSource urlCorsConfig = new UrlBasedCorsConfigurationSource();
        urlCorsConfig.registerCorsConfiguration( PATH, config );

        return new CorsFilter( urlCorsConfig );
    }
}
