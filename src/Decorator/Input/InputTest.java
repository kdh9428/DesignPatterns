package Decorator.Input;

import java.io.*;

public class InputTest {

    public static void main(String[] args) {
        int c;

        File file = new File("C:\\Developer\\DesignPatterns\\src\\Decorator\\Input\\test");
        File file1 = new File("./test");
        File file3 = new File(".");

        System.out.println(file3.getAbsolutePath());
        System.out.println(file1.isFile());

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(new FileInputStream("C:\\Developer\\DesignPatterns\\src\\Decorator\\Input\\test"))
            );
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
