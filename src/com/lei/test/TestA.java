package com.lei.test;

import java.util.Arrays;

public class TestA {
    public static void main(String[] args) {
        int a=65;
        char b='A';
        int i=0;
        System.out.println((int)b);

        for(;i<26;i++)
        {
            System.out.printf("%d %c ",a+i,b+i);
            if(i%10==4||i%10==9)
                System.out.printf("\n" );
        }
    }

}
