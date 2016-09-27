   /** 
     * @Package mapper 
     * class mapper.GroupMapper
     * Created on 2014-8-8, 上午10:26:47
     * @Description: TODO(用一句话描述该文件做什么) 
     * @author A18ccms A18ccms_gmail_com 
     * @version V1.0 
     */  
package cdu.edu.web.dao;

import java.util.List;

import cdu.edu.web.pojo.Group;
import cdu.edu.web.pojo.Student;

/**
 * <b>Description</b>: 
 * <p><b>Features or change log:</b>
 * <ol>
 * <li>2014-8-8 上午10:26:47, derekd, C001: </li>
 * <li></li>
 * </ol>
 */
public interface GroupMapper  {
   public List<Group>   getGroup(int id);
   public List<Group>   getGroup1(Student student);
   public List<Group>   getGroup2(Student student);
   public List<Group>   getGroup3(Student student);
   public <T> List<Group>  getGroup4(List<T> lists);
  
}
