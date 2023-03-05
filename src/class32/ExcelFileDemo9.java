package class32;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>>excelData= ExcelReader.read();
        System.out.println(excelData);
        Map<String,String>firstrow=excelData.get(0);
        System.out.println(firstrow.get("Name"));
        System.out.println(firstrow);
        Map<String,String>sectrow=excelData.get(1);
        System.out.println(sectrow.get("salary"));

    }
}
