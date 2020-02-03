package com.stepanov.iot.web.service;

import org.springframework.context.annotation.Primary;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Component;

/**
 * Created by Dmitriy Stepanov on 21.12.17.
 */
@Component
@Primary
public class MyConversionService extends DefaultConversionService implements ConversionService {
  // an empty ConversionService to initiate call to register converters
}
