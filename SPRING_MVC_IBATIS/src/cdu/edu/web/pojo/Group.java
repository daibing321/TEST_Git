/** 
 * @Package com.synnex.model 
 * class com.synnex.model.Group
 * Created on 2014-8-7, 下午03:13:45
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author A18ccms A18ccms_gmail_com 
 * @version V1.0 
 */
package cdu.edu.web.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * <b>Description</b>:
 * <p>
 * <b>Features or change log:</b>
 * <ol>
 * <li>2014-8-7 下午03:13:45, derekd, C001:</li>
 * <li></li>
 * </ol>
 */
public class Group implements Serializable{
    /**
     * @Fields serialVersionUID : TODO
     */
    private static final long serialVersionUID = 1L;
    /**
     * <b>Usage:</b>
     * <ul>
     * <li>if (LOG.isDebugEnabled()) LOG.debug("latestVer @ {}: {}",artiDir,latestVer);</li>
     * <li>LOG.error("{} is NOT valid in form!",version);</li>
     * <li>LOG.error("ERROR! ", e);</li>
     * </ul>
     */
    private int id;
    private String name;
    private String position;
    private List<Student> students;

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * <p>
     * Description:
     * </p>
     */
    public Group() {
    }

    @Override
    public String toString() {
        return "Group [id=" + id + ", name=" + name + ", position=" + position + ", students=" + students + "]";
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
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
