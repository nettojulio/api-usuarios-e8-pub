package e8ilab2.apipedidos.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{


    public void configure(HttpSecurity httpSec) throws Exception {

        httpSec.csrf().disable()
                .exceptionHandling()
                .and().cors();

        httpSec.addFilterBefore(new Filters(), UsernamePasswordAuthenticationFilter.class);

    }

}
