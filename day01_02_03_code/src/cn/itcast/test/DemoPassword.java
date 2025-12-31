import java.util.Scanner;

public class DemoPassword {
    public static void main(String[] args) throws InterruptedException {
        String No1 = "admin";
        String No1_Password = "1145141919810";
        System.out.println("管理员密码？");
        Scanner ADMIN_ = new Scanner(System.in);
        int ADMIN = ADMIN_.nextInt();
        if (ADMIN == 114514) {
            System.out.println("设置账户：");
            Scanner NO11 = new Scanner(System.in);
            No1 = NO11.nextLine();
            System.out.println("设置密码：");
            Scanner Password_input = new Scanner(System.in);
            No1_Password = Password_input.nextLine();
            System.out.println("设置成功！");
            do {
                int times = 3;
                System.out.println("请输入用户名：");
                String NO1 = NO11.nextLine();
                if (NO1.equals(No1)) {
                    System.out.println("请输入密码：");
                    do {
                        String Password = Password_input.nextLine();
                        if (Password.equals(No1_Password)) {
                            System.out.println("正确，尝试登录ing...");
                            break;
                        } else {
                            System.out.println("密码错误，您还有" + times + "次机会");
                            times = times - 1;
                        }
                    } while (times != -1);
                    if (times == 0) {
                        System.out.println("错误次数过多，请稍候再试");
                        System.exit(1);
                    } else {
                        break;
                    }
                } else {
                    System.out.println("查无此用户，请检查后重试");
                }
            } while (0 != 1);
            System.out.println("emm,此登录系统仅作为测试……");
        } else {
            do {
                int times = 3;
                System.out.println("请输入用户名：");
                Scanner NO11 = new Scanner(System.in);
                String NO1 = NO11.nextLine();
                if (NO1.equals(No1)) {
                    System.out.println("请输入密码：");
                    Scanner Password_input = new Scanner(System.in);
                    do {
                        String Password = Password_input.nextLine();
                        if (Password.equals(No1_Password)) {
                            System.out.println("正确，尝试登录ing...");
                            break;
                        } else {
                            System.out.println("密码错误，您还有" + times + "次机会");
                            times = times - 1;
                        }
                    } while (times != -1);
                    if (times == -1) {
                        System.out.println("错误次数过多，请稍候再试");
                        System.exit(1);
                    } else {
                        break;
                    }
                } else {
                    System.out.println("查无此用户，请检查后重试");
                }
            } while (0 != 1);
            Thread.sleep(1000);
            System.out.println("emm,此登录系统仅作为测试……");
        }
    }
}