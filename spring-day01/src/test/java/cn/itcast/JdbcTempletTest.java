package cn.itcast;

import com.itcast.Account;
import com.itcast.AccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangzhineng
 * @date 2019-10-14 - 17:21
 */
public class JdbcTempletTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        Account account = new Account("tom",1000.00);
        int num = accountDao.addAccount(account);
        if(num>0){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }
    }



}
