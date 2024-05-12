package DataBase;

import Objects.Kium;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RepositoryForKium extends Repository<Kium> {

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO Kiums (ID_KIUM , kium_value, year, ID_reactor) VALUES(?,?,?,?)";
    }

    @Override
    protected void setInsertParameters(PreparedStatement statement, Kium kium) throws SQLException {
        statement.setInt(1, kium.getKium_id());
        statement.setFloat(2, kium.getKium_value());
        statement.setFloat(3, kium.getKium_year());
        statement.setInt(4, kium.getReactor_id());
    }
}
