package com.ringo_purchase_electricity.purchase_electricity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RemitaData {
    private String phoneNumber;
    private String accountNumber;
}
