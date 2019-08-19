import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		Student stu = ctx.getBean("firstStudent", Student.class);
		System.out.println(stu.getInfo()); //홍길동 30 나비 3
		List<Cat>list  = stu.getListCat();
		for (Cat cat : list) {
			System.out.println(cat.getCatInfo());
		}

	}

}
