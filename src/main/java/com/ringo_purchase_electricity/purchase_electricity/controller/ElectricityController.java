package com.ringo_purchase_electricity.purchase_electricity.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ringo_purchase_electricity.purchase_electricity.dto.PurchaseElectricityDto;
import com.ringo_purchase_electricity.purchase_electricity.model.PurchaseElectricity;
import com.ringo_purchase_electricity.purchase_electricity.service.ElectricityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class ElectricityController {
    @Autowired
    ElectricityService electricityService;

    @PostMapping("/purchase")
    ResponseEntity<?> response(@RequestBody PurchaseElectricityDto purchase) throws JsonProcessingException {

//        return electricityService.purchaseElectricityRingo(purchase);

//        return electricityService.purchaseElectricity(purchase);
        return electricityService.purchaseElectricityRemita(purchase);
    }

    @GetMapping("/providerCount")
    String providerCount(){
        return electricityService.providerCount();
    }
}
