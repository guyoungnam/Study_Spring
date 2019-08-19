import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Echo;

public class TestEcho {

	public static void main(String[] args) {

		//Ioc 컨테이너
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext();
		
		//profile 결정
		ctx.getEnvironment().setActiveProfiles("prod");
		ctx.load("classpath:echo_dev.xml","classpath:echo_prod.xml");
		ctx.refresh();
		
		Echo echo = ctx.getBean("xxx",Echo.class);
		System.out.println(echo.sayEcho());
		
	}

}
