package com.example.cadence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tracks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String artist;

    @Column(nullable = false)
    private Integer bpm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pace_bracket_id", nullable = false)
    private PaceBracket paceBracket;

    @Column(name = "play_url")
    private String playUrl;

    @Column(nullable = false)
    @Builder.Default
    private Boolean hidden = false;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genre genre;

    public enum Genre {
        POP, KPOP, INDIE, HIPHOP, RNB, ROCK, EDM, JAZZ, CLASSICAL, OST, ETC
    }
}