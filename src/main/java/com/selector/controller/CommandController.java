package com.selector.controller;

import com.selector.model.request.AddEntryRequest;
import com.selector.model.response.AddEntryResponse;
import com.selector.service.CommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CommandController implements BaseController {
    private CommandService commandService;

    @PostMapping("/add")
    public AddEntryResponse addEntry(@RequestBody AddEntryRequest request) {
        return handleResponse(commandService.addEntry(request));
    }
}
