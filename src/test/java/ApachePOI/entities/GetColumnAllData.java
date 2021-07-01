package ApachePOI.entities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * LoginData.xlsx i kullanarak, istneilen kolondaki bilgileri
 * ekrana yazdıran programı metod kullanarak yazdırınız.metod kolon numarası alsın.
 *  * src/test/java/ApachePOI/resources/LoginData.xlsx
 */

public class GetColumnAllData {
    public static void main(String[] args) {

        System.out.print("Column No=");
        Scanner oku=new Scanner(System.in);
        int columnNum=oku.nextInt();

        List<String> returnList=getColumnData(columnNum);
        System.out.println(returnList);

    }
    public static List<String>getColumnData(int columnNum){
        List<String> listCol =new ArrayList<>();

        Workbook workbook=null;
        try {
            FileInputStream inputStream = new FileInputStream("src/test/java/ApachePOI/resources/LoginData.xlsx");
            workbook = WorkbookFactory.create(inputStream);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        assert workbook != null;
        Sheet sheet= workbook.getSheet("Login");

        int rowCount= sheet.getPhysicalNumberOfRows();

        for(int i=0;i< rowCount ;i++) {
            Row row= sheet.getRow(i);

            int cellCount=row.getPhysicalNumberOfCells();

            if (cellCount > columnNum) {
                Cell cell = row.getCell(columnNum);
                listCol.add(cell.toString());
            }
        }
        return listCol;

    }
}
