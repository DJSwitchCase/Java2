import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class main
{
    public static void main(String[] args)
    {
        List <Integer> values = Arrays.asList(5,25,12,45,10,3,49);
        Collections.sort(values);
        values.forEach(i ->System.out.println(i)); //Имплементировали Consumer лямбда-функцией, аналогично моему самому лаконичному решению 1.2.6 (1.2.6 сделал более подробно)
    }
}
