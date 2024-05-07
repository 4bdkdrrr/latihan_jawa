package com.lat1;

import java.util.Scanner;


public class InputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();

        System.out.println("Halo, " + nama +  "!");

        input.close();
        
    }

}
