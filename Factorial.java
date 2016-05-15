package oop.algorithms.Algorithms;

import java.io.*;
import java.math.BigInteger;

/**
 * Created by yulia on 15.05.16.
 */
public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n)
    {
        //add your code here
        if (n < 0) return "0";
        BigInteger big = BigInteger.valueOf(n);
        for (int i = n - 1; i > 0; i--)
        {
            big = big.multiply(BigInteger.valueOf(i));
        }

        return big.toString();
    }
}
