package classtask;

import java.io.FileReader;

public class ReadThread implements Runnable {
    public void run() {
        String filename = "people.txt";
        String myFile = "C:\\Users\\cyxkr\\Documents\\Programming\\Java\\" + filename;

        try {
            FileReader fileReader = new FileReader(myFile);
            
            int i;

            System.out.println("------------- THE FILE READER PROGRAM ----------------");
            System.out.println("\nYOUR FILE DATA\n");
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }

            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
