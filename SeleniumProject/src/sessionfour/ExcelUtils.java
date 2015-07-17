package sessionfour;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import sessionthree.ApplicationProperties;

public class ExcelUtils {

	public static void main(String[] args) {
		String filePath = new ApplicationProperties().getProperties().getProperty("filePath");
		System.out.println(filePath);
		try {
			//readFile(filePath);//file should be closed before updating
			//System.out.println("********************");
			readSheetData(filePath);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*
	 * public static void createExcelFile(String filePath) throws IOException {
	 * 
	 * System.out.println(filePath); Workbook wb = new HSSFWorkbook();
	 * //Workbook wxb = new XSSFWorkbook(); FileOutputStream fo = new
	 * FileOutputStream(filePath + "\\workbook.xls"); wb.write(fo); wb.close();
	 * fo.close();
	 * 
	 * }
	 */

	public static void readFile(String filePath)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		InputStream inp = new FileInputStream(filePath + "\\TestData.xls");
		// InputStream inp = new FileInputStream("workbook.xlsx");

		Workbook wb = WorkbookFactory.create(inp);
		Sheet sheet = wb.getSheet("fileone");
		Row row = sheet.getRow(2);
		Cell cell = null ;
		if(row != null){
		 cell= row.getCell(2);
		// System.out.println(cell.getStringCellValue());

		if (cell == null)
			cell = row.createCell(2);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		cell.setCellValue("HANTS");
		}
		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream(filePath + "\\TestData.xls");
		wb.write(fileOut);
		fileOut.close();

	}

	public static void readSheetData(String filePath)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		InputStream inp = new FileInputStream(filePath + "\\TestData.xls");

		Workbook wb = WorkbookFactory.create(inp);
		Sheet sheet = wb.getSheet("fileone");

		Iterator<Row> rows = sheet.iterator();
		while (rows.hasNext()) {
			Row row = rows.next();
			if(row.getRowNum() == 1){
				System.out.println("****************************************************************");
			}
			Iterator<Cell> cells = row.iterator();
			while (cells.hasNext()) {
				Cell cell = cells.next();
				switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						if (DateUtil.isCellDateFormatted(cell)) {
							System.out.print(cell.getDateCellValue());
						} else {
							System.out.print(cell.getNumericCellValue());
						}
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(cell.getBooleanCellValue());
						break;
					case Cell.CELL_TYPE_FORMULA:
						System.out.print(cell.getCellFormula());
						break;
					default:
						break;
				}
				System.out.print("\t");

			}
			System.out.println("");
		}
	}

}