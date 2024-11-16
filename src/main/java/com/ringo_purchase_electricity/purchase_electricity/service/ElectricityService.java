package com.ringo_purchase_electricity.purchase_electricity.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ringo_purchase_electricity.purchase_electricity.dto.*;
import com.ringo_purchase_electricity.purchase_electricity.model.PurchaseElectricityAirvendResponse;
import com.ringo_purchase_electricity.purchase_electricity.model.PurchaseElectricityRingoResponse;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ElectricityService {

//    you can set a higher number for Ringo so that the application can work
    int ringo;
    int airVend;
    int remitaVend;
    private RestTemplate restTemplate = new RestTemplate();
    public ElectricityService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<?> purchaseElectricity(PurchaseElectricityDto purchase) throws JsonProcessingException {

        //If Payment is successful, Buy Electricity

        ResponseEntity<?> response;
        ResponseEntity<PurchaseElectricityAirvendResponse> response1;

        if (ringo <= 2+airVend){
            response = purchaseElectricityRingo(purchase);
            return response;
        }
        else{

            response1 = purchaseElectricityAirvend(purchase);
         return response1;

        }

    }
    public ResponseEntity<?> purchaseElectricityRingo(PurchaseElectricityDto purchase) throws JsonProcessingException {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("email", "davinciss@gmail.com");
        httpHeaders.add("password", "davinci");
        HttpEntity request = new HttpEntity<>(purchase, httpHeaders);
        String url = "https://messaging.approot.ng/ringo-api/index.php";
        ResponseEntity<PurchaseElectricityRingoResponse> response;
        response = restTemplate.exchange(url, HttpMethod.POST, request, PurchaseElectricityRingoResponse.class);
        if(response.getStatusCode() == HttpStatus.OK && (response.getBody().getUnit() != null))
            ringo++;

        if(response.getStatusCode()!=HttpStatus.OK || (response.getBody().getUnit() ==null)){
            return purchaseElectricityAirvend(purchase);
        }

        else {
            return response;
        }

    }

    public ResponseEntity<PurchaseElectricityAirvendResponse> purchaseElectricityAirvend(PurchaseElectricityDto purchase){

        PurchaseElectricityRingoDto dto = new PurchaseElectricityRingoDto();
        PurchaseElectricityAirvend airvend = new PurchaseElectricityAirvend();
        airvend.setAccount(purchase.getMeterNo());
        airvend.setRef(purchase.getRequest_id());
        airvend.setService_code(purchase.getServiceCode());
        airvend.setAmount(purchase.getAmount());
        airvend.setCustomername(purchase.getCustomername());
        airvend.setContacttype(purchase.getContacttype());
        airvend.setCustomeraddress(purchase.getCustomeraddress());
        airvend.setCustomerphone(purchase.getPhonenumber());
        dto.setDetails(airvend);


        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Username", "admin");
        httpHeaders.add("Password", "admin");
        HttpEntity request = new HttpEntity<>(dto, httpHeaders);
        String url = "https://uat.airvendng.net/secured/seamless/vend/";
        ResponseEntity<PurchaseElectricityAirvendResponse> response;
        response = restTemplate.exchange(url, HttpMethod.POST, request, PurchaseElectricityAirvendResponse.class);
        if(response.getStatusCode() == HttpStatus.OK)
            airVend++;
        return response;
    }

    public String providerCount(){
        String ringoCount = String.valueOf(ringo);
        String airVendCount = String.valueOf(airVend);
        String remitaCount = String.valueOf(remitaVend);
        return "Ringo :" + ringoCount + " " + "Airvend :" + airVendCount + " " +  "Remita :" + remitaCount;
    }

    public ResponseEntity<Object> purchaseElectricityRemita(PurchaseElectricityDto purchase){

        RemitaData remitaData = new RemitaData();
        PurchaseElectricityRemita remita = new PurchaseElectricityRemita();

        remita.setProductCode(purchase.getProductCode());
        remita.setClientReference(purchase.getClientReference());
        remita.setAmount(purchase.getAmount());
        remitaData.setPhoneNumber(purchase.getPhonenumber());
        remitaData.setAccountNumber(purchase.getMeterNo());
        remita.setData(remitaData);
        remita.getData().setPhoneNumber(purchase.getPhonenumber());
        remita.getData().setAccountNumber(purchase.getMeterNo());



        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("secretKey", "remi_test_sk_YVZ6OXpRcHdmaitoOUU3TGZya1Fob2IxZSt1bUxMdnV3ZlZtb1E9PTdlM2M0ZjYyYzc2MzQ0YzA2YTFlODFhYWE2MmI5MzU2NzQ4NWY0OTY3ZDM1YmEzOWMzOTczZDk1YzU5NjE3NWM=");
        HttpEntity request = new HttpEntity<>(remita, httpHeaders);
        String url = "https://api-demo.systemspecsng.com/services/connect-gateway/api/v1/vending/transactions";
        ResponseEntity<Object> response;
        response = restTemplate.exchange(url, HttpMethod.POST, request, Object.class);
        if(response.getBody().toString().contains("token"))
//        if(response.getStatusCode() == HttpStatus.OK)
            remitaVend++;
        return response;
    }

    public String purchaseElectricityRingo(){
        return "";
    }

    public String purchaseElectricityAirVend(){
        return "";
    }

    public String purchaseElectricitySochitel(){
        return "";
    }

    public String purchaseElectricityReloadly(){
        return "";
    }

    public String purchaseElectricityVtpass(){
        return "";
    }
}
