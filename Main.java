package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)  {
      /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Привет " + name);*/

      ///for (int i = args.length - 1; i >= 0; i--){
        //  System.out.println("Revers" + args[i]);
        int i = args.length-1;
        try {
            while ( i >= 0){
                i--;
                System.out.println("Аргумент = " + args [i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){}
    }
      }


