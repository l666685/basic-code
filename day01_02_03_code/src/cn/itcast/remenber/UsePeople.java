package cn.itcast.remenber;

public class UsePeople {
    public static void main(String[] args) {
        people u = new people();

        u.setName(u.getName());
        u.setAge(u.getAge("1"));
        u.view();
    }
}
