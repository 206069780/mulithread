package com.fdp.mulittread.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName DownLoadImg.java
 * @Description 继承Thread时下图片下载
 * @createTime 2022年05月12日 21:58:00
 */
public class DownLoadImg extends Thread {

    Logger logger = Logger.getLogger(DownLoadImg.class.getName());
    private String url;
    private String name;

    public DownLoadImg(String url, String name1) {
        this.url = url;
        this.name = name1;
    }

    @Override
    public void run() {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
            logger.info("download %s".formatted(name));
        } catch (IOException e) {
//            logger.info("download %s".formatted(name));
            logger.warning(" download %s  ".formatted(name)+ e.getMessage() );
        }
    }
    public static void main(String[] args) {
        new DownLoadImg("", "tes1.jpg").start();
        new DownLoadImg("", "tes2.jpg").start();
        new DownLoadImg("", "tes3.jpg").start();

    }
}


