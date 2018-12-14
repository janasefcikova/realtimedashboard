package com.janasef.realtimedashboard.utils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// TODO Explore whether it might be replaced with annotation on the domain class

/**
 * Copy & paste & edit from <link>
 * https://github.com/eugenp/tutorials/blob/1609a9a5de267c69f26dc80027424a74d3e37fe6/jackson/src/main/java/com/baeldung/jackson/deserialization/jsondeserialize/CustomDateDeserializer.java</link>
 *
 */
public class CustomDateDeserializer extends StdDeserializer<Date> {
	
	private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

    public CustomDateDeserializer() {
        this(null);
    }

    public CustomDateDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Date deserialize(JsonParser jsonparser, DeserializationContext context) throws IOException {
    	String date = jsonparser.getText();
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}