//Задание №6: Имплементировать интерфейс Comparator, сравнивающий двух
//                  студентов по набранным за семестр баллов.

import java.util.*;
import java.util.function.*;
public class main {
    public static void main(String[] args) {
        List<Student> classroom = new ArrayList<>();

        Student Katya = new Student(50, "Katya");
        Student Petya = new Student(80,"Petya");
        Student Oleg = new Student(10, "Oleg");
        Student Zhora = new Student(100, "Zhora");

        classroom.add(Katya);
        classroom.add(Petya);
        classroom.add(Oleg);
        classroom.add(Zhora);

        //Имплементация Comparator через отдельный внешний класс ComparatorImp
        //Comparator<Student>com = new ComparatorImp();


         //Имплементация через внутренний анонимный класс
//        Comparator<Student> com = new Comparator<Student>()
//        {
//            public int compare(Student o1, Student o2) {
//                if (o1.getScore()>o2.getScore())
//                    return -1; //not swap
//                else
//                    return 1; //swap
//            }
//        };

         //Имплементация через лямбда-функцию
//          Comparator<Student> com = (o1, o2) -> {
//                if (o1.getScore()>o2.getScore())
//                    return -1; //not swap
//                else
//                    return 1; //swap
//            };

        //Лаконичная имплементация через лямбда-функцию
        Comparator<Student> com = (o1, o2) -> (o1.getScore()>o2.getScore())? -1 : 1;

        classroom.sort(com);

        for (Student i: classroom)
            System.out.println(i.getName());
    }
}
