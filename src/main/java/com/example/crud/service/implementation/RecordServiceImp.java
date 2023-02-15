package com.example.crud.service.implementation;

import com.example.crud.dto.CreateRecordDTO;
import com.example.crud.dto.UpdateRecordDTO;
import com.example.crud.exception.ResourceNotFoundException;
import com.example.crud.mapper.RecordMapper;
import com.example.crud.model.Record;
import com.example.crud.repo.RecordRepo;
import com.example.crud.service.RecordService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Slf4j
@Service
public class RecordServiceImp implements RecordService {
    private final RecordRepo recordRepo;
    private final RecordMapper recordMapper;

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
    public Record updateById(UpdateRecordDTO dto) {
        Record recordToCreate = recordMapper.toUpdateRecord(dto);
        Long id = recordToCreate.getId();
        Record record = recordRepo.findById(recordToCreate.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + recordToCreate.getId()));

        record.setTitle(recordToCreate.getTitle());
        record.setText(recordToCreate.getText());
        log.info("Update by id: "+ recordToCreate.getId());
        log.info("Update info: "+ recordToCreate);
        return recordRepo.save(record);
    }

    @Override
    public Record insertRecord(CreateRecordDTO dto) {
        Record recordToCreate = recordMapper.toCreateRecord(dto);
        log.info("insert info: "+ recordToCreate);
        return recordRepo.save(recordToCreate);
    }

    @Override
    public Optional<Record> findById(Long id) {
        log.info("Find by id: "+ id);
        return recordRepo.findById(id);
    }
}
