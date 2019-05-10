package lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {

    public void writeToFile(byte[] content, String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(content);
            //fileOutputStream.flush();
            //fileOutputStream.close();

        } catch (FileNotFoundException e) {
        } catch (IOException io) {
        }
    }

    public byte[] readFromFile(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);

            byte[] bytes = new byte[10];

            fileInputStream.read(bytes);
            return bytes;
        } catch (IOException io) {
        }
        return null;
    }
}
