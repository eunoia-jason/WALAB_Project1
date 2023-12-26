package view;

import controller.LectureController;
import model.Lecture;

import java.util.ArrayList;
import java.util.Scanner;

public class LectureView {
    private final Scanner in;
    private final LectureController lectureController;

    public LectureView(Scanner in, LectureController lectureController) {
        this.in = in;
        this.lectureController = lectureController;
    }

    public void createLecture() {
        System.out.println("======= 강의 등록 =======");
        System.out.print("강의 제목: ");
        String title = in.nextLine();
        while (lectureController.isLectureExist(title)) {
            System.out.println("이미 등록된 강의입니다. 다시 입력해 주세요!");
            System.out.print("강의 제목: ");
            title = in.nextLine();
        }

        System.out.print("강사: ");
        String lecturer = in.nextLine();
        System.out.print("태그: ");
        String tag = in.nextLine();
        System.out.print("별점: ");
        double stars = in.nextDouble();

        lectureController.createLecture(title, lecturer, tag, stars);
        System.out.println("======= 강의 등록 완료 =======\n");
    }

    public void listAllLectures() {
        ArrayList<Lecture> lectures = lectureController.listAllLectures();

        System.out.println("======= 강의 목록 =======");
        for (int i=0; i<lectures.size(); i++) {
            System.out.println((i+1) + lectures.get(i).toString());
        }
        System.out.println("======================\n");
    }

    public void updateLecture() {
        listAllLectures();
        System.out.print("수정할 강의의 번호를 선택해 주세요: ");
        int id = in.nextInt();
        in.nextLine();
        while (!lectureController.isIndexExist(id)) {
            System.out.println("잘못된 번호입니다. 다시 입력해 주세요!");
            System.out.print("번호: ");
            id = in.nextInt();
            in.nextLine();
        }

        System.out.print("새 제목: ");
        String newTitle = in.nextLine();
        System.out.print("새 강사: ");
        String newLecturer = in.nextLine();
        System.out.print("새 태그: ");
        String newTag = in.nextLine();
        System.out.print("새 별점: ");
        double newStars = in.nextDouble();

        lectureController.updateLecture(id, newTitle, newLecturer, newTag, newStars);
        System.out.println("======= 수정 완료 =======\n");
    }
}
