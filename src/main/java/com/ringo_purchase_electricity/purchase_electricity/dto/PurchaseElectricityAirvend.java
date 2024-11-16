package com.ringo_purchase_electricity.purchase_electricity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PurchaseElectricityAirvend {

    private String ref;
    private String account;
    private String service_code;
    private String amount;
    private String customername;
    private String contacttype;
    private String customeraddress;
    private String customerphone;

}

