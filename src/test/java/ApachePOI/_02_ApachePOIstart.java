package ApachePOI;

import org.apache.poi.ss.usermodel.*; // * = everything

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _02_ApachePOIstart {

    public static void main(String[] args) throws IOException {

        // right click > copy path > content root
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        // this is works for reading files
        FileInputStream fileReadConnection = new FileInputStream(path);

        // on the memory, create a workbook
        Workbook workbook = WorkbookFactory.create(fileReadConnection);

        // on the memory, opening sheet in workbook(Excel)
        Sheet workPage = workbook.getSheet("Sheet1");

        // we will get the row
        Row row = workPage.getRow(0); // got the 0. row

        // we will get the cell
        Cell cell = row.getCell(0); // got the 0. cell

        System.out.println("cell = " + cell);

    }

}
