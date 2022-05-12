package com.fdp.mulittread.runable;

import java.util.logging.Logger;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName RunableTest2.java
 * @Description 多个线程同时操作同一个对象
 * @createTime 2022年05月12日 22:37:00
 */
public class RunableTest2 implements Runnable {

    Logger logger = Logger.getLogger(RunableTest2.class.getName());
     private  int  tick = 10;

    @Override
    public void run() {
        while (true) {
            if (tick <= 0) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            logger.info(Thread.currentThread().getName() + " get  " + tick--);
        }
    }

    public static void main(String[] args) {
        new Thread(new RunableTest2(), "lisi").start();
        new Thread(new RunableTest2(), "zhangsan").start();
        new Thread(new RunableTest2(), "wangwu").start();
    }
}
