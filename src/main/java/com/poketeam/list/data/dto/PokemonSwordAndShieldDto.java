package com.poketeam.list.data.dto;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "pokemon_sword_and_shield")
public class PokemonSwordAndShieldDto {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "type_1")
    private String type1;

    @Column(name = "type_2")
    private String type2;

    @Column(name = "ability_1")
    private String ability1;

    @Column(name = "ability_2")
    private String ability2;

    @Column(name = "ability_3")
    private String ability3;

    @Column(name = "special_attack")
    private Integer specialAttack;

    @Column(name = "special_defense")
    private Integer specialDefense;

    private Integer hp;
    private Integer attack;
    private Integer defense;
    private Integer speed;


}
