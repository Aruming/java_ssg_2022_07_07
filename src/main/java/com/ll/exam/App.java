package com.ll.exam;

import java.util.Scanner;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class App {
    public void run(){
        System.out.println("== 명언 SSG ==");

        Scanner sc = new Scanner(System.in);
        //가장 마지막 명언글의 번호
        List<WiseSaying> wiseSayings = new ArrayList<>();
        int wiseSayingLastId = 0;

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
                    int id = ++wiseSayingLastId; //명언 글번호 증가

                    WiseSaying wiseSaying = new WiseSaying(id, content, author);
                    wiseSayings.add(wiseSaying);

                    System.out.println(id+"번 명언이 등록되었습니다.");
                    break;

                case "목록":
                    System.out.println("번호 / 명언 / 작가");
                    System.out.println("------------------");
                    for (int i = wiseSayings.size() - 1; i >= 0; i--) {
                        WiseSaying wiseSaying_ = wiseSayings.get(i);
                        System.out.printf("%d / %s / %s\n", wiseSaying_.id, wiseSaying_.content, wiseSaying_.author);
                    }
                    break;

                case "종료":
                    break outer;
            }
        }

        sc.close();
    }
}
