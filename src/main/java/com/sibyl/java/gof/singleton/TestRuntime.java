package com.sibyl.java.gof.singleton;

/**
 * Created by sibyl_lv on 16/7/10.
 */
public class TestRuntime {
    /**
     * 多线程的时候获取的对象是同一个
     * @param args
     */
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        System.out.println("runtime = [" + runtime.toString() + "]");
    }
}
