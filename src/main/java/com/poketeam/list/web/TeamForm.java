package com.poketeam.list.web;

import com.poketeam.list.data.dto.TeamDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class TeamForm {
    @NonNull
    private Long id;
    @NonNull
    private String userId;
    private String name;
    @NonNull
    private List<Integer> pokemonList;

    // TODO Add toInput method (Object to use in Service layer)
    public TeamDto toDto() {
        String name = null;
        Integer pokemon1 = this.pokemonList.get(0);
        Integer pokemon2 = null;
        Integer pokemon3 = null;
        Integer pokemon4 = null;
        Integer pokemon5 = null;
        Integer pokemon6 = null;

        if (!this.name.isEmpty()) {
            name = this.name;
        }

        Integer index = 1;
        for (Integer pokemonId : this.pokemonList) {
            switch (index) {
                case 2:
                    pokemon2 = pokemonId;
                case 3:
                    pokemon3 = pokemonId;
                case 4:
                    pokemon4 = pokemonId;
                case 5:
                    pokemon5 = pokemonId;
                case 6:
                    pokemon6 = pokemonId;
                default:

            }
            index++;
        }

        return new TeamDto(this.id, this.userId, name, pokemon1, pokemon2, pokemon3, pokemon4, pokemon5, pokemon6);
    }
}
