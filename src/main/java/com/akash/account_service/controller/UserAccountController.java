package com.akash.account_service.controller;

import com.akash.account_service.dto.UserAccountDTO;
import com.akash.account_service.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Author: akash
 * Date: 15/11/25
 */
@RestController
@RequestMapping("/user")
public class UserAccountController {

    @Autowired
    UserAccountService userAccountService;

    @PostMapping("/addUserAccount")
    public ResponseEntity<UserAccountDTO> addUserAccount(@RequestBody UserAccountDTO userDTO){
        UserAccountDTO savedUserAccount =  userAccountService.addUserAccount(userDTO);
        return new ResponseEntity<>(savedUserAccount, HttpStatus.CREATED);
    }

    @GetMapping("/findUserAccountById/{userId}")
    public ResponseEntity<UserAccountDTO> findUserAccountById(@PathVariable Long userId){
        return userAccountService.findUserAccountById(userId);
    }



}
