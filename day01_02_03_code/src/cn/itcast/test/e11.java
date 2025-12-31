package cn.itcast.test;

public class e11 {
    public static void main(String[] args){
        int a = 0 ;
        do{
            String b = String.valueOf(a);
            boolean emm = b.contains("7");
            if ( a % 7 == 0){
                System.out.println("逢7过：过过过");
            }
            else if (emm){
                System.out.println("逢7过：过过过");
            }
            else {
                System.out.println("逢7过：" + a);
            }
            a = a + 1;
        }while( a <= 200 );
    }
}