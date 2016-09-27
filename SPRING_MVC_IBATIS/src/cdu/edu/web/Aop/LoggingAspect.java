   /** 
     * @Package cdu.edu.web.Aop 
     * class cdu.edu.web.Aop.LoggingAspect
     * Created on 2014-8-12, 下午02:18:08
     * @Description: TODO(用一句话描述该文件做什么) 
     * @author A18ccms A18ccms_gmail_com 
     * @version V1.0 
     */  
package cdu.edu.web.Aop;

import java.util.Arrays;

import org.aspectj.apache.bcel.classfile.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <b>Description</b>: AOP的切入点
 * <p><b>Features or change log:</b>
 * <ol>
 * <li>2014-8-12 下午02:18:08, derekd, C001: </li>
 * <li></li>
 * </ol>
 */
@Component
@Aspect  //定义切面
public class LoggingAspect {
    /**
     * <b>Usage:</b>
     * <ul><li>if (LOG.isDebugEnabled()) LOG.debug("latestVer @ {}: {}",artiDir,latestVer);</li>
     * <li>LOG.error("{} is NOT valid in form!",version);</li>
     * <li>LOG.error("ERROR! ", e);</li></ul>
     */
    private static final Logger LOG = LoggerFactory.getLogger(LoggingAspect.class);
    
    //前置通知
    @Before("execution(* cdu.edu.web.servicedao.StudentService.getStudent(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }
    
    @After("execution(* cdu.edu.web.servicedao.StudentService.getStudent(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("后置通知() is running!");
        System.out.println("方法的定义类型 : " + joinPoint.getSignature().getDeclaringType());
        System.out.println("******");
    }
    
    @AfterReturning(pointcut = "execution(* cdu.edu.web.servicedao.StudentService.returnresult(..))",returning= "result")
    public  void logAfterReturning(JoinPoint joinPoint,Object result){
        System.out.println("logAfterReturning() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + result);
        System.out.println("******");
    }
    
    @Around("execution(* cdu.edu.web.servicedao.StudentService.getStudent(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
     System.out.println("logAround() is running!");
     System.out.println("hijacked method : " + joinPoint.getSignature().getName());
     System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
     System.out.println("Around before is running!");
     joinPoint.proceed(); //continue on the intercepted method
     System.out.println("Around after is running!");
     System.out.println("******");
  
    }
    
   /* @Pointcut("execution(* cdu.edu.web.servicedao.StudentService.getStudent(..))")
    public  void  declarepointcut(){
        System.out.println("定义切入点");
    }
    @AfterReturning(pointcut="PointcutDefinition.myPointcutTest() && args(message)",returning="returnValue")
    public void log(String message, Object returnValue) {
        
    }
    
    //抛出异常的记录
    @AfterThrowing(pointcut="PointcutDefinition.myPointcutTest()")
    public void log(Method  method,Object[] args,Object target,Exception  ex) {
        
    }*/
    
}
