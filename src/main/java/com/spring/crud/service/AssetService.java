package com.spring.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.crud.entity.Asset;

@Service
public interface AssetService {
	List<Asset> getAllAssetData();
	Asset createAsset(Asset asset);
	Asset getAssetById(int assetid);
	

}
