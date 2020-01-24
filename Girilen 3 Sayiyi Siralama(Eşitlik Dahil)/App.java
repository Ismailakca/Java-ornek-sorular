package com.akca;

import java.util.Scanner;

class App{
    public static void main(String[] args) {
        NumberUtil.run();
    }
}

class NumberUtil {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.printf("Lütfen Bir Sayi Giriniz");
        int a = Integer.parseInt(kb.nextLine());
        System.out.printf("Lütfen Bir Sayi Giriniz");
        int b = Integer.parseInt(kb.nextLine());
        System.out.printf("Lütfen Bir Sayi Giriniz");
        int c = Integer.parseInt(kb.nextLine());

        System.out.printf("Giriş %d %d %d%n",a,b,c);
        Number(a,b,c);

    }
    public static void Number(int a,int b,int c)
    {
        if(a <b) {
            if(a<c) {
                if(b<c) {
                    System.out.printf("Yanit : %d < %d < %d", a,b,c);
                }
                else if ( b > c) {
                    System.out.printf("Yanit : %d < %d < %d%n", a,c,b);
                }
                else
                    System.out.printf("Yanit : %d < %d = %d", a,b,c);
            }
            else if ( a > c) {
                System.out.printf("yanit : %d < %d < %d ", c,a,b);
            }
        }
        else if ( a > b)
            if(a > c)
                if(b> c)
                    System.out.printf(" Yanit : %d < %d < %d%n", c,b,a);
                else if(b<c)
                    System.out.printf("Yanit : %d < %d < %d%n", b,c,a);
                else
                    System.out.printf("Yanit : %d = %d < %d%n", c,b,a);
            else if(a<c)
                System.out.printf("Yanit : %d < %d < %d ", b,a,c);

        if(a == b)
            if(b<c)
                System.out.printf("Yanit : %d = %d < %d ", a,b,c);
            else if( b > c)
                System.out.printf("Yanit : %d < %d = %d ", c,a,b);
            else
                System.out.printf("Yanit : %d = %d = %d ", a,b,c);

        if(a == c)
            if(b<c)
                System.out.printf("Yanit : %d < %d = %d ", b,a,c);
            else if(b> c)
                System.out.printf("Yanit : %d = %d < %d", a,c,b);
    }
}