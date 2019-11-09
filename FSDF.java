package b1;
import java.util.Random;
public class FSDF {
	public static void main(String[] args){
		short o=0,p=0,q=0;
		char h='+';
		Random random=new Random();
	for(int i=0;i<50;i++){
		q=(short) random.nextInt(2);
		o=(short)  random.nextInt(101);
		p=(short)  random.nextInt(101);
		if (q==1)
		{
			h='+';
		}else{
			h='-';
		}
		System.out.println(""+(i+1)+":\t"+o+h+p+"=");
	}
		
	}

}
