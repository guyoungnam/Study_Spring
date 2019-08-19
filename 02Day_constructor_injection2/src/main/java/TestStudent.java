import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

//		Student s = new Student("홍길동",20);
//		System.out.print(s);
	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		Student stu = ctx.getBean("firstStudent", Student.class);
		System.out.println(stu.getInfo()); //홍길동 0
		
		Student stu2 = ctx.getBean("secondStudent", Student.class);
		System.out.println(stu2.getInfo()); // null, 20
		
		Student stu3 = ctx.getBean("thirdStudent", Student.class);
		System.out.println(stu3.getInfo()); // 유관순, 20
		
	}

}
