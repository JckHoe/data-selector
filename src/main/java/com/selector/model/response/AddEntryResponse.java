package com.selector.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@Builder
public class AddEntryResponse extends BaseResponse {
    private String entryKey;
    private Map<String, ?> data;
}
