package proj200211.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import proj200211.di.entity.BmiModule;
import proj200211.di.ui.Console;

public class Program {
	public static void main(String [] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("proj200211/di/setting.xml");

		//bean의 이름으로 가져오기
				//ExamConsole console = (ExamConsole)context.getBean("console");
		
		//클래스 자료형(type)으로 가져오기
		Console console = context.getBean(Console.class);
		console.print();
	}
}
