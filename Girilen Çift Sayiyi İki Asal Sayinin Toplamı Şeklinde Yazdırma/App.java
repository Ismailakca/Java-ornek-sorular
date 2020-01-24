package com.akca;

import java.util.Scanner;

class App{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.printf("Lütfen Bir Çift Sayi Giriniz ");
        int val = Integer.parseInt(kb.nextLine());
        System.out.printf("Sayi %d%n",val);
        NumberUtil.run(val);


    }
}

class NumberUtil{
    public static boolean isPrime(int val)
    {
        if (val <= 1)
            return false;
        if (val % 2 == 0)
            return val == 2;
        if (val % 3 == 0)
            return val == 3;
        if (val % 5 == 0)
            return val == 5;
        if (val % 7 == 0)
            return val == 7;
        for (int i = 11; i * i <= val; i+=2)
            if (val % i == 0)
                return false;
        return true;
    }
    public static void run(int val)
    {
        if (val % 2 != 0) {
            System.out.printf("Lütfen Çift Sayi Giriniz");
            return;
        }
        for (int i = 0; i < val; ++i){
            if(NumberUtil.isPrime(i))
                for (int j = i ; j < val; ++j)
                    if (NumberUtil.isPrime(j))
                        if (i + j == val)
                            System.out.printf("%d %d%n",i,j);
        }
    }
}