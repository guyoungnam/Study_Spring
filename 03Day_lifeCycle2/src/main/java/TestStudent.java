import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		ctx.close();
	}

}
