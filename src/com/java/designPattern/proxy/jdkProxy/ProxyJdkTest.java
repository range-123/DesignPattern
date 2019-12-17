package com.java.designPattern.proxy.jdkProxy;

import com.java.designPattern.proxy.staticProxy.IProxyStaticDb;
import com.java.designPattern.proxy.staticProxy.ProxyStaticPro;
import com.java.designPattern.proxy.staticProxy.ProxyStaticReal;
import com.java.designPattern.proxy.units.Book;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: DesignPattern
 * @description: 测试-静态代理
 * @author: fz
 * @create: 2019-12-16 14:59
 */
public class ProxyJdkTest {

    public static void main(String[] args) {


        IProxyJdk proxyJdk = (IProxyJdk) new ProxyJkdPro().getInstance(new ProxyJdkReal());
        proxyJdk.create();
         byte[] bytes  = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{IProxyJdk.class});
        try {
            FileOutputStream fos = new FileOutputStream("g://$Proxy0.class");
            fos.write(bytes);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}