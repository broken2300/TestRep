package forTest;
import java.util.*;

/*
 * 简要描述：给出一个不多于5位的整数, 进行反序处理 要求:
1、求出它是几位数
2、分别输出每一位数字
3、按逆序输出各位数字，例如原数为321,应输出123（仅数字间以空格间隔, 负号与数字之间不需要间隔）
 */

public class test1 {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int input = sc.nextInt();
	        //flag
	        int flag = 0;
	        int count = 0;
	        int output = 0;
	        int tmp = 0;
	        if(input > 0){
	        	flag = 1;
	        }
	        else{
	        	flag = -1;
	        }
	        
	        input = Math.abs(input);

        	int tmp_input = 0;
        	int record = 0;
	        
	        if(input ==0){
	        	System.out.println(0);
	        	System.out.println(0);
	        	System.out.println(0);	        	
	        }
	        else{
	        	tmp = input %10;
	        	input/= 10;
	        	output = tmp;
	        	count ++;
	        	tmp_input = input;
		        for(int i = 0; tmp_input != 0; i++){
		        	count++;
		        	tmp_input/= 10;
		        }
		        System.out.println(count);
		        /*
	        	if(flag == -1){
	        		System.out.printf("%d ",-input/(Math.));
	        	}
	        	else{
	        		System.out.printf("%d ",input/(10*(count-1)));
	        	}
	        	*/
	        }	        
	        
	        int []list = new int[count];
	        list[count-1] = output;
	        for(int i = 0; input != 0; i++){
	        	tmp = input%10;
	        	output = tmp + 10*output;
        		input/= 10;
        		list[count-i-2] = tmp; 
	        }
	        
	        if(flag == -1){
        		System.out.printf("%d ",-list[0]);
        	}
        	else{
        		System.out.printf("%d ",list[0]);
        	}
	        
	        for(int i = 1; i< count ; i++){
	        	if(i != count-1)
	        	System.out.printf("%d ", list[i]);
	        	else {
					System.out.println(list[i]);
				}
	        }
	        if(flag == -1){
	        	output = -output;
	        }
	        System.out.printf("%d",output);
	        
	        
	        
	 }
}

