trait JdbcTemplate {
  def query[ResultItem](psc: Connection => PreparedStatement,
    rowMapper: (ResultSet, Int) => ResultItem): List[ResultItem] 
}