package com.example.photosharing.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Entity(name = "comment")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String content;

    LocalDateTime time;
    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")

    User user;
    @ManyToOne
    @JoinColumn(name="photo_id",referencedColumnName = "id")
    Photo photo;

}
