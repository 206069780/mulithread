package com.fdp.mulittread.runable;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName RunableTest.java
 * @Description 实现 Runnable 接口
 * @createTime 2022年05月12日 22:26:00
 */
public class RunableTest implements Runnable {
    Logger logger = Logger.getLogger(RunableTest.class.getName());
    private String name;

    public RunableTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        logger.info(name);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(new RunableTest(i + "")).start();
        }
    }
}
