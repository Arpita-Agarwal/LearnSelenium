package com.test.util;

import net.sf.jxls.reader.XLSReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class utility {

    public static String readExcel(File src, int i, int j) throws Exception {

        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0);
        //int rowcount = sheet1.getLastRowNum();
        //int colcount = sheet1.getLastCellNum();
        //for (int i = 1; i < 4; i++)
          //  for (int j = 0; j < 3; j++)
                String Data = sheet1.getRow(i).getCell(j).getStringCellValue();
                System.out.println("Testdata " +Data);
        wb.close();
        return Data;
    }
    public static ArrayList<Object[]> getDataFromExcel() throws Exception {
        ArrayList<Object[]> mydata= new ArrayList<Object[]>();
        File src = new File("/Users/loaner/Applications/myProject/LearnSelenium/src/main/resources/TestExcel.xlsx");
        for (int ronum = 1; ronum<5; ronum++)
        {

            String firstname= readExcel(src,ronum,0);
            String lastname= readExcel(src,ronum,1);
            String jobtitle= readExcel(src,ronum,2);
            Object ob[]={firstname,lastname,jobtitle};
            mydata.add(ob);

        }
        return mydata;

    }
}
