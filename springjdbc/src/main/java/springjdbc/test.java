package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test
{
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("application.xml");
		EmpDao d=(EmpDao)ap.getBean("edao");
		Employee emp=new Employee();
		emp.setId(04);
		emp.setName("uma");
		emp.setCmp("apple");
		d.save(emp);
		d.update(emp);
		//d.delete(emp);
		
		
		
		System.out.println("done");
	}

	
}