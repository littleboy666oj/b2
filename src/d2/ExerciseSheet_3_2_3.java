package d2;
public class ExerciseSheet_3_2_3 {
	public static void main(String[] args) {
		System.out.println("————————————生成50道加法算式————————————");
	Exercise_3_2_2 exercise=new Exercise_3_2_2();
	exercise.generateAdditionExercise(50);//产生50个加法算式的习题
	exercise.formattedDisplay(5);//每行显示5个加法算式
	System.out.println("————————————生成50道减法算式————————————");
	Exercise_3_2_2 exercise2=new Exercise_3_2_2();
	exercise2.generateSubstractExercise(50);//产生50个减法算式的习题
	exercise2.formattedDisplay(5);//每行显示5个减法算式
	System.out.println("————————————生成50道混合算式————————————");
	Exercise_3_2_2 exercise3=new Exercise_3_2_2();
	exercise3.generateBinaryExercise(50);
	exercise3.formattedDisplay(5);
	}
}

