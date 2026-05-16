package cn.itcast.remenber;

public class people {
    private String name;
    private int age;

    public void view() {
        System.out.println(name);
        System.out.println(age);
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(String age){
        try {
            this.age=Integer.parseInt(age);
        }
        catch(NumberFormatException e){
            System.out.println("年龄你填字符串啊");
            System.exit(1);
        }
    }

    public String getName(){
        return name;
    }
    public int getAge(int num){
        return age;
    }

    public String getAge(String str){
        return Integer.toString(age);
    }
}
