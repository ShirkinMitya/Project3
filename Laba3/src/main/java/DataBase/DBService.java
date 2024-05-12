package DataBase;

import FileReader.ReaderTXT;
import Service.Storage;
import java.io.IOException;
import java.sql.SQLException;

public class DBService {

    String fileNameDrop = "src/main/java/Files/QueriesDrop.txt";
    String fileNameCreate = "src/main/java/Files/QueriesCreate.txt";
    Storage storage;

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
            new RepositoryForRegion().insert(storage.getRegionList());
            new RepositoryForCompany().insert(storage.getCompanyList());
            new RepositoryForCountry().insert(storage.getCountryList());
            new RepositoryForReactor().insert(storage.getReactorList());
            new RepositoryForKium().insert(storage.getKiumList());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
