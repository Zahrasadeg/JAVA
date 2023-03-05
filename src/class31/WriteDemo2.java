package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/zahra.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("Name","Zahra");
        properties.setProperty("LastName","Sadeghi");
        properties.store(fileOutputStream,"Owner");
    }
}
