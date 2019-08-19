import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Man;
import com.dto.Woman;

public class TestStudent {

	public static void main(String[] args) {

	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
	Man m = ctx.getBean("man",Man.class);
	Woman w = ctx.getBean("woman",Woman.class);
	
    System.out.println(m);
    System.out.println(w);
    
	
	}
	
	

}
