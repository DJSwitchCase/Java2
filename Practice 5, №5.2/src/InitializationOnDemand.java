//В данном случае мы полностью решили проблему ленивой инициализации – объект инициализируется при первом вызове метода getInstance()
public class InitializationOnDemand {
    private static String logFile = "This is the InitializationOnDemand log file \n";

    private static class InitializationOnDemandHolder
    {
        private final static InitializationOnDemand instance = new InitializationOnDemand();
    }

    public static InitializationOnDemand getInstance()
    {
        return InitializationOnDemandHolder.instance;
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
