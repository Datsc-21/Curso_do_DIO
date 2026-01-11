package dio.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity // Substitui o EnableGlobalMethodSecurity
public class WebSecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        // Configuração de usuario comum
        UserDetails user = User.withUsername("user")
                .password("{noop}user123")
                .roles("USERS")
                .build();

        // Configuração de administrador
        UserDetails admin = User.withUsername("admin")
                .password("{noop}master123")
                .roles("MANAGERS")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }
}