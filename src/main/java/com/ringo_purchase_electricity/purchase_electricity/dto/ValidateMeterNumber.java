package com.ringo_purchase_electricity.purchase_electricity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidateMeterNumber {

    private String serviceCode;
    private String disco;
    private String meterNo;
    private String type;

}
