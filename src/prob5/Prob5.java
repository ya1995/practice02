package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// 게임 변수 초기화
			int minNumber = 1;
			int maxNumber = 100;
			
			int countTry = 1;
			
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			System.out.println("1-100");

			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt(maxNumber) + minNumber;
			System.out.println(correctNumber);
			String answer = "";

			// 게임시작
			System.out.println(countTry + ">>");
			int num = scanner.nextInt();

			while (correctNumber != num) {
				if (num < correctNumber) {
					System.out.println("더 높게");
					minNumber = num;

				} else if (num > correctNumber) {
					System.out.println("더 낮게");
					maxNumber = num;
				}		
				
				System.out.println(minNumber + "-" + maxNumber);
				System.out.print(countTry++ + ">>");
				num = scanner.nextInt();

			}
			System.out.println("맞았습니다.");

			System.out.println("다시하시겠습니까?(y/n)");
			answer = scanner.next();
			if (answer.equals("n")) {
				break;
			}
		}
		/* scanner.close(); */
	}
}