package com.example.SBS;

import com.example.SBS.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    final private TestService testService;

    @GetMapping("test")
    public List<TestDTO> test() {
        return testService.getAllData();
    }

    @PostMapping("put")
    public void add(
            @RequestBody TestDTO dto
    ) {
        testService.putSomeData(dto);
    }
}
