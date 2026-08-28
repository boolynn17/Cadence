package com.example.cadence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "run_records")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RunRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pace_bracket_id", nullable = false)
    private PaceBracket paceBracket;

    @Column(name = "distance_km", nullable = false)
    private BigDecimal distanceKm;

    @Column(name = "avg_pace_sec", nullable = false)
    private Integer avgPaceSec;

    @Column(name = "duration_sec", nullable = false)
    private Integer durationSec;

    @Column(name = "cadence_avg", nullable = false)
    private Integer cadenceAvg;

    private Integer calories;

    @Column(name = "altitude_gain")
    private Integer altitudeGain;

    @Column(name = "avg_heart_rate")
    private Integer avgHeartRate;

    @Column(name = "recorded_at", nullable = false)
    private LocalDateTime recordedAt;
}