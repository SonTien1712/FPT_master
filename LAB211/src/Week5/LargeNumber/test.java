package Week5.LargeNumber;

import java.math.BigInteger;

public class test
{
    public static void main(String[] a)
    {
        BigNumber bigNumber = new BigNumber("123456789");
        BigNumber bigNumber2 = new BigNumber("123456789");
        BigNumber sum = bigNumber.addTwoNumber(bigNumber2);
        System.out.println(" sum :  "+sum.value );

        BigInteger bi1 = new BigInteger("123456789");
        BigInteger bi2 = new BigInteger("123456789");
        System.out.println("sum2  : " + bi1.add(bi2).toString());


        BigNumber mul = bigNumber.MultwoNumber(bigNumber2);
        System.out.println(" mul :  "+mul.value );


        System.out.println("sum2  : " + bi1.multiply(bi2).toString());
    }
}
