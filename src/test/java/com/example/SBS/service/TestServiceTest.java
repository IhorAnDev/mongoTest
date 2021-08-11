package com.example.SBS.service;

import com.example.SBS.TestDTO;
import com.example.SBS.repositories.TestDtoRepository;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {

    //    @InjectMocks
    private TestService testService;

    private TestDtoRepository testDtoRepository;

    @Test
    public void test_service_call_repo_when_get_all_data() {
        //Given
        testDtoRepository = Mockito.mock(TestDtoRepository.class);
        testService = new TestService(testDtoRepository);

        Mockito.when(testDtoRepository.findAll()).thenReturn(Lists.list(new TestDTO("2", "2")));

        var expected = Lists.list(new TestDTO("1", "2"));

        //When
        var actual = testService.getAllData();

        //Then
        assertEquals(expected, actual);
    }
}