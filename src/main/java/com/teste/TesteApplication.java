package com.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class TesteApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesteApplication.class, args);
    }

//
//package com.exemplo.service;
//
//import com.exemplo.model.Funcionario;
//import com.exemplo.repository.FuncionarioRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//
//        @Service
//        public class FuncionarioService {
//
//            @Autowired
//            private FuncionarioRepository funcionarioRepository;
//
//            public Page<Funcionario> listarTodos(int pagina, int tamanho, String ordenarPor) {
//                return funcionarioRepository.findAll(PageRequest.of(pagina, tamanho, Sort.by(ordenarPor)));
//            }
//        }
//        @GetMapping
//        public String listarFuncionarios(Model model,
//        @RequestParam(defaultValue = "0") int pagina,
//        @RequestParam(defaultValue = "10") int tamanho,
//        @RequestParam(defaultValue = "nome") String ordenarPor) {
//            model.addAttribute("funcionarios", funcionarioService.listarTodos(pagina, tamanho, ordenarPor));
//            return "listar_funcionarios";
//        }
//package com.exemplo.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//        @Configuration
//        @EnableWebSecurity
//        public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//            @Override
//            protected void configure(HttpSecurity http) throws Exception {
//                http
//                        .authorizeRequests()
//                        .antMatchers("/login", "/registro").permitAll()
//                        .anyRequest().authenticated()
//                        .and()
//                        .formLogin()
//                        .loginPage("/login")
//                        .permitAll()
//                        .and()
//                        .logout()
//                        .permitAll();
//            }
//        }

    }


