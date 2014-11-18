package algorithm.ch01;

import java.util.Scanner;

/**
 * Programming Challenges 알고리즘 트레이닝 북
 * Chap01. 지뢰찾기(page.40)
 * 
 * @author yeonho.lee
 */
class Minesweeper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 1;

		while (true) {

			int row = sc.nextInt();
			int col = sc.nextInt();
			/* mineFiled는 char 배열로 문자 '0'(의 ASCII 값)으로 초기화 한다. 
			 * 주의에 지뢰가 있을 때마다 배열 값을 1씩 증가시키면 그 값이 '1', '2', '3', ... dl ehlamfh
			 * 문자 그대로 출력하면 된다. */
			char mineFiled[][] = new char[row][col];

			/* 초기화 */
			for (int rowIdx = 0; rowIdx < row; rowIdx++) {
				for (int colIdx = 0; colIdx < col; colIdx++) {
					mineFiled[rowIdx][colIdx] = '0';
				}
			}
			
			/* 입력을 받으면서 동시에 해당 라인을 처리함 */
			for (int rowIdx = 0; rowIdx < row; rowIdx++) {
				String st = sc.next();
				
				for (int colIdx = 0; colIdx < col; colIdx++) {
					if (st.charAt(colIdx) == '*') {

						for (int i = rowIdx - 1; i <= rowIdx + 1; i++) {
							for (int j = colIdx - 1; j <= colIdx + 1; j++) {

								if (i >= 0 && i < row && j >= 0 && j < col) {
									if(mineFiled[i][j] != '*') {
										mineFiled[i][j]++;
									}	
								}
							}
						}
						mineFiled[rowIdx][colIdx] = '*';
					}
				}
			}

			/* 출력 */
			if (num > 1) {
				System.out.println();
			}
			System.out.println("Field #" + num++ + ":");
			for (int rowIdx = 0; rowIdx < row; rowIdx++) {
				for (int colIdx = 0; colIdx < col; colIdx++) {
						System.out.print(mineFiled[rowIdx][colIdx]);
				}
				System.out.println();
			}

		}

	}

}