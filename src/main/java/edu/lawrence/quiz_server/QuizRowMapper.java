package edu.lawrence.quiz_server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class QuizRowMapper implements RowMapper<Quiz>{
    @Override
    public Quiz mapRow(ResultSet row, int rowNum) throws SQLException {
        Quiz q = new Quiz();
        q.setId(row.getInt("id"));
        q.setTitle(row.getString("title"));
        return q;
    }
}
