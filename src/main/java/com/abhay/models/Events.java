package com.abhay.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @Column(length = 1000)
    private List<String> image;

    private LocalDateTime startedAt;

    private LocalDateTime endsAt;

    private String name;

    @ManyToOne
    private Restaurant restaurant;

    private String location;
}
