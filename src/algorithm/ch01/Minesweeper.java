package algorithm.ch01;

import java.util.Scanner;

/**
 * Programming Challenges �˰��� Ʈ���̴� ��
 * Chap01. ����ã��(page.40)
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
			/* mineFiled�� char �迭�� ���� '0'(�� ASCII ��)���� �ʱ�ȭ �Ѵ�. 
			 * ���ǿ� ���ڰ� ���� ������ �迭 ���� 1�� ������Ű�� �� ���� '1', '2', '3', ... dl ehlamfh
			 * ���� �״�� ����ϸ� �ȴ�. */
			char mineFiled[][] = new char[row][col];

			/* �ʱ�ȭ */
			for (int rowIdx = 0; rowIdx < row; rowIdx++) {
				for (int colIdx = 0; colIdx < col; colIdx++) {
					mineFiled[rowIdx][colIdx] = '0';
				}
			}
			
			/* �Է��� �����鼭 ���ÿ� �ش� ������ ó���� */
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

			/* ��� */
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