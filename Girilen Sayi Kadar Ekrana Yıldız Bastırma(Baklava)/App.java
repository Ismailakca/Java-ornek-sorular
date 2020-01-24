package com.akca;
import java.util.Scanner;

class App{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int val = Integer.parseInt(kb.nextLine());

        NumberUtil.run(val);
    }
}
class NumberUtil{
    public static void run(int val)
    {
        for (int i = 0; i < val; ++i){
            for (int k = 0; k < val-i; ++k)
                System.out.printf(" ");
            for (int j = 1; j < 2*i; ++j)
                System.out.printf("*");
            System.out.println();
        }
        for (int i = val - 1; i >= 1; --i){
            for (int k = 1; k <= val-i; ++k)
                System.out.printf(" ");
            for (int j = i*2-1; j >= 1; --j)
                System.out.printf("*");
            System.out.printf("%n");
        }

    }
}