package FileReader;

import Objects.Company;
import Objects.Country;
import Objects.Kium;
import Objects.Reactor;
import Objects.Region;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaderXLSX {

    String fileName = "src/main/java/Files/DataNew.xlsx";

    public List<Reactor> readReactor() throws FileNotFoundException, IOException {
        List<Reactor> reactorList = new ArrayList<>();
        XSSFWorkbook myBook = new XSSFWorkbook(new FileInputStream(fileName));
        XSSFSheet sheet = myBook.getSheet("reactors");
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Reactor reactor = new Reactor();
            reactor.setId((int) row.getCell(0).getNumericCellValue());
            reactor.setName(row.getCell(1).getStringCellValue());
            reactor.setClas(row.getCell(2).getStringCellValue());
            reactor.setModel(row.getCell(3).getStringCellValue());
            reactor.setStatus(row.getCell(4).getStringCellValue());
            reactor.setTermal_capacity((float) row.getCell(5).getNumericCellValue());
            reactor.setFirst_grid_connection(row.getCell(6).getDateCellValue());
            Cell question = row.getCell(7);
            if (question != null) {
                reactor.setDate_shutdown(question.getDateCellValue());
            }
            reactor.setOwner_id((int) row.getCell(8).getNumericCellValue());
            reactor.setOperator_id((int) row.getCell(9).getNumericCellValue());
            reactor.setCountry_id((int) row.getCell(11).getNumericCellValue());
            reactorList.add(reactor);
        }
        return reactorList;
    }

    public List<Kium> readKium() throws FileNotFoundException, IOException {
        List<Kium> kiumList = new ArrayList<>();
        XSSFWorkbook myBook = new XSSFWorkbook(new FileInputStream(fileName));
        XSSFSheet sheet = myBook.getSheet("kium");
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Kium kium = new Kium();
            kium.setKium_id((int) (row.getCell(0).getNumericCellValue()));
            kium.setKium_value((float) (row.getCell(1).getNumericCellValue()));
            kium.setKium_year((int) row.getCell(2).getNumericCellValue());
            kium.setReactor_id((int) row.getCell(3).getNumericCellValue());
            kiumList.add(kium);
        }
        return kiumList;
    }

    public List<Company> readCompany() throws FileNotFoundException, IOException {
        List<Company> companyList = new ArrayList<>();
        XSSFWorkbook myBook = new XSSFWorkbook(new FileInputStream(fileName));
        XSSFSheet sheet = myBook.getSheet("companies");
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Company company = new Company();
            company.setCompany_id((int) row.getCell(0).getNumericCellValue());
            company.setCompany_name(row.getCell(1).getStringCellValue());
            companyList.add(company);
        }
        return companyList;
    }

    public List<Country> readCountry() throws FileNotFoundException, IOException {
        List<Country> countryList = new ArrayList<>();
        XSSFWorkbook myBook = new XSSFWorkbook(new FileInputStream(fileName));
        XSSFSheet sheet = myBook.getSheet("countries");
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Country country = new Country();
            country.setCountry_id((int) row.getCell(0).getNumericCellValue());
            country.setCountry_name(row.getCell(1).getStringCellValue());
            country.setRegion_id((int) row.getCell(2).getNumericCellValue());
            countryList.add(country);
        }
        return countryList;
    }

    public List<Region> readRegion() throws FileNotFoundException, IOException {
        List<Region> regionList = new ArrayList<>();
        XSSFWorkbook myBook = new XSSFWorkbook(new FileInputStream(fileName));
        XSSFSheet sheet = myBook.getSheet("regions");
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Region region = new Region();
            region.setRegion_id((int) row.getCell(0).getNumericCellValue());
            region.setRegion_name(row.getCell(1).getStringCellValue());
            regionList.add(region);
        }
        return regionList;
    }
}
