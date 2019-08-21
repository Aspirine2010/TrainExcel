import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class CreateExcel {
    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook){
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }

    public static void main(String[] args) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        List<Emloyee>list = EmployeeDAO.listEmployees();
        int rowNum = 0;
        Cell cell;
        Row row;
        HSSFCellStyle style = createStyleForTitle(workbook);
        row = sheet.createRow(rowNum);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Модель");
        cell.setCellStyle(style);
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Цена");
        cell.setCellStyle(style);
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Информация");
        cell.setCellStyle(style);
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Дата размещения");
        cell.setCellStyle(style);
        for (Emloyee emp: list){
            rowNum++;
            row = sheet.createRow(rowNum);
            cell = row.createCell(0,CellType.STRING);
            cell.setCellValue(emp.getModel());
            cell = row.createCell(1,CellType.STRING);
            cell.setCellValue(emp.getPrice());
            cell = row.createCell(2,CellType.STRING);
            cell.setCellValue(emp.getInfo());
            cell = row.createCell(3,CellType.STRING);
            cell.setCellValue(emp.getDate());
        }
        File file = new File("C://pezdets//zalupa.xls");
        file.getParentFile().mkdirs();
        FileOutputStream stream = new FileOutputStream(file);
        workbook.write(stream);
        System.out.println("Бежы посмотри там создался файл , ну тот который нужэн");

    }
}
