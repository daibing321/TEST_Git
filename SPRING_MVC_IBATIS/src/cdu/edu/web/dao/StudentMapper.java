   /** 
     * @Package mapper 
     * class mapper.StudentMapper
     * Created on 2014-8-7, 下午05:17:55
     * @Description: TODO(用一句话描述该文件做什么) 
     * @author A18ccms A18ccms_gmail_com 
     * @version V1.0 
     */  
package cdu.edu.web.dao;


import java.util.List;

import cdu.edu.web.pojo.Student;


/**
 * <b>Description</b>: 
 * <p><b>Features or change log:</b>
 * <ol>
 * <li>2014-8-7 下午05:17:55, derekd, C001: </li>
 * <li></li>
 * </ol>
 */
public interface StudentMapper {
    
   public List<Student>  getStudents();
   public Student  getstudentBykey(int  id);
   public void  delstudentBykey(int  id);
  /* public void  updatestudent(Student student);*/
   
}
