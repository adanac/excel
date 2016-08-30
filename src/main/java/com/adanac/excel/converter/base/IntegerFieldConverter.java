package com.adanac.excel.converter.base;

import java.lang.reflect.Type;

import com.adanac.excel.converter.AbstractFieldConvertor;
import com.adanac.excel.core.handler.ConverterHandler;
import com.adanac.excel.vo.OutValue;
import com.adanac.excel.vo.OutValue.OutType;
import com.google.common.base.Strings;

/**
 * @author adanac
 * 
 * @date 2016-3-10 Description:
 */
public final class IntegerFieldConverter extends AbstractFieldConvertor {

	@Override
	public boolean canConvert(Class<?> clz) {
		return clz.equals(int.class) || clz.equals(Integer.class);
	}

	/**
	 * @return return the long value; return Long.decode(str),only in this case  the str start with "0x"
	 */
	@Override
	public Object fromString(String cell,ConverterHandler converterHandler,Type targetType) {

		if (Strings.isNullOrEmpty(cell)) {
			return null;
		}
		long value= Long.decode(cell).longValue();
    	if(value < Integer.MIN_VALUE || value > 0xFFFFFFFFl) {
    		throw new NumberFormatException("For input string: \"" + cell + '"');
    	}
        return new Integer((int)value);
	}

	@Override
	public OutValue toObject(Object source,ConverterHandler converterHandler) {
		if(source==null){
			return null;
		}
		return OutValue.intValue(source);
	}

}
