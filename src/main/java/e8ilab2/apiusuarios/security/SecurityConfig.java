package e8ilab2.apiusuarios.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {


    public void configure(HttpSecurity httpSec) throws Exception {

        httpSec.csrf().disable()
                .exceptionHandling()
                .and().cors();

        httpSec.addFilterBefore(new Filters(), UsernamePasswordAuthenticationFilter.class);

    }

}

