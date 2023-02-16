package com.example.crud.mapper;

import com.example.crud.dto.CreateRecordDTO;
import com.example.crud.dto.UpdateRecordDTO;
import com.example.crud.entity.Record;
import org.mapstruct.Mapper;

@Mapper
public interface RecordMapper {
    Record toCreateRecord(CreateRecordDTO createProjectDTO);

    Record toUpdateRecord(UpdateRecordDTO updateRecordDTO);
}
