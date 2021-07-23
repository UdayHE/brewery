package com.uday.brewery.api;

import com.uday.brewery.data.BeerDto;
import com.uday.brewery.service.IBeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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

    private final IBeerService beerService;

    @GetMapping("/get/{id}")
    public ResponseEntity<BeerDto> getBeer(@RequestParam String id) {
        return new ResponseEntity<>(beerService.getBeerById(id), HttpStatus.OK);
    }
}
