   /** 
     * @Package cdu.edu.web.servicedao 
     * class cdu.edu.web.servicedao.StudentService
     * Created on 2014-8-11, 下午02:01:20
     * @Description: TODO(用一句话描述该文件做什么) 
     * @author A18ccms A18ccms_gmail_com 
     * @version V1.0 
     */  
package cdu.edu.web.servicedao;

import java.util.List;


import cdu.edu.web.pojo.Student;


/**
 * <b>Description</b>: 
 * <p><b>Features or change log:</b>
 * <ol>
 * <li>2014-8-11 下午02:01:20, derekd, C001: </li>
 * <li></li>
 * </ol>
 */

public interface StudentService {
  public  List<Student>  getStudent();
  public void  deletestudent(int  id);
  public String returnresult();
}
