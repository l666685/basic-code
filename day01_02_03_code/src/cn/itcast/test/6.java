import java.awt.*;
import javax.swing.*;
import java.util.*;

class Test {
    public static void main(String[] args) {
        JFrame jf = new JFrame("qwq");
        JButton jb = new JButton("看我看我");
        jb.addActionListener(
                (e) -> JOptionPane.showMessageDialog(null, "我是个傻宝", "我宣布个事", JOptionPane.INFORMATION_MESSAGE));
        jf.setLocationRelativeTo(null);
        jf.add(jb);
        jf.setSize(854, 480);
        jf.setVisible(true);
    }
}
