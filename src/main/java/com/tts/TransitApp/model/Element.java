package com.tts.TransitApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Element {

    public Distance distance;
    public Duration duration;
    public String status;
}
