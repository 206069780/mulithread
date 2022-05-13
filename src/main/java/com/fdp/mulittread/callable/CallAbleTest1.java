package com.fdp.mulittread.callable;

import lombok.Data;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName CallAbleTest1.java
 * @Description  实现 CallAble 接口
 * @createTime 2022年05月13日 19:25:00
 */
@Data
public class CallAbleTest1 implements Callable<String> {
    private String name;

    public CallAbleTest1(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println(name);
        return "";
    }

    public static void main(String[] args) {
        CallAbleTest1 callAble1 = new CallAbleTest1("张三");
        CallAbleTest1 callAble2 = new CallAbleTest1("李四");
        CallAbleTest1 callAble3 = new CallAbleTest1("王武");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(callAble1);
        executorService.submit(callAble2);
        executorService.submit(callAble3);
        executorService.shutdown();

    }
}
