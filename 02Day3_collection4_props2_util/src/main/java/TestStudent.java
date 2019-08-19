import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

	
		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		Student stu = ctx.getBean("firstStudent", Student.class);
		System.out.println(stu.getInfo()); //한번만 저장 된다 .홍길동,나비,하늘
		Map<String,Cat>map  = stu.getMapCat();
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key+"="+map.get(key).getCatInfo());
		}
		//
		
		Properties phones = stu.getPhones();
		Set<String> xxx = phones.stringPropertyNames();
		for (String key : xxx) {
			System.out.println(key+"="+phones.getProperty(key));
		}

	}

}
