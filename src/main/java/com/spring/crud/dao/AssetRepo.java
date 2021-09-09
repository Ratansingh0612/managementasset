package com.spring.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.entity.Asset;

@Repository
public interface AssetRepo extends JpaRepository<Asset, Integer>  {
	Asset save(String s);

}
