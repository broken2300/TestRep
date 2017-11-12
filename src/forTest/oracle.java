package forTest;

import java.util.Scanner;
import java.util.Stack;

public class oracle {

	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		String source = in.nextLine();
		String result = new String();
		StringBuilder sb ;
		char []sourceChar = new char[source.length()];
		
		sourceChar = source.toCharArray();
		
		//stack
		Stack<String> numStack = new Stack<String>();
		Stack<Character> operationStack = new Stack<Character>();
		
		for (char c : sourceChar) {
			if(c == '+' || c == '-' || c == '*' || c== '/'){	//operation
				//operationStack.add(c);

				sb = new StringBuilder();
				
				//get last number, postfix
				sb.append(c);
				sb.append(numStack.pop());
				sb.append(')');
				
				//get second last number, prefix 
				sb.insert(0, numStack.pop());
				sb.insert(0, '(');
				
				//push result
				numStack.push(sb.toString());
				
			}
			else{												//number
				numStack.push(Character.toString(c));
			}
		}
		
		System.out.println(numStack.pop());
	}
}
