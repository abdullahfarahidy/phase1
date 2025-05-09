package net.java.lms_backend.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Instructor extends User implements Serializable {
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL, orphanRemoval = true)
    private transient List<Course> courses; // Marked as transient to avoid serialization issues

    public Instructor(User user) {
        super(Role.INSTRUCTOR, user);
    }

    public Instructor() {
        super(Role.INSTRUCTOR, new User());
    }
}
