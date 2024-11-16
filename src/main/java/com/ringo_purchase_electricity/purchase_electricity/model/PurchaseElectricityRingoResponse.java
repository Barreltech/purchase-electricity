package com.ringo_purchase_electricity.purchase_electricity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PurchaseElectricityRingoResponse {
    private String token;
    private String unit;
    private Integer amount;
    private String message;
    private String status;
    private String customerName;
    private String date;
    private String transId;
    private String disco;

}
