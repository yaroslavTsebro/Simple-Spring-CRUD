package com.example.crud.service;

import com.example.crud.dto.CreateRecordDTO;
import com.example.crud.dto.UpdateRecordDTO;
import com.example.crud.entity.Record;

import java.util.Collection;
import java.util.Optional;

public interface RecordService {
    Collection<Record> findAll();
    Record findByTitle(String title);
    Boolean deleteById(Long id);
    Record updateById(UpdateRecordDTO dto);
    Record insertRecord(CreateRecordDTO dto);
    Optional<Record> findById(Long id);
}
