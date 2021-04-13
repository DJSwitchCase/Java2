import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Human> hList = new ArrayList<>();
        hList = StreamAPI.getList();

        //Фильтруем на старших 20
        List<Human> FilteredBy20List = StreamAPI.filterBy20Age(hList);
        //StreamAPI.printout(FilteredBy20List);

        //Сортируем по последней букве
        List<Human> SortedByTheLastLetter = StreamAPI.sortByTheLastLetter(hList);
        //StreamAPI.printout(SortedByTheLastLetter);

        //Увеличиваем возраст каждого человека на 3
        List<Human> IncrBy3 = StreamAPI.incrBy3(hList);
        //StreamAPI.printout(IncrBy3);

        //Выводим средний возраст всех элементов
        System.out.println(StreamAPI.averageAge(hList, hList.size()));
    }
}
