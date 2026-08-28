package com.example.cadence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pace_brackets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaceBracket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String label;

    @Column(name = "min_pace_sec", nullable = false)
    private Integer minPaceSec;

    @Column(name = "max_pace_sec", nullable = false)
    private Integer maxPaceSec;

    @Column(name = "bpm_min", nullable = false)
    private Integer bpmMin;

    @Column(name = "bpm_max", nullable = false)
    private Integer bpmMax;
}