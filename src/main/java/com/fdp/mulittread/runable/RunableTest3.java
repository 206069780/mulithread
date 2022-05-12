package com.fdp.mulittread.runable;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName RunableTest3.java
 * @Description 模拟龟兔赛跑
 * @createTime 2022年05月12日 22:45:00
 */
public class RunableTest3 implements Runnable {

    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            boolean flag = isHasWinner(i);
            if (flag) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + " -- " + i);
        }
    }

    private boolean isHasWinner(int steps){
        if (winner == null) {
            if (steps >= 100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner is " + winner);
                return true;
            }
        }else {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
       RunableTest3 run =  new RunableTest3();
        new Thread(run,"乌龟").start();
        new Thread(run,"兔子").start();
    }
}
