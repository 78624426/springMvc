package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogInter implements HandlerInterceptor{
    //参数3：表示在执行的是哪一个handler之前被拦截了
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object o) throws Exception {
        System.out.println("ip:"+req.getRemoteAddr()+"访问了"+o);

        return true;//放行
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println(o+"执行结束");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("准备返回响应");
    }
}
