public class MultiThreadTest {
    static class NewThread implements Runnable {
        Thread t;
        NewThread() {
            t = new Thread(this, "first thread");
            System.out.println(t + "second thread");
            t.start();
        }

        public void run() {
            try {
                for (int i=4; i>0; i--) {
                    strBuilder.append("S" + i);
                    System.out.println(strBuilder);
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                System.out.println("second thread interrupted.");
            }
            System.out.println("Existing second thread.");
        }
    }

    static StringBuffer strBuilder = new StringBuffer("");
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i=4; i>0; i--) {
                strBuilder.append("F" + i);
                System.out.println(strBuilder);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("first thread interrupted.");
        }
        System.out.println("Existing first thread.");
    }
}
