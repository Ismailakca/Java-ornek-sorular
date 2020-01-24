package com.akca;

import java.util.Scanner;

class App{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Lütfen Birinci sayiyi Giriniz");
        int a = Integer.parseInt(kb.nextLine());
        System.out.println("Lütfen İkinci sayiyi Giriniz");
        int b = Integer.parseInt(kb.nextLine());
        System.out.println("Lütfen Üçüncü sayiyi Giriniz");
        int c = Integer.parseInt(kb.nextLine());

        NumberUtil.mid(a,b,c);
    }
}
class NumberUtil{
    public static void mid(int a,int b,int c)
    {
        if (a > b)
            if (a < c)
                System.out.printf("Ortanca Sayi %d%n", a);
            else if (b > c)
                System.out.printf("Ortanca Sayi %d%n", b);
            else
                System.out.printf("Ortanca Sayi %d%n", c);
        else
            if(a > c)
                System.out.printf("Ortanca Sayi %d%n", a);
            else if (b < c)
                System.out.printf("Ortanca Sayi %d%n", b);
            else
                System.out.printf("Ortanca Sayi %d%n", c);
    }
}