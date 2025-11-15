package com.akash.account_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: akash
 * Date: 15/11/25
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccount extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String userPassword;
    private String address;
    private String city;

}
