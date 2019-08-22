import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;

public class DeptTest {

	public static void main(String[] args) {

		
		//IoC 컨테이너
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		
		//classpath
		
		DeptService service = ctx.getBean("service",DeptService.class);
		
		//생성된 빈에 접근 
		
		List<DeptDTO> list = service.selectAll();
		for (DeptDTO x : list) {
			System.out.println(x);
		}
		
	}
}
