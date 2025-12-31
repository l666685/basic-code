import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class jian_ce_zi_fu {
    public static void main(String[] args) {
        String str = "Java教程%&";
        boolean flag = isSpecialChar(str);
        System.out.println("str包含特殊字符：" + flag);
    }

    public static boolean isSpecialChar(String str) {
        String regEx = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.find();
    }
}