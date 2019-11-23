import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Exercise_1Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGenerateBinaryExercise() {
		 Exercise_1 anExercise = new Exercise_1();
		 anExercise.generateBinaryExercise();
		//fail("尚未实现");
		 System.out.println("成功执行");
	}

	@Test
	public void testGenerateAdditionExercise() {
		//fail("尚未实现");
		 Exercise_1 anExercise = new Exercise_1();
		 anExercise.generateAdditionExercise();
		 System.out.println("成功执行");
	}

	@Test
	public void testGenerateSubstractExercise() {
		//fail("尚未实现");
		 Exercise_1 anExercise = new Exercise_1();
		 anExercise.generateSubstractExercise();
		 System.out.println("成功执行");
	}

	@Test
	public void testFormateAndDisplay() {
		//fail("尚未实现");
		Exercise_1 anExercise = new Exercise_1();
		 anExercise.generateSubstractExercise();
		 anExercise.formateAndDisplay();	
		 System.out.println("成功执行");
	}
}
