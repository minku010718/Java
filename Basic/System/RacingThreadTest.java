

public class Main {
    static int balance = 0;
    static final int ITER = 100000;

    public static synchronized void increase() {
        int tmp = balance;  //읽기
        Thread.yield();     //스레드간의 경쟁
        balance = tmp + 5000;
    }
    public static synchronized void decrease() {
        int tmp = balance;
        Thread.yield();
        balance = tmp - 5000;
    }

    public static void main(String[] args) {
        balance = 0;
        Thread t1 = new Thread(()->{
            for (int i = 0; i < ITER; i++)
                increase();
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < ITER; i++)
                decrease();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("최종 Balance의 값 : " + balance);
    }
}
