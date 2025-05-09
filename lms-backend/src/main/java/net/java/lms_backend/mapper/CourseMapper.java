package net.java.lms_backend.mapper;

import net.java.lms_backend.dto.Coursedto;
import net.java.lms_backend.entity.*;

import java.util.List;
import java.util.stream.Collectors;

public class CourseMapper {
    public static Coursedto mapToCoursedto(Course course) {
        return new Coursedto(
                course.getId(),
                course.getTitle(),
                course.getDescription(),
                course.getDuration(),
                course.getMediaFiles().stream()
                        .map(mediaFile -> new MediaFiles(mediaFile.getId(), mediaFile.getFileName()))
                        .collect(Collectors.toList()),
                course.getInstructor().getId(),
                course.getRating(),
                course.getRatingCount()
        );
    }

    public static Course maptoCourse(Coursedto coursedto) {
        if (coursedto == null) {
            throw new NullPointerException("The CourseDTO Should not be null");
        }
        Course course = new Course();
        course.setId(coursedto.getId());
        course.setTitle(coursedto.getTitle());
        course.setDescription(coursedto.getDescription());
        course.setDuration(coursedto.getDuration());
        course.setMediaFiles(coursedto.getMediaFiles());
        course.setInstructor(coursedto.getInstructor());
        course.setRating(coursedto.getRating());
        course.setRatingCount(coursedto.getRatingCount());
        return course;
    }
}
