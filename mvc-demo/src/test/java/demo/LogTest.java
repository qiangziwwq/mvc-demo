package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: TDDO
 * @author: wuweiqiang
 * @create: 2020/4/5
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/application.xml"})
public class LogTest {

    private final static Logger logger = LoggerFactory.getLogger(LogTest.class);


    @Test
    public void testLog(){
        logger.error("logback error测试");
        logger.info("logback info测试");
        logger.debug("logback debug测试");
    }

}
