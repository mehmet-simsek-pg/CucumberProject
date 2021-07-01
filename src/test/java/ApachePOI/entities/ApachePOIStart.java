package ApachePOI.entities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ApachePOIStart {
    public static void main(String[] args) {

        FileInputStream fileInputStream;
        Workbook workbook = null;
        try {
            fileInputStream=new FileInputStream("src/test/java/ApachePOI/resources/ApacheExcel2.xlsx");
            workbook= WorkbookFactory.create(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert workbook != null;
        Sheet sheet= workbook.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        Cell cell=row.getCell(0);

        System.out.println("cell = " + cell);
    }
}
