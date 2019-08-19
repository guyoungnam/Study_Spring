import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

//		Student s = new Student("홍길동",20);
//		System.out.print(s);
	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		
		Student stu = ctx.getBean("stu",Student.class); // "" xml의 아이디 값
		                                                //    불러올때 방법
		
		Student stu3 = ctx.getBean("stu",Student.class); 
		System.out.println(stu==stu3);  //true
		                               // stu.xml에 scope 설정을 prototype으로 변경하면 false
		                               // singleton 빈을 하나만 관리 하고 주소값이 똑같다. 하나 변경하면 다 변경
		                               // prototype 공유가 안되고 
		 
		
		Student stu2 = ctx.getBean("stu2",Student.class);
        System.out.println(stu.getInfo());
 
        System.out.println(stu==stu2); // 다른 주소값을 가진다. false
        
        //빈은 하나씩 만드는 패턴
        //싱글톤 패턴 인스턴스 하나 만드는거 , new를 한번 
	}

}
