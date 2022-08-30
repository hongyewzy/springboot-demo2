package com.it;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "test.first=properties" ,args ="--test.first=args" )//方法一
//@SpringBootTest(args = {"--test.first=testFirst1","--test.second=testSecond2"})//方法二
//    可以Alt+左键@SpringBootTest查看原因
//两种方法都是数组形式,可以@SpringBootTest(args = {"test.first=testFirst1","test.second=testSecond2"})

//这是临时配置,仅在此测试类中生效
//当它与yaml中冲突时,以此为准
class SprinbootDemo2ApplicationTests {


    @Value("${test.first}")
    private String index;
//    @Value("${test.second}")
//    private String index2;

    @Test
    void Test() {
        System.out.println(index);
//        System.out.println(index2);
    }
}
