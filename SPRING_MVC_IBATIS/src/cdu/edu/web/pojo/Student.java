/** 
 * @Package com.synnex.model 
 * class com.synnex.model.Student
 * Created on 2014-8-7, 下午03:11:02
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author A18ccms A18ccms_gmail_com 
 * @version V1.0 
 */
package cdu.edu.web.pojo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;

import org.apache.ibatis.type.Alias;

/**
 * <b>Description</b>:
 * <p>
 * <b>Features or change log:</b>
 * <ol>
 * <li>2014-8-7 下午03:11:02, derekd, C001:</li>
 * <li></li>
 * </ol>
 */
@Alias("Student")
public class Student implements Serializable{
    
    
    /**
     * @Fields serialVersionUID : TODO
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", date=" + date + "]";
    }

    private int id;
    private String name;
    private Date date;
    private Group group; // 组

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return group
     */
    public Group getGroup() {
        return group;
    }

    /**
     * <p>
     * Description:
     * </p>
     */
    public Student() {

    }

    /**
     * @param group the group to set
     */
    public void setGroup(Group group) {
        this.group = group;
    }
    
    /*public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("student.out");  
        
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));  
        Student student = new Student();
        student.setDate(new Date(20121323));
        student.setName("db");
        student.setId(231298);
        oout.writeObject(student);  
        oout.close();  
 
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));  
        Object newPerson = oin.readObject(); // 没有强制转换到Person类型  
        oin.close();  
        System.out.println(newPerson);  
    }*/
}
