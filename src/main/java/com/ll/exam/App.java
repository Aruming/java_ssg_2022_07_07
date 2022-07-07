package com.ll.exam;

import java.util.Scanner;

public class App {
    public void run(){
        System.out.println("== 명언 SSG ==");

        Scanner sc = new Scanner(System.in);
        int num=1;

        outer:
        while (true){
            System.out.print("명령) ");
            String cmd = sc.nextLine().trim();

            switch (cmd){
                case "등록":
                    System.out.printf("명언 : ");
                    String content = sc.nextLine().trim();
                    System.out.printf("작가 : ");
                    String author = sc.nextLine().trim();
                    System.out.println(num+"번 명언이 등록되었습니다.");
                    num++;
                    break;

                case "종료":
                    break outer;
            }
        }

        sc.close();
    }
}
