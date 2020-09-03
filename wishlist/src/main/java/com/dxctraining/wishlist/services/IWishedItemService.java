package com.dxctraining.wishlist.services;

import com.dxctraining.wishlist.entities.WishedItem;

public interface IWishedItemService {

	WishedItem add(WishedItem item);

	void remove(String id);

	WishedItem findById(String id);

}
