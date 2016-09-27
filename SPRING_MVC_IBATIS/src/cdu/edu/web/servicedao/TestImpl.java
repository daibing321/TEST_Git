   /** 
     * @Package cdu.edu.web.servicedao 
     * class cdu.edu.web.servicedao.TestImpl
     * Created on 2014-8-12, 下午03:40:02
     * @Description: TODO(用一句话描述该文件做什么) 
     * @author A18ccms A18ccms_gmail_com 
     * @version V1.0 
     */  
package cdu.edu.web.servicedao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <b>Description</b>: 
 * <p><b>Features or change log:</b>
 * <ol>
 * <li>2014-8-12 下午03:40:02, derekd, C001: </li>
 * <li></li>
 * </ol>
 */
public class TestImpl implements Test {
    /**
     * <b>Usage:</b>
     * <ul><li>if (LOG.isDebugEnabled()) LOG.debug("latestVer @ {}: {}",artiDir,latestVer);</li>
     * <li>LOG.error("{} is NOT valid in form!",version);</li>
     * <li>LOG.error("ERROR! ", e);</li></ul>
     */
    private static final Logger LOG = LoggerFactory.getLogger(TestImpl.class);

    public void test() {
     System.out.println("我就不相信了");
    }

}
