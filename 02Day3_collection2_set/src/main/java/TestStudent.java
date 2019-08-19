import java.util.List;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

//		Student s = new Student("홍길동",20);
//		System.out.print(s);
	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		Student stu = ctx.getBean("firstStudent", Student.class);
		System.out.println(stu.getInfo()); //한번만 저장 된다 .홍길동,나비,하늘
		Set<Cat>set  = stu.getSetCat();
		for (Cat cat : set) {
			System.out.println(cat.getCatInfo());
		}

	}

}
