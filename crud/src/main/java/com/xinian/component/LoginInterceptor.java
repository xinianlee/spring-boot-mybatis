package com.xinian.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author xinian
 * @date 2018/12/16 15:05
 */
public class LoginInterceptor implements HandlerInterceptor{
	//前置处理器
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		Object user = request.getSession().getAttribute("loginuser");
		if(StringUtils.isEmpty(user)){
			//为空表示未登录。需要拦截转去登录页面
			request.setAttribute("msg","无权访问，请先登录");
			request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
		}else {
			//有登录，放行
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}
}
