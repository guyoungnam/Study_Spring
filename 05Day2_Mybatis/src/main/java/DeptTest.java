import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;

public class DeptTest {

	public static void main(String[] args) {

//		Student s = new Student("홍길동", 20);
//		System.out.println(s);
		
		//IoC 컨테이너
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		
		DeptService service = ctx.getBean("service",DeptService.class);
		List<DeptDTO> list = service.selectAll();
		for (DeptDTO x : list) {
			System.out.println(x);
		}
		
	}
}
