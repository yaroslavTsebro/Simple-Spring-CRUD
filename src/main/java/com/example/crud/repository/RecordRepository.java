package com.example.crud.repository;

import com.example.crud.entity.Record;
import org.springframework.data.repository.ListCrudRepository;

public interface RecordRepository extends ListCrudRepository<Record, Long> {
    Record findByTitle(String title);

}
