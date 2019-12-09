package apachePOIExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Zadatak_1_12062019 {
	/*
	 * Napisati program koji racuna sumu brojeva koji se nalaze prvom worksheet-u
	 * Excel tabele koji se zove Brojevi. U tabeli se svi brojevi nalaze u prvoj
	 * koloni. Program treba da cita red po red iz tabele i upisane brojeve dodaje
	 * na sumu. Krajnju sumu nakon toga treba da ispise u konzoli. Potrebno je
	 * omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva
	 * (isprobati!)
	 */

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\andre\\Downloads\\Data.xls"));

			HSSFWorkbook wb = new HSSFWorkbook(fis);

			HSSFSheet sheet = wb.getSheetAt(0);

			Iterator<Row> itr = sheet.iterator();
			double suma = 0;

			for (Row row : sheet) {
				if (itr.hasNext()) {

					for (Cell cell : row) {

					}
					Iterator<Cell> cellIterator = row.cellIterator();

					if (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();

						suma += cell.getNumericCellValue();

					}

				}

			}
			System.out.println("Zbir unetih brojeva je: " + suma);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
