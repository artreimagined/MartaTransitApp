package com.tts.TransitApp.model;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
@NoArgsConstructor
public class BusComparator implements Comparator<Bus> {

    @Override
    public int compare(Bus o1, Bus o2) {
        if (o1.distance < o2.distance) return -1;
        if (o1.distance > o2.distance) return 1;
        return 0;
    }
}
