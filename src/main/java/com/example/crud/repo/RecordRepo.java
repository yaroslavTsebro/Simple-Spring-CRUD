package com.example.crud.repo;

import com.example.crud.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepo extends JpaRepository<Record, Long> {
    Record findByTitle(String title);

}
