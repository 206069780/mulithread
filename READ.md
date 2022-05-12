# 多线程

## 线程简介 

- 任务

- 程序：指令和数据的有序集合，其本身没有任何运行的含义，是一个静态的概念

- 进程：进程是执行程序的一次执行过程，他是一个动态的概念。是系统资源分配的单位，通常在一个进程中可以包含若干个线程，当然一个进程中至少有一个线程，不然没有存在的意义

  > 很多多线程是模拟出来的，真正的多线程是指有多个CPU，及多核，如服务器。
  >
  > 如果是模拟出来的多线程，即在一个CPU的情况下，在同一个时间点，CPU只能执行一个代码，因为切换的很快，所以就有同事执行的错觉

- 线程

  ### 线程创建

  - 继承 Thread 类

    <font color="blue">线程开启不一定立即执行，由CPU调度</font>

    ``` java
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
    ```

    

  - 实现Runable接口

  - 实现Callable接口

- 多线程

## 线程实现

## 线程状态

## 线程同步

## 线程通信问题

## 高级主题

