package com.fdp.mulittread.thread;

import java.util.logging.Logger;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName ThreadIml.java
 * @Description 继承 Thread
 * @createTime 2022年05月12日 21:41:00
 */
public class ThreadIml extends Thread {

    private static final Logger logger = Logger.getLogger(ThreadIml.class.getName());

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            logger.warning("extends Thread class");
        }
    }

    public static void main(String[] args) {
        ThreadIml threadIml = new ThreadIml();
        threadIml.start();
        for (int i = 0; i < 20; i++) {
            logger.info(" main method");
        }
    }
}
