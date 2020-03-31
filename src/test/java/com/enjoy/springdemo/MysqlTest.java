package com.enjoy.springdemo;

import com.enjoy.springdemo.dao.mapper.TestmysamMapper;
import com.enjoy.springdemo.dao.model.Testmysam;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/03/04 11:25
 */
public class MysqlTest extends SpringdemoApplicationTest {
    @Autowired
    private TestmysamMapper testmysamMapper;

    @Test
    public void mysql() {
        long start = System.currentTimeMillis();
//        ArrayList<Testmysam> list = new ArrayList<>();
        for (int i = 1000000; i < 2000000; i++) {
            Testmysam testmysam = new Testmysam();
            testmysam.setAge(new Random().nextInt(100));
            testmysam.setName("武汉加油！" + i);
//            list.add(testmysam);
//            if (list.size() % 5000 == 0) {
//                testmysamMapper.insertContainIdList(list);
//                list.clear();
//            }
            testmysamMapper.insert(testmysam);
        }
        long end = System.currentTimeMillis();
        long count = (end - start) / 1000;
        System.out.println("执行时间" + count + "秒");
    }
}
