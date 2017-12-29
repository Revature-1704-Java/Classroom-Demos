package com.revature;

public class App 
{
    public static void main( String[] args )
    {
        
    }

    public static int add (String numbers) {
        numbers = numbers.replaceAll("\\s+", "");
        String[] numArray = numbers.split(",");
        int sum = 0;
        if (numArray.length > 2) {
            throw new RuntimeException("Too many operands");
        } else {
            for (String number : numArray) {
                if (!number.equals(""))
                    sum += Integer.parseInt(number);
                else
                    continue;
            }
        }
        return sum;
    }
}
