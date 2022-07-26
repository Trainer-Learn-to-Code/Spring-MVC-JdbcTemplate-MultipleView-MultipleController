package springex;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	/*
	 * public JdbcTemplate getJdbcTemplate() { return jdbcTemplate; }
	 */

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee emp)
	{
		String insertQuery="insert into jdbctemplate_table values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getSalary()+"')";
	return jdbcTemplate.update(insertQuery);
	
	}
	
	public int updateEmployee(Employee e){  
	    String updateQuery="update jdbctemplate_table set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(updateQuery);  
	}  
	
	public int deleteEmployee(Employee e){  
	    String query="delete from jdbctemplate_table where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	
}
