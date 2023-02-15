package com.example.crud.dto;

import com.example.crud.constant.ApiConstants;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UpdateRecordDTO {

    @Min(value = 0L, message = "The value must be positive")
    private Long id;

    @NotNull(message = ApiConstants.RECORD_TITLE_IS_MANDATORY)
    @NotEmpty(message = ApiConstants.RECORD_TITLE_IS_MANDATORY)
    @Size(max = 60, message = ApiConstants.RECORD_TITLE_SIZE_IS_INVALID_MESSAGE)
    private String title;

    @NotNull(message = ApiConstants.RECORD_TEXT_IS_MANDATORY)
    @NotEmpty(message = ApiConstants.RECORD_TEXT_IS_MANDATORY)
    @Size(max = 600, message = ApiConstants.RECORD_TEXT_SIZE_IS_INVALID_MESSAGE)
    private String text;

}
