package testing;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtility {

    public static Object[][] getExcelData(String filepath, String sheetName) throws IOException {
        Object[][] data = null;
        try (FileInputStream fileInputStream = new FileInputStream(filepath)) {
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheet(sheetName);
            int totalRows = sheet.getLastRowNum();
            int totalColumns = sheet.getRow(0).getLastCellNum();
            data = new Object[totalRows][totalColumns];
            for (int i = 1; i <= totalRows; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < totalColumns; j++) {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = (cell == null) ? "" : cell.toString();
                }
            }
        } catch (Exception e) {
        }
        return data;
    }
}