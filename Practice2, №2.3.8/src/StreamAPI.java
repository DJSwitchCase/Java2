import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI
{
    //заполняем лист людьми
    public static List<Human> getList()
    {
        return List.of(
                new Human(18, "Igor", "Sokolovsky", LocalDate.of(2000,12,19), weight.MEDIUM),
                new Human(25, "Valya", "Bahanov", LocalDate.of(2002,6,27), weight.LIGHT),
                new Human(38, "Anna", "Prazshskaya", LocalDate.of(1980,5,18),weight.LIGHT),
                new Human(40, "Maxim", "Sokolovsky", LocalDate.of(1975,8,17),weight.MEDIUM)
        );
    }
    //Выводим элементы листа
    public static void printout(List<Human> hlist)
    {
    hlist.forEach(System.out::println);
    }

    //Фильтруем на старших 20
    public static List<Human> filterBy20Age(List<Human> hList)
    {
        return hList.stream().filter(human -> human.getAge()>20.).collect(Collectors.toList());
    }

    //Сортируем по последней букве
    public static List<Human> sortByTheLastLetter(List<Human> hlist)
    {
      return hlist.stream().sorted((h1,h2) ->
              {
                char letter1 = h1.getLastName().charAt(h1.getLastName().length()-1); //последняя буква фамилии первого человека в листе
                char letter2 = h2.getLastName().charAt(h2.getLastName().length()-1); //последняя буква фамилии второго человека в листе
                    return (letter1 > letter2)? 1: -1;
              }).collect(Collectors.toList());
    }

    //Увеличиваем возраст каждого человека на 3
    public static List<Human> incrBy3(List<Human> hlist)
    {
        hlist.stream().forEach(h -> h.age += 3);
        return hlist;
    }

    //Узнаём средний возраст всех элементов
    public static double averageAge(List<Human> hlist, int hListNumberOfElements)
    {
        double temp = hlist.stream().mapToInt(Human::getAge).sum();
        double x = temp / hListNumberOfElements;
        return x;
    }
}
