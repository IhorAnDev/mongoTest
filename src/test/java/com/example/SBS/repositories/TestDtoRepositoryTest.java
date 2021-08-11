package com.example.SBS.repositories;

import com.example.SBS.TestDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataMongoTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestDtoRepositoryTest {

    @Autowired
    private TestDtoRepository testDtoRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @BeforeAll
    public void beforeAll() {
        mongoTemplate.dropCollection(TestDTO.class);
        mongoTemplate.save(new TestDTO("a", "b"));
    }

    @Test
    public void test_call_repo() {
        //Given
        var expected = List.of(new TestDTO("a", "b"));

        //When
        var actual = testDtoRepository.findAll();

        //Then
        assertThat(actual).usingRecursiveComparison().ignoringFields("id");
    }
}