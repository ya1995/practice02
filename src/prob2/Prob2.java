package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];

		System.out.println( "5개의 숫자를 입력하세요. ");
		Scanner scanner = new Scanner( System.in );
		
		double sum = 0;
		
		for( int i=0; i<intArray.length; i++ ) {
		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
			intArray[ i ] = scanner.nextInt();	
			
		/* 배열에 저장된 정수 값 더하기 */
			sum += intArray[i]; 
		
		}
		/* 출력 */
		System.out.println( "평균은 " + ( sum / intArray.length ) + "입니다." );
		
	}
}
