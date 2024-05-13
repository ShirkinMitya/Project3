package DataBase;

import Objects.Country;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepositoryForCountry extends Repository<Country> {

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO Countries (ID_country, name_country, ID_region) VALUES(?,?,?)";
    }

    @Override
    protected void setInsertParameters(PreparedStatement statement, Country country) throws SQLException {
        statement.setInt(1, country.getCountry_id());
        statement.setString(2, country.getCountry_name());
        statement.setInt(3, country.getRegion_id());
    }

    @Override
    protected String getSelectSQL() {
        return "SELECT ID_country, name_country, ID_region FROM Countries";
    }

    @Override
    protected Country getSelectObject(ResultSet resultSet) throws SQLException {
        Country country = new Country();
        country.setCountry_id(resultSet.getInt(1));
        country.setCountry_name(resultSet.getString(2));
        country.setRegion_id(resultSet.getInt(3));
        return country;
    }
}
