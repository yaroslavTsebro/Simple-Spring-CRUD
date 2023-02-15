package com.example.crud.controller;

import com.example.crud.dto.CreateRecordDTO;
import com.example.crud.dto.UpdateRecordDTO;
import com.example.crud.model.Record;
import com.example.crud.service.RecordService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class RecordController {
    private final RecordService recordService;

    @GetMapping
    public ResponseEntity<Collection<Record>> findAll(){
        return ResponseEntity.ok(recordService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Record>> findById(@PathVariable Long id){
        return ResponseEntity.ok(recordService.findById(id));
    }

    @PutMapping
    public ResponseEntity<Record> updateById(@RequestBody @Valid UpdateRecordDTO dto){
        return ResponseEntity.ok(recordService.updateById(dto));
    }

    @PostMapping
    public ResponseEntity<Record> insertRecord (@RequestBody @Valid CreateRecordDTO dto){
        return ResponseEntity.ok(recordService.insertRecord(dto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id){
        return ResponseEntity.ok(recordService.deleteById(id));
    }

}
