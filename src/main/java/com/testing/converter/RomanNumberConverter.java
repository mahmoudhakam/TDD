package com.testing.converter;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RomanNumberConverter {


    private Map<String, Integer> mapOfRomans = new HashMap<>();

    public Integer convertRoman(String roman) {
        mapOfRomans.put("i", 1);
        mapOfRomans.put("ii", 2);
        mapOfRomans.put("iii", 3);
        return mapOfRomans.get(roman);
    }
}
