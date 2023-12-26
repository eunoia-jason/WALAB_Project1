package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lecture {
    private String title;
    private String lecturer;
    private String tag;
    private double stars;

    @Override
    public String toString() {
        return ". 제목: " + getTitle() + "  강사: " + getLecturer() + "  태그: " + getTag() + "  별점: " + getStars();
    }
}
