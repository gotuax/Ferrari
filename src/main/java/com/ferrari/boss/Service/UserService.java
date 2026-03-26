package com.ferrari.boss.Service;

import com.ferrari.boss.Dto.UserDto;
import com.ferrari.boss.Mapper.Converter;
import com.ferrari.boss.Mapper.UserConverter;
import com.ferrari.boss.Model.User;
import com.ferrari.boss.Repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService extends AbstractService<User, UserDto>{
    private UserConverter userConverter;
    private UserRepository userRepository;

    public UserService(JpaRepository<User, Integer> repository, Converter<UserDto, User> converter, UserConverter userConverter, UserRepository userRepository) {
        super(repository, converter);
        this.userConverter = userConverter;
        this.userRepository = userRepository;
    }

    public List<UserDto> findByNome(String name) {
        return userRepository.
                findByName(name).
                stream().
                map(userConverter::toDTO).
                collect(Collectors.toList());
    }
}
