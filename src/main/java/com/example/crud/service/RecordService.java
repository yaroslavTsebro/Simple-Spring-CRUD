package com.example.crud.service;

import com.example.crud.model.Record;

import java.util.Collection;

public interface RecordService {
    Collection<Record> findAll();
    Record findByTitle(String title);
    Boolean deleteById(Long id);
    Record updateById(Record record);
}
