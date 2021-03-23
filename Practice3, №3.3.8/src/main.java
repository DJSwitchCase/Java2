// 1) List с использованием Semaphore
// 2) Map с использованием ключевого слова synchronized
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;


public class main {
    public static class myThread1 extends Thread
    {
        final Map<String, Integer> m;
        myThread1(Map<String, Integer> m)
        {
            this.m = m;
        }
        public void run() {
            synchronized (m) //синхронизируем
            {
                System.out.println("Поток " + Thread.currentThread().getName() + " запущен");
                m.put("key1", 1);
                System.out.println(Thread.currentThread().getName() + ": key1 added");
                m.put("key2", 2);
                System.out.println(Thread.currentThread().getName() + ": key2 added");
                m.put("key3", 3);
                System.out.println(Thread.currentThread().getName() + ": key3 added");
                m.put("key4", 4);
                System.out.println(Thread.currentThread().getName() + ": key4 added");
                m.put("key5", 5);
                System.out.println(Thread.currentThread().getName() + ": key5 added");
            }
        }
    }
    public static class myThread2 extends Thread
    {
        private static final Semaphore sem = new Semaphore(1); //Важно, что static!
        List<Integer> l;
        myThread2(List<Integer> l)
        {
            this.l = l;
        }
        public void run()
        {
            try
            {
                System.out.println("Поток " + Thread.currentThread().getName() + " запущен");
                sem.acquire();
                for (int i = 0; i < 10; i++)
                    {
                    l.add(i);
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    }
                sem.release();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] args) {
        //1)
        List<Integer> list = new ArrayList<>();
        Thread one = new myThread2(list);
        one.setName("Thread1");
        Thread two = new myThread2(list);
        two.setName("Thread2");
        System.out.println("Задание 1:");
        //Проверка задания
        //one.start();
        //two.start();

        //2)
        Map map = new HashMap();

        Thread three = new myThread1(map);
        three.setName("Thread3");

        Thread four = new myThread1(map);
        four.setName("Thread4");
        System.out.println("Задание 2:");
        //Проверка задания
        //three.start();
        //four.start();




    }
}
