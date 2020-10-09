public class WiteNotifyABC {

    private final Object mon = new Object();
    private  volatile char outLetter = 'A';



    public void printedA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (outLetter != 'A') {
                        mon.wait();
                    }
                    System.out.print("A");
                    outLetter = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printedB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (outLetter != 'B') {
                        mon.wait();
                    }
                    System.out.print("B");
                    outLetter = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printedC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (outLetter != 'C') {
                        mon.wait();
                    }
                    System.out.print("C");
                    outLetter = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }




}
