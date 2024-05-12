package DataBase;

import Objects.Company;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RepositoryForCompany extends Repository<Company> {

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO Companies (ID_company, company_name) VALUES(?,?)";
    }

    @Override
    protected void setInsertParameters(PreparedStatement statement, Company company) throws SQLException {
        statement.setInt(1, company.getCompany_id());
        statement.setString(2, company.getCompany_name());

    }
}
