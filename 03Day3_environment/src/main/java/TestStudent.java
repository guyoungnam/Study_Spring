import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


public class TestStudent {

	public static void main(String[] args) {

//		Student s = new Student("홍길동",20);
//		System.out.print(s);
	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ConfigurableEnvironment e = ctx.getEnvironment();
		
		//getSystemEnvironment() 메서드
		Map<String, Object>	m = e.getSystemEnvironment();
		Set<String> keys = m.keySet();
		for(String key:keys) {
			System.out.println(key+"=" + m.get(key));
		}
		
		//getSystemProperties() 메서드
				Map<String, Object>	m2 = e.getSystemProperties();
				Set<String> keys2 = m2.keySet();
				for(String key:keys2) {
					System.out.println(">>"+key+"=" + m.get(key));
				}
	}

}
