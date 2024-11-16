package com.ringo_purchase_electricity.purchase_electricity.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PurchaseElectricityDto {

    private String serviceCode;
    private String disco;
    private String meterNo;
    private String type;
    private String amount;
    private String phonenumber;
    private String request_id;
    private String customername;
    private String contacttype;
    private String customeraddress;
    private String productCode;
    private String clientReference;
}
