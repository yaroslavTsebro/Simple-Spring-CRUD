package com.example.crud.service.implementation;

import com.example.crud.model.Record;
import com.example.crud.repo.RecordRepo;
import com.example.crud.service.RecordService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Transactional
@Slf4j
@Service
public class RecordServiceImp implements RecordService {
    private final RecordRepo recordRepo;

    @Override
    public Collection<Record> findAll() {
        log.info("Fetching all records");
        return recordRepo.findAll();
    }

    @Override
    public Record findByTitle(String title) {
        log.info("Find by title: "+ title);
        return recordRepo.findByTitle(title);
    }

    @Override
    public Boolean deleteById(Long id) {
        log.info("Delete by id: "+ id);
        recordRepo.deleteById(id);
        return Boolean.TRUE;
    }

    @Override
    public Record updateById(Record record) {
        log.info("Update by id: "+ record.getId());
        log.info("Update info: "+ record);
        return recordRepo.save(record);
    }
}
