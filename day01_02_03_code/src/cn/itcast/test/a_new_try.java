package cn.itcast.test;
//https://blog.csdn.net/xiaoxianer321/article/details/120407071
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class a_new_try {
    public static void main(String[] args) throws InterruptedException {
            JFrame e = new JFrame("SB的窗口案例"); // JFrame指一个窗口
            e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口时退出进程
            e.setSize(400, 300); // 设置窗口大小
            e.getContentPane().setBackground(Color.blue); // 设置背景色

            // ===================================

            JFrame a = new JFrame("二号");
            a.setSize(240, 240);
            a.getContentPane().setBackground(Color.red);
            a.setLayout(null); // 取消默认答案布局BorderLayout
            Panel pan = new Panel(); // 创建面板
            pan.setSize(100, 100);
            pan.setBackground(Color.green);
            a.add(pan);// 将pan添加到窗口a里
            a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            a.setVisible(true);
            e.setVisible(true); // 显示窗口：放到最后，要不然可能显示不出来

            // ===================================

            JFrame b = new JFrame("Buttonnnnnnnnnnnnnnnnnnnnnnnnnnnn...");
            b.setBounds(100, 100, 840, 480);
            /*
             * setBound(100，100，840，480）Jframe最左上角坐标即为（0，0），
             * 前两个100，100表示新建窗体的起始点（即x横向100，y纵向100处）
             * 第三个840表示新建窗体的宽度，第四个480表示新建窗体的高度
             */
            b.setLayout(new FlowLayout()); // 设置布局管理器为FlowLayout
            b.getContentPane().setBackground(Color.white);

            Button but1 = new Button("Button1"); // 均为添加按钮
            Button but2 = new Button("Button2");
            Button but3 = new Button("Button3");
            Button but4 = new Button("Button4");
            Button but5 = new Button("Button5");

            but1.setBackground(Color.blue); // 均为设置按钮颜色
            but2.setBackground(Color.yellow);
            but3.setBackground(Color.red);
            but4.setBackground(Color.green);
            but5.setBackground(Color.pink);

            b.add(but1); // 向窗口中加入按钮
            b.add(but2);
            b.add(but3);
            b.add(but4);
            b.add(but5);

            b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            b.setVisible(true);

            /*
             * FlowLayout fl = new FlowLayout();
             * fl.setAlignment(FlowLayout.LEFT); //设置对齐方式
             * //也可以直接使用构造函数
             * //FlowLayout f1 = new FlowLayout(FlowLayout.LEFT,20,40);
             * //三个参数，对齐方式（居左，横向间隔20像素，纵向间隔40像素）
             * frame.setLayout(fl);
             */

            Frame d = new Frame("更河里的按钮布局");
            d.setBounds(100, 100, 850, 480);

            Button but6 = new Button("Button1"); // 均为添加按钮
            Button but7 = new Button("Button2");
            Button but8 = new Button("Button3");
            Button but9 = new Button("Button4");
            Button but10 = new Button("Button5,but Exit");
            but10.addActionListener(arg0 -> System.exit(0));

            but6.setBackground(Color.blue); // 均为设置按钮颜色
            but7.setBackground(Color.yellow);
            but8.setBackground(Color.red);
            but9.setBackground(Color.green);
            but10.setBackground(Color.pink);

            d.add(but6, BorderLayout.EAST);
            d.add(but7, BorderLayout.NORTH);
            d.add(but8, BorderLayout.SOUTH);
            d.add(but9, BorderLayout.WEST);
            d.add(but10);

            // d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            d.setVisible(true);

            Frame f = new Frame("表格式布局");
            f.setBounds(100, 100, 400, 300);

            GridLayout gl = new GridLayout(3, 2, 5, 5);
            // 设置表格为3行两列排列，表格横向向间距为5个像素，纵向间距为5个像素
            f.setLayout(gl);

            Button but11 = new Button("Button1"); // 均为添加按钮
            Button but12 = new Button("Button2");
            Button but13 = new Button("Button3");
            Button but14 = new Button("Button4");
            Button but15 = new Button("Button5");

            but11.setBackground(Color.blue); // 均为设置按钮颜色
            but12.setBackground(Color.yellow);
            but13.setBackground(Color.red);
            but14.setBackground(Color.green);
            but15.setBackground(Color.pink);

            f.add(but11);
            f.add(but12);
            f.add(but13);
            f.add(but14);
            f.add(but15);

            // f.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
            f.setVisible(true);
            Thread.sleep(500);
    }
}