package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;

public interface ItemParamItemService {

	String getItemParemById(long itemId);

	EUDataGridResult getItemList(int page, int rows);
}
