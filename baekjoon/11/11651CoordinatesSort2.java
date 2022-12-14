/**
 *  번호: 11651
 *  날짜: 2022.08.16
 *  제목: 좌표 정렬하기2
 *  링크: https://www.acmicpc.net/problem/11651
 * 
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

class CoordinatesSort2 { // CoordinatesSort
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[1] == e2[1]) {
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}