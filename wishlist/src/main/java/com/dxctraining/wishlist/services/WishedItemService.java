package com.dxctraining.wishlist.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.wishlist.dao.IWishedItemDao;
import com.dxctraining.wishlist.entities.WishedItem;
import com.dxctraining.wishlist.exceptions.InvalidArgumentException;
import com.dxctraining.wishlist.exceptions.WishedItemException;

@Service
@Transactional
public class WishedItemService implements IWishedItemService {

//	private int generateId;
//	
//	private String generateId() {
//		String id = ""+generateId++;
//		return id;
//	}
	
	@Autowired
	private IWishedItemDao dao;

	@Override
	public WishedItem add(WishedItem item) {
		validate(item);
		item = dao.save(item);
		return item;
	}

	@Override
	public void remove(String id) {
		dao.deleteById(id);

	}

	@Override
	public WishedItem findById(String id) {
		Optional<WishedItem> optional = dao.findById(id);
		boolean exist = optional.isPresent();
		if (!exist) {
			throw new WishedItemException("Item not found " + id);
		}
		WishedItem item = optional.get();
		return item;
	}

	private void validate(WishedItem wishedItem) {
		if (wishedItem == null) {
			throw new InvalidArgumentException("WishedItem cant be null");
		}
	}
}
