package com.ringo_purchase_electricity.purchase_electricity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PurchaseElectricity {
    private String serviceCode;
    private String disco;
    private String meterNo;
    private String type;
    private String amount;
    private String phonenumber;
    private String request_id;

}
