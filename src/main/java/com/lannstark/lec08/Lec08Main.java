package com.lannstark.lec08;

public class Lec08Main {

    public static void main(String[] args) {

    }

    public static void printAll(String... strings) {
        // String 타입의 strings를 N 개 받는 함수 예제
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }
    // 오버라이딩을 통해서 default 파라미터를 고정해야하는 번거로움 발생
    public void repeat(String str, int num) {
        repeat(str, num, true);
    }
    public void repeat(String str){
        repeat(str, 3, true);
    }
}
