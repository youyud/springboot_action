package com.enjoy.springdemo.excel;

import com.enjoy.springdemo.SpringdemoApplicationTest;
import com.enjoy.springdemo.util.TestFileUtil;
import org.junit.Test;

import java.io.File;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/03/30 14:34
 */
public class EasyexcelTest extends SpringdemoApplicationTest {

    @Test
    public void simpleRead() {
        String fileName = TestFileUtil.getPath() + "demo" + File.separator + "demo.xslx";
    }
}
