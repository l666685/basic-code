package cn.itcast.test;

public class e10 {
    public static void main(String[] args){
        int x = 0 ;
        int y = 0 ;
        int z = 2 ;
        do{
            //System.out.println("Y=" + y);
            System.out.println("Z=" + z);
            x = x + 3 ;
            y = y + x ;
            z = z + z ;
        }while (y <= 10000);
    }
}