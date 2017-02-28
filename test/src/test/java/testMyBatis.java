

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sy.model.City;
import sy.service.UserImp;

import javax.swing.*;

/**
 * Created by pc on 2017/2/28.
 */

public class testMyBatis {
    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public UserImp getU() {
        return u;
    }

    public void setU(UserImp u) {
        this.u = u;
    }
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private UserImp u;
    private static final Logger logger = Logger.getLogger(testMyBatis.class);
    @Before
    public void before(){
          applicationContext=new   ClassPathXmlApplicationContext(new String[] {"spring.xml","spring-mybatis.xml"});
          u=(UserImp) applicationContext.getBean("userService");
    }
    @Test
    public void test1(){
        City uu= u.selectByPrimaryKey(1);
        logger.info(JSON.toJSONStringWithDateFormat(uu, "yyyy-MM-dd HH:mm:ss"));//对象转json打印出来
    }


}
