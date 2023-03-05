package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo5 {
    public static void main(String[] args) throws IOException {
        String path="Files/Book1 (1).xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");
        int noofrow=sheet2.getPhysicalNumberOfRows();
        System.out.println(noofrow);
        List<Map<String,String>>excelData=new ArrayList<>();
        for(int i=0;i<noofrow;i++) {
            Row row = sheet2.getRow(i);
            LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();
            rowMap.put("UserName", row.getCell(0).toString());
            rowMap.put("Password", row.getCell(1).toString());
            excelData.add(rowMap);
        }
        System.out.println(excelData);

       /*    // System.out.println(row.getCell(0)+" "+row.getCell(1));
        int noofcell=row.getPhysicalNumberOfCells();
        for (int j=0;j<noofcell;j++){
            System.out.print(row.getCell(j)+" ");
        }
            System.out.println();
        }*/


    }
}
