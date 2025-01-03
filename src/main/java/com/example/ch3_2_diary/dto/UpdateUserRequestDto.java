package com.example.ch3_2_diary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public class UpdateUserRequestDto {

    private final String username;
    private final String oldPassword;
    private String newPassword;
}
