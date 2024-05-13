package DataBase;

import Objects.Kium;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    @Override
    protected String getSelectSQL() {
        return "SELECT ID_KIUM , kium_value, year, ID_reactor FROM Kiums";
    }

    @Override
    protected Kium getSelectObject(ResultSet resultSet) throws SQLException {
        Kium kium = new Kium();
        kium.setKium_id(resultSet.getInt(1));
        kium.setKium_value(resultSet.getFloat(2));
        kium.setKium_year(resultSet.getInt(3));
        kium.setReactor_id(resultSet.getInt(4));
        return kium;
    }
}
