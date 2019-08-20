import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {


		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		Student stu = ctx.getBean("stu", Student.class);
		try {
		System.out.println(stu.sayEcho());
		}catch(Exception e) {
		System.out.println(e.getMessage());
		}
		//System.out.println(stu.callEcho());
		
	}

}
