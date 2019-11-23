/*对算式类中的方法进行了必要的测试，对于关键的方法设计了多个测试用例*/
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BinaryOperation_1Test {
	BinaryOperation_1 b0;

	@Before
	public void setUp() throws Exception {
		b0=new BinaryOperation_1();
	}

	@Test
	public void testconstruct1() {
		assertEquals(b0.construct(70,30,'+'),100);
		}
	@Test
	public void testconstruct2() {
		assertEquals(b0.construct(100,1,'-'),99);
		}
	@Test
	public void testconstruct3() {
		assertEquals(b0.construct(100,0,'-'),99);
		}
	@Test
	public void testgenerateAdditionOperation1() {
		BinaryOperation_1 b=new BinaryOperation_1();
		b=b0.generateAdditionOperation();
		assertEquals(b.getOperator(),'+');
	}
	@Test
	public void testgenerateSubstractOperation1() {
		BinaryOperation_1 a=new BinaryOperation_1();
		a=b0.generateSubstractOperation();
		assertEquals(a.getOperator(),'-');
	}
	@Test
	public void getLeftOperand() {
		b0.construct(23,45,'+');
		assertEquals(b0.getLeftOperand(),23);
	}
	@Test
	public void getRightOperand() {
		b0.construct(23, 45, '+');
		assertEquals(b0.getRightOperand(),45);
	}
	@Test
	public void getResult() {
		b0.construct(23, 45, '+');
		assertEquals(b0.getResult(),68);
	}
	@Test
	public void stringtest1() {
		b0.construct(1, 2, '+');
		assertEquals(b0.fullString(),"1+2=3");
	}
	@Test
	public void test1toString() {
		b0.construct(1, 2, '+');
		assertEquals(b0.toString(),"1+2");
	}
	@Test
	public void test1asString() {
		b0.construct(1, 2, '+');
		assertEquals(b0.asString(),"1+2=");
	}
}
	

