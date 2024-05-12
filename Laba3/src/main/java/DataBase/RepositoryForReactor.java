package DataBase;

import Objects.Reactor;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class RepositoryForReactor extends Repository<Reactor> {

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO Reactors (ID_reactor, name, class, model, status, thermal_capacity, first_grid_connection_date, date_shutdown, ID_owner, ID_operator, ID_country) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override
    protected void setInsertParameters(PreparedStatement statement, Reactor reactor) throws SQLException {
        statement.setInt(1, reactor.getId());
        statement.setString(2, reactor.getName());
        statement.setString(3, reactor.getClas());
        statement.setString(4, reactor.getModel());
        statement.setString(5, reactor.getStatus());
        statement.setFloat(6, reactor.getTermal_capacity());
        statement.setDate(7, new Date(reactor.getFirst_grid_connection().getTime()));
        if(reactor.getDate_shutdown() != null){
           statement.setDate(8, new Date(reactor.getDate_shutdown().getTime())); 
        }else{
           statement.setNull(8, Types.DATE);
        }
        statement.setInt(9, reactor.getOwner_id());
        statement.setInt(10, reactor.getOperator_id());
        statement.setInt(11, reactor.getCountry_id());
    }
}
