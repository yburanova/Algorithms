package oop.algorithms.Algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by yulia on 15.05.16.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) throws Exception
    {
        // reading the 2 numbers from the input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        //Euclid's algorithm
        while (n != 0)
        {
            int tmp = m % n;
            m = n;
            n = tmp;
        }

        System.out.println(m);
    }
}
