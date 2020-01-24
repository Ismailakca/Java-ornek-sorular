package com.akca;

import java.util.Scanner;

class App{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayi Gİriniz");
        int a = Integer.parseInt(kb.nextLine());
        NumberUtil.run(a);
        
    }
}

class NumberUtil{
    public static void run(int val)
    {
        if(val > 0)
            System.out.println("Girdiğiniz Sayi Pozitif");
        else if(val < 0)
            System.out.println("Girdiğiniz Sayi Negatif");
        else
            System.out.println("Girdiğiniz Sayi 0'a Eşit :) ");
    }
}