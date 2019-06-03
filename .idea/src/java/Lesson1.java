/**
 * Вадим, Дзюбенко, lesson1, 28,05,2019
 */
public class Lesson1{
    public static void main (String[] args){
        byte y = 1;
        short u = 2;
        int o = 3;
        long p = 3333333;
        float g = 1.01f;
        double h = 12.33;
        char j = 'c';
        boolean k = false;
        System.out.println(calculate(3,2,2,4));
        System.out.println(task10And20(5,4));
        isPositiveOrNegative(-20);
        greetings("Вася");
        year(2000);
    }
    public static int calculate(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    public static boolean task10And20(int x1, int x2){
        if ((x1 + x2 >= 10) && (x1 + x2 <= 20)){
            return true;
        } else
            return false;

    }
    public static void isPositiveOrNegative(int x){
        if (x >= 0){
            System.out.println("Число х Положительное");

        }
        else {
            System.out.println("Число х Отрицательное");
        }
    }
    public static void greetings(String name){
        System.out.println("Привет, "+ name + "!");
    }

    public static void year(int s){
        if ((s % 4  == 0) && (s %100 !=0) || (s % 400 == 0)) {
            System.out.println("Год является Високосным!");
        }
        else System.out.println("Год не Високосный!");
    }


}
