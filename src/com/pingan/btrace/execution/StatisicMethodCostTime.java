package com.pingan.btrace.execution;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: Jerrik
 * @Email: yangjie495@pingan.com.cn
 * @Date: 2018/7/11
 * @Description: 统计方法耗时
 */
public class StatisicMethodCostTime {

    static Random random = new Random();

    public void execute() throws Exception {
        System.out.println("execute");

        TimeUnit.MILLISECONDS.sleep(random.nextInt(3000));

        doExecute();

        printResult();
    }

    private void printResult() throws InterruptedException {
        System.out.println("printResult");
        TimeUnit.MILLISECONDS.sleep(random.nextInt(4000));
    }

    private void doExecute() throws InterruptedException {
        System.out.println("doExecute");
        newTask();
    }

    private void newTask() throws InterruptedException {
        System.out.println("new task begin");
        TimeUnit.MILLISECONDS.sleep(random.nextInt(2000));
    }

    public static void main(String[] args) throws Exception {
        StatisicMethodCostTime statisicMethodCostTime = new StatisicMethodCostTime();

        while(true){
            statisicMethodCostTime.execute();

            System.out.println();
            System.out.println("----------");
        }
    }
}
