package com.adanac.excel.exception;

/**
 * 当用户定义实体缺少CellConfig注解时候抛出
 * @author adanac
 *
 */
public class MissingCellConfigException extends IllegalEntityException {



	public MissingCellConfigException(String message, Throwable cause) {
		super(message, cause);
	}

	public MissingCellConfigException(String message) {
		super(message);
	}

	public MissingCellConfigException(Throwable cause) {
		super(cause);
	}

}
