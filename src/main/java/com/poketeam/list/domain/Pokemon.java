package com.poketeam.list.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
    @NonNull
    private Long id;
    @NonNull
    private String name;
    private String imageUrl;
    @NonNull
    private String type1;
    private String type2;
    @NonNull
    private String ability1;
    private String ability2;
    private String ability3;
    @NonNull
    private Integer specialAttack;
    @NonNull
    private Integer specialDefense;
    @NonNull
    private Integer hp;
    @NonNull
    private Integer attack;
    @NonNull
    private Integer defense;
    @NonNull
    private Integer speed;
}
