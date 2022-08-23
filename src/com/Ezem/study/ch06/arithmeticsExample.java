package com.Ezem.study.ch06;

public class arithmeticsExample {

	public static void main(String[] args) {

		
		
		arithmetics arithmetics = new arithmetics();
		
		int a = 7;
		int b = 3;
		
		int resultSum = arithmetics.sum(a, b);
		int resultSub = arithmetics.sub(a, b);
		int resultMulti = arithmetics.multi(a, b);
		int resultDivi = arithmetics.divi(a, b);
		int resultRemaind = arithmetics.remaind(a, b); 
		

		arithmetics.say(resultSum);
		arithmetics.say(resultSub);
		arithmetics.say(resultMulti);
		arithmetics.say(resultDivi);
		arithmetics.say(resultRemaind);
		
	}

}
