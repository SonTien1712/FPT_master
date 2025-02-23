package Week5.LargeNumber;

import java.util.ArrayList;

public class InfinitiveNumber
{
    ArrayList<Integer> iNumber;
    public InfinitiveNumber(String number)
    {
        ArrayList<Integer>
        for(int i=number.length()-1;i>=0;i--)
        {
            iNumber.add(number.toCharArray(i));
        }
    }

}
