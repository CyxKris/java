package classtask;

public class RunApp {
    public static void main(String[] args) {
        try {
            WriteThread writeThread = new WriteThread();
            writeThread.start();
            writeThread.join();

            ReadThread readThread = new ReadThread();
            Thread thread = new Thread(readThread);
            thread.start();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
