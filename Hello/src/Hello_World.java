public class Hello_World {

    public static void main(String [] args)
    {
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        int myValue = maxValue+1;
        System.out.println("Integer Value+1  = "+myValue);

        int myValue_1 = 2_147_483_647;
        System.out.println("Integer Value_ separate   = "+myValue_1);

        byte myMinValue_Byte = Byte.MIN_VALUE;
        byte myMaxValue_Byte =  Byte.MAX_VALUE;

        System.out.println ("Byte minimum value =" + myMinValue_Byte);
        System.out.println ("Byte max value =" + myMaxValue_Byte);

        Short myMinValue_Short = Short.MIN_VALUE;
        Short myMaxValue_Short =  Short.MAX_VALUE;

        System.out.println ("Short minimum value =" + myMinValue_Short);
        System.out.println ("Short max value =" + myMaxValue_Short);

        //// CTRL+R -> replace;
        //// Shift+F10 -> Compile;
        Long myMinValue_Long = Long.MIN_VALUE;
        Long myMaxValue_Long =  Long.MAX_VALUE;

        System.out.println ("Long minimum value =" + myMinValue_Long);
        System.out.println ("Long max value =" + myMaxValue_Long);

        Long tmp;
        tmp = 2_147_483_647L;
        System.out.print("My tmp is =" +tmp);

    }
}
