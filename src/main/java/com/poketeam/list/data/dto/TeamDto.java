package com.poketeam.list.data.dto;

import lombok.AllArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Entity
@Table(name = "team")
public class TeamDto {
    @Id
    @GeneratedValue
    private Long id;
    private String userId;
    private String name;
    @Column(nullable = false)
    private Integer pokemon1;
    private Integer pokemon2;
    private Integer pokemon3;
    private Integer pokemon4;
    private Integer pokemon5;
    private Integer pokemon6;

}
