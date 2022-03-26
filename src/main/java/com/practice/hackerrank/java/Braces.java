package com.practice.hackerrank.java;

import java.util.Stack;

public class Braces {
	public static String isBalanced(String s) {
	    // Write your code here\
	    Stack<Character> stack = new Stack<>();
	    String y = "YES";
	    String n = "NO";
	    for(int i = 0; i<s.length(); i++){
	      char ch = s.charAt(i);
	      if(ch=='{'||ch=='('||ch=='['){
	        stack.push(ch);
	      }else if(stack.isEmpty()){
	        return n;
	      }
	      else if(ch=='}'){
	        if(stack.peek()=='{'){
	          stack.pop();
	        }
	        else{return n;}
	        
	      }else if(ch==']'){
	        if(stack.peek()=='['){
	          stack.pop();
	        }
	        else{return n;}
	           
	      }else if(ch==')'){
	        if(stack.peek()=='('){
	          stack.pop();
	        }
	        else{return n;}
	               
	      }
	    }
	    if(!stack.isEmpty()){
	      return n;
	    }
	    return y;
	    

	    }
}
