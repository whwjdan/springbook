package com.jojoldu.book.springbook.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 10000;
        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        //then
        assertEquals(dto.getAmount(),amount);
        assertEquals(dto.getName(),name);

        assertThat(dto.getAmount()).isEqualTo(amount);
        assertThat(dto.getName()).isEqualTo(name);
        // Junit이 아닌 assertj 사용
    }
}