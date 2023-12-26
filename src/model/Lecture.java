package model;

import lombok.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@NoArgsConstructor
public class Lecture {
    private String title;
    private String lecturer;
    private String tag;
    private double stars;
    private String regDate;

    public Lecture(String title, String lecturer, String tag, double stars) {
        this.title = title;
        this.lecturer = lecturer;
        this.tag = tag;
        this.stars = stars;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.regDate = LocalDateTime.now().format(formatter);
    }

    @Override
    // Object를 String으로 변환 시 출력할 문자열 정의
    public String toString() {
        return ". 제목: " + getTitle() + "  강사: " + getLecturer() + "  태그: " + getTag() + "  별점: " + getStars();
    }
}
