package com.uday.brewery.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by udayhegde
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/beer")
public class BeerAPI {

    @GetMapping("/get/{id}")
    public ResponseEntity<BeerDto> getBeer(@RequestParam)
}
