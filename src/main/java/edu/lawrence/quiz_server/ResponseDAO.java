package edu.lawrence.quiz_server;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ResponseDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public String save(Response response) {
        String insertSQL = "INSERT INTO responses (id, student, question, response) values (?, ?, ?, ?)";
        jdbcTemplate.update(insertSQL, response.getId(), response.getStudent(), response.getQuestion(), response.getResponse());
        return response.getResponse();
    }
}
