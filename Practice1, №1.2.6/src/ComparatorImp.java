//Отдельный класс, реализующий функциональный интерфейс Comparator
import java.util.Comparator;

public class ComparatorImp implements Comparator <Student>
{
    public int compare(Student o1, Student o2) {
        if (o1.getScore()>o2.getScore())
            return -1; //not swap
        else
            return 1; //swap
    }
}
