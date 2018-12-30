package com.xinian.springbootmybatis.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @author xinian
 * @date 2018/12/31 1:28
 */
@org.springframework.context.annotation.Configuration
public class MybatisConfig {

	@Bean
	public ConfigurationCustomizer configurationCustomizer(){
		return new ConfigurationCustomizer() {
			@Override
			public void customize(Configuration configuration) {
				configuration.setMapUnderscoreToCamelCase(true);
			}
		};
	}
}
