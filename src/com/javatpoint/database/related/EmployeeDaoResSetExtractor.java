package com.javatpoint.database.related;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDaoResSetExtractor {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> getEmployeeListByRSExtractor() {
        String query="select * from employee";

        return jdbcTemplate.query(query, new ResultSetExtractor<List<Employee>>() {
            
            public List<Employee> extractData(ResultSet rs)
                    throws SQLException, DataAccessException {
                // TODO Auto-generated method stub
                List<Employee> list = new ArrayList<Employee>();
                while(rs.next()) {
                    Employee e = new Employee();
                    e.setId(rs.getInt(1));
                    e.setName(rs.getString(2));
                    e.setSalary(rs.getFloat(3));
                    list.add(e);
                }
                return list;
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
