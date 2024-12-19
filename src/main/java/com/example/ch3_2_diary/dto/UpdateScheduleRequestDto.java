package com.example.ch3_2_diary.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UpdateScheduleRequestDto {

    private final String password;
    private final String schedule;
    private final String description;
}
