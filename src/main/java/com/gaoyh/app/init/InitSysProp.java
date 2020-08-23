package com.gaoyh.app.init;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class InitSysProp implements InitializingBean, ServletContextAware {

	@Autowired
	ConfigurableEnvironment environment;
	@Autowired
	Properties hibernate_properties;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void setServletContext(ServletContext servletContext) {
		// TODO Auto-generated method stub
		// 获取系统属性集合
		MutablePropertySources propertySources = environment.getPropertySources();
		// Map<String, String> collect =
		// configInfoDao.queryAll().stream().collect(Collectors.toMap(ConfigInfo::getConfigKey,
		// ConfigInfo::getConfigValue));

		// 将转换后的列表加入属性中
		Properties properties = new Properties();
		properties.put("name", "test");
		servletContext.setAttribute("appname", "demo");
		// properties.putAll(collect);
		log.info("============================================");

		// 将属性转换为属性集合，并指定名称
		PropertiesPropertySource constants = new PropertiesPropertySource("database-config", properties);
		propertySources.addFirst(constants);

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("-------------------------------------------");

//		Set<Entry<Object, Object>> sets = hibernate_properties.entrySet();
//		for (Entry<Object, Object> entry : sets) {
//			this.jdbcTemplate.update("insert into t_app_config (param_key, param_name, param_value) values (?, ?, ?)",
//					entry.getKey(), "demo_app_config", entry.getValue());
//		}
		
		
	}

}
