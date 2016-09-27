   /** 
     * @Package cdu.edu.web.servicedaoimpl 
     * class cdu.edu.web.servicedaoimpl.StudentServiceImpl
     * Created on 2014-8-11, 下午02:02:46
     * @Description: TODO(用一句话描述该文件做什么) 
     * @author A18ccms A18ccms_gmail_com 
     * @version V1.0 
     */  
package cdu.edu.web.servicedaoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdu.edu.web.dao.StudentMapper;
import cdu.edu.web.pojo.Student;
import cdu.edu.web.servicedao.StudentService;


/**
 * <b>Description</b>: 
 * <p><b>Features or change log:</b>
 * <ol>
 * <li>2014-8-11 下午02:02:46, derekd, C001: </li>
 * <li></li>
 * </ol>
 */
@Service
public class StudentServiceImpl implements StudentService/*,BeanNameAware,BeanFactoryAware*/{
    @Autowired
    private StudentMapper studentMapper;
    
    public List<Student> getStudent() {
        return studentMapper.getStudents();
    }
    
    public void  deletestudent(int  id){
        studentMapper.delstudentBykey(id);
    }

    public String returnresult() {
        return "AOP返回结果";
    }

   /* public void setBeanName(String arg0) {
        System.out.println("调用BeanNameAware的setBeanName()..."+arg0);  
    }

    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out.println("调用BeanFactoryAware的setBeanFactory()...");  
    }
*/



}
