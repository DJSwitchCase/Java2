//Ленивую инициализацию (Lazy Initialization) еще называют отложенной инициализацией. Это прием в программировании, когда ресурсоемкая операция
// (а создание объекта – это ресурсоемкая операция) выполняется по требованию, а не заблаговременно.
// Что в общем-то и происходит в нашем коде Singleton’a.
// Другими словами, наш объект создается в момент обращения к нему, а не заранее.
public class LazyInitializedSingleton
{
        private static LazyInitializedSingleton instance;
        private static String logFile = "This is the LazyInitializedSingleton log file \n";

        private LazyInitializedSingleton(){}
        public static LazyInitializedSingleton getInstance(){ // #3
            if(instance == null){		//если объект еще не создан
                instance = new LazyInitializedSingleton();	//создать новый объект
            }
            return instance;		// вернуть ранее созданный объект
        }

        public void addLogInfo(String logInfo)
        {
            logFile+= logInfo + "\n";
        }

        public void showLogFile()
        {
            System.out.println(logFile);
        }
}

