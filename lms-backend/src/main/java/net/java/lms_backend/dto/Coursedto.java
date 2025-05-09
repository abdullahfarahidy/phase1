package net.java.lms_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.java.lms_backend.entity.Instructor;
import net.java.lms_backend.entity.Lesson;
import net.java.lms_backend.entity.MediaFiles;
import net.java.lms_backend.entity.User;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coursedto {
    private Long id;
    private String title;
    private String description;
    private String duration;
    private Long instructorId;
    private Instructor instructor;
    private List<Lesson> lessons;
    private List<Long> lessonIds;
    private List<MediaFiles> mediaFiles;
    private List<QuestionDTO> questionsBank;
    private Double rating;
    private Integer ratingCount;

    public Coursedto(Long id, String title, String description, String duration, 
                   List<MediaFiles> mediaFiles, Long instructorId,
                   Double rating, Integer ratingCount) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.mediaFiles = mediaFiles;
        this.instructorId = instructorId;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }

    public Coursedto(Long id, String title, String description, String duration, 
                   List<MediaFiles> mediaFiles, Long id2, List<Long> lessonIds,
                   Double rating, Integer ratingCount) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.mediaFiles = mediaFiles;
        this.instructorId = id2;
        this.lessonIds = lessonIds;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDuration() {
        return duration;
    }

    public Long getInstructorId() {
        return instructorId;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public List<Long> getLessonIds() {
        return lessonIds;
    }

    public List<MediaFiles> getMediaFiles() {
        return mediaFiles;
    }

    public List<QuestionDTO> getQuestionsBank() {
        return questionsBank;
    }

    public Double getRating() {
        return rating;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    // Setters
    public void setQuestionsBank(List<QuestionDTO> questionsBank) {
        this.questionsBank = questionsBank;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }
}
