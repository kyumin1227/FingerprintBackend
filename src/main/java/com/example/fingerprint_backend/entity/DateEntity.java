package com.example.fingerprint_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class DateEntity {

    @Id
    private LocalDate date;
    private Boolean isAble;
    @ElementCollection
    @CollectionTable(name = "date_student_numbers", joinColumns = @JoinColumn(name = "date_id"))
    @Column(name = "student_number")
    private Set<String> members = new HashSet<>();
}
