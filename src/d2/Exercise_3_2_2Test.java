package d2;

import org.junit.Before;
import org.junit.Test;

public class Exercise_3_2_2Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGenerateAdditionExercise() {
		Exercise_3_2_2 exercise3 = new Exercise_3_2_2();
		exercise3.generateAdditionExercise(5);
		exercise3.formattedDisplay(5);
		System.out.println("测试成功");
		// fail("尚未实现");
	}

	@Test
	public void testGenerateBinaryExercise() {
		Exercise_3_2_2 exercise3 = new Exercise_3_2_2();
		exercise3.generateBinaryExercise(5);
		exercise3.formattedDisplay(5);
		System.out.println("测试成功");
		// fail("尚未实现");
	}

	@Test
	public void testGenerateSubstractExercise() {
		Exercise_3_2_2 exercise3 = new Exercise_3_2_2();
		exercise3.generateSubstractExercise(5);
		exercise3.formattedDisplay(5);
		System.out.println("测试成功");
		// fail("尚未实现");
	}

}
