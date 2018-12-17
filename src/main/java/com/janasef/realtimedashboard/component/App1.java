package com.janasef.realtimedashboard.component;

import java.util.concurrent.TimeUnit;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.TimeWindows;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class App1 {
  @SuppressWarnings("unchecked")
  @Bean("app1StreamTopology")
  public KStream<String, String> startProcessing(@Qualifier("app1StreamBuilder") StreamsBuilder builder) {
	    KStream<String, String> source = builder.stream("originating-country");
	    source.groupByKey().windowedBy(TimeWindows.of(TimeUnit.SECONDS.toMillis(10))).count()
	    	.toStream((key, value) -> key.toString()).mapValues(count -> Long.toString(count)).to("country_summary");
		return source;
  }

}
