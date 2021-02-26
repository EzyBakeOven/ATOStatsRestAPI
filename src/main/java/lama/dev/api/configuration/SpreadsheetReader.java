package lama.dev.api.configuration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpreadsheetReader {

    public FileInputStream file;
    public Workbook workbook;

    private static final String FIRST_SHEET_NAME = "Individuals Table 1A";

    public SpreadsheetReader() throws IOException {
        File dataFile = ResourceUtils.getFile("classpath:taxstats2016individual01byyear.xlsx");
        this.file = new FileInputStream(dataFile);
        this.workbook = new XSSFWorkbook(this.file);
    }

    public void readInATOMetadata() {
        Sheet firstSheet = this.workbook.getSheet(FIRST_SHEET_NAME);

        Map<Integer, List<String>> data = new HashMap<>();
        int index = 0;
        for (Row row : firstSheet) {
            data.put(index, new ArrayList<String>());
            for (Cell cell : row) {
                if (cell.getRichStringCellValue().getString().equals("Number of individuals")) {
                    // Correct row for numIndividuals
                }
            }
            index++;
        }
    }
}
