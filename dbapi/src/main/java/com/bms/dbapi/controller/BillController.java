package com.bms.dbapi.controller;

import com.bms.dbapi.models.Bill;
import com.bms.dbapi.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/db/bill")
public class BillController {
    @Autowired
    private BillRepository billRepository;
    @PostMapping("/create")
    public ResponseEntity createBill(@RequestBody Bill bill) {
        return new ResponseEntity<>(billRepository.save(bill), HttpStatus.CREATED);
    }


}
