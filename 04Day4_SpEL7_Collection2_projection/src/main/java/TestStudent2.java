import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.ListStudent;
import com.dto.Student;

public class TestStudent2 {

	public static void main(String[] args) {

//		Student s = new Student("홍길동", 20);
//		System.out.println(s);
		
		//IoC 컨테이너
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("stu.xml");
		
		ListStudent stu = ctx.getBean("ageValues" , ListStudent.class);
		List<String> ageValues = stu.getAgeValues();
		for (String s : ageValues) {
			System.out.println(s);
		}
		
	}
}





