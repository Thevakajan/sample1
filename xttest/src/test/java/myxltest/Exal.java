package myxltest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exal {
	
	private static Workbook wb;
	private static Sheet sh;
	private static FileInputStream fis;
	private static FileOutputStream fos;
	@SuppressWarnings("unused")
	private static Row row;
	private static Cell cell;
	
	public static void main(String[] args) throws Exception {
		
		fis = new FileInputStream("C:\\ec\\Eample\\xttest\\xlsheet\\Testdata.xlsx");
		wb=WorkbookFactory.create(fis);
	}

}
