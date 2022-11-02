package apachePOI_Examples_ReadAndWriteData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcelFile3 {
	public static String[][] excelData = null;
	public static String[][] readdata;
	
	//Reading Excel File and get the data
	public static String[][] excel_Files(String sheetname) throws Exception {
		try {
			//String FilePath =path+"\\lib\\test_data.xlsx";
			String FilePath =".\\ExcelData\\ExcelDataValue.xlsx";
			FileInputStream finputStream = new FileInputStream(new File(FilePath));

			XSSFWorkbook workbook = new XSSFWorkbook(finputStream);
			XSSFSheet sheet = workbook.getSheet(sheetname);

			int rowCount = sheet.getPhysicalNumberOfRows();
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

			//maxCell=  colCount;
			excelData = new String[rowCount][colCount];

			for(int Nrow = 0; Nrow<rowCount; Nrow++) {
				//1 = sheet.getRow(Nrow);
				for(int Ncolumn =0; Ncolumn<colCount ; Ncolumn++) {
					XSSFCell cell = sheet.getRow(Nrow).getCell(Ncolumn);
					DataFormatter df = new DataFormatter();
					excelData[Nrow][Ncolumn] = df.formatCellValue(cell);
				}
			}
		}catch(Exception e) {
          System.out.println(e.getMessage());
		}

		return excelData;
	}


	//read excel sheet based on sheetName
	public static void readExcel(String sheetName) {

		try {
			readdata = excel_Files(sheetName);
			

		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Test
	public void f(){
		try{
		readExcel("Sheet1");
		String str=readdata[1][0].toString();
		System.out.println("Excel Cell Value: "+ str);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

