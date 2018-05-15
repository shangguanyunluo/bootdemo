package bootdemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 静态资源配置类
 * 
 * @author Administrator
 *
 */
@Configuration
@EnableWebMvc // WebMvcConfigurerAdapter
public class WebConfig implements WebMvcConfigurer {

	/**
	 * 日志管理
	 */
	private Logger log = LoggerFactory.getLogger(WebConfig.class);

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		log.info("配置静态资源所在目录");
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static");
	}

	
}
