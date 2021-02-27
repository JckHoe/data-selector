package com.selector.model.request;

import lombok.Data;

import java.util.List;

@Data
public class AddEntryRequest {
    private String entryKey;
    private List<Entry> entryList;
}
