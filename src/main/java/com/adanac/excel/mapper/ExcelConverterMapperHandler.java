package com.adanac.excel.mapper;

import com.adanac.excel.converter.FieldValueConverter;
import com.adanac.excel.mapper.ConversionMapper.FieldConverterMapper;

public interface ExcelConverterMapperHandler {

	 void processAnnotations(final Class[] initialTypes);

	 void processAnnotations(final Class initialType);

	@Deprecated
	 FieldValueConverter getLocalConverter(Class definedIn,
			String fieldName);

	FieldConverterMapper getLocalFieldConverterMapper(Class definedIn,
			String fieldName);

	String   getModelName(Class<?> definedIn);

}