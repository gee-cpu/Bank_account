package com.gogiocharo.ocharo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDtoUpdate {
    private Long accountId;
    private String iban;
    private String bicSwift;
}
