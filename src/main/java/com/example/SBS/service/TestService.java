package com.example.SBS.service;

import com.example.SBS.TestDTO;
import com.example.SBS.repositories.TestDtoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    final private TestDtoRepository testDtoRepository;

    public List<TestDTO> getAllData() {
        return testDtoRepository.findAll();
    }

    public void putSomeData(TestDTO dto) {
        testDtoRepository.save(dto);
    }
}
