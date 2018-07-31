import java.util.Random;
public class Random
{
    public static void main(String[] args)
    {
        Random randomNum = new Random();
    }
        int numValues = 100;
        int[] values = new int[numValues];
        for (int number = 0; number < numValues; ++number)
        {
        int num = random.nextInt(100);
        System.out.print(num + " ");

        values[number] = num;
    }
    boolean swap;
            do
    {
        swap = false;
        int temp;
        for (int count = 0; count < numValues-1; count++)
            if (values[count] > values[count+1])
            {
                temp = values[count];
                values[count] = values[count+1];
                values[count+1] = temp;
                swap = true;
            }
    } while (swap);

            System.out.print(values[count] + " ");
}

