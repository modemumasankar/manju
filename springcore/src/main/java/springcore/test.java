package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test
{
	
	

	public static void main(String[] args)
	{
	Resource rs=new ClassPathResource("uma.xml");
	BeanFactory bn=new XmlBeanFactory(rs);
	student st=(student)bn.getBean("student");
	st.disp();

	}

}
