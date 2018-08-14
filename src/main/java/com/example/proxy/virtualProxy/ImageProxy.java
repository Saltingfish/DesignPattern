package com.example.proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy  implements Icon {
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    //我们将图像的url传入构造器中，这是我们希望显示的图像所在的位置
    public ImageProxy(URL url) { imageURL = url; }

    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            //图像加载完毕前，返回默认宽和高
            return 800;
        }
    }

    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    public void paintIcon(final Component c, Graphics  g, int x, int y) {
        if (imageIcon != null) {
            //如果已经有了icon，就告诉它画出自己
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x+300, y+190);
            if (!retrieving) {//如果我们还没试着取出图像
                retrieving = true;

                //我们不希望整个用户界面被挂起，所以用另一个线程取出图像
                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            //此线程中我们实例化icon对象，其构造器会在图像加载完成后才返回
                            imageIcon = new ImageIcon(imageURL, "CD Cover");
                            //当图像准备好后，我们告诉Swing需要重绘
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }
}

