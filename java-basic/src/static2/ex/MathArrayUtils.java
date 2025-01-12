package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils()
    {

    }
    public static int sum(int[] array)
    {
        int sum = 0;
        for (int num : array)
        {
            sum += num;
        }
        return sum;
    }

    public static int average(int[] array)
    {
        return sum(array) / array.length;
    }
    public static int max(int[] array)
    {
        int max = array[0];
        for(int num : array)
        {
            if(max < num) max = num;
        }
        return max;
    }
    public static int min(int[] array)
    {
        int min = array[0];
        for(int num : array)
        {
            if(min > num) min = num;
        }
        return min;
    }
}
