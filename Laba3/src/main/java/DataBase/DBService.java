package DataBase;

import FileReader.ReaderTXT;
import Service.Storage;
import java.io.IOException;
import java.sql.SQLException;

public class DBService {

    String fileNameDrop = "MyFiles/QueriesDrop.txt";
    String fileNameCreate = "MyFiles/QueriesCreate.txt";
    RepositoryForRegion repositoryForRegion = new RepositoryForRegion();
    RepositoryForCompany repositoryForCompany = new RepositoryForCompany();
    RepositoryForCountry repositoryForCountry = new RepositoryForCountry();
    RepositoryForReactor repositoryForReactor = new RepositoryForReactor();
    RepositoryForKium repositoryForKium = new RepositoryForKium();
    RepositoryManipulationDB repository = new RepositoryManipulationDB();
    ReaderTXT txtReader = new ReaderTXT();
    Storage storage;

    public DBService(Storage storage) {
        this.storage = storage;
    }

    public void dropDB() {
        try {
            repository.execute(txtReader.read(fileNameDrop));
        } catch (IOException e) {
            System.out.println("Oшибка при очиске БД" + e.getMessage());
        }
    }

    public void createBD() {
        try {
            repository.execute(txtReader.read(fileNameCreate));
        } catch (IOException e) {
            System.out.println("Oшибка при создани БД" + e.getMessage());
        }
    }

    public void writeDB() throws SQLException {
        repositoryForRegion.insert(storage.getRegionList());
        repositoryForCompany.insert(storage.getCompanyList());
        repositoryForCountry.insert(storage.getCountryList());
        repositoryForReactor.insert(storage.getReactorList());
        repositoryForKium.insert(storage.getKiumList());
        storage.clearAllLists();
    }

    public void selectDB() throws SQLException {
        storage.setRegionList(repositoryForRegion.select());
        storage.setCompanyList(repositoryForCompany.select());
        storage.setCountryList(repositoryForCountry.select());
        storage.setReactorList(repositoryForReactor.select());
        storage.setKiumList(repositoryForKium.select());
    }
}
