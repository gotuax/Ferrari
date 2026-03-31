package com.ferrari.boss.Converter;

import com.ferrari.boss.DTO.UserDTO;
import com.ferrari.boss.Model.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends AbstractConverter<UserDTO, User> {
    final private ModelMapper mapper = new ModelMapper();

    @Override
    public User toEntity(UserDTO dto) {
        return mapper.map(dto, User.class);
    }

    @Override
    public UserDTO toDTO(User entity) {
        return mapper.map(entity, UserDTO.class);
    }
}
