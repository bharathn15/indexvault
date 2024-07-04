package com.index.vault.game;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "game")
public class Game {
    @Id
    private String  game_id;
    private String  game_name;
    private String  release_year;
    private String  release_date_time;
    private String  release_version;

}
