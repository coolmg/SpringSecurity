package com.mrcool.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class WebSecurityConfiguration {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(requests -> requests
                .requestMatchers("myAccount","myBalance","myLoans","myCards", "register").authenticated()
                .requestMatchers("contact","notices","error").permitAll());
        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        return http.build();
    }

//    @Bean
//    UserDetailsService userDetailsService() {
//        UserDetails admin = User.withUsername("admin").password("{bcrypt}$2a$12$T8BnDhXCT7LdS9z.hGyKfOHiphbXmbFxkynYP75M6.2pXkrxSuEIm").authorities("admin").build();
//        UserDetails user = User.withUsername("user").password("{noop}user").authorities("read").build();
//
//        return new InMemoryUserDetailsManager(admin, user);
//    }
//    @Bean
//    UserDetailsService userDetailsService(DataSource dataSource) {
//        return new JdbcUserDetailsManager(dataSource);
//    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

//    @Bean
//    CompromisedPasswordChecker compromisedPasswordChecker(){
//        return new HaveIBeenPwnedRestApiPasswordChecker();
//    }
}
