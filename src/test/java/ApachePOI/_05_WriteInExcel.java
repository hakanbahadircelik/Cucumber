package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _05_WriteInExcel {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path);  //  reading way is opened
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        int lastRowIndex = sheet.getPhysicalNumberOfRows();
        Row newRow = sheet.createRow(lastRowIndex);
        Cell newSell = newRow.createCell(0); // first cell created
        newSell.setCellValue("hello world");
        // writing is finished

        // close the channel
        inputStream.close();

        // saving part,
        // we need to change the file as a WRITER
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close(); // clean memory
        outputStream.close(); // close writing channel

        System.out.println("writing is finished");

    }
}
