package com.ringo_purchase_electricity.purchase_electricity.model;

import com.ringo_purchase_electricity.purchase_electricity.dto.Details;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PurchaseElectricityAirvendResponse {
    private String confirmationMessage;
    private String confirmationCode;
    private Details details;
}
