public class lesson2 {

    public static void main(String[] args) {
        boolean flag = method1(2, 14);
        System.out.println(flag);
        method2(-1);
        boolean flag2 = method3(-1);
        System.out.println(flag2);
        method4("Строка", 6);
    }

    public static boolean method1(int a, int b) {
        return a + b >= 10 && a + b <= 20;

    }

    public static void method2(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");

        } else {
            System.out.println("Число отрицательное");
        }

    }
    public static boolean method3(int c) {
        return (c <0);
    }
    public static void method4(String one, int two) {
        for (int f = 0; f < two; f++) {
            System.out.println(one);
        }
    }
}
