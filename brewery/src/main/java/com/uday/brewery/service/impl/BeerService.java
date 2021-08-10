package com.uday.brewery.service.impl;

import com.uday.brewery.data.BeerDto;
import com.uday.brewery.service.IBeerService;

/**
 * Created by udayhegde
 */
public class BeerService implements IBeerService {

    @Override
    public BeerDto getBeerById(String id) {
        return null;
    }

    @Override
    public BeerDto save(BeerDto beerDto) {
        return beerDto;
    }
}
