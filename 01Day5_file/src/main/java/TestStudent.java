import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

//		Student s = new Student("홍길동",20);
//		System.out.print(s);
	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		//classpath에 class에서 찾는 경로에서 찾아라는 의미 (명시적)
	}

}
