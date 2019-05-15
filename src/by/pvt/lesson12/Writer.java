package by.pvt.lesson12;

import java.io.*;

public class Writer {

    public void writeToFile(byte[] content, String fileName) {
        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream(fileName, true);
            fileOutputStream.write(content);
            //fileOutputStream.flush();
            //fileOutputStream.close();

        } catch (IOException io) {
        }
    }

    public byte[] readFromFile(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                return null;
            }
            FileInputStream fileInputStream;
            fileInputStream = new FileInputStream(fileName);

            byte[] bytes = new byte[(int) file.length()];
            fileInputStream.read(bytes);
            return bytes;
        } catch (IOException io) {
        }
        return null;
    }

    public void readStringFromFile(String fileName) {
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(fileName));
            while (bufferedReader.ready()) {
                String s = bufferedReader.readLine();
                System.out.println(s);
            }
        } catch (Exception e) {
        }
    }
}
