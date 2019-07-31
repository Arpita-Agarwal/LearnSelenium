package com.oracle.qa;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadDataExcel {

    public static void ReadData() throws Exception {
        File src = new File("/Users/loaner/Applications/myProject/LearnSelenium/src/main/resources/TestExcel.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0);
        //int rowcount = sheet1.getLastRowNum();
        //int colcount = sheet1.getLastCellNum();
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 3; j++)
            {
                String Data0 = sheet1.getRow(i).getCell(j).getStringCellValue();
                System.out.println("Testdata " +Data0);

            }
        wb.close();

    }
}
