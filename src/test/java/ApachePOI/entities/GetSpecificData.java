package ApachePOI.entities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.Scanner;

 /**
 * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
 * yani metoda "password" kelimesi gönderilecek, dönen değer password un kendisi olacak.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */


public class GetSpecificData {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Searched word: ");
        String searchedWord=scanner.nextLine();

        String returnString=search(searchedWord);
        System.out.println("returnString = " + returnString);


    }
    public static String search(String data){
        StringBuilder stringBuilder=new StringBuilder();

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

        for(int i=0;i< rowCount ;i++)
        {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(data))
            {
                int cellCount=sheet.getRow(i).getPhysicalNumberOfCells();

                for(int j=1; j< cellCount;j++)
                {
                    stringBuilder.append(sheet.getRow(i).getCell(j)).append(" ");
                }
            }
        }
        return  stringBuilder.toString();
    }

}
