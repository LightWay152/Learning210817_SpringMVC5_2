package nhatnghe.inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthenticateInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HttpSession httpSession = request.getSession();
		if(httpSession.getAttribute("user")==null){
			String cpath = request.getContextPath();
			String uri = request.getRequestURI().replace(cpath, "");
			httpSession.setAttribute("uri", uri);
			response.sendRedirect(cpath+"/account/login.php");
			return false;
		}
		return true;
	}
}
