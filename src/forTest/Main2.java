package forTest;


import java.util.Scanner;

public class Main2 {
	
	static int flag = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        //int test = get4x(1, m);
        //System.out.println(test);
        int []amount = new int[m];
        for(int i =0; i<m; i++){
        	amount[i] = in.nextInt();
        }
        for(int i = 0; i<m; i++){
        	judge(amount[i]);
        	if(flag ==1)
        		System.out.println("niu");
        	if(flag ==-1)
        		System.out.println("yang");
        	flag = 0;
        }
        
    }
    public static void judge(int amount){
    	int max;
		max = get4x(1, amount);
		amount -= max;
    	flag =1;
    	while(amount !=0){
    		max = get4x(1, amount);
    		amount -= max;
    		if(flag==1)
    			flag = -1;
    		else if(flag==-1)
    			flag =1;    		
    	}
    	
    }
    
    public static int get4x(int i,int aim){
    	if(4*i > aim )
    		return i;
    	else {
			return get4x(4*i, aim);
		}
    }
}
