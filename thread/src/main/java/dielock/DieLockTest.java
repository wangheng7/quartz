package dielock;

public class DieLockTest {
    public static void main(String[] args) {
        DieLock dieLock1 = new DieLock(true);
        DieLock dieLock2 = new DieLock(false);

        dieLock1.run();
        dieLock2.run();
    }
}
