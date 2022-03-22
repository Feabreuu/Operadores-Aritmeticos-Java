package com.company;

public class OperadoresAritmeticosJava {

    public static void main(String[] args) {

        System.out.println("prePos");
        prePos();
        System.out.println("aritmetico");
        aritmetico();
        System.out.println("atribuicao");
        atribuicao();


            }

    private static void prePos () {

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i:" +i);
        System.out.println("j:" +j);
        System.out.println("x:" +x);

    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-d;
        int r3 = c*b;
        int r4 = e/a;
        int r5 = e%a;

        System.out.println("a+b:" + r1);
        System.out.println("c-d:" + r2);
        System.out.println("c*d:" + r3);
        System.out.println("e/a:" + r4);
        System.out.println("e%a:" + r5);

    }

    public static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500;
        int k = 35;
        float f =3.5F;
        double d = f;

        System.out.println("d:" + d);

        i +=5; //i = i+5
        j -=3; //i = j-3
        d /= 2.7d; //d =
        l *=3; //l = l*3

        System.out.println("i:" +i);
        System.out.println("j:" +j);
        System.out.println("d:" +d);
        System.out.println("l:" +l);

    }



}
