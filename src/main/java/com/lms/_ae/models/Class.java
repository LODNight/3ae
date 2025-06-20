package com.lms._ae.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "class")
@Entity
@Data
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String shortName;
    private String className;

    //    Mô tả lớp học
    private String description;

    //    Mô tả online hoặc offline
    private String classType;

    private String classStatus;

    private Integer maxNumber;

    private LocalDate startDate;

    //    Số buổi học
    private String subTotal;

    private String courseDetailsId;
    private String baseId;

    private List<String> studentId;
    private List<String> teacherId;

    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
