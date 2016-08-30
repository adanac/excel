package com.adanac.common;

import com.adanac.excel.converter.FieldValueConverter;
import com.adanac.excel.core.BingExcel;

/**
 * @author adanac
 *
 * @date 2015-12-17
 * Description:  
 */
public interface Builder<T> {
	
	T builder();

	Builder<T> registerFieldConverter(Class<?> clazz,
			FieldValueConverter converter);
}
