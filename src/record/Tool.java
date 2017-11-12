package record;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Tool {

	public static int[] stringToInts(String s){  
		 int[] n = new int[s.length()];   
		 for(int i = 0;i<s.length();i++){  
		 n[i] = Integer.parseInt(s.substring(i,i+1));  
		 }  
		 return n;  
		}  
		public static void main(String[] args){  
		 int[] a = stringToInts("123456");  
		 for(int i = 0;i<a.length;i++){  
		 System.out.println("数组中第"+i+"个数为"+a[i]);  
		 }  
		}  
		
		/////////////////////////////////////////////
		public List<String> generateParenthesis(int n) {
	        if (n <= 0) {
	            return new ArrayList<String>();
	        }
	        ArrayList<String> rt = new ArrayList<String>();
	        dfs(rt, "", n, n);
	        return rt;
	    }
	    void dfs(ArrayList<String> rt, String s, int left, int right) {
	        if (left > right) {
	            return;
	        }
	        if (left == 0 && right == 0) {
	            rt.add(s);
	        }
	        if (left > 0) {
	            dfs(rt, s + "(", left - 1, right);
	        }
	        if (right > 0) {
	            dfs(rt, s + ")", left, right - 1);
	        }
	    }
	    /////////////////////////////////////////
	    public boolean isValid(String s) {
	        if (s == null || s.length() % 2 == 1) {
	            return false;
	        }
	        HashMap<Character, Character> map = new HashMap<Character, Character>();
	        map.put('(', ')');
	        map.put('[', ']');
	        map.put('{', '}');
	        Stack<Character> stack = new Stack<Character>();
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (map.keySet().contains(c)) {
	                stack.push(c);
	            } else if (map.values().contains(c)) {
	                if (!stack.empty() && map.get(stack.peek()) == c) {
	                    stack.pop();
	                } else {
	                    return false;
	                }
	            }
	        }
	        
	        return stack.empty();
	    }
		

}
