package com.java.designPattern.singleton.hungry;

import com.java.designPattern.singleton.lazy.SinglePatternLazy;

public class HungryThread implements Runnable {
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
         SingletonPatternHungry hungry = SingletonPatternHungry.getInstance();
          System.out.println( hungry.hashCode());
    }
}
