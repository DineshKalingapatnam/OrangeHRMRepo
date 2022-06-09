package com.orangeSystem.OrangeHrm.TestScripts;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelDemo {

    void excelReader(){
        try {
            FileInputStream fis = new FileInputStream("src//test//resource//testData//hrm_testdata.xlsx");

            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = xssfWorkbook.getSheet("user_login");
            String data = sheet.getRow(0).getCell(1).getStringCellValue();

            System.out.println("Data : "+data);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    void writeExcel(){
        try {
            FileInputStream fis = new FileInputStream("src//test//resource//testData//hrm_testdata.xlsx");

            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = xssfWorkbook.getSheet("user_login");
           sheet.getRow(0).getCell(1).setCellValue("Anil");

           fis.close();

            FileOutputStream fos = new FileOutputStream("src//test//resource//testData//hrm_testdata.xlsx");

            xssfWorkbook.write(fos);
            fos.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExcelDemo excelDemo = new ExcelDemo();

       // excelDemo.excelReader();
        excelDemo.writeExcel();
    }
}
