package com.xinian.config;



import com.xinian.component.LoginInterceptor;
import com.xinian.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @author xinian
 * @date 2018/12/9 22:39
 */
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index.html").setViewName("index");
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/main.html").setViewName("dashboard");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor())
				.addPathPatterns("/**").excludePathPatterns("/index.html","/","/user/login");
	}

	@Bean
	public LocaleResolver localeResolver(){
		return new MyLocaleResolver();
	}
}
