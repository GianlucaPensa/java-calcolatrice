package org.generation.italy.utils;

public class CalcoliHelper {
	
		private CalcoliHelper(){
			//impossibilitare la creazione di istanze
		}
		
		public static int sumOfTwoNumbers(int a, int b){
			return a+b;
		}
		
		public static int subtractionOfTwoNumbers(int a, int b){
			return a-b;	
		}
		
		public static int multiplicationOfTwoNumbers(int a, int b){
			return a*b;
		}
		
		public static int absoluteValueOfNumber(int a){
			if(a<0) {
				return a*-1;
			}
			return a;
		}
		
		public static int minOfTwoNumbers(int a, int b){
			if(a>b) {
				return b;
			}
			return a;
		}
		
		public static int maxOfTwoNumbers(int a, int b){
			if(a>b) {
				return a;
			}
			return b;
		}
		
		public static int exponentiationOfANumber(int base, int exponent){
			int multiplier = base;
			if(exponent<0) {
				int repetitions = CalcoliHelper.absoluteValueOfNumber(exponent);
				for(int i = 1; i<repetitions;i++) {
					base= base*multiplier;
				}
				System.out.print("1" + "/");
				return base;
			}
			for(int i = 1; i<exponent;i++) {
				base= base*multiplier;
			}
			return base;
		}
		
		public static double sumOfTwoNumbers(double a, double b){
			return a+b;
		}
		
		public static double subtractionOfTwoNumbers(double a, double b){
			return a-b;
		}
		
		public static double multiplicationOfTwoNumbers(double a, double b){
			return a*b;
		}
		
		public static double absoluteValueOfNumber(double a){
			if(a<0) {
				return a*-1;
			}
			return a;
		}
		
		public static double minOfTwoNumbers(double a, double b){
			if(a>b) {
				return b;
			}
			return a;
		}
		
		public static double maxOfTwoNumbers(double a, double b){
			if(a>b) {
				return a;
			}
			return b;
		}
}
