package d2;

import java.util.Random;
import java.util.ArrayList;

public class Exercise_3_2_2 extends ArrayList<BinaryOperation_3_2> {
	// 构造储存BinaryOperation_3_2对象的集合
	private static final long serialVersionUID = 4022510248617156761L;
	private static final short COLUMN_NUMBER = 5;
	// public Object[] getoperator;

	private BinaryOperation_3_2 generateOperation() {
		Random random = new Random();
		int opValue = random.nextInt(2);
		if (opValue == 1) {
			return new AdditionOperation();
		}
		return new SubstractOperation();
	}

	public void generateAdditionExercise(int operationCount) {
		BinaryOperation_3_2 anOperation;
		while (operationCount > 0) {
			do {
				anOperation = new AdditionOperation();
			} while (contains(anOperation));
			add(anOperation);
			operationCount--;
		}
	}

	public void generateBinaryExercise(int operationCount) {
		BinaryOperation_3_2 anOperation;
		while (operationCount > 0) {
			do {
				anOperation = generateOperation();
			} while (contains(anOperation));
			add(anOperation);
			operationCount--;
		}
	}

	public void generateSubstractExercise(int operationCount) {
		BinaryOperation_3_2 anOperation;
		while (operationCount > 0) {
			do {
				anOperation = new SubstractOperation();
			} while (contains(anOperation));
			add(anOperation);
			operationCount--;
		}
	}

	public void formattedDisplay(int columns) {
		// 0 < columns
		int column = 1;
		int count = 1;
		for (BinaryOperation_3_2 op : this) {
			if (column > columns) {
				print("\n");
				column = 1;
			}
			print("" + count + "." + "   ");
			print(op.fullString() + "\t");
			count++;
			column++;
		}
		print("\n");
	}

	public void formattedDisplay() {
		formattedDisplay(COLUMN_NUMBER);
	}

	private static void print(String str) {// 自定义方法输出String类型的数据
		System.out.print(str);
	}
}
