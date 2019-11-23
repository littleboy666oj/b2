
/* 代码3.1.1：用Java语言的面向对象方式重新实现的代码2.5
*/
import java.util.Random;

public class BinaryOperation_1 {

	static final int UPPER = 100;
	static final int LOWER = 0;
	private int left_operand=0, right_operand=0;
	private char operator='+';
	private int value=0;
	
	// 不是构造器
	public  int construct (int left, int right, char op) {	
		left_operand = left;
		right_operand = right;
		operator = op;
		if (op=='+'){
			value = left + right;
		}else {
			value = left - right;
		}	return value;
	}
	// 实际产生对象的三个方法
	public BinaryOperation_1 generateAdditionOperation() {	
	    Random random = new Random();
		int left, right, result;				
		left = random.nextInt(UPPER+1);	
		do {
	   		right = random.nextInt(UPPER+1);
			result = left + right;
		} while (result > UPPER);	
		BinaryOperation_1 bop = new BinaryOperation_1();
		bop.construct(left, right, '+'); 
		return bop;
	}
	public BinaryOperation_1 generateSubstractOperation(){
		Random random = new Random();
		int left, right, result;				
		left = random.nextInt(UPPER+1);	
		do {
	   		right = random.nextInt(UPPER+1);
			result = left - right;
		} while (result < 0);			
		BinaryOperation_1 bop = new BinaryOperation_1();
		bop.construct(left, right, '-'); 
		return bop; 
	}
	public BinaryOperation_1 generateBinaryOperation() {    	
	    Random random = new Random();
		int opValue = random.nextInt(2);
		if (opValue == 1){
			return generateAdditionOperation();
		} else {
			return generateSubstractOperation();
		}
	 }
	// 实例变量访问器
	public int getLeftOperand(){return left_operand;}
	public int getRightOperand(){return right_operand;}
	public char getOperator(){return operator;}
	public int getResult(){return value;}

	public boolean equals (BinaryOperation_1 anOperation) {  // 要使用 getOperator()
		return 	left_operand == anOperation.getLeftOperand() &
				right_operand == anOperation.getRightOperand() &
				operator == anOperation.getOperator();			
	}
	public String toString(){
		return ""+left_operand+getOperator()+right_operand;
	}
	public String asString(){
		return toString()+"=";
	}
	public String fullString(){
		return toString()+"="+getResult();
	}}


