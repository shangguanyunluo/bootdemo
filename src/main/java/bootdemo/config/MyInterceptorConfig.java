package bootdemo.config;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import bootdemo.interceptor.MyInterceptor;

@Configuration
@EnableWebMvc
public class MyInterceptorConfig implements WebMvcConfigurer {
	@Autowired
	private MyInterceptor myInterceptor;

	public void addInterceptors(InterceptorRegistry registry) {
		// 添加拦截器并设置拦截规则
		// /*表示路径
		// /**表示路径及其自路径
		registry.addInterceptor(myInterceptor).addPathPatterns("/**");
	}

	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(
				Charset.forName("UTF-8"));
		converters.add(stringHttpMessageConverter);
	}

}
