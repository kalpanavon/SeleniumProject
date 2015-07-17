package sessionfour.assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import sessionthree.ApplicationProperties;

public class ExcelPOIUtil {

	public static void main(String s[]) {
		try {
			// readExcel("fileOne", 2, 8);
			// readExcel("fileOne");
			List<Employee> employees = new ArrayList<Employee>();
			readExcel("fileOne", employees);
			for (Employee employee : employees) {
				System.out.println(employee.toString());
			}
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readExcel(String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		InputStream inp = new FileInputStream(getFilePath());

		Workbook wb = WorkbookFactory.create(inp);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		System.out.println(row.getPhysicalNumberOfCells());
		Cell cell = null;
		if (row != null) {
			cell = row.getCell(cellNum);
			System.out.println(getCellValue(cell));
		}

	}

	public static void readExcel(String sheetName)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		InputStream inp = new FileInputStream(getFilePath());

		Workbook wb = WorkbookFactory.create(inp);
		Sheet sheet = wb.getSheet(sheetName);

		Iterator<Row> rows = sheet.iterator();
		while (rows.hasNext()) {
			Row row = rows.next();
			if (row.getRowNum() == 1) {
				System.out.println("**********************************");
			}
			Iterator<Cell> cells = row.iterator();
			while (cells.hasNext()) {
				Cell cell = cells.next();
				System.out.print(getCellValue(cell));
				System.out.print("\t");
			}

			System.out.println("");
		}

	}

	public static List<Employee> readExcel(String sheetName, List<Employee> employees)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		InputStream inp = new FileInputStream(getFilePath());
		Workbook wb = WorkbookFactory.create(inp);
		Sheet sheet = wb.getSheet(sheetName);
		Employee emp;
		Iterator<Row> rows = sheet.iterator();
		while (rows.hasNext()) {
			Row row = rows.next();
			emp = new Employee();
			if (row.getRowNum() != 0) {
				emp.assignValues(row);
				employees.add(emp);
			}

		}
		return employees;

	}

	public static String getFilePath() {
		return new ApplicationProperties().getProperties().getProperty("excelFilePath");

	}

	private static Object getCellValue(Cell cell) {
		Object cellValue = null;
		if (cell != null) {
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				cellValue = cell.getStringCellValue();
				break;
			case Cell.CELL_TYPE_NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					cellValue = cell.getDateCellValue();
				} else {
					cellValue = new Double(cell.getNumericCellValue()).intValue();
				}
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				cellValue = cell.getBooleanCellValue();
				break;
			case Cell.CELL_TYPE_FORMULA:
				cellValue = cell.getCellFormula();
				break;
			default:
				break;
			}
		}
		return cellValue;

	}

}
