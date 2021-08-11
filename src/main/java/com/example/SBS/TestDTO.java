package com.example.SBS;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@RequiredArgsConstructor
public class TestDTO {

    @Id
    private String id;

    final private String testFiled1;
    final private String testFiled2;
}
