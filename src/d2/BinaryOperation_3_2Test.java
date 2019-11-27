package d2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryOperation_3_2Test {

	// private static final boolean t = false;
	// private static final boolean t1 = true;
	@Before
	public void setUp() throws Exception {
		//BinaryOperation_3_2();
	}

	private void BinaryOperation_3_2() {
		// TODO 自动生成的方法存根

	}

	@Test
	public void testGenerateBinaryOperation() {
		AdditionOperation exercise = new AdditionOperation();
		// exercise.generateBinaryOperation('+');
		assertEquals(exercise.getOperator(), '+');
		System.out.println("generateBinaryOperation方法调用成功");
		// fail("尚未实现");
	}

	@Test
	public void testGenerateBinaryOperation2() {
		SubstractOperation exercise = new SubstractOperation();
		// exercise.generateBinaryOperation('+');
		assertEquals(exercise.getOperator(), '-');
		System.out.println("generateBinaryOperation方法调用成功");
		// fail("尚未实现");
	}

	@Test
	public void testCheckingCalculation() {
		AdditionOperation exercise = new AdditionOperation();
		boolean a = exercise.checkingCalculation(110);
		if (!a) {
			System.out.println("大于100，不符合条件");
			System.out.println("checkingCalculation方法调用成功");
		}
		// fail("尚未实现");
	}

	@Test
	public void testCheckingCalculation2() {
		SubstractOperation exercise = new SubstractOperation();
		boolean a = exercise.checkingCalculation(90);
		if (a) {
			System.out.println("小于100，符合条件");
			System.out.println("checkingCalculation方法调用成功");
		}
		// fail("尚未实现");
	}

	@Test
	public void testCalculate() {
		AdditionOperation exercise = new AdditionOperation();
		// exercise.generateAdditionExercise(50);
		// exercise.calculate(11, 22);
		assertEquals(exercise.calculate(11, 22), 33);
		// fail("尚未实现");
	}

	@Test
	public void testCalculate2() {
		SubstractOperation exercise = new SubstractOperation();
		// exercise.generateAdditionExercise(50);
		// exercise.calculate(33, 22);
		assertEquals(exercise.calculate(33, 22), 11);
		// fail("尚未实现");
	}

	@Test
	public void testGetLeftOperand() {
		SubstractOperation e = new SubstractOperation();
		System.out.println(e.getLeftOperand());
		// fail("尚未实现");
	}

	@Test
	public void testGetRightOperand() {
		SubstractOperation e = new SubstractOperation();
		System.out.println(e.getLeftOperand());
		// fail("尚未实现");
	}

	@Test
	public void testGetOperator() {
		AdditionOperation exercise = new AdditionOperation();
		// exercise.generateAdditionExercise(50);
		exercise.generateBinaryOperation('+');
		assertEquals(exercise.getOperator(), '+');
		// fail("尚未实现");
	}

	@Test
	public void testGetOperator2() {
		SubstractOperation exercise = new SubstractOperation();
		// exercise.generateAdditionExercise(50);
		exercise.generateBinaryOperation('-');
		assertEquals(exercise.getOperator(), '-');
		// fail("尚未实现");
	}

	@Test
	public void testGetResult1() {
		AdditionOperation e2 = new AdditionOperation();
		// exercise.generateAdditionExercise(50);
		e2.generateBinaryOperation('+');
		int a = e2.getLeftOperand();
		int b = e2.getRightOperand();
		int c = a + b;
		assertEquals(e2.getResult(), c);

		// fail("尚未实现");
	}

	@Test
	public void testGetResult2() {
		SubstractOperation e3 = new SubstractOperation();
		// exercise.generateAdditionExercise(50);
		e3.generateBinaryOperation('-');
		int a = e3.getLeftOperand();
		int b = e3.getRightOperand();
		int c = a - b;
		assertEquals(e3.getResult(), c);

		// fail("尚未实现");
	}

	@Test
	public void testEqualsBinaryOperation_3_2() {
		AdditionOperation e3 = new AdditionOperation();
		AdditionOperation e4 = new AdditionOperation();
		if (!(e3.equals(e4))) {
			System.out.println("调用equals方法成功，两个对象的值不完全相等");
		}
		// fail("尚未实现");
	}

	@Test
	public void testToString() {
		AdditionOperation exercise = new AdditionOperation();
		// exercise.generateAdditionExercise(50);
		exercise.generateBinaryOperation('+');
		System.out.println(exercise.toString());
		// fail("尚未实现");
	}

	@Test
	public void testAsString() {
		AdditionOperation exercise = new AdditionOperation();
		// exercise.generateAdditionExercise(50);
		exercise.generateBinaryOperation('+');
		System.out.println(exercise.asString());
		// fail("尚未实现");
	}

	@Test
	public void testFullString() {
		AdditionOperation exercise = new AdditionOperation();
		// exercise.generateAdditionExercise(50);
		exercise.generateBinaryOperation('+');
		System.out.println(exercise.fullString());
		// fail("尚未实现");
	}

	@Test
	public void testFullString2() {
		SubstractOperation exercise = new SubstractOperation();
		// exercise.generateAdditionExercise(50);
		exercise.generateBinaryOperation('-');
		System.out.println(exercise.fullString());
		// fail("尚未实现");
	}
	// SubstractOperation
}
