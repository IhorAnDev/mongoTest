package com.example.SBS.repositories;

import com.example.SBS.TestDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface TestDtoRepository extends MongoRepository<TestDTO, UUID> {
}
