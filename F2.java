package b2;
import java.util.Random;
public class F2 {
	private static final Random Random = null;
	static  String Array1[]  =new String[50];//储存加法或减法的符号串的数组
	static int Array2[]=new int[50];//记录每个算式的运算结果
	static int Array3[]=new int[50];
	static int Array4[]=new int[50];
private static void printHeader() {//程序功能
		// TODO Auto-generated method stub
    System.out.println("-程序輸出50道100以內的加減法算式的答题\n"
    		+ "-每次运行程序可得到50道題的习题及答案");
	}

	private static void printCalculations() {//输出习题答案的方法
		printExercise();
		System.out.println("如下是习題的参考答案：");
		for(int  i=0;i<50;i++){
			System.out.print(""+(i+1)+":\t"+Array2[i]+"\t");
			if((i+1)%5==0){//println换号输出
				System.out.println();
				}}
		}

	private static void printExercise() {//输出符合条件的算术式
		// TODO Auto-generated method stub
		Random random=new Random();
		for(int i=0;i<50;i++){
			short q = (short) random.nextInt(101);
			Array3[i]=q;
			short o = (short) random.nextInt(101);
			Array4[i]=o;
			for(int s=0;s<i;s++)
			{
				if(Array3[s]==q&&Array4[s]==0)
					i--;
				continue;
			}
		//generateEquations() ;
		//System.out.println(""+(i+1)+":\t"+o+Array1[i]+q+"=");
		if (Array1[i].equals("+"))
		{
			Array2[i]=q+o;
			}
		else {
			Array2[i]=q-o;
			}
		if(Array2[i]<0||Array2[i]>100) {//对于不符合条件的结果进行返回重新运行
			i--;
			continue;
	}
		System.out.print(""+(i+1)+":\t"+q+Array1[i]+o+"="+"\t");
		if((i+1)%5==0){//println换号输出
			System.out.println();
			}}
		}

	public static void generateEquations() {//生成加法或减法符号串
		// TODO Auto-generated method stub
		int q = 0;int i=0;
		new Random();
		for( i=0;i<50;i++){
			q=(int)(Math.random()*2);//q记录随机生成的数
			String  h;
			if (q==0)
		{
			h="+";
		}else{
			h="-";
		}
			Array1[i]=h;
	//System.out.println(Array1[i]);
	}}
	public static void main(String[] args){
	    printHeader();
		generateEquations();
		
		printCalculations();
		
	}
	}