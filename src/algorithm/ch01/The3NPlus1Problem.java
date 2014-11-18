package algorithm.ch01;

import java.util.Scanner;

/**
 * Programming Challenges �˰��� Ʈ���̴� ��
 * Chap01. 3n+1 ����(page.39)
 * 
 * @author yeonho.lee
 */
public class The3NPlus1Problem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			int begin = sc.nextInt();
			int end = sc.nextInt();
			int maxSize = 0;

			// �Էµ� ���� �� ��, ���� ���� �� ũ�� �ڹٲ۴�
			if (begin > end) {
				int tmp = begin;
				begin = end;
				end = tmp;
			}

			for (int idx = begin; idx <= end; idx++) {

				int n = idx;
				int size = 1;

				while (true) {

					// System.out.print(" " + n);
					if (n == 1) {
						break;
					}

					// ¦����
					if (n % 2 == 0) {
						n = n / 2;
					}
					// Ȧ����
					else {
						n = 3 * n + 1;
					}
					size++;

					if (maxSize < size) {
						maxSize = size;
					}
				}

			}
			System.out.println(begin + " " + end + " ==> Max Size: " + maxSize);
		}
	}
}
