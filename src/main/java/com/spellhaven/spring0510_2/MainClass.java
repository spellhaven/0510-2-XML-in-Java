package com.spellhaven.spring0510_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		// 0510_1은 xml에서 java를, 이 0510_2는 java에서 xml을 불러오는 건데 (교육자료 pdf 참조)
		// 아! 코드 이거 뭐임 😩
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		// .java로 만든 자바빈즈가 잘 올까?
		Student stu1 = ctx.getBean("student1", Student.class);
		System.out.println(stu1.getName());
		
		// .xml로 만든 자바빈즈가 잘 올까?
		Student stu3 = ctx.getBean("student3", Student.class);
		System.out.println(stu3.getName());
		
	}

}
