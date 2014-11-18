package algorithm.ch01;

import java.util.Scanner;

/**
 * Programming Challenges 알고리즘 트레이닝 북
 * Chap01. 3n+1 문제(page.39)
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

			// 입력된 구간 값 중, 시작 값이 더 크면 뒤바꾼다
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

					// 짝수면
					if (n % 2 == 0) {
						n = n / 2;
					}
					// 홀수면
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
