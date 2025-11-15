package com.akash.account_service.service;

import com.akash.account_service.dto.UserAccountDTO;
import com.akash.account_service.entity.UserAccount;
import com.akash.account_service.mapper.UserAccountMapper;
import com.akash.account_service.repository.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Author: akash
 * Date: 15/11/25
 */
@RequiredArgsConstructor
@Service
public class UserAccountService {

    private final UserAccountRepository userAccountRepository;


    public UserAccountDTO addUserAccount(UserAccountDTO userDTO) {
        UserAccount savedUserAccount = userAccountRepository.save(UserAccountMapper.INSTANCE.mapUserAccountDTOToUserAccount(userDTO));
        return UserAccountMapper.INSTANCE.mapUserAccountToUserAccountDTO(savedUserAccount);

    }

    public ResponseEntity<UserAccountDTO> findUserAccountById(Long userId) {
        Optional<UserAccount> optionalUserAccount =  userAccountRepository.findById(userId);
        if(optionalUserAccount.isPresent())
            return new ResponseEntity<>(UserAccountMapper.INSTANCE.mapUserAccountToUserAccountDTO(optionalUserAccount.get()), HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }
}
