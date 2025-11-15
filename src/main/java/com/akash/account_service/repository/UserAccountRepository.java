package com.akash.account_service.repository;

import com.akash.account_service.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: akash
 * Date: 15/11/25
 */
@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
