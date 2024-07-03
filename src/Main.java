// it's always a good time to practice java!
// started 6/27/2024

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        Kata.sortDesc(5444327);
        Kata.countBy(1,10);
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        String sTest = "abcdef";
        System.out.println(Arrays.toString(Kata.solution(sTest)));
    }

    public static long factorial(int n)
    {
        long fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
}