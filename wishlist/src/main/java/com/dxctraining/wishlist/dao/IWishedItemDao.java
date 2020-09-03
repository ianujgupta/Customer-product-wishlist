package com.dxctraining.wishlist.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxctraining.wishlist.entities.WishedItem;

public interface IWishedItemDao extends JpaRepository<WishedItem,String> {

}
