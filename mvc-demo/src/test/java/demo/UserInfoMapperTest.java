package demo;

import com.wwq.mvc.dao.demo.UserInfoMapper;
import com.wwq.mvc.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: TDDO
 * @author: wuweiqiang
 * @create: 2020/4/5
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserInfoMapperTest {

    private final static Logger logger = LoggerFactory.getLogger(UserInfoMapperTest.class);
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void testSelectOne(){
        UserInfo userInfo = userInfoMapper.selectOne(1);
        System.out.println(userInfo);
    }

    @Test
    public void  testInsertOne(){
        UserInfo info = new UserInfo();
        info.setUserName("用户3");
        int i = userInfoMapper.insertOne(info);
        if(logger.isInfoEnabled()){
            logger.info("======插入用户数量：{}",i);
        }
    }

}
