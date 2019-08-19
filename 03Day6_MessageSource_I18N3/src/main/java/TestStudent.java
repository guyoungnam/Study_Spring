import java.util.Locale;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;


public class TestStudent {

	public static void main(String[] args) {

	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
	
       Person p = ctx.getBean("person",Person.class);
       p.info();
	}
}
