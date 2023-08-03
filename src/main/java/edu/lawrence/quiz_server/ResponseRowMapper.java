package edu.lawrence.quiz_server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ResponseRowMapper implements RowMapper<Response> {
    @Override
    public Response mapRow(ResultSet row, int rowNum) throws SQLException {
        Response r = new Response();
        r.setId(row.getInt("id"));
        r.setStudent(row.getInt("student"));
        r.setQuestion(row.getInt("question"));
        r.setResponse(row.getString("response"));
        return r;
    }
}
