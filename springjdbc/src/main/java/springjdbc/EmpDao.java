package springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;
public class EmpDao 
{
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate( JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
		public int save(Employee emp)
		{
			String sql="insert into ganash2 values("+emp.getId()+",'"+emp.getName()+"','"+emp.getCmp()+"')";
			return jdbcTemplate.update(sql);
		}
		public int update(Employee emp)
		{
			String sql="update ganash2 set name='"+emp.getName()+"'where id='"+emp.getId()+"'";
			return jdbcTemplate.update(sql);
		}
		public int  delete (Employee emp)
		{
			String sql="delete from ganash2 where id='"+emp.getId()+"'";
			return jdbcTemplate.update(sql);
		}
		public int listEmployee(Employee emp)
        {
        String sql="select*from ganash2";
        return jdbcTemplate.update(sql);
        }
}