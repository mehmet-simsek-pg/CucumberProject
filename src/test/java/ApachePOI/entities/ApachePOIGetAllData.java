package ApachePOI.entities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ApachePOIGetAllData {
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

        int rowCount= sheet.getPhysicalNumberOfRows();
        
        for (int i = 0; i <rowCount ; i++) {
            Row row=sheet.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells();
            for (int j = 0; j <cellCount ; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }

    }
}
