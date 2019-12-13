package com.java.designPattern.singleton.lazy;

public class LazyThread implements Runnable {
    /**
     * @param null
     * @return
     * @describe 多线程进行生成单利实例
     * @author fw
     * @creed: ponder over code
     * @date 2019/12/12
     */

    @Override
    public void run() {
         SinglePatternLazy singlePatternLazy = SinglePatternLazy.getInstance();
          System.out.println( singlePatternLazy.hashCode());
    }
}
