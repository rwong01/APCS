/*
 * @author: Rebecca Wong
 * @assignment: Lab 5-10
 * @class: AP CS P.1
 * @date: 12/2/14
 */

import java.util.ArrayList;
import java.util.Scanner;

public class lab5_10 {
	public static void main(String[] args){
		System.out.println((double)1+3/2*5);
	}
	public static ArrayList<String> parse(String input){
		ArrayList<String> tokens = new ArrayList<String>(); 
	    Scanner s = new Scanner(input);
	    while (s.hasNext()) {
	         String token = s.next();
	         tokens.add(token);
	    }
	    s.close();
	    return tokens;
	}
	
	public static double evaluate(ArrayList<String> tokens){
		ArrayList<String> outcome = new ArrayList<String>();
		int i = 0;
		while(i < tokens.size()) {
		    if (tokens.get(i).equals("*")) {  //evaluate * first
		        double left = Double.parseDouble(outcome.get(outcome.size() - 1)); 
		        ++i;   //move to the next
		        double right = Double.parseDouble(tokens.get(i));
		        outcome.set(outcome.size() - 1, Double.toString(left*right));  //replace last one
		    } 
		    else if (tokens.get(i).equals("/")) {  //evaluate / first
		        double left = Double.parseDouble(outcome.get(outcome.size() - 1)); 
		        ++i;   //move to the next
		        double right = Double.parseDouble(tokens.get(i));
		        outcome.set(outcome.size() - 1, Double.toString(left/right));  //replace last one
		    }
		    else {
		        outcome.add(tokens.get(i));
		    }
		    ++i;    //move to the next
		}
		tokens=outcome;
		outcome = new ArrayList<String>();
		i = 0;
		while(i < tokens.size()) {
		    if (tokens.get(i).equals("+")) {  //evaluate + 
		        double left = Double.parseDouble(outcome.get(outcome.size() - 1)); 
		        ++i;   //move to the next
		        double right = Double.parseDouble(tokens.get(i));
		        outcome.set(outcome.size() - 1, Double.toString(left+right));  //replace last one
		    } 
		    else if (tokens.get(i).equals("-")) {  //evaluate - first
		        double left = Double.parseDouble(outcome.get(outcome.size() - 1)); 
		        ++i;   //move to the next
		        double right = Double.parseDouble(tokens.get(i));
		        outcome.set(outcome.size() - 1, Double.toString(left-right));  //replace last one
		    }
		    else {
		        outcome.add(tokens.get(i));
		    }
		    ++i;    //move to the next
		}
		return Double.parseDouble( outcome.get(0));	
	}
}
