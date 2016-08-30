package com.adanac.excel.core;

import com.adanac.excel.core.impl.BingExcelEventImpl.ModelInfo;

public interface BingReadListener {

	void readModel(Object object, ModelInfo modelInfo);

}
