package com.dgmdev.jwt_security.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails user=User.builder().username("darshan").password(passwordEncoder().encode("{noop}admin123")).roles("ADMIN").build();
        UserDetails user1=User.builder().username("admin1").password(passwordEncoder().encode("{noop}admin1234")).roles("ADMIN").build();


        return new InMemoryUserDetailsManager(user,user1);
    }

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal ){
        return principal.getName();
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}
