/*里面包含加法和减法的共有属性，包括左值，右值，符号值，以及计算方法
 * 其中计算方法为抽象方法在加法和减法类中具体定义*/
package d2;
import java.util.Random;
public abstract class BinaryOperation_3_2 {
    static final int UPPER = 100;
	static final int LOWER = 0;
	private int left_operand=0, right_operand=0;
	private char operator='+';
  	private int value=0;

	protected void generateBinaryOperation(char anOperator) {//随机生成左值和右值，参数anOperator决定是加减法
	    int left, right, result;
	    Random random = new Random();
		left = random.nextInt(UPPER+1);
		do {
   			right = random.nextInt(UPPER+1);
			result = calculate(left,right);
		} while (!(checkingCalculation(result)));
		left_operand = left;
		right_operand = right;
		operator = anOperator;
		value = result;	
	}
	
	
	abstract boolean checkingCalculation(int anInteger);//抽象方法，对两数运算值进行限制
    abstract int calculate(int left, int right);//抽象运算方法
    
	public int getLeftOperand(){return left_operand;}
	public int getRightOperand(){return right_operand;}
	public char getOperator(){return operator;}
	public int getResult(){return value;}

	public boolean equals (BinaryOperation_3_2 anOperation) {  // 要使用 getOperator()
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
	public String fullString(){//返回单个完整算式
		return toString()+"="+getResult();
	}  
}

