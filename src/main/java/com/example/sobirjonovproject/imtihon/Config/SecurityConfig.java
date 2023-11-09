package com.example.sobirjonovproject.imtihon.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("TEACHER").password(passwordEncoder().encode("1234")).roles("TEACHER")
                .and()
                .withUser("ADMIN").password(passwordEncoder().encode("12345")).roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                csrf().
                disable().
                headers().
                frameOptions().
                disable()
                .and().
                authorizeRequests()
                .antMatchers("gurux/**").hasAnyRole("ADMIN")
                .antMatchers("oquvmarkaz/**").hasAnyRole("ADMIN")
                .antMatchers("student/**").permitAll()
                .antMatchers("/gurux/get/{id}").hasAnyRole("TEACHER")
                .antMatchers("/teacher/**").hasAnyRole("ADMIN")
                .anyRequest().authenticated()
                .and().httpBasic();
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
