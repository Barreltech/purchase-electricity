package com.ringo_purchase_electricity.purchase_electricity.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PurchaseElectricityRemita {

     private String productCode;
     private String clientReference;
     private String amount;
     private RemitaData data;
}
