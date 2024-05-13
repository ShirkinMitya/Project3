package DataBase;

import FileReader.ReaderTXT;
import Service.Storage;
import java.io.IOException;
import java.sql.SQLException;

public class DBService {

    String fileNameDrop = "src/main/java/Files/QueriesDrop.txt";
    String fileNameCreate = "src/main/java/Files/QueriesCreate.txt";
    Storage storage;
    RepositoryForRegion repositoryForRegion = new RepositoryForRegion();
    RepositoryForCompany repositoryForCompany = new RepositoryForCompany();
    RepositoryForCountry repositoryForCountry = new RepositoryForCountry();
    RepositoryForReactor repositoryForReactor = new RepositoryForReactor();
    RepositoryForKium repositoryForKium = new RepositoryForKium();

    public DBService(Storage storage) {
        this.storage = storage;
    }

    public void dropDB() {
        try {
            ReaderTXT txtReader = new ReaderTXT();
            RepositoryManipulationDB repository = new RepositoryManipulationDB();
            repository.execute(txtReader.read(fileNameDrop));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createBD() {
        try {
            ReaderTXT txtReader = new ReaderTXT();
            RepositoryManipulationDB repository = new RepositoryManipulationDB();
            repository.execute(txtReader.read(fileNameCreate));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeDB() {
        try {
            repositoryForRegion.insert(storage.getRegionList());
            repositoryForCompany.insert(storage.getCompanyList());
            repositoryForCountry.insert(storage.getCountryList());
            repositoryForReactor.insert(storage.getReactorList());
            repositoryForKium.insert(storage.getKiumList());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        storage.clearAllLists();
    }

    public void selectDB() {
        try {
            storage.setRegionList(repositoryForRegion.select());
            storage.setCompanyList(repositoryForCompany.select());
            storage.setCountryList(repositoryForCountry.select());
            storage.setReactorList(repositoryForReactor.select());
            storage.setKiumList(repositoryForKium.select());
            storage.getReactorList().forEach(reactor -> System.out.println(reactor));
            System.out.println("реакторы" + storage.getReactorList().size());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
