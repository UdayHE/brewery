package com.uday.brewery.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by udayhegde
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private String id;
    private String name;
    private String style;
    /**
     * Universal Product Code
     */
    private String upc;
}