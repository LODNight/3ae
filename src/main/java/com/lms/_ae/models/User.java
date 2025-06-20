package com.lms._ae.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String user_name;

    private String email;
}
