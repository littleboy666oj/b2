package d2;
/**/
public class AdditionOperation extends BinaryOperation_3_2 {
	public AdditionOperation() {	
		generateBinaryOperation('+');		
	}
	public boolean checkingCalculation(int anInteger){
		return anInteger <= UPPER;//当运算值小于等于100时返回true
	}
	int calculate(int left, int right){
		return left+right;//返回左右值相加的结果
	}
}