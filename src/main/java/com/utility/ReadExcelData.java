package com.utility;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

public class ReadExcelData {
    public static String getParticularData(int rowValue, int columnValue) {
        String data = null;
        try {

          File file = new File("D:\\HariS\\Downloads\\DataDriven_IPT.xlsx");
            Workbook book = new XSSFWorkbook(file);
            Sheet sheet = book.getSheet("Sheet1");
            Row row = sheet.getRow(rowValue);
            Cell cell = row.getCell(columnValue);

//Dataformatter---- converts the datatype into string
            DataFormatter dataFormat = new DataFormatter();
            String data1 = dataFormat.formatCellValue(cell);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return data;


    }

}
