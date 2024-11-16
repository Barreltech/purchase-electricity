package com.ringo_purchase_electricity.purchase_electricity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Details {
    private String receipt;
    private String account_balance;
    private String vend_amount;
    private Integer tax_amount;
    private String debt_remaining;
    private String debt_payment;
    private String unit_type;
    private String units;
    private String tariff_description;
    private String payment_date;
    private String customername;
    private String TransactionID;
    private String referenceID;
    private String message;
    private String meternumber;
    private String customeraddress;
    private String disco;
    private String metertype;
    private String customerphone;
    private String type;
    private String account;
    private Double amount;
    private String demand_type;
    private Double Balance;
    private CreditToken creditToken;
}
