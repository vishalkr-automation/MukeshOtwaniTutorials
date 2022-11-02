package apachePOI_Examples_ReadAndWriteData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFile4 {
	public String[][] excelData=null;
	public String[][] readData=null;
	 int rowCount=0;
	 int colCount=0;

	public String[][] excelFile(String sheetName){
		
		try{
			String Filepath=".\\ExcelData\\ExcelDataValue.xlsx";
			File f=new File(Filepath);
            FileInputStream fi=new FileInputStream(f);
            XSSFWorkbook workbook= new XSSFWorkbook(fi);
            XSSFSheet sheet=workbook.getSheet(sheetName);
             rowCount=sheet.getPhysicalNumberOfRows();
             colCount=sheet.getRow(0).getPhysicalNumberOfCells();
            excelData=new String[rowCount][colCount];
            
            for(int i=0; i<rowCount; i++){
            	for(int j=0; j<colCount; j++){
            		XSSFCell cell=sheet.getRow(i).getCell(j);
            		DataFormatter df= new DataFormatter();
            		excelData[i][j] = df.formatCellValue(cell);
            	}
            }
            
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return excelData;
	}
	
	public void readExcel(String sheetName){
		readData=excelFile("Sheet1");
	}
	
	@Test(priority=1, enabled=false)
	public void f(){
		try{
		readExcel("Sheet1");
		String str=readData[1][0].toString();
		System.out.println("Excel Cell Value: "+ str);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test(priority=2, enabled=true)
	public void f1() {
		

		readExcel("Sheet1");
		
		for(int i=0; i<=rowCount-1; i++){
			
			for(int  j=0; j<colCount; j++){
				
				String str=readData[i][j].toString();
				
				System.out.println(str);
				
			}
			
		}
	
	}
}
