package com.selector.service;

import com.selector.model.request.AddEntryRequest;
import com.selector.model.response.AddEntryResponse;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CommandService {
    public AddEntryResponse addEntry(AddEntryRequest request) {
        return AddEntryResponse.builder()
                .entryKey(request.getEntryKey())
                .data(Collections.emptyMap())
                .build();
    }
}
