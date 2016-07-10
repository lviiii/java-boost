package com.sibyl.java.src.java.lang;

/**
 * 实现为单例，即每个java应用程序只能实例一个对象
 */
public class Runtime {

    private static Runtime currentRuntime = new Runtime();

    /**
     * Returns the runtime object associated with the current Java application.
     * Most of the methods of class <code>Runtime</code> are instance
     * methods and must be invoked with respect to the current runtime object.
     *
     * @return the <code>Runtime</code> object associated with the current
     * Java application.
     */
    /* 持有私有静态实例，防止被引用，返回当前java应用程序的runtime对象 */
    public static Runtime getRuntime() {
        return currentRuntime;
    }

    /* 私有构造方法，防止被实例化 */
    private Runtime() {
    }

    /**
     *
     */
}
