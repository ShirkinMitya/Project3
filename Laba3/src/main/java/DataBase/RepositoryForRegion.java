package DataBase;

import Objects.Region;
import java.sql.PreparedStatement;
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
}
