package com.uday.brewery.api;

import com.uday.brewery.data.BeerDto;
import com.uday.brewery.service.IBeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public ResponseEntity<BeerDto> save(@RequestBody BeerDto beerDto) {
        BeerDto savedBeerDto = beerService.save(beerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        //TODO : Add hostName to URL
        httpHeaders.add("Location", "/api/beer"+savedBeerDto.getId());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }
}
