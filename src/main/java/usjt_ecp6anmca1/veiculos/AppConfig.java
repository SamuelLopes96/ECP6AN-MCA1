package usjt_ecp6anmca1.veiculos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import usjt_ecp6anmca1.veiculos.model.bean.Calculadora;
import usjt_ecp6anmca1.veiculos.model.interceptor.LoginInterceptor;
@Configuration
public class AppConfig implements WebMvcConfigurer{
	@Bean
	public Calculadora getCalcudora() {
		return new Calculadora();
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	 registry.addInterceptor(
	 new LoginInterceptor()).
	 addPathPatterns("/**").
	 excludePathPatterns("/login", "/", "/fazerLogin");
	}

	
}
