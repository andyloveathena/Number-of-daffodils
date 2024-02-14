import java.util.Scanner;

import static java.lang.Math.*;

public class Second {
    // %餘數
    // /整數
    public static void main(String[] args) {
        // 打印出所有的"水仙花數"，所謂"水仙花數"是指一個三位數，其各位數字立方和等於該數本身。例如：153是一個"水仙花數"，因為$153=1^3+5^3+3^3$，或370也是水仙花數，因為$370=3^3+7^3+0^3$。

        for (int i = 100; i < 1000; i++) {
            int unit = i % 10;
            int ten = (i / 10) % 10;
            int third = (i / 100) % 10;

            int sum = (int) (Math.pow(unit, 3) + Math.pow(ten, 3) + Math.pow(third, 3));

            if (i==sum){
                System.out.println(i);

            }

        }



    }
}