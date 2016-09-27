   /** 
     * @Package cdu.edu.web.controller 
     * class cdu.edu.web.controller.IndexAction
     * Created on 2014-8-11, 上午10:50:39
     * @Description: TODO(用一句话描述该文件做什么) 
     * @author A18ccms A18ccms_gmail_com 
     * @version V1.0 
     */  
package cdu.edu.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * <b>Description</b>: 
 * <p><b>Features or change log:</b>
 * <ol>
 * <li>2014-8-11 上午10:50:39, derekd, C001: </li>
 * <li></li>
 * </ol>
 */
@Controller  //controller定义controller
@RequestMapping(value="/indexAction")  //定义namespace
public class IndexAction extends MultiActionController{

    @RequestMapping(value="/index")  //定义请求的方法
    public String index(HttpServletRequest request){
        request.setAttribute("message", "message");
        return "/index/indexsuccess";  //返回的路径相当于/web-inf/pages/index/indexsuccess路径
    }
}
