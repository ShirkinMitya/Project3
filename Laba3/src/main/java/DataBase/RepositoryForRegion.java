package DataBase;

import Objects.Region;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepositoryForRegion extends Repository<Region> {

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO Regions (ID_region, name_region) VALUES(?,?)";
    }

    @Override
    protected void setInsertParameters(PreparedStatement statement, Region region) throws SQLException {
        statement.setInt(1, region.getRegion_id());
        statement.setString(2, region.getRegion_name());
    }

    @Override
    protected String getSelectSQL() {
        return "SELECT ID_region, name_region FROM Regions ";
    }

    @Override
    protected Region getSelectObject(ResultSet resultSet) throws SQLException {
        Region region = new Region();
        region.setRegion_id(resultSet.getInt(1));
        region.setRegion_name(resultSet.getString(2));
        return region;
    }
}
