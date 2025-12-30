package com.anime.tracker.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "anime")
public class Anime {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Long userId;
    
    @NotBlank(message = "Title is required")
    @Column(nullable = false)
    private String title;
    
    private String genre;
    
    private Integer totalEpisodes;
    
    @Column(nullable = false)
    private Integer episodesWatched = 0;
    
    @Column(nullable = false)
    private String status = "PLAN_TO_WATCH"; // WATCHING, COMPLETED, PLAN_TO_WATCH, DROPPED
    
    @Min(1)
    @Max(10)
    private Integer rating;
    
    @Column(columnDefinition = "TEXT")
    private String notes;
    
  
}