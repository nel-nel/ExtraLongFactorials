/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extralongfactorials;
import java.util.*;
import java.math.*;

public class ExtralongFactorials {

    public static int numberOfCalls = 1;
    public static BigInteger one = new BigInteger("1");

    static BigInteger extraLongFactorials(BigInteger n) {
        if (n.compareTo(one) == 0) {
         return one;
        }
        //BigInteger bi_one = n.subtract(one);
        numberOfCalls++;
        return n.multiply(extraLongFactorials(n.subtract(one)));
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String nAsString = String.valueOf(n);
        BigInteger bn = new BigInteger(nAsString);
        System.out.println(extraLongFactorials(bn));
        in.close();
    }
    
}
