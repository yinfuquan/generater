package com.generater.generater;

import com.generater.generater.generate.MysqlGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneraterApplicationTests {
    @Test
    public void contextLoads() {

    }
    @Test
    public void generator() {
        MysqlGenerator mysqlGenerator = new MysqlGenerator();
        mysqlGenerator.generator("user");
    }
}
