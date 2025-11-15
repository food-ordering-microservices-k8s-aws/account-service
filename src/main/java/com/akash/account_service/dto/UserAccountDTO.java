package com.akash.account_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: akash
 * Date: 15/11/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccountDTO {
    private int userId;
    private String userName;
    private String userPassword;
    private String address;
    private String city;
}
