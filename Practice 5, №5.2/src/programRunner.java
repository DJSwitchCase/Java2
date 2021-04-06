/*
        Паттерн Singleton
        1.) В системе должно существовать не более одного экземпляра заданного класса.
        2.) Экземпляр должен быть легко доступен для всех клиентов данного класса.
        3.) Создание объекта on demand, то есть, когда он понадобится первый раз, а не во время инициализации системы.
*/
public class programRunner
{
    public static void main(String[] args)
    {

        //Проверяю, что обращаемся к одному и тому же объекту
        System.out.println(LazyInitializedSingleton.getInstance().toString());
        System.out.println(LazyInitializedSingleton.getInstance().toString());

        System.out.println(MultithreadSingleton.getInstance().toString());
        System.out.println(MultithreadSingleton.getInstance().toString());

        System.out.println(InitializationOnDemand.getInstance().toString());
        System.out.println(InitializationOnDemand.getInstance().toString());
        System.out.println("\n");

        //Ленивая инициализация (нет поддержки многопотока)
        LazyInitializedSingleton.getInstance().addLogInfo("Privet");
        LazyInitializedSingleton.getInstance().addLogInfo("Kak dela");
        LazyInitializedSingleton.getInstance().showLogFile();

        //Инициализация, поддерживающая многопоток
        MultithreadSingleton.getInstance().addLogInfo("Hello");
        MultithreadSingleton.getInstance().addLogInfo("Bye");
        MultithreadSingleton.getInstance().showLogFile();

        //Многопоток + ленивая инициализация
        InitializationOnDemand.getInstance().addLogInfo("One");
        InitializationOnDemand.getInstance().addLogInfo("Two");
        InitializationOnDemand.getInstance().showLogFile();

    }
}
