package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger bi1 = new BigInteger(sc.next());
        BigInteger bi2 = new BigInteger(sc.next());

        BigInteger  bi3, bi4;
        bi3 = bi1.add(bi2);
        bi4 = bi1.multiply(bi2);
        System.out.println( bi3);
        System.out.println( bi4);



    }
}
