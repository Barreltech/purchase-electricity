package com.ringo_purchase_electricity.purchase_electricity.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CreditToken {

    private String creditToken;
    private String Expires;
    private String value;
    private String serialNumber;
    private String kct1;
    private String kct2;
}
