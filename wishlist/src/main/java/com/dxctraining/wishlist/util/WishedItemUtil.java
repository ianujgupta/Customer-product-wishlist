package com.dxctraining.wishlist.util;

import org.springframework.stereotype.Component;

import com.dxctraining.wishlist.dto.WishedItemDto;
import com.dxctraining.wishlist.entities.WishedItem;

@Component
public class WishedItemUtil {

	public WishedItemDto wishedItemDto(WishedItem item) {
		WishedItemDto dto = new WishedItemDto(item.getId(), item.getCustomerId(), item.getProductId());
		return dto;
	}

}
