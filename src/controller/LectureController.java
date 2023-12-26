package controller;

import model.Lecture;

import java.util.ArrayList;

public class LectureController {
    private final ArrayList<Lecture> lectures = new ArrayList<Lecture>();

    public boolean isLectureExist(String title) {
        return lectures.stream().anyMatch(lecture -> lecture.getTitle().equals(title));
    }

    public boolean isIndexExist(int id) {
        return 0 < id && id <= lectures.size();
    }

    public void createLecture(String title, String lecturer, String tag, double stars) {
        Lecture newLecture = new Lecture(title, lecturer, tag, stars);
        lectures.add(newLecture);
    }

    public ArrayList<Lecture> listAllLectures() {
        return new ArrayList<Lecture>(lectures);
    }

    public void updateLecture(int id, String title, String lecturer, String tag, double stars) {
        if (!title.isEmpty()) lectures.get(id-1).setTitle(title);
        if (!lecturer.isEmpty()) lectures.get(id-1).setLecturer(lecturer);
        if (!tag.isEmpty()) lectures.get(id-1).setTag(tag);
        lectures.get(id-1).setStars(stars);
    }

    public void deleteLecture(int id) {
        lectures.remove(id-1);
    }
}
