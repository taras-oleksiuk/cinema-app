package taras.oleksiuk.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import taras.oleksiuk.spring.model.Role;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    public SecurityConfig(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/register").permitAll()
                .antMatchers(HttpMethod.POST,"/orders/complete").hasAnyRole("ADMIN", "USER")
                .antMatchers(HttpMethod.POST,"/cinema-halls", "/movies", "/movie-sessions")
                .hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT,"/movie-sessions/{id}",
                        "/shopping-carts/movie-sessions")
                .hasAnyRole("ADMIN", "USER")
                .antMatchers(HttpMethod.DELETE,"/movie-sessions/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/cinema-halls", "/movies", "/movie-sessions/{id}",
                        "/movie-sessions/available", "/orders", "/shopping-carts/by-user", "/users",
                        "/users/by-email")
                .hasAnyRole(String.valueOf(Role.RoleName.USER), String.valueOf(Role.RoleName.ADMIN))
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }
}
