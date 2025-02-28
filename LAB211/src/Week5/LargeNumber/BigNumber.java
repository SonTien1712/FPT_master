package Week5.LargeNumber;

public class BigNumber
{
    String value;
//     char[] data;
     public BigNumber(String value)
     {
         this.value=value;
     }

     public BigNumber addTwoNumber(BigNumber other)
     {
         return new BigNumber(addBigNumber(this.value,other.value));
     }

     public String addBigNumber(String s1, String s2)
     {
         int carry=0;
         StringBuilder result = new StringBuilder();
        // if(s1.length()<s2.length()) SwapString(s1,s2);
         for(int i=s1.length()-1;i>=0;i--)
         {
             int num1=s1.charAt(i)-'0';
             int num2= s2.charAt(i)-'0';
             int sum = num1+num2+carry;
             result.append(sum%10);
             carry=sum/10;
         }
         if(carry>0) result.append(carry);

         return result.reverse().toString();
     }
     public BigNumber MultwoNumber(BigNumber other) {
//     {
         return new BigNumber(mulBigNumber(this.value,other.value));
     }
     public String mulBigNumber(String s01,String s02)
     {
         int carry=0;
         String[] result = new String[Math.max(s01.length(),s02.length())*2+1];
//         String[] result = ;
//         for(int i=s01.length()-1;i>=0;i--)
//         {
//             int num1=s01.charAt(i)-'0';
//             int num2= s02.charAt(i)-'0';
//             int sum = num1*num2+carry;
//             result.addFirst(sum%10);
//         }
//
         // if(s1.length()<s2.length()) SwapString(s1,s2);
//         for(int i=s01.length()-1;i>=0;i--)
//         {
//             int num1=s01.charAt(i)-'0';
//             for (int j=s02.length()-1;j>=0;j--)
//             {
//                 int num2 = s02.charAt(j) - '0';
//                 int sum = num1 * num2 + carry + result.charAt(i);
//                 result.append(sum % 10);
//                 carry = sum / 10;
//             }
//         }
//         if(carry>0) result.append(carry);
//
         return result.toString();

     }






}
