public interface JdbcTemplate {
  List query(PreparedStatementCreator psc,
    RowMapper rowMapper)
  ...
}
public interface PreparedStatementCreator {
  PreparedStatement createPreparedStatement(Connection con) throws SQLException;
}
public interface RowMapper {
  Object mapRow(ResultSet rs, int rowNum)
  throws SQLException;
}