package com.itbanker.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter //lombok 설치
@AllArgsConstructor
public class UserDTO {
    private String userName;
    private String userId;
    private String userPw;

    public UserDTO() {
    }
}
