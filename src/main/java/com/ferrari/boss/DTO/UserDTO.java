package com.ferrari.boss.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO
{
    Integer id;
    String name;
    String surname;
    String email;
    String password;
}