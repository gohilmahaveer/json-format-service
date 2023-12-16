package com.json.formatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.DecimalFormat;

public class CustomScoreSerializer extends JsonSerializer<Double> {

    private final DecimalFormat scoreFormatter = new DecimalFormat("0.00");

    @Override
    public void serialize(Double value, JsonGenerator generator, SerializerProvider provider) throws IOException {
            generator.writeString(scoreFormatter.format(value));
    }
}
