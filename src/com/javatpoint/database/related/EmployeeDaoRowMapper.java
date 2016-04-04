package com.javatpoint.database.related;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoRowMapper {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> getEmployeeListByRMapper() {
        String query="select * from employee";

        return jdbcTemplate.query(query, new RowMapper<Employee>() {

            public Employee mapRow(ResultSet rs, int rnum)
                    throws SQLException {
                // TODO Auto-generated method stub
                Employee e = new Employee();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setSalary(rs.getFloat(3));

                return e;
            } 
        });

    }
}