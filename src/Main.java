public class Main {

    public static  void main(String[] args) {
        WiteNotifyABC witeNotifyABC = new WiteNotifyABC();
        Thread thA = new Thread(witeNotifyABC::printedA);
        Thread thB = new Thread(witeNotifyABC::printedB);
        Thread thC = new Thread(witeNotifyABC::printedC);
        thA.start();
        thB.start();
        thC.start();

    }
}
