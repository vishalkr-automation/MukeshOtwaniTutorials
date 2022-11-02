package apachePOI_Examples_ReadAndWriteData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel2 {

	//Function for read sheet no, row number and column number
	public static String newpolicy(int sheetno, int rownum, int colnum) throws Exception {
		File file = new File(".\\ExcelData\\ExcelDataValue.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(sheetno);
		XSSFCell cell = sheet.getRow(rownum).getCell(colnum);
		DataFormatter df = new DataFormatter();
		String data = df.formatCellValue(cell);

		return data;

	}
	
	@Test
	public void test() throws Exception{
		String str= newpolicy(0,1,1);
		System.out.println(str);
	}
}
