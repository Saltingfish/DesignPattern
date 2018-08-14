/*
package com.example.proxy.virtualProxy;

import javax.print.DocFlavor;
import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;


public class ImageProxyTestDrive {

    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String, String> cds = new Hashtable<String, String>();

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        //建立框架和菜单

        //创建一个图像代理，并指定初始URL
        Icon icon = new ImageProxy(initialURL);
        //将代理包装进组件中
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

    }

    DocFlavor.URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
*/
