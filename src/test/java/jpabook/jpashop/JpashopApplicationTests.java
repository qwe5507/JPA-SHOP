package jpabook.jpashop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpashopApplicationTests {

	@Test
	void contextLoads() {
		var a = "asdasd";
		System.out.println("a = " + a.getClass().getTypeName());
		System.out.println(a);
		String asd = "asd";
	}


}
