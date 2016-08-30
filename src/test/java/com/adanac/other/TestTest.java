package com.adanac.other;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.adanac.excel.vo.CellKV;
import com.adanac.excel.vo.ListLine;
import com.adanac.excel.writer.ExcelWriterFactory;
import com.adanac.excel.writer.WriteHandler;

public class TestTest {
	@Test
	public void testme() {
		WriteHandler handler = ExcelWriterFactory.createSXSSF("E:/test/big.xlsx");
		List<CellKV<String>> listStr = new ArrayList<>();
		listStr.add(new CellKV<String>(0, "diyi"));
		listStr.add(new CellKV<String>(2, "dier"));
		listStr.add(new CellKV<String>(1, "disan"));
		handler.createSheet("aa");
		handler.writeHeader(listStr);
		// handler.writeLine(new ListLine().addValue(0, true));
		handler.writeLine(new ListLine().addValue(1, "中国"));
		// handler.writeLine(new ListLine().addValue(2, 28));
		handler.flush();

	}
}
