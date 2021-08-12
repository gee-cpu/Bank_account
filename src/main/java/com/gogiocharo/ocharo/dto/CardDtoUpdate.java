package com.gogiocharo.ocharo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDtoUpdate {
    private Long cardId;
    private String alias;
}
