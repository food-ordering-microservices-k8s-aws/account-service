package com.akash.account_service.mapper;

import com.akash.account_service.dto.UserAccountDTO;
import com.akash.account_service.entity.UserAccount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Author: akash
 * Date: 15/11/25
 */
@Mapper
public interface UserAccountMapper {

    UserAccountMapper INSTANCE = Mappers.getMapper(UserAccountMapper.class);

    UserAccount mapUserAccountDTOToUserAccount(UserAccountDTO userAccountDTO);
    UserAccountDTO mapUserAccountToUserAccountDTO(UserAccount userAccount);
}
