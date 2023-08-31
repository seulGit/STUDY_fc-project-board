package com.fc.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable().cors().disable()
//                .authorizeHttpRequests(request -> request
//                        .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
//                        .anyRequest().authenticated()	// 어떠한 요청이라도 인증필요
//                )
//                .formLogin(login -> login	// form 방식 로그인 사용
//                        .defaultSuccessUrl("/view/dashboard", true)	// 성공 시 dashboard로
//                        .permitAll()	// 대시보드 이동이 막히면 안되므로 얘는 허용
//                )
//                .logout(withDefaults());	// 로그아웃은 기본설정으로 (/logout으로 인증해제)
//        return http.build();

        return http
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
                .build();
    }
}
