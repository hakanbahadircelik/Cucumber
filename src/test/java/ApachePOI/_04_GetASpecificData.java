package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_GetASpecificData {
    public static void main(String[] args) throws IOException {

        String result = getFromExcel("password");
        System.out.println(result);

    }

    public static String getFromExcel(String searchedWord) throws IOException {
        // this method will show the password on Excel

        String returnn = "";
        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().toLowerCase().contains(searchedWord.toLowerCase())) {

                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    returnn += sheet.getRow(i).getCell(j);
                }

            }
        }

        return returnn;
    }

}
