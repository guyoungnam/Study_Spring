import java.util.Locale;

import org.springframework.context.support.GenericXmlApplicationContext;


public class TestStudent {

	public static void main(String[] args) {

	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
	
		String mesg= ctx.getMessage("hello", null, Locale.ENGLISH);
		System.out.println(mesg);

		String xxx= ctx.getMessage("hello2", new String[] {"kkk","ooo"}, Locale.ENGLISH);
		System.out.println(xxx);
		
		String mesg2= ctx.getMessage("hello", null, Locale.KOREA);
		System.out.println(mesg2);
		
	}

}
