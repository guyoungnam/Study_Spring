import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class TestStudent {

	public static void main(String[] args) {

//		Student s = new Student("홍길동",20);
//		System.out.print(s);
	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		DeptService stu = ctx.getBean("deptService", DeptService.class);
		List<String> list = stu.list();
		for(String string: list) {
		System.out.println(string); 
		}

	}

}
