package com.javatpoint.database.related;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDaoWithPrepStmt {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean saveEmployeeByPrepStmt(final Employee e) {
        String query="insert into employee values(?,?,?)";

        return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

            public Boolean doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                // TODO Auto-generated method stub
                ps.setInt(1, e.getId());
                ps.setString(2, e.getName());
                ps.setDouble(3, e.getSalary());
                
                return ps.execute();
            }
            
        });
    }

    public int updateEmployee(Employee e) {
        String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
        return jdbcTemplate.update(query);  
    }  
    public int deleteEmployee(Employee e){  
        String query="delete from employee where id='"+e.getId()+"' ";  
        return jdbcTemplate.update(query);  
    }
}
