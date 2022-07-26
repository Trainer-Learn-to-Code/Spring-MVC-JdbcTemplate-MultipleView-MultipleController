package springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
/*
 * EmployeeDao employeeDao=(EmployeeDao)context.getBean("empdao"); int
 * result=employeeDao.saveEmployee(new Employee(101, "Joseph", 50000));
 */

/*
 * EmployeeDao employeeDao=(EmployeeDao)context.getBean("empdao"); int
 * result=employeeDao.updateEmployee(new Employee(101,"Sonoo",15000));
 * System.out.println(result+ " updated");
 */
EmployeeDao employeeDao=(EmployeeDao)context.getBean("empdao");
Employee e=new Employee(); 
e.setId(101); 
int result=employeeDao.deleteEmployee(e); 
System.out.println(result+" deteted");
		
	}

}
