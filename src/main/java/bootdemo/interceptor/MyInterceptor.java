package bootdemo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//将该组件加入spring ioc容器
@Component
public class MyInterceptor implements HandlerInterceptor {

	/**
	 * 在请求处理的方法之前执行，true让行，false不让行
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("方法执行之前===============");
		return true;
	}

	/**
	 * 在请求处理方法之后执行
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("方法执行之后===============");
	}

	/**
	 * 在DispatcherServlet处理后执行--清理工作(因为是单利)
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("执行清理工作===============");
	}

}
