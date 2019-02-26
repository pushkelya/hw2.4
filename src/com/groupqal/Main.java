package com.groupqal;

public class Main {

    public static void main(String[] args) {
	float profit;
	int deposit = 10000;
	int month = 6;
	int percent = 12;

	profit = (10000 * ((float)percent/100) * (month * 31))/356;

		System.out.println("Your profit is: " + profit);
    }
}
