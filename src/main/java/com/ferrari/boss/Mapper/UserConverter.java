package com.ferrari.boss.Mapper;

import com.ferrari.boss.Dto.UserDto;
import com.ferrari.boss.Model.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends AbstractConverter<UserDto, User> {
    final private ModelMapper mapper = new ModelMapper();

    @Override
    public User toEntity(UserDto dto) {
        return mapper.map(dto, User.class);
    }

    @Override
    public UserDto toDTO(User entity) {
        return mapper.map(entity, UserDto.class);
    }
}
