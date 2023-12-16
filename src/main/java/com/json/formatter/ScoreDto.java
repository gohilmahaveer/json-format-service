package com.json.formatter;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScoreDto {

    private Long id;
    private String status;
    @JsonSerialize(using = CustomScoreSerializer.class)
    private Double score;
}
