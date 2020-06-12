//package com.fii.fdxz.common.config;
//
//import com.fii.fdxz.service.FdxzUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
//
//import javax.sql.DataSource;
//
///**
// * @Author wangp
// * @Date 2020/5/26
// * @Version 1.0
// */
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    private FdxzUserService fdxzUserService;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.
//                authorizeRequests()
//                //允许所有用户访问"/","/jquery/**","/semantic/**","/css/**","/js/**","/images/**"
//                .antMatchers(
//                        "/jquery/**",
//                        "/css/**",
//                        "/js/**",
//                        "/images/**",
//                        "/fonts/**",
//                        "/**/favicon.ico")
//                .permitAll()
//                .antMatchers("/stu/**").hasRole("STU")
//                .antMatchers("/cou/**").hasRole("COU")
//                //剩余的其他格式的请求路径，只需要认证（登录）后就可以访问。
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .permitAll()
//                .and()
//                .csrf().disable();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(fdxzUserService).passwordEncoder(passwordEncoder());
//    }
//
//    @Override
//    @Bean
//    protected UserDetailsService userDetailsService() {
//        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
//        return manager;
//    }
//
//    @Bean
//    JdbcTokenRepositoryImpl jdbcTokenRepository() {
//        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
//        jdbcTokenRepository.setDataSource(dataSource);
//        return jdbcTokenRepository;
//    }
//}
