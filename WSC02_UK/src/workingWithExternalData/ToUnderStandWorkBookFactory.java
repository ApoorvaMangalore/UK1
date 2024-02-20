package workingWithExternalData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToUnderStandWorkBookFactory {

	public static void main(String[] args) throws IOException {
		// File file = new File("./testData/TestData.xlsx");
		// FileInputStream fis = new FileInputStream(file);

		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");

		// step 1 :create obejct for your extention of xlsx
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// step 2: to get in to sheet
		XSSFSheet sheet = workbook.getSheet("data");

		// Step 3: To get in to row or count of row

		int rowcount = sheet.getLastRowNum();
		int clmcount = sheet.getRow(rowcount).getLastCellNum();

		String row0 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(row0);
		String row1 = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(row1);

		String row3 = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(row3);
		String row4 = sheet.getRow(3).getCell(0).getStringCellValue();
		System.out.println(row4);
		//String row5 = sheet.getRow(5).getCell(5).getStringCellValue();
		//System.out.println(row5);

	}

}
