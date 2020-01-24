package com.akca;

import java.util.Scanner;

class App{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.printf("Lütfen Saniyeyi Giriniz");
        int val = Integer.parseInt(kb.nextLine());

        NumberUtil.run(val);
    }
}
class NumberUtil{
    public static void run(long val)
    {
        long a,b,c;

        a = val / 3600; //Saat hesaplama
        b = val % 3600 / 60; //Dakika Hesaplama
        c = val % 60; //Saniye Hesaplama

        if (a == 0)
            if (b == 0)
                if (c == 0)
                    System.out.printf("Sıfır Girdiniz :)");
                else
                    System.out.printf("%d Saniye",c);
            else if (c == 0)
                System.out.printf("%d Dakika",b);
            else
                System.out.printf("%d Dakika %d Saniye",b,c);
        else if (b == 0)
            if (c == 0)
                System.out.printf("%d Saat",a);
            else
                System.out.printf("%d Saat %d Saniye",a,c);
          else if (c == 0)
            System.out.printf("%d Saat %d Dakika",a,b);
          else
            System.out.printf("%d Saat %d Dakika %d Saniye",a,b,c);
    }
}