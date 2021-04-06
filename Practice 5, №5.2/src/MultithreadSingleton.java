//Есть поддержка многопотока, но нет ленивой инициализации
public class MultithreadSingleton
{
    private static MultithreadSingleton instance = new MultithreadSingleton();
    private static String logFile = "This is the MultithreadSingleton log file \n";

    private MultithreadSingleton(){}
    public static MultithreadSingleton getInstance()
    {
        return instance;
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

