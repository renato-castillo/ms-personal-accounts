package com.bootcamp.personalaccounts.util;

import com.bootcamp.personalaccounts.dto.PersonalAccountDto;
import com.bootcamp.personalaccounts.entity.PersonalAccount;
import org.springframework.beans.BeanUtils;

public abstract class MapperUtil {

    public PersonalAccountDto convertToDto(PersonalAccount personalAccount) {
        PersonalAccountDto personalAccountDto = new PersonalAccountDto();
        BeanUtils.copyProperties(personalAccount, personalAccountDto);

        return personalAccountDto;
    }

    public PersonalAccount convertToEntity(PersonalAccountDto personalAccountDto) {
        PersonalAccount personalAccount = new PersonalAccount();
        BeanUtils.copyProperties(personalAccountDto, personalAccount);

        return personalAccount;
    }


}
