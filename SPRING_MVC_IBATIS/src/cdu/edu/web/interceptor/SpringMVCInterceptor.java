/** 
 * @Package cdu.edu.web.interceptor 
 * class cdu.edu.web.interceptor.SpringMVCInterceptor
 * Created on 2014-8-12, 下午05:54:53
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author A18ccms A18ccms_gmail_com 
 * @version V1.0 
 */
package cdu.edu.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cdu.edu.web.pojo.Student;

/**
 * <b>Description</b>:
 * <p>
 * <b>Features or change log:</b>
 * <ol>
 * <li>2014-8-12 下午05:54:53, derekd, C001:</li>
 * <li></li>
 * </ol>
 */
public class SpringMVCInterceptor implements HandlerInterceptor {
    /**
     * <b>Usage:</b>
     * <ul>
     * <li>if (LOG.isDebugEnabled()) LOG.debug("latestVer @ {}: {}",artiDir,latestVer);</li>
     * <li>LOG.error("{} is NOT valid in form!",version);</li>
     * <li>LOG.error("ERROR! ", e);</li>
     * </ul>
     */
    private static final Logger LOG = LoggerFactory.getLogger(SpringMVCInterceptor.class);

    /**
     * preHandle方法是进行处理器拦截用的，顾名思义，该方法将在Controller处理之前进行调用，SpringMVC中的Interceptor拦截器是链式的，可以同时存在
     * 多个Interceptor，然后SpringMVC会根据声明的前后顺序一个接一个的执行，而且所有的Interceptor中的preHandle方法都会在
     * Controller方法调用之前调用。SpringMVC的这种Interceptor链式结构也是可以进行中断的，这种中断方式是令preHandle的返 回值为false，当preHandle的返回值为false的时候整个请求就结束了。
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3) throws Exception {
            System.out.println("试图显示后");
    }

    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {
        System.out.println("方法执行后");
    }

    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
        Student student = (Student) arg0.getSession().getAttribute("user");
        System.out.println("我是拦截器呀！！咿呀咿呀呦");
        return true;
    }

}
