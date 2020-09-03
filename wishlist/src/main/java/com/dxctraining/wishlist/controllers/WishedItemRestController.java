package com.dxctraining.wishlist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dxctraining.wishlist.dto.CreateWishedItemRequest;
import com.dxctraining.wishlist.dto.WishedItemDto;
import com.dxctraining.wishlist.entities.WishedItem;
import com.dxctraining.wishlist.services.IWishedItemService;
import com.dxctraining.wishlist.util.WishedItemUtil;

@RestController
@RequestMapping("wisheditems")
public class WishedItemRestController {

	@Autowired
	private WishedItemUtil util;

	@Autowired
	private IWishedItemService service;

	@PostMapping(value="/add")
	@ResponseStatus(HttpStatus.CREATED)
	public WishedItemDto addItem(@RequestBody CreateWishedItemRequest request) {
		Integer custId = request.getCustomerId();
		String prodId = request.getProductId();
		WishedItem wishedItem = new WishedItem(custId, prodId);
		wishedItem = service.add(wishedItem);
		WishedItemDto response = util.wishedItemDto(wishedItem);
		return response;
	}
}
