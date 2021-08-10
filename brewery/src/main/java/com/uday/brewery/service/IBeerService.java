package com.uday.brewery.service;

import com.uday.brewery.data.BeerDto;

/**
 * Created by udayhegde
 */
public interface IBeerService {
    BeerDto getBeerById(String id);

    BeerDto save(BeerDto beerDto);
}
