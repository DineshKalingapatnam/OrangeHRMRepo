package com.orangeSystem.OrangeHrm.Utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    private static String stubFileName = "src//test//resource//testData//hrm_testdata.xlsx";
    private static Workbook stubWorkbook;
    private static Sheet sheet;
    private static String sheetName;
    private boolean isSheetOpen = false;
    private boolean isSheetClosable= true;
    public void intiateWorkbook() {
        try {
            if(!isSheetOpen){
                stubWorkbook = new XSSFWorkbook(new FileInputStream(new File(stubFileName)));
                isSheetOpen = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Sheet getSheet(){
        if(sheet == null){
            if(null == sheetName){
                System.out.println("Sheet name has not been set or not existing");
            }else{
                sheet = stubWorkbook.getSheet(sheetName);
            }
        }
        return sheet;
    }

    private String extractCellData(Cell cell){
        String cellContent=null;
        cell.setCellType(CellType.STRING);
        return cell.getStringCellValue();

    }
    public void closeWorkbook() {
        try {
            if(isSheetOpen && isSheetClosable){
                stubWorkbook.close();
                isSheetOpen = false;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String setSheetAndGetData(String sheetName, String header, int colIndex){

        setReadingSheet(sheetName);
        return getData(header,colIndex);
    }
    public boolean setReadingSheet(String sheetName){
        intiateWorkbook();
        boolean isSheetExisting = false;
        for(int i=0;i<stubWorkbook.getNumberOfSheets();i++){
            Sheet s = stubWorkbook.getSheetAt(i);
            if(s.getSheetName().equalsIgnoreCase(sheetName)){
                isSheetExisting = true;
                ExcelReader.sheetName = sheetName;
                sheet = null;
                break;
            }
        }
        closeWorkbook();
        if(!isSheetExisting){
            ExcelReader.sheetName = null;

        }
        return isSheetExisting;
    }
    public String getData(String header, int testDataNum) {
        intiateWorkbook();
        String data = null;
        sheet = getSheet();
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row currRow = sheet.getRow(i);
            String rowHeader = currRow.getCell(0).getStringCellValue();
            if (rowHeader.equals(header)) {
                return extractCellData(currRow.getCell(testDataNum));

            }
        }
        closeWorkbook();
        return data;
    }
}
