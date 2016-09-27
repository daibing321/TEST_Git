/** 
 * @Package cdu.edu.web.controller 
 * class cdu.edu.web.controller.StudentAction
 * Created on 2014-8-11, 下午01:58:00
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author A18ccms A18ccms_gmail_com 
 * @version V1.0 
 */
package cdu.edu.web.controller;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.RedirectView;

import cdu.edu.web.servicedao.StudentService;

/**
 * <b>Description</b>:
 * <p>
 * <b>Features or change log:</b>
 * <ol>
 * <li>2014-8-11 下午01:58:00, derekd, C001:</li>
 * <li></li>
 * </ol>
 */
@Controller
@RequestMapping(value = "/student")
public class StudentAction extends MultiActionController implements  Serializable{

    /**
     * @Fields serialVersionUID : TODO
     */
    private static final long serialVersionUID = 1L;
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/studentlist")
    public String studentlist(HttpServletRequest request) {
        
        System.out.println("对象：："+studentService.getStudent());
        request.setAttribute("studentlist", studentService.getStudent());
        return "/student/studentlist";
    }
    
    //res風格的參數接受
    @RequestMapping(value = "/studentdelete/{id}",params = "method=listAllBoard") // <—— ② 如果URL请求中包括"method=listAllBoard"的参数，由本方法进行处理
    public String studentdelete(@PathVariable int id,HttpServletRequest request) {
        studentService.deletestudent(id);
        //实现从action方法跳转到action方法
        return "forward:/student/studentlist/";
    }
    
    
}
