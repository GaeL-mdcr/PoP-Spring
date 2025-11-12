package com.ifmt.cobracaifmt5;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebProperties.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class Cobracaifmt5Application {
	@Bean
	public FixedLocaleResolver localeResolver() {
		return new FixedLocaleResolver(new Locale("pt","BR"));
	}

	public static void main(String[] args) {
		SpringApplication.run(Cobracaifmt5Application.class, args);
		
		
	}

}
