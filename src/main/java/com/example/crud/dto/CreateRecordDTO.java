package com.example.crud.dto;

import com.example.crud.constant.ApiConstants;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateRecordDTO {
    @NotNull(message = ApiConstants.RECORD_TITLE_IS_MANDATORY)
    @NotEmpty(message = ApiConstants.RECORD_TITLE_IS_MANDATORY)
    @Size(max = 60, message = ApiConstants.RECORD_TITLE_SIZE_IS_INVALID_MESSAGE)
    private String title;

    @NotNull(message = ApiConstants.RECORD_TEXT_IS_MANDATORY)
    @NotEmpty(message = ApiConstants.RECORD_TEXT_IS_MANDATORY)
    @Size(max = 600, message = ApiConstants.RECORD_TEXT_SIZE_IS_INVALID_MESSAGE)
    private String text;

}
