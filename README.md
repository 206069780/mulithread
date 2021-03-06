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

    ```java
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
    ```

    

  - 实现Callable接口

    - 实现callable接口，需要返回数据
    
    - 重写call方法需要抛出异常
    
    - 创建目标对象
    
    - 创建执行服务
    
    - 提交执行
    
    - 获取结果
    
    - 关闭服务
    
      ```java
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
      ```
    
      
    
    

- 多线程

- 静态代理对比Thread

## 线程实现

## 线程状态

## 线程同步

## 线程通信问题

## 高级主题

