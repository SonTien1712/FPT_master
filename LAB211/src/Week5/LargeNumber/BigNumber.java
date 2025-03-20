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
    private String mulBigNumber(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Avoid leading zeros
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    @Override
    public String toString() {
        return value;
    }







}
