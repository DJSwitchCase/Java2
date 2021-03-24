import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/*
https://www.youtube.com/watch?v=j9FA0C2pdkA
Future через es возникает тогда, когда делаем команду submit
ExecutorService es = Executors.newFixedThreadPool(5);
Future<Integer> sub = es.submit(new MyCallable());
es.shutdown();
Есть два метода:
sub.get() -> ждет окончания потока
sub.isDone() -> возвращает значение на протяжении работы потока
Callable возвращает return'ом значение какого-то типа, в отличие от Runnable, при котором ничего не возвращается (можно без типа, возвращает object)
sub.cancel(true) -> прекращает поток, если тот был "уязвим" (спит, ожидает).

можно вместо get и isdone использовать invokeAll(tasks) для того, чтобы ожидать выполнения всех потоков сразу без перехода на следующую строку кода =>
=> возвращает список всех завершенных потоков
invokeany(tasks) ждет завершения какого-либо из потоков, остальных пытается отрубить cancel()'ом.
*/
public class main {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(3);
        //1) add (invokeAll, invokeAny)
//        List<myCallable> list = new ArrayList<>();
//        for (int i = 0; i<3; i++)
//            list.add(new myCallable());
//
//        List<Future<Integer>> futures = es.invokeAll(list); //запускаем все потоки, ждём их завершения !!ИЛИ!!
//        //System.out.println(es.invokeAny(list)); //запускаем все потоки, ждём завершения хотя бы одного, остальные пытаемся вырубить cancel()'ом, переходим к следующей операции

        //2) submit (get(), isDone())
        Future<Integer> sub = es.submit((Callable<Integer>) () -> {
            System.out.println("Started: " + Thread.currentThread().getId());
            Thread.sleep(4000);
            System.out.println("Finished: " + Thread.currentThread().getId());
            return 0;
        });
        //sub.get(); // ждём окончания потока, затем переходим на сл. операцию

//        while (!sub.isDone())
//            System.out.println("Ждём-ждём-ждём"); //Выполняем команду, пока поток не завершился, затем переходим на сл. операцию

        System.out.println("The End");
        es.shutdown();
    }
}
class myCallable implements Callable<Integer>
{

    @Override
    public Integer call() throws Exception {
        System.out.println("Started: "+Thread.currentThread().getId());
        Thread.sleep(2500);
        System.out.println("Finished: "+Thread.currentThread().getId());
        return 0;
    }
}
