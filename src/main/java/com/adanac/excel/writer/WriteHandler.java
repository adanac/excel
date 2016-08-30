package com.adanac.excel.writer;

import java.util.List;

import com.adanac.excel.vo.CellKV;
import com.adanac.excel.vo.ListLine;

/**
 * 目前的三个实现不是线程安全的
 * @author adanac
 *
 */
public interface WriteHandler {

	/**
	 * 
	 */
	public abstract void writeLine(ListLine line);
	public abstract void writeHeader(List<CellKV<String>> listStr);
	public abstract String createSheet(String name);

	/**
	 * 
	 */
	public abstract void flush();

}