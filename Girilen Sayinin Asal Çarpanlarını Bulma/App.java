package com.akca;

import java.util.Scanner;

class App{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.printf("Bir Sayi Gİriniz%n");
        int val = Integer.parseInt(kb.nextLine());
        System.out.printf("Girdiğiniz Sayi %d%n",val);
        System.out.printf("Asal Çarpanları ");

        for (int i = 1; i < val/2; ++i)
           if (val % i == 0)
               if (NumberUtil.isPrime(i))
                   System.out.printf("%d ",i);
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
        for (int i = 11; i * i <= val; i+= 2){
            if (val % i == 0)
                return false;
        }
        return true;

    }
}