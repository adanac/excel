package com.adanac.excel.converter;

import java.util.List;

import com.adanac.excel.mapper.ExcelConverterMapperHandler;
import com.adanac.excel.vo.CellKV;


public interface HeaderReflectConverter {
   List<CellKV<String>> getHeader(ExcelConverterMapperHandler handler);
}
