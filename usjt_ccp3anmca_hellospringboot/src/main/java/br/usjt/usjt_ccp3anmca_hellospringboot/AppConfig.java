package br.usjt.usjt_ccp3anmca_hellospringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.usjt.usjt_ccp3anmca_hellospringboot.interceptor.LoginInterceptor;
import br.usjt.usjt_ccp3anmca_hellospringboot.model.bean.Calculadora;

@Configuration
public class AppConfig implements WebMvcConfigurer {

	@Bean
	public Calculadora getCalculadora() {
		return new Calculadora();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).
		addPathPatterns("/**").
		excludePathPatterns("/login", "/", "/fazerLogin");
	}
}
